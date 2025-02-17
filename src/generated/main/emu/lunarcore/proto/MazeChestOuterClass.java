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

public final class MazeChestOuterClass {
  /**
   * Protobuf type {@code MazeChest}
   */
  public static final class MazeChest extends ProtoMessage<MazeChest> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 total_amount_list = 9;</code>
     */
    private int totalAmountList;

    /**
     * <code>optional uint32 unlocked_amount_list = 12;</code>
     */
    private int unlockedAmountList;

    /**
     * <code>optional .MapInfoChestType map_info_chest_type = 4;</code>
     */
    private int mapInfoChestType;

    private MazeChest() {
    }

    /**
     * @return a new empty instance of {@code MazeChest}
     */
    public static MazeChest newInstance() {
      return new MazeChest();
    }

    /**
     * <code>optional uint32 total_amount_list = 9;</code>
     * @return whether the totalAmountList field is set
     */
    public boolean hasTotalAmountList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 total_amount_list = 9;</code>
     * @return this
     */
    public MazeChest clearTotalAmountList() {
      bitField0_ &= ~0x00000001;
      totalAmountList = 0;
      return this;
    }

    /**
     * <code>optional uint32 total_amount_list = 9;</code>
     * @return the totalAmountList
     */
    public int getTotalAmountList() {
      return totalAmountList;
    }

    /**
     * <code>optional uint32 total_amount_list = 9;</code>
     * @param value the totalAmountList to set
     * @return this
     */
    public MazeChest setTotalAmountList(final int value) {
      bitField0_ |= 0x00000001;
      totalAmountList = value;
      return this;
    }

    /**
     * <code>optional uint32 unlocked_amount_list = 12;</code>
     * @return whether the unlockedAmountList field is set
     */
    public boolean hasUnlockedAmountList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 unlocked_amount_list = 12;</code>
     * @return this
     */
    public MazeChest clearUnlockedAmountList() {
      bitField0_ &= ~0x00000002;
      unlockedAmountList = 0;
      return this;
    }

    /**
     * <code>optional uint32 unlocked_amount_list = 12;</code>
     * @return the unlockedAmountList
     */
    public int getUnlockedAmountList() {
      return unlockedAmountList;
    }

    /**
     * <code>optional uint32 unlocked_amount_list = 12;</code>
     * @param value the unlockedAmountList to set
     * @return this
     */
    public MazeChest setUnlockedAmountList(final int value) {
      bitField0_ |= 0x00000002;
      unlockedAmountList = value;
      return this;
    }

    /**
     * <code>optional .MapInfoChestType map_info_chest_type = 4;</code>
     * @return whether the mapInfoChestType field is set
     */
    public boolean hasMapInfoChestType() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .MapInfoChestType map_info_chest_type = 4;</code>
     * @return this
     */
    public MazeChest clearMapInfoChestType() {
      bitField0_ &= ~0x00000004;
      mapInfoChestType = 0;
      return this;
    }

    /**
     * <code>optional .MapInfoChestType map_info_chest_type = 4;</code>
     * @return the mapInfoChestType
     */
    public MapInfoChestTypeOuterClass.MapInfoChestType getMapInfoChestType() {
      return MapInfoChestTypeOuterClass.MapInfoChestType.forNumber(mapInfoChestType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link MazeChest#getMapInfoChestType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getMapInfoChestTypeValue() {
      return mapInfoChestType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link MapInfoChestTypeOuterClass.MapInfoChestType}. Setting an invalid value
     * can cause {@link MazeChest#getMapInfoChestType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public MazeChest setMapInfoChestTypeValue(final int value) {
      bitField0_ |= 0x00000004;
      mapInfoChestType = value;
      return this;
    }

    /**
     * <code>optional .MapInfoChestType map_info_chest_type = 4;</code>
     * @param value the mapInfoChestType to set
     * @return this
     */
    public MazeChest setMapInfoChestType(final MapInfoChestTypeOuterClass.MapInfoChestType value) {
      bitField0_ |= 0x00000004;
      mapInfoChestType = value.getNumber();
      return this;
    }

    @Override
    public MazeChest copyFrom(final MazeChest other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        totalAmountList = other.totalAmountList;
        unlockedAmountList = other.unlockedAmountList;
        mapInfoChestType = other.mapInfoChestType;
      }
      return this;
    }

