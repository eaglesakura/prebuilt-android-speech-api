// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

/**
 * <pre>
 * Request message for 'CreateServiceRollout'
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.CreateServiceRolloutRequest}
 */
public  final class CreateServiceRolloutRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.CreateServiceRolloutRequest)
    CreateServiceRolloutRequestOrBuilder {
  // Use CreateServiceRolloutRequest.newBuilder() to construct.
  private CreateServiceRolloutRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateServiceRolloutRequest() {
    serviceName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CreateServiceRolloutRequest(
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

            serviceName_ = s;
            break;
          }
          case 18: {
            com.google.api.servicemanagement.v1.Rollout.Builder subBuilder = null;
            if (rollout_ != null) {
              subBuilder = rollout_.toBuilder();
            }
            rollout_ = input.readMessage(com.google.api.servicemanagement.v1.Rollout.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(rollout_);
              rollout_ = subBuilder.buildPartial();
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
    return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_CreateServiceRolloutRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_CreateServiceRolloutRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.servicemanagement.v1.CreateServiceRolloutRequest.class, com.google.api.servicemanagement.v1.CreateServiceRolloutRequest.Builder.class);
  }

  public static final int SERVICE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object serviceName_;
  /**
   * <pre>
   * The name of the service.  See the [overview](/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  public java.lang.String getServiceName() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the service.  See the [overview](/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getServiceNameBytes() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROLLOUT_FIELD_NUMBER = 2;
  private com.google.api.servicemanagement.v1.Rollout rollout_;
  /**
   * <pre>
   * The rollout resource. The `service_name` field is output only.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
   */
  public boolean hasRollout() {
    return rollout_ != null;
  }
  /**
   * <pre>
   * The rollout resource. The `service_name` field is output only.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
   */
  public com.google.api.servicemanagement.v1.Rollout getRollout() {
    return rollout_ == null ? com.google.api.servicemanagement.v1.Rollout.getDefaultInstance() : rollout_;
  }
  /**
   * <pre>
   * The rollout resource. The `service_name` field is output only.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
   */
  public com.google.api.servicemanagement.v1.RolloutOrBuilder getRolloutOrBuilder() {
    return getRollout();
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
    if (!getServiceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceName_);
    }
    if (rollout_ != null) {
      output.writeMessage(2, getRollout());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getServiceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceName_);
    }
    if (rollout_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRollout());
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
    if (!(obj instanceof com.google.api.servicemanagement.v1.CreateServiceRolloutRequest)) {
      return super.equals(obj);
    }
    com.google.api.servicemanagement.v1.CreateServiceRolloutRequest other = (com.google.api.servicemanagement.v1.CreateServiceRolloutRequest) obj;

    boolean result = true;
    result = result && getServiceName()
        .equals(other.getServiceName());
    result = result && (hasRollout() == other.hasRollout());
    if (hasRollout()) {
      result = result && getRollout()
          .equals(other.getRollout());
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
    hash = (37 * hash) + SERVICE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getServiceName().hashCode();
    if (hasRollout()) {
      hash = (37 * hash) + ROLLOUT_FIELD_NUMBER;
      hash = (53 * hash) + getRollout().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parseFrom(
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
  public static Builder newBuilder(com.google.api.servicemanagement.v1.CreateServiceRolloutRequest prototype) {
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
   * Request message for 'CreateServiceRollout'
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.CreateServiceRolloutRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.CreateServiceRolloutRequest)
      com.google.api.servicemanagement.v1.CreateServiceRolloutRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_CreateServiceRolloutRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_CreateServiceRolloutRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.servicemanagement.v1.CreateServiceRolloutRequest.class, com.google.api.servicemanagement.v1.CreateServiceRolloutRequest.Builder.class);
    }

    // Construct using com.google.api.servicemanagement.v1.CreateServiceRolloutRequest.newBuilder()
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
      serviceName_ = "";

      if (rolloutBuilder_ == null) {
        rollout_ = null;
      } else {
        rollout_ = null;
        rolloutBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_CreateServiceRolloutRequest_descriptor;
    }

    public com.google.api.servicemanagement.v1.CreateServiceRolloutRequest getDefaultInstanceForType() {
      return com.google.api.servicemanagement.v1.CreateServiceRolloutRequest.getDefaultInstance();
    }

    public com.google.api.servicemanagement.v1.CreateServiceRolloutRequest build() {
      com.google.api.servicemanagement.v1.CreateServiceRolloutRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.api.servicemanagement.v1.CreateServiceRolloutRequest buildPartial() {
      com.google.api.servicemanagement.v1.CreateServiceRolloutRequest result = new com.google.api.servicemanagement.v1.CreateServiceRolloutRequest(this);
      result.serviceName_ = serviceName_;
      if (rolloutBuilder_ == null) {
        result.rollout_ = rollout_;
      } else {
        result.rollout_ = rolloutBuilder_.build();
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
      if (other instanceof com.google.api.servicemanagement.v1.CreateServiceRolloutRequest) {
        return mergeFrom((com.google.api.servicemanagement.v1.CreateServiceRolloutRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.servicemanagement.v1.CreateServiceRolloutRequest other) {
      if (other == com.google.api.servicemanagement.v1.CreateServiceRolloutRequest.getDefaultInstance()) return this;
      if (!other.getServiceName().isEmpty()) {
        serviceName_ = other.serviceName_;
        onChanged();
      }
      if (other.hasRollout()) {
        mergeRollout(other.getRollout());
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
      com.google.api.servicemanagement.v1.CreateServiceRolloutRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.servicemanagement.v1.CreateServiceRolloutRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object serviceName_ = "";
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public java.lang.String getServiceName() {
      java.lang.Object ref = serviceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getServiceNameBytes() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public Builder setServiceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public Builder clearServiceName() {
      
      serviceName_ = getDefaultInstance().getServiceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public Builder setServiceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceName_ = value;
      onChanged();
      return this;
    }

    private com.google.api.servicemanagement.v1.Rollout rollout_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.api.servicemanagement.v1.Rollout, com.google.api.servicemanagement.v1.Rollout.Builder, com.google.api.servicemanagement.v1.RolloutOrBuilder> rolloutBuilder_;
    /**
     * <pre>
     * The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
     */
    public boolean hasRollout() {
      return rolloutBuilder_ != null || rollout_ != null;
    }
    /**
     * <pre>
     * The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
     */
    public com.google.api.servicemanagement.v1.Rollout getRollout() {
      if (rolloutBuilder_ == null) {
        return rollout_ == null ? com.google.api.servicemanagement.v1.Rollout.getDefaultInstance() : rollout_;
      } else {
        return rolloutBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
     */
    public Builder setRollout(com.google.api.servicemanagement.v1.Rollout value) {
      if (rolloutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rollout_ = value;
        onChanged();
      } else {
        rolloutBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
     */
    public Builder setRollout(
        com.google.api.servicemanagement.v1.Rollout.Builder builderForValue) {
      if (rolloutBuilder_ == null) {
        rollout_ = builderForValue.build();
        onChanged();
      } else {
        rolloutBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
     */
    public Builder mergeRollout(com.google.api.servicemanagement.v1.Rollout value) {
      if (rolloutBuilder_ == null) {
        if (rollout_ != null) {
          rollout_ =
            com.google.api.servicemanagement.v1.Rollout.newBuilder(rollout_).mergeFrom(value).buildPartial();
        } else {
          rollout_ = value;
        }
        onChanged();
      } else {
        rolloutBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
     */
    public Builder clearRollout() {
      if (rolloutBuilder_ == null) {
        rollout_ = null;
        onChanged();
      } else {
        rollout_ = null;
        rolloutBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
     */
    public com.google.api.servicemanagement.v1.Rollout.Builder getRolloutBuilder() {
      
      onChanged();
      return getRolloutFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
     */
    public com.google.api.servicemanagement.v1.RolloutOrBuilder getRolloutOrBuilder() {
      if (rolloutBuilder_ != null) {
        return rolloutBuilder_.getMessageOrBuilder();
      } else {
        return rollout_ == null ?
            com.google.api.servicemanagement.v1.Rollout.getDefaultInstance() : rollout_;
      }
    }
    /**
     * <pre>
     * The rollout resource. The `service_name` field is output only.
     * </pre>
     *
     * <code>optional .google.api.servicemanagement.v1.Rollout rollout = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.api.servicemanagement.v1.Rollout, com.google.api.servicemanagement.v1.Rollout.Builder, com.google.api.servicemanagement.v1.RolloutOrBuilder> 
        getRolloutFieldBuilder() {
      if (rolloutBuilder_ == null) {
        rolloutBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.servicemanagement.v1.Rollout, com.google.api.servicemanagement.v1.Rollout.Builder, com.google.api.servicemanagement.v1.RolloutOrBuilder>(
                getRollout(),
                getParentForChildren(),
                isClean());
        rollout_ = null;
      }
      return rolloutBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.CreateServiceRolloutRequest)
  }

  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.CreateServiceRolloutRequest)
  private static final com.google.api.servicemanagement.v1.CreateServiceRolloutRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.servicemanagement.v1.CreateServiceRolloutRequest();
  }

  public static com.google.api.servicemanagement.v1.CreateServiceRolloutRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateServiceRolloutRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateServiceRolloutRequest>() {
    public CreateServiceRolloutRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateServiceRolloutRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateServiceRolloutRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateServiceRolloutRequest> getParserForType() {
    return PARSER;
  }

  public com.google.api.servicemanagement.v1.CreateServiceRolloutRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

