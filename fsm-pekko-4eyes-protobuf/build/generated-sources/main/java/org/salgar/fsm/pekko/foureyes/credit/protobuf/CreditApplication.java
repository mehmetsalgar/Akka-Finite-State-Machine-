// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: org/salgar/fsm/pekko/foureyes/credit/protobuf/Credit.proto

package org.salgar.fsm.pekko.foureyes.credit.protobuf;

/**
 * Protobuf type {@code org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication}
 */
public final class CreditApplication extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication)
    CreditApplicationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreditApplication.newBuilder() to construct.
  private CreditApplication(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreditApplication() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreditApplication();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreditApplication(
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

            creditAmount_ = input.readDouble();
            break;
          }
          case 18: {
            org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants.Builder subBuilder = null;
            if (creditTenants_ != null) {
              subBuilder = creditTenants_.toBuilder();
            }
            creditTenants_ = input.readMessage(org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(creditTenants_);
              creditTenants_ = subBuilder.buildPartial();
            }

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
    return org.salgar.fsm.pekko.foureyes.credit.protobuf.Credit.internal_static_org_salgar_fsm_pekko_foureyes_credit_protobuf_CreditApplication_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.salgar.fsm.pekko.foureyes.credit.protobuf.Credit.internal_static_org_salgar_fsm_pekko_foureyes_credit_protobuf_CreditApplication_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication.class, org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication.Builder.class);
  }

  public static final int CREDITAMOUNT_FIELD_NUMBER = 1;
  private double creditAmount_;
  /**
   * <code>double creditAmount = 1;</code>
   * @return The creditAmount.
   */
  @java.lang.Override
  public double getCreditAmount() {
    return creditAmount_;
  }

  public static final int CREDITTENANTS_FIELD_NUMBER = 2;
  private org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants creditTenants_;
  /**
   * <code>.org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants creditTenants = 2;</code>
   * @return Whether the creditTenants field is set.
   */
  @java.lang.Override
  public boolean hasCreditTenants() {
    return creditTenants_ != null;
  }
  /**
   * <code>.org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants creditTenants = 2;</code>
   * @return The creditTenants.
   */
  @java.lang.Override
  public org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants getCreditTenants() {
    return creditTenants_ == null ? org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants.getDefaultInstance() : creditTenants_;
  }
  /**
   * <code>.org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants creditTenants = 2;</code>
   */
  @java.lang.Override
  public org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenantsOrBuilder getCreditTenantsOrBuilder() {
    return getCreditTenants();
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
    if (java.lang.Double.doubleToRawLongBits(creditAmount_) != 0) {
      output.writeDouble(1, creditAmount_);
    }
    if (creditTenants_ != null) {
      output.writeMessage(2, getCreditTenants());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(creditAmount_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, creditAmount_);
    }
    if (creditTenants_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCreditTenants());
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
    if (!(obj instanceof org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication)) {
      return super.equals(obj);
    }
    org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication other = (org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication) obj;

    if (java.lang.Double.doubleToLongBits(getCreditAmount())
        != java.lang.Double.doubleToLongBits(
            other.getCreditAmount())) return false;
    if (hasCreditTenants() != other.hasCreditTenants()) return false;
    if (hasCreditTenants()) {
      if (!getCreditTenants()
          .equals(other.getCreditTenants())) return false;
    }
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
    hash = (37 * hash) + CREDITAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getCreditAmount()));
    if (hasCreditTenants()) {
      hash = (37 * hash) + CREDITTENANTS_FIELD_NUMBER;
      hash = (53 * hash) + getCreditTenants().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication parseFrom(
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
  public static Builder newBuilder(org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication prototype) {
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
   * Protobuf type {@code org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication)
      org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplicationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.salgar.fsm.pekko.foureyes.credit.protobuf.Credit.internal_static_org_salgar_fsm_pekko_foureyes_credit_protobuf_CreditApplication_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.salgar.fsm.pekko.foureyes.credit.protobuf.Credit.internal_static_org_salgar_fsm_pekko_foureyes_credit_protobuf_CreditApplication_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication.class, org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication.Builder.class);
    }

    // Construct using org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication.newBuilder()
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
      creditAmount_ = 0D;

      if (creditTenantsBuilder_ == null) {
        creditTenants_ = null;
      } else {
        creditTenants_ = null;
        creditTenantsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.salgar.fsm.pekko.foureyes.credit.protobuf.Credit.internal_static_org_salgar_fsm_pekko_foureyes_credit_protobuf_CreditApplication_descriptor;
    }

    @java.lang.Override
    public org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication getDefaultInstanceForType() {
      return org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication.getDefaultInstance();
    }

    @java.lang.Override
    public org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication build() {
      org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication buildPartial() {
      org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication result = new org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication(this);
      result.creditAmount_ = creditAmount_;
      if (creditTenantsBuilder_ == null) {
        result.creditTenants_ = creditTenants_;
      } else {
        result.creditTenants_ = creditTenantsBuilder_.build();
      }
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
      if (other instanceof org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication) {
        return mergeFrom((org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication other) {
      if (other == org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication.getDefaultInstance()) return this;
      if (other.getCreditAmount() != 0D) {
        setCreditAmount(other.getCreditAmount());
      }
      if (other.hasCreditTenants()) {
        mergeCreditTenants(other.getCreditTenants());
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
      org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double creditAmount_ ;
    /**
     * <code>double creditAmount = 1;</code>
     * @return The creditAmount.
     */
    @java.lang.Override
    public double getCreditAmount() {
      return creditAmount_;
    }
    /**
     * <code>double creditAmount = 1;</code>
     * @param value The creditAmount to set.
     * @return This builder for chaining.
     */
    public Builder setCreditAmount(double value) {
      
      creditAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double creditAmount = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreditAmount() {
      
      creditAmount_ = 0D;
      onChanged();
      return this;
    }

    private org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants creditTenants_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants, org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants.Builder, org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenantsOrBuilder> creditTenantsBuilder_;
    /**
     * <code>.org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants creditTenants = 2;</code>
     * @return Whether the creditTenants field is set.
     */
    public boolean hasCreditTenants() {
      return creditTenantsBuilder_ != null || creditTenants_ != null;
    }
    /**
     * <code>.org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants creditTenants = 2;</code>
     * @return The creditTenants.
     */
    public org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants getCreditTenants() {
      if (creditTenantsBuilder_ == null) {
        return creditTenants_ == null ? org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants.getDefaultInstance() : creditTenants_;
      } else {
        return creditTenantsBuilder_.getMessage();
      }
    }
    /**
     * <code>.org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants creditTenants = 2;</code>
     */
    public Builder setCreditTenants(org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants value) {
      if (creditTenantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        creditTenants_ = value;
        onChanged();
      } else {
        creditTenantsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants creditTenants = 2;</code>
     */
    public Builder setCreditTenants(
        org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants.Builder builderForValue) {
      if (creditTenantsBuilder_ == null) {
        creditTenants_ = builderForValue.build();
        onChanged();
      } else {
        creditTenantsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants creditTenants = 2;</code>
     */
    public Builder mergeCreditTenants(org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants value) {
      if (creditTenantsBuilder_ == null) {
        if (creditTenants_ != null) {
          creditTenants_ =
            org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants.newBuilder(creditTenants_).mergeFrom(value).buildPartial();
        } else {
          creditTenants_ = value;
        }
        onChanged();
      } else {
        creditTenantsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants creditTenants = 2;</code>
     */
    public Builder clearCreditTenants() {
      if (creditTenantsBuilder_ == null) {
        creditTenants_ = null;
        onChanged();
      } else {
        creditTenants_ = null;
        creditTenantsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants creditTenants = 2;</code>
     */
    public org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants.Builder getCreditTenantsBuilder() {
      
      onChanged();
      return getCreditTenantsFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants creditTenants = 2;</code>
     */
    public org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenantsOrBuilder getCreditTenantsOrBuilder() {
      if (creditTenantsBuilder_ != null) {
        return creditTenantsBuilder_.getMessageOrBuilder();
      } else {
        return creditTenants_ == null ?
            org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants.getDefaultInstance() : creditTenants_;
      }
    }
    /**
     * <code>.org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants creditTenants = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants, org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants.Builder, org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenantsOrBuilder> 
        getCreditTenantsFieldBuilder() {
      if (creditTenantsBuilder_ == null) {
        creditTenantsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants, org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenants.Builder, org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditTenantsOrBuilder>(
                getCreditTenants(),
                getParentForChildren(),
                isClean());
        creditTenants_ = null;
      }
      return creditTenantsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication)
  }

  // @@protoc_insertion_point(class_scope:org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication)
  private static final org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication();
  }

  public static org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreditApplication>
      PARSER = new com.google.protobuf.AbstractParser<CreditApplication>() {
    @java.lang.Override
    public CreditApplication parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreditApplication(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreditApplication> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreditApplication> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.salgar.fsm.pekko.foureyes.credit.protobuf.CreditApplication getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

