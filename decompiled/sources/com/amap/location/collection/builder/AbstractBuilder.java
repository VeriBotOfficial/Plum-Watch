package com.amap.location.collection.builder;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes11.dex */
public abstract class AbstractBuilder {
    private ByteBuffer mByteBuffer;
    RobustFlatBufferBuilder mFlatBufferBuilder;

    AbstractBuilder(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        this.mByteBuffer = allocate;
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        this.mFlatBufferBuilder = new RobustFlatBufferBuilder(this.mByteBuffer);
    }

    public AbstractBuilder init() {
        this.mFlatBufferBuilder.init(this.mByteBuffer);
        return this;
    }
}
