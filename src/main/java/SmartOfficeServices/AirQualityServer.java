/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SmartOfficeServices;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import io.grpc.stub.StreamObserver;
import java.io.IOException;
// gRPC stubs
import smartoffice.AirQualityGrpc.AirQualityImplBase;
import smartoffice.AirQualityOuterClass.AirQualityRequest;
import smartoffice.AirQualityOuterClass.AirQualityResponse;

// TLS communication
import java.io.File;
// Auth
import auth.ApiKeyInterceptor;

// Optional service discovery if used
import discovery.ServiceAdvertiser;
import discovery.ServiceDiscovery;

// Logging Imports
import java.util.logging.Level;
import java.util.logging.Logger;


public class AirQualityServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50051;
        Server server = ServerBuilder.forPort(port)
            // TLS for secure communication
            .useTransportSecurity(
            new File("certs/server.crt"),
            new File("certs/server.pem")
        )
            .addService(new AirQualityServiceImpl())
            .build();

        ServiceAdvertiser.register("AirQualityService", port, "_grpc._tcp.local.");
        System.out.println("AirQuality Server running on port " + port);
        server.start();
        server.awaitTermination();
    }
          

    static class AirQualityServiceImpl extends AirQualityImplBase {
         //Data logging
         private static final Logger logger = Logger.getLogger(AirQualityServiceImpl.class.getName());

            @Override
        public void getAirQuality(AirQualityRequest request, StreamObserver<AirQualityResponse> responseObserver) {
               logger.log(Level.INFO, "getAirQuality called. roomId = {0}", request.getRoomId());

           // Cancellation check
           if (io.grpc.Context.current().isCancelled()) {
               logger.warning("Request was cancelled by the client.");
               return;
           }
           
           //Error handeling
           try {
               
               
               String room = request.getRoomId();
               String temp = "20";
               String humidity = "50";
               String pm25 = "12";

               if (room.equalsIgnoreCase("Room 1")) {
                   temp = "16";
                   humidity = "23";
                   pm25 = "8";
               } else if (room.equalsIgnoreCase("Room 2")) {
                   temp = "19";
                   humidity = "40";
                   pm25 = "10";
               }
                
               
               
               AirQualityResponse response = AirQualityResponse.newBuilder()
                   .setTemperature(Float.parseFloat(temp))
                   .setHumidity(Float.parseFloat(humidity))
                   .setPm25(Float.parseFloat(pm25))
                   .build();

               responseObserver.onNext(response);
               responseObserver.onCompleted();

           } catch (NumberFormatException e) {
               logger.log(Level.SEVERE, "Error in getAirQuality: " + e.getMessage(), e);
               responseObserver.onError(
                   io.grpc.Status.INTERNAL
                       .withDescription("Server error: " + e.getMessage())
                       .withCause(e)
                       .asRuntimeException()
               );
           }
        }
         // Server-streaming method for real-time updates
        public void streamAirQuality(AirQualityRequest request, StreamObserver<AirQualityResponse> responseObserver) {
            logger.info("Streaming air quality updates for room: " + request.getRoomId());

            try {
                for (int i = 0; i < 5; i++) {
                    if (io.grpc.Context.current().isCancelled()) {
                        logger.warning("Client cancelled the stream.");
                        break;
                    }

                    AirQualityResponse response = AirQualityResponse.newBuilder()
                        .setTemperature(16 + i)
                        .setHumidity(45 + i)
                        .setPm25(10 + i)
                        .build();

                    responseObserver.onNext(response);
                    Thread.sleep(2000); // simulate sensor update delay
                }

                responseObserver.onCompleted();
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Error in streamAirQuality: " + e.getMessage(), e);
                responseObserver.onError(
                    io.grpc.Status.INTERNAL
                        .withDescription("Streaming error: " + e.getMessage())
                        .withCause(e)
                        .asRuntimeException()
                );
            }
        }
    }
    
    
}