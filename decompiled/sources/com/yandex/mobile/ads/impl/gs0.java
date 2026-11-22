package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gs0 {

    /* renamed from: a, reason: collision with root package name */
    private final b02 f15625a;
    private final o8<String> b;

    public gs0(b02 sliderAd, o8<String> adResponse) {
        Intrinsics.checkNotNullParameter(sliderAd, "sliderAd");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f15625a = sliderAd;
        this.b = adResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs0)) {
            return false;
        }
        gs0 gs0Var = (gs0) obj;
        return Intrinsics.areEqual(this.f15625a, gs0Var.f15625a) && Intrinsics.areEqual(this.b, gs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15625a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadedFeedItem(sliderAd=" + this.f15625a + ", adResponse=" + this.b + Separators.RPAREN;
    }

    public final b02 b() {
        return this.f15625a;
    }

    public final o8<String> a() {
        return this.b;
    }
}
