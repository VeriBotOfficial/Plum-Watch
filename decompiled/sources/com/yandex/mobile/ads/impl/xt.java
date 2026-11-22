package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;

/* loaded from: classes5.dex */
public final class xt {

    /* renamed from: a, reason: collision with root package name */
    private final float f17363a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xt) && Float.compare(this.f17363a, ((xt) obj).f17363a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17363a);
    }

    public final String toString() {
        return "CoreNativeAdMedia(aspectRatio=" + this.f17363a + Separators.RPAREN;
    }

    public xt(float f) {
        this.f17363a = f;
    }

    public final float a() {
        return this.f17363a;
    }
}
