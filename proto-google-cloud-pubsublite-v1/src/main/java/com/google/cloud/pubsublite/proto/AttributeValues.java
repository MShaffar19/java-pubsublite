// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/common.proto

package com.google.cloud.pubsublite.proto;

/**
 * <pre>
 * The values associated with a key of an attribute.
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.AttributeValues}
 */
public  final class AttributeValues extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.AttributeValues)
    AttributeValuesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AttributeValues.newBuilder() to construct.
  private AttributeValues(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AttributeValues() {
    values_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AttributeValues();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AttributeValues(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              values_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000001;
            }
            values_.add(input.readBytes());
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        values_ = java.util.Collections.unmodifiableList(values_); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.pubsublite.proto.CommonProto.internal_static_google_cloud_pubsublite_v1_AttributeValues_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.CommonProto.internal_static_google_cloud_pubsublite_v1_AttributeValues_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.AttributeValues.class, com.google.cloud.pubsublite.proto.AttributeValues.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;
  private java.util.List<com.google.protobuf.ByteString> values_;
  /**
   * <pre>
   * The list of values associated with a key.
   * </pre>
   *
   * <code>repeated bytes values = 1;</code>
   * @return A list containing the values.
   */
  public java.util.List<com.google.protobuf.ByteString>
      getValuesList() {
    return values_;
  }
  /**
   * <pre>
   * The list of values associated with a key.
   * </pre>
   *
   * <code>repeated bytes values = 1;</code>
   * @return The count of values.
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <pre>
   * The list of values associated with a key.
   * </pre>
   *
   * <code>repeated bytes values = 1;</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  public com.google.protobuf.ByteString getValues(int index) {
    return values_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < values_.size(); i++) {
      output.writeBytes(1, values_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < values_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(values_.get(i));
      }
      size += dataSize;
      size += 1 * getValuesList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.pubsublite.proto.AttributeValues)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.AttributeValues other = (com.google.cloud.pubsublite.proto.AttributeValues) obj;

    if (!getValuesList()
        .equals(other.getValuesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.AttributeValues parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.pubsublite.proto.AttributeValues parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.AttributeValues parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.pubsublite.proto.AttributeValues parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.AttributeValues parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.pubsublite.proto.AttributeValues parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.AttributeValues parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.pubsublite.proto.AttributeValues parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.AttributeValues parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.pubsublite.proto.AttributeValues parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.AttributeValues parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.pubsublite.proto.AttributeValues parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.pubsublite.proto.AttributeValues prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * The values associated with a key of an attribute.
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.AttributeValues}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.AttributeValues)
      com.google.cloud.pubsublite.proto.AttributeValuesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.pubsublite.proto.CommonProto.internal_static_google_cloud_pubsublite_v1_AttributeValues_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.CommonProto.internal_static_google_cloud_pubsublite_v1_AttributeValues_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.AttributeValues.class, com.google.cloud.pubsublite.proto.AttributeValues.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.AttributeValues.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      values_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.CommonProto.internal_static_google_cloud_pubsublite_v1_AttributeValues_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.AttributeValues getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.AttributeValues.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.AttributeValues build() {
      com.google.cloud.pubsublite.proto.AttributeValues result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.AttributeValues buildPartial() {
      com.google.cloud.pubsublite.proto.AttributeValues result = new com.google.cloud.pubsublite.proto.AttributeValues(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        values_ = java.util.Collections.unmodifiableList(values_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.values_ = values_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.pubsublite.proto.AttributeValues) {
        return mergeFrom((com.google.cloud.pubsublite.proto.AttributeValues)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.pubsublite.proto.AttributeValues other) {
      if (other == com.google.cloud.pubsublite.proto.AttributeValues.getDefaultInstance()) return this;
      if (!other.values_.isEmpty()) {
        if (values_.isEmpty()) {
          values_ = other.values_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureValuesIsMutable();
          values_.addAll(other.values_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.pubsublite.proto.AttributeValues parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.pubsublite.proto.AttributeValues) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.protobuf.ByteString> values_ = java.util.Collections.emptyList();
    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        values_ = new java.util.ArrayList<com.google.protobuf.ByteString>(values_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * The list of values associated with a key.
     * </pre>
     *
     * <code>repeated bytes values = 1;</code>
     * @return A list containing the values.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getValuesList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(values_) : values_;
    }
    /**
     * <pre>
     * The list of values associated with a key.
     * </pre>
     *
     * <code>repeated bytes values = 1;</code>
     * @return The count of values.
     */
    public int getValuesCount() {
      return values_.size();
    }
    /**
     * <pre>
     * The list of values associated with a key.
     * </pre>
     *
     * <code>repeated bytes values = 1;</code>
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    public com.google.protobuf.ByteString getValues(int index) {
      return values_.get(index);
    }
    /**
     * <pre>
     * The list of values associated with a key.
     * </pre>
     *
     * <code>repeated bytes values = 1;</code>
     * @param index The index to set the value at.
     * @param value The values to set.
     * @return This builder for chaining.
     */
    public Builder setValues(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureValuesIsMutable();
      values_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of values associated with a key.
     * </pre>
     *
     * <code>repeated bytes values = 1;</code>
     * @param value The values to add.
     * @return This builder for chaining.
     */
    public Builder addValues(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureValuesIsMutable();
      values_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of values associated with a key.
     * </pre>
     *
     * <code>repeated bytes values = 1;</code>
     * @param values The values to add.
     * @return This builder for chaining.
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, values_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of values associated with a key.
     * </pre>
     *
     * <code>repeated bytes values = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearValues() {
      values_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.AttributeValues)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.AttributeValues)
  private static final com.google.cloud.pubsublite.proto.AttributeValues DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.AttributeValues();
  }

  public static com.google.cloud.pubsublite.proto.AttributeValues getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AttributeValues>
      PARSER = new com.google.protobuf.AbstractParser<AttributeValues>() {
    @java.lang.Override
    public AttributeValues parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AttributeValues(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AttributeValues> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AttributeValues> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.AttributeValues getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

