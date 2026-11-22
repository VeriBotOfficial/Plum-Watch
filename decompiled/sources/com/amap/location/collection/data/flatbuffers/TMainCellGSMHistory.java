package com.amap.location.collection.data.flatbuffers;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class TMainCellGSMHistory extends Table {
    public static void addCellAge(FlatBufferBuilder flatBufferBuilder, short s) {
        flatBufferBuilder.addShort(3, s, 0);
    }

    public static void addCid(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(2, i, 0);
    }

    public static void addLac(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(1, i, 0);
    }

    public static void addType(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(0, b, 0);
    }

    public static int createTMainCellGSMHistory(FlatBufferBuilder flatBufferBuilder, byte b, int i, int i2, short s) {
        flatBufferBuilder.startObject(4);
        addCid(flatBufferBuilder, i2);
        addLac(flatBufferBuilder, i);
        addCellAge(flatBufferBuilder, s);
        addType(flatBufferBuilder, b);
        return endTMainCellGSMHistory(flatBufferBuilder);
    }

    public static int endTMainCellGSMHistory(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static TMainCellGSMHistory getRootAsTMainCellGSMHistory(ByteBuffer byteBuffer) {
        return getRootAsTMainCellGSMHistory(byteBuffer, new TMainCellGSMHistory());
    }

    public static void startTMainCellGSMHistory(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(4);
    }

    public TMainCellGSMHistory __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.bb = byteBuffer;
    }

    public short cellAge() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return this.bb.getShort(__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public int cid() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public int lac() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public boolean mutateCellAge(short s) {
        int __offset = __offset(10);
        if (__offset == 0) {
            return false;
        }
        this.bb.putShort(__offset + this.bb_pos, s);
        return true;
    }

    public boolean mutateCid(int i) {
        int __offset = __offset(8);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateLac(int i) {
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

    public byte type() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.bb.get(__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static TMainCellGSMHistory getRootAsTMainCellGSMHistory(ByteBuffer byteBuffer, TMainCellGSMHistory tMainCellGSMHistory) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return tMainCellGSMHistory.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }
}
