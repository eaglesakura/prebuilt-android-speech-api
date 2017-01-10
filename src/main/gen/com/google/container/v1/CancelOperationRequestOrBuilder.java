// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface CancelOperationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.CancelOperationRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * </pre>
   *
   * <code>optional string project_id = 1;</code>
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * </pre>
   *
   * <code>optional string project_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the operation resides.
   * </pre>
   *
   * <code>optional string zone = 2;</code>
   */
  java.lang.String getZone();
  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the operation resides.
   * </pre>
   *
   * <code>optional string zone = 2;</code>
   */
  com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * The server-assigned `name` of the operation.
   * </pre>
   *
   * <code>optional string operation_id = 3;</code>
   */
  java.lang.String getOperationId();
  /**
   * <pre>
   * The server-assigned `name` of the operation.
   * </pre>
   *
   * <code>optional string operation_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getOperationIdBytes();
}
