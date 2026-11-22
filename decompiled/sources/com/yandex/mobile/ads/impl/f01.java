package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f01 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15443a;
    private final List<g01> b;
    private final long c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f01)) {
            return false;
        }
        f01 f01Var = (f01) obj;
        return Intrinsics.areEqual(this.f15443a, f01Var.f15443a) && Intrinsics.areEqual(this.b, f01Var.b) && this.c == f01Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + aa.a(this.b, this.f15443a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MediationPrefetchAdUnitSettings(adUnitId=" + this.f15443a + ", networks=" + this.b + ", loadTimeoutMillis=" + this.c + Separators.RPAREN;
    }

    public f01(long j, String adUnitId, List networks) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(networks, "networks");
        this.f15443a = adUnitId;
        this.b = networks;
        this.c = j;
    }

    public final List<g01> b() {
        return this.b;
    }

    public final long a() {
        return this.c;
    }
}
