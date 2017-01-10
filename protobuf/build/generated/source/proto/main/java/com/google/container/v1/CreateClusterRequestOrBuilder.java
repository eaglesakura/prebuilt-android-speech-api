// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface CreateClusterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.CreateClusterRequest)
    com.google.protobuf.MessageOrBuilder {

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
   * resides.
   * </pre>
   *
   * <code>optional string zone = 2;</code>
   */
  java.lang.String getZone();
  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * </pre>
   *
   * <code>optional string zone = 2;</code>
   */
  com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * A [cluster
   * resource](/container-engine/reference/rest/v1/projects.zones.clusters)
   * </pre>
   *
   * <code>optional .google.container.v1.Cluster cluster = 3;</code>
   */
  boolean hasCluster();
  /**
   * <pre>
   * A [cluster
   * resource](/container-engine/reference/rest/v1/projects.zones.clusters)
   * </pre>
   *
   * <code>optional .google.container.v1.Cluster cluster = 3;</code>
   */
  com.google.container.v1.Cluster getCluster();
  /**
   * <pre>
   * A [cluster
   * resource](/container-engine/reference/rest/v1/projects.zones.clusters)
   * </pre>
   *
   * <code>optional .google.container.v1.Cluster cluster = 3;</code>
   */
  com.google.container.v1.ClusterOrBuilder getClusterOrBuilder();
}
