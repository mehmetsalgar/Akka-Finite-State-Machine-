// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: org/salgar/fsm/pekko/foureyes/credit/protobuf/Credit.proto

package org.salgar.fsm.pekko.foureyes.credit.protobuf;

public interface CreditSMCommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditSMCommand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string useCaseKey = 1;</code>
   * @return The useCaseKey.
   */
  java.lang.String getUseCaseKey();
  /**
   * <code>string useCaseKey = 1;</code>
   * @return The bytes for useCaseKey.
   */
  com.google.protobuf.ByteString
      getUseCaseKeyBytes();

  /**
   * <code>string command = 2;</code>
   * @return The command.
   */
  java.lang.String getCommand();
  /**
   * <code>string command = 2;</code>
   * @return The bytes for command.
   */
  com.google.protobuf.ByteString
      getCommandBytes();

  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; payload = 3;</code>
   */
  int getPayloadCount();
  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; payload = 3;</code>
   */
  boolean containsPayload(
      java.lang.String key);
  /**
   * Use {@link #getPayloadMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Any>
  getPayload();
  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; payload = 3;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Any>
  getPayloadMap();
  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; payload = 3;</code>
   */

  com.google.protobuf.Any getPayloadOrDefault(
      java.lang.String key,
      com.google.protobuf.Any defaultValue);
  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; payload = 3;</code>
   */

  com.google.protobuf.Any getPayloadOrThrow(
      java.lang.String key);
}
