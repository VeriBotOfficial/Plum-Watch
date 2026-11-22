package com.phancy.mini.utils;

import com.iflytek.cloud.SpeechEvent;
import java.io.ByteArrayInputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BufferStream.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/phancy/mini/utils/BufferStream;", "Ljava/io/ByteArrayInputStream;", SpeechEvent.KEY_EVENT_TTS_BUFFER, "", "([B)V", "getBuffer", "()[B", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BufferStream extends ByteArrayInputStream {
    private final byte[] buffer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferStream(byte[] buffer) {
        super(buffer);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
    }

    public final byte[] getBuffer() {
        return this.buffer;
    }
}
