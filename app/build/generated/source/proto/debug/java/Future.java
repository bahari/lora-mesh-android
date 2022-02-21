// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: notused/future.proto

public final class Future {
  private Future() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ManufacturingDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ManufacturingData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * center frequency for the radio hardware that was stuffed
     * </pre>
     *
     * <code>uint32 fradioFreq = 1;</code>
     * @return The fradioFreq.
     */
    int getFradioFreq();

    /**
     * <pre>
     * TBEAM, HELTEC, etc...
     * </pre>
     *
     * <code>string hw_model = 2;</code>
     * @return The hwModel.
     */
    java.lang.String getHwModel();
    /**
     * <pre>
     * TBEAM, HELTEC, etc...
     * </pre>
     *
     * <code>string hw_model = 2;</code>
     * @return The bytes for hwModel.
     */
    com.google.protobuf.ByteString
        getHwModelBytes();

    /**
     * <pre>
     * Hardware version number
     * </pre>
     *
     * <code>string hw_version = 3;</code>
     * @return The hwVersion.
     */
    java.lang.String getHwVersion();
    /**
     * <pre>
     * Hardware version number
     * </pre>
     *
     * <code>string hw_version = 3;</code>
     * @return The bytes for hwVersion.
     */
    com.google.protobuf.ByteString
        getHwVersionBytes();

