package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kw {

    /* renamed from: a, reason: collision with root package name */
    private final String f16055a;
    private final String b;
    private final String c;
    private final nw d;

    public kw(String name, String format, String adUnitId, nw mediation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(mediation, "mediation");
        this.f16055a = name;
        this.b = format;
        this.c = adUnitId;
        this.d = mediation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw)) {
            return false;
        }
        kw kwVar = (kw) obj;
        return Intrinsics.areEqual(this.f16055a, kwVar.f16055a) && Intrinsics.areEqual(this.b, kwVar.b) && Intrinsics.areEqual(this.c, kwVar.c) && Intrinsics.areEqual(this.d, kwVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v3.a(this.c, v3.a(this.b, this.f16055a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitFullData(name=" + this.f16055a + ", format=" + this.b + ", adUnitId=" + this.c + ", mediation=" + this.d + Separators.RPAREN;
    }

    public final String d() {
        return this.f16055a;
    }

    public final String b() {
        return this.b;
    }

    public final String a() {
        return this.c;
    }

    public final nw c() {
        return this.d;
    }
}
