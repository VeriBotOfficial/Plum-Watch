package com.amap.location.collection.data.flatbuffers;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class TCellHistory extends Table {
    public static void addCellData(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static void addCellDataType(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(0, b, 0);
    }

    public static int createTCellHistory(FlatBufferBuilder flatBufferBuilder, byte b, int i) {
        flatBufferBuilder.startObject(2);
        addCellData(flatBufferBuilder, i);
        addCellDataType(flatBufferBuilder, b);
        return endTCellHistory(flatBufferBuilder);
    }

    public static int endTCellHistory(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static TCellHistory getRootAsTCellHistory(ByteBuffer byteBuffer) {
        return getRootAsTCellHistory(byteBuffer, new TCellHistory());
    }

    public static void startTCellHistory(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(2);
    }

    public TCellHistory __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.bb = byteBuffer;
    }

    public Table cellData(Table table) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __union(table, __offset);
        }
        return null;
    }

    public byte cellDataType() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.bb.get(__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public boolean mutateCellDataType(byte b) {
        int __offset = __offset(4);
        if (__offset == 0) {
            return false;
        }
        this.bb.put(__offset + this.bb_pos, b);
        return true;
    }

    public static TCellHistory getRootAsTCellHistory(ByteBuffer byteBuffer, TCellHistory tCellHistory) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return tCellHistory.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }
}
