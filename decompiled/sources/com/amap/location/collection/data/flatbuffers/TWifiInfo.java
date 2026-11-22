package com.amap.location.collection.data.flatbuffers;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class TWifiInfo extends Table {
    public static void addFrequency(FlatBufferBuilder flatBufferBuilder, short s) {
        flatBufferBuilder.addShort(5, s, 0);
    }

    public static void addFreshness(FlatBufferBuilder flatBufferBuilder, short s) {
        flatBufferBuilder.addShort(4, s, 0);
    }

    public static void addIsMain(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(0, z, false);
    }

    public static void addMac(FlatBufferBuilder flatBufferBuilder, long j) {
        flatBufferBuilder.addLong(1, j, 0L);
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(3, i, 0);
    }

    public static void addRssi(FlatBufferBuilder flatBufferBuilder, short s) {
        flatBufferBuilder.addShort(2, s, 0);
    }

    public static int createTWifiInfo(FlatBufferBuilder flatBufferBuilder, boolean z, long j, short s, int i, short s2, short s3) {
        flatBufferBuilder.startObject(6);
        addMac(flatBufferBuilder, j);
        addName(flatBufferBuilder, i);
        addFrequency(flatBufferBuilder, s3);
        addFreshness(flatBufferBuilder, s2);
        addRssi(flatBufferBuilder, s);
        addIsMain(flatBufferBuilder, z);
        return endTWifiInfo(flatBufferBuilder);
    }

    public static int endTWifiInfo(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static TWifiInfo getRootAsTWifiInfo(ByteBuffer byteBuffer) {
        return getRootAsTWifiInfo(byteBuffer, new TWifiInfo());
    }

    public static void startTWifiInfo(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(6);
    }

    public TWifiInfo __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.bb = byteBuffer;
    }

    public short frequency() {
        int __offset = __offset(14);
        if (__offset != 0) {
            return this.bb.getShort(__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public short freshness() {
        int __offset = __offset(12);
        if (__offset != 0) {
            return this.bb.getShort(__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public boolean isMain() {
        int __offset = __offset(4);
        return (__offset == 0 || this.bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }

    public long mac() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.bb.getLong(__offset + this.bb_pos);
        }
        return 0L;
    }

    public boolean mutateFrequency(short s) {
        int __offset = __offset(14);
        if (__offset == 0) {
            return false;
        }
        this.bb.putShort(__offset + this.bb_pos, s);
        return true;
    }

    public boolean mutateFreshness(short s) {
        int __offset = __offset(12);
        if (__offset == 0) {
            return false;
        }
        this.bb.putShort(__offset + this.bb_pos, s);
        return true;
    }

    public boolean mutateIsMain(boolean z) {
        int __offset = __offset(4);
        if (__offset == 0) {
            return false;
        }
        this.bb.put(__offset + this.bb_pos, z ? (byte) 1 : (byte) 0);
        return true;
    }

    public boolean mutateMac(long j) {
        int __offset = __offset(6);
        if (__offset == 0) {
            return false;
        }
        this.bb.putLong(__offset + this.bb_pos, j);
        return true;
    }

    public boolean mutateRssi(short s) {
        int __offset = __offset(8);
        if (__offset == 0) {
            return false;
        }
        this.bb.putShort(__offset + this.bb_pos, s);
        return true;
    }

    public String name() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer nameAsByteBuffer() {
        return __vector_as_bytebuffer(10, 1);
    }

    public short rssi() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.bb.getShort(__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public static TWifiInfo getRootAsTWifiInfo(ByteBuffer byteBuffer, TWifiInfo tWifiInfo) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return tWifiInfo.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }
}
