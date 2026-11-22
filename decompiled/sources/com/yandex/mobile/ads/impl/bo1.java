package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class bo1 extends h42 {
    final /* synthetic */ co1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bo1(co1 co1Var, String str) {
        super(str);
        this.e = co1Var;
    }

    @Override // com.yandex.mobile.ads.impl.h42
    public final long e() {
        return this.e.a(System.nanoTime());
    }
}
