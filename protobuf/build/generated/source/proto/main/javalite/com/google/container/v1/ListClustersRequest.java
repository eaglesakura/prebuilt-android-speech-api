// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 * <pre>
 * ListClustersRequest lists clusters.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.ListClustersRequest}
 */
public  final class ListClustersRequest extends
    com.google.protobuf.GeneratedMessageLite<
        ListClustersRequest, ListClustersRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:google.container.v1.ListClustersRequest)
    ListClustersRequestOrBuilder {
  private ListClustersRequest() {
    projectId_ = "";
    zone_ = "";
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
   * resides, or "-" for all zones.
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
   * resides, or "-" for all zones.
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
   * resides, or "-" for all zones.
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
   * resides, or "-" for all zones.
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
   * resides, or "-" for all zones.
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

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!projectId_.isEmpty()) {
      output.writeString(1, getProjectId());
    }
    if (!zone_.isEmpty()) {
      output.writeString(2, getZone());
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
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.container.v1.ListClustersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.container.v1.ListClustersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.container.v1.ListClustersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.container.v1.ListClustersRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.container.v1.ListClustersRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.container.v1.ListClustersRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.container.v1.ListClustersRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.container.v1.ListClustersRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.container.v1.ListClustersRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.container.v1.ListClustersRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.container.v1.ListClustersRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * ListClustersRequest lists clusters.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.ListClustersRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.container.v1.ListClustersRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.ListClustersRequest)
      com.google.container.v1.ListClustersRequestOrBuilder {
    // Construct using com.google.container.v1.ListClustersRequest.newBuilder()
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
     * resides, or "-" for all zones.
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
     * resides, or "-" for all zones.
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
     * resides, or "-" for all zones.
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
     * resides, or "-" for all zones.
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
     * resides, or "-" for all zones.
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.ListClustersRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.container.v1.ListClustersRequest();
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
        com.google.container.v1.ListClustersRequest other = (com.google.container.v1.ListClustersRequest) arg1;
        projectId_ = visitor.visitString(!projectId_.isEmpty(), projectId_,
            !other.projectId_.isEmpty(), other.projectId_);
        zone_ = visitor.visitString(!zone_.isEmpty(), zone_,
            !other.zone_.isEmpty(), other.zone_);
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
        if (PARSER == null) {    synchronized (com.google.container.v1.ListClustersRequest.class) {
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


  // @@protoc_insertion_point(class_scope:google.container.v1.ListClustersRequest)
  private static final com.google.container.v1.ListClustersRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListClustersRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.container.v1.ListClustersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListClustersRequest> PARSER;

  public static com.google.protobuf.Parser<ListClustersRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
