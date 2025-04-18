package smartoffice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Meeting Room Booking Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: MeetingRoomBooking.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MeetingRoomBookingGrpc {

  private MeetingRoomBookingGrpc() {}

  public static final java.lang.String SERVICE_NAME = "smartoffice.MeetingRoomBooking";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartoffice.MeetingRoomBookingOuterClass.BookingRequest,
      smartoffice.MeetingRoomBookingOuterClass.BookingResponse> getBookRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BookRoom",
      requestType = smartoffice.MeetingRoomBookingOuterClass.BookingRequest.class,
      responseType = smartoffice.MeetingRoomBookingOuterClass.BookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartoffice.MeetingRoomBookingOuterClass.BookingRequest,
      smartoffice.MeetingRoomBookingOuterClass.BookingResponse> getBookRoomMethod() {
    io.grpc.MethodDescriptor<smartoffice.MeetingRoomBookingOuterClass.BookingRequest, smartoffice.MeetingRoomBookingOuterClass.BookingResponse> getBookRoomMethod;
    if ((getBookRoomMethod = MeetingRoomBookingGrpc.getBookRoomMethod) == null) {
      synchronized (MeetingRoomBookingGrpc.class) {
        if ((getBookRoomMethod = MeetingRoomBookingGrpc.getBookRoomMethod) == null) {
          MeetingRoomBookingGrpc.getBookRoomMethod = getBookRoomMethod =
              io.grpc.MethodDescriptor.<smartoffice.MeetingRoomBookingOuterClass.BookingRequest, smartoffice.MeetingRoomBookingOuterClass.BookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BookRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartoffice.MeetingRoomBookingOuterClass.BookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartoffice.MeetingRoomBookingOuterClass.BookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingRoomBookingMethodDescriptorSupplier("BookRoom"))
              .build();
        }
      }
    }
    return getBookRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartoffice.MeetingRoomBookingOuterClass.CancelRequest,
      smartoffice.MeetingRoomBookingOuterClass.CancelResponse> getCancelBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelBooking",
      requestType = smartoffice.MeetingRoomBookingOuterClass.CancelRequest.class,
      responseType = smartoffice.MeetingRoomBookingOuterClass.CancelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartoffice.MeetingRoomBookingOuterClass.CancelRequest,
      smartoffice.MeetingRoomBookingOuterClass.CancelResponse> getCancelBookingMethod() {
    io.grpc.MethodDescriptor<smartoffice.MeetingRoomBookingOuterClass.CancelRequest, smartoffice.MeetingRoomBookingOuterClass.CancelResponse> getCancelBookingMethod;
    if ((getCancelBookingMethod = MeetingRoomBookingGrpc.getCancelBookingMethod) == null) {
      synchronized (MeetingRoomBookingGrpc.class) {
        if ((getCancelBookingMethod = MeetingRoomBookingGrpc.getCancelBookingMethod) == null) {
          MeetingRoomBookingGrpc.getCancelBookingMethod = getCancelBookingMethod =
              io.grpc.MethodDescriptor.<smartoffice.MeetingRoomBookingOuterClass.CancelRequest, smartoffice.MeetingRoomBookingOuterClass.CancelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartoffice.MeetingRoomBookingOuterClass.CancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartoffice.MeetingRoomBookingOuterClass.CancelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingRoomBookingMethodDescriptorSupplier("CancelBooking"))
              .build();
        }
      }
    }
    return getCancelBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartoffice.MeetingRoomBookingOuterClass.BookingRequest,
      smartoffice.MeetingRoomBookingOuterClass.BookingResponse> getLiveRoomBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiveRoomBooking",
      requestType = smartoffice.MeetingRoomBookingOuterClass.BookingRequest.class,
      responseType = smartoffice.MeetingRoomBookingOuterClass.BookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<smartoffice.MeetingRoomBookingOuterClass.BookingRequest,
      smartoffice.MeetingRoomBookingOuterClass.BookingResponse> getLiveRoomBookingMethod() {
    io.grpc.MethodDescriptor<smartoffice.MeetingRoomBookingOuterClass.BookingRequest, smartoffice.MeetingRoomBookingOuterClass.BookingResponse> getLiveRoomBookingMethod;
    if ((getLiveRoomBookingMethod = MeetingRoomBookingGrpc.getLiveRoomBookingMethod) == null) {
      synchronized (MeetingRoomBookingGrpc.class) {
        if ((getLiveRoomBookingMethod = MeetingRoomBookingGrpc.getLiveRoomBookingMethod) == null) {
          MeetingRoomBookingGrpc.getLiveRoomBookingMethod = getLiveRoomBookingMethod =
              io.grpc.MethodDescriptor.<smartoffice.MeetingRoomBookingOuterClass.BookingRequest, smartoffice.MeetingRoomBookingOuterClass.BookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiveRoomBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartoffice.MeetingRoomBookingOuterClass.BookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartoffice.MeetingRoomBookingOuterClass.BookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingRoomBookingMethodDescriptorSupplier("LiveRoomBooking"))
              .build();
        }
      }
    }
    return getLiveRoomBookingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MeetingRoomBookingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeetingRoomBookingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeetingRoomBookingStub>() {
        @java.lang.Override
        public MeetingRoomBookingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeetingRoomBookingStub(channel, callOptions);
        }
      };
    return MeetingRoomBookingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MeetingRoomBookingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeetingRoomBookingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeetingRoomBookingBlockingStub>() {
        @java.lang.Override
        public MeetingRoomBookingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeetingRoomBookingBlockingStub(channel, callOptions);
        }
      };
    return MeetingRoomBookingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MeetingRoomBookingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeetingRoomBookingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeetingRoomBookingFutureStub>() {
        @java.lang.Override
        public MeetingRoomBookingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeetingRoomBookingFutureStub(channel, callOptions);
        }
      };
    return MeetingRoomBookingFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Meeting Room Booking Service
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void bookRoom(smartoffice.MeetingRoomBookingOuterClass.BookingRequest request,
        io.grpc.stub.StreamObserver<smartoffice.MeetingRoomBookingOuterClass.BookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBookRoomMethod(), responseObserver);
    }

    /**
     */
    default void cancelBooking(smartoffice.MeetingRoomBookingOuterClass.CancelRequest request,
        io.grpc.stub.StreamObserver<smartoffice.MeetingRoomBookingOuterClass.CancelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelBookingMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<smartoffice.MeetingRoomBookingOuterClass.BookingRequest> liveRoomBooking(
        io.grpc.stub.StreamObserver<smartoffice.MeetingRoomBookingOuterClass.BookingResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getLiveRoomBookingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MeetingRoomBooking.
   * <pre>
   * Meeting Room Booking Service
   * </pre>
   */
  public static abstract class MeetingRoomBookingImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MeetingRoomBookingGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MeetingRoomBooking.
   * <pre>
   * Meeting Room Booking Service
   * </pre>
   */
  public static final class MeetingRoomBookingStub
      extends io.grpc.stub.AbstractAsyncStub<MeetingRoomBookingStub> {
    private MeetingRoomBookingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingRoomBookingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeetingRoomBookingStub(channel, callOptions);
    }

    /**
     */
    public void bookRoom(smartoffice.MeetingRoomBookingOuterClass.BookingRequest request,
        io.grpc.stub.StreamObserver<smartoffice.MeetingRoomBookingOuterClass.BookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBookRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelBooking(smartoffice.MeetingRoomBookingOuterClass.CancelRequest request,
        io.grpc.stub.StreamObserver<smartoffice.MeetingRoomBookingOuterClass.CancelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<smartoffice.MeetingRoomBookingOuterClass.BookingRequest> liveRoomBooking(
        io.grpc.stub.StreamObserver<smartoffice.MeetingRoomBookingOuterClass.BookingResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getLiveRoomBookingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MeetingRoomBooking.
   * <pre>
   * Meeting Room Booking Service
   * </pre>
   */
  public static final class MeetingRoomBookingBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MeetingRoomBookingBlockingStub> {
    private MeetingRoomBookingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingRoomBookingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeetingRoomBookingBlockingStub(channel, callOptions);
    }

    /**
     */
    public smartoffice.MeetingRoomBookingOuterClass.BookingResponse bookRoom(smartoffice.MeetingRoomBookingOuterClass.BookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBookRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public smartoffice.MeetingRoomBookingOuterClass.CancelResponse cancelBooking(smartoffice.MeetingRoomBookingOuterClass.CancelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelBookingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MeetingRoomBooking.
   * <pre>
   * Meeting Room Booking Service
   * </pre>
   */
  public static final class MeetingRoomBookingFutureStub
      extends io.grpc.stub.AbstractFutureStub<MeetingRoomBookingFutureStub> {
    private MeetingRoomBookingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingRoomBookingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeetingRoomBookingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartoffice.MeetingRoomBookingOuterClass.BookingResponse> bookRoom(
        smartoffice.MeetingRoomBookingOuterClass.BookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBookRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartoffice.MeetingRoomBookingOuterClass.CancelResponse> cancelBooking(
        smartoffice.MeetingRoomBookingOuterClass.CancelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelBookingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BOOK_ROOM = 0;
  private static final int METHODID_CANCEL_BOOKING = 1;
  private static final int METHODID_LIVE_ROOM_BOOKING = 2;

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
        case METHODID_BOOK_ROOM:
          serviceImpl.bookRoom((smartoffice.MeetingRoomBookingOuterClass.BookingRequest) request,
              (io.grpc.stub.StreamObserver<smartoffice.MeetingRoomBookingOuterClass.BookingResponse>) responseObserver);
          break;
        case METHODID_CANCEL_BOOKING:
          serviceImpl.cancelBooking((smartoffice.MeetingRoomBookingOuterClass.CancelRequest) request,
              (io.grpc.stub.StreamObserver<smartoffice.MeetingRoomBookingOuterClass.CancelResponse>) responseObserver);
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
        case METHODID_LIVE_ROOM_BOOKING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.liveRoomBooking(
              (io.grpc.stub.StreamObserver<smartoffice.MeetingRoomBookingOuterClass.BookingResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getBookRoomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartoffice.MeetingRoomBookingOuterClass.BookingRequest,
              smartoffice.MeetingRoomBookingOuterClass.BookingResponse>(
                service, METHODID_BOOK_ROOM)))
        .addMethod(
          getCancelBookingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smartoffice.MeetingRoomBookingOuterClass.CancelRequest,
              smartoffice.MeetingRoomBookingOuterClass.CancelResponse>(
                service, METHODID_CANCEL_BOOKING)))
        .addMethod(
          getLiveRoomBookingMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              smartoffice.MeetingRoomBookingOuterClass.BookingRequest,
              smartoffice.MeetingRoomBookingOuterClass.BookingResponse>(
                service, METHODID_LIVE_ROOM_BOOKING)))
        .build();
  }

  private static abstract class MeetingRoomBookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MeetingRoomBookingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartoffice.MeetingRoomBookingOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MeetingRoomBooking");
    }
  }

  private static final class MeetingRoomBookingFileDescriptorSupplier
      extends MeetingRoomBookingBaseDescriptorSupplier {
    MeetingRoomBookingFileDescriptorSupplier() {}
  }

  private static final class MeetingRoomBookingMethodDescriptorSupplier
      extends MeetingRoomBookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MeetingRoomBookingMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MeetingRoomBookingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MeetingRoomBookingFileDescriptorSupplier())
              .addMethod(getBookRoomMethod())
              .addMethod(getCancelBookingMethod())
              .addMethod(getLiveRoomBookingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
