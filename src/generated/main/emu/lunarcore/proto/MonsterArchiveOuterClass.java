// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class MonsterArchiveOuterClass {
  /**
   * Protobuf type {@code MonsterArchive}
   */
  public static final class MonsterArchive extends ProtoMessage<MonsterArchive> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 monster_id = 10;</code>
     */
    private int monsterId;

    /**
     * <code>optional uint32 num = 14;</code>
     */
    private int num;

    private MonsterArchive() {
    }

    /**
     * @return a new empty instance of {@code MonsterArchive}
     */
    public static MonsterArchive newInstance() {
      return new MonsterArchive();
    }

    /**
     * <code>optional uint32 monster_id = 10;</code>
     * @return whether the monsterId field is set
     */
    public boolean hasMonsterId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 monster_id = 10;</code>
     * @return this
     */
    public MonsterArchive clearMonsterId() {
      bitField0_ &= ~0x00000001;
      monsterId = 0;
      return this;
    }

    /**
     * <code>optional uint32 monster_id = 10;</code>
     * @return the monsterId
     */
    public int getMonsterId() {
      return monsterId;
    }

    /**
     * <code>optional uint32 monster_id = 10;</code>
     * @param value the monsterId to set
     * @return this
     */
    public MonsterArchive setMonsterId(final int value) {
      bitField0_ |= 0x00000001;
      monsterId = value;
      return this;
    }

    /**
     * <code>optional uint32 num = 14;</code>
     * @return whether the num field is set
     */
    public boolean hasNum() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 num = 14;</code>
     * @return this
     */
    public MonsterArchive clearNum() {
      bitField0_ &= ~0x00000002;
      num = 0;
      return this;
    }

    /**
     * <code>optional uint32 num = 14;</code>
     * @return the num
     */
    public int getNum() {
      return num;
    }

    /**
     * <code>optional uint32 num = 14;</code>
     * @param value the num to set
     * @return this
     */
    public MonsterArchive setNum(final int value) {
      bitField0_ |= 0x00000002;
      num = value;
      return this;
    }

    @Override
    public MonsterArchive copyFrom(final MonsterArchive other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        monsterId = other.monsterId;
        num = other.num;
      }
      return this;
    }

    @Override
    public MonsterArchive mergeFrom(final MonsterArchive other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMonsterId()) {
        setMonsterId(other.monsterId);
      }
      if (other.hasNum()) {
        setNum(other.num);
      }
      return this;
    }

    @Override
    public MonsterArchive clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      monsterId = 0;
      num = 0;
      return this;
    }

    @Override
    public MonsterArchive clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof MonsterArchive)) {
        return false;
      }
      MonsterArchive other = (MonsterArchive) o;
      return bitField0_ == other.bitField0_
        && (!hasMonsterId() || monsterId == other.monsterId)
        && (!hasNum() || num == other.num);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(monsterId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(num);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(monsterId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(num);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public MonsterArchive mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // monsterId
            monsterId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // num
            num = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.monsterId, monsterId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.num, num);
      }
      output.endObject();
    }

    @Override
    public MonsterArchive mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1316830571:
          case 2127946656: {
            if (input.isAtField(FieldNames.monsterId)) {
              if (!input.trySkipNullValue()) {
                monsterId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109446: {
            if (input.isAtField(FieldNames.num)) {
              if (!input.trySkipNullValue()) {
                num = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public MonsterArchive clone() {
      return new MonsterArchive().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static MonsterArchive parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new MonsterArchive(), data).checkInitialized();
    }

    public static MonsterArchive parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MonsterArchive(), input).checkInitialized();
    }

    public static MonsterArchive parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MonsterArchive(), input).checkInitialized();
    }

    /**
     * @return factory for creating MonsterArchive messages
     */
    public static MessageFactory<MonsterArchive> getFactory() {
      return MonsterArchiveFactory.INSTANCE;
    }

    private enum MonsterArchiveFactory implements MessageFactory<MonsterArchive> {
      INSTANCE;

      @Override
      public MonsterArchive create() {
        return MonsterArchive.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName monsterId = FieldName.forField("monsterId", "monster_id");

      static final FieldName num = FieldName.forField("num");
    }
  }
}
