// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package com.google.rpc;

public interface DebugInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.rpc.DebugInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The stack trace entries indicating where the error occurred.
   * </pre>
   *
   * <code>repeated string stack_entries = 1;</code>
   */
  java.util.List<java.lang.String>
      getStackEntriesList();
  /**
   * <pre>
   * The stack trace entries indicating where the error occurred.
   * </pre>
   *
   * <code>repeated string stack_entries = 1;</code>
   */
  int getStackEntriesCount();
  /**
   * <pre>
   * The stack trace entries indicating where the error occurred.
   * </pre>
   *
   * <code>repeated string stack_entries = 1;</code>
   */
  java.lang.String getStackEntries(int index);
  /**
   * <pre>
   * The stack trace entries indicating where the error occurred.
   * </pre>
   *
   * <code>repeated string stack_entries = 1;</code>
   */
  com.google.protobuf.ByteString
      getStackEntriesBytes(int index);

  /**
   * <pre>
   * Additional debugging information provided by the server.
   * </pre>
   *
   * <code>optional string detail = 2;</code>
   */
  java.lang.String getDetail();
  /**
   * <pre>
   * Additional debugging information provided by the server.
   * </pre>
   *
   * <code>optional string detail = 2;</code>
   */
  com.google.protobuf.ByteString
      getDetailBytes();
}
