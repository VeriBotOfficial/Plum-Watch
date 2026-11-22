package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;

/* loaded from: classes5.dex */
public final class mh2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f16243a;
    private final int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh2)) {
            return false;
        }
        mh2 mh2Var = (mh2) obj;
        return this.f16243a == mh2Var.f16243a && this.b == mh2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f16243a) * 31);
    }

    public final String toString() {
        return "ViewSize(width=" + this.f16243a + ", height=" + this.b + Separators.RPAREN;
    }

    public mh2(int i, int i2) {
        this.f16243a = i;
        this.b = i2;
    }

    public final int b() {
        return this.f16243a;
    }

    public final int a() {
        return this.b;
    }
}
