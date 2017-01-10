// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/timestamp.proto

package com.google.protobuf;

/**
 * <pre>
 * A Timestamp represents a point in time independent of any time zone
 * or calendar, represented as seconds and fractions of seconds at
 * nanosecond resolution in UTC Epoch time. It is encoded using the
 * Proleptic Gregorian Calendar which extends the Gregorian calendar
 * backwards to year one. It is encoded assuming all minutes are 60
 * seconds long, i.e. leap seconds are "smeared" so that no leap second
 * table is needed for interpretation. Range is from
 * 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z.
 * By restricting to that range, we ensure that we can convert to
 * and from  RFC 3339 date strings.
 * See [https://www.ietf.org/rfc/rfc3339.txt](https://www.ietf.org/rfc/rfc3339.txt).
 * Example 1: Compute Timestamp from POSIX `time()`.
 *     Timestamp timestamp;
 *     timestamp.set_seconds(time(NULL));
 *     timestamp.set_nanos(0);
 * Example 2: Compute Timestamp from POSIX `gettimeofday()`.
 *     struct timeval tv;
 *     gettimeofday(&amp;tv, NULL);
 *     Timestamp timestamp;
 *     timestamp.set_seconds(tv.tv_sec);
 *     timestamp.set_nanos(tv.tv_usec * 1000);
 * Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.
 *     FILETIME ft;
 *     GetSystemTimeAsFileTime(&amp;ft);
 *     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;
 *     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z
 *     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.
 *     Timestamp timestamp;
 *     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));
 *     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100));
 * Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.
 *     long millis = System.currentTimeMillis();
 *     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)
 *         .setNanos((int) ((millis % 1000) * 1000000)).build();
 * Example 5: Compute Timestamp from current time in Python.
 *     timestamp = Timestamp()
 *     timestamp.GetCurrentTime()
 * </pre>
 *
 * Protobuf type {@code google.protobuf.Timestamp}
 */
