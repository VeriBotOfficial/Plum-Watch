package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;

/* loaded from: classes5.dex */
public final class hx {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15739a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hx) && this.f15739a == ((hx) obj).f15739a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15739a);
    }

    public final String toString() {
        return "DebugPanelErrorIndicatorData(isEnabled=" + this.f15739a + Separators.RPAREN;
    }

    public hx(boolean z) {
        this.f15739a = z;
    }

    public final boolean a() {
        return this.f15739a;
    }
}
