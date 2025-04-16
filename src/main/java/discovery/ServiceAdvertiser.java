/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discovery;

import java.io.IOException;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class ServiceAdvertiser {

    public static void register(String serviceName, int port, String type) {
        try {
            JmDNS jmdns = JmDNS.create();
            ServiceInfo serviceInfo = ServiceInfo.create(type, serviceName, port, "Smart Office gRPC Service");
            jmdns.registerService(serviceInfo);
            System.out.println("Service " + serviceName + " registered with jmDNS on port " + port);
        } catch (IOException e) {
            System.err.println("jmDNS service registration failed: " + e.getMessage());
        }
    }
}