public  final class Timestamp extends
    com.google.protobuf.GeneratedMessageLite<
        Timestamp, Timestamp.Builder> implements
    // @@protoc_insertion_point(message_implements:google.protobuf.Timestamp)
    TimestampOrBuilder {
  private Timestamp() {
  }
  public static final int SECONDS_FIELD_NUMBER = 1;
  private long seconds_;
  /**
   * <pre>
   * Represents seconds of UTC time since Unix epoch
   * 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
   * 9999-12-31T23:59:59Z inclusive.
   * </pre>
   *
   * <code>optional int64 seconds = 1;</code>
   */
  public long getSeconds() {
    return seconds_;
  }
  /**
   * <pre>
   * Represents seconds of UTC time since Unix epoch
   * 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
   * 9999-12-31T23:59:59Z inclusive.
   * </pre>
   *
   * <code>optional int64 seconds = 1;</code>
   */
  private void setSeconds(long value) {
    
    seconds_ = value;
  }
  /**
   * <pre>
   * Represents seconds of UTC time since Unix epoch
   * 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
   * 9999-12-31T23:59:59Z inclusive.
   * </pre>
   *
   * <code>optional int64 seconds = 1;</code>
   */
  private void clearSeconds() {
    
    seconds_ = 0L;
  }

  public static final int NANOS_FIELD_NUMBER = 2;
  private int nanos_;
  /**
   * <pre>
   * Non-negative fractions of a second at nanosecond resolution. Negative
   * second values with fractions must still have non-negative nanos values
   * that count forward in time. Must be from 0 to 999,999,999
   * inclusive.
   * </pre>
   *
   * <code>optional int32 nanos = 2;</code>
   */
  public int getNanos() {
    return nanos_;
  }
  /**
   * <pre>
   * Non-negative fractions of a second at nanosecond resolution. Negative
   * second values with fractions must still have non-negative nanos values
   * that count forward in time. Must be from 0 to 999,999,999
   * inclusive.
   * </pre>
   *
   * <code>optional int32 nanos = 2;</code>
   */
  private void setNanos(int value) {
    
    nanos_ = value;
  }
  /**
   * <pre>
   * Non-negative fractions of a second at nanosecond resolution. Negative
   * second values with fractions must still have non-negative nanos values
   * that count forward in time. Must be from 0 to 999,999,999
   * inclusive.
   * </pre>
   *
   * <code>optional int32 nanos = 2;</code>
   */
  private void clearNanos() {
    
    nanos_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (seconds_ != 0L) {
      output.writeInt64(1, seconds_);
    }
    if (nanos_ != 0) {
      output.writeInt32(2, nanos_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (seconds_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, seconds_);
    }
    if (nanos_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, nanos_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.protobuf.Timestamp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Timestamp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Timestamp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Timestamp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Timestamp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Timestamp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.protobuf.Timestamp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Timestamp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.protobuf.Timestamp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Timestamp parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.protobuf.Timestamp prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * A Timestamp represents a point in time independent of any time zone
   * or calendar, represented as seconds and fractions of seconds at
   * nanosecond resolution in UTC Epoch time. It is encoded using the
   * Proleptic Gregorian Calendar which extends the Gregorian calendar
   * backwards to year one. It is encoded assuming all minutes are 60
   * seconds long, i.e. leap seconds are "smeared" so that no leap second
   * table is needed for interpretation. Range is from
   * 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z.
   * By restricting to that range, we ensure that we can convert to
   * and from  RFC 3339 date strings.
   * See [https://www.ietf.org/rfc/rfc3339.txt](https://www.ietf.org/rfc/rfc3339.txt).
   * Example 1: Compute Timestamp from POSIX `time()`.
   *     Timestamp timestamp;
   *     timestamp.set_seconds(time(NULL));
   *     timestamp.set_nanos(0);
   * Example 2: Compute Timestamp from POSIX `gettimeofday()`.
   *     struct timeval tv;
   *     gettimeofday(&amp;tv, NULL);
   *     Timestamp timestamp;
   *     timestamp.set_seconds(tv.tv_sec);
   *     timestamp.set_nanos(tv.tv_usec * 1000);
   * Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.
   *     FILETIME ft;
   *     GetSystemTimeAsFileTime(&amp;ft);
   *     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;
   *     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z
   *     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.
   *     Timestamp timestamp;
   *     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));
   *     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100));
   * Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.
   *     long millis = System.currentTimeMillis();
   *     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)
   *         .setNanos((int) ((millis % 1000) * 1000000)).build();
   * Example 5: Compute Timestamp from current time in Python.
   *     timestamp = Timestamp()
   *     timestamp.GetCurrentTime()
   * </pre>
   *
   * Protobuf type {@code google.protobuf.Timestamp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.protobuf.Timestamp, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.Timestamp)
      com.google.protobuf.TimestampOrBuilder {
    // Construct using com.google.protobuf.Timestamp.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Represents seconds of UTC time since Unix epoch
     * 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
     * 9999-12-31T23:59:59Z inclusive.
     * </pre>
     *
     * <code>optional int64 seconds = 1;</code>
     */
    public long getSeconds() {
      return instance.getSeconds();
    }
    /**
     * <pre>
     * Represents seconds of UTC time since Unix epoch
     * 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
     * 9999-12-31T23:59:59Z inclusive.
     * </pre>
     *
     * <code>optional int64 seconds = 1;</code>
     */
    public Builder setSeconds(long value) {
      copyOnWrite();
      instance.setSeconds(value);
      return this;
    }
    /**
     * <pre>
     * Represents seconds of UTC time since Unix epoch
     * 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
     * 9999-12-31T23:59:59Z inclusive.
     * </pre>
     *
     * <code>optional int64 seconds = 1;</code>
     */
    public Builder clearSeconds() {
      copyOnWrite();
      instance.clearSeconds();
      return this;
    }

    /**
     * <pre>
     * Non-negative fractions of a second at nanosecond resolution. Negative
     * second values with fractions must still have non-negative nanos values
     * that count forward in time. Must be from 0 to 999,999,999
     * inclusive.
     * </pre>
     *
     * <code>optional int32 nanos = 2;</code>
     */
    public int getNanos() {
      return instance.getNanos();
    }
    /**
     * <pre>
     * Non-negative fractions of a second at nanosecond resolution. Negative
     * second values with fractions must still have non-negative nanos values
     * that count forward in time. Must be from 0 to 999,999,999
     * inclusive.
     * </pre>
     *
     * <code>optional int32 nanos = 2;</code>
     */
    public Builder setNanos(int value) {
      copyOnWrite();
      instance.setNanos(value);
      return this;
    }
    /**
     * <pre>
     * Non-negative fractions of a second at nanosecond resolution. Negative
     * second values with fractions must still have non-negative nanos values
     * that count forward in time. Must be from 0 to 999,999,999
     * inclusive.
     * </pre>
     *
     * <code>optional int32 nanos = 2;</code>
     */
    public Builder clearNanos() {
      copyOnWrite();
      instance.clearNanos();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.protobuf.Timestamp)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.protobuf.Timestamp();
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
        com.google.protobuf.Timestamp other = (com.google.protobuf.Timestamp) arg1;
        seconds_ = visitor.visitLong(seconds_ != 0L, seconds_,
            other.seconds_ != 0L, other.seconds_);
        nanos_ = visitor.visitInt(nanos_ != 0, nanos_,
            other.nanos_ != 0, other.nanos_);
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

                seconds_ = input.readInt64();
                break;
              }
              case 16: {

                nanos_ = input.readInt32();
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
        if (PARSER == null) {    synchronized (com.google.protobuf.Timestamp.class) {
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


  // @@protoc_insertion_point(class_scope:google.protobuf.Timestamp)
  private static final com.google.protobuf.Timestamp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Timestamp();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.protobuf.Timestamp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Timestamp> PARSER;

  public static com.google.protobuf.Parser<Timestamp> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

