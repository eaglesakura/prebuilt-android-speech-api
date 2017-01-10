// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1beta1/cloud_speech.proto

package com.google.cloud.speech.v1beta1;

/**
 * <pre>
 * Provides "hints" to the speech recognizer to favor specific words and phrases
 * in the results.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1beta1.SpeechContext}
 */
public  final class SpeechContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1beta1.SpeechContext)
    SpeechContextOrBuilder {
  // Use SpeechContext.newBuilder() to construct.
  private SpeechContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpeechContext() {
    phrases_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SpeechContext(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              phrases_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            phrases_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        phrases_ = phrases_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_SpeechContext_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_SpeechContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1beta1.SpeechContext.class, com.google.cloud.speech.v1beta1.SpeechContext.Builder.class);
  }

  public static final int PHRASES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList phrases_;
  /**
   * <pre>
   * [Optional] A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech/limits#content).
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getPhrasesList() {
    return phrases_;
  }
  /**
   * <pre>
   * [Optional] A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech/limits#content).
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  public int getPhrasesCount() {
    return phrases_.size();
  }
  /**
   * <pre>
   * [Optional] A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech/limits#content).
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  public java.lang.String getPhrases(int index) {
    return phrases_.get(index);
  }
  /**
   * <pre>
   * [Optional] A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech/limits#content).
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPhrasesBytes(int index) {
    return phrases_.getByteString(index);
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
    for (int i = 0; i < phrases_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, phrases_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < phrases_.size(); i++) {
        dataSize += computeStringSizeNoTag(phrases_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPhrasesList().size();
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
    if (!(obj instanceof com.google.cloud.speech.v1beta1.SpeechContext)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1beta1.SpeechContext other = (com.google.cloud.speech.v1beta1.SpeechContext) obj;

    boolean result = true;
    result = result && getPhrasesList()
        .equals(other.getPhrasesList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getPhrasesCount() > 0) {
      hash = (37 * hash) + PHRASES_FIELD_NUMBER;
      hash = (53 * hash) + getPhrasesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1beta1.SpeechContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1beta1.SpeechContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.SpeechContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1beta1.SpeechContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.SpeechContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1beta1.SpeechContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.SpeechContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1beta1.SpeechContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.SpeechContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1beta1.SpeechContext parseFrom(
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
  public static Builder newBuilder(com.google.cloud.speech.v1beta1.SpeechContext prototype) {
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
   * Provides "hints" to the speech recognizer to favor specific words and phrases
   * in the results.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1beta1.SpeechContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1beta1.SpeechContext)
      com.google.cloud.speech.v1beta1.SpeechContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_SpeechContext_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_SpeechContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1beta1.SpeechContext.class, com.google.cloud.speech.v1beta1.SpeechContext.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1beta1.SpeechContext.newBuilder()
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
      phrases_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_SpeechContext_descriptor;
    }

    public com.google.cloud.speech.v1beta1.SpeechContext getDefaultInstanceForType() {
      return com.google.cloud.speech.v1beta1.SpeechContext.getDefaultInstance();
    }

    public com.google.cloud.speech.v1beta1.SpeechContext build() {
      com.google.cloud.speech.v1beta1.SpeechContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.speech.v1beta1.SpeechContext buildPartial() {
      com.google.cloud.speech.v1beta1.SpeechContext result = new com.google.cloud.speech.v1beta1.SpeechContext(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        phrases_ = phrases_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.phrases_ = phrases_;
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
      if (other instanceof com.google.cloud.speech.v1beta1.SpeechContext) {
        return mergeFrom((com.google.cloud.speech.v1beta1.SpeechContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1beta1.SpeechContext other) {
      if (other == com.google.cloud.speech.v1beta1.SpeechContext.getDefaultInstance()) return this;
      if (!other.phrases_.isEmpty()) {
        if (phrases_.isEmpty()) {
          phrases_ = other.phrases_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePhrasesIsMutable();
          phrases_.addAll(other.phrases_);
        }
        onChanged();
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
      com.google.cloud.speech.v1beta1.SpeechContext parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.speech.v1beta1.SpeechContext) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList phrases_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePhrasesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        phrases_ = new com.google.protobuf.LazyStringArrayList(phrases_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * [Optional] A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getPhrasesList() {
      return phrases_.getUnmodifiableView();
    }
    /**
     * <pre>
     * [Optional] A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public int getPhrasesCount() {
      return phrases_.size();
    }
    /**
     * <pre>
     * [Optional] A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public java.lang.String getPhrases(int index) {
      return phrases_.get(index);
    }
    /**
     * <pre>
     * [Optional] A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPhrasesBytes(int index) {
      return phrases_.getByteString(index);
    }
    /**
     * <pre>
     * [Optional] A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public Builder setPhrases(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePhrasesIsMutable();
      phrases_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Optional] A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public Builder addPhrases(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePhrasesIsMutable();
      phrases_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Optional] A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public Builder addAllPhrases(
        java.lang.Iterable<java.lang.String> values) {
      ensurePhrasesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, phrases_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Optional] A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public Builder clearPhrases() {
      phrases_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Optional] A list of strings containing words and phrases "hints" so that
     * the speech recognition is more likely to recognize them. This can be used
     * to improve the accuracy for specific words and phrases, for example, if
     * specific commands are typically spoken by the user. This can also be used
     * to add additional words to the vocabulary of the recognizer. See
     * [usage limits](https://cloud.google.com/speech/limits#content).
     * </pre>
     *
     * <code>repeated string phrases = 1;</code>
     */
    public Builder addPhrasesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePhrasesIsMutable();
      phrases_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1beta1.SpeechContext)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1beta1.SpeechContext)
  private static final com.google.cloud.speech.v1beta1.SpeechContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1beta1.SpeechContext();
  }

  public static com.google.cloud.speech.v1beta1.SpeechContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpeechContext>
      PARSER = new com.google.protobuf.AbstractParser<SpeechContext>() {
    public SpeechContext parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SpeechContext(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SpeechContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpeechContext> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.speech.v1beta1.SpeechContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

