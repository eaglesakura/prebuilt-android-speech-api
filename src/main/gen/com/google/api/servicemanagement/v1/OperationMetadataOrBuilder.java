// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/resources.proto

package com.google.api.servicemanagement.v1;

public interface OperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.OperationMetadata)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The full name of the resources that this operation is directly
   * associated with.
   * </pre>
   *
   * <code>repeated string resource_names = 1;</code>
   */
  java.util.List<String>
      getResourceNamesList();
  /**
   * <pre>
   * The full name of the resources that this operation is directly
   * associated with.
   * </pre>
   *
   * <code>repeated string resource_names = 1;</code>
   */
  int getResourceNamesCount();
  /**
   * <pre>
   * The full name of the resources that this operation is directly
   * associated with.
   * </pre>
   *
   * <code>repeated string resource_names = 1;</code>
   */
  java.lang.String getResourceNames(int index);
  /**
   * <pre>
   * The full name of the resources that this operation is directly
   * associated with.
   * </pre>
   *
   * <code>repeated string resource_names = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNamesBytes(int index);

  /**
   * <pre>
   * Detailed status information for each step. The order is undetermined.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.OperationMetadata.Step steps = 2;</code>
   */
  java.util.List<com.google.api.servicemanagement.v1.OperationMetadata.Step> 
      getStepsList();
  /**
   * <pre>
   * Detailed status information for each step. The order is undetermined.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.OperationMetadata.Step steps = 2;</code>
   */
  com.google.api.servicemanagement.v1.OperationMetadata.Step getSteps(int index);
  /**
   * <pre>
   * Detailed status information for each step. The order is undetermined.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.OperationMetadata.Step steps = 2;</code>
   */
  int getStepsCount();

  /**
   * <pre>
   * Percentage of completion of this operation, ranging from 0 to 100.
   * </pre>
   *
   * <code>optional int32 progress_percentage = 3;</code>
   */
  int getProgressPercentage();

  /**
   * <pre>
   * The start time of the operation.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start_time = 4;</code>
   */
  boolean hasStartTime();
  /**
   * <pre>
   * The start time of the operation.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start_time = 4;</code>
   */
  com.google.protobuf.Timestamp getStartTime();
}
