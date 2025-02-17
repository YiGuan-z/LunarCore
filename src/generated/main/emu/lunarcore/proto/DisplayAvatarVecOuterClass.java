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
import us.hebi.quickbuf.RepeatedMessage;

public final class DisplayAvatarVecOuterClass {
  /**
   * Protobuf type {@code DisplayAvatarVec}
   */
  public static final class DisplayAvatarVec extends ProtoMessage<DisplayAvatarVec> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional bool is_display = 5;</code>
     */
    private boolean isDisplay;

    /**
     * <code>repeated .DisplayAvatar display_avatar_list = 14;</code>
     */
    private final RepeatedMessage<DisplayAvatarOuterClass.DisplayAvatar> displayAvatarList = RepeatedMessage.newEmptyInstance(DisplayAvatarOuterClass.DisplayAvatar.getFactory());

    private DisplayAvatarVec() {
    }

    /**
     * @return a new empty instance of {@code DisplayAvatarVec}
     */
    public static DisplayAvatarVec newInstance() {
      return new DisplayAvatarVec();
    }

    /**
     * <code>optional bool is_display = 5;</code>
     * @return whether the isDisplay field is set
     */
    public boolean hasIsDisplay() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional bool is_display = 5;</code>
     * @return this
     */
    public DisplayAvatarVec clearIsDisplay() {
      bitField0_ &= ~0x00000001;
      isDisplay = false;
      return this;
    }

    /**
     * <code>optional bool is_display = 5;</code>
     * @return the isDisplay
     */
    public boolean getIsDisplay() {
      return isDisplay;
    }

    /**
     * <code>optional bool is_display = 5;</code>
     * @param value the isDisplay to set
     * @return this
     */
    public DisplayAvatarVec setIsDisplay(final boolean value) {
      bitField0_ |= 0x00000001;
      isDisplay = value;
      return this;
    }

    /**
     * <code>repeated .DisplayAvatar display_avatar_list = 14;</code>
     * @return whether the displayAvatarList field is set
     */
    public boolean hasDisplayAvatarList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .DisplayAvatar display_avatar_list = 14;</code>
     * @return this
     */
    public DisplayAvatarVec clearDisplayAvatarList() {
      bitField0_ &= ~0x00000002;
      displayAvatarList.clear();
      return this;
    }

    /**
     * <code>repeated .DisplayAvatar display_avatar_list = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableDisplayAvatarList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<DisplayAvatarOuterClass.DisplayAvatar> getDisplayAvatarList() {
      return displayAvatarList;
    }

    /**
     * <code>repeated .DisplayAvatar display_avatar_list = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<DisplayAvatarOuterClass.DisplayAvatar> getMutableDisplayAvatarList() {
      bitField0_ |= 0x00000002;
      return displayAvatarList;
    }

    /**
     * <code>repeated .DisplayAvatar display_avatar_list = 14;</code>
     * @param value the displayAvatarList to add
     * @return this
     */
    public DisplayAvatarVec addDisplayAvatarList(
        final DisplayAvatarOuterClass.DisplayAvatar value) {
      bitField0_ |= 0x00000002;
      displayAvatarList.add(value);
      return this;
    }

    /**
     * <code>repeated .DisplayAvatar display_avatar_list = 14;</code>
     * @param values the displayAvatarList to add
     * @return this
     */
    public DisplayAvatarVec addAllDisplayAvatarList(
        final DisplayAvatarOuterClass.DisplayAvatar... values) {
      bitField0_ |= 0x00000002;
      displayAvatarList.addAll(values);
      return this;
    }

    @Override
    public DisplayAvatarVec copyFrom(final DisplayAvatarVec other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        isDisplay = other.isDisplay;
        displayAvatarList.copyFrom(other.displayAvatarList);
      }
      return this;
    }

    @Override
    public DisplayAvatarVec mergeFrom(final DisplayAvatarVec other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasIsDisplay()) {
        setIsDisplay(other.isDisplay);
      }
      if (other.hasDisplayAvatarList()) {
        getMutableDisplayAvatarList().addAll(other.displayAvatarList);
      }
      return this;
    }

    @Override
    public DisplayAvatarVec clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      isDisplay = false;
      displayAvatarList.clear();
      return this;
    }

    @Override
    public DisplayAvatarVec clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      displayAvatarList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof DisplayAvatarVec)) {
        return false;
      }
      DisplayAvatarVec other = (DisplayAvatarVec) o;
      return bitField0_ == other.bitField0_
        && (!hasIsDisplay() || isDisplay == other.isDisplay)
        && (!hasDisplayAvatarList() || displayAvatarList.equals(other.displayAvatarList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeBoolNoTag(isDisplay);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < displayAvatarList.length(); i++) {
          output.writeRawByte((byte) 114);
          output.writeMessageNoTag(displayAvatarList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * displayAvatarList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(displayAvatarList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DisplayAvatarVec mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // isDisplay
            isDisplay = input.readBool();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // displayAvatarList
            tag = input.readRepeatedMessage(displayAvatarList, tag);
            bitField0_ |= 0x00000002;
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
        output.writeBool(FieldNames.isDisplay, isDisplay);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedMessage(FieldNames.displayAvatarList, displayAvatarList);
      }
      output.endObject();
    }

    @Override
    public DisplayAvatarVec mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1091985464:
          case -1122893139: {
            if (input.isAtField(FieldNames.isDisplay)) {
              if (!input.trySkipNullValue()) {
                isDisplay = input.readBool();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2117925881:
          case 245562311: {
            if (input.isAtField(FieldNames.displayAvatarList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(displayAvatarList);
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
    public DisplayAvatarVec clone() {
      return new DisplayAvatarVec().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DisplayAvatarVec parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DisplayAvatarVec(), data).checkInitialized();
    }

    public static DisplayAvatarVec parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DisplayAvatarVec(), input).checkInitialized();
    }

    public static DisplayAvatarVec parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DisplayAvatarVec(), input).checkInitialized();
    }

    /**
     * @return factory for creating DisplayAvatarVec messages
     */
    public static MessageFactory<DisplayAvatarVec> getFactory() {
      return DisplayAvatarVecFactory.INSTANCE;
    }

    private enum DisplayAvatarVecFactory implements MessageFactory<DisplayAvatarVec> {
      INSTANCE;

      @Override
      public DisplayAvatarVec create() {
        return DisplayAvatarVec.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName isDisplay = FieldName.forField("isDisplay", "is_display");

      static final FieldName displayAvatarList = FieldName.forField("displayAvatarList", "display_avatar_list");
    }
  }
}
