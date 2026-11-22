package com.amap.location.collection.data.flatbuffers;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class TGsm extends Table {
    public static void addArfcn(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(5, i, 0);
    }

    public static void addAsulevel(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(7, i, 0);
    }

    public static void addBsic(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(6, i, 0);
    }

    public static void addCid(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(3, i, 0);
    }

    public static void addLac(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(2, i, 0);
    }

    public static void addMcc(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(0, i, 0);
    }

    public static void addMnc(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(1, i, 0);
    }

    public static void addPsc(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(8, i, 0);
    }

    public static void addRssi(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(4, i, 0);
    }

    public static int createTGsm(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        flatBufferBuilder.startObject(9);
        addPsc(flatBufferBuilder, i9);
        addAsulevel(flatBufferBuilder, i8);
        addBsic(flatBufferBuilder, i7);
        addArfcn(flatBufferBuilder, i6);
        addRssi(flatBufferBuilder, i5);
        addCid(flatBufferBuilder, i4);
        addLac(flatBufferBuilder, i3);
        addMnc(flatBufferBuilder, i2);
        addMcc(flatBufferBuilder, i);
        return endTGsm(flatBufferBuilder);
    }

    public static int endTGsm(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static TGsm getRootAsTGsm(ByteBuffer byteBuffer) {
        return getRootAsTGsm(byteBuffer, new TGsm());
    }

    public static void startTGsm(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(8);
    }

    public TGsm __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.bb = byteBuffer;
    }

    public int arfcn() {
        int __offset = __offset(14);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public int asulevel() {
        int __offset = __offset(18);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public int bsic() {
        int __offset = __offset(16);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public int cid() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public int lac() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public int mcc() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public int mnc() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public boolean mutateArfcn(int i) {
        int __offset = __offset(14);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateAsulevel(int i) {
        int __offset = __offset(18);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateBsic(int i) {
        int __offset = __offset(16);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateCid(int i) {
        int __offset = __offset(10);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateLac(int i) {
        int __offset = __offset(8);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateMcc(int i) {
        int __offset = __offset(4);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateMnc(int i) {
        int __offset = __offset(6);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutatePsc(int i) {
        int __offset = __offset(20);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public boolean mutateRssi(int i) {
        int __offset = __offset(12);
        if (__offset == 0) {
            return false;
        }
        this.bb.putInt(__offset + this.bb_pos, i);
        return true;
    }

    public int psc() {
        int __offset = __offset(20);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public int rssi() {
        int __offset = __offset(12);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public static TGsm getRootAsTGsm(ByteBuffer byteBuffer, TGsm tGsm) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return tGsm.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int createTGsm(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3, int i4) {
        flatBufferBuilder.startObject(9);
        addRssi(flatBufferBuilder, i3);
        addCid(flatBufferBuilder, i2);
        addLac(flatBufferBuilder, i);
        addPsc(flatBufferBuilder, i4);
        return endTGsm(flatBufferBuilder);
    }
}
