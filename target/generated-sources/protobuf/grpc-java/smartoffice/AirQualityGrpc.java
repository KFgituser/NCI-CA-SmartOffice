package smartoffice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Air Quality Monitoring Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: AirQuality.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AirQualityGrpc {

  private AirQualityGrpc() {}

  public static final java.lang.String SERVICE_NAME = "smartoffice.AirQuality";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartoffice.AirQualityOuterClass.AirQualityRequest,
      smartoffice.AirQualityOuterClass.AirQualityResponse> getGetAirQualityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAirQuality",
      requestType = smartoffice.AirQualityOuterClass.AirQualityRequest.class,
      responseType = smartoffice.AirQualityOuterClass.AirQualityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartoffice.AirQualityOuterClass.AirQualityRequest,
      smartoffice.AirQualityOuterClass.AirQualityResponse> getGetAirQualityMethod() {
    io.grpc.MethodDescriptor<smartoffice.AirQualityOuterClass.AirQualityRequest, smartoffice.AirQualityOuterClass.AirQualityResponse> getGetAirQualityMethod;
    if ((getGetAirQualityMethod = AirQualityGrpc.getGetAirQualityMethod) == null) {
      synchronized (AirQualityGrpc.class) {
        if ((getGetAirQualityMethod = AirQualityGrpc.getGetAirQualityMethod) == null) {
          AirQualityGrpc.getGetAirQualityMethod = getGetAirQualityMethod =
              io.grpc.MethodDescriptor.<smartoffice.AirQualityOuterClass.AirQualityRequest, smartoffice.AirQualityOuterClass.AirQualityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAirQuality"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartoffice.AirQualityOuterClass.AirQualityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartoffice.AirQualityOuterClass.AirQualityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AirQualityMethodDescriptorSupplier("GetAirQuality"))
              .build();
        }
      }
    }
    return getGetAirQualityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartoffice.AirQualityOuterClass.AirQualityRequest,
      smartoffice.AirQualityOuterClass.AirQualityResponse> getStreamAirQualityUpdatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamAirQualityUpdates",
      requestType = smartoffice.AirQualityOuterClass.AirQualityRequest.class,
      responseType = smartoffice.AirQualityOuterClass.AirQualityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<smartoffice.AirQualityOuterClass.AirQualityRequest,
      smartoffice.AirQualityOuterClass.AirQualityResponse> getStreamAirQualityUpdatesMethod() {
    io.grpc.MethodDescriptor<smartoffice.AirQualityOuterClass.AirQualityRequest, smartoffice.AirQualityOuterClass.AirQualityResponse> getStreamAirQualityUpdatesMethod;
    if ((getStreamAirQualityUpdatesMethod = AirQualityGrpc.getStreamAirQualityUpdatesMethod) == null) {
      synchronized (AirQualityGrpc.class) {
        if ((getStreamAirQualityUpdatesMethod = AirQualityGrpc.getStreamAirQualityUpdatesMethod) == null) {
          AirQualityGrpc.getStreamAirQualityUpdatesMethod = getStreamAirQualityUpdatesMethod =
              io.grpc.MethodDescriptor.<smartoffice.AirQualityOuterClass.AirQualityRequest, smartoffice.AirQualityOuterClass.AirQualityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamAirQualityUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartoffice.AirQualityOuterClass.AirQualityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartoffice.AirQualityOuterClass.AirQualityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AirQualityMethodDescriptorSupplier("StreamAirQualityUpdates"))
              .build();
        }
      }
    }
    return getStreamAirQualityUpdatesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AirQualityStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AirQualityStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AirQualityStub>() {
        @java.lang.Override
        public AirQualityStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AirQualityStub(channel, callOptions);
        }
      };
    return AirQualityStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AirQualityBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AirQualityBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AirQualityBlockingStub>() {
        @java.lang.Override
        public AirQualityBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AirQualityBlockingStub(channel, callOptions);
        }
      };
    return AirQualityBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AirQualityFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AirQualityFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AirQualityFutureStub>() {
        @java.lang.Override
        public AirQualityFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AirQualityFutureStub(channel, callOptions);
        }
      };
    return AirQualityFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Air Quality Monitoring Service
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getAirQuality(smartoffice.AirQualityOuterClass.AirQualityRequest request,
        io.grpc.stub.StreamObserver<smartoffice.AirQualityOuterClass.AirQualityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAirQualityMethod(), responseObserver);
    }

    /**
     */
    default void streamAirQualityUpdates(smartoffice.AirQualityOuterClass.AirQualityRequest request,
        io.grpc.stub.StreamObserver<smartoffice.AirQualityOuterClass.AirQualityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamAirQualityUpdatesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AirQuality.
   * <pre>
   * Air Quality Monitoring Service
   * </pre>
   */
  public static abstract class AirQualityImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AirQualityGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AirQuality.
   * <pre>
   * Air Quality Monitoring Service
   * </pre>
   */
  public static final class AirQualityStub
      extends io.grpc.stub.AbstractAsyncStub<AirQualityStub> {
    private AirQualityStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AirQualityStub(channel, callOptions);
    }

    /**
     */
    public void getAirQuality(smartoffice.AirQualityOuterClass.AirQualityRequest request,
        io.grpc.stub.StreamObserver<smartoffice.AirQualityOuterClass.AirQualityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAirQualityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamAirQualityUpdates(smartoffice.AirQualityOuterClass.AirQualityRequest request,
        io.grpc.stub.StreamObserver<smartoffice.AirQualityOuterClass.AirQualityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamAirQualityUpdatesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AirQuality.
   * <pre>
   * Air Quality Monitoring Service
   * </pre>
   */
  public static final class AirQualityBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AirQualityBlockingStub> {
    private AirQualityBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AirQualityBlockingStub(channel, callOptions);
    }

    /**
     */
    public smartoffice.AirQualityOuterClass.AirQualityResponse getAirQuality(smartoffice.AirQualityOuterClass.AirQualityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAirQualityMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<smartoffice.AirQualityOuterClass.AirQualityResponse> streamAirQualityUpdates(
        smartoffice.AirQualityOuterClass.AirQualityRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamAirQualityUpdatesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AirQuality.
   * <pre>
   * Air Quality Monitoring Service
   * </pre>
   */
  public static final class AirQualityFutureStub
      extends io.grpc.stub.AbstractFutureStub<AirQualityFutureStub> {
    private AirQualityFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AirQualityFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartoffice.AirQualityOuterClass.AirQualityResponse> getAirQuality(
        smartoffice.AirQualityOuterClass.AirQualityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAirQualityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AIR_QUALITY = 0;
  private static final int METHODID_STREAM_AIR_QUALITY_UPDATES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AIR_QUALITY:
          serviceImpl.getAirQuality((smartoffice.AirQualityOuterClass.AirQualityRequest) request,
              (io.grpc.stub.StreamObserver<smartoffice.AirQualityOuterClass.AirQualityResponse>) responseObserver);
          break;
        case METHODID_STREAM_AIR_QUALITY_UPDATES:
          serviceImpl.streamAirQualityUpdates((smartoffice.AirQualityOuterClass.AirQualityRequest) request,
              (io.grpc.stub.StreamObserver<smartoffice.AirQualityOuterClass.AirQualityResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetAirQualityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartoffice.AirQualityOuterClass.AirQualityRequest,
              smartoffice.AirQualityOuterClass.AirQualityResponse>(
                service, METHODID_GET_AIR_QUALITY)))
        .addMethod(
          getStreamAirQualityUpdatesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              smartoffice.AirQualityOuterClass.AirQualityRequest,
              smartoffice.AirQualityOuterClass.AirQualityResponse>(
                service, METHODID_STREAM_AIR_QUALITY_UPDATES)))
        .build();
  }

  private static abstract class AirQualityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AirQualityBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartoffice.AirQualityOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AirQuality");
    }
  }

  private static final class AirQualityFileDescriptorSupplier
      extends AirQualityBaseDescriptorSupplier {
    AirQualityFileDescriptorSupplier() {}
  }

  private static final class AirQualityMethodDescriptorSupplier
      extends AirQualityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AirQualityMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AirQualityGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AirQualityFileDescriptorSupplier())
              .addMethod(getGetAirQualityMethod())
              .addMethod(getStreamAirQualityUpdatesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
