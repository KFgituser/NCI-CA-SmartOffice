package SmartOfficeServices;

//GUI
import GUI.GUIAirQuality;
import GUI.GUISmartOffice;
//grpc
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import smartoffice.AirQualityGrpc;
import smartoffice.AutomatedLightingGrpc;
import smartoffice.MeetingRoomBookingGrpc;
//naming
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;


public class SmartOffice {

    private ManagedChannel airChannel;
    private ManagedChannel lightingChannel;
    private ManagedChannel bookingChannel;
    
     public static ServiceInfo findService(String type, String name) throws IOException {
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        ServiceInfo[] infos = jmdns.list(type);
        jmdns.close();

        for (ServiceInfo info : infos) {
            if (info.getName().equals(name)) {
                return info;
            }
        }
        return null;
    }
    
    public SmartOffice() throws IOException {
        // Discover services
        ServiceInfo airInfo = findService("_grpc._tcp.local.", "AirQualityService");
        ServiceInfo lightingInfo = findService("_grpc._tcp.local.", "LightingService");
        ServiceInfo bookingInfo = findService("_grpc._tcp.local.", "RoomBookingService");

        if (airInfo == null || lightingInfo == null || bookingInfo == null) {
            throw new RuntimeException("One or more services could not be discovered.");
        }
        
        // Air Quality Service
        String airHost = airInfo.getHostAddresses()[0];
        int airPort = airInfo.getPort();
        airChannel = ManagedChannelBuilder.forAddress(airHost, airPort).usePlaintext().build();
        AirQualityGrpc.AirQualityBlockingStub airStub = AirQualityGrpc.newBlockingStub(airChannel);
        
        // Lighting Control Service
        String lightHost = lightingInfo.getHostAddresses()[0];
        int lightPort = lightingInfo.getPort();
        lightingChannel = ManagedChannelBuilder.forAddress(lightHost, lightPort).usePlaintext().build();
        AutomatedLightingGrpc.AutomatedLightingBlockingStub lightingStub = AutomatedLightingGrpc.newBlockingStub(lightingChannel);

         // Room Booking Service
        String bookingHost = bookingInfo.getHostAddresses()[0];
        int bookingPort = bookingInfo.getPort();
        bookingChannel = ManagedChannelBuilder.forAddress(bookingHost, bookingPort).usePlaintext().build();
        MeetingRoomBookingGrpc.MeetingRoomBookingBlockingStub bookingStub = MeetingRoomBookingGrpc.newBlockingStub(bookingChannel);

        // pass these stubs to your GUI
        GUISmartOffice.setStubs(airStub, lightingStub, bookingStub);
        
    }

    
     public static void main(String[] args) throws Exception {
         
        
         // Launch client-side SmartOffice with discovered services
        SmartOffice clientApp = new SmartOffice();
         //launch GUI
         javax.swing.SwingUtilities.invokeLater(() -> {
        new GUISmartOffice().setVisible(true); // launches GUI with stubs set
        });
    }


   
}