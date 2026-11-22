package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xi0 {

    /* renamed from: a, reason: collision with root package name */
    private final df f17338a;
    private final String b;
    private final cj0 c;

    public xi0(df appMetricaIdentifiers, String mauid, cj0 identifiersType) {
        Intrinsics.checkNotNullParameter(appMetricaIdentifiers, "appMetricaIdentifiers");
        Intrinsics.checkNotNullParameter(mauid, "mauid");
        Intrinsics.checkNotNullParameter(identifiersType, "identifiersType");
        this.f17338a = appMetricaIdentifiers;
        this.b = mauid;
        this.c = identifiersType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi0)) {
            return false;
        }
        xi0 xi0Var = (xi0) obj;
        return Intrinsics.areEqual(this.f17338a, xi0Var.f17338a) && Intrinsics.areEqual(this.b, xi0Var.b) && this.c == xi0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + v3.a(this.b, this.f17338a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Identifiers(appMetricaIdentifiers=" + this.f17338a + ", mauid=" + this.b + ", identifiersType=" + this.c + Separators.RPAREN;
    }

    public final df a() {
        return this.f17338a;
    }

    public final String c() {
        return this.b;
    }

    public final cj0 b() {
        return this.c;
    }
}
