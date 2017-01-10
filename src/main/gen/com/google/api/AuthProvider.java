// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/auth.proto

package com.google.api;

/**
 * <pre>
 * Configuration for an anthentication provider, including support for
 * [JSON Web Token (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
 * </pre>
 *
 * Protobuf type {@code google.api.AuthProvider}
 */
public  final class AuthProvider extends
    com.google.protobuf.GeneratedMessageLite<
        AuthProvider, AuthProvider.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.AuthProvider)
    AuthProviderOrBuilder {
  private AuthProvider() {
    id_ = "";
    issuer_ = "";
    jwksUri_ = "";
    audiences_ = "";
  }
  public static final int ID_FIELD_NUMBER = 1;
  private java.lang.String id_;
  /**
   * <pre>
   * The unique identifier of the auth provider. It will be referred to by
   * `AuthRequirement.provider_id`.
   * Example: "bookstore_auth".
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  public java.lang.String getId() {
    return id_;
  }
  /**
   * <pre>
   * The unique identifier of the auth provider. It will be referred to by
   * `AuthRequirement.provider_id`.
   * Example: "bookstore_auth".
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(id_);
  }
  /**
   * <pre>
   * The unique identifier of the auth provider. It will be referred to by
   * `AuthRequirement.provider_id`.
   * Example: "bookstore_auth".
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  private void setId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    id_ = value;
  }
  /**
   * <pre>
   * The unique identifier of the auth provider. It will be referred to by
   * `AuthRequirement.provider_id`.
   * Example: "bookstore_auth".
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  private void clearId() {
    
    id_ = getDefaultInstance().getId();
  }
  /**
   * <pre>
   * The unique identifier of the auth provider. It will be referred to by
   * `AuthRequirement.provider_id`.
   * Example: "bookstore_auth".
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  private void setIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    id_ = value.toStringUtf8();
  }

  public static final int ISSUER_FIELD_NUMBER = 2;
  private java.lang.String issuer_;
  /**
   * <pre>
   * Identifies the principal that issued the JWT. See
   * https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1
   * Usually a URL or an email address.
   * Example: https://securetoken.google.com
   * Example: 1234567-compute&#64;developer.gserviceaccount.com
   * </pre>
   *
   * <code>optional string issuer = 2;</code>
   */
  public java.lang.String getIssuer() {
    return issuer_;
  }
  /**
   * <pre>
   * Identifies the principal that issued the JWT. See
   * https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1
   * Usually a URL or an email address.
   * Example: https://securetoken.google.com
   * Example: 1234567-compute&#64;developer.gserviceaccount.com
   * </pre>
   *
   * <code>optional string issuer = 2;</code>
   */
  public com.google.protobuf.ByteString
      getIssuerBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(issuer_);
  }
  /**
   * <pre>
   * Identifies the principal that issued the JWT. See
   * https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1
   * Usually a URL or an email address.
   * Example: https://securetoken.google.com
   * Example: 1234567-compute&#64;developer.gserviceaccount.com
   * </pre>
   *
   * <code>optional string issuer = 2;</code>
   */
  private void setIssuer(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    issuer_ = value;
  }
  /**
   * <pre>
   * Identifies the principal that issued the JWT. See
   * https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1
   * Usually a URL or an email address.
   * Example: https://securetoken.google.com
   * Example: 1234567-compute&#64;developer.gserviceaccount.com
   * </pre>
   *
   * <code>optional string issuer = 2;</code>
   */
  private void clearIssuer() {
    
    issuer_ = getDefaultInstance().getIssuer();
  }
  /**
   * <pre>
   * Identifies the principal that issued the JWT. See
   * https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1
   * Usually a URL or an email address.
   * Example: https://securetoken.google.com
   * Example: 1234567-compute&#64;developer.gserviceaccount.com
   * </pre>
   *
   * <code>optional string issuer = 2;</code>
   */
  private void setIssuerBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    issuer_ = value.toStringUtf8();
  }

  public static final int JWKS_URI_FIELD_NUMBER = 3;
  private java.lang.String jwksUri_;
  /**
   * <pre>
   * URL of the provider's public key set to validate signature of the JWT. See
   * [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata).
   * Optional if the key set document:
   *  - can be retrieved from
   *    [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html
   *    of the issuer.
   *  - can be inferred from the email domain of the issuer (e.g. a Google service account).
   * Example: https://www.googleapis.com/oauth2/v1/certs
   * </pre>
   *
   * <code>optional string jwks_uri = 3;</code>
   */
  public java.lang.String getJwksUri() {
    return jwksUri_;
  }
  /**
   * <pre>
   * URL of the provider's public key set to validate signature of the JWT. See
   * [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata).
   * Optional if the key set document:
   *  - can be retrieved from
   *    [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html
   *    of the issuer.
   *  - can be inferred from the email domain of the issuer (e.g. a Google service account).
   * Example: https://www.googleapis.com/oauth2/v1/certs
   * </pre>
   *
   * <code>optional string jwks_uri = 3;</code>
   */
  public com.google.protobuf.ByteString
      getJwksUriBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(jwksUri_);
  }
  /**
   * <pre>
   * URL of the provider's public key set to validate signature of the JWT. See
   * [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata).
   * Optional if the key set document:
   *  - can be retrieved from
   *    [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html
   *    of the issuer.
   *  - can be inferred from the email domain of the issuer (e.g. a Google service account).
   * Example: https://www.googleapis.com/oauth2/v1/certs
   * </pre>
   *
   * <code>optional string jwks_uri = 3;</code>
   */
  private void setJwksUri(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    jwksUri_ = value;
  }
  /**
   * <pre>
   * URL of the provider's public key set to validate signature of the JWT. See
   * [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata).
   * Optional if the key set document:
   *  - can be retrieved from
   *    [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html
   *    of the issuer.
   *  - can be inferred from the email domain of the issuer (e.g. a Google service account).
   * Example: https://www.googleapis.com/oauth2/v1/certs
   * </pre>
   *
   * <code>optional string jwks_uri = 3;</code>
   */
  private void clearJwksUri() {
    
    jwksUri_ = getDefaultInstance().getJwksUri();
  }
  /**
   * <pre>
   * URL of the provider's public key set to validate signature of the JWT. See
   * [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata).
   * Optional if the key set document:
   *  - can be retrieved from
   *    [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html
   *    of the issuer.
   *  - can be inferred from the email domain of the issuer (e.g. a Google service account).
   * Example: https://www.googleapis.com/oauth2/v1/certs
   * </pre>
   *
   * <code>optional string jwks_uri = 3;</code>
   */
  private void setJwksUriBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    jwksUri_ = value.toStringUtf8();
  }

  public static final int AUDIENCES_FIELD_NUMBER = 4;
  private java.lang.String audiences_;
  /**
   * <pre>
   * The list of JWT
   * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
   * that are allowed to access. A JWT containing any of these audiences will
   * be accepted. When this setting is absent, only JWTs with audience
   * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
   * will be accepted. For example, if no audiences are in the setting,
   * LibraryService API will only accept JWTs with the following audience
   * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
   * Example:
   *     audiences: bookstore_android.apps.googleusercontent.com,
   *                bookstore_web.apps.googleusercontent.com
   * </pre>
   *
   * <code>optional string audiences = 4;</code>
   */
  public java.lang.String getAudiences() {
    return audiences_;
  }
  /**
   * <pre>
   * The list of JWT
   * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
   * that are allowed to access. A JWT containing any of these audiences will
   * be accepted. When this setting is absent, only JWTs with audience
   * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
   * will be accepted. For example, if no audiences are in the setting,
   * LibraryService API will only accept JWTs with the following audience
   * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
   * Example:
   *     audiences: bookstore_android.apps.googleusercontent.com,
   *                bookstore_web.apps.googleusercontent.com
   * </pre>
   *
   * <code>optional string audiences = 4;</code>
   */
  public com.google.protobuf.ByteString
      getAudiencesBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(audiences_);
  }
  /**
   * <pre>
   * The list of JWT
   * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
   * that are allowed to access. A JWT containing any of these audiences will
   * be accepted. When this setting is absent, only JWTs with audience
   * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
   * will be accepted. For example, if no audiences are in the setting,
   * LibraryService API will only accept JWTs with the following audience
   * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
   * Example:
   *     audiences: bookstore_android.apps.googleusercontent.com,
   *                bookstore_web.apps.googleusercontent.com
   * </pre>
   *
   * <code>optional string audiences = 4;</code>
   */
  private void setAudiences(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    audiences_ = value;
  }
  /**
   * <pre>
   * The list of JWT
   * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
   * that are allowed to access. A JWT containing any of these audiences will
   * be accepted. When this setting is absent, only JWTs with audience
   * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
   * will be accepted. For example, if no audiences are in the setting,
   * LibraryService API will only accept JWTs with the following audience
   * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
   * Example:
   *     audiences: bookstore_android.apps.googleusercontent.com,
   *                bookstore_web.apps.googleusercontent.com
   * </pre>
   *
   * <code>optional string audiences = 4;</code>
   */
  private void clearAudiences() {
    
    audiences_ = getDefaultInstance().getAudiences();
  }
  /**
   * <pre>
   * The list of JWT
   * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
   * that are allowed to access. A JWT containing any of these audiences will
   * be accepted. When this setting is absent, only JWTs with audience
   * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
   * will be accepted. For example, if no audiences are in the setting,
   * LibraryService API will only accept JWTs with the following audience
   * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
   * Example:
   *     audiences: bookstore_android.apps.googleusercontent.com,
   *                bookstore_web.apps.googleusercontent.com
   * </pre>
   *
   * <code>optional string audiences = 4;</code>
   */
  private void setAudiencesBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    audiences_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!id_.isEmpty()) {
      output.writeString(1, getId());
    }
    if (!issuer_.isEmpty()) {
      output.writeString(2, getIssuer());
    }
    if (!jwksUri_.isEmpty()) {
      output.writeString(3, getJwksUri());
    }
    if (!audiences_.isEmpty()) {
      output.writeString(4, getAudiences());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!id_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getId());
    }
    if (!issuer_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getIssuer());
    }
    if (!jwksUri_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getJwksUri());
    }
    if (!audiences_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getAudiences());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.api.AuthProvider parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.AuthProvider parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.AuthProvider parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.AuthProvider parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.AuthProvider parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.AuthProvider parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.AuthProvider parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.AuthProvider parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.AuthProvider parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.AuthProvider parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.AuthProvider prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Configuration for an anthentication provider, including support for
   * [JSON Web Token (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
   * </pre>
   *
   * Protobuf type {@code google.api.AuthProvider}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.AuthProvider, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.AuthProvider)
      com.google.api.AuthProviderOrBuilder {
    // Construct using com.google.api.AuthProvider.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The unique identifier of the auth provider. It will be referred to by
     * `AuthRequirement.provider_id`.
     * Example: "bookstore_auth".
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public java.lang.String getId() {
      return instance.getId();
    }
    /**
     * <pre>
     * The unique identifier of the auth provider. It will be referred to by
     * `AuthRequirement.provider_id`.
     * Example: "bookstore_auth".
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      return instance.getIdBytes();
    }
    /**
     * <pre>
     * The unique identifier of the auth provider. It will be referred to by
     * `AuthRequirement.provider_id`.
     * Example: "bookstore_auth".
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public Builder setId(
        java.lang.String value) {
      copyOnWrite();
      instance.setId(value);
      return this;
    }
    /**
     * <pre>
     * The unique identifier of the auth provider. It will be referred to by
     * `AuthRequirement.provider_id`.
     * Example: "bookstore_auth".
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public Builder clearId() {
      copyOnWrite();
      instance.clearId();
      return this;
    }
    /**
     * <pre>
     * The unique identifier of the auth provider. It will be referred to by
     * `AuthRequirement.provider_id`.
     * Example: "bookstore_auth".
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * Identifies the principal that issued the JWT. See
     * https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1
     * Usually a URL or an email address.
     * Example: https://securetoken.google.com
     * Example: 1234567-compute&#64;developer.gserviceaccount.com
     * </pre>
     *
     * <code>optional string issuer = 2;</code>
     */
    public java.lang.String getIssuer() {
      return instance.getIssuer();
    }
    /**
     * <pre>
     * Identifies the principal that issued the JWT. See
     * https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1
     * Usually a URL or an email address.
     * Example: https://securetoken.google.com
     * Example: 1234567-compute&#64;developer.gserviceaccount.com
     * </pre>
     *
     * <code>optional string issuer = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIssuerBytes() {
      return instance.getIssuerBytes();
    }
    /**
     * <pre>
     * Identifies the principal that issued the JWT. See
     * https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1
     * Usually a URL or an email address.
     * Example: https://securetoken.google.com
     * Example: 1234567-compute&#64;developer.gserviceaccount.com
     * </pre>
     *
     * <code>optional string issuer = 2;</code>
     */
    public Builder setIssuer(
        java.lang.String value) {
      copyOnWrite();
      instance.setIssuer(value);
      return this;
    }
    /**
     * <pre>
     * Identifies the principal that issued the JWT. See
     * https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1
     * Usually a URL or an email address.
     * Example: https://securetoken.google.com
     * Example: 1234567-compute&#64;developer.gserviceaccount.com
     * </pre>
     *
     * <code>optional string issuer = 2;</code>
     */
    public Builder clearIssuer() {
      copyOnWrite();
      instance.clearIssuer();
      return this;
    }
    /**
     * <pre>
     * Identifies the principal that issued the JWT. See
     * https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1
     * Usually a URL or an email address.
     * Example: https://securetoken.google.com
     * Example: 1234567-compute&#64;developer.gserviceaccount.com
     * </pre>
     *
     * <code>optional string issuer = 2;</code>
     */
    public Builder setIssuerBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setIssuerBytes(value);
      return this;
    }

    /**
     * <pre>
     * URL of the provider's public key set to validate signature of the JWT. See
     * [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata).
     * Optional if the key set document:
     *  - can be retrieved from
     *    [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html
     *    of the issuer.
     *  - can be inferred from the email domain of the issuer (e.g. a Google service account).
     * Example: https://www.googleapis.com/oauth2/v1/certs
     * </pre>
     *
     * <code>optional string jwks_uri = 3;</code>
     */
    public java.lang.String getJwksUri() {
      return instance.getJwksUri();
    }
    /**
     * <pre>
     * URL of the provider's public key set to validate signature of the JWT. See
     * [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata).
     * Optional if the key set document:
     *  - can be retrieved from
     *    [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html
     *    of the issuer.
     *  - can be inferred from the email domain of the issuer (e.g. a Google service account).
     * Example: https://www.googleapis.com/oauth2/v1/certs
     * </pre>
     *
     * <code>optional string jwks_uri = 3;</code>
     */
    public com.google.protobuf.ByteString
        getJwksUriBytes() {
      return instance.getJwksUriBytes();
    }
    /**
     * <pre>
     * URL of the provider's public key set to validate signature of the JWT. See
     * [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata).
     * Optional if the key set document:
     *  - can be retrieved from
     *    [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html
     *    of the issuer.
     *  - can be inferred from the email domain of the issuer (e.g. a Google service account).
     * Example: https://www.googleapis.com/oauth2/v1/certs
     * </pre>
     *
     * <code>optional string jwks_uri = 3;</code>
     */
    public Builder setJwksUri(
        java.lang.String value) {
      copyOnWrite();
      instance.setJwksUri(value);
      return this;
    }
    /**
     * <pre>
     * URL of the provider's public key set to validate signature of the JWT. See
     * [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata).
     * Optional if the key set document:
     *  - can be retrieved from
     *    [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html
     *    of the issuer.
     *  - can be inferred from the email domain of the issuer (e.g. a Google service account).
     * Example: https://www.googleapis.com/oauth2/v1/certs
     * </pre>
     *
     * <code>optional string jwks_uri = 3;</code>
     */
    public Builder clearJwksUri() {
      copyOnWrite();
      instance.clearJwksUri();
      return this;
    }
    /**
     * <pre>
     * URL of the provider's public key set to validate signature of the JWT. See
     * [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata).
     * Optional if the key set document:
     *  - can be retrieved from
     *    [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html
     *    of the issuer.
     *  - can be inferred from the email domain of the issuer (e.g. a Google service account).
     * Example: https://www.googleapis.com/oauth2/v1/certs
     * </pre>
     *
     * <code>optional string jwks_uri = 3;</code>
     */
    public Builder setJwksUriBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setJwksUriBytes(value);
      return this;
    }

    /**
     * <pre>
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>optional string audiences = 4;</code>
     */
    public java.lang.String getAudiences() {
      return instance.getAudiences();
    }
    /**
     * <pre>
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>optional string audiences = 4;</code>
     */
    public com.google.protobuf.ByteString
        getAudiencesBytes() {
      return instance.getAudiencesBytes();
    }
    /**
     * <pre>
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>optional string audiences = 4;</code>
     */
    public Builder setAudiences(
        java.lang.String value) {
      copyOnWrite();
      instance.setAudiences(value);
      return this;
    }
    /**
     * <pre>
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>optional string audiences = 4;</code>
     */
    public Builder clearAudiences() {
      copyOnWrite();
      instance.clearAudiences();
      return this;
    }
    /**
     * <pre>
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>optional string audiences = 4;</code>
     */
    public Builder setAudiencesBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAudiencesBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.AuthProvider)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.AuthProvider();
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
        com.google.api.AuthProvider other = (com.google.api.AuthProvider) arg1;
        id_ = visitor.visitString(!id_.isEmpty(), id_,
            !other.id_.isEmpty(), other.id_);
        issuer_ = visitor.visitString(!issuer_.isEmpty(), issuer_,
            !other.issuer_.isEmpty(), other.issuer_);
        jwksUri_ = visitor.visitString(!jwksUri_.isEmpty(), jwksUri_,
            !other.jwksUri_.isEmpty(), other.jwksUri_);
        audiences_ = visitor.visitString(!audiences_.isEmpty(), audiences_,
            !other.audiences_.isEmpty(), other.audiences_);
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

                id_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                issuer_ = s;
                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                jwksUri_ = s;
                break;
              }
              case 34: {
                String s = input.readStringRequireUtf8();

                audiences_ = s;
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
        if (PARSER == null) {    synchronized (com.google.api.AuthProvider.class) {
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


  // @@protoc_insertion_point(class_scope:google.api.AuthProvider)
  private static final com.google.api.AuthProvider DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AuthProvider();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.api.AuthProvider getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AuthProvider> PARSER;

  public static com.google.protobuf.Parser<AuthProvider> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

