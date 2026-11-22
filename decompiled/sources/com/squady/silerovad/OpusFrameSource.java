package com.squady.silerovad;

import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VadSession.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squady/silerovad/OpusFrameSource;", "Lcom/squady/silerovad/VadFrameSource;", ApiConstants.STREAM, "Lcom/squady/silerovad/OpusVadStream;", "(Lcom/squady/silerovad/OpusVadStream;)V", "close", "", "finish", "", "Lcom/squady/silerovad/OpusVadFrame;", "poll", "push", "audio", "", "offset", "", "length", "silero-vad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OpusFrameSource implements VadFrameSource {
    private final OpusVadStream stream;

    public OpusFrameSource(OpusVadStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.stream = stream;
    }

    @Override // com.squady.silerovad.VadFrameSource
    public List<OpusVadFrame> push(byte[] audio, int offset, int length) {
        Intrinsics.checkNotNullParameter(audio, "audio");
        return this.stream.push(audio, offset, length);
    }

    @Override // com.squady.silerovad.VadFrameSource
    public List<OpusVadFrame> poll() {
        return this.stream.poll();
    }

    @Override // com.squady.silerovad.VadFrameSource
    public List<OpusVadFrame> finish() {
        return this.stream.finish();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.stream.close();
    }
}
