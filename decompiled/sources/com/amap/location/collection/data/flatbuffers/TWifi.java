package com.amap.location.collection.data.flatbuffers;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class TWifi extends Table {
    public static void addWifiInfo(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static int createTWifi(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startObject(1);
        addWifiInfo(flatBufferBuilder, i);
        return endTWifi(flatBufferBuilder);
    }

    public static int createWifiInfoVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int endTWifi(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static void finishTWifiBuffer(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.finish(i);
    }

    public static TWifi getRootAsTWifi(ByteBuffer byteBuffer) {
        return getRootAsTWifi(byteBuffer, new TWifi());
    }

    public static void startTWifi(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(1);
    }

    public static void startWifiInfoVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public TWifi __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.bb = byteBuffer;
    }

    public TWifiInfo wifiInfo(int i) {
        return wifiInfo(new TWifiInfo(), i);
    }

    public int wifiInfoLength() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public static TWifi getRootAsTWifi(ByteBuffer byteBuffer, TWifi tWifi) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return tWifi.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public TWifiInfo wifiInfo(TWifiInfo tWifiInfo, int i) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return tWifiInfo.__assign(__indirect(__vector(__offset) + (i * 4)), this.bb);
        }
        return null;
    }
}
