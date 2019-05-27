// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generic_collection.proto

package cn.leancloud.play.proto;

/**
 * Protobuf type {@code cn.leancloud.play.proto.GenericCollectionValue}
 */
public  final class GenericCollectionValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn.leancloud.play.proto.GenericCollectionValue)
    GenericCollectionValueOrBuilder {
  // Use GenericCollectionValue.newBuilder() to construct.
  private GenericCollectionValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenericCollectionValue() {
    type_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GenericCollectionValue(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 16: {
            valueCase_ = 2;
            value_ = input.readInt32();
            break;
          }
          case 24: {
            valueCase_ = 3;
            value_ = input.readInt64();
            break;
          }
          case 32: {
            valueCase_ = 4;
            value_ = input.readBool();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            valueCase_ = 5;
            value_ = s;
            break;
          }
          case 50: {
            valueCase_ = 6;
            value_ = input.readBytes();
            break;
          }
          case 61: {
            valueCase_ = 7;
            value_ = input.readFloat();
            break;
          }
          case 65: {
            valueCase_ = 8;
            value_ = input.readDouble();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.leancloud.play.proto.GenericCollectionOuterClass.internal_static_cn_leancloud_play_proto_GenericCollectionValue_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.leancloud.play.proto.GenericCollectionOuterClass.internal_static_cn_leancloud_play_proto_GenericCollectionValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.leancloud.play.proto.GenericCollectionValue.class, cn.leancloud.play.proto.GenericCollectionValue.Builder.class);
  }

  /**
   * Protobuf enum {@code cn.leancloud.play.proto.GenericCollectionValue.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NULL = 0;</code>
     */
    NULL(0),
    /**
     * <code>BYTES = 1;</code>
     */
    BYTES(1),
    /**
     * <code>BYTE = 2;</code>
     */
    BYTE(2),
    /**
     * <code>SHORT = 3;</code>
     */
    SHORT(3),
    /**
     * <code>INT = 4;</code>
     */
    INT(4),
    /**
     * <code>LONG = 5;</code>
     */
    LONG(5),
    /**
     * <code>BOOL = 6;</code>
     */
    BOOL(6),
    /**
     * <code>FLOAT = 7;</code>
     */
    FLOAT(7),
    /**
     * <code>DOUBLE = 8;</code>
     */
    DOUBLE(8),
    /**
     * <code>OBJECT = 9;</code>
     */
    OBJECT(9),
    /**
     * <code>STRING = 10;</code>
     */
    STRING(10),
    /**
     * <code>MAP = 11;</code>
     */
    MAP(11),
    /**
     * <code>ARRAY = 12;</code>
     */
    ARRAY(12),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>NULL = 0;</code>
     */
    public static final int NULL_VALUE = 0;
    /**
     * <code>BYTES = 1;</code>
     */
    public static final int BYTES_VALUE = 1;
    /**
     * <code>BYTE = 2;</code>
     */
    public static final int BYTE_VALUE = 2;
    /**
     * <code>SHORT = 3;</code>
     */
    public static final int SHORT_VALUE = 3;
    /**
     * <code>INT = 4;</code>
     */
    public static final int INT_VALUE = 4;
    /**
     * <code>LONG = 5;</code>
     */
    public static final int LONG_VALUE = 5;
    /**
     * <code>BOOL = 6;</code>
     */
    public static final int BOOL_VALUE = 6;
    /**
     * <code>FLOAT = 7;</code>
     */
    public static final int FLOAT_VALUE = 7;
    /**
     * <code>DOUBLE = 8;</code>
     */
    public static final int DOUBLE_VALUE = 8;
    /**
     * <code>OBJECT = 9;</code>
     */
    public static final int OBJECT_VALUE = 9;
    /**
     * <code>STRING = 10;</code>
     */
    public static final int STRING_VALUE = 10;
    /**
     * <code>MAP = 11;</code>
     */
    public static final int MAP_VALUE = 11;
    /**
     * <code>ARRAY = 12;</code>
     */
    public static final int ARRAY_VALUE = 12;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    public static Type forNumber(int value) {
      switch (value) {
        case 0: return NULL;
        case 1: return BYTES;
        case 2: return BYTE;
        case 3: return SHORT;
        case 4: return INT;
        case 5: return LONG;
        case 6: return BOOL;
        case 7: return FLOAT;
        case 8: return DOUBLE;
        case 9: return OBJECT;
        case 10: return STRING;
        case 11: return MAP;
        case 12: return ARRAY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return cn.leancloud.play.proto.GenericCollectionValue.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:cn.leancloud.play.proto.GenericCollectionValue.Type)
  }

  private int valueCase_ = 0;
  private java.lang.Object value_;
  public enum ValueCase
      implements com.google.protobuf.Internal.EnumLite {
    INTVALUE(2),
    LONGINTVALUE(3),
    BOOLVALUE(4),
    STRINGVALUE(5),
    BYTESVALUE(6),
    FLOATVALUE(7),
    DOUBLEVALUE(8),
    VALUE_NOT_SET(0);
    private final int value;
    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 2: return INTVALUE;
        case 3: return LONGINTVALUE;
        case 4: return BOOLVALUE;
        case 5: return STRINGVALUE;
        case 6: return BYTESVALUE;
        case 7: return FLOATVALUE;
        case 8: return DOUBLEVALUE;
        case 0: return VALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase
  getValueCase() {
    return ValueCase.forNumber(
        valueCase_);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>optional .cn.leancloud.play.proto.GenericCollectionValue.Type type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>optional .cn.leancloud.play.proto.GenericCollectionValue.Type type = 1;</code>
   */
  public cn.leancloud.play.proto.GenericCollectionValue.Type getType() {
    cn.leancloud.play.proto.GenericCollectionValue.Type result = cn.leancloud.play.proto.GenericCollectionValue.Type.valueOf(type_);
    return result == null ? cn.leancloud.play.proto.GenericCollectionValue.Type.UNRECOGNIZED : result;
  }

  public static final int INTVALUE_FIELD_NUMBER = 2;
  /**
   * <code>optional int32 intValue = 2;</code>
   */
  public int getIntValue() {
    if (valueCase_ == 2) {
      return (java.lang.Integer) value_;
    }
    return 0;
  }

  public static final int LONGINTVALUE_FIELD_NUMBER = 3;
  /**
   * <code>optional int64 longIntValue = 3;</code>
   */
  public long getLongIntValue() {
    if (valueCase_ == 3) {
      return (java.lang.Long) value_;
    }
    return 0L;
  }

  public static final int BOOLVALUE_FIELD_NUMBER = 4;
  /**
   * <code>optional bool boolValue = 4;</code>
   */
  public boolean getBoolValue() {
    if (valueCase_ == 4) {
      return (java.lang.Boolean) value_;
    }
    return false;
  }

  public static final int STRINGVALUE_FIELD_NUMBER = 5;
  /**
   * <code>optional string stringValue = 5;</code>
   */
  public java.lang.String getStringValue() {
    java.lang.Object ref = "";
    if (valueCase_ == 5) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (valueCase_ == 5) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string stringValue = 5;</code>
   */
  public com.google.protobuf.ByteString
      getStringValueBytes() {
    java.lang.Object ref = "";
    if (valueCase_ == 5) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (valueCase_ == 5) {
        value_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BYTESVALUE_FIELD_NUMBER = 6;
  /**
   * <code>optional bytes bytesValue = 6;</code>
   */
  public com.google.protobuf.ByteString getBytesValue() {
    if (valueCase_ == 6) {
      return (com.google.protobuf.ByteString) value_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int FLOATVALUE_FIELD_NUMBER = 7;
  /**
   * <code>optional float floatValue = 7;</code>
   */
  public float getFloatValue() {
    if (valueCase_ == 7) {
      return (java.lang.Float) value_;
    }
    return 0F;
  }

  public static final int DOUBLEVALUE_FIELD_NUMBER = 8;
  /**
   * <code>optional double doubleValue = 8;</code>
   */
  public double getDoubleValue() {
    if (valueCase_ == 8) {
      return (java.lang.Double) value_;
    }
    return 0D;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (type_ != cn.leancloud.play.proto.GenericCollectionValue.Type.NULL.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (valueCase_ == 2) {
      output.writeInt32(
          2, (int)((java.lang.Integer) value_));
    }
    if (valueCase_ == 3) {
      output.writeInt64(
          3, (long)((java.lang.Long) value_));
    }
    if (valueCase_ == 4) {
      output.writeBool(
          4, (boolean)((java.lang.Boolean) value_));
    }
    if (valueCase_ == 5) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, value_);
    }
    if (valueCase_ == 6) {
      output.writeBytes(
          6, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) value_));
    }
    if (valueCase_ == 7) {
      output.writeFloat(
          7, (float)((java.lang.Float) value_));
    }
    if (valueCase_ == 8) {
      output.writeDouble(
          8, (double)((java.lang.Double) value_));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != cn.leancloud.play.proto.GenericCollectionValue.Type.NULL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (valueCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            2, (int)((java.lang.Integer) value_));
    }
    if (valueCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            3, (long)((java.lang.Long) value_));
    }
    if (valueCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            4, (boolean)((java.lang.Boolean) value_));
    }
    if (valueCase_ == 5) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, value_);
    }
    if (valueCase_ == 6) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            6, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) value_));
    }
    if (valueCase_ == 7) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(
            7, (float)((java.lang.Float) value_));
    }
    if (valueCase_ == 8) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(
            8, (double)((java.lang.Double) value_));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cn.leancloud.play.proto.GenericCollectionValue)) {
      return super.equals(obj);
    }
    cn.leancloud.play.proto.GenericCollectionValue other = (cn.leancloud.play.proto.GenericCollectionValue) obj;

    boolean result = true;
    result = result && type_ == other.type_;
    result = result && getValueCase().equals(
        other.getValueCase());
    if (!result) return false;
    switch (valueCase_) {
      case 2:
        result = result && (getIntValue()
            == other.getIntValue());
        break;
      case 3:
        result = result && (getLongIntValue()
            == other.getLongIntValue());
        break;
      case 4:
        result = result && (getBoolValue()
            == other.getBoolValue());
        break;
      case 5:
        result = result && getStringValue()
            .equals(other.getStringValue());
        break;
      case 6:
        result = result && getBytesValue()
            .equals(other.getBytesValue());
        break;
      case 7:
        result = result && (
            java.lang.Float.floatToIntBits(getFloatValue())
            == java.lang.Float.floatToIntBits(
                other.getFloatValue()));
        break;
      case 8:
        result = result && (
            java.lang.Double.doubleToLongBits(getDoubleValue())
            == java.lang.Double.doubleToLongBits(
                other.getDoubleValue()));
        break;
      case 0:
      default:
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    switch (valueCase_) {
      case 2:
        hash = (37 * hash) + INTVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getIntValue();
        break;
      case 3:
        hash = (37 * hash) + LONGINTVALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getLongIntValue());
        break;
      case 4:
        hash = (37 * hash) + BOOLVALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getBoolValue());
        break;
      case 5:
        hash = (37 * hash) + STRINGVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getStringValue().hashCode();
        break;
      case 6:
        hash = (37 * hash) + BYTESVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getBytesValue().hashCode();
        break;
      case 7:
        hash = (37 * hash) + FLOATVALUE_FIELD_NUMBER;
        hash = (53 * hash) + java.lang.Float.floatToIntBits(
            getFloatValue());
        break;
      case 8:
        hash = (37 * hash) + DOUBLEVALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getDoubleValue()));
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.leancloud.play.proto.GenericCollectionValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.leancloud.play.proto.GenericCollectionValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.leancloud.play.proto.GenericCollectionValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.leancloud.play.proto.GenericCollectionValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.leancloud.play.proto.GenericCollectionValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.leancloud.play.proto.GenericCollectionValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.leancloud.play.proto.GenericCollectionValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.leancloud.play.proto.GenericCollectionValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.leancloud.play.proto.GenericCollectionValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.leancloud.play.proto.GenericCollectionValue parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cn.leancloud.play.proto.GenericCollectionValue prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code cn.leancloud.play.proto.GenericCollectionValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn.leancloud.play.proto.GenericCollectionValue)
      cn.leancloud.play.proto.GenericCollectionValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.leancloud.play.proto.GenericCollectionOuterClass.internal_static_cn_leancloud_play_proto_GenericCollectionValue_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.leancloud.play.proto.GenericCollectionOuterClass.internal_static_cn_leancloud_play_proto_GenericCollectionValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.leancloud.play.proto.GenericCollectionValue.class, cn.leancloud.play.proto.GenericCollectionValue.Builder.class);
    }

    // Construct using cn.leancloud.play.proto.GenericCollectionValue.newBuilder()
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
    public Builder clear() {
      super.clear();
      type_ = 0;

      valueCase_ = 0;
      value_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.leancloud.play.proto.GenericCollectionOuterClass.internal_static_cn_leancloud_play_proto_GenericCollectionValue_descriptor;
    }

    public cn.leancloud.play.proto.GenericCollectionValue getDefaultInstanceForType() {
      return cn.leancloud.play.proto.GenericCollectionValue.getDefaultInstance();
    }

    public cn.leancloud.play.proto.GenericCollectionValue build() {
      cn.leancloud.play.proto.GenericCollectionValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cn.leancloud.play.proto.GenericCollectionValue buildPartial() {
      cn.leancloud.play.proto.GenericCollectionValue result = new cn.leancloud.play.proto.GenericCollectionValue(this);
      result.type_ = type_;
      if (valueCase_ == 2) {
        result.value_ = value_;
      }
      if (valueCase_ == 3) {
        result.value_ = value_;
      }
      if (valueCase_ == 4) {
        result.value_ = value_;
      }
      if (valueCase_ == 5) {
        result.value_ = value_;
      }
      if (valueCase_ == 6) {
        result.value_ = value_;
      }
      if (valueCase_ == 7) {
        result.value_ = value_;
      }
      if (valueCase_ == 8) {
        result.value_ = value_;
      }
      result.valueCase_ = valueCase_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cn.leancloud.play.proto.GenericCollectionValue) {
        return mergeFrom((cn.leancloud.play.proto.GenericCollectionValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.leancloud.play.proto.GenericCollectionValue other) {
      if (other == cn.leancloud.play.proto.GenericCollectionValue.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      switch (other.getValueCase()) {
        case INTVALUE: {
          setIntValue(other.getIntValue());
          break;
        }
        case LONGINTVALUE: {
          setLongIntValue(other.getLongIntValue());
          break;
        }
        case BOOLVALUE: {
          setBoolValue(other.getBoolValue());
          break;
        }
        case STRINGVALUE: {
          valueCase_ = 5;
          value_ = other.value_;
          onChanged();
          break;
        }
        case BYTESVALUE: {
          setBytesValue(other.getBytesValue());
          break;
        }
        case FLOATVALUE: {
          setFloatValue(other.getFloatValue());
          break;
        }
        case DOUBLEVALUE: {
          setDoubleValue(other.getDoubleValue());
          break;
        }
        case VALUE_NOT_SET: {
          break;
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      cn.leancloud.play.proto.GenericCollectionValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.leancloud.play.proto.GenericCollectionValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int valueCase_ = 0;
    private java.lang.Object value_;
    public ValueCase
        getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }


    private int type_ = 0;
    /**
     * <code>optional .cn.leancloud.play.proto.GenericCollectionValue.Type type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>optional .cn.leancloud.play.proto.GenericCollectionValue.Type type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .cn.leancloud.play.proto.GenericCollectionValue.Type type = 1;</code>
     */
    public cn.leancloud.play.proto.GenericCollectionValue.Type getType() {
      cn.leancloud.play.proto.GenericCollectionValue.Type result = cn.leancloud.play.proto.GenericCollectionValue.Type.valueOf(type_);
      return result == null ? cn.leancloud.play.proto.GenericCollectionValue.Type.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .cn.leancloud.play.proto.GenericCollectionValue.Type type = 1;</code>
     */
    public Builder setType(cn.leancloud.play.proto.GenericCollectionValue.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .cn.leancloud.play.proto.GenericCollectionValue.Type type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    /**
     * <code>optional int32 intValue = 2;</code>
     */
    public int getIntValue() {
      if (valueCase_ == 2) {
        return (java.lang.Integer) value_;
      }
      return 0;
    }
    /**
     * <code>optional int32 intValue = 2;</code>
     */
    public Builder setIntValue(int value) {
      valueCase_ = 2;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 intValue = 2;</code>
     */
    public Builder clearIntValue() {
      if (valueCase_ == 2) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>optional int64 longIntValue = 3;</code>
     */
    public long getLongIntValue() {
      if (valueCase_ == 3) {
        return (java.lang.Long) value_;
      }
      return 0L;
    }
    /**
     * <code>optional int64 longIntValue = 3;</code>
     */
    public Builder setLongIntValue(long value) {
      valueCase_ = 3;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 longIntValue = 3;</code>
     */
    public Builder clearLongIntValue() {
      if (valueCase_ == 3) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>optional bool boolValue = 4;</code>
     */
    public boolean getBoolValue() {
      if (valueCase_ == 4) {
        return (java.lang.Boolean) value_;
      }
      return false;
    }
    /**
     * <code>optional bool boolValue = 4;</code>
     */
    public Builder setBoolValue(boolean value) {
      valueCase_ = 4;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool boolValue = 4;</code>
     */
    public Builder clearBoolValue() {
      if (valueCase_ == 4) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>optional string stringValue = 5;</code>
     */
    public java.lang.String getStringValue() {
      java.lang.Object ref = "";
      if (valueCase_ == 5) {
        ref = value_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valueCase_ == 5) {
          value_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string stringValue = 5;</code>
     */
    public com.google.protobuf.ByteString
        getStringValueBytes() {
      java.lang.Object ref = "";
      if (valueCase_ == 5) {
        ref = value_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (valueCase_ == 5) {
          value_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string stringValue = 5;</code>
     */
    public Builder setStringValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  valueCase_ = 5;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string stringValue = 5;</code>
     */
    public Builder clearStringValue() {
      if (valueCase_ == 5) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional string stringValue = 5;</code>
     */
    public Builder setStringValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      valueCase_ = 5;
      value_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>optional bytes bytesValue = 6;</code>
     */
    public com.google.protobuf.ByteString getBytesValue() {
      if (valueCase_ == 6) {
        return (com.google.protobuf.ByteString) value_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <code>optional bytes bytesValue = 6;</code>
     */
    public Builder setBytesValue(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  valueCase_ = 6;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes bytesValue = 6;</code>
     */
    public Builder clearBytesValue() {
      if (valueCase_ == 6) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>optional float floatValue = 7;</code>
     */
    public float getFloatValue() {
      if (valueCase_ == 7) {
        return (java.lang.Float) value_;
      }
      return 0F;
    }
    /**
     * <code>optional float floatValue = 7;</code>
     */
    public Builder setFloatValue(float value) {
      valueCase_ = 7;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional float floatValue = 7;</code>
     */
    public Builder clearFloatValue() {
      if (valueCase_ == 7) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>optional double doubleValue = 8;</code>
     */
    public double getDoubleValue() {
      if (valueCase_ == 8) {
        return (java.lang.Double) value_;
      }
      return 0D;
    }
    /**
     * <code>optional double doubleValue = 8;</code>
     */
    public Builder setDoubleValue(double value) {
      valueCase_ = 8;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double doubleValue = 8;</code>
     */
    public Builder clearDoubleValue() {
      if (valueCase_ == 8) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:cn.leancloud.play.proto.GenericCollectionValue)
  }

  // @@protoc_insertion_point(class_scope:cn.leancloud.play.proto.GenericCollectionValue)
  private static final cn.leancloud.play.proto.GenericCollectionValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.leancloud.play.proto.GenericCollectionValue();
  }

  public static cn.leancloud.play.proto.GenericCollectionValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenericCollectionValue>
      PARSER = new com.google.protobuf.AbstractParser<GenericCollectionValue>() {
    public GenericCollectionValue parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GenericCollectionValue(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GenericCollectionValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenericCollectionValue> getParserForType() {
    return PARSER;
  }

  public cn.leancloud.play.proto.GenericCollectionValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
