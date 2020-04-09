// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/admin.proto

package com.google.cloud.pubsublite.proto;

public interface UpdateSubscriptionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.pubsublite.v1.UpdateSubscriptionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The subscription to update. Its `name` field must be populated.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the subscription field is set.
   */
  boolean hasSubscription();
  /**
   * <pre>
   * The subscription to update. Its `name` field must be populated.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The subscription.
   */
  com.google.cloud.pubsublite.proto.Subscription getSubscription();
  /**
   * <pre>
   * The subscription to update. Its `name` field must be populated.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.pubsublite.proto.SubscriptionOrBuilder getSubscriptionOrBuilder();

  /**
   * <pre>
   * A mask specifying the subscription fields to change.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * A mask specifying the subscription fields to change.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * A mask specifying the subscription fields to change.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
