package com.amap.location.collection.data.flatbuffers;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class RootTUploadData extends Table {
    public static void addData(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(2, i, 0);
    }

    public static void addHeader(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static void addKey(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static int createDataVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createHeaderVector(FlatBufferBuilder flatBufferBuilder, byte[] bArr) {
        flatBufferBuilder.startVector(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addByte(bArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createKeyVector(FlatBufferBuilder flatBufferBuilder, byte[] bArr) {
        flatBufferBuilder.startVector(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addByte(bArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createRootTUploadData(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3) {
        flatBufferBuilder.startObject(3);
        addData(flatBufferBuilder, i3);
        addHeader(flatBufferBuilder, i2);
        addKey(flatBufferBuilder, i);
        return endRootTUploadData(flatBufferBuilder);
    }

    public static int endRootTUploadData(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static void finishRootTUploadDataBuffer(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.finish(i);
    }

    public static RootTUploadData getRootAsRootTUploadData(ByteBuffer byteBuffer) {
        return getRootAsRootTUploadData(byteBuffer, new RootTUploadData());
    }

    public static void startDataVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void startHeaderVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(1, i, 1);
    }

    public static void startKeyVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(1, i, 1);
    }

    public static void startRootTUploadData(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(3);
    }

    public RootTUploadData __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.bb = byteBuffer;
    }

    public TData data(int i) {
        return data(new TData(), i);
    }

    public int dataLength() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public byte header(int i) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.bb.get(__vector(__offset) + i);
        }
        return (byte) 0;
    }

    public ByteBuffer headerAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public int headerLength() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public byte key(int i) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.bb.get(__vector(__offset) + i);
        }
        return (byte) 0;
    }

    public ByteBuffer keyAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public int keyLength() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public boolean mutateHeader(int i, byte b) {
        int __offset = __offset(6);
        if (__offset == 0) {
            return false;
        }
        this.bb.put(__vector(__offset) + i, b);
        return true;
    }

    public boolean mutateKey(int i, byte b) {
        int __offset = __offset(4);
        if (__offset == 0) {
            return false;
        }
        this.bb.put(__vector(__offset) + i, b);
        return true;
    }

    public static RootTUploadData getRootAsRootTUploadData(ByteBuffer byteBuffer, RootTUploadData rootTUploadData) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return rootTUploadData.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public TData data(TData tData, int i) {
        int __offset = __offset(8);
        if (__offset != 0) {
            return tData.__assign(__indirect(__vector(__offset) + (i * 4)), this.bb);
        }
        return null;
    }
}
