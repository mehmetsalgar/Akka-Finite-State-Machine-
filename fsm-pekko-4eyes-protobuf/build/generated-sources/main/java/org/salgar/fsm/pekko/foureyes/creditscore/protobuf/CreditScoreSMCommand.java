// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: org/salgar/fsm/pekko/foureyes/creditscore/protobuf/Creditscore.proto

package org.salgar.fsm.pekko.foureyes.creditscore.protobuf;

/**
 * Protobuf type {@code org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand}
 */
public final class CreditScoreSMCommand extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand)
    CreditScoreSMCommandOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreditScoreSMCommand.newBuilder() to construct.
  private CreditScoreSMCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreditScoreSMCommand() {
    useCaseKey_ = "";
    command_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreditScoreSMCommand();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreditScoreSMCommand(
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
            java.lang.String s = input.readStringRequireUtf8();

            useCaseKey_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            command_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              payload_ = com.google.protobuf.MapField.newMapField(
                  PayloadDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Any>
            payload__ = input.readMessage(
                PayloadDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            payload_.getMutableMap().put(
                payload__.getKey(), payload__.getValue());
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.salgar.fsm.pekko.foureyes.creditscore.protobuf.Creditscore.internal_static_org_salgar_fsm_pekko_foureyes_creditscore_protobuf_CreditScoreSMCommand_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetPayload();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.salgar.fsm.pekko.foureyes.creditscore.protobuf.Creditscore.internal_static_org_salgar_fsm_pekko_foureyes_creditscore_protobuf_CreditScoreSMCommand_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand.class, org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand.Builder.class);
  }

  public static final int USECASEKEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object useCaseKey_;
  /**
   * <code>string useCaseKey = 1;</code>
   * @return The useCaseKey.
   */
  @java.lang.Override
  public java.lang.String getUseCaseKey() {
    java.lang.Object ref = useCaseKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      useCaseKey_ = s;
      return s;
    }
  }
  /**
   * <code>string useCaseKey = 1;</code>
   * @return The bytes for useCaseKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUseCaseKeyBytes() {
    java.lang.Object ref = useCaseKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      useCaseKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMMAND_FIELD_NUMBER = 2;
  private volatile java.lang.Object command_;
  /**
   * <code>string command = 2;</code>
   * @return The command.
   */
  @java.lang.Override
  public java.lang.String getCommand() {
    java.lang.Object ref = command_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      command_ = s;
      return s;
    }
  }
  /**
   * <code>string command = 2;</code>
   * @return The bytes for command.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCommandBytes() {
    java.lang.Object ref = command_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      command_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_FIELD_NUMBER = 3;
  private static final class PayloadDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.protobuf.Any> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.protobuf.Any>newDefaultInstance(
                org.salgar.fsm.pekko.foureyes.creditscore.protobuf.Creditscore.internal_static_org_salgar_fsm_pekko_foureyes_creditscore_protobuf_CreditScoreSMCommand_PayloadEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.google.protobuf.Any.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.google.protobuf.Any> payload_;
  private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Any>
  internalGetPayload() {
    if (payload_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          PayloadDefaultEntryHolder.defaultEntry);
    }
    return payload_;
  }

  public int getPayloadCount() {
    return internalGetPayload().getMap().size();
  }
  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; payload = 3;</code>
   */

  @java.lang.Override
  public boolean containsPayload(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetPayload().getMap().containsKey(key);
  }
  /**
   * Use {@link #getPayloadMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.protobuf.Any> getPayload() {
    return getPayloadMap();
  }
  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; payload = 3;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, com.google.protobuf.Any> getPayloadMap() {
    return internalGetPayload().getMap();
  }
  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; payload = 3;</code>
   */
  @java.lang.Override

  public com.google.protobuf.Any getPayloadOrDefault(
      java.lang.String key,
      com.google.protobuf.Any defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.protobuf.Any> map =
        internalGetPayload().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; payload = 3;</code>
   */
  @java.lang.Override

  public com.google.protobuf.Any getPayloadOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.protobuf.Any> map =
        internalGetPayload().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(useCaseKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, useCaseKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(command_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, command_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetPayload(),
        PayloadDefaultEntryHolder.defaultEntry,
        3);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(useCaseKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, useCaseKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(command_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, command_);
    }
    for (java.util.Map.Entry<java.lang.String, com.google.protobuf.Any> entry
         : internalGetPayload().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Any>
      payload__ = PayloadDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, payload__);
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
    if (!(obj instanceof org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand)) {
      return super.equals(obj);
    }
    org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand other = (org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand) obj;

    if (!getUseCaseKey()
        .equals(other.getUseCaseKey())) return false;
    if (!getCommand()
        .equals(other.getCommand())) return false;
    if (!internalGetPayload().equals(
        other.internalGetPayload())) return false;
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
    hash = (37 * hash) + USECASEKEY_FIELD_NUMBER;
    hash = (53 * hash) + getUseCaseKey().hashCode();
    hash = (37 * hash) + COMMAND_FIELD_NUMBER;
    hash = (53 * hash) + getCommand().hashCode();
    if (!internalGetPayload().getMap().isEmpty()) {
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + internalGetPayload().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand parseFrom(
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
  public static Builder newBuilder(org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand prototype) {
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
   * Protobuf type {@code org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand)
      org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommandOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.salgar.fsm.pekko.foureyes.creditscore.protobuf.Creditscore.internal_static_org_salgar_fsm_pekko_foureyes_creditscore_protobuf_CreditScoreSMCommand_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetPayload();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutablePayload();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.salgar.fsm.pekko.foureyes.creditscore.protobuf.Creditscore.internal_static_org_salgar_fsm_pekko_foureyes_creditscore_protobuf_CreditScoreSMCommand_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand.class, org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand.Builder.class);
    }

    // Construct using org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand.newBuilder()
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
      useCaseKey_ = "";

      command_ = "";

      internalGetMutablePayload().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.salgar.fsm.pekko.foureyes.creditscore.protobuf.Creditscore.internal_static_org_salgar_fsm_pekko_foureyes_creditscore_protobuf_CreditScoreSMCommand_descriptor;
    }

    @java.lang.Override
    public org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand getDefaultInstanceForType() {
      return org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand.getDefaultInstance();
    }

    @java.lang.Override
    public org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand build() {
      org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand buildPartial() {
      org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand result = new org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand(this);
      int from_bitField0_ = bitField0_;
      result.useCaseKey_ = useCaseKey_;
      result.command_ = command_;
      result.payload_ = internalGetPayload();
      result.payload_.makeImmutable();
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
      if (other instanceof org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand) {
        return mergeFrom((org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand other) {
      if (other == org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand.getDefaultInstance()) return this;
      if (!other.getUseCaseKey().isEmpty()) {
        useCaseKey_ = other.useCaseKey_;
        onChanged();
      }
      if (!other.getCommand().isEmpty()) {
        command_ = other.command_;
        onChanged();
      }
      internalGetMutablePayload().mergeFrom(
          other.internalGetPayload());
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
      org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object useCaseKey_ = "";
    /**
     * <code>string useCaseKey = 1;</code>
     * @return The useCaseKey.
     */
    public java.lang.String getUseCaseKey() {
      java.lang.Object ref = useCaseKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        useCaseKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string useCaseKey = 1;</code>
     * @return The bytes for useCaseKey.
     */
    public com.google.protobuf.ByteString
        getUseCaseKeyBytes() {
      java.lang.Object ref = useCaseKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        useCaseKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string useCaseKey = 1;</code>
     * @param value The useCaseKey to set.
     * @return This builder for chaining.
     */
    public Builder setUseCaseKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      useCaseKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string useCaseKey = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUseCaseKey() {
      
      useCaseKey_ = getDefaultInstance().getUseCaseKey();
      onChanged();
      return this;
    }
    /**
     * <code>string useCaseKey = 1;</code>
     * @param value The bytes for useCaseKey to set.
     * @return This builder for chaining.
     */
    public Builder setUseCaseKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      useCaseKey_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object command_ = "";
    /**
     * <code>string command = 2;</code>
     * @return The command.
     */
    public java.lang.String getCommand() {
      java.lang.Object ref = command_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        command_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string command = 2;</code>
     * @return The bytes for command.
     */
    public com.google.protobuf.ByteString
        getCommandBytes() {
      java.lang.Object ref = command_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        command_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string command = 2;</code>
     * @param value The command to set.
     * @return This builder for chaining.
     */
    public Builder setCommand(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      command_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string command = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCommand() {
      
      command_ = getDefaultInstance().getCommand();
      onChanged();
      return this;
    }
    /**
     * <code>string command = 2;</code>
     * @param value The bytes for command to set.
     * @return This builder for chaining.
     */
    public Builder setCommandBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      command_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, com.google.protobuf.Any> payload_;
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Any>
    internalGetPayload() {
      if (payload_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PayloadDefaultEntryHolder.defaultEntry);
      }
      return payload_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Any>
    internalGetMutablePayload() {
      onChanged();;
      if (payload_ == null) {
        payload_ = com.google.protobuf.MapField.newMapField(
            PayloadDefaultEntryHolder.defaultEntry);
      }
      if (!payload_.isMutable()) {
        payload_ = payload_.copy();
      }
      return payload_;
    }

    public int getPayloadCount() {
      return internalGetPayload().getMap().size();
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; payload = 3;</code>
     */

    @java.lang.Override
    public boolean containsPayload(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetPayload().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPayloadMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.Any> getPayload() {
      return getPayloadMap();
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; payload = 3;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, com.google.protobuf.Any> getPayloadMap() {
      return internalGetPayload().getMap();
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; payload = 3;</code>
     */
    @java.lang.Override

    public com.google.protobuf.Any getPayloadOrDefault(
        java.lang.String key,
        com.google.protobuf.Any defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.protobuf.Any> map =
          internalGetPayload().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; payload = 3;</code>
     */
    @java.lang.Override

    public com.google.protobuf.Any getPayloadOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.protobuf.Any> map =
          internalGetPayload().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearPayload() {
      internalGetMutablePayload().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; payload = 3;</code>
     */

    public Builder removePayload(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutablePayload().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.Any>
    getMutablePayload() {
      return internalGetMutablePayload().getMutableMap();
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; payload = 3;</code>
     */
    public Builder putPayload(
        java.lang.String key,
        com.google.protobuf.Any value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutablePayload().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; payload = 3;</code>
     */

    public Builder putAllPayload(
        java.util.Map<java.lang.String, com.google.protobuf.Any> values) {
      internalGetMutablePayload().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand)
  }

  // @@protoc_insertion_point(class_scope:org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand)
  private static final org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand();
  }

  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreditScoreSMCommand>
      PARSER = new com.google.protobuf.AbstractParser<CreditScoreSMCommand>() {
    @java.lang.Override
    public CreditScoreSMCommand parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreditScoreSMCommand(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreditScoreSMCommand> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreditScoreSMCommand> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreSMCommand getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

