package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    private final f5 f15347a;
    private final Map<String, Object> b;

    public e5(f5 adLoadingPhaseType, Map<String, ? extends Object> reportParameters) {
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        Intrinsics.checkNotNullParameter(reportParameters, "reportParameters");
        this.f15347a = adLoadingPhaseType;
        this.b = reportParameters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return this.f15347a == e5Var.f15347a && Intrinsics.areEqual(this.b, e5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15347a.hashCode() * 31);
    }

    public final String toString() {
        return "AdLoadingPhase(adLoadingPhaseType=" + this.f15347a + ", reportParameters=" + this.b + Separators.RPAREN;
    }

    public final f5 a() {
        return this.f15347a;
    }

    public final Map<String, Object> b() {
        return this.b;
    }
}
