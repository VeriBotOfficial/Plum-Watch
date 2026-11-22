package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;

/* loaded from: classes5.dex */
public final class v4 {

    /* renamed from: a, reason: collision with root package name */
    private final int f17113a;
    private final int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj;
        return this.f17113a == v4Var.f17113a && this.b == v4Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f17113a) * 31);
    }

    public final String toString() {
        return "AdInfo(adGroupIndex=" + this.f17113a + ", adIndexInAdGroup=" + this.b + Separators.RPAREN;
    }

    public v4(int i, int i2) {
        this.f17113a = i;
        this.b = i2;
    }

    public final int a() {
        return this.f17113a;
    }

    public final int b() {
        return this.b;
    }
}
