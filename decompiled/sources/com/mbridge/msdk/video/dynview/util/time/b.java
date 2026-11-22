package com.mbridge.msdk.video.dynview.util.time;

import android.os.CountDownTimer;

/* compiled from: MBCountDownTimer.java */
/* loaded from: classes17.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private long f12422a = 0;
    private long b;
    private com.mbridge.msdk.video.dynview.util.time.a c;
    private a d;

    /* compiled from: MBCountDownTimer.java */
    private static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.dynview.util.time.a f12423a;

        public a(long j, long j2) {
            super(j, j2);
        }

        void a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
            this.f12423a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f12423a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f12423a;
            if (aVar != null) {
                aVar.onTick(j);
            }
        }
    }

    public b a(long j) {
        if (j < 0) {
            j = 1000;
        }
        this.b = j;
        return this;
    }

    public b b(long j) {
        this.f12422a = j;
        return this;
    }

    public void c() {
        if (this.d == null) {
            b();
        }
        this.d.start();
    }

    public b a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.c = aVar;
        return this;
    }

    public void b() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.cancel();
            this.d = null;
        }
        if (this.b <= 0) {
            this.b = this.f12422a + 1000;
        }
        a aVar2 = new a(this.f12422a, this.b);
        this.d = aVar2;
        aVar2.a(this.c);
    }

    public void a(long j, com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f12422a = j;
        this.c = aVar;
        b();
        a aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }

    public void a() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.cancel();
            this.d = null;
        }
    }
}
