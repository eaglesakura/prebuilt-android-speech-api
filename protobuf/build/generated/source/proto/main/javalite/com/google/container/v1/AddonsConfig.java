// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 * <pre>
 * Configuration for the addons that can be automatically spun up in the
 * cluster, enabling additional functionality.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.AddonsConfig}
 */
public  final class AddonsConfig extends
    com.google.protobuf.GeneratedMessageLite<
        AddonsConfig, AddonsConfig.Builder> implements
    // @@protoc_insertion_point(message_implements:google.container.v1.AddonsConfig)
    AddonsConfigOrBuilder {
  private AddonsConfig() {
  }
  public static final int HTTP_LOAD_BALANCING_FIELD_NUMBER = 1;
  private com.google.container.v1.HttpLoadBalancing httpLoadBalancing_;
  /**
   * <pre>
   * Configuration for the HTTP (L7) load balancing controller addon, which
   * makes it easy to set up HTTP load balancers for services in a cluster.
   * </pre>
   *
   * <code>optional .google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
   */
  public boolean hasHttpLoadBalancing() {
    return httpLoadBalancing_ != null;
  }
  /**
   * <pre>
   * Configuration for the HTTP (L7) load balancing controller addon, which
   * makes it easy to set up HTTP load balancers for services in a cluster.
   * </pre>
   *
   * <code>optional .google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
   */
  public com.google.container.v1.HttpLoadBalancing getHttpLoadBalancing() {
    return httpLoadBalancing_ == null ? com.google.container.v1.HttpLoadBalancing.getDefaultInstance() : httpLoadBalancing_;
  }
  /**
   * <pre>
   * Configuration for the HTTP (L7) load balancing controller addon, which
   * makes it easy to set up HTTP load balancers for services in a cluster.
   * </pre>
   *
   * <code>optional .google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
   */
  private void setHttpLoadBalancing(com.google.container.v1.HttpLoadBalancing value) {
    if (value == null) {
      throw new NullPointerException();
    }
    httpLoadBalancing_ = value;
    
    }
  /**
   * <pre>
   * Configuration for the HTTP (L7) load balancing controller addon, which
   * makes it easy to set up HTTP load balancers for services in a cluster.
   * </pre>
   *
   * <code>optional .google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
   */
  private void setHttpLoadBalancing(
      com.google.container.v1.HttpLoadBalancing.Builder builderForValue) {
    httpLoadBalancing_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Configuration for the HTTP (L7) load balancing controller addon, which
   * makes it easy to set up HTTP load balancers for services in a cluster.
   * </pre>
   *
   * <code>optional .google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
   */
  private void mergeHttpLoadBalancing(com.google.container.v1.HttpLoadBalancing value) {
    if (httpLoadBalancing_ != null &&
        httpLoadBalancing_ != com.google.container.v1.HttpLoadBalancing.getDefaultInstance()) {
      httpLoadBalancing_ =
        com.google.container.v1.HttpLoadBalancing.newBuilder(httpLoadBalancing_).mergeFrom(value).buildPartial();
    } else {
      httpLoadBalancing_ = value;
    }
    
  }
  /**
   * <pre>
   * Configuration for the HTTP (L7) load balancing controller addon, which
   * makes it easy to set up HTTP load balancers for services in a cluster.
   * </pre>
   *
   * <code>optional .google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
   */
  private void clearHttpLoadBalancing() {  httpLoadBalancing_ = null;
    
  }

  public static final int HORIZONTAL_POD_AUTOSCALING_FIELD_NUMBER = 2;
  private com.google.container.v1.HorizontalPodAutoscaling horizontalPodAutoscaling_;
  /**
   * <pre>
   * Configuration for the horizontal pod autoscaling feature, which
   * increases or decreases the number of replica pods a replication controller
   * has based on the resource usage of the existing pods.
   * </pre>
   *
   * <code>optional .google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
   */
  public boolean hasHorizontalPodAutoscaling() {
    return horizontalPodAutoscaling_ != null;
  }
  /**
   * <pre>
   * Configuration for the horizontal pod autoscaling feature, which
   * increases or decreases the number of replica pods a replication controller
   * has based on the resource usage of the existing pods.
   * </pre>
   *
   * <code>optional .google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
   */
  public com.google.container.v1.HorizontalPodAutoscaling getHorizontalPodAutoscaling() {
    return horizontalPodAutoscaling_ == null ? com.google.container.v1.HorizontalPodAutoscaling.getDefaultInstance() : horizontalPodAutoscaling_;
  }
  /**
   * <pre>
   * Configuration for the horizontal pod autoscaling feature, which
   * increases or decreases the number of replica pods a replication controller
   * has based on the resource usage of the existing pods.
   * </pre>
   *
   * <code>optional .google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
   */
  private void setHorizontalPodAutoscaling(com.google.container.v1.HorizontalPodAutoscaling value) {
    if (value == null) {
      throw new NullPointerException();
    }
    horizontalPodAutoscaling_ = value;
    
    }
  /**
   * <pre>
   * Configuration for the horizontal pod autoscaling feature, which
   * increases or decreases the number of replica pods a replication controller
   * has based on the resource usage of the existing pods.
   * </pre>
   *
   * <code>optional .google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
   */
  private void setHorizontalPodAutoscaling(
      com.google.container.v1.HorizontalPodAutoscaling.Builder builderForValue) {
    horizontalPodAutoscaling_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Configuration for the horizontal pod autoscaling feature, which
   * increases or decreases the number of replica pods a replication controller
   * has based on the resource usage of the existing pods.
   * </pre>
   *
   * <code>optional .google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
   */
  private void mergeHorizontalPodAutoscaling(com.google.container.v1.HorizontalPodAutoscaling value) {
    if (horizontalPodAutoscaling_ != null &&
        horizontalPodAutoscaling_ != com.google.container.v1.HorizontalPodAutoscaling.getDefaultInstance()) {
      horizontalPodAutoscaling_ =
        com.google.container.v1.HorizontalPodAutoscaling.newBuilder(horizontalPodAutoscaling_).mergeFrom(value).buildPartial();
    } else {
      horizontalPodAutoscaling_ = value;
    }
    
  }
  /**
   * <pre>
   * Configuration for the horizontal pod autoscaling feature, which
   * increases or decreases the number of replica pods a replication controller
   * has based on the resource usage of the existing pods.
   * </pre>
   *
   * <code>optional .google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
   */
  private void clearHorizontalPodAutoscaling() {  horizontalPodAutoscaling_ = null;
    
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (httpLoadBalancing_ != null) {
      output.writeMessage(1, getHttpLoadBalancing());
    }
    if (horizontalPodAutoscaling_ != null) {
      output.writeMessage(2, getHorizontalPodAutoscaling());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (httpLoadBalancing_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHttpLoadBalancing());
    }
    if (horizontalPodAutoscaling_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHorizontalPodAutoscaling());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.container.v1.AddonsConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.container.v1.AddonsConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.container.v1.AddonsConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.container.v1.AddonsConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.container.v1.AddonsConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.container.v1.AddonsConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.container.v1.AddonsConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.container.v1.AddonsConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.container.v1.AddonsConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.container.v1.AddonsConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.container.v1.AddonsConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Configuration for the addons that can be automatically spun up in the
   * cluster, enabling additional functionality.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.AddonsConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.container.v1.AddonsConfig, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.AddonsConfig)
      com.google.container.v1.AddonsConfigOrBuilder {
    // Construct using com.google.container.v1.AddonsConfig.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Configuration for the HTTP (L7) load balancing controller addon, which
     * makes it easy to set up HTTP load balancers for services in a cluster.
     * </pre>
     *
     * <code>optional .google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
     */
    public boolean hasHttpLoadBalancing() {
      return instance.hasHttpLoadBalancing();
    }
    /**
     * <pre>
     * Configuration for the HTTP (L7) load balancing controller addon, which
     * makes it easy to set up HTTP load balancers for services in a cluster.
     * </pre>
     *
     * <code>optional .google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
     */
    public com.google.container.v1.HttpLoadBalancing getHttpLoadBalancing() {
      return instance.getHttpLoadBalancing();
    }
    /**
     * <pre>
     * Configuration for the HTTP (L7) load balancing controller addon, which
     * makes it easy to set up HTTP load balancers for services in a cluster.
     * </pre>
     *
     * <code>optional .google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
     */
    public Builder setHttpLoadBalancing(com.google.container.v1.HttpLoadBalancing value) {
      copyOnWrite();
      instance.setHttpLoadBalancing(value);
      return this;
      }
    /**
     * <pre>
     * Configuration for the HTTP (L7) load balancing controller addon, which
     * makes it easy to set up HTTP load balancers for services in a cluster.
     * </pre>
     *
     * <code>optional .google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
     */
    public Builder setHttpLoadBalancing(
        com.google.container.v1.HttpLoadBalancing.Builder builderForValue) {
      copyOnWrite();
      instance.setHttpLoadBalancing(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Configuration for the HTTP (L7) load balancing controller addon, which
     * makes it easy to set up HTTP load balancers for services in a cluster.
     * </pre>
     *
     * <code>optional .google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
     */
    public Builder mergeHttpLoadBalancing(com.google.container.v1.HttpLoadBalancing value) {
      copyOnWrite();
      instance.mergeHttpLoadBalancing(value);
      return this;
    }
    /**
     * <pre>
     * Configuration for the HTTP (L7) load balancing controller addon, which
     * makes it easy to set up HTTP load balancers for services in a cluster.
     * </pre>
     *
     * <code>optional .google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
     */
    public Builder clearHttpLoadBalancing() {  copyOnWrite();
      instance.clearHttpLoadBalancing();
      return this;
    }

    /**
     * <pre>
     * Configuration for the horizontal pod autoscaling feature, which
     * increases or decreases the number of replica pods a replication controller
     * has based on the resource usage of the existing pods.
     * </pre>
     *
     * <code>optional .google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
     */
    public boolean hasHorizontalPodAutoscaling() {
      return instance.hasHorizontalPodAutoscaling();
    }
    /**
     * <pre>
     * Configuration for the horizontal pod autoscaling feature, which
     * increases or decreases the number of replica pods a replication controller
     * has based on the resource usage of the existing pods.
     * </pre>
     *
     * <code>optional .google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
     */
    public com.google.container.v1.HorizontalPodAutoscaling getHorizontalPodAutoscaling() {
      return instance.getHorizontalPodAutoscaling();
    }
    /**
     * <pre>
     * Configuration for the horizontal pod autoscaling feature, which
     * increases or decreases the number of replica pods a replication controller
     * has based on the resource usage of the existing pods.
     * </pre>
     *
     * <code>optional .google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
     */
    public Builder setHorizontalPodAutoscaling(com.google.container.v1.HorizontalPodAutoscaling value) {
      copyOnWrite();
      instance.setHorizontalPodAutoscaling(value);
      return this;
      }
    /**
     * <pre>
     * Configuration for the horizontal pod autoscaling feature, which
     * increases or decreases the number of replica pods a replication controller
     * has based on the resource usage of the existing pods.
     * </pre>
     *
     * <code>optional .google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
     */
    public Builder setHorizontalPodAutoscaling(
        com.google.container.v1.HorizontalPodAutoscaling.Builder builderForValue) {
      copyOnWrite();
      instance.setHorizontalPodAutoscaling(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Configuration for the horizontal pod autoscaling feature, which
     * increases or decreases the number of replica pods a replication controller
     * has based on the resource usage of the existing pods.
     * </pre>
     *
     * <code>optional .google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
     */
    public Builder mergeHorizontalPodAutoscaling(com.google.container.v1.HorizontalPodAutoscaling value) {
      copyOnWrite();
      instance.mergeHorizontalPodAutoscaling(value);
      return this;
    }
    /**
     * <pre>
     * Configuration for the horizontal pod autoscaling feature, which
     * increases or decreases the number of replica pods a replication controller
     * has based on the resource usage of the existing pods.
     * </pre>
     *
     * <code>optional .google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
     */
    public Builder clearHorizontalPodAutoscaling() {  copyOnWrite();
      instance.clearHorizontalPodAutoscaling();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.container.v1.AddonsConfig)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.container.v1.AddonsConfig();
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
        com.google.container.v1.AddonsConfig other = (com.google.container.v1.AddonsConfig) arg1;
        httpLoadBalancing_ = visitor.visitMessage(httpLoadBalancing_, other.httpLoadBalancing_);
        horizontalPodAutoscaling_ = visitor.visitMessage(horizontalPodAutoscaling_, other.horizontalPodAutoscaling_);
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
                com.google.container.v1.HttpLoadBalancing.Builder subBuilder = null;
                if (httpLoadBalancing_ != null) {
                  subBuilder = httpLoadBalancing_.toBuilder();
                }
                httpLoadBalancing_ = input.readMessage(com.google.container.v1.HttpLoadBalancing.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(httpLoadBalancing_);
                  httpLoadBalancing_ = subBuilder.buildPartial();
                }

                break;
              }
              case 18: {
                com.google.container.v1.HorizontalPodAutoscaling.Builder subBuilder = null;
                if (horizontalPodAutoscaling_ != null) {
                  subBuilder = horizontalPodAutoscaling_.toBuilder();
                }
                horizontalPodAutoscaling_ = input.readMessage(com.google.container.v1.HorizontalPodAutoscaling.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(horizontalPodAutoscaling_);
                  horizontalPodAutoscaling_ = subBuilder.buildPartial();
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
        if (PARSER == null) {    synchronized (com.google.container.v1.AddonsConfig.class) {
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


  // @@protoc_insertion_point(class_scope:google.container.v1.AddonsConfig)
  private static final com.google.container.v1.AddonsConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AddonsConfig();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.container.v1.AddonsConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AddonsConfig> PARSER;

  public static com.google.protobuf.Parser<AddonsConfig> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