    @Override
    public MazeChest mergeFrom(final MazeChest other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasTotalAmountList()) {
        setTotalAmountList(other.totalAmountList);
      }
      if (other.hasUnlockedAmountList()) {
        setUnlockedAmountList(other.unlockedAmountList);
      }
      if (other.hasMapInfoChestType()) {
        setMapInfoChestTypeValue(other.mapInfoChestType);
      }
      return this;
    }

    @Override
    public MazeChest clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      totalAmountList = 0;
      unlockedAmountList = 0;
      mapInfoChestType = 0;
      return this;
    }

    @Override
    public MazeChest clearQuick() {
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
      if (!(o instanceof MazeChest)) {
        return false;
      }
      MazeChest other = (MazeChest) o;
      return bitField0_ == other.bitField0_
        && (!hasTotalAmountList() || totalAmountList == other.totalAmountList)
        && (!hasUnlockedAmountList() || unlockedAmountList == other.unlockedAmountList)
        && (!hasMapInfoChestType() || mapInfoChestType == other.mapInfoChestType);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(totalAmountList);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(unlockedAmountList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 32);
        output.writeEnumNoTag(mapInfoChestType);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(totalAmountList);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(unlockedAmountList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(mapInfoChestType);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public MazeChest mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // totalAmountList
            totalAmountList = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // unlockedAmountList
            unlockedAmountList = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // mapInfoChestType
            final int value = input.readInt32();
            if (MapInfoChestTypeOuterClass.MapInfoChestType.forNumber(value) != null) {
              mapInfoChestType = value;
              bitField0_ |= 0x00000004;
            }
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
        output.writeUInt32(FieldNames.totalAmountList, totalAmountList);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.unlockedAmountList, unlockedAmountList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeEnum(FieldNames.mapInfoChestType, mapInfoChestType, MapInfoChestTypeOuterClass.MapInfoChestType.converter());
      }
      output.endObject();
    }

    @Override
    public MazeChest mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1767834758:
          case -642776150: {
            if (input.isAtField(FieldNames.totalAmountList)) {
              if (!input.trySkipNullValue()) {
                totalAmountList = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -47476647:
          case -941040439: {
            if (input.isAtField(FieldNames.unlockedAmountList)) {
              if (!input.trySkipNullValue()) {
                unlockedAmountList = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 602980561:
          case -763087610: {
            if (input.isAtField(FieldNames.mapInfoChestType)) {
              if (!input.trySkipNullValue()) {
                final MapInfoChestTypeOuterClass.MapInfoChestType value = input.readEnum(MapInfoChestTypeOuterClass.MapInfoChestType.converter());
                if (value != null) {
                  mapInfoChestType = value.getNumber();
                  bitField0_ |= 0x00000004;
                } else {
                  input.skipUnknownEnumValue();
                }
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
    public MazeChest clone() {
      return new MazeChest().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static MazeChest parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new MazeChest(), data).checkInitialized();
    }

    public static MazeChest parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MazeChest(), input).checkInitialized();
    }

    public static MazeChest parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MazeChest(), input).checkInitialized();
    }

    /**
     * @return factory for creating MazeChest messages
     */
    public static MessageFactory<MazeChest> getFactory() {
      return MazeChestFactory.INSTANCE;
    }

    private enum MazeChestFactory implements MessageFactory<MazeChest> {
      INSTANCE;

      @Override
      public MazeChest create() {
        return MazeChest.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName totalAmountList = FieldName.forField("totalAmountList", "total_amount_list");

      static final FieldName unlockedAmountList = FieldName.forField("unlockedAmountList", "unlocked_amount_list");

      static final FieldName mapInfoChestType = FieldName.forField("mapInfoChestType", "map_info_chest_type");
    }
  }
}
