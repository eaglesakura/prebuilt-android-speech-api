// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/monitored_resource.proto

package com.google.api;

/**
 * <pre>
 * An object representing a resource that can be used for monitoring, logging,
 * billing, or other purposes. Examples include virtual machine instances,
 * databases, and storage devices such as disks. The `type` field identifies a
 * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object that describes the resource's
 * schema. Information in the `labels` field identifies the actual resource and
 * its attributes according to the schema. For example, a particular Compute
 * Engine VM instance could be represented by the following object, because the
 * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] for `"gce_instance"` has labels
 * `"instance_id"` and `"zone"`:
 *     { "type": "gce_instance",
 *       "labels": { "instance_id": "12345678901234",
 *                   "zone": "us-central1-a" }}
 * </pre>
 *
 * Protobuf type {@code google.api.MonitoredResource}
 */
public  final class MonitoredResource extends
    com.google.protobuf.GeneratedMessageLite<
        MonitoredResource, MonitoredResource.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.MonitoredResource)
    MonitoredResourceOrBuilder {
  private MonitoredResource() {
    type_ = "";
  }
  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private java.lang.String type_;
  /**
   * <pre>
   * Required. The monitored resource type. This field must match
   * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
   * example, the type of a Cloud SQL database is `"cloudsql_database"`.
   * </pre>
   *
   * <code>optional string type = 1;</code>
   */
  public java.lang.String getType() {
    return type_;
  }
  /**
   * <pre>
   * Required. The monitored resource type. This field must match
   * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
   * example, the type of a Cloud SQL database is `"cloudsql_database"`.
   * </pre>
   *
   * <code>optional string type = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(type_);
  }
  /**
   * <pre>
   * Required. The monitored resource type. This field must match
   * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
   * example, the type of a Cloud SQL database is `"cloudsql_database"`.
   * </pre>
   *
   * <code>optional string type = 1;</code>
   */
  private void setType(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    type_ = value;
  }
  /**
   * <pre>
   * Required. The monitored resource type. This field must match
   * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
   * example, the type of a Cloud SQL database is `"cloudsql_database"`.
   * </pre>
   *
   * <code>optional string type = 1;</code>
   */
  private void clearType() {
    
    type_ = getDefaultInstance().getType();
  }
  /**
   * <pre>
   * Required. The monitored resource type. This field must match
   * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
   * example, the type of a Cloud SQL database is `"cloudsql_database"`.
   * </pre>
   *
   * <code>optional string type = 1;</code>
   */
  private void setTypeBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    type_ = value.toStringUtf8();
  }

  public static final int LABELS_FIELD_NUMBER = 2;
  private static final class LabelsDefaultEntryHolder {
    static final com.google.protobuf.MapEntryLite<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntryLite
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapFieldLite<
      java.lang.String, java.lang.String> labels_ =
          com.google.protobuf.MapFieldLite.emptyMapField();
  private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String>
  internalGetLabels() {
    return labels_;
  }
  private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String>
  internalGetMutableLabels() {
    if (!labels_.isMutable()) {
      labels_ = labels_.mutableCopy();
    }
    return labels_;
  }

  public int getLabelsCount() {
    return internalGetLabels().size();
  }
  /**
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Cloud SQL databases use the labels
   * `"database_id"` and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  public boolean containsLabels(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetLabels().containsKey(key);
  }
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getLabels() {
    return getLabelsMap();
  }
  /**
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Cloud SQL databases use the labels
   * `"database_id"` and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
    return java.util.Collections.unmodifiableMap(
        internalGetLabels());
  }
  /**
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Cloud SQL databases use the labels
   * `"database_id"` and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  public java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetLabels();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Cloud SQL databases use the labels
   * `"database_id"` and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  public java.lang.String getLabelsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetLabels();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }
  /**
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Cloud SQL databases use the labels
   * `"database_id"` and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  private java.util.Map<java.lang.String, java.lang.String>
  getMutableLabelsMap() {
    return internalGetMutableLabels();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!type_.isEmpty()) {
      output.writeString(1, getType());
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetLabels().entrySet()) {
      LabelsDefaultEntryHolder.defaultEntry.serializeTo(
          output, 2, entry.getKey(), entry.getValue());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!type_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getType());
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetLabels().entrySet()) {
      size += LabelsDefaultEntryHolder.defaultEntry.computeMessageSize(
        2, entry.getKey(), entry.getValue());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.api.MonitoredResource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.MonitoredResource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.MonitoredResource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.MonitoredResource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.MonitoredResource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.MonitoredResource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.MonitoredResource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.MonitoredResource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.MonitoredResource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.MonitoredResource parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.MonitoredResource prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * An object representing a resource that can be used for monitoring, logging,
   * billing, or other purposes. Examples include virtual machine instances,
   * databases, and storage devices such as disks. The `type` field identifies a
   * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object that describes the resource's
   * schema. Information in the `labels` field identifies the actual resource and
   * its attributes according to the schema. For example, a particular Compute
   * Engine VM instance could be represented by the following object, because the
   * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] for `"gce_instance"` has labels
   * `"instance_id"` and `"zone"`:
   *     { "type": "gce_instance",
   *       "labels": { "instance_id": "12345678901234",
   *                   "zone": "us-central1-a" }}
   * </pre>
   *
   * Protobuf type {@code google.api.MonitoredResource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.MonitoredResource, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.MonitoredResource)
      com.google.api.MonitoredResourceOrBuilder {
    // Construct using com.google.api.MonitoredResource.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Required. The monitored resource type. This field must match
     * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
     * example, the type of a Cloud SQL database is `"cloudsql_database"`.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public java.lang.String getType() {
      return instance.getType();
    }
    /**
     * <pre>
     * Required. The monitored resource type. This field must match
     * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
     * example, the type of a Cloud SQL database is `"cloudsql_database"`.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      return instance.getTypeBytes();
    }
    /**
     * <pre>
     * Required. The monitored resource type. This field must match
     * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
     * example, the type of a Cloud SQL database is `"cloudsql_database"`.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public Builder setType(
        java.lang.String value) {
      copyOnWrite();
      instance.setType(value);
      return this;
    }
    /**
     * <pre>
     * Required. The monitored resource type. This field must match
     * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
     * example, the type of a Cloud SQL database is `"cloudsql_database"`.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public Builder clearType() {
      copyOnWrite();
      instance.clearType();
      return this;
    }
    /**
     * <pre>
     * Required. The monitored resource type. This field must match
     * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
     * example, the type of a Cloud SQL database is `"cloudsql_database"`.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTypeBytes(value);
      return this;
    }


    public int getLabelsCount() {
      return instance.getLabelsMap().size();
    }
    /**
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Cloud SQL databases use the labels
     * `"database_id"` and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */

    public boolean containsLabels(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return instance.getLabelsMap().containsKey(key);
    }

    public Builder clearLabels() {
      copyOnWrite();
      instance.getMutableLabelsMap().clear();
      return this;
    }
    /**
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Cloud SQL databases use the labels
     * `"database_id"` and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */

    public Builder removeLabels(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      copyOnWrite();
      instance.getMutableLabelsMap().remove(key);
      return this;
    }
    /**
     * Use {@link #getLabelsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getLabels() {
      return getLabelsMap();
    }
    /**
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Cloud SQL databases use the labels
     * `"database_id"` and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
      return java.util.Collections.unmodifiableMap(
          instance.getLabelsMap());
    }
    /**
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Cloud SQL databases use the labels
     * `"database_id"` and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */

    public java.lang.String getLabelsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          instance.getLabelsMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Cloud SQL databases use the labels
     * `"database_id"` and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */

    public java.lang.String getLabelsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          instance.getLabelsMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    /**
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Cloud SQL databases use the labels
     * `"database_id"` and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    public Builder putLabels(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      copyOnWrite();
      instance.getMutableLabelsMap().put(key, value);
      return this;
    }
    /**
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Cloud SQL databases use the labels
     * `"database_id"` and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    public Builder putAllLabels(
        java.util.Map<java.lang.String, java.lang.String> values) {
      copyOnWrite();
      instance.getMutableLabelsMap().putAll(values);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.MonitoredResource)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.MonitoredResource();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        labels_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.google.api.MonitoredResource other = (com.google.api.MonitoredResource) arg1;
        type_ = visitor.visitString(!type_.isEmpty(), type_,
            !other.type_.isEmpty(), other.type_);
        labels_ = visitor.visitMap(
            labels_, other.internalGetLabels());
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
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

                type_ = s;
                break;
              }
              case 18: {
                if (!labels_.isMutable()) {
                  labels_ = labels_.mutableCopy();
                }
                LabelsDefaultEntryHolder.defaultEntry.parseInto(labels_, input, extensionRegistry);  break;
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
        if (PARSER == null) {    synchronized (com.google.api.MonitoredResource.class) {
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


  // @@protoc_insertion_point(class_scope:google.api.MonitoredResource)
  private static final com.google.api.MonitoredResource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MonitoredResource();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.api.MonitoredResource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<MonitoredResource> PARSER;

  public static com.google.protobuf.Parser<MonitoredResource> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

