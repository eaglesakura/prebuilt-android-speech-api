// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface ListClustersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.ListClustersRequest)
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
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides, or "-" for all zones.
   * </pre>
   *
   * <code>optional string zone = 2;</code>
   */
  java.lang.String getZone();
  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides, or "-" for all zones.
   * </pre>
   *
   * <code>optional string zone = 2;</code>
   */
  com.google.protobuf.ByteString
      getZoneBytes();
}
