package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ac0;
import com.yandex.mobile.ads.impl.ex1;

/* loaded from: classes5.dex */
public final class zb0 implements ex1 {

    /* renamed from: a, reason: collision with root package name */
    private final ac0 f17502a;
    private final long b;

    @Override // com.yandex.mobile.ads.impl.ex1
    public final boolean b() {
        return true;
    }

    public zb0(ac0 ac0Var, long j) {
        this.f17502a = ac0Var;
        this.b = j;
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final long c() {
        return this.f17502a.b();
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final ex1.a b(long j) {
        ac0 ac0Var = this.f17502a;
        ac0.a aVar = ac0Var.k;
        if (aVar != null) {
            long[] jArr = aVar.f14993a;
            long[] jArr2 = aVar.b;
            int b = f92.b(jArr, ac0Var.a(j), false);
            long j2 = b == -1 ? 0L : jArr[b];
            long j3 = b != -1 ? jArr2[b] : 0L;
            long j4 = this.f17502a.e;
            long j5 = (j2 * 1000000) / j4;
            long j6 = this.b;
            gx1 gx1Var = new gx1(j5, j3 + j6);
            if (j5 != j && b != jArr.length - 1) {
                int i = b + 1;
                return new ex1.a(gx1Var, new gx1((jArr[i] * 1000000) / j4, j6 + jArr2[i]));
            }
            return new ex1.a(gx1Var, gx1Var);
        }
        throw new IllegalStateException();
    }
}
