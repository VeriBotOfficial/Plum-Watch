package com.amap.location.collection.data.flatbuffers;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public final class RootTLocator extends Table {
    public static void addCell(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(2, i, 0);
    }

    public static void addGps(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addWifi(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static int createRootTLocator(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3) {
        flatBufferBuilder.startObject(3);
        addCell(flatBufferBuilder, i3);
        addWifi(flatBufferBuilder, i2);
        addGps(flatBufferBuilder, i);
        return endRootTLocator(flatBufferBuilder);
    }

    public static int endRootTLocator(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static void finishRootTLocatorBuffer(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.finish(i);
    }

    public static RootTLocator getRootAsRootTLocator(ByteBuffer byteBuffer) {
        return getRootAsRootTLocator(byteBuffer, new RootTLocator());
    }

    public static void startRootTLocator(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(3);
    }

    public RootTLocator __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.bb = byteBuffer;
    }

    public TCell cell() {
        return cell(new TCell());
    }

    public TGps gps() {
        return gps(new TGps());
    }

    public TWifi wifi() {
        return wifi(new TWifi());
    }

    public static RootTLocator getRootAsRootTLocator(ByteBuffer byteBuffer, RootTLocator rootTLocator) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return rootTLocator.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public TCell cell(TCell tCell) {
        int __offset = __offset(8);
        if (__offset != 0) {
            return tCell.__assign(__indirect(__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public TGps gps(TGps tGps) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return tGps.__assign(__indirect(__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public TWifi wifi(TWifi tWifi) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return tWifi.__assign(__indirect(__offset + this.bb_pos), this.bb);
        }
        return null;
    }
}
