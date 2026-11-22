package com.anythink.expressad.h.a;

import android.os.CountDownTimer;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final long f4958a = 1000;
    private long b = 0;
    private long c;
    private com.anythink.expressad.h.a.a d;
    private a e;

    private b a(long j) {
        if (j < 0) {
            j = 1000;
        }
        this.c = j;
        return this;
    }

    private b a(com.anythink.expressad.h.a.a aVar) {
        this.d = aVar;
        return this;
    }

    private b b(long j) {
        this.b = j;
        return this;
    }

    private void a() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.cancel();
            this.e = null;
        }
        if (this.c <= 0) {
            this.c = this.b + 1000;
        }
        a aVar2 = new a(this.b, this.c);
        this.e = aVar2;
        aVar2.a(this.d);
    }

    private void b() {
        a aVar = this.e;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.e = null;
            }
            if (this.c <= 0) {
                this.c = this.b + 1000;
            }
            a aVar2 = new a(this.b, this.c);
            this.e = aVar2;
            aVar2.a(this.d);
        }
        this.e.start();
    }

    private void c() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.cancel();
            this.e = null;
        }
    }

    private static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.h.a.a f4959a;

        @Override // android.os.CountDownTimer
        public final void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
        }

        public a(long j, long j2) {
            super(j, j2);
        }

        final void a(com.anythink.expressad.h.a.a aVar) {
            this.f4959a = aVar;
        }
    }
}
