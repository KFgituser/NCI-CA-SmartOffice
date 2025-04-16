/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auth;

import io.grpc.*;

public class ApiKeyInterceptor implements ServerInterceptor {

    private static final String VALID_API_KEY = "12345";  // Set your own secure key

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call,
            Metadata headers,
            ServerCallHandler<ReqT, RespT> next) {

        Metadata.Key<String> apiKeyHeader = Metadata.Key.of("api-key", Metadata.ASCII_STRING_MARSHALLER);
        String receivedKey = headers.get(apiKeyHeader);

        if (VALID_API_KEY.equals(receivedKey)) {
            return next.startCall(call, headers);
        } else {
            call.close(Status.UNAUTHENTICATED.withDescription("Invalid API Key"), new Metadata());
            return new ServerCall.Listener<ReqT>() {};
        }
    }
}