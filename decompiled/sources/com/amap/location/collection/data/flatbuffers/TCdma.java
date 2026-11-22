package com.amap.location.collection.data.flatbuffers;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class TCdma extends Table {
    public static void addAsulevel(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(6, i, 0);
    }

    public static void addBid(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(2, i, 0);
    }

    public static void addLat(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(3, i, 0);
    }

    public static void addLon(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(4, i, 0);
    }

    public static void addNid(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(1, i, 0);
    }

    public static void addRssi(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(5, i, 0);
    }

    public static void addSid(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(0, i, 0);
    }

    public static int createTCdma(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        flatBufferBuilder.startObject(7);
        addAsulevel(flatBufferBuilder, i7);
        addRssi(flatBufferBuilder, i6);
        addLon(flatBufferBuilder, i5);
        addLat(flatBufferBuilder, i4);
        addBid(flatBufferBuilder, i3);
        addNid(flatBufferBuilder, i2);
        addSid(flatBufferBuilder, i);
        return endTCdma(flatBufferBuilder);
    }

    public static int endTCdma(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static TCdma getRootAsTCdma(ByteBuffer byteBuffer) {
        return getRootAsTCdma(byteBuffer, new TCdma());
    }

    public static void startTCdma(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(7);
    }

    public TCdma __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.bb = byteBuffer;
    }

    public int asulevel() {
        int __offset = __offset(16);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public int bid() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public int lat() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public int lon() {
        int __offset = __offset(12);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public boolean mutateAsulevel(int i) {
        int __offset = __offset(16);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateBid(int i) {
        int __offset = __offset(8);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateLat(int i) {
        int __offset = __offset(10);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateLon(int i) {
        int __offset = __offset(12);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateNid(int i) {
        int __offset = __offset(6);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateRssi(int i) {
        int __offset = __offset(14);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateSid(int i) {
        int __offset = __offset(4);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public int nid() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public int rssi() {
        int __offset = __offset(14);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public int sid() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public static TCdma getRootAsTCdma(ByteBuffer byteBuffer, TCdma tCdma) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return tCdma.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int createTCdma(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3, int i4, int i5, int i6) {
        flatBufferBuilder.startObject(7);
        addRssi(flatBufferBuilder, i6);
        addLon(flatBufferBuilder, i5);
        addLat(flatBufferBuilder, i4);
        addBid(flatBufferBuilder, i3);
        addNid(flatBufferBuilder, i2);
        addSid(flatBufferBuilder, i);
        return endTCdma(flatBufferBuilder);
    }
}
