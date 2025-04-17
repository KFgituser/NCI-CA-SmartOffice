/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SmartOfficeServices;

import discovery.ServiceAdvertiser;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptors;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
// gRPC stubs
import smartoffice.AutomatedLightingGrpc.AutomatedLightingImplBase;
import smartoffice.AutomatedLightingOuterClass.LightRequest;
import smartoffice.AutomatedLightingOuterClass.LightResponse;


// Auth
import auth.ApiKeyInterceptor;
 
 //Logging Imports
import java.util.logging.Logger;


public class AutomatedLightingServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50052;
        Server server = ServerBuilder.forPort(port)
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

    public void getLightingStatus(LightRequest request, StreamObserver<LightResponse> responseObserver) {
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

        LightResponse response = LightResponse.newBuilder()
            .setLightLevel(level)
            .setMode(mode)
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    }
}
