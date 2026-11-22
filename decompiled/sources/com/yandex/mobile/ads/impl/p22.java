package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
final class p22 extends lc0 {
    private final long b;

    public p22(wz wzVar, long j) {
        super(wzVar);
        hg.a(wzVar.a() >= j);
        this.b = j;
    }

    @Override // com.yandex.mobile.ads.impl.lc0, com.yandex.mobile.ads.impl.a80
    public final long a() {
        return super.a() - this.b;
    }

    @Override // com.yandex.mobile.ads.impl.lc0, com.yandex.mobile.ads.impl.a80
    public final long d() {
        return super.d() - this.b;
    }

    @Override // com.yandex.mobile.ads.impl.lc0, com.yandex.mobile.ads.impl.a80
    public final long b() {
        return super.b() - this.b;
    }
}
