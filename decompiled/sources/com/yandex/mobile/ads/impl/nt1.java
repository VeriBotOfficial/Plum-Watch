package com.yandex.mobile.ads.impl;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
final class nt1 implements se2, wn {
    private int j;
    private SurfaceTexture k;
    private byte[] n;
    private final AtomicBoolean b = new AtomicBoolean();
    private final AtomicBoolean c = new AtomicBoolean(true);
    private final jm1 d = new jm1();
    private final qc0 e = new qc0();
    private final h52<Long> f = new h52<>();
    private final h52<hm1> g = new h52<>();
    private final float[] h = new float[16];
    private final float[] i = new float[16];
    private volatile int l = 0;
    private int m = -1;

    public final void a(float[] fArr) {
        GLES20.glClear(16384);
        qe0.a();
        if (this.b.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.k;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            qe0.a();
            if (this.c.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.h, 0);
            }
            long timestamp = this.k.getTimestamp();
            Long a2 = this.f.a(timestamp);
            if (a2 != null) {
                this.e.a(a2.longValue(), this.h);
            }
            hm1 b = this.g.b(timestamp);
            if (b != null) {
                this.d.a(b);
            }
        }
        Matrix.multiplyMM(this.i, 0, fArr, 0, this.h, 0);
        this.d.a(this.j, this.i);
    }

    public final SurfaceTexture a() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        qe0.a();
        this.d.a();
        qe0.a();
        this.j = qe0.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.j);
        this.k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.yandex.mobile.ads.impl.nt1$$ExternalSyntheticLambda0
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                nt1.this.a(surfaceTexture2);
            }
        });
        return this.k;
    }

    @Override // com.yandex.mobile.ads.impl.wn
    public final void f() {
        this.f.a();
        this.e.a();
        this.c.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        this.b.set(true);
    }

    @Override // com.yandex.mobile.ads.impl.wn
    public final void a(long j, float[] fArr) {
        this.e.b(j, fArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r6.a().f15708a == 0) goto L51;
     */
    @Override // com.yandex.mobile.ads.impl.se2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r36, long r38, com.yandex.mobile.ads.impl.jc0 r40, android.media.MediaFormat r41) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nt1.a(long, long, com.yandex.mobile.ads.impl.jc0, android.media.MediaFormat):void");
    }

    public final void a(int i) {
        this.l = i;
    }
}
