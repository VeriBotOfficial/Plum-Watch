package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;

/* loaded from: classes5.dex */
public final class n6 {

    /* renamed from: a, reason: collision with root package name */
    private final uz1 f16307a;
    private final wz1 b;
    private final long c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj;
        return this.f16307a == n6Var.f16307a && this.b == n6Var.b && this.c == n6Var.c;
    }

    public final int hashCode() {
        uz1 uz1Var = this.f16307a;
        int hashCode = (uz1Var == null ? 0 : uz1Var.hashCode()) * 31;
        wz1 wz1Var = this.b;
        return Long.hashCode(this.c) + ((hashCode + (wz1Var != null ? wz1Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AdPodSkip(transitionStrategy=" + this.f16307a + ", visibility=" + this.b + ", delay=" + this.c + Separators.RPAREN;
    }

    public n6(uz1 uz1Var, wz1 wz1Var, long j) {
        this.f16307a = uz1Var;
        this.b = wz1Var;
        this.c = j;
    }

    public final uz1 b() {
        return this.f16307a;
    }

    public final wz1 c() {
        return this.b;
    }

    public final long a() {
        return this.c;
    }
}
