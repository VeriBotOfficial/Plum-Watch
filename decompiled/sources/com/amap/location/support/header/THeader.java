package com.amap.location.support.header;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class THeader extends Table {
    public static void addAdiu(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(4, i, 0);
    }

    public static void addBrand(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(9, i, 0);
    }

    public static void addDeviceMac(FlatBufferBuilder flatBufferBuilder, long j) {
        flatBufferBuilder.addLong(8, j, 0L);
    }

    public static void addImei(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(6, i, 0);
    }

    public static void addImsi(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(7, i, 0);
    }

    public static void addLicense(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(11, i, 0);
    }

    public static void addMapkey(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(12, i, 0);
    }

    public static void addModel(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(10, i, 0);
    }

    public static void addOsVer(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(3, b, 0);
    }

    public static void addPackageName(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static void addProductId(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(0, b, 0);
    }

    public static void addProductVerion(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(2, i, 0);
    }

    public static void addUtdid(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(5, i, 0);
    }

    public static int createTHeader(FlatBufferBuilder flatBufferBuilder, byte b, int i, int i2, byte b2, int i3, int i4, int i5, int i6, long j, int i7, int i8, int i9, int i10) {
        flatBufferBuilder.startObject(13);
        addDeviceMac(flatBufferBuilder, j);
        addMapkey(flatBufferBuilder, i10);
        addLicense(flatBufferBuilder, i9);
        addModel(flatBufferBuilder, i8);
        addBrand(flatBufferBuilder, i7);
        addImsi(flatBufferBuilder, i6);
        addImei(flatBufferBuilder, i5);
        addUtdid(flatBufferBuilder, i4);
        addAdiu(flatBufferBuilder, i3);
        addProductVerion(flatBufferBuilder, i2);
        addPackageName(flatBufferBuilder, i);
        addOsVer(flatBufferBuilder, b2);
        addProductId(flatBufferBuilder, b);
        return endTHeader(flatBufferBuilder);
    }

    public static int endTHeader(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static void finishTHeaderBuffer(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.finish(i);
    }

    public static THeader getRootAsTHeader(ByteBuffer byteBuffer) {
        return getRootAsTHeader(byteBuffer, new THeader());
    }

    public static void startTHeader(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(13);
    }

    public THeader __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.bb = byteBuffer;
    }

    public String adiu() {
        int __offset = __offset(12);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer adiuAsByteBuffer() {
        return __vector_as_bytebuffer(12, 1);
    }

    public String brand() {
        int __offset = __offset(22);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer brandAsByteBuffer() {
        return __vector_as_bytebuffer(22, 1);
    }

    public long deviceMac() {
        int __offset = __offset(20);
        if (__offset != 0) {
            return this.bb.getLong(__offset + this.bb_pos);
        }
        return 0L;
    }

    public String imei() {
        int __offset = __offset(16);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer imeiAsByteBuffer() {
        return __vector_as_bytebuffer(16, 1);
    }

    public String imsi() {
        int __offset = __offset(18);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer imsiAsByteBuffer() {
        return __vector_as_bytebuffer(18, 1);
    }

    public String license() {
        int __offset = __offset(26);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer licenseAsByteBuffer() {
        return __vector_as_bytebuffer(26, 1);
    }

    public String mapkey() {
        int __offset = __offset(28);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer mapkeyAsByteBuffer() {
        return __vector_as_bytebuffer(28, 1);
    }

    public String model() {
        int __offset = __offset(24);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer modelAsByteBuffer() {
        return __vector_as_bytebuffer(24, 1);
    }

    public byte osVer() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return this.bb.get(__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public String packageName() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer packageNameAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public byte productId() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.bb.get(__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public String productVerion() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer productVerionAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public String utdid() {
        int __offset = __offset(14);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer utdidAsByteBuffer() {
        return __vector_as_bytebuffer(14, 1);
    }

    public static THeader getRootAsTHeader(ByteBuffer byteBuffer, THeader tHeader) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return tHeader.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }
}
