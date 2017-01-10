// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

/**
 * <pre>
 * Response message for UndeleteService method.
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.UndeleteServiceResponse}
 */
public  final class UndeleteServiceResponse extends
    com.google.protobuf.GeneratedMessageLite<
        UndeleteServiceResponse, UndeleteServiceResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.UndeleteServiceResponse)
    UndeleteServiceResponseOrBuilder {
  private UndeleteServiceResponse() {
  }
  public static final int SERVICE_FIELD_NUMBER = 1;
  private com.google.api.servicemanagement.v1.ManagedService service_;
  /**
   * <pre>
   * Revived service resource.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.ManagedService service = 1;</code>
   */
  public boolean hasService() {
    return service_ != null;
  }
  /**
   * <pre>
   * Revived service resource.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.ManagedService service = 1;</code>
   */
  public com.google.api.servicemanagement.v1.ManagedService getService() {
    return service_ == null ? com.google.api.servicemanagement.v1.ManagedService.getDefaultInstance() : service_;
  }
  /**
   * <pre>
   * Revived service resource.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.ManagedService service = 1;</code>
   */
  private void setService(com.google.api.servicemanagement.v1.ManagedService value) {
    if (value == null) {
      throw new NullPointerException();
    }
    service_ = value;
    
    }
  /**
   * <pre>
   * Revived service resource.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.ManagedService service = 1;</code>
   */
  private void setService(
      com.google.api.servicemanagement.v1.ManagedService.Builder builderForValue) {
    service_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Revived service resource.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.ManagedService service = 1;</code>
   */
  private void mergeService(com.google.api.servicemanagement.v1.ManagedService value) {
    if (service_ != null &&
        service_ != com.google.api.servicemanagement.v1.ManagedService.getDefaultInstance()) {
      service_ =
        com.google.api.servicemanagement.v1.ManagedService.newBuilder(service_).mergeFrom(value).buildPartial();
    } else {
      service_ = value;
    }
    
  }
  /**
   * <pre>
   * Revived service resource.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.ManagedService service = 1;</code>
   */
  private void clearService() {  service_ = null;
    
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (service_ != null) {
      output.writeMessage(1, getService());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (service_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getService());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.api.servicemanagement.v1.UndeleteServiceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.servicemanagement.v1.UndeleteServiceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.UndeleteServiceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.servicemanagement.v1.UndeleteServiceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.UndeleteServiceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.UndeleteServiceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.UndeleteServiceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.UndeleteServiceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.UndeleteServiceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.UndeleteServiceResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.servicemanagement.v1.UndeleteServiceResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Response message for UndeleteService method.
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.UndeleteServiceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.servicemanagement.v1.UndeleteServiceResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.UndeleteServiceResponse)
      com.google.api.servicemanagement.v1.UndeleteServiceResponseOrBuilder {
    // Construct using com.google.api.servicemanagement.v1.UndeleteServiceResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Revived service resource.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.ManagedService service = 1;</code>
     */
    public boolean hasService() {
      return instance.hasService();
    }
    /**
     * <pre>
     * Revived service resource.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.ManagedService service = 1;</code>
     */
    public com.google.api.servicemanagement.v1.ManagedService getService() {
      return instance.getService();
    }
    /**
     * <pre>
     * Revived service resource.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.ManagedService service = 1;</code>
     */
    public Builder setService(com.google.api.servicemanagement.v1.ManagedService value) {
      copyOnWrite();
      instance.setService(value);
      return this;
      }
    /**
     * <pre>
     * Revived service resource.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.ManagedService service = 1;</code>
     */
    public Builder setService(
        com.google.api.servicemanagement.v1.ManagedService.Builder builderForValue) {
      copyOnWrite();
      instance.setService(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Revived service resource.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.ManagedService service = 1;</code>
     */
    public Builder mergeService(com.google.api.servicemanagement.v1.ManagedService value) {
      copyOnWrite();
      instance.mergeService(value);
      return this;
    }
    /**
     * <pre>
     * Revived service resource.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.ManagedService service = 1;</code>
     */
    public Builder clearService() {  copyOnWrite();
      instance.clearService();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.UndeleteServiceResponse)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.servicemanagement.v1.UndeleteServiceResponse();
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
        com.google.api.servicemanagement.v1.UndeleteServiceResponse other = (com.google.api.servicemanagement.v1.UndeleteServiceResponse) arg1;
        service_ = visitor.visitMessage(service_, other.service_);
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
                com.google.api.servicemanagement.v1.ManagedService.Builder subBuilder = null;
                if (service_ != null) {
                  subBuilder = service_.toBuilder();
                }
                service_ = input.readMessage(com.google.api.servicemanagement.v1.ManagedService.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(service_);
                  service_ = subBuilder.buildPartial();
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
        if (PARSER == null) {    synchronized (com.google.api.servicemanagement.v1.UndeleteServiceResponse.class) {
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


  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.UndeleteServiceResponse)
  private static final com.google.api.servicemanagement.v1.UndeleteServiceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UndeleteServiceResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.api.servicemanagement.v1.UndeleteServiceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UndeleteServiceResponse> PARSER;

  public static com.google.protobuf.Parser<UndeleteServiceResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

