package com.amap.location.collection.data.flatbuffers;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class TMainCellCDMAHistory extends Table {
    public static void addBid(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(3, i, 0);
    }

    public static void addCellAge(FlatBufferBuilder flatBufferBuilder, short s) {
        flatBufferBuilder.addShort(4, s, 0);
    }

    public static void addNid(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(2, i, 0);
    }

    public static void addSid(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(1, i, 0);
    }

    public static void addType(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(0, b, 0);
    }

    public static int createTMainCellCDMAHistory(FlatBufferBuilder flatBufferBuilder, byte b, int i, int i2, int i3, short s) {
        flatBufferBuilder.startObject(5);
        addBid(flatBufferBuilder, i3);
        addNid(flatBufferBuilder, i2);
        addSid(flatBufferBuilder, i);
        addCellAge(flatBufferBuilder, s);
        addType(flatBufferBuilder, b);
        return endTMainCellCDMAHistory(flatBufferBuilder);
    }

    public static int endTMainCellCDMAHistory(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static TMainCellCDMAHistory getRootAsTMainCellCDMAHistory(ByteBuffer byteBuffer) {
        return getRootAsTMainCellCDMAHistory(byteBuffer, new TMainCellCDMAHistory());
    }

    public static void startTMainCellCDMAHistory(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(5);
    }

    public TMainCellCDMAHistory __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.bb = byteBuffer;
    }

    public int bid() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public short cellAge() {
        int __offset = __offset(12);
        if (__offset != 0) {
            return this.bb.getShort(__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public boolean mutateBid(int i) {
        int __offset = __offset(10);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateCellAge(short s) {
        int __offset = __offset(12);
        if (__offset == 0) {
            return false;
        }
        this.bb.putShort(__offset + this.bb_pos, s);
        return true;
    }

    public boolean mutateNid(int i) {
        int __offset = __offset(8);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateSid(int i) {
        int __offset = __offset(6);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateType(byte b) {
        int __offset = __offset(4);
        if (__offset == 0) {
            return false;
        }
        this.bb.put(__offset + this.bb_pos, b);
        return true;
    }

    public int nid() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public int sid() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public byte type() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.bb.get(__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static TMainCellCDMAHistory getRootAsTMainCellCDMAHistory(ByteBuffer byteBuffer, TMainCellCDMAHistory tMainCellCDMAHistory) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return tMainCellCDMAHistory.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }
}
