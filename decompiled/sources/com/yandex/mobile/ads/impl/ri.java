package com.yandex.mobile.ads.impl;

import androidx.media3.extractor.avi.AviExtractor;

/* loaded from: classes5.dex */
final class ri implements oi {

    /* renamed from: a, reason: collision with root package name */
    public final int f16766a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    @Override // com.yandex.mobile.ads.impl.oi
    public final int getType() {
        return AviExtractor.FOURCC_strh;
    }

    private ri(int i, int i2, int i3, int i4, int i5) {
        this.f16766a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public static ri a(ag1 ag1Var) {
        int k = ag1Var.k();
        ag1Var.f(12);
        ag1Var.k();
        int k2 = ag1Var.k();
        int k3 = ag1Var.k();
        ag1Var.f(4);
        int k4 = ag1Var.k();
        int k5 = ag1Var.k();
        ag1Var.f(8);
        return new ri(k, k2, k3, k4, k5);
    }
}
