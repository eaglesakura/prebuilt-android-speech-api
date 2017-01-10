// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package com.google.rpc;

/**
 * <pre>
 * Describes when the clients can retry a failed request. Clients could ignore
 * the recommendation here or retry when this information is missing from error
 * responses.
 * It's always recommended that clients should use exponential backoff when
 * retrying.
 * Clients should wait until `retry_delay` amount of time has passed since
 * receiving the error response before retrying.  If retrying requests also
 * fail, clients should use an exponential backoff scheme to gradually increase
 * the delay between retries based on `retry_delay`, until either a maximum
 * number of retires have been reached or a maximum retry delay cap has been
 * reached.
 * </pre>
 *
 * Protobuf type {@code google.rpc.RetryInfo}
 */
public  final class RetryInfo extends
    com.google.protobuf.GeneratedMessageLite<
        RetryInfo, RetryInfo.Builder> implements
    // @@protoc_insertion_point(message_implements:google.rpc.RetryInfo)
    RetryInfoOrBuilder {
  private RetryInfo() {
  }
  public static final int RETRY_DELAY_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration retryDelay_;
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
   */
  public boolean hasRetryDelay() {
    return retryDelay_ != null;
  }
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
   */
  public com.google.protobuf.Duration getRetryDelay() {
    return retryDelay_ == null ? com.google.protobuf.Duration.getDefaultInstance() : retryDelay_;
  }
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
   */
  private void setRetryDelay(com.google.protobuf.Duration value) {
    if (value == null) {
      throw new NullPointerException();
    }
    retryDelay_ = value;
    
    }
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
   */
  private void setRetryDelay(
      com.google.protobuf.Duration.Builder builderForValue) {
    retryDelay_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
   */
  private void mergeRetryDelay(com.google.protobuf.Duration value) {
    if (retryDelay_ != null &&
        retryDelay_ != com.google.protobuf.Duration.getDefaultInstance()) {
      retryDelay_ =
        com.google.protobuf.Duration.newBuilder(retryDelay_).mergeFrom(value).buildPartial();
    } else {
      retryDelay_ = value;
    }
    
  }
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
   */
  private void clearRetryDelay() {  retryDelay_ = null;
    
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (retryDelay_ != null) {
      output.writeMessage(1, getRetryDelay());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (retryDelay_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRetryDelay());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.rpc.RetryInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.rpc.RetryInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.rpc.RetryInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.rpc.RetryInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.rpc.RetryInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.rpc.RetryInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.rpc.RetryInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.rpc.RetryInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.rpc.RetryInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.rpc.RetryInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.rpc.RetryInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Describes when the clients can retry a failed request. Clients could ignore
   * the recommendation here or retry when this information is missing from error
   * responses.
   * It's always recommended that clients should use exponential backoff when
   * retrying.
   * Clients should wait until `retry_delay` amount of time has passed since
   * receiving the error response before retrying.  If retrying requests also
   * fail, clients should use an exponential backoff scheme to gradually increase
   * the delay between retries based on `retry_delay`, until either a maximum
   * number of retires have been reached or a maximum retry delay cap has been
   * reached.
   * </pre>
   *
   * Protobuf type {@code google.rpc.RetryInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.rpc.RetryInfo, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.rpc.RetryInfo)
      com.google.rpc.RetryInfoOrBuilder {
    // Construct using com.google.rpc.RetryInfo.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
     */
    public boolean hasRetryDelay() {
      return instance.hasRetryDelay();
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
     */
    public com.google.protobuf.Duration getRetryDelay() {
      return instance.getRetryDelay();
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
     */
    public Builder setRetryDelay(com.google.protobuf.Duration value) {
      copyOnWrite();
      instance.setRetryDelay(value);
      return this;
      }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
     */
    public Builder setRetryDelay(
        com.google.protobuf.Duration.Builder builderForValue) {
      copyOnWrite();
      instance.setRetryDelay(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
     */
    public Builder mergeRetryDelay(com.google.protobuf.Duration value) {
      copyOnWrite();
      instance.mergeRetryDelay(value);
      return this;
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>optional .google.protobuf.Duration retry_delay = 1;</code>
     */
    public Builder clearRetryDelay() {  copyOnWrite();
      instance.clearRetryDelay();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.rpc.RetryInfo)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.rpc.RetryInfo();
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
        com.google.rpc.RetryInfo other = (com.google.rpc.RetryInfo) arg1;
        retryDelay_ = visitor.visitMessage(retryDelay_, other.retryDelay_);
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
                com.google.protobuf.Duration.Builder subBuilder = null;
                if (retryDelay_ != null) {
                  subBuilder = retryDelay_.toBuilder();
                }
                retryDelay_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(retryDelay_);
                  retryDelay_ = subBuilder.buildPartial();
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
        if (PARSER == null) {    synchronized (com.google.rpc.RetryInfo.class) {
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


  // @@protoc_insertion_point(class_scope:google.rpc.RetryInfo)
  private static final com.google.rpc.RetryInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RetryInfo();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.rpc.RetryInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<RetryInfo> PARSER;

  public static com.google.protobuf.Parser<RetryInfo> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

