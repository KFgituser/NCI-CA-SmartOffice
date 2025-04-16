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
import smartoffice.MeetingRoomBookingGrpc.MeetingRoomBookingImplBase;
import smartoffice.MeetingRoomBookingOuterClass.BookingRequest;
import smartoffice.MeetingRoomBookingOuterClass.BookingResponse;
import smartoffice.MeetingRoomBookingOuterClass.CancelRequest;
import smartoffice.MeetingRoomBookingOuterClass.CancelResponse;

// Auth
import auth.ApiKeyInterceptor;

//Logging Imports
import java.util.logging.Logger;


public class MeetingRoomBookingServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50053;
        Server server = ServerBuilder.forPort(port)
            .addService(ServerInterceptors.intercept(new BookingServiceImpl(), new ApiKeyInterceptor()))
            .build();

        ServiceAdvertiser.register("RoomBookingService", port, "_grpc._tcp.local.");
        System.out.println("✅ Meeting Room Booking Server running on port " + port);
        server.start();
        server.awaitTermination();
    }

    static class BookingServiceImpl extends MeetingRoomBookingImplBase {
        //Data logging
        private static final Logger logger = Logger.getLogger(BookingServiceImpl.class.getName());

    @Override
    public void bookRoom(BookingRequest request, StreamObserver<BookingResponse> responseObserver) {
        
        logger.info("bookRoom called by user " + request.getUserId() + ", room = " + request.getRoomId());

        BookingResponse response = BookingResponse.newBuilder()
            .setSuccess(true)
            .setMessage("Room booked for " + request.getUserId())
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void cancelBooking(CancelRequest request, StreamObserver<CancelResponse> responseObserver) {
        logger.info("cancelBooking called by user " + request.getUserId() + ", room = " + request.getRoomId());

        CancelResponse response = CancelResponse.newBuilder()
            .setSuccess(true)
            .setMessage("Booking cancelled for " + request.getUserId())
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

 
  
}