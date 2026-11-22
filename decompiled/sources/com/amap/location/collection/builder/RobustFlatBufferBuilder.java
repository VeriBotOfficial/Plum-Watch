package com.amap.location.collection.builder;

import com.amap.location.support.log.ALLog;
import com.google.flatbuffers.FlatBufferBuilder;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public class RobustFlatBufferBuilder extends FlatBufferBuilder {
    RobustFlatBufferBuilder(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    @Override // com.google.flatbuffers.FlatBufferBuilder
    public int createString(CharSequence charSequence) {
        try {
            return super.createString(charSequence);
        } catch (Throwable th) {
            ALLog.d(th);
            return super.createString("");
        }
    }
}
