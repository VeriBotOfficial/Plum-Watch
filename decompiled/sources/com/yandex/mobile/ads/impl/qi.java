package com.yandex.mobile.ads.impl;

import androidx.media3.extractor.avi.AviExtractor;

/* loaded from: classes5.dex */
final class qi implements oi {

    /* renamed from: a, reason: collision with root package name */
    public final int f16670a;
    public final int b;
    public final int c;

    @Override // com.yandex.mobile.ads.impl.oi
    public final int getType() {
        return AviExtractor.FOURCC_avih;
    }

    private qi(int i, int i2, int i3) {
        this.f16670a = i;
        this.b = i2;
        this.c = i3;
    }

    public static qi a(ag1 ag1Var) {
        int k = ag1Var.k();
        ag1Var.f(8);
        int k2 = ag1Var.k();
        int k3 = ag1Var.k();
        ag1Var.f(4);
        ag1Var.k();
        ag1Var.f(12);
        return new qi(k, k2, k3);
    }
}
