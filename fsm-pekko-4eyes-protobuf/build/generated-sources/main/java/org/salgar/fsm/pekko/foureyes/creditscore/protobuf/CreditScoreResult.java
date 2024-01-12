// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: org/salgar/fsm/pekko/foureyes/creditscore/protobuf/Creditscore.proto

package org.salgar.fsm.pekko.foureyes.creditscore.protobuf;

/**
 * Protobuf type {@code org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult}
 */
public final class CreditScoreResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult)
    CreditScoreResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreditScoreResult.newBuilder() to construct.
  private CreditScoreResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreditScoreResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreditScoreResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreditScoreResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 9: {

            creditScore_ = input.readDouble();
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
    return org.salgar.fsm.pekko.foureyes.creditscore.protobuf.Creditscore.internal_static_org_salgar_fsm_pekko_foureyes_creditscore_protobuf_CreditScoreResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.salgar.fsm.pekko.foureyes.creditscore.protobuf.Creditscore.internal_static_org_salgar_fsm_pekko_foureyes_creditscore_protobuf_CreditScoreResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult.class, org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult.Builder.class);
  }

  public static final int CREDITSCORE_FIELD_NUMBER = 1;
  private double creditScore_;
  /**
   * <code>double creditScore = 1;</code>
   * @return The creditScore.
   */
  @java.lang.Override
  public double getCreditScore() {
    return creditScore_;
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
    if (java.lang.Double.doubleToRawLongBits(creditScore_) != 0) {
      output.writeDouble(1, creditScore_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(creditScore_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, creditScore_);
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
    if (!(obj instanceof org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult)) {
      return super.equals(obj);
    }
    org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult other = (org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult) obj;

    if (java.lang.Double.doubleToLongBits(getCreditScore())
        != java.lang.Double.doubleToLongBits(
            other.getCreditScore())) return false;
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
    hash = (37 * hash) + CREDITSCORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getCreditScore()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult parseFrom(
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
  public static Builder newBuilder(org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult prototype) {
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
   * Protobuf type {@code org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult)
      org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.salgar.fsm.pekko.foureyes.creditscore.protobuf.Creditscore.internal_static_org_salgar_fsm_pekko_foureyes_creditscore_protobuf_CreditScoreResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.salgar.fsm.pekko.foureyes.creditscore.protobuf.Creditscore.internal_static_org_salgar_fsm_pekko_foureyes_creditscore_protobuf_CreditScoreResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult.class, org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult.Builder.class);
    }

    // Construct using org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult.newBuilder()
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
      creditScore_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.salgar.fsm.pekko.foureyes.creditscore.protobuf.Creditscore.internal_static_org_salgar_fsm_pekko_foureyes_creditscore_protobuf_CreditScoreResult_descriptor;
    }

    @java.lang.Override
    public org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult getDefaultInstanceForType() {
      return org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult.getDefaultInstance();
    }

    @java.lang.Override
    public org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult build() {
      org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult buildPartial() {
      org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult result = new org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult(this);
      result.creditScore_ = creditScore_;
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
      if (other instanceof org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult) {
        return mergeFrom((org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult other) {
      if (other == org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult.getDefaultInstance()) return this;
      if (other.getCreditScore() != 0D) {
        setCreditScore(other.getCreditScore());
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
      org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double creditScore_ ;
    /**
     * <code>double creditScore = 1;</code>
     * @return The creditScore.
     */
    @java.lang.Override
    public double getCreditScore() {
      return creditScore_;
    }
    /**
     * <code>double creditScore = 1;</code>
     * @param value The creditScore to set.
     * @return This builder for chaining.
     */
    public Builder setCreditScore(double value) {
      
      creditScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double creditScore = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreditScore() {
      
      creditScore_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult)
  }

  // @@protoc_insertion_point(class_scope:org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult)
  private static final org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult();
  }

  public static org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreditScoreResult>
      PARSER = new com.google.protobuf.AbstractParser<CreditScoreResult>() {
    @java.lang.Override
    public CreditScoreResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreditScoreResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreditScoreResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreditScoreResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.salgar.fsm.pekko.foureyes.creditscore.protobuf.CreditScoreResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

