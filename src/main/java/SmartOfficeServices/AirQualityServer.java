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
import smartoffice.AirQualityGrpc.AirQualityImplBase;
import smartoffice.AirQualityOuterClass.AirQualityRequest;
import smartoffice.AirQualityOuterClass.AirQualityResponse;

// Auth
import auth.ApiKeyInterceptor;

// Optional service discovery if used
import discovery.ServiceAdvertiser;
// Logging Imports
import java.util.logging.Logger;


public class AirQualityServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50051;
        Server server = ServerBuilder.forPort(port)
            .addService(ServerInterceptors.intercept(new AirQualityServiceImpl(), new ApiKeyInterceptor()))
            .build();

        ServiceAdvertiser.register("AirQualityService", port, "_grpc._tcp.local.");
        System.out.println("AirQuality Server running on port " + port);
        server.start();
        server.awaitTermination();
    }
          

     static class AirQualityServiceImpl extends AirQualityImplBase {
         //Data logging
         private static final Logger logger = Logger.getLogger(AirQualityServiceImpl.class.getName());

        public void getAirQuality(AirQualityRequest request, StreamObserver<AirQualityResponse> responseObserver) {
            logger.info("getAirQuality called. roomId = " + request.getRoomId());

            AirQualityResponse response = AirQualityResponse.newBuilder()
                .setRoomId(request.getRoomId())
                .setTemperature(23.5f)
                .setHumidity(45.0f)
                .setPm25(12.3f)
                .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}