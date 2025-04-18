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
import smartoffice.MeetingRoomBookingGrpc.MeetingRoomBookingImplBase;
import smartoffice.MeetingRoomBookingOuterClass.BookingRequest;
import smartoffice.MeetingRoomBookingOuterClass.BookingResponse;
import smartoffice.MeetingRoomBookingOuterClass.CancelRequest;
import smartoffice.MeetingRoomBookingOuterClass.CancelResponse;

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


public class MeetingRoomBookingServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        
        int port = 50053;
        Server server = ServerBuilder.forPort(port)
            // TLS for secure communication    
            .useTransportSecurity(
            new File("certs/server.crt"),
            new File("certs/server.pem")
        ) 
            .addService(new BookingServiceImpl())
                
            .build();
        
        ServiceAdvertiser.register("RoomBookingService", port, "_grpc._tcp.local.");
        System.out.println("Meeting Room Booking Server running on port " + port);
        server.start();
        server.awaitTermination();
    }

    static class BookingServiceImpl extends MeetingRoomBookingImplBase {
        //Data logging
        private static final Logger logger = Logger.getLogger(BookingServiceImpl.class.getName());

        @Override
       public void bookRoom(BookingRequest request, StreamObserver<BookingResponse> responseObserver) {
           Logger logger = Logger.getLogger(getClass().getName());
           logger.log(Level.INFO, "bookRoom called with input: {0}", request.toString());

           if (io.grpc.Context.current().isCancelled()) {
               logger.warning("Request was cancelled by the client.");
               return;
           }

           try {
              String room = request.getRoomId();
              String status = "Unavailable";
              String code = "N/A";

              if (room.equalsIgnoreCase("Room 1")) {
                   status = "Confirmed";
                   code = "R1-2025X";
               }

               BookingResponse response = BookingResponse.newBuilder()
                   .setConfirmationCode(code)
                   .setStatus(status)
                   .build();

               responseObserver.onNext(response);
               responseObserver.onCompleted();

           } catch (Exception e) {
               logger.log(Level.SEVERE, "Error in bookRoom: " + e.getMessage(), e);
               responseObserver.onError(
                   io.grpc.Status.INTERNAL
                       .withDescription("Server error: " + e.getMessage())
                       .withCause(e)
                       .asRuntimeException()
               );
           }
       }

       @Override
       public void cancelBooking(CancelRequest request, StreamObserver<CancelResponse> responseObserver) {
           logger.log(Level.INFO, "cancelBooking called by user {0}, room = {1}", new Object[]{request.getUserId(), request.getRoomId()});

           CancelResponse response = CancelResponse.newBuilder()
               .setSuccess(true)
               .setMessage("Booking cancelled for " + request.getUserId())
               .build();

           responseObserver.onNext(response);
           responseObserver.onCompleted();
       }
        public StreamObserver<BookingRequest> bookingStream(StreamObserver<BookingResponse> responseObserver) {
            Logger logger = Logger.getLogger(getClass().getName());

            return new StreamObserver<BookingRequest>() {
                @Override
                public void onNext(BookingRequest request) {
                    logger.info("Received booking stream request: " + request.toString());

                    String room = request.getRoomId();
                    String status = "Unavailable";
                    String code = "N/A";

                    if (room.equalsIgnoreCase("Room 1")) {
                        status = "Confirmed";
                        code = "R1-2025X";
                    }

                    BookingResponse response = BookingResponse.newBuilder()
                        .setConfirmationCode(code)
                        .setStatus(status)
                        .build();

                    responseObserver.onNext(response);
                }

                @Override
                public void onError(Throwable t) {
                    logger.warning("Booking stream error: " + t.getMessage());
                }

                @Override
                public void onCompleted() {
                    logger.info("Booking stream completed by client.");
                    responseObserver.onCompleted();
                }
            };
        }
}

 
  
}