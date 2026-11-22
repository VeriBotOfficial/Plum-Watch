package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b7 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15077a;
    private final boolean b;
    private final String c;
    private final long d;
    private final int e;
    private final boolean f;
    private final Set<String> g;
    private final Map<String, c7> h;

    public b7(boolean z, boolean z2, String apiKey, long j, int i, boolean z3, Set<String> enabledAdUnits, Map<String, c7> adNetworksCustomParameters) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(enabledAdUnits, "enabledAdUnits");
        Intrinsics.checkNotNullParameter(adNetworksCustomParameters, "adNetworksCustomParameters");
        this.f15077a = z;
        this.b = z2;
        this.c = apiKey;
        this.d = j;
        this.e = i;
        this.f = z3;
        this.g = enabledAdUnits;
        this.h = adNetworksCustomParameters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7)) {
            return false;
        }
        b7 b7Var = (b7) obj;
        return this.f15077a == b7Var.f15077a && this.b == b7Var.b && Intrinsics.areEqual(this.c, b7Var.c) && this.d == b7Var.d && this.e == b7Var.e && this.f == b7Var.f && Intrinsics.areEqual(this.g, b7Var.g) && Intrinsics.areEqual(this.h, b7Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + a7.a(this.f, dy1.a(this.e, (Long.hashCode(this.d) + v3.a(this.c, a7.a(this.b, Boolean.hashCode(this.f15077a) * 31, 31), 31)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationConfiguration(enabled=" + this.f15077a + ", debug=" + this.b + ", apiKey=" + this.c + ", validationTimeoutInSec=" + this.d + ", usagePercent=" + this.e + ", blockAdOnInternalError=" + this.f + ", enabledAdUnits=" + this.g + ", adNetworksCustomParameters=" + this.h + Separators.RPAREN;
    }

    public final boolean e() {
        return this.f15077a;
    }

    public final boolean d() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final long h() {
        return this.d;
    }

    public final int g() {
        return this.e;
    }

    public final boolean c() {
        return this.f;
    }

    public final Set<String> f() {
        return this.g;
    }

    public final Map<String, c7> a() {
        return this.h;
    }
}
