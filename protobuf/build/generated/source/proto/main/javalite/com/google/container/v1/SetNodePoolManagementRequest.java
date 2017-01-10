// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 * <pre>
 * SetNodePoolManagementRequest sets the node management properties of a node
 * pool.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.SetNodePoolManagementRequest}
 */
public  final class SetNodePoolManagementRequest extends
    com.google.protobuf.GeneratedMessageLite<
        SetNodePoolManagementRequest, SetNodePoolManagementRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:google.container.v1.SetNodePoolManagementRequest)
    SetNodePoolManagementRequestOrBuilder {
  private SetNodePoolManagementRequest() {
    projectId_ = "";
    zone_ = "";
    clusterId_ = "";
    nodePoolId_ = "";
  }
  public static final int PROJECT_ID_FIELD_NUMBER = 1;
  private java.lang.String projectId_;
  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * </pre>
   *
   * <code>optional string project_id = 1;</code>
   */
  public java.lang.String getProjectId() {
    return projectId_;
  }
  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * </pre>
   *
   * <code>optional string project_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(projectId_);
  }
  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * </pre>
   *
   * <code>optional string project_id = 1;</code>
   */
  private void setProjectId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    projectId_ = value;
  }
  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * </pre>
   *
   * <code>optional string project_id = 1;</code>
   */
  private void clearProjectId() {
    
    projectId_ = getDefaultInstance().getProjectId();
  }
  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * </pre>
   *
   * <code>optional string project_id = 1;</code>
   */
  private void setProjectIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    projectId_ = value.toStringUtf8();
  }

  public static final int ZONE_FIELD_NUMBER = 2;
  private java.lang.String zone_;
  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * </pre>
   *
   * <code>optional string zone = 2;</code>
   */
  public java.lang.String getZone() {
    return zone_;
  }
  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * </pre>
   *
   * <code>optional string zone = 2;</code>
   */
  public com.google.protobuf.ByteString
      getZoneBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(zone_);
  }
  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * </pre>
   *
   * <code>optional string zone = 2;</code>
   */
  private void setZone(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    zone_ = value;
  }
  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * </pre>
   *
   * <code>optional string zone = 2;</code>
   */
  private void clearZone() {
    
    zone_ = getDefaultInstance().getZone();
  }
  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * </pre>
   *
   * <code>optional string zone = 2;</code>
   */
  private void setZoneBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    zone_ = value.toStringUtf8();
  }

  public static final int CLUSTER_ID_FIELD_NUMBER = 3;
  private java.lang.String clusterId_;
  /**
   * <pre>
   * The name of the cluster to update.
   * </pre>
   *
   * <code>optional string cluster_id = 3;</code>
   */
  public java.lang.String getClusterId() {
    return clusterId_;
  }
  /**
   * <pre>
   * The name of the cluster to update.
   * </pre>
   *
   * <code>optional string cluster_id = 3;</code>
   */
  public com.google.protobuf.ByteString
      getClusterIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(clusterId_);
  }
  /**
   * <pre>
   * The name of the cluster to update.
   * </pre>
   *
   * <code>optional string cluster_id = 3;</code>
   */
  private void setClusterId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    clusterId_ = value;
  }
  /**
   * <pre>
   * The name of the cluster to update.
   * </pre>
   *
   * <code>optional string cluster_id = 3;</code>
   */
  private void clearClusterId() {
    
    clusterId_ = getDefaultInstance().getClusterId();
  }
  /**
   * <pre>
   * The name of the cluster to update.
   * </pre>
   *
   * <code>optional string cluster_id = 3;</code>
   */
  private void setClusterIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    clusterId_ = value.toStringUtf8();
  }

  public static final int NODE_POOL_ID_FIELD_NUMBER = 4;
  private java.lang.String nodePoolId_;
  /**
   * <pre>
   * The name of the node pool to update.
   * </pre>
   *
   * <code>optional string node_pool_id = 4;</code>
   */
  public java.lang.String getNodePoolId() {
    return nodePoolId_;
  }
  /**
   * <pre>
   * The name of the node pool to update.
   * </pre>
   *
   * <code>optional string node_pool_id = 4;</code>
   */
  public com.google.protobuf.ByteString
      getNodePoolIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(nodePoolId_);
  }
  /**
   * <pre>
   * The name of the node pool to update.
   * </pre>
   *
   * <code>optional string node_pool_id = 4;</code>
   */
  private void setNodePoolId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    nodePoolId_ = value;
  }
  /**
   * <pre>
   * The name of the node pool to update.
   * </pre>
   *
   * <code>optional string node_pool_id = 4;</code>
   */
  private void clearNodePoolId() {
    
    nodePoolId_ = getDefaultInstance().getNodePoolId();
  }
  /**
   * <pre>
   * The name of the node pool to update.
   * </pre>
   *
   * <code>optional string node_pool_id = 4;</code>
   */
  private void setNodePoolIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    nodePoolId_ = value.toStringUtf8();
  }

  public static final int MANAGEMENT_FIELD_NUMBER = 5;
  private com.google.container.v1.NodeManagement management_;
  /**
   * <pre>
   * NodeManagement configuration for the node pool.
   * </pre>
   *
   * <code>optional .google.container.v1.NodeManagement management = 5;</code>
   */
  public boolean hasManagement() {
    return management_ != null;
  }
  /**
   * <pre>
   * NodeManagement configuration for the node pool.
   * </pre>
   *
   * <code>optional .google.container.v1.NodeManagement management = 5;</code>
   */
  public com.google.container.v1.NodeManagement getManagement() {
    return management_ == null ? com.google.container.v1.NodeManagement.getDefaultInstance() : management_;
  }
  /**
   * <pre>
   * NodeManagement configuration for the node pool.
   * </pre>
   *
   * <code>optional .google.container.v1.NodeManagement management = 5;</code>
   */
  private void setManagement(com.google.container.v1.NodeManagement value) {
    if (value == null) {
      throw new NullPointerException();
    }
    management_ = value;
    
    }
  /**
   * <pre>
   * NodeManagement configuration for the node pool.
   * </pre>
   *
   * <code>optional .google.container.v1.NodeManagement management = 5;</code>
   */
  private void setManagement(
      com.google.container.v1.NodeManagement.Builder builderForValue) {
    management_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * NodeManagement configuration for the node pool.
   * </pre>
   *
   * <code>optional .google.container.v1.NodeManagement management = 5;</code>
   */
  private void mergeManagement(com.google.container.v1.NodeManagement value) {
    if (management_ != null &&
        management_ != com.google.container.v1.NodeManagement.getDefaultInstance()) {
      management_ =
        com.google.container.v1.NodeManagement.newBuilder(management_).mergeFrom(value).buildPartial();
    } else {
      management_ = value;
    }
    
  }
  /**
   * <pre>
   * NodeManagement configuration for the node pool.
   * </pre>
   *
   * <code>optional .google.container.v1.NodeManagement management = 5;</code>
   */
  private void clearManagement() {  management_ = null;
    
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!projectId_.isEmpty()) {
      output.writeString(1, getProjectId());
    }
    if (!zone_.isEmpty()) {
      output.writeString(2, getZone());
    }
    if (!clusterId_.isEmpty()) {
      output.writeString(3, getClusterId());
    }
    if (!nodePoolId_.isEmpty()) {
      output.writeString(4, getNodePoolId());
    }
    if (management_ != null) {
      output.writeMessage(5, getManagement());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!projectId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getProjectId());
    }
    if (!zone_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getZone());
    }
    if (!clusterId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getClusterId());
    }
    if (!nodePoolId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getNodePoolId());
    }
    if (management_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getManagement());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.container.v1.SetNodePoolManagementRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.container.v1.SetNodePoolManagementRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * SetNodePoolManagementRequest sets the node management properties of a node
   * pool.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.SetNodePoolManagementRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.container.v1.SetNodePoolManagementRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.SetNodePoolManagementRequest)
      com.google.container.v1.SetNodePoolManagementRequestOrBuilder {
    // Construct using com.google.container.v1.SetNodePoolManagementRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * </pre>
     *
     * <code>optional string project_id = 1;</code>
     */
    public java.lang.String getProjectId() {
      return instance.getProjectId();
    }
    /**
     * <pre>
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * </pre>
     *
     * <code>optional string project_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      return instance.getProjectIdBytes();
    }
    /**
     * <pre>
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * </pre>
     *
     * <code>optional string project_id = 1;</code>
     */
    public Builder setProjectId(
        java.lang.String value) {
      copyOnWrite();
      instance.setProjectId(value);
      return this;
    }
    /**
     * <pre>
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * </pre>
     *
     * <code>optional string project_id = 1;</code>
     */
    public Builder clearProjectId() {
      copyOnWrite();
      instance.clearProjectId();
      return this;
    }
    /**
     * <pre>
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * </pre>
     *
     * <code>optional string project_id = 1;</code>
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setProjectIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * </pre>
     *
     * <code>optional string zone = 2;</code>
     */
    public java.lang.String getZone() {
      return instance.getZone();
    }
    /**
     * <pre>
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * </pre>
     *
     * <code>optional string zone = 2;</code>
     */
    public com.google.protobuf.ByteString
        getZoneBytes() {
      return instance.getZoneBytes();
    }
    /**
     * <pre>
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * </pre>
     *
     * <code>optional string zone = 2;</code>
     */
    public Builder setZone(
        java.lang.String value) {
      copyOnWrite();
      instance.setZone(value);
      return this;
    }
    /**
     * <pre>
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * </pre>
     *
     * <code>optional string zone = 2;</code>
     */
    public Builder clearZone() {
      copyOnWrite();
      instance.clearZone();
      return this;
    }
    /**
     * <pre>
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * </pre>
     *
     * <code>optional string zone = 2;</code>
     */
    public Builder setZoneBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setZoneBytes(value);
      return this;
    }

    /**
     * <pre>
     * The name of the cluster to update.
     * </pre>
     *
     * <code>optional string cluster_id = 3;</code>
     */
    public java.lang.String getClusterId() {
      return instance.getClusterId();
    }
    /**
     * <pre>
     * The name of the cluster to update.
     * </pre>
     *
     * <code>optional string cluster_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getClusterIdBytes() {
      return instance.getClusterIdBytes();
    }
    /**
     * <pre>
     * The name of the cluster to update.
     * </pre>
     *
     * <code>optional string cluster_id = 3;</code>
     */
    public Builder setClusterId(
        java.lang.String value) {
      copyOnWrite();
      instance.setClusterId(value);
      return this;
    }
    /**
     * <pre>
     * The name of the cluster to update.
     * </pre>
     *
     * <code>optional string cluster_id = 3;</code>
     */
    public Builder clearClusterId() {
      copyOnWrite();
      instance.clearClusterId();
      return this;
    }
    /**
     * <pre>
     * The name of the cluster to update.
     * </pre>
     *
     * <code>optional string cluster_id = 3;</code>
     */
    public Builder setClusterIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setClusterIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * The name of the node pool to update.
     * </pre>
     *
     * <code>optional string node_pool_id = 4;</code>
     */
    public java.lang.String getNodePoolId() {
      return instance.getNodePoolId();
    }
    /**
     * <pre>
     * The name of the node pool to update.
     * </pre>
     *
     * <code>optional string node_pool_id = 4;</code>
     */
    public com.google.protobuf.ByteString
        getNodePoolIdBytes() {
      return instance.getNodePoolIdBytes();
    }
    /**
     * <pre>
     * The name of the node pool to update.
     * </pre>
     *
     * <code>optional string node_pool_id = 4;</code>
     */
    public Builder setNodePoolId(
        java.lang.String value) {
      copyOnWrite();
      instance.setNodePoolId(value);
      return this;
    }
    /**
     * <pre>
     * The name of the node pool to update.
     * </pre>
     *
     * <code>optional string node_pool_id = 4;</code>
     */
    public Builder clearNodePoolId() {
      copyOnWrite();
      instance.clearNodePoolId();
      return this;
    }
    /**
     * <pre>
     * The name of the node pool to update.
     * </pre>
     *
     * <code>optional string node_pool_id = 4;</code>
     */
    public Builder setNodePoolIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNodePoolIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * NodeManagement configuration for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.NodeManagement management = 5;</code>
     */
    public boolean hasManagement() {
      return instance.hasManagement();
    }
    /**
     * <pre>
     * NodeManagement configuration for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.NodeManagement management = 5;</code>
     */
    public com.google.container.v1.NodeManagement getManagement() {
      return instance.getManagement();
    }
    /**
     * <pre>
     * NodeManagement configuration for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.NodeManagement management = 5;</code>
     */
    public Builder setManagement(com.google.container.v1.NodeManagement value) {
      copyOnWrite();
      instance.setManagement(value);
      return this;
      }
    /**
     * <pre>
     * NodeManagement configuration for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.NodeManagement management = 5;</code>
     */
    public Builder setManagement(
        com.google.container.v1.NodeManagement.Builder builderForValue) {
      copyOnWrite();
      instance.setManagement(builderForValue);
      return this;
    }
    /**
     * <pre>
     * NodeManagement configuration for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.NodeManagement management = 5;</code>
     */
    public Builder mergeManagement(com.google.container.v1.NodeManagement value) {
      copyOnWrite();
      instance.mergeManagement(value);
      return this;
    }
    /**
     * <pre>
     * NodeManagement configuration for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.NodeManagement management = 5;</code>
     */
    public Builder clearManagement() {  copyOnWrite();
      instance.clearManagement();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.container.v1.SetNodePoolManagementRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.container.v1.SetNodePoolManagementRequest();
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
        com.google.container.v1.SetNodePoolManagementRequest other = (com.google.container.v1.SetNodePoolManagementRequest) arg1;
        projectId_ = visitor.visitString(!projectId_.isEmpty(), projectId_,
            !other.projectId_.isEmpty(), other.projectId_);
        zone_ = visitor.visitString(!zone_.isEmpty(), zone_,
            !other.zone_.isEmpty(), other.zone_);
        clusterId_ = visitor.visitString(!clusterId_.isEmpty(), clusterId_,
            !other.clusterId_.isEmpty(), other.clusterId_);
        nodePoolId_ = visitor.visitString(!nodePoolId_.isEmpty(), nodePoolId_,
            !other.nodePoolId_.isEmpty(), other.nodePoolId_);
        management_ = visitor.visitMessage(management_, other.management_);
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

                projectId_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                zone_ = s;
                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                clusterId_ = s;
                break;
              }
              case 34: {
                String s = input.readStringRequireUtf8();

                nodePoolId_ = s;
                break;
              }
              case 42: {
                com.google.container.v1.NodeManagement.Builder subBuilder = null;
                if (management_ != null) {
                  subBuilder = management_.toBuilder();
                }
                management_ = input.readMessage(com.google.container.v1.NodeManagement.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(management_);
                  management_ = subBuilder.buildPartial();
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
        if (PARSER == null) {    synchronized (com.google.container.v1.SetNodePoolManagementRequest.class) {
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


  // @@protoc_insertion_point(class_scope:google.container.v1.SetNodePoolManagementRequest)
  private static final com.google.container.v1.SetNodePoolManagementRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SetNodePoolManagementRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.container.v1.SetNodePoolManagementRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SetNodePoolManagementRequest> PARSER;

  public static com.google.protobuf.Parser<SetNodePoolManagementRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

