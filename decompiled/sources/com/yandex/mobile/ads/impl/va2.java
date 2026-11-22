package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.f21;

/* loaded from: classes5.dex */
final class va2 implements hx1 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f17147a;
    private final long[] b;
    private final long c;
    private final long d;

    @Override // com.yandex.mobile.ads.impl.ex1
    public final boolean b() {
        return true;
    }

    public static va2 a(long j, long j2, f21.a aVar, ag1 ag1Var) {
        int t;
        ag1Var.f(10);
        int h = ag1Var.h();
        va2 va2Var = null;
        if (h <= 0) {
            return null;
        }
        int i = aVar.d;
        long a2 = f92.a(h, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int z = ag1Var.z();
        int z2 = ag1Var.z();
        int z3 = ag1Var.z();
        int i2 = 2;
        ag1Var.f(2);
        long j3 = j2 + aVar.c;
        long[] jArr = new long[z];
        long[] jArr2 = new long[z];
        int i3 = 0;
        long j4 = j2;
        while (i3 < z) {
            va2 va2Var2 = va2Var;
            int i4 = z2;
            long[] jArr3 = jArr;
            jArr3[i3] = (i3 * a2) / z;
            jArr2[i3] = Math.max(j4, j3);
            if (z3 == 1) {
                t = ag1Var.t();
            } else if (z3 == i2) {
                t = ag1Var.z();
            } else if (z3 == 3) {
                t = ag1Var.w();
            } else {
                if (z3 != 4) {
                    return va2Var2;
                }
                t = ag1Var.x();
            }
            j4 += t * i4;
            i3++;
            va2Var = va2Var2;
            z2 = i4;
            jArr = jArr3;
            j3 = j3;
            i2 = 2;
        }
        long[] jArr4 = jArr;
        if (j != -1 && j != j4) {
            et0.d("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new va2(jArr4, jArr2, a2, j4);
    }

    private va2(long[] jArr, long[] jArr2, long j, long j2) {
        this.f17147a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final ex1.a b(long j) {
        int b = f92.b(this.f17147a, j, true);
        long[] jArr = this.f17147a;
        long j2 = jArr[b];
        long[] jArr2 = this.b;
        gx1 gx1Var = new gx1(j2, jArr2[b]);
        if (j2 < j && b != jArr.length - 1) {
            int i = b + 1;
            return new ex1.a(gx1Var, new gx1(jArr[i], jArr2[i]));
        }
        return new ex1.a(gx1Var, gx1Var);
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final long c() {
        return this.c;
    }

    @Override // com.yandex.mobile.ads.impl.hx1
    public final long a() {
        return this.d;
    }

    @Override // com.yandex.mobile.ads.impl.hx1
    public final long a(long j) {
        return this.f17147a[f92.b(this.b, j, true)];
    }
}
