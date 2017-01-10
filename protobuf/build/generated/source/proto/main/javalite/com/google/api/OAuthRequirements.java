// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/auth.proto

package com.google.api;

/**
 * <pre>
 * OAuth scopes are a way to define data and permissions on data. For example,
 * there are scopes defined for "Read-only access to Google Calendar" and
 * "Access to Cloud Platform". Users can consent to a scope for an application,
 * giving it permission to access that data on their behalf.
 * OAuth scope specifications should be fairly coarse grained; a user will need
 * to see and understand the text description of what your scope means.
 * In most cases: use one or at most two OAuth scopes for an entire family of
 * products. If your product has multiple APIs, you should probably be sharing
 * the OAuth scope across all of those APIs.
 * When you need finer grained OAuth consent screens: talk with your product
 * management about how developers will use them in practice.
 * Please note that even though each of the canonical scopes is enough for a
 * request to be accepted and passed to the backend, a request can still fail
 * due to the backend requiring additional scopes or permissions.
 * </pre>
 *
 * Protobuf type {@code google.api.OAuthRequirements}
 */
public  final class OAuthRequirements extends
    com.google.protobuf.GeneratedMessageLite<
        OAuthRequirements, OAuthRequirements.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.OAuthRequirements)
    OAuthRequirementsOrBuilder {
  private OAuthRequirements() {
    canonicalScopes_ = "";
  }
  public static final int CANONICAL_SCOPES_FIELD_NUMBER = 1;
  private java.lang.String canonicalScopes_;
  /**
   * <pre>
   * The list of publicly documented OAuth scopes that are allowed access. An
   * OAuth token containing any of these scopes will be accepted.
   * Example:
   *      canonical_scopes: https://www.googleapis.com/auth/calendar,
   *                        https://www.googleapis.com/auth/calendar.read
   * </pre>
   *
   * <code>optional string canonical_scopes = 1;</code>
   */
  public java.lang.String getCanonicalScopes() {
    return canonicalScopes_;
  }
  /**
   * <pre>
   * The list of publicly documented OAuth scopes that are allowed access. An
   * OAuth token containing any of these scopes will be accepted.
   * Example:
   *      canonical_scopes: https://www.googleapis.com/auth/calendar,
   *                        https://www.googleapis.com/auth/calendar.read
   * </pre>
   *
   * <code>optional string canonical_scopes = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCanonicalScopesBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(canonicalScopes_);
  }
  /**
   * <pre>
   * The list of publicly documented OAuth scopes that are allowed access. An
   * OAuth token containing any of these scopes will be accepted.
   * Example:
   *      canonical_scopes: https://www.googleapis.com/auth/calendar,
   *                        https://www.googleapis.com/auth/calendar.read
   * </pre>
   *
   * <code>optional string canonical_scopes = 1;</code>
   */
  private void setCanonicalScopes(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    canonicalScopes_ = value;
  }
  /**
   * <pre>
   * The list of publicly documented OAuth scopes that are allowed access. An
   * OAuth token containing any of these scopes will be accepted.
   * Example:
   *      canonical_scopes: https://www.googleapis.com/auth/calendar,
   *                        https://www.googleapis.com/auth/calendar.read
   * </pre>
   *
   * <code>optional string canonical_scopes = 1;</code>
   */
  private void clearCanonicalScopes() {
    
    canonicalScopes_ = getDefaultInstance().getCanonicalScopes();
  }
  /**
   * <pre>
   * The list of publicly documented OAuth scopes that are allowed access. An
   * OAuth token containing any of these scopes will be accepted.
   * Example:
   *      canonical_scopes: https://www.googleapis.com/auth/calendar,
   *                        https://www.googleapis.com/auth/calendar.read
   * </pre>
   *
   * <code>optional string canonical_scopes = 1;</code>
   */
  private void setCanonicalScopesBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    canonicalScopes_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!canonicalScopes_.isEmpty()) {
      output.writeString(1, getCanonicalScopes());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!canonicalScopes_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getCanonicalScopes());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.api.OAuthRequirements parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.OAuthRequirements parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.OAuthRequirements parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.OAuthRequirements parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.OAuthRequirements parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.OAuthRequirements parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.OAuthRequirements parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.OAuthRequirements parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.OAuthRequirements parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.OAuthRequirements parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.OAuthRequirements prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * OAuth scopes are a way to define data and permissions on data. For example,
   * there are scopes defined for "Read-only access to Google Calendar" and
   * "Access to Cloud Platform". Users can consent to a scope for an application,
   * giving it permission to access that data on their behalf.
   * OAuth scope specifications should be fairly coarse grained; a user will need
   * to see and understand the text description of what your scope means.
   * In most cases: use one or at most two OAuth scopes for an entire family of
   * products. If your product has multiple APIs, you should probably be sharing
   * the OAuth scope across all of those APIs.
   * When you need finer grained OAuth consent screens: talk with your product
   * management about how developers will use them in practice.
   * Please note that even though each of the canonical scopes is enough for a
   * request to be accepted and passed to the backend, a request can still fail
   * due to the backend requiring additional scopes or permissions.
   * </pre>
   *
   * Protobuf type {@code google.api.OAuthRequirements}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.OAuthRequirements, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.OAuthRequirements)
      com.google.api.OAuthRequirementsOrBuilder {
    // Construct using com.google.api.OAuthRequirements.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The list of publicly documented OAuth scopes that are allowed access. An
     * OAuth token containing any of these scopes will be accepted.
     * Example:
     *      canonical_scopes: https://www.googleapis.com/auth/calendar,
     *                        https://www.googleapis.com/auth/calendar.read
     * </pre>
     *
     * <code>optional string canonical_scopes = 1;</code>
     */
    public java.lang.String getCanonicalScopes() {
      return instance.getCanonicalScopes();
    }
    /**
     * <pre>
     * The list of publicly documented OAuth scopes that are allowed access. An
     * OAuth token containing any of these scopes will be accepted.
     * Example:
     *      canonical_scopes: https://www.googleapis.com/auth/calendar,
     *                        https://www.googleapis.com/auth/calendar.read
     * </pre>
     *
     * <code>optional string canonical_scopes = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCanonicalScopesBytes() {
      return instance.getCanonicalScopesBytes();
    }
    /**
     * <pre>
     * The list of publicly documented OAuth scopes that are allowed access. An
     * OAuth token containing any of these scopes will be accepted.
     * Example:
     *      canonical_scopes: https://www.googleapis.com/auth/calendar,
     *                        https://www.googleapis.com/auth/calendar.read
     * </pre>
     *
     * <code>optional string canonical_scopes = 1;</code>
     */
    public Builder setCanonicalScopes(
        java.lang.String value) {
      copyOnWrite();
      instance.setCanonicalScopes(value);
      return this;
    }
    /**
     * <pre>
     * The list of publicly documented OAuth scopes that are allowed access. An
     * OAuth token containing any of these scopes will be accepted.
     * Example:
     *      canonical_scopes: https://www.googleapis.com/auth/calendar,
     *                        https://www.googleapis.com/auth/calendar.read
     * </pre>
     *
     * <code>optional string canonical_scopes = 1;</code>
     */
    public Builder clearCanonicalScopes() {
      copyOnWrite();
      instance.clearCanonicalScopes();
      return this;
    }
    /**
     * <pre>
     * The list of publicly documented OAuth scopes that are allowed access. An
     * OAuth token containing any of these scopes will be accepted.
     * Example:
     *      canonical_scopes: https://www.googleapis.com/auth/calendar,
     *                        https://www.googleapis.com/auth/calendar.read
     * </pre>
     *
     * <code>optional string canonical_scopes = 1;</code>
     */
    public Builder setCanonicalScopesBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCanonicalScopesBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.OAuthRequirements)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.OAuthRequirements();
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
        com.google.api.OAuthRequirements other = (com.google.api.OAuthRequirements) arg1;
        canonicalScopes_ = visitor.visitString(!canonicalScopes_.isEmpty(), canonicalScopes_,
            !other.canonicalScopes_.isEmpty(), other.canonicalScopes_);
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

                canonicalScopes_ = s;
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
        if (PARSER == null) {    synchronized (com.google.api.OAuthRequirements.class) {
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


  // @@protoc_insertion_point(class_scope:google.api.OAuthRequirements)
  private static final com.google.api.OAuthRequirements DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new OAuthRequirements();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.api.OAuthRequirements getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<OAuthRequirements> PARSER;

  public static com.google.protobuf.Parser<OAuthRequirements> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

