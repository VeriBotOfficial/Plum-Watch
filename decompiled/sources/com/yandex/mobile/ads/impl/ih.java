package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
final class ih {
    private static final ArrayDeque<b> g = new ArrayDeque<>();
    private static final Object h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f15814a;
    private final HandlerThread b;
    private Handler c;
    private final AtomicReference<RuntimeException> d;
    private final ir e;
    private boolean f;

    private static b b() {
        ArrayDeque<b> arrayDeque = g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return arrayDeque.removeFirst();
        }
    }

    public final void e() throws InterruptedException {
        this.e.c();
        Handler handler = this.c;
        handler.getClass();
        handler.obtainMessage(2).sendToTarget();
        this.e.a();
    }

    public ih(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new ir());
    }

    public final void d() {
        if (this.f) {
            return;
        }
        this.b.start();
        this.c = new a(this.b.getLooper());
        this.f = true;
    }

    final class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ih.this.a(message);
        }
    }

    public final void c() {
        if (this.f) {
            a();
            this.b.quit();
        }
        this.f = false;
    }

    ih(MediaCodec mediaCodec, HandlerThread handlerThread, ir irVar) {
        this.f15814a = mediaCodec;
        this.b = handlerThread;
        this.e = irVar;
        this.d = new AtomicReference<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            r1 = 0
            if (r0 == 0) goto L44
            r2 = 1
            if (r0 == r2) goto L22
            r2 = 2
            if (r0 == r2) goto L1c
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r0 = r10.d
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r2.<init>(r11)
            androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(r0, r1, r2)
            goto L5f
        L1c:
            com.yandex.mobile.ads.impl.ir r11 = r10.e
            r11.e()
            goto L5f
        L22:
            java.lang.Object r11 = r11.obj
            com.yandex.mobile.ads.impl.ih$b r11 = (com.yandex.mobile.ads.impl.ih.b) r11
            int r3 = r11.f15816a
            int r4 = r11.b
            android.media.MediaCodec$CryptoInfo r5 = r11.d
            long r6 = r11.e
            int r8 = r11.f
            java.lang.Object r9 = com.yandex.mobile.ads.impl.ih.h     // Catch: java.lang.RuntimeException -> L3d
            monitor-enter(r9)     // Catch: java.lang.RuntimeException -> L3d
            android.media.MediaCodec r2 = r10.f15814a     // Catch: java.lang.Throwable -> L3a
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3a
            goto L5e
        L3a:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3a
            throw r0     // Catch: java.lang.RuntimeException -> L3d
        L3d:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r2 = r10.d
            androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(r2, r1, r0)
            goto L5e
        L44:
            java.lang.Object r11 = r11.obj
            com.yandex.mobile.ads.impl.ih$b r11 = (com.yandex.mobile.ads.impl.ih.b) r11
            int r3 = r11.f15816a
            int r4 = r11.b
            int r5 = r11.c
            long r6 = r11.e
            int r8 = r11.f
            android.media.MediaCodec r2 = r10.f15814a     // Catch: java.lang.RuntimeException -> L58
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.RuntimeException -> L58
            goto L5e
        L58:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r2 = r10.d
            androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(r2, r1, r0)
        L5e:
            r1 = r11
        L5f:
            if (r1 == 0) goto L64
            a(r1)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ih.a(android.os.Message):void");
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f15816a;
        public int b;
        public int c;
        public final MediaCodec.CryptoInfo d = new MediaCodec.CryptoInfo();
        public long e;
        public int f;

        b() {
        }
    }

    public final void a() {
        if (this.f) {
            try {
                Handler handler = this.c;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.e.c();
                Handler handler2 = this.c;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                this.e.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void a(int i, int i2, long j, int i3) {
        RuntimeException andSet = this.d.getAndSet(null);
        if (andSet == null) {
            b b2 = b();
            b2.f15816a = i;
            b2.b = 0;
            b2.c = i2;
            b2.e = j;
            b2.f = i3;
            Handler handler = this.c;
            int i4 = f92.f15466a;
            handler.obtainMessage(0, b2).sendToTarget();
            return;
        }
        throw andSet;
    }

    public final void a(int i, gv gvVar, long j) {
        RuntimeException andSet = this.d.getAndSet(null);
        if (andSet == null) {
            b b2 = b();
            b2.f15816a = i;
            b2.b = 0;
            b2.c = 0;
            b2.e = j;
            b2.f = 0;
            MediaCodec.CryptoInfo cryptoInfo = b2.d;
            cryptoInfo.numSubSamples = gvVar.f;
            int[] iArr = gvVar.d;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 != null && iArr2.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                } else {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = gvVar.e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 != null && iArr4.length >= iArr3.length) {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                } else {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = gvVar.b;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 != null && bArr2.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                } else {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArr2.getClass();
            cryptoInfo.key = bArr2;
            byte[] bArr3 = gvVar.f15629a;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 != null && bArr4.length >= bArr3.length) {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                } else {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                }
            }
            bArr4.getClass();
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = gvVar.c;
            if (f92.f15466a >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(gvVar.g, gvVar.h));
            }
            this.c.obtainMessage(1, b2).sendToTarget();
            return;
        }
        throw andSet;
    }

    private static void a(b bVar) {
        ArrayDeque<b> arrayDeque = g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }
}
