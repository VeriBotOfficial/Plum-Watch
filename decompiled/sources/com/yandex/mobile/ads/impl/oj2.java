package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ex1;

/* loaded from: classes5.dex */
final class oj2 implements ex1 {

    /* renamed from: a, reason: collision with root package name */
    private final mj2 f16459a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    @Override // com.yandex.mobile.ads.impl.ex1
    public final boolean b() {
        return true;
    }

    public oj2(mj2 mj2Var, int i, long j, long j2) {
        this.f16459a = mj2Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / mj2Var.d;
        this.d = j3;
        this.e = c(j3);
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final ex1.a b(long j) {
        long j2 = this.d - 1;
        int i = f92.f15466a;
        long max = Math.max(0L, Math.min((this.f16459a.c * j) / (this.b * 1000000), j2));
        long j3 = (this.f16459a.d * max) + this.c;
        long c = c(max);
        gx1 gx1Var = new gx1(c, j3);
        if (c < j && max != this.d - 1) {
            long j4 = max + 1;
            return new ex1.a(gx1Var, new gx1(c(j4), (this.f16459a.d * j4) + this.c));
        }
        return new ex1.a(gx1Var, gx1Var);
    }

    private long c(long j) {
        return f92.a(j * this.b, 1000000L, this.f16459a.c);
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final long c() {
        return this.e;
    }
}
