// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicecontrol/v1/service_controller.proto

package com.google.api.servicecontrol.v1;

/**
 * <pre>
 * Request message for the Check method.
 * </pre>
 *
 * Protobuf type {@code google.api.servicecontrol.v1.CheckRequest}
 */
public  final class CheckRequest extends
    com.google.protobuf.GeneratedMessageLite<
        CheckRequest, CheckRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.servicecontrol.v1.CheckRequest)
    CheckRequestOrBuilder {
  private CheckRequest() {
    serviceName_ = "";
    serviceConfigId_ = "";
  }
  public static final int SERVICE_NAME_FIELD_NUMBER = 1;
  private java.lang.String serviceName_;
  /**
   * <pre>
   * The service name as specified in its service configuration. For example,
   * `"pubsub.googleapis.com"`.
   * See [google.api.Service][google.api.Service] for the definition of a service name.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  public java.lang.String getServiceName() {
    return serviceName_;
  }
  /**
   * <pre>
   * The service name as specified in its service configuration. For example,
   * `"pubsub.googleapis.com"`.
   * See [google.api.Service][google.api.Service] for the definition of a service name.
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
   * The service name as specified in its service configuration. For example,
   * `"pubsub.googleapis.com"`.
   * See [google.api.Service][google.api.Service] for the definition of a service name.
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
   * The service name as specified in its service configuration. For example,
   * `"pubsub.googleapis.com"`.
   * See [google.api.Service][google.api.Service] for the definition of a service name.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  private void clearServiceName() {
    
    serviceName_ = getDefaultInstance().getServiceName();
  }
  /**
   * <pre>
   * The service name as specified in its service configuration. For example,
   * `"pubsub.googleapis.com"`.
   * See [google.api.Service][google.api.Service] for the definition of a service name.
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

  public static final int OPERATION_FIELD_NUMBER = 2;
  private com.google.api.servicecontrol.v1.Operation operation_;
  /**
   * <pre>
   * The operation to be checked.
   * </pre>
   *
   * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
   */
  public boolean hasOperation() {
    return operation_ != null;
  }
  /**
   * <pre>
   * The operation to be checked.
   * </pre>
   *
   * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
   */
  public com.google.api.servicecontrol.v1.Operation getOperation() {
    return operation_ == null ? com.google.api.servicecontrol.v1.Operation.getDefaultInstance() : operation_;
  }
  /**
   * <pre>
   * The operation to be checked.
   * </pre>
   *
   * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
   */
  private void setOperation(com.google.api.servicecontrol.v1.Operation value) {
    if (value == null) {
      throw new NullPointerException();
    }
    operation_ = value;
    
    }
  /**
   * <pre>
   * The operation to be checked.
   * </pre>
   *
   * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
   */
  private void setOperation(
      com.google.api.servicecontrol.v1.Operation.Builder builderForValue) {
    operation_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * The operation to be checked.
   * </pre>
   *
   * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
   */
  private void mergeOperation(com.google.api.servicecontrol.v1.Operation value) {
    if (operation_ != null &&
        operation_ != com.google.api.servicecontrol.v1.Operation.getDefaultInstance()) {
      operation_ =
        com.google.api.servicecontrol.v1.Operation.newBuilder(operation_).mergeFrom(value).buildPartial();
    } else {
      operation_ = value;
    }
    
  }
  /**
   * <pre>
   * The operation to be checked.
   * </pre>
   *
   * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
   */
  private void clearOperation() {  operation_ = null;
    
  }

  public static final int SERVICE_CONFIG_ID_FIELD_NUMBER = 4;
  private java.lang.String serviceConfigId_;
  /**
   * <pre>
   * Specifies which version of service configuration should be used to process
   * the request.
   * If unspecified or no matching version can be found, the
   * latest one will be used.
   * </pre>
   *
   * <code>optional string service_config_id = 4;</code>
   */
  public java.lang.String getServiceConfigId() {
    return serviceConfigId_;
  }
  /**
   * <pre>
   * Specifies which version of service configuration should be used to process
   * the request.
   * If unspecified or no matching version can be found, the
   * latest one will be used.
   * </pre>
   *
   * <code>optional string service_config_id = 4;</code>
   */
  public com.google.protobuf.ByteString
      getServiceConfigIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(serviceConfigId_);
  }
  /**
   * <pre>
   * Specifies which version of service configuration should be used to process
   * the request.
   * If unspecified or no matching version can be found, the
   * latest one will be used.
   * </pre>
   *
   * <code>optional string service_config_id = 4;</code>
   */
  private void setServiceConfigId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    serviceConfigId_ = value;
  }
  /**
   * <pre>
   * Specifies which version of service configuration should be used to process
   * the request.
   * If unspecified or no matching version can be found, the
   * latest one will be used.
   * </pre>
   *
   * <code>optional string service_config_id = 4;</code>
   */
  private void clearServiceConfigId() {
    
    serviceConfigId_ = getDefaultInstance().getServiceConfigId();
  }
  /**
   * <pre>
   * Specifies which version of service configuration should be used to process
   * the request.
   * If unspecified or no matching version can be found, the
   * latest one will be used.
   * </pre>
   *
   * <code>optional string service_config_id = 4;</code>
   */
  private void setServiceConfigIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    serviceConfigId_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!serviceName_.isEmpty()) {
      output.writeString(1, getServiceName());
    }
    if (operation_ != null) {
      output.writeMessage(2, getOperation());
    }
    if (!serviceConfigId_.isEmpty()) {
      output.writeString(4, getServiceConfigId());
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
    if (operation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOperation());
    }
    if (!serviceConfigId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getServiceConfigId());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.api.servicecontrol.v1.CheckRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.servicecontrol.v1.CheckRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Request message for the Check method.
   * </pre>
   *
   * Protobuf type {@code google.api.servicecontrol.v1.CheckRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.servicecontrol.v1.CheckRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.servicecontrol.v1.CheckRequest)
      com.google.api.servicecontrol.v1.CheckRequestOrBuilder {
    // Construct using com.google.api.servicecontrol.v1.CheckRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The service name as specified in its service configuration. For example,
     * `"pubsub.googleapis.com"`.
     * See [google.api.Service][google.api.Service] for the definition of a service name.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public java.lang.String getServiceName() {
      return instance.getServiceName();
    }
    /**
     * <pre>
     * The service name as specified in its service configuration. For example,
     * `"pubsub.googleapis.com"`.
     * See [google.api.Service][google.api.Service] for the definition of a service name.
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
     * The service name as specified in its service configuration. For example,
     * `"pubsub.googleapis.com"`.
     * See [google.api.Service][google.api.Service] for the definition of a service name.
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
     * The service name as specified in its service configuration. For example,
     * `"pubsub.googleapis.com"`.
     * See [google.api.Service][google.api.Service] for the definition of a service name.
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
     * The service name as specified in its service configuration. For example,
     * `"pubsub.googleapis.com"`.
     * See [google.api.Service][google.api.Service] for the definition of a service name.
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
     * The operation to be checked.
     * </pre>
     *
     * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
     */
    public boolean hasOperation() {
      return instance.hasOperation();
    }
    /**
     * <pre>
     * The operation to be checked.
     * </pre>
     *
     * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
     */
    public com.google.api.servicecontrol.v1.Operation getOperation() {
      return instance.getOperation();
    }
    /**
     * <pre>
     * The operation to be checked.
     * </pre>
     *
     * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
     */
    public Builder setOperation(com.google.api.servicecontrol.v1.Operation value) {
      copyOnWrite();
      instance.setOperation(value);
      return this;
      }
    /**
     * <pre>
     * The operation to be checked.
     * </pre>
     *
     * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
     */
    public Builder setOperation(
        com.google.api.servicecontrol.v1.Operation.Builder builderForValue) {
      copyOnWrite();
      instance.setOperation(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The operation to be checked.
     * </pre>
     *
     * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
     */
    public Builder mergeOperation(com.google.api.servicecontrol.v1.Operation value) {
      copyOnWrite();
      instance.mergeOperation(value);
      return this;
    }
    /**
     * <pre>
     * The operation to be checked.
     * </pre>
     *
     * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
     */
    public Builder clearOperation() {  copyOnWrite();
      instance.clearOperation();
      return this;
    }

    /**
     * <pre>
     * Specifies which version of service configuration should be used to process
     * the request.
     * If unspecified or no matching version can be found, the
     * latest one will be used.
     * </pre>
     *
     * <code>optional string service_config_id = 4;</code>
     */
    public java.lang.String getServiceConfigId() {
      return instance.getServiceConfigId();
    }
    /**
     * <pre>
     * Specifies which version of service configuration should be used to process
     * the request.
     * If unspecified or no matching version can be found, the
     * latest one will be used.
     * </pre>
     *
     * <code>optional string service_config_id = 4;</code>
     */
    public com.google.protobuf.ByteString
        getServiceConfigIdBytes() {
      return instance.getServiceConfigIdBytes();
    }
    /**
     * <pre>
     * Specifies which version of service configuration should be used to process
     * the request.
     * If unspecified or no matching version can be found, the
     * latest one will be used.
     * </pre>
     *
     * <code>optional string service_config_id = 4;</code>
     */
    public Builder setServiceConfigId(
        java.lang.String value) {
      copyOnWrite();
      instance.setServiceConfigId(value);
      return this;
    }
    /**
     * <pre>
     * Specifies which version of service configuration should be used to process
     * the request.
     * If unspecified or no matching version can be found, the
     * latest one will be used.
     * </pre>
     *
     * <code>optional string service_config_id = 4;</code>
     */
    public Builder clearServiceConfigId() {
      copyOnWrite();
      instance.clearServiceConfigId();
      return this;
    }
    /**
     * <pre>
     * Specifies which version of service configuration should be used to process
     * the request.
     * If unspecified or no matching version can be found, the
     * latest one will be used.
     * </pre>
     *
     * <code>optional string service_config_id = 4;</code>
     */
    public Builder setServiceConfigIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setServiceConfigIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.servicecontrol.v1.CheckRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.servicecontrol.v1.CheckRequest();
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
        com.google.api.servicecontrol.v1.CheckRequest other = (com.google.api.servicecontrol.v1.CheckRequest) arg1;
        serviceName_ = visitor.visitString(!serviceName_.isEmpty(), serviceName_,
            !other.serviceName_.isEmpty(), other.serviceName_);
        operation_ = visitor.visitMessage(operation_, other.operation_);
        serviceConfigId_ = visitor.visitString(!serviceConfigId_.isEmpty(), serviceConfigId_,
            !other.serviceConfigId_.isEmpty(), other.serviceConfigId_);
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
                com.google.api.servicecontrol.v1.Operation.Builder subBuilder = null;
                if (operation_ != null) {
                  subBuilder = operation_.toBuilder();
                }
                operation_ = input.readMessage(com.google.api.servicecontrol.v1.Operation.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(operation_);
                  operation_ = subBuilder.buildPartial();
                }

                break;
              }
              case 34: {
                String s = input.readStringRequireUtf8();

                serviceConfigId_ = s;
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
        if (PARSER == null) {    synchronized (com.google.api.servicecontrol.v1.CheckRequest.class) {
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


  // @@protoc_insertion_point(class_scope:google.api.servicecontrol.v1.CheckRequest)
  private static final com.google.api.servicecontrol.v1.CheckRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CheckRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.api.servicecontrol.v1.CheckRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CheckRequest> PARSER;

  public static com.google.protobuf.Parser<CheckRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
