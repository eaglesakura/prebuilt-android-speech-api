// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/usage.proto

package com.google.api;

/**
 * <pre>
 * Usage configuration rules for the service.
 * NOTE: Under development.
 * Use this rule to configure unregistered calls for the service. Unregistered
 * calls are calls that do not contain consumer project identity.
 * (Example: calls that do not contain an API key).
 * By default, API methods do not allow unregistered calls, and each method call
 * must be identified by a consumer project identity. Use this rule to
 * allow/disallow unregistered calls.
 * Example of an API that wants to allow unregistered calls for entire service.
 *     usage:
 *       rules:
 *       - selector: "*"
 *         allow_unregistered_calls: true
 * Example of a method that wants to allow unregistered calls.
 *     usage:
 *       rules:
 *       - selector: "google.example.library.v1.LibraryService.CreateBook"
 *         allow_unregistered_calls: true
 * </pre>
 *
 * Protobuf type {@code google.api.UsageRule}
 */
public  final class UsageRule extends
    com.google.protobuf.GeneratedMessageLite<
        UsageRule, UsageRule.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.UsageRule)
    UsageRuleOrBuilder {
  private UsageRule() {
    selector_ = "";
  }
  public static final int SELECTOR_FIELD_NUMBER = 1;
  private java.lang.String selector_;
  /**
   * <pre>
   * Selects the methods to which this rule applies. Use '*' to indicate all
   * methods in all APIs.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>optional string selector = 1;</code>
   */
  public java.lang.String getSelector() {
    return selector_;
  }
  /**
   * <pre>
   * Selects the methods to which this rule applies. Use '*' to indicate all
   * methods in all APIs.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>optional string selector = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSelectorBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(selector_);
  }
  /**
   * <pre>
   * Selects the methods to which this rule applies. Use '*' to indicate all
   * methods in all APIs.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>optional string selector = 1;</code>
   */
  private void setSelector(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    selector_ = value;
  }
  /**
   * <pre>
   * Selects the methods to which this rule applies. Use '*' to indicate all
   * methods in all APIs.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>optional string selector = 1;</code>
   */
  private void clearSelector() {
    
    selector_ = getDefaultInstance().getSelector();
  }
  /**
   * <pre>
   * Selects the methods to which this rule applies. Use '*' to indicate all
   * methods in all APIs.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>optional string selector = 1;</code>
   */
  private void setSelectorBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    selector_ = value.toStringUtf8();
  }

  public static final int ALLOW_UNREGISTERED_CALLS_FIELD_NUMBER = 2;
  private boolean allowUnregisteredCalls_;
  /**
   * <pre>
   * True, if the method allows unregistered calls; false otherwise.
   * </pre>
   *
   * <code>optional bool allow_unregistered_calls = 2;</code>
   */
  public boolean getAllowUnregisteredCalls() {
    return allowUnregisteredCalls_;
  }
  /**
   * <pre>
   * True, if the method allows unregistered calls; false otherwise.
   * </pre>
   *
   * <code>optional bool allow_unregistered_calls = 2;</code>
   */
  private void setAllowUnregisteredCalls(boolean value) {
    
    allowUnregisteredCalls_ = value;
  }
  /**
   * <pre>
   * True, if the method allows unregistered calls; false otherwise.
   * </pre>
   *
   * <code>optional bool allow_unregistered_calls = 2;</code>
   */
  private void clearAllowUnregisteredCalls() {
    
    allowUnregisteredCalls_ = false;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!selector_.isEmpty()) {
      output.writeString(1, getSelector());
    }
    if (allowUnregisteredCalls_ != false) {
      output.writeBool(2, allowUnregisteredCalls_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!selector_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getSelector());
    }
    if (allowUnregisteredCalls_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, allowUnregisteredCalls_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.api.UsageRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.UsageRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.UsageRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.UsageRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.UsageRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.UsageRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.UsageRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.UsageRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.UsageRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.UsageRule parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.UsageRule prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Usage configuration rules for the service.
   * NOTE: Under development.
   * Use this rule to configure unregistered calls for the service. Unregistered
   * calls are calls that do not contain consumer project identity.
   * (Example: calls that do not contain an API key).
   * By default, API methods do not allow unregistered calls, and each method call
   * must be identified by a consumer project identity. Use this rule to
   * allow/disallow unregistered calls.
   * Example of an API that wants to allow unregistered calls for entire service.
   *     usage:
   *       rules:
   *       - selector: "*"
   *         allow_unregistered_calls: true
   * Example of a method that wants to allow unregistered calls.
   *     usage:
   *       rules:
   *       - selector: "google.example.library.v1.LibraryService.CreateBook"
   *         allow_unregistered_calls: true
   * </pre>
   *
   * Protobuf type {@code google.api.UsageRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.UsageRule, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.UsageRule)
      com.google.api.UsageRuleOrBuilder {
    // Construct using com.google.api.UsageRule.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Selects the methods to which this rule applies. Use '*' to indicate all
     * methods in all APIs.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>optional string selector = 1;</code>
     */
    public java.lang.String getSelector() {
      return instance.getSelector();
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies. Use '*' to indicate all
     * methods in all APIs.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>optional string selector = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSelectorBytes() {
      return instance.getSelectorBytes();
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies. Use '*' to indicate all
     * methods in all APIs.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>optional string selector = 1;</code>
     */
    public Builder setSelector(
        java.lang.String value) {
      copyOnWrite();
      instance.setSelector(value);
      return this;
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies. Use '*' to indicate all
     * methods in all APIs.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>optional string selector = 1;</code>
     */
    public Builder clearSelector() {
      copyOnWrite();
      instance.clearSelector();
      return this;
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies. Use '*' to indicate all
     * methods in all APIs.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>optional string selector = 1;</code>
     */
    public Builder setSelectorBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setSelectorBytes(value);
      return this;
    }

    /**
     * <pre>
     * True, if the method allows unregistered calls; false otherwise.
     * </pre>
     *
     * <code>optional bool allow_unregistered_calls = 2;</code>
     */
    public boolean getAllowUnregisteredCalls() {
      return instance.getAllowUnregisteredCalls();
    }
    /**
     * <pre>
     * True, if the method allows unregistered calls; false otherwise.
     * </pre>
     *
     * <code>optional bool allow_unregistered_calls = 2;</code>
     */
    public Builder setAllowUnregisteredCalls(boolean value) {
      copyOnWrite();
      instance.setAllowUnregisteredCalls(value);
      return this;
    }
    /**
     * <pre>
     * True, if the method allows unregistered calls; false otherwise.
     * </pre>
     *
     * <code>optional bool allow_unregistered_calls = 2;</code>
     */
    public Builder clearAllowUnregisteredCalls() {
      copyOnWrite();
      instance.clearAllowUnregisteredCalls();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.UsageRule)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.UsageRule();
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
        com.google.api.UsageRule other = (com.google.api.UsageRule) arg1;
        selector_ = visitor.visitString(!selector_.isEmpty(), selector_,
            !other.selector_.isEmpty(), other.selector_);
        allowUnregisteredCalls_ = visitor.visitBoolean(allowUnregisteredCalls_ != false, allowUnregisteredCalls_,
            other.allowUnregisteredCalls_ != false, other.allowUnregisteredCalls_);
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

                selector_ = s;
                break;
              }
              case 16: {

                allowUnregisteredCalls_ = input.readBool();
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
        if (PARSER == null) {    synchronized (com.google.api.UsageRule.class) {
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


  // @@protoc_insertion_point(class_scope:google.api.UsageRule)
  private static final com.google.api.UsageRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UsageRule();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.api.UsageRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UsageRule> PARSER;

  public static com.google.protobuf.Parser<UsageRule> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

