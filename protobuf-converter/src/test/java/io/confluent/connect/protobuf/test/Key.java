// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: key.proto
// Protobuf Java Version: 4.29.3

package io.confluent.connect.protobuf.test;

public final class Key {
  private Key() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      Key.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KeyMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KeyMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 key = 1;</code>
     * @return The key.
     */
    int getKey();
  }
  /**
   * Protobuf type {@code KeyMessage}
   */
  public static final class KeyMessage extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:KeyMessage)
      KeyMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 3,
        /* suffix= */ "",
        KeyMessage.class.getName());
    }
    // Use KeyMessage.newBuilder() to construct.
    private KeyMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private KeyMessage() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.confluent.connect.protobuf.test.Key.internal_static_KeyMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.confluent.connect.protobuf.test.Key.internal_static_KeyMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.confluent.connect.protobuf.test.Key.KeyMessage.class, io.confluent.connect.protobuf.test.Key.KeyMessage.Builder.class);
    }

    public static final int KEY_FIELD_NUMBER = 1;
    private int key_ = 0;
    /**
     * <code>int32 key = 1;</code>
     * @return The key.
     */
    @java.lang.Override
    public int getKey() {
      return key_;
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
      if (key_ != 0) {
        output.writeInt32(1, key_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (key_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, key_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof io.confluent.connect.protobuf.test.Key.KeyMessage)) {
        return super.equals(obj);
      }
      io.confluent.connect.protobuf.test.Key.KeyMessage other = (io.confluent.connect.protobuf.test.Key.KeyMessage) obj;

      if (getKey()
          != other.getKey()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.confluent.connect.protobuf.test.Key.KeyMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.connect.protobuf.test.Key.KeyMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.connect.protobuf.test.Key.KeyMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.connect.protobuf.test.Key.KeyMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.connect.protobuf.test.Key.KeyMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.connect.protobuf.test.Key.KeyMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.connect.protobuf.test.Key.KeyMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.connect.protobuf.test.Key.KeyMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.confluent.connect.protobuf.test.Key.KeyMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static io.confluent.connect.protobuf.test.Key.KeyMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.connect.protobuf.test.Key.KeyMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.connect.protobuf.test.Key.KeyMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.confluent.connect.protobuf.test.Key.KeyMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code KeyMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KeyMessage)
        io.confluent.connect.protobuf.test.Key.KeyMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.confluent.connect.protobuf.test.Key.internal_static_KeyMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.confluent.connect.protobuf.test.Key.internal_static_KeyMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.confluent.connect.protobuf.test.Key.KeyMessage.class, io.confluent.connect.protobuf.test.Key.KeyMessage.Builder.class);
      }

      // Construct using io.confluent.connect.protobuf.test.Key.KeyMessage.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        key_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.confluent.connect.protobuf.test.Key.internal_static_KeyMessage_descriptor;
      }

      @java.lang.Override
      public io.confluent.connect.protobuf.test.Key.KeyMessage getDefaultInstanceForType() {
        return io.confluent.connect.protobuf.test.Key.KeyMessage.getDefaultInstance();
      }

      @java.lang.Override
      public io.confluent.connect.protobuf.test.Key.KeyMessage build() {
        io.confluent.connect.protobuf.test.Key.KeyMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.confluent.connect.protobuf.test.Key.KeyMessage buildPartial() {
        io.confluent.connect.protobuf.test.Key.KeyMessage result = new io.confluent.connect.protobuf.test.Key.KeyMessage(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(io.confluent.connect.protobuf.test.Key.KeyMessage result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.key_ = key_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.confluent.connect.protobuf.test.Key.KeyMessage) {
          return mergeFrom((io.confluent.connect.protobuf.test.Key.KeyMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.confluent.connect.protobuf.test.Key.KeyMessage other) {
        if (other == io.confluent.connect.protobuf.test.Key.KeyMessage.getDefaultInstance()) return this;
        if (other.getKey() != 0) {
          setKey(other.getKey());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                key_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int key_ ;
      /**
       * <code>int32 key = 1;</code>
       * @return The key.
       */
      @java.lang.Override
      public int getKey() {
        return key_;
      }
      /**
       * <code>int32 key = 1;</code>
       * @param value The key to set.
       * @return This builder for chaining.
       */
      public Builder setKey(int value) {

        key_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 key = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        key_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:KeyMessage)
    }

    // @@protoc_insertion_point(class_scope:KeyMessage)
    private static final io.confluent.connect.protobuf.test.Key.KeyMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.confluent.connect.protobuf.test.Key.KeyMessage();
    }

    public static io.confluent.connect.protobuf.test.Key.KeyMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KeyMessage>
        PARSER = new com.google.protobuf.AbstractParser<KeyMessage>() {
      @java.lang.Override
      public KeyMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<KeyMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KeyMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.confluent.connect.protobuf.test.Key.KeyMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KeyMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_KeyMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tkey.proto\032 google/protobuf/descriptor." +
      "proto\"\031\n\nKeyMessage\022\013\n\003key\030\001 \001(\005B)\n\"io.c" +
      "onfluent.connect.protobuf.testB\003Keyb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_KeyMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KeyMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_KeyMessage_descriptor,
        new java.lang.String[] { "Key", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
