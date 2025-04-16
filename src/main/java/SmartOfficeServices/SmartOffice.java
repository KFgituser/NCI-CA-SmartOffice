package SmartOfficeServices;


import GUI.GUISmartOffice;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import smartoffice.AirQualityGrpc;
import smartoffice.AutomatedLightingGrpc;
import smartoffice.MeetingRoomBookingGrpc;


public class SmartOffice {

    private final ManagedChannel channel;
    private final AirQualityGrpc.AirQualityBlockingStub airQualityClient;
    private final AutomatedLightingGrpc.AutomatedLightingBlockingStub lightingClient;
    private final MeetingRoomBookingGrpc.MeetingRoomBookingBlockingStub bookingClient;

    public SmartOffice() {
        // Create the gRPC channel to connect to localhost (or service discovery hostname)
        channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        airQualityClient = AirQualityGrpc.newBlockingStub(channel);
        lightingClient = AutomatedLightingGrpc.newBlockingStub(channel);
        bookingClient = MeetingRoomBookingGrpc.newBlockingStub(channel);
    }
    // Air Quality Service
    static class AirQualityServiceImpl  {
      
    }

    // Lighting Control Service
    static class LightingServiceImpl  {
        
    }

    // Room Booking Service
    static class BookingServiceImpl   {
       
    }
        
    
     public static void main(String[] args)  {
     
         //launch GUI
         javax.swing.SwingUtilities.invokeLater(() -> {
         new GUISmartOffice().setVisible(true);
     });
    }


   
}