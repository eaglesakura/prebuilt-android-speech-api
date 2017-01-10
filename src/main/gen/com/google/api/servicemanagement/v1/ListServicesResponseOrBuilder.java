// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

public interface ListServicesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.ListServicesResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The results of the query.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
   */
  java.util.List<com.google.api.servicemanagement.v1.ManagedService> 
      getServicesList();
  /**
   * <pre>
   * The results of the query.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
   */
  com.google.api.servicemanagement.v1.ManagedService getServices(int index);
  /**
   * <pre>
   * The results of the query.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ManagedService services = 1;</code>
   */
  int getServicesCount();

  /**
   * <pre>
   * Token that can be passed to `ListServices` to resume a paginated query.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token that can be passed to `ListServices` to resume a paginated query.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}