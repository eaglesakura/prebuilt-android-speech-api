// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicecontrol/v1/metric_value.proto

package com.google.api.servicecontrol.v1;

public interface MetricValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicecontrol.v1.MetricValue)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The labels describing the metric value.
   * See comments on [google.api.servicecontrol.v1.Operation.labels][google.api.servicecontrol.v1.Operation.labels] for
   * the overriding relationship.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * The labels describing the metric value.
   * See comments on [google.api.servicecontrol.v1.Operation.labels][google.api.servicecontrol.v1.Operation.labels] for
   * the overriding relationship.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * The labels describing the metric value.
   * See comments on [google.api.servicecontrol.v1.Operation.labels][google.api.servicecontrol.v1.Operation.labels] for
   * the overriding relationship.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * The labels describing the metric value.
   * See comments on [google.api.servicecontrol.v1.Operation.labels][google.api.servicecontrol.v1.Operation.labels] for
   * the overriding relationship.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * The labels describing the metric value.
   * See comments on [google.api.servicecontrol.v1.Operation.labels][google.api.servicecontrol.v1.Operation.labels] for
   * the overriding relationship.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The start of the time period over which this metric value's measurement
   * applies. The time period has different semantics for different metric
   * types (cumulative, delta, and gauge). See the metric definition
   * documentation in the service configuration for details.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start_time = 2;</code>
   */
  boolean hasStartTime();
  /**
   * <pre>
   * The start of the time period over which this metric value's measurement
   * applies. The time period has different semantics for different metric
   * types (cumulative, delta, and gauge). See the metric definition
   * documentation in the service configuration for details.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start_time = 2;</code>
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   * <pre>
   * The end of the time period over which this metric value's measurement
   * applies.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp end_time = 3;</code>
   */
  boolean hasEndTime();
  /**
   * <pre>
   * The end of the time period over which this metric value's measurement
   * applies.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp end_time = 3;</code>
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   * <pre>
   * A boolean value.
   * </pre>
   *
   * <code>optional bool bool_value = 4;</code>
   */
  boolean getBoolValue();

  /**
   * <pre>
   * A signed 64-bit integer value.
   * </pre>
   *
   * <code>optional int64 int64_value = 5;</code>
   */
  long getInt64Value();

  /**
   * <pre>
   * A double precision floating point value.
   * </pre>
   *
   * <code>optional double double_value = 6;</code>
   */
  double getDoubleValue();

  /**
   * <pre>
   * A text string value.
   * </pre>
   *
   * <code>optional string string_value = 7;</code>
   */
  java.lang.String getStringValue();
  /**
   * <pre>
   * A text string value.
   * </pre>
   *
   * <code>optional string string_value = 7;</code>
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  /**
   * <pre>
   * A distribution value.
   * </pre>
   *
   * <code>optional .google.api.servicecontrol.v1.Distribution distribution_value = 8;</code>
   */
  com.google.api.servicecontrol.v1.Distribution getDistributionValue();

  public com.google.api.servicecontrol.v1.MetricValue.ValueCase getValueCase();
}