    /**
     * <pre>
     * This code is written during manfacturing time and allows users to confirm that
     * the initial manufacturing tests succeeded.
     * 0 means no test performed.
     * 1 means all tests passed
     * negative numbers indicate particular error codes
     * </pre>
     *
     * <code>sint32 selftest_result = 4;</code>
     * @return The selftestResult.
     */
    int getSelftestResult();
  }
  /**
   * <pre>
   * Placeholder for data we will eventually set during initial programming.
   * This will allow us to stop having a load for each region.
   * </pre>
   *
   * Protobuf type {@code ManufacturingData}
   */
  public static final class ManufacturingData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ManufacturingData)
      ManufacturingDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ManufacturingData.newBuilder() to construct.
    private ManufacturingData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ManufacturingData() {
      hwModel_ = "";
      hwVersion_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ManufacturingData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ManufacturingData(
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
            case 8: {

              fradioFreq_ = input.readUInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              hwModel_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              hwVersion_ = s;
              break;
            }
            case 32: {

              selftestResult_ = input.readSInt32();
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
      return Future.internal_static_ManufacturingData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Future.internal_static_ManufacturingData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Future.ManufacturingData.class, Future.ManufacturingData.Builder.class);
    }

    public static final int FRADIOFREQ_FIELD_NUMBER = 1;
    private int fradioFreq_;
    /**
     * <pre>
     * center frequency for the radio hardware that was stuffed
     * </pre>
     *
     * <code>uint32 fradioFreq = 1;</code>
     * @return The fradioFreq.
     */
    @java.lang.Override
    public int getFradioFreq() {
      return fradioFreq_;
    }

    public static final int HW_MODEL_FIELD_NUMBER = 2;
    private volatile java.lang.Object hwModel_;
    /**
     * <pre>
     * TBEAM, HELTEC, etc...
     * </pre>
     *
     * <code>string hw_model = 2;</code>
     * @return The hwModel.
     */
    @java.lang.Override
    public java.lang.String getHwModel() {
      java.lang.Object ref = hwModel_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hwModel_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * TBEAM, HELTEC, etc...
     * </pre>
     *
     * <code>string hw_model = 2;</code>
     * @return The bytes for hwModel.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getHwModelBytes() {
      java.lang.Object ref = hwModel_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hwModel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HW_VERSION_FIELD_NUMBER = 3;
    private volatile java.lang.Object hwVersion_;
    /**
     * <pre>
     * Hardware version number
     * </pre>
     *
     * <code>string hw_version = 3;</code>
     * @return The hwVersion.
     */
    @java.lang.Override
    public java.lang.String getHwVersion() {
      java.lang.Object ref = hwVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hwVersion_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Hardware version number
     * </pre>
     *
     * <code>string hw_version = 3;</code>
     * @return The bytes for hwVersion.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getHwVersionBytes() {
      java.lang.Object ref = hwVersion_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hwVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SELFTEST_RESULT_FIELD_NUMBER = 4;
    private int selftestResult_;
    /**
     * <pre>
     * This code is written during manfacturing time and allows users to confirm that
     * the initial manufacturing tests succeeded.
     * 0 means no test performed.
     * 1 means all tests passed
     * negative numbers indicate particular error codes
     * </pre>
     *
     * <code>sint32 selftest_result = 4;</code>
     * @return The selftestResult.
     */
    @java.lang.Override
    public int getSelftestResult() {
      return selftestResult_;
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
      if (fradioFreq_ != 0) {
        output.writeUInt32(1, fradioFreq_);
      }
      if (!getHwModelBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, hwModel_);
      }
      if (!getHwVersionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hwVersion_);
      }
      if (selftestResult_ != 0) {
        output.writeSInt32(4, selftestResult_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fradioFreq_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, fradioFreq_);
      }
      if (!getHwModelBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, hwModel_);
      }
      if (!getHwVersionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, hwVersion_);
      }
      if (selftestResult_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(4, selftestResult_);
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
      if (!(obj instanceof Future.ManufacturingData)) {
        return super.equals(obj);
      }
      Future.ManufacturingData other = (Future.ManufacturingData) obj;

      if (getFradioFreq()
          != other.getFradioFreq()) return false;
      if (!getHwModel()
          .equals(other.getHwModel())) return false;
      if (!getHwVersion()
          .equals(other.getHwVersion())) return false;
      if (getSelftestResult()
          != other.getSelftestResult()) return false;
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
      hash = (37 * hash) + FRADIOFREQ_FIELD_NUMBER;
      hash = (53 * hash) + getFradioFreq();
      hash = (37 * hash) + HW_MODEL_FIELD_NUMBER;
      hash = (53 * hash) + getHwModel().hashCode();
      hash = (37 * hash) + HW_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getHwVersion().hashCode();
      hash = (37 * hash) + SELFTEST_RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getSelftestResult();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Future.ManufacturingData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Future.ManufacturingData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Future.ManufacturingData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Future.ManufacturingData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Future.ManufacturingData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Future.ManufacturingData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Future.ManufacturingData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Future.ManufacturingData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Future.ManufacturingData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Future.ManufacturingData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Future.ManufacturingData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Future.ManufacturingData parseFrom(
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
    public static Builder newBuilder(Future.ManufacturingData prototype) {
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
     * Placeholder for data we will eventually set during initial programming.
     * This will allow us to stop having a load for each region.
     * </pre>
     *
     * Protobuf type {@code ManufacturingData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ManufacturingData)
        Future.ManufacturingDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Future.internal_static_ManufacturingData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Future.internal_static_ManufacturingData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Future.ManufacturingData.class, Future.ManufacturingData.Builder.class);
      }

      // Construct using Future.ManufacturingData.newBuilder()
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
        fradioFreq_ = 0;

        hwModel_ = "";

        hwVersion_ = "";

        selftestResult_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Future.internal_static_ManufacturingData_descriptor;
      }

      @java.lang.Override
      public Future.ManufacturingData getDefaultInstanceForType() {
        return Future.ManufacturingData.getDefaultInstance();
      }

      @java.lang.Override
      public Future.ManufacturingData build() {
        Future.ManufacturingData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Future.ManufacturingData buildPartial() {
        Future.ManufacturingData result = new Future.ManufacturingData(this);
        result.fradioFreq_ = fradioFreq_;
        result.hwModel_ = hwModel_;
        result.hwVersion_ = hwVersion_;
        result.selftestResult_ = selftestResult_;
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
        if (other instanceof Future.ManufacturingData) {
          return mergeFrom((Future.ManufacturingData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Future.ManufacturingData other) {
        if (other == Future.ManufacturingData.getDefaultInstance()) return this;
        if (other.getFradioFreq() != 0) {
          setFradioFreq(other.getFradioFreq());
        }
        if (!other.getHwModel().isEmpty()) {
          hwModel_ = other.hwModel_;
          onChanged();
        }
        if (!other.getHwVersion().isEmpty()) {
          hwVersion_ = other.hwVersion_;
          onChanged();
        }
        if (other.getSelftestResult() != 0) {
          setSelftestResult(other.getSelftestResult());
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
        Future.ManufacturingData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Future.ManufacturingData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int fradioFreq_ ;
      /**
       * <pre>
       * center frequency for the radio hardware that was stuffed
       * </pre>
       *
       * <code>uint32 fradioFreq = 1;</code>
       * @return The fradioFreq.
       */
      @java.lang.Override
      public int getFradioFreq() {
        return fradioFreq_;
      }
      /**
       * <pre>
       * center frequency for the radio hardware that was stuffed
       * </pre>
       *
       * <code>uint32 fradioFreq = 1;</code>
       * @param value The fradioFreq to set.
       * @return This builder for chaining.
       */
      public Builder setFradioFreq(int value) {
        
        fradioFreq_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * center frequency for the radio hardware that was stuffed
       * </pre>
       *
       * <code>uint32 fradioFreq = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFradioFreq() {
        
        fradioFreq_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object hwModel_ = "";
      /**
       * <pre>
       * TBEAM, HELTEC, etc...
       * </pre>
       *
       * <code>string hw_model = 2;</code>
       * @return The hwModel.
       */
      public java.lang.String getHwModel() {
        java.lang.Object ref = hwModel_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          hwModel_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * TBEAM, HELTEC, etc...
       * </pre>
       *
       * <code>string hw_model = 2;</code>
       * @return The bytes for hwModel.
       */
      public com.google.protobuf.ByteString
          getHwModelBytes() {
        java.lang.Object ref = hwModel_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          hwModel_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * TBEAM, HELTEC, etc...
       * </pre>
       *
       * <code>string hw_model = 2;</code>
       * @param value The hwModel to set.
       * @return This builder for chaining.
       */
      public Builder setHwModel(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        hwModel_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * TBEAM, HELTEC, etc...
       * </pre>
       *
       * <code>string hw_model = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearHwModel() {
        
        hwModel_ = getDefaultInstance().getHwModel();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * TBEAM, HELTEC, etc...
       * </pre>
       *
       * <code>string hw_model = 2;</code>
       * @param value The bytes for hwModel to set.
       * @return This builder for chaining.
       */
      public Builder setHwModelBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        hwModel_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object hwVersion_ = "";
      /**
       * <pre>
       * Hardware version number
       * </pre>
       *
       * <code>string hw_version = 3;</code>
       * @return The hwVersion.
       */
      public java.lang.String getHwVersion() {
        java.lang.Object ref = hwVersion_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          hwVersion_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Hardware version number
       * </pre>
       *
       * <code>string hw_version = 3;</code>
       * @return The bytes for hwVersion.
       */
      public com.google.protobuf.ByteString
          getHwVersionBytes() {
        java.lang.Object ref = hwVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          hwVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Hardware version number
       * </pre>
       *
       * <code>string hw_version = 3;</code>
       * @param value The hwVersion to set.
       * @return This builder for chaining.
       */
      public Builder setHwVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        hwVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Hardware version number
       * </pre>
       *
       * <code>string hw_version = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearHwVersion() {
        
        hwVersion_ = getDefaultInstance().getHwVersion();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Hardware version number
       * </pre>
       *
       * <code>string hw_version = 3;</code>
       * @param value The bytes for hwVersion to set.
       * @return This builder for chaining.
       */
      public Builder setHwVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        hwVersion_ = value;
        onChanged();
        return this;
      }

      private int selftestResult_ ;
      /**
       * <pre>
       * This code is written during manfacturing time and allows users to confirm that
       * the initial manufacturing tests succeeded.
       * 0 means no test performed.
       * 1 means all tests passed
       * negative numbers indicate particular error codes
       * </pre>
       *
       * <code>sint32 selftest_result = 4;</code>
       * @return The selftestResult.
       */
      @java.lang.Override
      public int getSelftestResult() {
        return selftestResult_;
      }
      /**
       * <pre>
       * This code is written during manfacturing time and allows users to confirm that
       * the initial manufacturing tests succeeded.
       * 0 means no test performed.
       * 1 means all tests passed
       * negative numbers indicate particular error codes
       * </pre>
       *
       * <code>sint32 selftest_result = 4;</code>
       * @param value The selftestResult to set.
       * @return This builder for chaining.
       */
      public Builder setSelftestResult(int value) {
        
        selftestResult_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * This code is written during manfacturing time and allows users to confirm that
       * the initial manufacturing tests succeeded.
       * 0 means no test performed.
       * 1 means all tests passed
       * negative numbers indicate particular error codes
       * </pre>
       *
       * <code>sint32 selftest_result = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSelftestResult() {
        
        selftestResult_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ManufacturingData)
    }

    // @@protoc_insertion_point(class_scope:ManufacturingData)
    private static final Future.ManufacturingData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Future.ManufacturingData();
    }

    public static Future.ManufacturingData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ManufacturingData>
        PARSER = new com.google.protobuf.AbstractParser<ManufacturingData>() {
      @java.lang.Override
      public ManufacturingData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ManufacturingData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ManufacturingData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ManufacturingData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Future.ManufacturingData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ManufacturingData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ManufacturingData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024notused/future.proto\"f\n\021ManufacturingD" +
      "ata\022\022\n\nfradioFreq\030\001 \001(\r\022\020\n\010hw_model\030\002 \001(" +
      "\t\022\022\n\nhw_version\030\003 \001(\t\022\027\n\017selftest_result" +
      "\030\004 \001(\021b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ManufacturingData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ManufacturingData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ManufacturingData_descriptor,
        new java.lang.String[] { "FradioFreq", "HwModel", "HwVersion", "SelftestResult", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
