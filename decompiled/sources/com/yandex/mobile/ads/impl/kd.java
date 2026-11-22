package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;

/* loaded from: classes5.dex */
public final class kd {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16008a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kd) && this.f16008a == ((kd) obj).f16008a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16008a);
    }

    public final String toString() {
        return "AnalyticsIntegrationConfiguration(advertisingIdentifiersTracking=" + this.f16008a + Separators.RPAREN;
    }

    public kd(boolean z) {
        this.f16008a = z;
    }

    public final boolean a() {
        return this.f16008a;
    }
}
