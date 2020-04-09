// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/admin.proto

package com.google.cloud.pubsublite.proto;

/**
 * <pre>
 * Response for ListSubscriptions.
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.ListSubscriptionsResponse}
 */
public  final class ListSubscriptionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.ListSubscriptionsResponse)
    ListSubscriptionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSubscriptionsResponse.newBuilder() to construct.
  private ListSubscriptionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSubscriptionsResponse() {
    subscriptions_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSubscriptionsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListSubscriptionsResponse(
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
              subscriptions_ = new java.util.ArrayList<com.google.cloud.pubsublite.proto.Subscription>();
              mutable_bitField0_ |= 0x00000001;
            }
            subscriptions_.add(
                input.readMessage(com.google.cloud.pubsublite.proto.Subscription.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
        subscriptions_ = java.util.Collections.unmodifiableList(subscriptions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.pubsublite.proto.AdminProto.internal_static_google_cloud_pubsublite_v1_ListSubscriptionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.AdminProto.internal_static_google_cloud_pubsublite_v1_ListSubscriptionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.ListSubscriptionsResponse.class, com.google.cloud.pubsublite.proto.ListSubscriptionsResponse.Builder.class);
  }

  public static final int SUBSCRIPTIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.pubsublite.proto.Subscription> subscriptions_;
  /**
   * <pre>
   * The list of subscriptions in the requested parent. The order of the
   * subscriptions is unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
   */
  public java.util.List<com.google.cloud.pubsublite.proto.Subscription> getSubscriptionsList() {
    return subscriptions_;
  }
  /**
   * <pre>
   * The list of subscriptions in the requested parent. The order of the
   * subscriptions is unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.pubsublite.proto.SubscriptionOrBuilder> 
      getSubscriptionsOrBuilderList() {
    return subscriptions_;
  }
  /**
   * <pre>
   * The list of subscriptions in the requested parent. The order of the
   * subscriptions is unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
   */
  public int getSubscriptionsCount() {
    return subscriptions_.size();
  }
  /**
   * <pre>
   * The list of subscriptions in the requested parent. The order of the
   * subscriptions is unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
   */
  public com.google.cloud.pubsublite.proto.Subscription getSubscriptions(int index) {
    return subscriptions_.get(index);
  }
  /**
   * <pre>
   * The list of subscriptions in the requested parent. The order of the
   * subscriptions is unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
   */
  public com.google.cloud.pubsublite.proto.SubscriptionOrBuilder getSubscriptionsOrBuilder(
      int index) {
    return subscriptions_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page of
   * results. If this field is omitted, there are no more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page of
   * results. If this field is omitted, there are no more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < subscriptions_.size(); i++) {
      output.writeMessage(1, subscriptions_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < subscriptions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, subscriptions_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.pubsublite.proto.ListSubscriptionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.ListSubscriptionsResponse other = (com.google.cloud.pubsublite.proto.ListSubscriptionsResponse) obj;

    if (!getSubscriptionsList()
        .equals(other.getSubscriptionsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getSubscriptionsCount() > 0) {
      hash = (37 * hash) + SUBSCRIPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getSubscriptionsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.ListSubscriptionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.pubsublite.proto.ListSubscriptionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.ListSubscriptionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.pubsublite.proto.ListSubscriptionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.ListSubscriptionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.pubsublite.proto.ListSubscriptionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.ListSubscriptionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.pubsublite.proto.ListSubscriptionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.ListSubscriptionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.pubsublite.proto.ListSubscriptionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.pubsublite.proto.ListSubscriptionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.pubsublite.proto.ListSubscriptionsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.pubsublite.proto.ListSubscriptionsResponse prototype) {
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
   * Response for ListSubscriptions.
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.ListSubscriptionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.ListSubscriptionsResponse)
      com.google.cloud.pubsublite.proto.ListSubscriptionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.pubsublite.proto.AdminProto.internal_static_google_cloud_pubsublite_v1_ListSubscriptionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.AdminProto.internal_static_google_cloud_pubsublite_v1_ListSubscriptionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.ListSubscriptionsResponse.class, com.google.cloud.pubsublite.proto.ListSubscriptionsResponse.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.ListSubscriptionsResponse.newBuilder()
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
        getSubscriptionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (subscriptionsBuilder_ == null) {
        subscriptions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        subscriptionsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.AdminProto.internal_static_google_cloud_pubsublite_v1_ListSubscriptionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.ListSubscriptionsResponse getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.ListSubscriptionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.ListSubscriptionsResponse build() {
      com.google.cloud.pubsublite.proto.ListSubscriptionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.ListSubscriptionsResponse buildPartial() {
      com.google.cloud.pubsublite.proto.ListSubscriptionsResponse result = new com.google.cloud.pubsublite.proto.ListSubscriptionsResponse(this);
      int from_bitField0_ = bitField0_;
      if (subscriptionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          subscriptions_ = java.util.Collections.unmodifiableList(subscriptions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.subscriptions_ = subscriptions_;
      } else {
        result.subscriptions_ = subscriptionsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.pubsublite.proto.ListSubscriptionsResponse) {
        return mergeFrom((com.google.cloud.pubsublite.proto.ListSubscriptionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.pubsublite.proto.ListSubscriptionsResponse other) {
      if (other == com.google.cloud.pubsublite.proto.ListSubscriptionsResponse.getDefaultInstance()) return this;
      if (subscriptionsBuilder_ == null) {
        if (!other.subscriptions_.isEmpty()) {
          if (subscriptions_.isEmpty()) {
            subscriptions_ = other.subscriptions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSubscriptionsIsMutable();
            subscriptions_.addAll(other.subscriptions_);
          }
          onChanged();
        }
      } else {
        if (!other.subscriptions_.isEmpty()) {
          if (subscriptionsBuilder_.isEmpty()) {
            subscriptionsBuilder_.dispose();
            subscriptionsBuilder_ = null;
            subscriptions_ = other.subscriptions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            subscriptionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSubscriptionsFieldBuilder() : null;
          } else {
            subscriptionsBuilder_.addAllMessages(other.subscriptions_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.pubsublite.proto.ListSubscriptionsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.pubsublite.proto.ListSubscriptionsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.pubsublite.proto.Subscription> subscriptions_ =
      java.util.Collections.emptyList();
    private void ensureSubscriptionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        subscriptions_ = new java.util.ArrayList<com.google.cloud.pubsublite.proto.Subscription>(subscriptions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.pubsublite.proto.Subscription, com.google.cloud.pubsublite.proto.Subscription.Builder, com.google.cloud.pubsublite.proto.SubscriptionOrBuilder> subscriptionsBuilder_;

    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public java.util.List<com.google.cloud.pubsublite.proto.Subscription> getSubscriptionsList() {
      if (subscriptionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(subscriptions_);
      } else {
        return subscriptionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public int getSubscriptionsCount() {
      if (subscriptionsBuilder_ == null) {
        return subscriptions_.size();
      } else {
        return subscriptionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.Subscription getSubscriptions(int index) {
      if (subscriptionsBuilder_ == null) {
        return subscriptions_.get(index);
      } else {
        return subscriptionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public Builder setSubscriptions(
        int index, com.google.cloud.pubsublite.proto.Subscription value) {
      if (subscriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubscriptionsIsMutable();
        subscriptions_.set(index, value);
        onChanged();
      } else {
        subscriptionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public Builder setSubscriptions(
        int index, com.google.cloud.pubsublite.proto.Subscription.Builder builderForValue) {
      if (subscriptionsBuilder_ == null) {
        ensureSubscriptionsIsMutable();
        subscriptions_.set(index, builderForValue.build());
        onChanged();
      } else {
        subscriptionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public Builder addSubscriptions(com.google.cloud.pubsublite.proto.Subscription value) {
      if (subscriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubscriptionsIsMutable();
        subscriptions_.add(value);
        onChanged();
      } else {
        subscriptionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public Builder addSubscriptions(
        int index, com.google.cloud.pubsublite.proto.Subscription value) {
      if (subscriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubscriptionsIsMutable();
        subscriptions_.add(index, value);
        onChanged();
      } else {
        subscriptionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public Builder addSubscriptions(
        com.google.cloud.pubsublite.proto.Subscription.Builder builderForValue) {
      if (subscriptionsBuilder_ == null) {
        ensureSubscriptionsIsMutable();
        subscriptions_.add(builderForValue.build());
        onChanged();
      } else {
        subscriptionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public Builder addSubscriptions(
        int index, com.google.cloud.pubsublite.proto.Subscription.Builder builderForValue) {
      if (subscriptionsBuilder_ == null) {
        ensureSubscriptionsIsMutable();
        subscriptions_.add(index, builderForValue.build());
        onChanged();
      } else {
        subscriptionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public Builder addAllSubscriptions(
        java.lang.Iterable<? extends com.google.cloud.pubsublite.proto.Subscription> values) {
      if (subscriptionsBuilder_ == null) {
        ensureSubscriptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, subscriptions_);
        onChanged();
      } else {
        subscriptionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public Builder clearSubscriptions() {
      if (subscriptionsBuilder_ == null) {
        subscriptions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        subscriptionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public Builder removeSubscriptions(int index) {
      if (subscriptionsBuilder_ == null) {
        ensureSubscriptionsIsMutable();
        subscriptions_.remove(index);
        onChanged();
      } else {
        subscriptionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.Subscription.Builder getSubscriptionsBuilder(
        int index) {
      return getSubscriptionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.SubscriptionOrBuilder getSubscriptionsOrBuilder(
        int index) {
      if (subscriptionsBuilder_ == null) {
        return subscriptions_.get(index);  } else {
        return subscriptionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.pubsublite.proto.SubscriptionOrBuilder> 
         getSubscriptionsOrBuilderList() {
      if (subscriptionsBuilder_ != null) {
        return subscriptionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(subscriptions_);
      }
    }
    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.Subscription.Builder addSubscriptionsBuilder() {
      return getSubscriptionsFieldBuilder().addBuilder(
          com.google.cloud.pubsublite.proto.Subscription.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.Subscription.Builder addSubscriptionsBuilder(
        int index) {
      return getSubscriptionsFieldBuilder().addBuilder(
          index, com.google.cloud.pubsublite.proto.Subscription.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of subscriptions in the requested parent. The order of the
     * subscriptions is unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.Subscription subscriptions = 1;</code>
     */
    public java.util.List<com.google.cloud.pubsublite.proto.Subscription.Builder> 
         getSubscriptionsBuilderList() {
      return getSubscriptionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.pubsublite.proto.Subscription, com.google.cloud.pubsublite.proto.Subscription.Builder, com.google.cloud.pubsublite.proto.SubscriptionOrBuilder> 
        getSubscriptionsFieldBuilder() {
      if (subscriptionsBuilder_ == null) {
        subscriptionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.pubsublite.proto.Subscription, com.google.cloud.pubsublite.proto.Subscription.Builder, com.google.cloud.pubsublite.proto.SubscriptionOrBuilder>(
                subscriptions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        subscriptions_ = null;
      }
      return subscriptionsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.ListSubscriptionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.ListSubscriptionsResponse)
  private static final com.google.cloud.pubsublite.proto.ListSubscriptionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.ListSubscriptionsResponse();
  }

  public static com.google.cloud.pubsublite.proto.ListSubscriptionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSubscriptionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListSubscriptionsResponse>() {
    @java.lang.Override
    public ListSubscriptionsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListSubscriptionsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListSubscriptionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSubscriptionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.ListSubscriptionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

