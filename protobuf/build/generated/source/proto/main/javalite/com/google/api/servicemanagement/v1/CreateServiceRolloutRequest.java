// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

/**
 * <pre>
 * Request message for 'CreateServiceRollout'
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.CreateServiceRolloutRequest}
 */
public  final class CreateServiceRolloutRequest extends
    com.google.protobuf.GeneratedMessageLite<
        CreateServiceRolloutRequest, CreateServiceRolloutRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.CreateServiceRolloutRequest)
    CreateServiceRolloutRequestOrBuilder {
  private CreateServiceRolloutRequest() {
    serviceName_ = "";
  }
  public static final int SERVICE_NAME_FIELD_NUMBER = 1;
  private java.lang.String serviceName_;
  /**
   * <pre>
   * The name of the service.  See the [overview](/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  public java.lang.String getServiceName() {
    return serviceName_;
  }
  /**
   * <pre>
   * The name of the service.  See the [overview](/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getServiceNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(serviceName_);
  }
  /**
   * <pre>
   * The name of the service.  See the [overview](/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  private void setServiceName(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    serviceName_ = value;
  }
  /**
   * <pre>
   * The name of the service.  See the [overview](/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  private void clearServiceName() {
    
    serviceName_ = getDefaultInstance().getServiceName();
  }
  /**
   * <pre>
   * The name of the service.  See the [overview](/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  private void setServiceNameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    serviceName_ = value.toStringUtf8();
  }

  public static final int ROLLOUT_FIELD_NUMBER = 2;
  private com.google.api.servicemanagement.v1.Rollout rollout_;
  /**
   * <pre>
   * The rollout resource. The `service_name` field is output only.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
   */
  public boolean hasRollout() {
    return rollout_ != null;
  }
  /**
   * <pre>
   * The rollout resource. The `service_name` field is output only.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
   */
  public com.google.api.servicemanagement.v1.Rollout getRollout() {
    return rollout_ == null ? com.google.api.servicemanagement.v1.Rollout.getDefaultInstance() : rollout_;
  }
  /**
   * <pre>
   * The rollout resource. The `service_name` field is output only.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
   */
  private void setRollout(com.google.api.servicemanagement.v1.Rollout value) {
    if (value == null) {
      throw new NullPointerException();
    }
    rollout_ = value;
    
    }
  /**
   * <pre>
   * The rollout resource. The `service_name` field is output only.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
   */
  private void setRollout(
      com.google.api.servicemanagement.v1.Rollout.Builder builderForValue) {
    rollout_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * The rollout resource. The `service_name` field is output only.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
   */
  private void mergeRollout(com.google.api.servicemanagement.v1.Rollout value) {
    if (rollout_ != null &&
        rollout_ != com.google.api.servicemanagement.v1.Rollout.getDefaultInstance()) {
      rollout_ =
        com.google.api.servicemanagement.v1.Rollout.newBuilder(rollout_).mergeFrom(value).buildPartial();
    } else {
      rollout_ = value;
    }
    
  }
  /**
   * <pre>
   * The rollout resource. The `service_name` field is output only.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
   */
  private void clearRollout() {  rollout_ = null;
    
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!serviceName_.isEmpty()) {
      output.writeString(1, getServiceName());
    }
    if (rollout_ != null) {
      output.writeMessage(2, getRollout());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!serviceName_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getServiceName());
    }
    if (rollout_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRollout());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.servicemanagement.v1.CreateServiceRolloutRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Request message for 'CreateServiceRollout'
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.CreateServiceRolloutRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.servicemanagement.v1.CreateServiceRolloutRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.CreateServiceRolloutRequest)
      com.google.api.servicemanagement.v1.CreateServiceRolloutRequestOrBuilder {
    // Construct using com.google.api.servicemanagement.v1.CreateServiceRolloutRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public java.lang.String getServiceName() {
      return instance.getServiceName();
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getServiceNameBytes() {
      return instance.getServiceNameBytes();
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public Builder setServiceName(
        java.lang.String value) {
      copyOnWrite();
      instance.setServiceName(value);
      return this;
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public Builder clearServiceName() {
      copyOnWrite();
      instance.clearServiceName();
      return this;
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public Builder setServiceNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setServiceNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
     */
    public boolean hasRollout() {
      return instance.hasRollout();
    }
    /**
     * <pre>
     * The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
     */
    public com.google.api.servicemanagement.v1.Rollout getRollout() {
      return instance.getRollout();
    }
    /**
     * <pre>
     * The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
     */
    public Builder setRollout(com.google.api.servicemanagement.v1.Rollout value) {
      copyOnWrite();
      instance.setRollout(value);
      return this;
      }
    /**
     * <pre>
     * The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
     */
    public Builder setRollout(
        com.google.api.servicemanagement.v1.Rollout.Builder builderForValue) {
      copyOnWrite();
      instance.setRollout(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
     */
    public Builder mergeRollout(com.google.api.servicemanagement.v1.Rollout value) {
      copyOnWrite();
      instance.mergeRollout(value);
      return this;
    }
    /**
     * <pre>
     * The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
     */
    public Builder clearRollout() {  copyOnWrite();
      instance.clearRollout();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.CreateServiceRolloutRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.servicemanagement.v1.CreateServiceRolloutRequest();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.google.api.servicemanagement.v1.CreateServiceRolloutRequest other = (com.google.api.servicemanagement.v1.CreateServiceRolloutRequest) arg1;
        serviceName_ = visitor.visitString(!serviceName_.isEmpty(), serviceName_,
            !other.serviceName_.isEmpty(), other.serviceName_);
        rollout_ = visitor.visitMessage(rollout_, other.rollout_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readStringRequireUtf8();

                serviceName_ = s;
                break;
              }
              case 18: {
                com.google.api.servicemanagement.v1.Rollout.Builder subBuilder = null;
                if (rollout_ != null) {
                  subBuilder = rollout_.toBuilder();
                }
                rollout_ = input.readMessage(com.google.api.servicemanagement.v1.Rollout.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(rollout_);
                  rollout_ = subBuilder.buildPartial();
                }

                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.google.api.servicemanagement.v1.CreateServiceRolloutRequest.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.CreateServiceRolloutRequest)
  private static final com.google.api.servicemanagement.v1.CreateServiceRolloutRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CreateServiceRolloutRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CreateServiceRolloutRequest> PARSER;

  public static com.google.protobuf.Parser<CreateServiceRolloutRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

