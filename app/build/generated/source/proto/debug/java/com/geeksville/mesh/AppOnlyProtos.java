// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apponly.proto

package com.geeksville.mesh;

public final class AppOnlyProtos {
  private AppOnlyProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannelSetOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannelSet)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ChannelSettings settings = 1;</code>
     */
    java.util.List<com.geeksville.mesh.ChannelProtos.ChannelSettings> 
        getSettingsList();
    /**
     * <code>repeated .ChannelSettings settings = 1;</code>
     */
    com.geeksville.mesh.ChannelProtos.ChannelSettings getSettings(int index);
    /**
     * <code>repeated .ChannelSettings settings = 1;</code>
     */
    int getSettingsCount();
    /**
     * <code>repeated .ChannelSettings settings = 1;</code>
     */
    java.util.List<? extends com.geeksville.mesh.ChannelProtos.ChannelSettingsOrBuilder> 
        getSettingsOrBuilderList();
    /**
     * <code>repeated .ChannelSettings settings = 1;</code>
     */
    com.geeksville.mesh.ChannelProtos.ChannelSettingsOrBuilder getSettingsOrBuilder(
        int index);
  }
  /**
   * <pre>
   * This is the most compact possible representation for a set of channels.
   * It includes only one PRIMARY channel (which must be first) and
   * any SECONDARY channels.
   * No DISABLED channels are included.
   * This abstraction is used only on the the 'app side' of the world (ie python, javascript and android etc) to show a group of Channels as a (long) URL
   * </pre>
   *
   * Protobuf type {@code ChannelSet}
   */
  public static final class ChannelSet extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannelSet)
      ChannelSetOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannelSet.newBuilder() to construct.
    private ChannelSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannelSet() {
      settings_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannelSet();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChannelSet(
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
                settings_ = new java.util.ArrayList<com.geeksville.mesh.ChannelProtos.ChannelSettings>();
                mutable_bitField0_ |= 0x00000001;
              }
              settings_.add(
                  input.readMessage(com.geeksville.mesh.ChannelProtos.ChannelSettings.parser(), extensionRegistry));
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
          settings_ = java.util.Collections.unmodifiableList(settings_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.geeksville.mesh.AppOnlyProtos.internal_static_ChannelSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.geeksville.mesh.AppOnlyProtos.internal_static_ChannelSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.geeksville.mesh.AppOnlyProtos.ChannelSet.class, com.geeksville.mesh.AppOnlyProtos.ChannelSet.Builder.class);
    }

    public static final int SETTINGS_FIELD_NUMBER = 1;
    private java.util.List<com.geeksville.mesh.ChannelProtos.ChannelSettings> settings_;
    /**
     * <code>repeated .ChannelSettings settings = 1;</code>
     */
    @java.lang.Override
    public java.util.List<com.geeksville.mesh.ChannelProtos.ChannelSettings> getSettingsList() {
      return settings_;
    }
    /**
     * <code>repeated .ChannelSettings settings = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.geeksville.mesh.ChannelProtos.ChannelSettingsOrBuilder> 
        getSettingsOrBuilderList() {
      return settings_;
    }
    /**
     * <code>repeated .ChannelSettings settings = 1;</code>
     */
    @java.lang.Override
    public int getSettingsCount() {
      return settings_.size();
    }
    /**
     * <code>repeated .ChannelSettings settings = 1;</code>
     */
    @java.lang.Override
    public com.geeksville.mesh.ChannelProtos.ChannelSettings getSettings(int index) {
      return settings_.get(index);
    }
    /**
     * <code>repeated .ChannelSettings settings = 1;</code>
     */
    @java.lang.Override
    public com.geeksville.mesh.ChannelProtos.ChannelSettingsOrBuilder getSettingsOrBuilder(
        int index) {
      return settings_.get(index);
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
      for (int i = 0; i < settings_.size(); i++) {
        output.writeMessage(1, settings_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < settings_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, settings_.get(i));
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
      if (!(obj instanceof com.geeksville.mesh.AppOnlyProtos.ChannelSet)) {
        return super.equals(obj);
      }
      com.geeksville.mesh.AppOnlyProtos.ChannelSet other = (com.geeksville.mesh.AppOnlyProtos.ChannelSet) obj;

      if (!getSettingsList()
          .equals(other.getSettingsList())) return false;
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
      if (getSettingsCount() > 0) {
        hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
        hash = (53 * hash) + getSettingsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.geeksville.mesh.AppOnlyProtos.ChannelSet parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.geeksville.mesh.AppOnlyProtos.ChannelSet parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.geeksville.mesh.AppOnlyProtos.ChannelSet parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.geeksville.mesh.AppOnlyProtos.ChannelSet parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.geeksville.mesh.AppOnlyProtos.ChannelSet parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.geeksville.mesh.AppOnlyProtos.ChannelSet parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.geeksville.mesh.AppOnlyProtos.ChannelSet parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.geeksville.mesh.AppOnlyProtos.ChannelSet parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.geeksville.mesh.AppOnlyProtos.ChannelSet parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.geeksville.mesh.AppOnlyProtos.ChannelSet parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.geeksville.mesh.AppOnlyProtos.ChannelSet parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.geeksville.mesh.AppOnlyProtos.ChannelSet parseFrom(
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
    public static Builder newBuilder(com.geeksville.mesh.AppOnlyProtos.ChannelSet prototype) {
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
     * This is the most compact possible representation for a set of channels.
     * It includes only one PRIMARY channel (which must be first) and
     * any SECONDARY channels.
     * No DISABLED channels are included.
     * This abstraction is used only on the the 'app side' of the world (ie python, javascript and android etc) to show a group of Channels as a (long) URL
     * </pre>
     *
     * Protobuf type {@code ChannelSet}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannelSet)
        com.geeksville.mesh.AppOnlyProtos.ChannelSetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.geeksville.mesh.AppOnlyProtos.internal_static_ChannelSet_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.geeksville.mesh.AppOnlyProtos.internal_static_ChannelSet_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.geeksville.mesh.AppOnlyProtos.ChannelSet.class, com.geeksville.mesh.AppOnlyProtos.ChannelSet.Builder.class);
      }

      // Construct using com.geeksville.mesh.AppOnlyProtos.ChannelSet.newBuilder()
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
          getSettingsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (settingsBuilder_ == null) {
          settings_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          settingsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.geeksville.mesh.AppOnlyProtos.internal_static_ChannelSet_descriptor;
      }

      @java.lang.Override
      public com.geeksville.mesh.AppOnlyProtos.ChannelSet getDefaultInstanceForType() {
        return com.geeksville.mesh.AppOnlyProtos.ChannelSet.getDefaultInstance();
      }

      @java.lang.Override
      public com.geeksville.mesh.AppOnlyProtos.ChannelSet build() {
        com.geeksville.mesh.AppOnlyProtos.ChannelSet result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.geeksville.mesh.AppOnlyProtos.ChannelSet buildPartial() {
        com.geeksville.mesh.AppOnlyProtos.ChannelSet result = new com.geeksville.mesh.AppOnlyProtos.ChannelSet(this);
        int from_bitField0_ = bitField0_;
        if (settingsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            settings_ = java.util.Collections.unmodifiableList(settings_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.settings_ = settings_;
        } else {
          result.settings_ = settingsBuilder_.build();
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
        if (other instanceof com.geeksville.mesh.AppOnlyProtos.ChannelSet) {
          return mergeFrom((com.geeksville.mesh.AppOnlyProtos.ChannelSet)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.geeksville.mesh.AppOnlyProtos.ChannelSet other) {
        if (other == com.geeksville.mesh.AppOnlyProtos.ChannelSet.getDefaultInstance()) return this;
        if (settingsBuilder_ == null) {
          if (!other.settings_.isEmpty()) {
            if (settings_.isEmpty()) {
              settings_ = other.settings_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSettingsIsMutable();
              settings_.addAll(other.settings_);
            }
            onChanged();
          }
        } else {
          if (!other.settings_.isEmpty()) {
            if (settingsBuilder_.isEmpty()) {
              settingsBuilder_.dispose();
              settingsBuilder_ = null;
              settings_ = other.settings_;
              bitField0_ = (bitField0_ & ~0x00000001);
              settingsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSettingsFieldBuilder() : null;
            } else {
              settingsBuilder_.addAllMessages(other.settings_);
            }
          }
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
        com.geeksville.mesh.AppOnlyProtos.ChannelSet parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.geeksville.mesh.AppOnlyProtos.ChannelSet) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.geeksville.mesh.ChannelProtos.ChannelSettings> settings_ =
        java.util.Collections.emptyList();
      private void ensureSettingsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          settings_ = new java.util.ArrayList<com.geeksville.mesh.ChannelProtos.ChannelSettings>(settings_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.geeksville.mesh.ChannelProtos.ChannelSettings, com.geeksville.mesh.ChannelProtos.ChannelSettings.Builder, com.geeksville.mesh.ChannelProtos.ChannelSettingsOrBuilder> settingsBuilder_;

      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public java.util.List<com.geeksville.mesh.ChannelProtos.ChannelSettings> getSettingsList() {
        if (settingsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(settings_);
        } else {
          return settingsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public int getSettingsCount() {
        if (settingsBuilder_ == null) {
          return settings_.size();
        } else {
          return settingsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public com.geeksville.mesh.ChannelProtos.ChannelSettings getSettings(int index) {
        if (settingsBuilder_ == null) {
          return settings_.get(index);
        } else {
          return settingsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public Builder setSettings(
          int index, com.geeksville.mesh.ChannelProtos.ChannelSettings value) {
        if (settingsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSettingsIsMutable();
          settings_.set(index, value);
          onChanged();
        } else {
          settingsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public Builder setSettings(
          int index, com.geeksville.mesh.ChannelProtos.ChannelSettings.Builder builderForValue) {
        if (settingsBuilder_ == null) {
          ensureSettingsIsMutable();
          settings_.set(index, builderForValue.build());
          onChanged();
        } else {
          settingsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public Builder addSettings(com.geeksville.mesh.ChannelProtos.ChannelSettings value) {
        if (settingsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSettingsIsMutable();
          settings_.add(value);
          onChanged();
        } else {
          settingsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public Builder addSettings(
          int index, com.geeksville.mesh.ChannelProtos.ChannelSettings value) {
        if (settingsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSettingsIsMutable();
          settings_.add(index, value);
          onChanged();
        } else {
          settingsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public Builder addSettings(
          com.geeksville.mesh.ChannelProtos.ChannelSettings.Builder builderForValue) {
        if (settingsBuilder_ == null) {
          ensureSettingsIsMutable();
          settings_.add(builderForValue.build());
          onChanged();
        } else {
          settingsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public Builder addSettings(
          int index, com.geeksville.mesh.ChannelProtos.ChannelSettings.Builder builderForValue) {
        if (settingsBuilder_ == null) {
          ensureSettingsIsMutable();
          settings_.add(index, builderForValue.build());
          onChanged();
        } else {
          settingsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public Builder addAllSettings(
          java.lang.Iterable<? extends com.geeksville.mesh.ChannelProtos.ChannelSettings> values) {
        if (settingsBuilder_ == null) {
          ensureSettingsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, settings_);
          onChanged();
        } else {
          settingsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public Builder clearSettings() {
        if (settingsBuilder_ == null) {
          settings_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          settingsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public Builder removeSettings(int index) {
        if (settingsBuilder_ == null) {
          ensureSettingsIsMutable();
          settings_.remove(index);
          onChanged();
        } else {
          settingsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public com.geeksville.mesh.ChannelProtos.ChannelSettings.Builder getSettingsBuilder(
          int index) {
        return getSettingsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public com.geeksville.mesh.ChannelProtos.ChannelSettingsOrBuilder getSettingsOrBuilder(
          int index) {
        if (settingsBuilder_ == null) {
          return settings_.get(index);  } else {
          return settingsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public java.util.List<? extends com.geeksville.mesh.ChannelProtos.ChannelSettingsOrBuilder> 
           getSettingsOrBuilderList() {
        if (settingsBuilder_ != null) {
          return settingsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(settings_);
        }
      }
      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public com.geeksville.mesh.ChannelProtos.ChannelSettings.Builder addSettingsBuilder() {
        return getSettingsFieldBuilder().addBuilder(
            com.geeksville.mesh.ChannelProtos.ChannelSettings.getDefaultInstance());
      }
      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public com.geeksville.mesh.ChannelProtos.ChannelSettings.Builder addSettingsBuilder(
          int index) {
        return getSettingsFieldBuilder().addBuilder(
            index, com.geeksville.mesh.ChannelProtos.ChannelSettings.getDefaultInstance());
      }
      /**
       * <code>repeated .ChannelSettings settings = 1;</code>
       */
      public java.util.List<com.geeksville.mesh.ChannelProtos.ChannelSettings.Builder> 
           getSettingsBuilderList() {
        return getSettingsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.geeksville.mesh.ChannelProtos.ChannelSettings, com.geeksville.mesh.ChannelProtos.ChannelSettings.Builder, com.geeksville.mesh.ChannelProtos.ChannelSettingsOrBuilder> 
          getSettingsFieldBuilder() {
        if (settingsBuilder_ == null) {
          settingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.geeksville.mesh.ChannelProtos.ChannelSettings, com.geeksville.mesh.ChannelProtos.ChannelSettings.Builder, com.geeksville.mesh.ChannelProtos.ChannelSettingsOrBuilder>(
                  settings_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          settings_ = null;
        }
        return settingsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ChannelSet)
    }

    // @@protoc_insertion_point(class_scope:ChannelSet)
    private static final com.geeksville.mesh.AppOnlyProtos.ChannelSet DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.geeksville.mesh.AppOnlyProtos.ChannelSet();
    }

    public static com.geeksville.mesh.AppOnlyProtos.ChannelSet getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannelSet>
        PARSER = new com.google.protobuf.AbstractParser<ChannelSet>() {
      @java.lang.Override
      public ChannelSet parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChannelSet(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChannelSet> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannelSet> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.geeksville.mesh.AppOnlyProtos.ChannelSet getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelSet_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelSet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rapponly.proto\032\rchannel.proto\"0\n\nChanne" +
      "lSet\022\"\n\010settings\030\001 \003(\0132\020.ChannelSettings" +
      "BI\n\023com.geeksville.meshB\rAppOnlyProtosH\003" +
      "Z!github.com/meshtastic/gomeshprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.geeksville.mesh.ChannelProtos.getDescriptor(),
        });
    internal_static_ChannelSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannelSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelSet_descriptor,
        new java.lang.String[] { "Settings", });
    com.geeksville.mesh.ChannelProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
