/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SmartOfficeServices;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptors;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
// gRPC stubs
import smartoffice.AutomatedLightingGrpc.AutomatedLightingImplBase;
import smartoffice.AutomatedLightingOuterClass.LightRequest;
import smartoffice.AutomatedLightingOuterClass.LightResponse;

// TLS communication
import java.io.File;
// Auth
import auth.ApiKeyInterceptor;
 
// Optional service discovery if used
import discovery.ServiceAdvertiser;
import discovery.ServiceDiscovery;
import java.util.logging.Level;

 //Logging Imports
import java.util.logging.Logger;
import smartoffice.AutomatedLightingOuterClass.LightSummaryResponse;


public class AutomatedLightingServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50052;
        Server server = ServerBuilder.forPort(port)
            // TLS for secure communication
            .useTransportSecurity(
            new File("certs/server.crt"),
            new File("certs/server.pem")
        )
            .addService(new LightingServiceImpl())
            .build();

        ServiceAdvertiser.register("LightingService", port, "_grpc._tcp.local.");
        System.out.println("Lighting Server running on port " + port);
        server.start();
        server.awaitTermination();
    }
   
    
    static class LightingServiceImpl extends AutomatedLightingImplBase {
        //Data logging
        private static final Logger logger = Logger.getLogger(LightingServiceImpl.class.getName());
        
        
            @Override
            public void controlLights(LightRequest request, StreamObserver<LightResponse> responseObserver) {
             Logger logger = Logger.getLogger(getClass().getName());
             logger.log(Level.INFO, "toggleLights called with input: {0}", request.toString());

            if (io.grpc.Context.current().isCancelled()) {
                logger.warning("Request was cancelled by the client.");
                return;
            }

            try {
                 String room = request.getRoomId();
                 String level = "Medium";
                 String mode = "Auto";

            if (room.equalsIgnoreCase("Room 1")) {
                level = "Low";
                mode = "Manual";
            } else if (room.equalsIgnoreCase("Room 2")) {
                level = "High";
                mode = "Auto";
            }
                // TODO: Add actual service logic here

                // Example response (placeholder)
                LightResponse response = LightResponse.newBuilder()
                    .setLightLevel(level)
                    .setMode(mode)
                    .build();

                responseObserver.onNext(response);
                responseObserver.onCompleted();

            } catch (Exception e) {
                logger.log(Level.SEVERE, "Error in toggleLights: " + e.getMessage(), e);
                responseObserver.onError(
                    io.grpc.Status.INTERNAL
                        .withDescription("Server error: " + e.getMessage())
                        .withCause(e)
                        .asRuntimeException()
                );
            }
        }
        
        public StreamObserver<LightRequest> streamLightingControl(StreamObserver<LightSummaryResponse> responseObserver) {
            Logger logger = Logger.getLogger(getClass().getName());

            return new StreamObserver<LightRequest>() {
                StringBuilder logBuilder = new StringBuilder();

                @Override
                public void onNext(LightRequest request) {
                    logBuilder.append("Room: ")
                              .append(request.getRoomId())
                              .append(", Mode: ")
                              .append(request.getMode())
                              .append(", Level: ")
                              
                              .append("\n");

                    logger.info("Received light command: " + request.toString());
                }

                @Override
                public void onError(Throwable t) {
                    logger.warning("Client error during lighting control stream: " + t.getMessage());
                }

                @Override
                public void onCompleted() {
                    LightSummaryResponse response = LightSummaryResponse.newBuilder()
                        .setSummary("Lighting commands received:\n" + logBuilder.toString())
                        .build();

                    responseObserver.onNext(response);
                    responseObserver.onCompleted();
                    logger.info("Lighting stream completed.");
                }
            };
        }
            
           
    }
}
