/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SmartOfficeServices;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import java.io.IOException;
import java.net.InetAddress;

public class ServiceDiscovery {
		
		
        public static void discover(String serviceType) {
        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            System.out.println("Searching for services of type: " + serviceType);

            jmdns.addServiceListener(serviceType, new ServiceListener() {
                @Override
                public void serviceAdded(ServiceEvent event) {
                    System.out.println("Service added: " + event.getName());
                }

                @Override
                public void serviceRemoved(ServiceEvent event) {
                    System.out.println("Service removed: " + event.getName());
                }

                @Override
                public void serviceResolved(ServiceEvent event) {
                    ServiceInfo info = event.getInfo();
                    String address = info.getHostAddresses()[0];
                    int port = info.getPort();
                    System.out.println("Service resolved: " + info.getName() +
                                       " at " + address + ":" + port);
                }
            });

            // Wait a few seconds to allow service discovery
            Thread.sleep(5000);
            jmdns.close();

        } catch (IOException | InterruptedException e) {
            System.err.println("Error during service discovery: " + e.getMessage());
        }
    }
}