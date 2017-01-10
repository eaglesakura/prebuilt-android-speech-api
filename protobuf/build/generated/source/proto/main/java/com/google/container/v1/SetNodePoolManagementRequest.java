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
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1.SetNodePoolManagementRequest)
    SetNodePoolManagementRequestOrBuilder {
  // Use SetNodePoolManagementRequest.newBuilder() to construct.
  private SetNodePoolManagementRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetNodePoolManagementRequest() {
    projectId_ = "";
    zone_ = "";
    clusterId_ = "";
    nodePoolId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SetNodePoolManagementRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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
            java.lang.String s = input.readStringRequireUtf8();

            projectId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            zone_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            clusterId_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

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
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_SetNodePoolManagementRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_SetNodePoolManagementRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.SetNodePoolManagementRequest.class, com.google.container.v1.SetNodePoolManagementRequest.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object projectId_;
  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * </pre>
   *
   * <code>optional string project_id = 1;</code>
   */
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
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
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ZONE_FIELD_NUMBER = 2;
  private volatile java.lang.Object zone_;
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
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zone_ = s;
      return s;
    }
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
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      zone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLUSTER_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object clusterId_;
  /**
   * <pre>
   * The name of the cluster to update.
   * </pre>
   *
   * <code>optional string cluster_id = 3;</code>
   */
  public java.lang.String getClusterId() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clusterId_ = s;
      return s;
    }
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
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clusterId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NODE_POOL_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object nodePoolId_;
  /**
   * <pre>
   * The name of the node pool to update.
   * </pre>
   *
   * <code>optional string node_pool_id = 4;</code>
   */
  public java.lang.String getNodePoolId() {
    java.lang.Object ref = nodePoolId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nodePoolId_ = s;
      return s;
    }
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
    java.lang.Object ref = nodePoolId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nodePoolId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public com.google.container.v1.NodeManagementOrBuilder getManagementOrBuilder() {
    return getManagement();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (!getZoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, zone_);
    }
    if (!getClusterIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, clusterId_);
    }
    if (!getNodePoolIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, nodePoolId_);
    }
    if (management_ != null) {
      output.writeMessage(5, getManagement());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (!getZoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, zone_);
    }
    if (!getClusterIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, clusterId_);
    }
    if (!getNodePoolIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, nodePoolId_);
    }
    if (management_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getManagement());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.container.v1.SetNodePoolManagementRequest)) {
      return super.equals(obj);
    }
    com.google.container.v1.SetNodePoolManagementRequest other = (com.google.container.v1.SetNodePoolManagementRequest) obj;

    boolean result = true;
    result = result && getProjectId()
        .equals(other.getProjectId());
    result = result && getZone()
        .equals(other.getZone());
    result = result && getClusterId()
        .equals(other.getClusterId());
    result = result && getNodePoolId()
        .equals(other.getNodePoolId());
    result = result && (hasManagement() == other.hasManagement());
    if (hasManagement()) {
      result = result && getManagement()
          .equals(other.getManagement());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getZone().hashCode();
    hash = (37 * hash) + CLUSTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClusterId().hashCode();
    hash = (37 * hash) + NODE_POOL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNodePoolId().hashCode();
    if (hasManagement()) {
      hash = (37 * hash) + MANAGEMENT_FIELD_NUMBER;
      hash = (53 * hash) + getManagement().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.SetNodePoolManagementRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.SetNodePoolManagementRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.container.v1.SetNodePoolManagementRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
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
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.SetNodePoolManagementRequest)
      com.google.container.v1.SetNodePoolManagementRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_SetNodePoolManagementRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_SetNodePoolManagementRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.SetNodePoolManagementRequest.class, com.google.container.v1.SetNodePoolManagementRequest.Builder.class);
    }

    // Construct using com.google.container.v1.SetNodePoolManagementRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      projectId_ = "";

      zone_ = "";

      clusterId_ = "";

      nodePoolId_ = "";

      if (managementBuilder_ == null) {
        management_ = null;
      } else {
        management_ = null;
        managementBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_SetNodePoolManagementRequest_descriptor;
    }

    public com.google.container.v1.SetNodePoolManagementRequest getDefaultInstanceForType() {
      return com.google.container.v1.SetNodePoolManagementRequest.getDefaultInstance();
    }

    public com.google.container.v1.SetNodePoolManagementRequest build() {
      com.google.container.v1.SetNodePoolManagementRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.container.v1.SetNodePoolManagementRequest buildPartial() {
      com.google.container.v1.SetNodePoolManagementRequest result = new com.google.container.v1.SetNodePoolManagementRequest(this);
      result.projectId_ = projectId_;
      result.zone_ = zone_;
      result.clusterId_ = clusterId_;
      result.nodePoolId_ = nodePoolId_;
      if (managementBuilder_ == null) {
        result.management_ = management_;
      } else {
        result.management_ = managementBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.container.v1.SetNodePoolManagementRequest) {
        return mergeFrom((com.google.container.v1.SetNodePoolManagementRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.SetNodePoolManagementRequest other) {
      if (other == com.google.container.v1.SetNodePoolManagementRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (!other.getZone().isEmpty()) {
        zone_ = other.zone_;
        onChanged();
      }
      if (!other.getClusterId().isEmpty()) {
        clusterId_ = other.clusterId_;
        onChanged();
      }
      if (!other.getNodePoolId().isEmpty()) {
        nodePoolId_ = other.nodePoolId_;
        onChanged();
      }
      if (other.hasManagement()) {
        mergeManagement(other.getManagement());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.container.v1.SetNodePoolManagementRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1.SetNodePoolManagementRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * </pre>
     *
     * <code>optional string project_id = 1;</code>
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
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
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectId_ = value;
      onChanged();
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
      
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
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
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object zone_ = "";
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
      java.lang.Object ref = zone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
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
      java.lang.Object ref = zone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (value == null) {
    throw new NullPointerException();
  }
  
      zone_ = value;
      onChanged();
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
      
      zone_ = getDefaultInstance().getZone();
      onChanged();
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
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      zone_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object clusterId_ = "";
    /**
     * <pre>
     * The name of the cluster to update.
     * </pre>
     *
     * <code>optional string cluster_id = 3;</code>
     */
    public java.lang.String getClusterId() {
      java.lang.Object ref = clusterId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clusterId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
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
      java.lang.Object ref = clusterId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clusterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (value == null) {
    throw new NullPointerException();
  }
  
      clusterId_ = value;
      onChanged();
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
      
      clusterId_ = getDefaultInstance().getClusterId();
      onChanged();
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
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clusterId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object nodePoolId_ = "";
    /**
     * <pre>
     * The name of the node pool to update.
     * </pre>
     *
     * <code>optional string node_pool_id = 4;</code>
     */
    public java.lang.String getNodePoolId() {
      java.lang.Object ref = nodePoolId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nodePoolId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
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
      java.lang.Object ref = nodePoolId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nodePoolId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (value == null) {
    throw new NullPointerException();
  }
  
      nodePoolId_ = value;
      onChanged();
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
      
      nodePoolId_ = getDefaultInstance().getNodePoolId();
      onChanged();
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
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nodePoolId_ = value;
      onChanged();
      return this;
    }

    private com.google.container.v1.NodeManagement management_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.container.v1.NodeManagement, com.google.container.v1.NodeManagement.Builder, com.google.container.v1.NodeManagementOrBuilder> managementBuilder_;
    /**
     * <pre>
     * NodeManagement configuration for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.NodeManagement management = 5;</code>
     */
    public boolean hasManagement() {
      return managementBuilder_ != null || management_ != null;
    }
    /**
     * <pre>
     * NodeManagement configuration for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.NodeManagement management = 5;</code>
     */
    public com.google.container.v1.NodeManagement getManagement() {
      if (managementBuilder_ == null) {
        return management_ == null ? com.google.container.v1.NodeManagement.getDefaultInstance() : management_;
      } else {
        return managementBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * NodeManagement configuration for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.NodeManagement management = 5;</code>
     */
    public Builder setManagement(com.google.container.v1.NodeManagement value) {
      if (managementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        management_ = value;
        onChanged();
      } else {
        managementBuilder_.setMessage(value);
      }

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
      if (managementBuilder_ == null) {
        management_ = builderForValue.build();
        onChanged();
      } else {
        managementBuilder_.setMessage(builderForValue.build());
      }

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
      if (managementBuilder_ == null) {
        if (management_ != null) {
          management_ =
            com.google.container.v1.NodeManagement.newBuilder(management_).mergeFrom(value).buildPartial();
        } else {
          management_ = value;
        }
        onChanged();
      } else {
        managementBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * NodeManagement configuration for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.NodeManagement management = 5;</code>
     */
    public Builder clearManagement() {
      if (managementBuilder_ == null) {
        management_ = null;
        onChanged();
      } else {
        management_ = null;
        managementBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * NodeManagement configuration for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.NodeManagement management = 5;</code>
     */
    public com.google.container.v1.NodeManagement.Builder getManagementBuilder() {
      
      onChanged();
      return getManagementFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * NodeManagement configuration for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.NodeManagement management = 5;</code>
     */
    public com.google.container.v1.NodeManagementOrBuilder getManagementOrBuilder() {
      if (managementBuilder_ != null) {
        return managementBuilder_.getMessageOrBuilder();
      } else {
        return management_ == null ?
            com.google.container.v1.NodeManagement.getDefaultInstance() : management_;
      }
    }
    /**
     * <pre>
     * NodeManagement configuration for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.NodeManagement management = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.container.v1.NodeManagement, com.google.container.v1.NodeManagement.Builder, com.google.container.v1.NodeManagementOrBuilder> 
        getManagementFieldBuilder() {
      if (managementBuilder_ == null) {
        managementBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.NodeManagement, com.google.container.v1.NodeManagement.Builder, com.google.container.v1.NodeManagementOrBuilder>(
                getManagement(),
                getParentForChildren(),
                isClean());
        management_ = null;
      }
      return managementBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.container.v1.SetNodePoolManagementRequest)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.SetNodePoolManagementRequest)
  private static final com.google.container.v1.SetNodePoolManagementRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1.SetNodePoolManagementRequest();
  }

  public static com.google.container.v1.SetNodePoolManagementRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetNodePoolManagementRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetNodePoolManagementRequest>() {
    public SetNodePoolManagementRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetNodePoolManagementRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetNodePoolManagementRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetNodePoolManagementRequest> getParserForType() {
    return PARSER;
  }

  public com.google.container.v1.SetNodePoolManagementRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

