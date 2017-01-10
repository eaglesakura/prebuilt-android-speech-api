// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/system_parameter.proto

package com.google.api;

/**
 * <pre>
 * Define a parameter's name and location. The parameter may be passed as either
 * an HTTP header or a URL query parameter, and if both are passed the behavior
 * is implementation-dependent.
 * </pre>
 *
 * Protobuf type {@code google.api.SystemParameter}
 */
public  final class SystemParameter extends
    com.google.protobuf.GeneratedMessageLite<
        SystemParameter, SystemParameter.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.SystemParameter)
    SystemParameterOrBuilder {
  private SystemParameter() {
    name_ = "";
    httpHeader_ = "";
    urlQueryParameter_ = "";
  }
  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.String name_;
  /**
   * <pre>
   * Define the name of the parameter, such as "api_key" . It is case sensitive.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * Define the name of the parameter, such as "api_key" . It is case sensitive.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * Define the name of the parameter, such as "api_key" . It is case sensitive.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  private void setName(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    name_ = value;
  }
  /**
   * <pre>
   * Define the name of the parameter, such as "api_key" . It is case sensitive.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  private void clearName() {
    
    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * Define the name of the parameter, such as "api_key" . It is case sensitive.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    name_ = value.toStringUtf8();
  }

  public static final int HTTP_HEADER_FIELD_NUMBER = 2;
  private java.lang.String httpHeader_;
  /**
   * <pre>
   * Define the HTTP header name to use for the parameter. It is case
   * insensitive.
   * </pre>
   *
   * <code>optional string http_header = 2;</code>
   */
  public java.lang.String getHttpHeader() {
    return httpHeader_;
  }
  /**
   * <pre>
   * Define the HTTP header name to use for the parameter. It is case
   * insensitive.
   * </pre>
   *
   * <code>optional string http_header = 2;</code>
   */
  public com.google.protobuf.ByteString
      getHttpHeaderBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(httpHeader_);
  }
  /**
   * <pre>
   * Define the HTTP header name to use for the parameter. It is case
   * insensitive.
   * </pre>
   *
   * <code>optional string http_header = 2;</code>
   */
  private void setHttpHeader(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    httpHeader_ = value;
  }
  /**
   * <pre>
   * Define the HTTP header name to use for the parameter. It is case
   * insensitive.
   * </pre>
   *
   * <code>optional string http_header = 2;</code>
   */
  private void clearHttpHeader() {
    
    httpHeader_ = getDefaultInstance().getHttpHeader();
  }
  /**
   * <pre>
   * Define the HTTP header name to use for the parameter. It is case
   * insensitive.
   * </pre>
   *
   * <code>optional string http_header = 2;</code>
   */
  private void setHttpHeaderBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    httpHeader_ = value.toStringUtf8();
  }

  public static final int URL_QUERY_PARAMETER_FIELD_NUMBER = 3;
  private java.lang.String urlQueryParameter_;
  /**
   * <pre>
   * Define the URL query parameter name to use for the parameter. It is case
   * sensitive.
   * </pre>
   *
   * <code>optional string url_query_parameter = 3;</code>
   */
  public java.lang.String getUrlQueryParameter() {
    return urlQueryParameter_;
  }
  /**
   * <pre>
   * Define the URL query parameter name to use for the parameter. It is case
   * sensitive.
   * </pre>
   *
   * <code>optional string url_query_parameter = 3;</code>
   */
  public com.google.protobuf.ByteString
      getUrlQueryParameterBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(urlQueryParameter_);
  }
  /**
   * <pre>
   * Define the URL query parameter name to use for the parameter. It is case
   * sensitive.
   * </pre>
   *
   * <code>optional string url_query_parameter = 3;</code>
   */
  private void setUrlQueryParameter(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    urlQueryParameter_ = value;
  }
  /**
   * <pre>
   * Define the URL query parameter name to use for the parameter. It is case
   * sensitive.
   * </pre>
   *
   * <code>optional string url_query_parameter = 3;</code>
   */
  private void clearUrlQueryParameter() {
    
    urlQueryParameter_ = getDefaultInstance().getUrlQueryParameter();
  }
  /**
   * <pre>
   * Define the URL query parameter name to use for the parameter. It is case
   * sensitive.
   * </pre>
   *
   * <code>optional string url_query_parameter = 3;</code>
   */
  private void setUrlQueryParameterBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    urlQueryParameter_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!name_.isEmpty()) {
      output.writeString(1, getName());
    }
    if (!httpHeader_.isEmpty()) {
      output.writeString(2, getHttpHeader());
    }
    if (!urlQueryParameter_.isEmpty()) {
      output.writeString(3, getUrlQueryParameter());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!name_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getName());
    }
    if (!httpHeader_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getHttpHeader());
    }
    if (!urlQueryParameter_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getUrlQueryParameter());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.api.SystemParameter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.SystemParameter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.SystemParameter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.SystemParameter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.SystemParameter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.SystemParameter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.SystemParameter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.SystemParameter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.SystemParameter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.SystemParameter parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.SystemParameter prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Define a parameter's name and location. The parameter may be passed as either
   * an HTTP header or a URL query parameter, and if both are passed the behavior
   * is implementation-dependent.
   * </pre>
   *
   * Protobuf type {@code google.api.SystemParameter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.SystemParameter, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.SystemParameter)
      com.google.api.SystemParameterOrBuilder {
    // Construct using com.google.api.SystemParameter.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Define the name of the parameter, such as "api_key" . It is case sensitive.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * Define the name of the parameter, such as "api_key" . It is case sensitive.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * Define the name of the parameter, such as "api_key" . It is case sensitive.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * Define the name of the parameter, such as "api_key" . It is case sensitive.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * Define the name of the parameter, such as "api_key" . It is case sensitive.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * Define the HTTP header name to use for the parameter. It is case
     * insensitive.
     * </pre>
     *
     * <code>optional string http_header = 2;</code>
     */
    public java.lang.String getHttpHeader() {
      return instance.getHttpHeader();
    }
    /**
     * <pre>
     * Define the HTTP header name to use for the parameter. It is case
     * insensitive.
     * </pre>
     *
     * <code>optional string http_header = 2;</code>
     */
    public com.google.protobuf.ByteString
        getHttpHeaderBytes() {
      return instance.getHttpHeaderBytes();
    }
    /**
     * <pre>
     * Define the HTTP header name to use for the parameter. It is case
     * insensitive.
     * </pre>
     *
     * <code>optional string http_header = 2;</code>
     */
    public Builder setHttpHeader(
        java.lang.String value) {
      copyOnWrite();
      instance.setHttpHeader(value);
      return this;
    }
    /**
     * <pre>
     * Define the HTTP header name to use for the parameter. It is case
     * insensitive.
     * </pre>
     *
     * <code>optional string http_header = 2;</code>
     */
    public Builder clearHttpHeader() {
      copyOnWrite();
      instance.clearHttpHeader();
      return this;
    }
    /**
     * <pre>
     * Define the HTTP header name to use for the parameter. It is case
     * insensitive.
     * </pre>
     *
     * <code>optional string http_header = 2;</code>
     */
    public Builder setHttpHeaderBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setHttpHeaderBytes(value);
      return this;
    }

    /**
     * <pre>
     * Define the URL query parameter name to use for the parameter. It is case
     * sensitive.
     * </pre>
     *
     * <code>optional string url_query_parameter = 3;</code>
     */
    public java.lang.String getUrlQueryParameter() {
      return instance.getUrlQueryParameter();
    }
    /**
     * <pre>
     * Define the URL query parameter name to use for the parameter. It is case
     * sensitive.
     * </pre>
     *
     * <code>optional string url_query_parameter = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUrlQueryParameterBytes() {
      return instance.getUrlQueryParameterBytes();
    }
    /**
     * <pre>
     * Define the URL query parameter name to use for the parameter. It is case
     * sensitive.
     * </pre>
     *
     * <code>optional string url_query_parameter = 3;</code>
     */
    public Builder setUrlQueryParameter(
        java.lang.String value) {
      copyOnWrite();
      instance.setUrlQueryParameter(value);
      return this;
    }
    /**
     * <pre>
     * Define the URL query parameter name to use for the parameter. It is case
     * sensitive.
     * </pre>
     *
     * <code>optional string url_query_parameter = 3;</code>
     */
    public Builder clearUrlQueryParameter() {
      copyOnWrite();
      instance.clearUrlQueryParameter();
      return this;
    }
    /**
     * <pre>
     * Define the URL query parameter name to use for the parameter. It is case
     * sensitive.
     * </pre>
     *
     * <code>optional string url_query_parameter = 3;</code>
     */
    public Builder setUrlQueryParameterBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUrlQueryParameterBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.SystemParameter)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.SystemParameter();
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
        com.google.api.SystemParameter other = (com.google.api.SystemParameter) arg1;
        name_ = visitor.visitString(!name_.isEmpty(), name_,
            !other.name_.isEmpty(), other.name_);
        httpHeader_ = visitor.visitString(!httpHeader_.isEmpty(), httpHeader_,
            !other.httpHeader_.isEmpty(), other.httpHeader_);
        urlQueryParameter_ = visitor.visitString(!urlQueryParameter_.isEmpty(), urlQueryParameter_,
            !other.urlQueryParameter_.isEmpty(), other.urlQueryParameter_);
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

                name_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                httpHeader_ = s;
                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                urlQueryParameter_ = s;
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
        if (PARSER == null) {    synchronized (com.google.api.SystemParameter.class) {
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


  // @@protoc_insertion_point(class_scope:google.api.SystemParameter)
  private static final com.google.api.SystemParameter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SystemParameter();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.api.SystemParameter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SystemParameter> PARSER;

  public static com.google.protobuf.Parser<SystemParameter> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
