package com.amap.location.collection.data.flatbuffers;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class TCellInfo extends Table {
    public static void addCellData(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(4, i, 0);
    }

    public static void addCellDataType(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(3, b, 0);
    }

    public static void addFreshness(FlatBufferBuilder flatBufferBuilder, short s) {
        flatBufferBuilder.addShort(2, s, 0);
    }

    public static void addInterfaceType(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(1, b, 0);
    }

    public static void addIsMain(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(0, b, 0);
    }

    public static int createTCellInfo(FlatBufferBuilder flatBufferBuilder, byte b, byte b2, short s, byte b3, int i) {
        flatBufferBuilder.startObject(5);
        addCellData(flatBufferBuilder, i);
        addFreshness(flatBufferBuilder, s);
        addCellDataType(flatBufferBuilder, b3);
        addInterfaceType(flatBufferBuilder, b2);
        addIsMain(flatBufferBuilder, b);
        return endTCellInfo(flatBufferBuilder);
    }

    public static int endTCellInfo(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static TCellInfo getRootAsTCellInfo(ByteBuffer byteBuffer) {
        return getRootAsTCellInfo(byteBuffer, new TCellInfo());
    }

    public static void startTCellInfo(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(5);
    }

    public TCellInfo __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.bb = byteBuffer;
    }

    public Table cellData(Table table) {
        int __offset = __offset(12);
        if (__offset != 0) {
            return __union(table, __offset);
        }
        return null;
    }

    public byte cellDataType() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return this.bb.get(__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public short freshness() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.bb.getShort(__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public byte interfaceType() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.bb.get(__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public byte isMain() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.bb.get(__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public boolean mutateCellDataType(byte b) {
        int __offset = __offset(10);
        if (__offset == 0) {
            return false;
        }
        this.bb.put(__offset + this.bb_pos, b);
        return true;
    }

    public boolean mutateFreshness(short s) {
        int __offset = __offset(8);
        if (__offset == 0) {
            return false;
        }
        this.bb.putShort(__offset + this.bb_pos, s);
        return true;
    }

    public boolean mutateInterfaceType(byte b) {
        int __offset = __offset(6);
        if (__offset == 0) {
            return false;
        }
        this.bb.put(__offset + this.bb_pos, b);
        return true;
    }

    public boolean mutateIsMain(byte b) {
        int __offset = __offset(4);
        if (__offset == 0) {
            return false;
        }
        this.bb.put(__offset + this.bb_pos, b);
        return true;
    }

    public static TCellInfo getRootAsTCellInfo(ByteBuffer byteBuffer, TCellInfo tCellInfo) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return tCellInfo.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }
}
