package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.f21;

/* loaded from: classes5.dex */
final class bl2 implements hx1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f15122a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final long[] f;

    public static bl2 a(long j, long j2, f21.a aVar, ag1 ag1Var) {
        int x;
        int i = aVar.g;
        int i2 = aVar.d;
        int h = ag1Var.h();
        if ((h & 1) != 1 || (x = ag1Var.x()) == 0) {
            return null;
        }
        long a2 = f92.a(x, i * 1000000, i2);
        if ((h & 6) != 6) {
            return new bl2(j2, aVar.c, a2, -1L, null);
        }
        long v = ag1Var.v();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = ag1Var.t();
        }
        if (j != -1) {
            long j3 = j2 + v;
            if (j != j3) {
                et0.d("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new bl2(j2, aVar.c, a2, v, jArr);
    }

    private bl2(long j, int i, long j2, long j3, long[] jArr) {
        this.f15122a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final ex1.a b(long j) {
        if (!b()) {
            gx1 gx1Var = new gx1(0L, this.f15122a + this.b);
            return new ex1.a(gx1Var, gx1Var);
        }
        long j2 = this.c;
        int i = f92.f15466a;
        long max = Math.max(0L, Math.min(j, j2));
        double d = (max * 100.0d) / this.c;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i2 = (int) d;
                long[] jArr = this.f;
                if (jArr != null) {
                    double d3 = jArr[i2];
                    d2 = d3 + (((i2 == 99 ? 256.0d : jArr[i2 + 1]) - d3) * (d - i2));
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        gx1 gx1Var2 = new gx1(max, this.f15122a + Math.max(this.b, Math.min(Math.round((d2 / 256.0d) * this.d), this.d - 1)));
        return new ex1.a(gx1Var2, gx1Var2);
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final long c() {
        return this.c;
    }

    @Override // com.yandex.mobile.ads.impl.hx1
    public final long a() {
        return this.e;
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final boolean b() {
        return this.f != null;
    }

    @Override // com.yandex.mobile.ads.impl.hx1
    public final long a(long j) {
        long j2 = j - this.f15122a;
        if (!b() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.f;
        if (jArr != null) {
            double d = (j2 * 256.0d) / this.d;
            int b = f92.b(jArr, (long) d, true);
            long j3 = this.c;
            long j4 = (b * j3) / 100;
            long j5 = jArr[b];
            int i = b + 1;
            long j6 = (j3 * i) / 100;
            return Math.round((j5 == (b == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
        }
        throw new IllegalStateException();
    }
}
