// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/resources.proto

package com.google.api.servicemanagement.v1;

public interface ConfigFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.ConfigFile)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The file name of the configuration file (full or relative path).
   * </pre>
   *
   * <code>optional string file_path = 1;</code>
   */
  java.lang.String getFilePath();
  /**
   * <pre>
   * The file name of the configuration file (full or relative path).
   * </pre>
   *
   * <code>optional string file_path = 1;</code>
   */
  com.google.protobuf.ByteString
      getFilePathBytes();

  /**
   * <pre>
   * The bytes that constitute the file.
   * </pre>
   *
   * <code>optional bytes file_contents = 3;</code>
   */
  com.google.protobuf.ByteString getFileContents();

  /**
   * <pre>
   * The type of configuration file this represents.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.ConfigFile.FileType file_type = 4;</code>
   */
  int getFileTypeValue();
  /**
   * <pre>
   * The type of configuration file this represents.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.ConfigFile.FileType file_type = 4;</code>
   */
  com.google.api.servicemanagement.v1.ConfigFile.FileType getFileType();
}
