package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;

/* loaded from: classes5.dex */
public final class c7 {

    /* renamed from: a, reason: collision with root package name */
    private final int f15161a;
    private final boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7)) {
            return false;
        }
        c7 c7Var = (c7) obj;
        return this.f15161a == c7Var.f15161a && this.b == c7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f15161a) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationNetworkConfiguration(usagePercent=" + this.f15161a + ", disabled=" + this.b + Separators.RPAREN;
    }

    public c7(boolean z, int i) {
        this.f15161a = i;
        this.b = z;
    }

    public final int b() {
        return this.f15161a;
    }

    public final boolean a() {
        return this.b;
    }
}
