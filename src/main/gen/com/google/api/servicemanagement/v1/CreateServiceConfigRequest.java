// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

/**
 * <pre>
 * Request message for CreateServiceConfig method.
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.CreateServiceConfigRequest}
 */
public  final class CreateServiceConfigRequest extends
    com.google.protobuf.GeneratedMessageLite<
        CreateServiceConfigRequest, CreateServiceConfigRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.CreateServiceConfigRequest)
    CreateServiceConfigRequestOrBuilder {
  private CreateServiceConfigRequest() {
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

  public static final int SERVICE_CONFIG_FIELD_NUMBER = 2;
  private com.google.api.Service serviceConfig_;
  /**
   * <pre>
   * The service configuration resource.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 2;</code>
   */
  public boolean hasServiceConfig() {
    return serviceConfig_ != null;
  }
  /**
   * <pre>
   * The service configuration resource.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 2;</code>
   */
  public com.google.api.Service getServiceConfig() {
    return serviceConfig_ == null ? com.google.api.Service.getDefaultInstance() : serviceConfig_;
  }
  /**
   * <pre>
   * The service configuration resource.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 2;</code>
   */
  private void setServiceConfig(com.google.api.Service value) {
    if (value == null) {
      throw new NullPointerException();
    }
    serviceConfig_ = value;
    
    }
  /**
   * <pre>
   * The service configuration resource.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 2;</code>
   */
  private void setServiceConfig(
      com.google.api.Service.Builder builderForValue) {
    serviceConfig_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * The service configuration resource.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 2;</code>
   */
  private void mergeServiceConfig(com.google.api.Service value) {
    if (serviceConfig_ != null &&
        serviceConfig_ != com.google.api.Service.getDefaultInstance()) {
      serviceConfig_ =
        com.google.api.Service.newBuilder(serviceConfig_).mergeFrom(value).buildPartial();
    } else {
      serviceConfig_ = value;
    }
    
  }
  /**
   * <pre>
   * The service configuration resource.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 2;</code>
   */
  private void clearServiceConfig() {  serviceConfig_ = null;
    
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!serviceName_.isEmpty()) {
      output.writeString(1, getServiceName());
    }
    if (serviceConfig_ != null) {
      output.writeMessage(2, getServiceConfig());
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
    if (serviceConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getServiceConfig());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.servicemanagement.v1.CreateServiceConfigRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Request message for CreateServiceConfig method.
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.CreateServiceConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.servicemanagement.v1.CreateServiceConfigRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.CreateServiceConfigRequest)
      com.google.api.servicemanagement.v1.CreateServiceConfigRequestOrBuilder {
    // Construct using com.google.api.servicemanagement.v1.CreateServiceConfigRequest.newBuilder()
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
     * The service configuration resource.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 2;</code>
     */
    public boolean hasServiceConfig() {
      return instance.hasServiceConfig();
    }
    /**
     * <pre>
     * The service configuration resource.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 2;</code>
     */
    public com.google.api.Service getServiceConfig() {
      return instance.getServiceConfig();
    }
    /**
     * <pre>
     * The service configuration resource.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 2;</code>
     */
    public Builder setServiceConfig(com.google.api.Service value) {
      copyOnWrite();
      instance.setServiceConfig(value);
      return this;
      }
    /**
     * <pre>
     * The service configuration resource.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 2;</code>
     */
    public Builder setServiceConfig(
        com.google.api.Service.Builder builderForValue) {
      copyOnWrite();
      instance.setServiceConfig(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The service configuration resource.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 2;</code>
     */
    public Builder mergeServiceConfig(com.google.api.Service value) {
      copyOnWrite();
      instance.mergeServiceConfig(value);
      return this;
    }
    /**
     * <pre>
     * The service configuration resource.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 2;</code>
     */
    public Builder clearServiceConfig() {  copyOnWrite();
      instance.clearServiceConfig();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.CreateServiceConfigRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.servicemanagement.v1.CreateServiceConfigRequest();
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
        com.google.api.servicemanagement.v1.CreateServiceConfigRequest other = (com.google.api.servicemanagement.v1.CreateServiceConfigRequest) arg1;
        serviceName_ = visitor.visitString(!serviceName_.isEmpty(), serviceName_,
            !other.serviceName_.isEmpty(), other.serviceName_);
        serviceConfig_ = visitor.visitMessage(serviceConfig_, other.serviceConfig_);
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
                com.google.api.Service.Builder subBuilder = null;
                if (serviceConfig_ != null) {
                  subBuilder = serviceConfig_.toBuilder();
                }
                serviceConfig_ = input.readMessage(com.google.api.Service.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(serviceConfig_);
                  serviceConfig_ = subBuilder.buildPartial();
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
        if (PARSER == null) {    synchronized (com.google.api.servicemanagement.v1.CreateServiceConfigRequest.class) {
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


  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.CreateServiceConfigRequest)
  private static final com.google.api.servicemanagement.v1.CreateServiceConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CreateServiceConfigRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CreateServiceConfigRequest> PARSER;

  public static com.google.protobuf.Parser<CreateServiceConfigRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
