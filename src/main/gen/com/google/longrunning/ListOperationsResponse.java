// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/longrunning/operations.proto

package com.google.longrunning;

/**
 * <pre>
 * The response message for [Operations.ListOperations][google.longrunning.Operations.ListOperations].
 * </pre>
 *
 * Protobuf type {@code google.longrunning.ListOperationsResponse}
 */
public  final class ListOperationsResponse extends
    com.google.protobuf.GeneratedMessageLite<
        ListOperationsResponse, ListOperationsResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:google.longrunning.ListOperationsResponse)
    ListOperationsResponseOrBuilder {
  private ListOperationsResponse() {
    operations_ = emptyProtobufList();
    nextPageToken_ = "";
  }
  private int bitField0_;
  public static final int OPERATIONS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.google.longrunning.Operation> operations_;
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  public java.util.List<com.google.longrunning.Operation> getOperationsList() {
    return operations_;
  }
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  public java.util.List<? extends com.google.longrunning.OperationOrBuilder> 
      getOperationsOrBuilderList() {
    return operations_;
  }
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  public int getOperationsCount() {
    return operations_.size();
  }
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  public com.google.longrunning.Operation getOperations(int index) {
    return operations_.get(index);
  }
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  public com.google.longrunning.OperationOrBuilder getOperationsOrBuilder(
      int index) {
    return operations_.get(index);
  }
  private void ensureOperationsIsMutable() {
    if (!operations_.isModifiable()) {
      operations_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(operations_);
     }
  }

  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  private void setOperations(
      int index, com.google.longrunning.Operation value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureOperationsIsMutable();
    operations_.set(index, value);
  }
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  private void setOperations(
      int index, com.google.longrunning.Operation.Builder builderForValue) {
    ensureOperationsIsMutable();
    operations_.set(index, builderForValue.build());
  }
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  private void addOperations(com.google.longrunning.Operation value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureOperationsIsMutable();
    operations_.add(value);
  }
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  private void addOperations(
      int index, com.google.longrunning.Operation value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureOperationsIsMutable();
    operations_.add(index, value);
  }
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  private void addOperations(
      com.google.longrunning.Operation.Builder builderForValue) {
    ensureOperationsIsMutable();
    operations_.add(builderForValue.build());
  }
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  private void addOperations(
      int index, com.google.longrunning.Operation.Builder builderForValue) {
    ensureOperationsIsMutable();
    operations_.add(index, builderForValue.build());
  }
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  private void addAllOperations(
      java.lang.Iterable<? extends com.google.longrunning.Operation> values) {
    ensureOperationsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, operations_);
  }
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  private void clearOperations() {
    operations_ = emptyProtobufList();
  }
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  private void removeOperations(int index) {
    ensureOperationsIsMutable();
    operations_.remove(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private java.lang.String nextPageToken_;
  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken_;
  }
  /**
   * <pre>
   * The standard List next-page token.
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
   * The standard List next-page token.
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
   * The standard List next-page token.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  private void clearNextPageToken() {
    
    nextPageToken_ = getDefaultInstance().getNextPageToken();
  }
  /**
   * <pre>
   * The standard List next-page token.
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
    for (int i = 0; i < operations_.size(); i++) {
      output.writeMessage(1, operations_.get(i));
    }
    if (!nextPageToken_.isEmpty()) {
      output.writeString(2, getNextPageToken());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < operations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, operations_.get(i));
    }
    if (!nextPageToken_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getNextPageToken());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.longrunning.ListOperationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.longrunning.ListOperationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.longrunning.ListOperationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.longrunning.ListOperationsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * The response message for [Operations.ListOperations][google.longrunning.Operations.ListOperations].
   * </pre>
   *
   * Protobuf type {@code google.longrunning.ListOperationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.longrunning.ListOperationsResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.longrunning.ListOperationsResponse)
      com.google.longrunning.ListOperationsResponseOrBuilder {
    // Construct using com.google.longrunning.ListOperationsResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public java.util.List<com.google.longrunning.Operation> getOperationsList() {
      return java.util.Collections.unmodifiableList(
          instance.getOperationsList());
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public int getOperationsCount() {
      return instance.getOperationsCount();
    }/**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public com.google.longrunning.Operation getOperations(int index) {
      return instance.getOperations(index);
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder setOperations(
        int index, com.google.longrunning.Operation value) {
      copyOnWrite();
      instance.setOperations(index, value);
      return this;
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder setOperations(
        int index, com.google.longrunning.Operation.Builder builderForValue) {
      copyOnWrite();
      instance.setOperations(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder addOperations(com.google.longrunning.Operation value) {
      copyOnWrite();
      instance.addOperations(value);
      return this;
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder addOperations(
        int index, com.google.longrunning.Operation value) {
      copyOnWrite();
      instance.addOperations(index, value);
      return this;
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder addOperations(
        com.google.longrunning.Operation.Builder builderForValue) {
      copyOnWrite();
      instance.addOperations(builderForValue);
      return this;
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder addOperations(
        int index, com.google.longrunning.Operation.Builder builderForValue) {
      copyOnWrite();
      instance.addOperations(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder addAllOperations(
        java.lang.Iterable<? extends com.google.longrunning.Operation> values) {
      copyOnWrite();
      instance.addAllOperations(values);
      return this;
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder clearOperations() {
      copyOnWrite();
      instance.clearOperations();
      return this;
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder removeOperations(int index) {
      copyOnWrite();
      instance.removeOperations(index);
      return this;
    }

    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>optional string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      return instance.getNextPageToken();
    }
    /**
     * <pre>
     * The standard List next-page token.
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
     * The standard List next-page token.
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
     * The standard List next-page token.
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
     * The standard List next-page token.
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

    // @@protoc_insertion_point(builder_scope:google.longrunning.ListOperationsResponse)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.longrunning.ListOperationsResponse();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        operations_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.google.longrunning.ListOperationsResponse other = (com.google.longrunning.ListOperationsResponse) arg1;
        operations_= visitor.visitList(operations_, other.operations_);
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
                if (!operations_.isModifiable()) {
                  operations_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(operations_);
                }
                operations_.add(
                    input.readMessage(com.google.longrunning.Operation.parser(), extensionRegistry));
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
        if (PARSER == null) {    synchronized (com.google.longrunning.ListOperationsResponse.class) {
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


  // @@protoc_insertion_point(class_scope:google.longrunning.ListOperationsResponse)
  private static final com.google.longrunning.ListOperationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListOperationsResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.longrunning.ListOperationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListOperationsResponse> PARSER;

  public static com.google.protobuf.Parser<ListOperationsResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

