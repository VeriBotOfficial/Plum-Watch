package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.yandex.mobile.ads.impl.gv0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class x32 implements gv0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f17307a;
    private ByteBuffer[] b;
    private ByteBuffer[] c;

    public static class a implements gv0.b {
        protected static MediaCodec b(gv0.a aVar) throws IOException {
            aVar.f15631a.getClass();
            String str = aVar.f15631a.f16054a;
            u52.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            u52.a();
            return createByCodecName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.mobile.ads.impl.x32-IA] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // com.yandex.mobile.ads.impl.gv0.b
        public final gv0 a(gv0.a aVar) throws IOException {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec b = b(aVar);
                try {
                    u52.a("configureCodec");
                    b.configure(aVar.b, aVar.d, aVar.e, 0);
                    u52.a();
                    u52.a("startCodec");
                    b.start();
                    u52.a();
                    return new x32(b);
                } catch (IOException | RuntimeException e) {
                    e = e;
                    mediaCodec = b;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (RuntimeException e3) {
                e = e3;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final ByteBuffer c(int i) {
        return f92.f15466a >= 21 ? this.f17307a.getOutputBuffer(i) : this.c[i];
    }

    private x32(MediaCodec mediaCodec) {
        this.f17307a = mediaCodec;
        if (f92.f15466a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final int b() {
        return this.f17307a.dequeueInputBuffer(0L);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final ByteBuffer b(int i) {
        if (f92.f15466a >= 21) {
            return this.f17307a.getInputBuffer(i);
        }
        return this.b[i];
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f17307a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && f92.f15466a < 21) {
                this.c = this.f17307a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void flush() {
        this.f17307a.flush();
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void release() {
        this.b = null;
        this.c = null;
        this.f17307a.release();
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final MediaFormat a() {
        return this.f17307a.getOutputFormat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(gv0.c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.a(j);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void a(int i, int i2, long j, int i3) {
        this.f17307a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void a(int i, gv gvVar, long j) {
        this.f17307a.queueSecureInputBuffer(i, 0, gvVar.a(), j, 0);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void a(int i, long j) {
        this.f17307a.releaseOutputBuffer(i, j);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void a(boolean z, int i) {
        this.f17307a.releaseOutputBuffer(i, z);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void a(final gv0.c cVar, Handler handler) {
        this.f17307a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.yandex.mobile.ads.impl.x32$$ExternalSyntheticLambda0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                x32.this.a(cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void a(Surface surface) {
        this.f17307a.setOutputSurface(surface);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void a(Bundle bundle) {
        this.f17307a.setParameters(bundle);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void a(int i) {
        this.f17307a.setVideoScalingMode(i);
    }
}
