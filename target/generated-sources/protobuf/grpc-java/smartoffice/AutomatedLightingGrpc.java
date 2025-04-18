package smartoffice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Automated Lighting Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: AutomatedLighting.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AutomatedLightingGrpc {

  private AutomatedLightingGrpc() {}

  public static final java.lang.String SERVICE_NAME = "smartoffice.AutomatedLighting";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartoffice.AutomatedLightingOuterClass.LightRequest,
      smartoffice.AutomatedLightingOuterClass.LightResponse> getControlLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ControlLights",
      requestType = smartoffice.AutomatedLightingOuterClass.LightRequest.class,
      responseType = smartoffice.AutomatedLightingOuterClass.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartoffice.AutomatedLightingOuterClass.LightRequest,
      smartoffice.AutomatedLightingOuterClass.LightResponse> getControlLightsMethod() {
    io.grpc.MethodDescriptor<smartoffice.AutomatedLightingOuterClass.LightRequest, smartoffice.AutomatedLightingOuterClass.LightResponse> getControlLightsMethod;
    if ((getControlLightsMethod = AutomatedLightingGrpc.getControlLightsMethod) == null) {
      synchronized (AutomatedLightingGrpc.class) {
        if ((getControlLightsMethod = AutomatedLightingGrpc.getControlLightsMethod) == null) {
          AutomatedLightingGrpc.getControlLightsMethod = getControlLightsMethod =
              io.grpc.MethodDescriptor.<smartoffice.AutomatedLightingOuterClass.LightRequest, smartoffice.AutomatedLightingOuterClass.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ControlLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartoffice.AutomatedLightingOuterClass.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartoffice.AutomatedLightingOuterClass.LightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AutomatedLightingMethodDescriptorSupplier("ControlLights"))
              .build();
        }
      }
    }
    return getControlLightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartoffice.AutomatedLightingOuterClass.LightRequest,
      smartoffice.AutomatedLightingOuterClass.LightSummaryResponse> getStreamLightingControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamLightingControl",
      requestType = smartoffice.AutomatedLightingOuterClass.LightRequest.class,
      responseType = smartoffice.AutomatedLightingOuterClass.LightSummaryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<smartoffice.AutomatedLightingOuterClass.LightRequest,
      smartoffice.AutomatedLightingOuterClass.LightSummaryResponse> getStreamLightingControlMethod() {
    io.grpc.MethodDescriptor<smartoffice.AutomatedLightingOuterClass.LightRequest, smartoffice.AutomatedLightingOuterClass.LightSummaryResponse> getStreamLightingControlMethod;
    if ((getStreamLightingControlMethod = AutomatedLightingGrpc.getStreamLightingControlMethod) == null) {
      synchronized (AutomatedLightingGrpc.class) {
        if ((getStreamLightingControlMethod = AutomatedLightingGrpc.getStreamLightingControlMethod) == null) {
          AutomatedLightingGrpc.getStreamLightingControlMethod = getStreamLightingControlMethod =
              io.grpc.MethodDescriptor.<smartoffice.AutomatedLightingOuterClass.LightRequest, smartoffice.AutomatedLightingOuterClass.LightSummaryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "streamLightingControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartoffice.AutomatedLightingOuterClass.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartoffice.AutomatedLightingOuterClass.LightSummaryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AutomatedLightingMethodDescriptorSupplier("streamLightingControl"))
              .build();
        }
      }
    }
    return getStreamLightingControlMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AutomatedLightingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AutomatedLightingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AutomatedLightingStub>() {
        @java.lang.Override
        public AutomatedLightingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AutomatedLightingStub(channel, callOptions);
        }
      };
    return AutomatedLightingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AutomatedLightingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AutomatedLightingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AutomatedLightingBlockingStub>() {
        @java.lang.Override
        public AutomatedLightingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AutomatedLightingBlockingStub(channel, callOptions);
        }
      };
    return AutomatedLightingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AutomatedLightingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AutomatedLightingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AutomatedLightingFutureStub>() {
        @java.lang.Override
        public AutomatedLightingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AutomatedLightingFutureStub(channel, callOptions);
        }
      };
    return AutomatedLightingFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Automated Lighting Service
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void controlLights(smartoffice.AutomatedLightingOuterClass.LightRequest request,
        io.grpc.stub.StreamObserver<smartoffice.AutomatedLightingOuterClass.LightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getControlLightsMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<smartoffice.AutomatedLightingOuterClass.LightRequest> streamLightingControl(
        io.grpc.stub.StreamObserver<smartoffice.AutomatedLightingOuterClass.LightSummaryResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamLightingControlMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AutomatedLighting.
   * <pre>
   * Automated Lighting Service
   * </pre>
   */
  public static abstract class AutomatedLightingImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AutomatedLightingGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AutomatedLighting.
   * <pre>
   * Automated Lighting Service
   * </pre>
   */
  public static final class AutomatedLightingStub
      extends io.grpc.stub.AbstractAsyncStub<AutomatedLightingStub> {
    private AutomatedLightingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutomatedLightingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AutomatedLightingStub(channel, callOptions);
    }

    /**
     */
    public void controlLights(smartoffice.AutomatedLightingOuterClass.LightRequest request,
        io.grpc.stub.StreamObserver<smartoffice.AutomatedLightingOuterClass.LightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getControlLightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<smartoffice.AutomatedLightingOuterClass.LightRequest> streamLightingControl(
        io.grpc.stub.StreamObserver<smartoffice.AutomatedLightingOuterClass.LightSummaryResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getStreamLightingControlMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AutomatedLighting.
   * <pre>
   * Automated Lighting Service
   * </pre>
   */
  public static final class AutomatedLightingBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AutomatedLightingBlockingStub> {
    private AutomatedLightingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutomatedLightingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AutomatedLightingBlockingStub(channel, callOptions);
    }

    /**
     */
    public smartoffice.AutomatedLightingOuterClass.LightResponse controlLights(smartoffice.AutomatedLightingOuterClass.LightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getControlLightsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AutomatedLighting.
   * <pre>
   * Automated Lighting Service
   * </pre>
   */
  public static final class AutomatedLightingFutureStub
      extends io.grpc.stub.AbstractFutureStub<AutomatedLightingFutureStub> {
    private AutomatedLightingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutomatedLightingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AutomatedLightingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartoffice.AutomatedLightingOuterClass.LightResponse> controlLights(
        smartoffice.AutomatedLightingOuterClass.LightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getControlLightsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONTROL_LIGHTS = 0;
  private static final int METHODID_STREAM_LIGHTING_CONTROL = 1;

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
        case METHODID_CONTROL_LIGHTS:
          serviceImpl.controlLights((smartoffice.AutomatedLightingOuterClass.LightRequest) request,
              (io.grpc.stub.StreamObserver<smartoffice.AutomatedLightingOuterClass.LightResponse>) responseObserver);
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
        case METHODID_STREAM_LIGHTING_CONTROL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamLightingControl(
              (io.grpc.stub.StreamObserver<smartoffice.AutomatedLightingOuterClass.LightSummaryResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getControlLightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartoffice.AutomatedLightingOuterClass.LightRequest,
              smartoffice.AutomatedLightingOuterClass.LightResponse>(
                service, METHODID_CONTROL_LIGHTS)))
        .addMethod(
          getStreamLightingControlMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              smartoffice.AutomatedLightingOuterClass.LightRequest,
              smartoffice.AutomatedLightingOuterClass.LightSummaryResponse>(
                service, METHODID_STREAM_LIGHTING_CONTROL)))
        .build();
  }

  private static abstract class AutomatedLightingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AutomatedLightingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartoffice.AutomatedLightingOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AutomatedLighting");
    }
  }

  private static final class AutomatedLightingFileDescriptorSupplier
      extends AutomatedLightingBaseDescriptorSupplier {
    AutomatedLightingFileDescriptorSupplier() {}
  }

  private static final class AutomatedLightingMethodDescriptorSupplier
      extends AutomatedLightingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AutomatedLightingMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AutomatedLightingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AutomatedLightingFileDescriptorSupplier())
              .addMethod(getControlLightsMethod())
              .addMethod(getStreamLightingControlMethod())
              .build();
        }
      }
    }
    return result;
  }
}
