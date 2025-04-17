/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SmartOfficeServices;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class ServiceAdvertiser {

    public static void register(String serviceName, int port, String serviceType) throws InterruptedException {
        try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            System.out.println("Registration: InetAddress.getLocalHost():" + InetAddress.getLocalHost());
            
            // Register service with type, name, port and description
            ServiceInfo serviceInfo = ServiceInfo.create(serviceType, serviceName, port, "gRPC SmartOffice Service");
            jmdns.registerService(serviceInfo);

            System.out.println(serviceName + " registered via JmDNS on port " + port);
            
            // Wait a bit
            Thread.sleep(5000);
        
        } catch (IOException e) {
            System.err.println("❌ Failed to register service: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

