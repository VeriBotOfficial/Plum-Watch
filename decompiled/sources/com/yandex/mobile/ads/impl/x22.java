package com.yandex.mobile.ads.impl;

import androidx.media3.extractor.avi.AviExtractor;

/* loaded from: classes5.dex */
final class x22 implements oi {

    /* renamed from: a, reason: collision with root package name */
    public final String f17305a;

    public static x22 a(ag1 ag1Var) {
        return new x22(ag1Var.a(ag1Var.a(), lo.c));
    }

    @Override // com.yandex.mobile.ads.impl.oi
    public final int getType() {
        return AviExtractor.FOURCC_strn;
    }

    private x22(String str) {
        this.f17305a = str;
    }
}
