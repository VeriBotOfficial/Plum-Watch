package com.amap.location.collection.data.flatbuffers;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class TGpsStatus extends Table {
    public static void addAzimuth(FlatBufferBuilder flatBufferBuilder, short s) {
        flatBufferBuilder.addShort(3, s, 0);
    }

    public static void addConstellationType(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(5, b, 0);
    }

    public static void addElevation(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(2, b, 0);
    }

    public static void addPrn(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(0, b, 0);
    }

    public static void addSnr(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(1, b, 0);
    }

    public static void addUsedInFix(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(4, b, 0);
    }

    public static int createTGpsStatus(FlatBufferBuilder flatBufferBuilder, byte b, byte b2, byte b3, short s, byte b4, byte b5) {
        flatBufferBuilder.startObject(6);
        addAzimuth(flatBufferBuilder, s);
        addConstellationType(flatBufferBuilder, b5);
        addUsedInFix(flatBufferBuilder, b4);
        addElevation(flatBufferBuilder, b3);
        addSnr(flatBufferBuilder, b2);
        addPrn(flatBufferBuilder, b);
        return endTGpsStatus(flatBufferBuilder);
    }

    public static int endTGpsStatus(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static void finishTGpsStatusBuffer(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.finish(i);
    }

    public static TGpsStatus getRootAsTGpsStatus(ByteBuffer byteBuffer) {
        return getRootAsTGpsStatus(byteBuffer, new TGpsStatus());
    }

    public static void startTGpsStatus(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(6);
    }

    public TGpsStatus __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.bb = byteBuffer;
        return this;
    }

    public short azimuth() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return this.bb.getShort(__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public byte constellationType() {
        int __offset = __offset(14);
        if (__offset != 0) {
            return this.bb.get(__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public byte elevation() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.bb.get(__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public byte prn() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.bb.get(__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public byte snr() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.bb.get(__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public byte usedInFix() {
        int __offset = __offset(12);
        if (__offset != 0) {
            return this.bb.get(__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static TGpsStatus getRootAsTGpsStatus(ByteBuffer byteBuffer, TGpsStatus tGpsStatus) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return tGpsStatus.__init(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int createTGpsStatus(FlatBufferBuilder flatBufferBuilder, byte b, byte b2, byte b3, short s, byte b4) {
        flatBufferBuilder.startObject(6);
        addAzimuth(flatBufferBuilder, s);
        addUsedInFix(flatBufferBuilder, b4);
        addElevation(flatBufferBuilder, b3);
        addSnr(flatBufferBuilder, b2);
        addPrn(flatBufferBuilder, b);
        return endTGpsStatus(flatBufferBuilder);
    }
}
