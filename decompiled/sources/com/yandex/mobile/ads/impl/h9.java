package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;

/* loaded from: classes5.dex */
public final class h9 {

    /* renamed from: a, reason: collision with root package name */
    private final int f15667a;
    private final int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9)) {
            return false;
        }
        h9 h9Var = (h9) obj;
        return this.f15667a == h9Var.f15667a && this.b == h9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f15667a) * 31);
    }

    public final String toString() {
        return "AdSize(width=" + this.f15667a + ", height=" + this.b + Separators.RPAREN;
    }

    public h9(int i, int i2) {
        this.f15667a = i;
        this.b = i2;
    }

    public final int b() {
        return this.f15667a;
    }

    public final int a() {
        return this.b;
    }
}
