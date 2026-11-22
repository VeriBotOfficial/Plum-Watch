package com.amap.location.collection.data.flatbuffers;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class TCell extends Table {
    public static void addCellHistory(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(3, i, 0);
    }

    public static void addCellInfo(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(2, i, 0);
    }

    public static void addOperator(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addRadiotype(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(1, b, 0);
    }

    public static int createCellHistoryVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createCellInfoVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createTCell(FlatBufferBuilder flatBufferBuilder, int i, byte b, int i2, int i3) {
        flatBufferBuilder.startObject(4);
        addCellHistory(flatBufferBuilder, i3);
        addCellInfo(flatBufferBuilder, i2);
        addOperator(flatBufferBuilder, i);
        addRadiotype(flatBufferBuilder, b);
        return endTCell(flatBufferBuilder);
    }

    public static int endTCell(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static void finishTCellBuffer(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.finish(i);
    }

    public static TCell getRootAsTCell(ByteBuffer byteBuffer) {
        return getRootAsTCell(byteBuffer, new TCell());
    }

    public static void startCellHistoryVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void startCellInfoVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void startTCell(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(4);
    }

    public TCell __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.bb = byteBuffer;
    }

    public TCellHistory cellHistory(int i) {
        return cellHistory(new TCellHistory(), i);
    }

    public int cellHistoryLength() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public TCellInfo cellInfo(int i) {
        return cellInfo(new TCellInfo(), i);
    }

    public int cellInfoLength() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public boolean mutateRadiotype(byte b) {
        int __offset = __offset(6);
        if (__offset == 0) {
            return false;
        }
        this.bb.put(__offset + this.bb_pos, b);
        return true;
    }

    public String operator() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer operatorAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public byte radiotype() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.bb.get(__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static TCell getRootAsTCell(ByteBuffer byteBuffer, TCell tCell) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return tCell.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public TCellHistory cellHistory(TCellHistory tCellHistory, int i) {
        int __offset = __offset(10);
        if (__offset != 0) {
            return tCellHistory.__assign(__indirect(__vector(__offset) + (i * 4)), this.bb);
        }
        return null;
    }

    public TCellInfo cellInfo(TCellInfo tCellInfo, int i) {
        int __offset = __offset(8);
        if (__offset != 0) {
            return tCellInfo.__assign(__indirect(__vector(__offset) + (i * 4)), this.bb);
        }
        return null;
    }
}
