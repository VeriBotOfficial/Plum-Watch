package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;

/* loaded from: classes5.dex */
public final class gf0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15583a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gf0) && this.f15583a == ((gf0) obj).f15583a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15583a);
    }

    public final String toString() {
        return "HandledAction(shouldTrackClick=" + this.f15583a + Separators.RPAREN;
    }

    public gf0(boolean z) {
        this.f15583a = z;
    }

    public final boolean a() {
        return this.f15583a;
    }
}
