package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.yandex.mobile.ads.impl.gv0;
import com.yandex.mobile.ads.impl.hh;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
final class hh implements gv0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f15686a;
    private final jh b;
    private final ih c;
    private final boolean d;
    private boolean e;
    private int f;

    public static final class a implements gv0.b {

        /* renamed from: a, reason: collision with root package name */
        private final t32<HandlerThread> f15687a;
        private final t32<HandlerThread> b;

        public a(final int i) {
            this(new t32() { // from class: com.yandex.mobile.ads.impl.hh$a$$ExternalSyntheticLambda0
                @Override // com.yandex.mobile.ads.impl.t32
                public final Object get() {
                    HandlerThread a2;
                    a2 = hh.a.a(i);
                    return a2;
                }
            }, new t32() { // from class: com.yandex.mobile.ads.impl.hh$a$$ExternalSyntheticLambda1
                @Override // com.yandex.mobile.ads.impl.t32
                public final Object get() {
                    HandlerThread b;
                    b = hh.a.b(i);
                    return b;
                }
            });
        }

        a(t32 t32Var, t32 t32Var2) {
            this.f15687a = t32Var;
            this.b = t32Var2;
        }

        @Override // com.yandex.mobile.ads.impl.gv0.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final hh a(gv0.a aVar) throws IOException {
            Exception exc;
            MediaCodec mediaCodec;
            hh hhVar;
            String str = aVar.f15631a.f16054a;
            hh hhVar2 = null;
            try {
                u52.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    hhVar = new hh(mediaCodec, this.f15687a.get(), this.b.get(), false);
                } catch (Exception e) {
                    exc = e;
                }
            } catch (Exception e2) {
                exc = e2;
                mediaCodec = null;
            }
            try {
                u52.a();
                hhVar.a(aVar.b, aVar.d, aVar.e);
                return hhVar;
            } catch (Exception e3) {
                exc = e3;
                hhVar2 = hhVar;
                if (hhVar2 != null) {
                    hhVar2.release();
                    throw exc;
                }
                if (mediaCodec != null) {
                    mediaCodec.release();
                    throw exc;
                }
                throw exc;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static HandlerThread a(int i) {
            StringBuilder sb = new StringBuilder("ExoPlayer:MediaCodecAsyncAdapter:");
            if (i == 1) {
                sb.append("Audio");
            } else if (i == 2) {
                sb.append("Video");
            } else {
                sb.append("Unknown(").append(i).append(Separators.RPAREN);
            }
            return new HandlerThread(sb.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static HandlerThread b(int i) {
            StringBuilder sb = new StringBuilder("ExoPlayer:MediaCodecQueueingThread:");
            if (i == 1) {
                sb.append("Audio");
            } else if (i == 2) {
                sb.append("Video");
            } else {
                sb.append("Unknown(").append(i).append(Separators.RPAREN);
            }
            return new HandlerThread(sb.toString());
        }
    }

    private hh(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.f15686a = mediaCodec;
        this.b = new jh(handlerThread);
        this.c = new ih(mediaCodec, handlerThread2);
        this.d = z;
        this.f = 0;
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final int b() {
        return this.b.a();
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        return this.b.a(bufferInfo);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final ByteBuffer c(int i) {
        return this.f15686a.getOutputBuffer(i);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void flush() {
        this.c.a();
        this.f15686a.flush();
        this.b.b();
        this.f15686a.start();
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void release() {
        try {
            if (this.f == 1) {
                this.c.c();
                this.b.e();
            }
            this.f = 2;
        } finally {
            if (!this.e) {
                this.f15686a.release();
                this.e = true;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final MediaFormat a() {
        return this.b.c();
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final ByteBuffer b(int i) {
        return this.f15686a.getInputBuffer(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        this.b.a(this.f15686a);
        u52.a("configureCodec");
        this.f15686a.configure(mediaFormat, surface, mediaCrypto, 0);
        u52.a();
        this.c.d();
        u52.a("startCodec");
        this.f15686a.start();
        u52.a();
        this.f = 1;
    }

    private void c() {
        if (this.d) {
            try {
                this.c.e();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(gv0.c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.a(j);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void a(int i, int i2, long j, int i3) {
        this.c.a(i, i2, j, i3);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void a(int i, gv gvVar, long j) {
        this.c.a(i, gvVar, j);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void a(int i, long j) {
        this.f15686a.releaseOutputBuffer(i, j);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void a(boolean z, int i) {
        this.f15686a.releaseOutputBuffer(i, z);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void a(final gv0.c cVar, Handler handler) {
        c();
        this.f15686a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.yandex.mobile.ads.impl.hh$$ExternalSyntheticLambda0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                hh.this.a(cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void a(Surface surface) {
        c();
        this.f15686a.setOutputSurface(surface);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void a(Bundle bundle) {
        c();
        this.f15686a.setParameters(bundle);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    public final void a(int i) {
        c();
        this.f15686a.setVideoScalingMode(i);
    }
}
