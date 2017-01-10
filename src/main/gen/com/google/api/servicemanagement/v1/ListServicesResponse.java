// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

/**
 * <pre>
 * Response message for `ListServices` method.
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.ListServicesResponse}
 */
public  final class ListServicesResponse extends
    com.google.protobuf.GeneratedMessageLite<
        ListServicesResponse, ListServicesResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.ListServicesResponse)
    ListServicesResponseOrBuilder {
  private ListServicesResponse() {
    services_ = emptyProtobufList();
    nextPageToken_ = "";
  }
  private int bitField0_;
  public static final int SERVICES_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.google.api.servicemanagement.v1.ManagedService> services_;
  /**
   * <pre>
   * The results of the query.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
   */
  public java.util.List<com.google.api.servicemanagement.v1.ManagedService> getServicesList() {
    return services_;
  }
  /**
   * <pre>
   * The results of the query.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
   */
  public java.util.List<? extends com.google.api.servicemanagement.v1.ManagedServiceOrBuilder> 
      getServicesOrBuilderList() {
    return services_;
  }
  /**
   * <pre>
   * The results of the query.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
   */
  public int getServicesCount() {
    return services_.size();
  }
  /**
   * <pre>
   * The results of the query.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
   */
  public com.google.api.servicemanagement.v1.ManagedService getServices(int index) {
    return services_.get(index);
  }
  /**
   * <pre>
   * The results of the query.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
   */
  public com.google.api.servicemanagement.v1.ManagedServiceOrBuilder getServicesOrBuilder(
      int index) {
    return services_.get(index);
  }
  private void ensureServicesIsMutable() {
    if (!services_.isModifiable()) {
      services_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(services_);
     }
  }

  /**
   * <pre>
   * The results of the query.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
   */
  private void setServices(
      int index, com.google.api.servicemanagement.v1.ManagedService value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureServicesIsMutable();
    services_.set(index, value);
  }
  /**
   * <pre>
   * The results of the query.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
   */
  private void setServices(
      int index, com.google.api.servicemanagement.v1.ManagedService.Builder builderForValue) {
    ensureServicesIsMutable();
    services_.set(index, builderForValue.build());
  }
  /**
   * <pre>
   * The results of the query.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
   */
  private void addServices(com.google.api.servicemanagement.v1.ManagedService value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureServicesIsMutable();
    services_.add(value);
  }
  /**
   * <pre>
   * The results of the query.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
   */
  private void addServices(
      int index, com.google.api.servicemanagement.v1.ManagedService value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureServicesIsMutable();
    services_.add(index, value);
  }
  /**
   * <pre>
   * The results of the query.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
   */
  private void addServices(
      com.google.api.servicemanagement.v1.ManagedService.Builder builderForValue) {
    ensureServicesIsMutable();
    services_.add(builderForValue.build());
  }
  /**
   * <pre>
   * The results of the query.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
   */
  private void addServices(
      int index, com.google.api.servicemanagement.v1.ManagedService.Builder builderForValue) {
    ensureServicesIsMutable();
    services_.add(index, builderForValue.build());
  }
  /**
   * <pre>
   * The results of the query.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
   */
  private void addAllServices(
      java.lang.Iterable<? extends com.google.api.servicemanagement.v1.ManagedService> values) {
    ensureServicesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, services_);
  }
  /**
   * <pre>
   * The results of the query.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
   */
  private void clearServices() {
    services_ = emptyProtobufList();
  }
  /**
   * <pre>
   * The results of the query.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
   */
  private void removeServices(int index) {
    ensureServicesIsMutable();
    services_.remove(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private java.lang.String nextPageToken_;
  /**
   * <pre>
   * Token that can be passed to `ListServices` to resume a paginated query.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken_;
  }
  /**
   * <pre>
   * Token that can be passed to `ListServices` to resume a paginated query.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(nextPageToken_);
  }
  /**
   * <pre>
   * Token that can be passed to `ListServices` to resume a paginated query.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  private void setNextPageToken(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    nextPageToken_ = value;
  }
  /**
   * <pre>
   * Token that can be passed to `ListServices` to resume a paginated query.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  private void clearNextPageToken() {
    
    nextPageToken_ = getDefaultInstance().getNextPageToken();
  }
  /**
   * <pre>
   * Token that can be passed to `ListServices` to resume a paginated query.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  private void setNextPageTokenBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    nextPageToken_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < services_.size(); i++) {
      output.writeMessage(1, services_.get(i));
    }
    if (!nextPageToken_.isEmpty()) {
      output.writeString(2, getNextPageToken());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < services_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, services_.get(i));
    }
    if (!nextPageToken_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getNextPageToken());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.api.servicemanagement.v1.ListServicesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.servicemanagement.v1.ListServicesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServicesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.servicemanagement.v1.ListServicesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServicesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.ListServicesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServicesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.ListServicesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServicesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.ListServicesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.servicemanagement.v1.ListServicesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Response message for `ListServices` method.
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.ListServicesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.servicemanagement.v1.ListServicesResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.ListServicesResponse)
      com.google.api.servicemanagement.v1.ListServicesResponseOrBuilder {
    // Construct using com.google.api.servicemanagement.v1.ListServicesResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The results of the query.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
     */
    public java.util.List<com.google.api.servicemanagement.v1.ManagedService> getServicesList() {
      return java.util.Collections.unmodifiableList(
          instance.getServicesList());
    }
    /**
     * <pre>
     * The results of the query.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
     */
    public int getServicesCount() {
      return instance.getServicesCount();
    }/**
     * <pre>
     * The results of the query.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
     */
    public com.google.api.servicemanagement.v1.ManagedService getServices(int index) {
      return instance.getServices(index);
    }
    /**
     * <pre>
     * The results of the query.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
     */
    public Builder setServices(
        int index, com.google.api.servicemanagement.v1.ManagedService value) {
      copyOnWrite();
      instance.setServices(index, value);
      return this;
    }
    /**
     * <pre>
     * The results of the query.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
     */
    public Builder setServices(
        int index, com.google.api.servicemanagement.v1.ManagedService.Builder builderForValue) {
      copyOnWrite();
      instance.setServices(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * The results of the query.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
     */
    public Builder addServices(com.google.api.servicemanagement.v1.ManagedService value) {
      copyOnWrite();
      instance.addServices(value);
      return this;
    }
    /**
     * <pre>
     * The results of the query.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
     */
    public Builder addServices(
        int index, com.google.api.servicemanagement.v1.ManagedService value) {
      copyOnWrite();
      instance.addServices(index, value);
      return this;
    }
    /**
     * <pre>
     * The results of the query.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
     */
    public Builder addServices(
        com.google.api.servicemanagement.v1.ManagedService.Builder builderForValue) {
      copyOnWrite();
      instance.addServices(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The results of the query.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
     */
    public Builder addServices(
        int index, com.google.api.servicemanagement.v1.ManagedService.Builder builderForValue) {
      copyOnWrite();
      instance.addServices(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * The results of the query.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
     */
    public Builder addAllServices(
        java.lang.Iterable<? extends com.google.api.servicemanagement.v1.ManagedService> values) {
      copyOnWrite();
      instance.addAllServices(values);
      return this;
    }
    /**
     * <pre>
     * The results of the query.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
     */
    public Builder clearServices() {
      copyOnWrite();
      instance.clearServices();
      return this;
    }
    /**
     * <pre>
     * The results of the query.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
     */
    public Builder removeServices(int index) {
      copyOnWrite();
      instance.removeServices(index);
      return this;
    }

    /**
     * <pre>
     * Token that can be passed to `ListServices` to resume a paginated query.
     * </pre>
     *
     * <code>optional string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      return instance.getNextPageToken();
    }
    /**
     * <pre>
     * Token that can be passed to `ListServices` to resume a paginated query.
     * </pre>
     *
     * <code>optional string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      return instance.getNextPageTokenBytes();
    }
    /**
     * <pre>
     * Token that can be passed to `ListServices` to resume a paginated query.
     * </pre>
     *
     * <code>optional string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      copyOnWrite();
      instance.setNextPageToken(value);
      return this;
    }
    /**
     * <pre>
     * Token that can be passed to `ListServices` to resume a paginated query.
     * </pre>
     *
     * <code>optional string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      copyOnWrite();
      instance.clearNextPageToken();
      return this;
    }
    /**
     * <pre>
     * Token that can be passed to `ListServices` to resume a paginated query.
     * </pre>
     *
     * <code>optional string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNextPageTokenBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.ListServicesResponse)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.servicemanagement.v1.ListServicesResponse();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        services_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.google.api.servicemanagement.v1.ListServicesResponse other = (com.google.api.servicemanagement.v1.ListServicesResponse) arg1;
        services_= visitor.visitList(services_, other.services_);
        nextPageToken_ = visitor.visitString(!nextPageToken_.isEmpty(), nextPageToken_,
            !other.nextPageToken_.isEmpty(), other.nextPageToken_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
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
                if (!services_.isModifiable()) {
                  services_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(services_);
                }
                services_.add(
                    input.readMessage(com.google.api.servicemanagement.v1.ManagedService.parser(), extensionRegistry));
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                nextPageToken_ = s;
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
        if (PARSER == null) {    synchronized (com.google.api.servicemanagement.v1.ListServicesResponse.class) {
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


  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.ListServicesResponse)
  private static final com.google.api.servicemanagement.v1.ListServicesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListServicesResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.api.servicemanagement.v1.ListServicesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListServicesResponse> PARSER;

  public static com.google.protobuf.Parser<ListServicesResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

