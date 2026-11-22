package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ex1;

/* loaded from: classes5.dex */
public final class zk0 implements ex1 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f17532a;
    private final long[] b;
    private final long c;
    private final boolean d;

    public zk0(long j, long[] jArr, long[] jArr2) {
        hg.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.f17532a = jArr;
            this.b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f17532a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.c = j;
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final long c() {
        return this.c;
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final ex1.a b(long j) {
        if (!this.d) {
            gx1 gx1Var = gx1.c;
            return new ex1.a(gx1Var, gx1Var);
        }
        int b = f92.b(this.b, j, true);
        long[] jArr = this.b;
        long j2 = jArr[b];
        long[] jArr2 = this.f17532a;
        gx1 gx1Var2 = new gx1(j2, jArr2[b]);
        if (j2 != j && b != jArr.length - 1) {
            int i = b + 1;
            return new ex1.a(gx1Var2, new gx1(jArr[i], jArr2[i]));
        }
        return new ex1.a(gx1Var2, gx1Var2);
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final boolean b() {
        return this.d;
    }
}
