package com.amap.location.collection.data.flatbuffers;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class RootTTrack extends Table {
    public static void addGps(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addGpsStatus(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static void addLocScene(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(2, b, 0);
    }

    public static int createGpsStatusVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createRootTTrack(FlatBufferBuilder flatBufferBuilder, int i, int i2, byte b) {
        flatBufferBuilder.startObject(3);
        addGpsStatus(flatBufferBuilder, i2);
        addGps(flatBufferBuilder, i);
        addLocScene(flatBufferBuilder, b);
        return endRootTTrack(flatBufferBuilder);
    }

    public static int endRootTTrack(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static void finishRootTTrackBuffer(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.finish(i);
    }

    public static RootTTrack getRootAsRootTTrack(ByteBuffer byteBuffer) {
        return getRootAsRootTTrack(byteBuffer, new RootTTrack());
    }

    public static void startGpsStatusVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void startRootTTrack(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(3);
    }

    public RootTTrack __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.bb = byteBuffer;
    }

    public TGps gps() {
        return gps(new TGps());
    }

    public TGpsStatus gpsStatus(int i) {
        return gpsStatus(new TGpsStatus(), i);
    }

    public int gpsStatusLength() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public byte locScene() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.bb.get(__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public boolean mutateLocScene(byte b) {
        int __offset = __offset(8);
        if (__offset == 0) {
            return false;
        }
        this.bb.put(__offset + this.bb_pos, b);
        return true;
    }

    public static RootTTrack getRootAsRootTTrack(ByteBuffer byteBuffer, RootTTrack rootTTrack) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return rootTTrack.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public TGps gps(TGps tGps) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return tGps.__assign(__indirect(__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public TGpsStatus gpsStatus(TGpsStatus tGpsStatus, int i) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return tGpsStatus.__init(__indirect(__vector(__offset) + (i * 4)), this.bb);
        }
        return null;
    }
}
