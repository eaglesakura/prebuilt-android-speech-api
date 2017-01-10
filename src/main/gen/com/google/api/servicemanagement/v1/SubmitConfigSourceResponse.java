// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

/**
 * <pre>
 * Response message for SubmitConfigSource method.
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.SubmitConfigSourceResponse}
 */
public  final class SubmitConfigSourceResponse extends
    com.google.protobuf.GeneratedMessageLite<
        SubmitConfigSourceResponse, SubmitConfigSourceResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.SubmitConfigSourceResponse)
    SubmitConfigSourceResponseOrBuilder {
  private SubmitConfigSourceResponse() {
  }
  public static final int SERVICE_CONFIG_FIELD_NUMBER = 1;
  private com.google.api.Service serviceConfig_;
  /**
   * <pre>
   * The generated service configuration.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 1;</code>
   */
  public boolean hasServiceConfig() {
    return serviceConfig_ != null;
  }
  /**
   * <pre>
   * The generated service configuration.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 1;</code>
   */
  public com.google.api.Service getServiceConfig() {
    return serviceConfig_ == null ? com.google.api.Service.getDefaultInstance() : serviceConfig_;
  }
  /**
   * <pre>
   * The generated service configuration.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 1;</code>
   */
  private void setServiceConfig(com.google.api.Service value) {
    if (value == null) {
      throw new NullPointerException();
    }
    serviceConfig_ = value;
    
    }
  /**
   * <pre>
   * The generated service configuration.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 1;</code>
   */
  private void setServiceConfig(
      com.google.api.Service.Builder builderForValue) {
    serviceConfig_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * The generated service configuration.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 1;</code>
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
   * The generated service configuration.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 1;</code>
   */
  private void clearServiceConfig() {  serviceConfig_ = null;
    
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (serviceConfig_ != null) {
      output.writeMessage(1, getServiceConfig());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (serviceConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getServiceConfig());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.servicemanagement.v1.SubmitConfigSourceResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Response message for SubmitConfigSource method.
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.SubmitConfigSourceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.servicemanagement.v1.SubmitConfigSourceResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.SubmitConfigSourceResponse)
      com.google.api.servicemanagement.v1.SubmitConfigSourceResponseOrBuilder {
    // Construct using com.google.api.servicemanagement.v1.SubmitConfigSourceResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The generated service configuration.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 1;</code>
     */
    public boolean hasServiceConfig() {
      return instance.hasServiceConfig();
    }
    /**
     * <pre>
     * The generated service configuration.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 1;</code>
     */
    public com.google.api.Service getServiceConfig() {
      return instance.getServiceConfig();
    }
    /**
     * <pre>
     * The generated service configuration.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 1;</code>
     */
    public Builder setServiceConfig(com.google.api.Service value) {
      copyOnWrite();
      instance.setServiceConfig(value);
      return this;
      }
    /**
     * <pre>
     * The generated service configuration.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 1;</code>
     */
    public Builder setServiceConfig(
        com.google.api.Service.Builder builderForValue) {
      copyOnWrite();
      instance.setServiceConfig(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The generated service configuration.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 1;</code>
     */
    public Builder mergeServiceConfig(com.google.api.Service value) {
      copyOnWrite();
      instance.mergeServiceConfig(value);
      return this;
    }
    /**
     * <pre>
     * The generated service configuration.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 1;</code>
     */
    public Builder clearServiceConfig() {  copyOnWrite();
      instance.clearServiceConfig();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.SubmitConfigSourceResponse)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.servicemanagement.v1.SubmitConfigSourceResponse();
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
        com.google.api.servicemanagement.v1.SubmitConfigSourceResponse other = (com.google.api.servicemanagement.v1.SubmitConfigSourceResponse) arg1;
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
        if (PARSER == null) {    synchronized (com.google.api.servicemanagement.v1.SubmitConfigSourceResponse.class) {
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


  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.SubmitConfigSourceResponse)
  private static final com.google.api.servicemanagement.v1.SubmitConfigSourceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SubmitConfigSourceResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SubmitConfigSourceResponse> PARSER;

  public static com.google.protobuf.Parser<SubmitConfigSourceResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

