// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/consumer.proto

package com.google.api;

/**
 * <pre>
 * Defines project properties.
 * API services can define properties that can be assigned to consumer projects
 * so that backends can perform response customization without having to make
 * additional calls or maintain additional storage. For example, Maps API
 * defines properties that controls map tile cache period, or whether to embed a
 * watermark in a result.
 * These values can be set via API producer console. Only API providers can
 * define and set these properties.
 * </pre>
 *
 * Protobuf type {@code google.api.Property}
 */
public  final class Property extends
    com.google.protobuf.GeneratedMessageLite<
        Property, Property.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.Property)
    PropertyOrBuilder {
  private Property() {
    name_ = "";
    description_ = "";
  }
  /**
   * <pre>
   * Supported data type of the property values
   * </pre>
   *
   * Protobuf enum {@code google.api.Property.PropertyType}
   */
  public enum PropertyType
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <pre>
     * The type is unspecified, and will result in an error.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The type is `int64`.
     * </pre>
     *
     * <code>INT64 = 1;</code>
     */
    INT64(1),
    /**
     * <pre>
     * The type is `bool`.
     * </pre>
     *
     * <code>BOOL = 2;</code>
     */
    BOOL(2),
    /**
     * <pre>
     * The type is `string`.
     * </pre>
     *
     * <code>STRING = 3;</code>
     */
    STRING(3),
    /**
     * <pre>
     * The type is 'double'.
     * </pre>
     *
     * <code>DOUBLE = 4;</code>
     */
    DOUBLE(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * The type is unspecified, and will result in an error.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The type is `int64`.
     * </pre>
     *
     * <code>INT64 = 1;</code>
     */
    public static final int INT64_VALUE = 1;
    /**
     * <pre>
     * The type is `bool`.
     * </pre>
     *
     * <code>BOOL = 2;</code>
     */
    public static final int BOOL_VALUE = 2;
    /**
     * <pre>
     * The type is `string`.
     * </pre>
     *
     * <code>STRING = 3;</code>
     */
    public static final int STRING_VALUE = 3;
    /**
     * <pre>
     * The type is 'double'.
     * </pre>
     *
     * <code>DOUBLE = 4;</code>
     */
    public static final int DOUBLE_VALUE = 4;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PropertyType valueOf(int value) {
      return forNumber(value);
    }

    public static PropertyType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return INT64;
        case 2: return BOOL;
        case 3: return STRING;
        case 4: return DOUBLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PropertyType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PropertyType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PropertyType>() {
            public PropertyType findValueByNumber(int number) {
              return PropertyType.forNumber(number);
            }
          };

    private final int value;

    private PropertyType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.api.Property.PropertyType)
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.String name_;
  /**
   * <pre>
   * The name of the property (a.k.a key).
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * The name of the property (a.k.a key).
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * The name of the property (a.k.a key).
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  private void setName(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    name_ = value;
  }
  /**
   * <pre>
   * The name of the property (a.k.a key).
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  private void clearName() {
    
    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * The name of the property (a.k.a key).
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    name_ = value.toStringUtf8();
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <pre>
   * The type of this property.
   * </pre>
   *
   * <code>optional .google.api.Property.PropertyType type = 2;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * The type of this property.
   * </pre>
   *
   * <code>optional .google.api.Property.PropertyType type = 2;</code>
   */
  public com.google.api.Property.PropertyType getType() {
    com.google.api.Property.PropertyType result = com.google.api.Property.PropertyType.forNumber(type_);
    return result == null ? com.google.api.Property.PropertyType.UNRECOGNIZED : result;
  }
  /**
   * <pre>
   * The type of this property.
   * </pre>
   *
   * <code>optional .google.api.Property.PropertyType type = 2;</code>
   */
  private void setTypeValue(int value) {
      type_ = value;
  }
  /**
   * <pre>
   * The type of this property.
   * </pre>
   *
   * <code>optional .google.api.Property.PropertyType type = 2;</code>
   */
  private void setType(com.google.api.Property.PropertyType value) {
    if (value == null) {
      throw new NullPointerException();
    }
    
    type_ = value.getNumber();
  }
  /**
   * <pre>
   * The type of this property.
   * </pre>
   *
   * <code>optional .google.api.Property.PropertyType type = 2;</code>
   */
  private void clearType() {
    
    type_ = 0;
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private java.lang.String description_;
  /**
   * <pre>
   * The description of the property
   * </pre>
   *
   * <code>optional string description = 3;</code>
   */
  public java.lang.String getDescription() {
    return description_;
  }
  /**
   * <pre>
   * The description of the property
   * </pre>
   *
   * <code>optional string description = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(description_);
  }
  /**
   * <pre>
   * The description of the property
   * </pre>
   *
   * <code>optional string description = 3;</code>
   */
  private void setDescription(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    description_ = value;
  }
  /**
   * <pre>
   * The description of the property
   * </pre>
   *
   * <code>optional string description = 3;</code>
   */
  private void clearDescription() {
    
    description_ = getDefaultInstance().getDescription();
  }
  /**
   * <pre>
   * The description of the property
   * </pre>
   *
   * <code>optional string description = 3;</code>
   */
  private void setDescriptionBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    description_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!name_.isEmpty()) {
      output.writeString(1, getName());
    }
    if (type_ != com.google.api.Property.PropertyType.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (!description_.isEmpty()) {
      output.writeString(3, getDescription());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!name_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getName());
    }
    if (type_ != com.google.api.Property.PropertyType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (!description_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getDescription());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.api.Property parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.Property parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.Property parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.Property parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.Property parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.Property parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.Property parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.Property parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.Property parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.Property parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.Property prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Defines project properties.
   * API services can define properties that can be assigned to consumer projects
   * so that backends can perform response customization without having to make
   * additional calls or maintain additional storage. For example, Maps API
   * defines properties that controls map tile cache period, or whether to embed a
   * watermark in a result.
   * These values can be set via API producer console. Only API providers can
   * define and set these properties.
   * </pre>
   *
   * Protobuf type {@code google.api.Property}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.Property, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.Property)
      com.google.api.PropertyOrBuilder {
    // Construct using com.google.api.Property.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The name of the property (a.k.a key).
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * The name of the property (a.k.a key).
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * The name of the property (a.k.a key).
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * The name of the property (a.k.a key).
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * The name of the property (a.k.a key).
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * The type of this property.
     * </pre>
     *
     * <code>optional .google.api.Property.PropertyType type = 2;</code>
     */
    public int getTypeValue() {
      return instance.getTypeValue();
    }
    /**
     * <pre>
     * The type of this property.
     * </pre>
     *
     * <code>optional .google.api.Property.PropertyType type = 2;</code>
     */
    public Builder setTypeValue(int value) {
      copyOnWrite();
      instance.setTypeValue(value);
      return this;
    }
    /**
     * <pre>
     * The type of this property.
     * </pre>
     *
     * <code>optional .google.api.Property.PropertyType type = 2;</code>
     */
    public com.google.api.Property.PropertyType getType() {
      return instance.getType();
    }
    /**
     * <pre>
     * The type of this property.
     * </pre>
     *
     * <code>optional .google.api.Property.PropertyType type = 2;</code>
     */
    public Builder setType(com.google.api.Property.PropertyType value) {
      copyOnWrite();
      instance.setType(value);
      return this;
    }
    /**
     * <pre>
     * The type of this property.
     * </pre>
     *
     * <code>optional .google.api.Property.PropertyType type = 2;</code>
     */
    public Builder clearType() {
      copyOnWrite();
      instance.clearType();
      return this;
    }

    /**
     * <pre>
     * The description of the property
     * </pre>
     *
     * <code>optional string description = 3;</code>
     */
    public java.lang.String getDescription() {
      return instance.getDescription();
    }
    /**
     * <pre>
     * The description of the property
     * </pre>
     *
     * <code>optional string description = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      return instance.getDescriptionBytes();
    }
    /**
     * <pre>
     * The description of the property
     * </pre>
     *
     * <code>optional string description = 3;</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      copyOnWrite();
      instance.setDescription(value);
      return this;
    }
    /**
     * <pre>
     * The description of the property
     * </pre>
     *
     * <code>optional string description = 3;</code>
     */
    public Builder clearDescription() {
      copyOnWrite();
      instance.clearDescription();
      return this;
    }
    /**
     * <pre>
     * The description of the property
     * </pre>
     *
     * <code>optional string description = 3;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDescriptionBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.Property)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.Property();
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
        com.google.api.Property other = (com.google.api.Property) arg1;
        name_ = visitor.visitString(!name_.isEmpty(), name_,
            !other.name_.isEmpty(), other.name_);
        type_ = visitor.visitInt(type_ != 0, type_,    other.type_ != 0, other.type_);
        description_ = visitor.visitString(!description_.isEmpty(), description_,
            !other.description_.isEmpty(), other.description_);
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
                String s = input.readStringRequireUtf8();

                name_ = s;
                break;
              }
              case 16: {
                int rawValue = input.readEnum();

                type_ = rawValue;
                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                description_ = s;
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
        if (PARSER == null) {    synchronized (com.google.api.Property.class) {
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


  // @@protoc_insertion_point(class_scope:google.api.Property)
  private static final com.google.api.Property DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Property();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.api.Property getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Property> PARSER;

  public static com.google.protobuf.Parser<Property> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

