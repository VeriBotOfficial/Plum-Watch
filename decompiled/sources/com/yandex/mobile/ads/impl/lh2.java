package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;

/* loaded from: classes5.dex */
public final class lh2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f16125a;
    private final int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh2)) {
            return false;
        }
        lh2 lh2Var = (lh2) obj;
        return this.f16125a == lh2Var.f16125a && this.b == lh2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f16125a) * 31);
    }

    public final String toString() {
        return "ViewSize(width=" + this.f16125a + ", height=" + this.b + Separators.RPAREN;
    }

    public lh2(int i, int i2) {
        this.f16125a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.f16125a;
    }
}
