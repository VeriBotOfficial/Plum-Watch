package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;

/* loaded from: classes5.dex */
public final class m7 {

    /* renamed from: a, reason: collision with root package name */
    private final int f16214a;
    private final boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7)) {
            return false;
        }
        m7 m7Var = (m7) obj;
        return this.f16214a == m7Var.f16214a && this.b == m7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f16214a) * 31);
    }

    public final String toString() {
        return "AdQualityVerifierNetworkConfiguration(usagePercent=" + this.f16214a + ", disabled=" + this.b + Separators.RPAREN;
    }

    public m7(boolean z, int i) {
        this.f16214a = i;
        this.b = z;
    }

    public final int b() {
        return this.f16214a;
    }

    public final boolean a() {
        return this.b;
    }
}
