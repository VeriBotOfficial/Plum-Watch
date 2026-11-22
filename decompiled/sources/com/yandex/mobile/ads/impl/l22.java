package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class l22 implements fv0 {
    private final jp b;
    private boolean c;
    private long d;
    private long e;
    private bi1 f = bi1.e;

    public l22(y32 y32Var) {
        this.b = y32Var;
    }

    public final void b() {
        if (this.c) {
            a(o());
            this.c = false;
        }
    }

    public final void a(long j) {
        this.d = j;
        if (this.c) {
            this.e = this.b.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.fv0
    public final long o() {
        long a2;
        long j = this.d;
        if (!this.c) {
            return j;
        }
        long b = this.b.b() - this.e;
        bi1 bi1Var = this.f;
        if (bi1Var.b == 1.0f) {
            a2 = f92.a(b);
        } else {
            a2 = bi1Var.a(b);
        }
        return a2 + j;
    }

    @Override // com.yandex.mobile.ads.impl.fv0
    public final bi1 getPlaybackParameters() {
        return this.f;
    }

    @Override // com.yandex.mobile.ads.impl.fv0
    public final void a(bi1 bi1Var) {
        if (this.c) {
            a(o());
        }
        this.f = bi1Var;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        this.e = this.b.b();
        this.c = true;
    }
}
