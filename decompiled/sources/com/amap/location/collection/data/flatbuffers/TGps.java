package com.amap.location.collection.data.flatbuffers;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class TGps extends Table {
    public static void addAccuracy(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(5, i, 0);
    }

    public static void addAltitude(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(4, i, 0);
    }

    public static void addAveSNR(FlatBufferBuilder flatBufferBuilder, short s) {
        flatBufferBuilder.addShort(9, s, 0);
    }

    public static void addDirection(FlatBufferBuilder flatBufferBuilder, short s) {
        flatBufferBuilder.addShort(7, s, 0);
    }

    public static void addLatitude(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(3, i, 0);
    }

    public static void addLongitude(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(2, i, 0);
    }

    public static void addNmeaTime(FlatBufferBuilder flatBufferBuilder, long j) {
        flatBufferBuilder.addLong(1, j, 0L);
    }

    public static void addSatelliteCount(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(8, b, 0);
    }

    public static void addSpeed(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(6, i, 0);
    }

    public static void addSystemTime(FlatBufferBuilder flatBufferBuilder, long j) {
        flatBufferBuilder.addLong(0, j, 0L);
    }

    public static int createTGps(FlatBufferBuilder flatBufferBuilder, long j, long j2, int i, int i2, int i3, int i4, int i5, short s, byte b, short s2) {
        flatBufferBuilder.startObject(10);
        addNmeaTime(flatBufferBuilder, j2);
        addSystemTime(flatBufferBuilder, j);
        addSpeed(flatBufferBuilder, i5);
        addAccuracy(flatBufferBuilder, i4);
        addAltitude(flatBufferBuilder, i3);
        addLatitude(flatBufferBuilder, i2);
        addLongitude(flatBufferBuilder, i);
        addAveSNR(flatBufferBuilder, s2);
        addDirection(flatBufferBuilder, s);
        addSatelliteCount(flatBufferBuilder, b);
        return endTGps(flatBufferBuilder);
    }

    public static int endTGps(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static void finishTGpsBuffer(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.finish(i);
    }

    public static TGps getRootAsTGps(ByteBuffer byteBuffer) {
        return getRootAsTGps(byteBuffer, new TGps());
    }

    public static void startTGps(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(10);
    }

    public TGps __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.bb = byteBuffer;
    }

    public int accuracy() {
        int __offset = __offset(14);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public int altitude() {
        int __offset = __offset(12);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public short aveSNR() {
        int __offset = __offset(22);
        if (__offset != 0) {
            return this.bb.getShort(__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public short direction() {
        int __offset = __offset(18);
        if (__offset != 0) {
            return this.bb.getShort(__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public int latitude() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public int longitude() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public boolean mutateAccuracy(int i) {
        int __offset = __offset(14);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateAltitude(int i) {
        int __offset = __offset(12);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateAveSNR(short s) {
        int __offset = __offset(22);
        if (__offset == 0) {
            return false;
        }
        this.bb.putShort(__offset + this.bb_pos, s);
        return true;
    }

    public boolean mutateDirection(short s) {
        int __offset = __offset(18);
        if (__offset == 0) {
            return false;
        }
        this.bb.putShort(__offset + this.bb_pos, s);
        return true;
    }

    public boolean mutateLatitude(int i) {
        int __offset = __offset(10);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateLongitude(int i) {
        int __offset = __offset(8);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateNmeaTime(long j) {
        int __offset = __offset(6);
        if (__offset == 0) {
            return false;
        }
        this.bb.putLong(__offset + this.bb_pos, j);
        return true;
    }

    public boolean mutateSatelliteCount(byte b) {
        int __offset = __offset(20);
        if (__offset == 0) {
            return false;
        }
        this.bb.put(__offset + this.bb_pos, b);
        return true;
    }

    public boolean mutateSpeed(int i) {
        int __offset = __offset(16);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateSystemTime(long j) {
        int __offset = __offset(4);
        if (__offset == 0) {
            return false;
        }
        this.bb.putLong(__offset + this.bb_pos, j);
        return true;
    }

    public long nmeaTime() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.bb.getLong(__offset + this.bb_pos);
        }
        return 0L;
    }

    public byte satelliteCount() {
        int __offset = __offset(20);
        if (__offset != 0) {
            return this.bb.get(__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public int speed() {
        int __offset = __offset(16);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public long systemTime() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.bb.getLong(__offset + this.bb_pos);
        }
        return 0L;
    }

    public static TGps getRootAsTGps(ByteBuffer byteBuffer, TGps tGps) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return tGps.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int createTGps(FlatBufferBuilder flatBufferBuilder, long j, long j2, int i, int i2, int i3, int i4, int i5, short s, byte b) {
        flatBufferBuilder.startObject(10);
        addNmeaTime(flatBufferBuilder, j2);
        addSystemTime(flatBufferBuilder, j);
        addSpeed(flatBufferBuilder, i5);
        addAccuracy(flatBufferBuilder, i4);
        addAltitude(flatBufferBuilder, i3);
        addLatitude(flatBufferBuilder, i2);
        addLongitude(flatBufferBuilder, i);
        addDirection(flatBufferBuilder, s);
        addSatelliteCount(flatBufferBuilder, b);
        return endTGps(flatBufferBuilder);
    }
}
