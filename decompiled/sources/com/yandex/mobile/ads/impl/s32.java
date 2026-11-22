package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes5.dex */
public abstract class s32 extends sy implements n32 {
    private n32 d;
    private long e;

    @Override // com.yandex.mobile.ads.impl.n32
    public final long a(int i) {
        n32 n32Var = this.d;
        n32Var.getClass();
        return n32Var.a(i) + this.e;
    }

    @Override // com.yandex.mobile.ads.impl.gm
    public final void b() {
        super.b();
        this.d = null;
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final int a() {
        n32 n32Var = this.d;
        n32Var.getClass();
        return n32Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final List<hv> b(long j) {
        n32 n32Var = this.d;
        n32Var.getClass();
        return n32Var.b(j - this.e);
    }

    @Override // com.yandex.mobile.ads.impl.n32
    public final int a(long j) {
        n32 n32Var = this.d;
        n32Var.getClass();
        return n32Var.a(j - this.e);
    }

    public final void a(long j, n32 n32Var, long j2) {
        this.c = j;
        this.d = n32Var;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.e = j;
    }
}
