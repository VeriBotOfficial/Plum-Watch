package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.ex1;

/* loaded from: classes5.dex */
final class z01 implements hx1 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f17475a;
    private final long[] b;
    private final long c;

    @Override // com.yandex.mobile.ads.impl.hx1
    public final long a() {
        return -1L;
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final boolean b() {
        return true;
    }

    private z01(long j, long[] jArr, long[] jArr2) {
        this.f17475a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? f92.a(jArr2[jArr2.length - 1]) : j;
    }

    public static z01 a(long j, y01 y01Var, long j2) {
        int length = y01Var.f.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += y01Var.d + y01Var.f[i3];
            j3 += y01Var.e + y01Var.g[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new z01(j2, jArr, jArr2);
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final ex1.a b(long j) {
        long j2 = this.c;
        int i = f92.f15466a;
        Pair<Long, Long> a2 = a(f92.b(Math.max(0L, Math.min(j, j2))), this.b, this.f17475a);
        gx1 gx1Var = new gx1(f92.a(((Long) a2.first).longValue()), ((Long) a2.second).longValue());
        return new ex1.a(gx1Var, gx1Var);
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final long c() {
        return this.c;
    }

    @Override // com.yandex.mobile.ads.impl.hx1
    public final long a(long j) {
        return f92.a(((Long) a(j, this.f17475a, this.b).second).longValue());
    }

    private static Pair<Long, Long> a(long j, long[] jArr, long[] jArr2) {
        int b = f92.b(jArr, j, true);
        long j2 = jArr[b];
        long j3 = jArr2[b];
        int i = b + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }
}
