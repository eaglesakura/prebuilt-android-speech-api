// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 * <pre>
 * NodeManagement defines the set of node management services turned on for the
 * node pool.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.NodeManagement}
 */
public  final class NodeManagement extends
    com.google.protobuf.GeneratedMessageLite<
        NodeManagement, NodeManagement.Builder> implements
    // @@protoc_insertion_point(message_implements:google.container.v1.NodeManagement)
    NodeManagementOrBuilder {
  private NodeManagement() {
  }
  public static final int AUTO_UPGRADE_FIELD_NUMBER = 1;
  private boolean autoUpgrade_;
  /**
   * <pre>
   * Whether the nodes will be automatically upgraded.
   * </pre>
   *
   * <code>optional bool auto_upgrade = 1;</code>
   */
  public boolean getAutoUpgrade() {
    return autoUpgrade_;
  }
  /**
   * <pre>
   * Whether the nodes will be automatically upgraded.
   * </pre>
   *
   * <code>optional bool auto_upgrade = 1;</code>
   */
  private void setAutoUpgrade(boolean value) {
    
    autoUpgrade_ = value;
  }
  /**
   * <pre>
   * Whether the nodes will be automatically upgraded.
   * </pre>
   *
   * <code>optional bool auto_upgrade = 1;</code>
   */
  private void clearAutoUpgrade() {
    
    autoUpgrade_ = false;
  }

  public static final int UPGRADE_OPTIONS_FIELD_NUMBER = 10;
  private com.google.container.v1.AutoUpgradeOptions upgradeOptions_;
  /**
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>optional .google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
   */
  public boolean hasUpgradeOptions() {
    return upgradeOptions_ != null;
  }
  /**
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>optional .google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
   */
  public com.google.container.v1.AutoUpgradeOptions getUpgradeOptions() {
    return upgradeOptions_ == null ? com.google.container.v1.AutoUpgradeOptions.getDefaultInstance() : upgradeOptions_;
  }
  /**
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>optional .google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
   */
  private void setUpgradeOptions(com.google.container.v1.AutoUpgradeOptions value) {
    if (value == null) {
      throw new NullPointerException();
    }
    upgradeOptions_ = value;
    
    }
  /**
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>optional .google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
   */
  private void setUpgradeOptions(
      com.google.container.v1.AutoUpgradeOptions.Builder builderForValue) {
    upgradeOptions_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>optional .google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
   */
  private void mergeUpgradeOptions(com.google.container.v1.AutoUpgradeOptions value) {
    if (upgradeOptions_ != null &&
        upgradeOptions_ != com.google.container.v1.AutoUpgradeOptions.getDefaultInstance()) {
      upgradeOptions_ =
        com.google.container.v1.AutoUpgradeOptions.newBuilder(upgradeOptions_).mergeFrom(value).buildPartial();
    } else {
      upgradeOptions_ = value;
    }
    
  }
  /**
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>optional .google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
   */
  private void clearUpgradeOptions() {  upgradeOptions_ = null;
    
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (autoUpgrade_ != false) {
      output.writeBool(1, autoUpgrade_);
    }
    if (upgradeOptions_ != null) {
      output.writeMessage(10, getUpgradeOptions());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (autoUpgrade_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, autoUpgrade_);
    }
    if (upgradeOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, getUpgradeOptions());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.container.v1.NodeManagement parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.container.v1.NodeManagement parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.container.v1.NodeManagement parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.container.v1.NodeManagement parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.container.v1.NodeManagement parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.container.v1.NodeManagement parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.container.v1.NodeManagement parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.container.v1.NodeManagement parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.container.v1.NodeManagement parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.container.v1.NodeManagement parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.container.v1.NodeManagement prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * NodeManagement defines the set of node management services turned on for the
   * node pool.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.NodeManagement}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.container.v1.NodeManagement, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.NodeManagement)
      com.google.container.v1.NodeManagementOrBuilder {
    // Construct using com.google.container.v1.NodeManagement.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Whether the nodes will be automatically upgraded.
     * </pre>
     *
     * <code>optional bool auto_upgrade = 1;</code>
     */
    public boolean getAutoUpgrade() {
      return instance.getAutoUpgrade();
    }
    /**
     * <pre>
     * Whether the nodes will be automatically upgraded.
     * </pre>
     *
     * <code>optional bool auto_upgrade = 1;</code>
     */
    public Builder setAutoUpgrade(boolean value) {
      copyOnWrite();
      instance.setAutoUpgrade(value);
      return this;
    }
    /**
     * <pre>
     * Whether the nodes will be automatically upgraded.
     * </pre>
     *
     * <code>optional bool auto_upgrade = 1;</code>
     */
    public Builder clearAutoUpgrade() {
      copyOnWrite();
      instance.clearAutoUpgrade();
      return this;
    }

    /**
     * <pre>
     * Specifies the Auto Upgrade knobs for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
     */
    public boolean hasUpgradeOptions() {
      return instance.hasUpgradeOptions();
    }
    /**
     * <pre>
     * Specifies the Auto Upgrade knobs for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
     */
    public com.google.container.v1.AutoUpgradeOptions getUpgradeOptions() {
      return instance.getUpgradeOptions();
    }
    /**
     * <pre>
     * Specifies the Auto Upgrade knobs for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
     */
    public Builder setUpgradeOptions(com.google.container.v1.AutoUpgradeOptions value) {
      copyOnWrite();
      instance.setUpgradeOptions(value);
      return this;
      }
    /**
     * <pre>
     * Specifies the Auto Upgrade knobs for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
     */
    public Builder setUpgradeOptions(
        com.google.container.v1.AutoUpgradeOptions.Builder builderForValue) {
      copyOnWrite();
      instance.setUpgradeOptions(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Specifies the Auto Upgrade knobs for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
     */
    public Builder mergeUpgradeOptions(com.google.container.v1.AutoUpgradeOptions value) {
      copyOnWrite();
      instance.mergeUpgradeOptions(value);
      return this;
    }
    /**
     * <pre>
     * Specifies the Auto Upgrade knobs for the node pool.
     * </pre>
     *
     * <code>optional .google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
     */
    public Builder clearUpgradeOptions() {  copyOnWrite();
      instance.clearUpgradeOptions();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.container.v1.NodeManagement)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.container.v1.NodeManagement();
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
        com.google.container.v1.NodeManagement other = (com.google.container.v1.NodeManagement) arg1;
        autoUpgrade_ = visitor.visitBoolean(autoUpgrade_ != false, autoUpgrade_,
            other.autoUpgrade_ != false, other.autoUpgrade_);
        upgradeOptions_ = visitor.visitMessage(upgradeOptions_, other.upgradeOptions_);
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
              case 8: {

                autoUpgrade_ = input.readBool();
                break;
              }
              case 82: {
                com.google.container.v1.AutoUpgradeOptions.Builder subBuilder = null;
                if (upgradeOptions_ != null) {
                  subBuilder = upgradeOptions_.toBuilder();
                }
                upgradeOptions_ = input.readMessage(com.google.container.v1.AutoUpgradeOptions.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(upgradeOptions_);
                  upgradeOptions_ = subBuilder.buildPartial();
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
        if (PARSER == null) {    synchronized (com.google.container.v1.NodeManagement.class) {
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


  // @@protoc_insertion_point(class_scope:google.container.v1.NodeManagement)
  private static final com.google.container.v1.NodeManagement DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new NodeManagement();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.container.v1.NodeManagement getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<NodeManagement> PARSER;

  public static com.google.protobuf.Parser<NodeManagement> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

