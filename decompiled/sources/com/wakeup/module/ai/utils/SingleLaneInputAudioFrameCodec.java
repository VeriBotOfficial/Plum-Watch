package com.wakeup.module.ai.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingleLaneInputAudioFrameCodec.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bJ\"\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/wakeup/module/ai/utils/SingleLaneInputAudioFrameCodec;", "", "<init>", "()V", "TIMESTAMP_LENGTH", "", "HEADER_LENGTH", "FULL_HEADER_LENGTH", "getFULL_HEADER_LENGTH", "()I", "encode", "", "timestamp", "", "streamId", "", "payload", "decode", "Lkotlin/Triple;", "frame", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SingleLaneInputAudioFrameCodec {
    public static final int HEADER_LENGTH = 2;
    public static final int TIMESTAMP_LENGTH = 8;
    public static final SingleLaneInputAudioFrameCodec INSTANCE = new SingleLaneInputAudioFrameCodec();
    private static final int FULL_HEADER_LENGTH = 10;

    private SingleLaneInputAudioFrameCodec() {
    }

    public final int getFULL_HEADER_LENGTH() {
        return FULL_HEADER_LENGTH;
    }

    public final byte[] encode(long timestamp, short streamId, byte[] payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.length == 0) {
            return new byte[0];
        }
        ByteBuffer allocate = ByteBuffer.allocate(FULL_HEADER_LENGTH + payload.length);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.putLong(timestamp);
        allocate.putShort(streamId);
        allocate.put(payload);
        byte[] array = allocate.array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        return array;
    }

    public final Triple<Long, Short, byte[]> decode(byte[] frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        if (frame.length < FULL_HEADER_LENGTH + 1) {
            return null;
        }
        ByteBuffer order = ByteBuffer.wrap(frame).order(ByteOrder.BIG_ENDIAN);
        long j = order.getLong();
        short s = order.getShort();
        byte[] bArr = new byte[order.remaining()];
        order.get(bArr);
        return new Triple<>(Long.valueOf(j), Short.valueOf(s), bArr);
    }
}
