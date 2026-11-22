package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes5.dex */
final class jh extends MediaCodec.Callback {
    private final HandlerThread b;
    private Handler c;
    private MediaFormat h;
    private MediaFormat i;
    private MediaCodec.CodecException j;
    private long k;
    private boolean l;
    private IllegalStateException m;

    /* renamed from: a, reason: collision with root package name */
    private final Object f15910a = new Object();
    private final zo0 d = new zo0();
    private final zo0 e = new zo0();
    private final ArrayDeque<MediaCodec.BufferInfo> f = new ArrayDeque<>();
    private final ArrayDeque<MediaFormat> g = new ArrayDeque<>();

    jh(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public final void e() {
        synchronized (this.f15910a) {
            this.l = true;
            this.b.quit();
            if (!this.g.isEmpty()) {
                this.i = this.g.getLast();
            }
            this.d.a();
            this.e.a();
            this.f.clear();
            this.g.clear();
            this.j = null;
        }
    }

    public final int a() {
        synchronized (this.f15910a) {
            int i = -1;
            if (this.k <= 0 && !this.l) {
                IllegalStateException illegalStateException = this.m;
                if (illegalStateException == null) {
                    MediaCodec.CodecException codecException = this.j;
                    if (codecException == null) {
                        if (!this.d.b()) {
                            i = this.d.c();
                        }
                        return i;
                    }
                    this.j = null;
                    throw codecException;
                }
                this.m = null;
                throw illegalStateException;
            }
            return -1;
        }
    }

    public final MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f15910a) {
            mediaFormat = this.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void b() {
        synchronized (this.f15910a) {
            this.k++;
            Handler handler = this.c;
            int i = f92.f15466a;
            handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.jh$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    jh.this.d();
                }
            });
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f15910a) {
            this.d.a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f15910a) {
            MediaFormat mediaFormat = this.i;
            if (mediaFormat != null) {
                this.e.a(-2);
                this.g.add(mediaFormat);
                this.i = null;
            }
            this.e.a(i);
            this.f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f15910a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f15910a) {
            this.e.a(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        synchronized (this.f15910a) {
            if (this.l) {
                return;
            }
            long j = this.k - 1;
            this.k = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                a(new IllegalStateException());
                return;
            }
            if (!this.g.isEmpty()) {
                this.i = this.g.getLast();
            }
            this.d.a();
            this.e.a();
            this.f.clear();
            this.g.clear();
            this.j = null;
        }
    }

    public final int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f15910a) {
            if (this.k <= 0 && !this.l) {
                IllegalStateException illegalStateException = this.m;
                if (illegalStateException == null) {
                    MediaCodec.CodecException codecException = this.j;
                    if (codecException == null) {
                        if (this.e.b()) {
                            return -1;
                        }
                        int c = this.e.c();
                        if (c >= 0) {
                            if (this.h != null) {
                                MediaCodec.BufferInfo remove = this.f.remove();
                                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
                            } else {
                                throw new IllegalStateException();
                            }
                        } else if (c == -2) {
                            this.h = this.g.remove();
                        }
                        return c;
                    }
                    this.j = null;
                    throw codecException;
                }
                this.m = null;
                throw illegalStateException;
            }
            return -1;
        }
    }

    public final void a(MediaCodec mediaCodec) {
        if (this.c == null) {
            this.b.start();
            Handler handler = new Handler(this.b.getLooper());
            mediaCodec.setCallback(this, handler);
            this.c = handler;
            return;
        }
        throw new IllegalStateException();
    }

    private void a(IllegalStateException illegalStateException) {
        synchronized (this.f15910a) {
            this.m = illegalStateException;
        }
    }
}
