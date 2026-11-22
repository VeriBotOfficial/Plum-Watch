package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;

/* loaded from: classes5.dex */
public final class u4 {

    /* renamed from: a, reason: collision with root package name */
    private final int f17018a;
    private final int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return this.f17018a == u4Var.f17018a && this.b == u4Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f17018a) * 31);
    }

    public final String toString() {
        return "AdInfo(adGroupIndex=" + this.f17018a + ", adIndexInAdGroup=" + this.b + Separators.RPAREN;
    }

    public u4(int i, int i2) {
        this.f17018a = i;
        this.b = i2;
    }

    public final int a() {
        return this.f17018a;
    }

    public final int b() {
        return this.b;
    }
}
