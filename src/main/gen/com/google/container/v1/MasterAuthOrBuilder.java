// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface MasterAuthOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.MasterAuth)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The username to use for HTTP basic authentication to the master endpoint.
   * </pre>
   *
   * <code>optional string username = 1;</code>
   */
  java.lang.String getUsername();
  /**
   * <pre>
   * The username to use for HTTP basic authentication to the master endpoint.
   * </pre>
   *
   * <code>optional string username = 1;</code>
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <pre>
   * The password to use for HTTP basic authentication to the master endpoint.
   * Because the master endpoint is open to the Internet, you should create a
   * strong password.
   * </pre>
   *
   * <code>optional string password = 2;</code>
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * The password to use for HTTP basic authentication to the master endpoint.
   * Because the master endpoint is open to the Internet, you should create a
   * strong password.
   * </pre>
   *
   * <code>optional string password = 2;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <pre>
   * [Output only] Base64-encoded public certificate that is the root of
   * trust for the cluster.
   * </pre>
   *
   * <code>optional string cluster_ca_certificate = 100;</code>
   */
  java.lang.String getClusterCaCertificate();
  /**
   * <pre>
   * [Output only] Base64-encoded public certificate that is the root of
   * trust for the cluster.
   * </pre>
   *
   * <code>optional string cluster_ca_certificate = 100;</code>
   */
  com.google.protobuf.ByteString
      getClusterCaCertificateBytes();

  /**
   * <pre>
   * [Output only] Base64-encoded public certificate used by clients to
   * authenticate to the cluster endpoint.
   * </pre>
   *
   * <code>optional string client_certificate = 101;</code>
   */
  java.lang.String getClientCertificate();
  /**
   * <pre>
   * [Output only] Base64-encoded public certificate used by clients to
   * authenticate to the cluster endpoint.
   * </pre>
   *
   * <code>optional string client_certificate = 101;</code>
   */
  com.google.protobuf.ByteString
      getClientCertificateBytes();

  /**
   * <pre>
   * [Output only] Base64-encoded private key used by clients to authenticate
   * to the cluster endpoint.
   * </pre>
   *
   * <code>optional string client_key = 102;</code>
   */
  java.lang.String getClientKey();
  /**
   * <pre>
   * [Output only] Base64-encoded private key used by clients to authenticate
   * to the cluster endpoint.
   * </pre>
   *
   * <code>optional string client_key = 102;</code>
   */
  com.google.protobuf.ByteString
      getClientKeyBytes();
}
