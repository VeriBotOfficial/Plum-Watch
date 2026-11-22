package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ex1;

/* loaded from: classes5.dex */
public class wr implements ex1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f17276a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;
    private final boolean g;

    public wr(int i, int i2, long j, long j2, boolean z) {
        this.f17276a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            this.d = j - j2;
            this.f = a(i, j, j2);
        }
    }

    public long a(long j) {
        return c(j);
    }

    private static long a(int i, long j, long j2) {
        return (Math.max(0L, j - j2) * com.baidu.bbalbscesium.j.b.f) / i;
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final ex1.a b(long j) {
        long j2 = this.d;
        if (j2 == -1 && !this.g) {
            gx1 gx1Var = new gx1(0L, this.b);
            return new ex1.a(gx1Var, gx1Var);
        }
        long j3 = (this.e * j) / com.baidu.bbalbscesium.j.b.f;
        long j4 = this.c;
        long j5 = (j3 / j4) * j4;
        if (j2 != -1) {
            j5 = Math.min(j5, j2 - j4);
        }
        long max = Math.max(j5, 0L);
        long j6 = this.b;
        long j7 = max + j6;
        long a2 = a(this.e, j7, j6);
        gx1 gx1Var2 = new gx1(a2, j7);
        if (this.d != -1 && a2 < j) {
            long j8 = j7 + this.c;
            if (j8 < this.f17276a) {
                return new ex1.a(gx1Var2, new gx1(a(this.e, j8, this.b), j8));
            }
        }
        return new ex1.a(gx1Var2, gx1Var2);
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final long c() {
        return this.f;
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final boolean b() {
        return this.d != -1 || this.g;
    }

    public final long c(long j) {
        return a(this.e, j, this.b);
    }
}
