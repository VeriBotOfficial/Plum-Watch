package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jw {

    /* renamed from: a, reason: collision with root package name */
    private final String f15954a;
    private final String b;
    private final String c;

    public jw(String name, String format, String adUnitId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f15954a = name;
        this.b = format;
        this.c = adUnitId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw)) {
            return false;
        }
        jw jwVar = (jw) obj;
        return Intrinsics.areEqual(this.f15954a, jwVar.f15954a) && Intrinsics.areEqual(this.b, jwVar.b) && Intrinsics.areEqual(this.c, jwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + v3.a(this.b, this.f15954a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitData(name=" + this.f15954a + ", format=" + this.b + ", adUnitId=" + this.c + Separators.RPAREN;
    }

    public final String c() {
        return this.f15954a;
    }

    public final String b() {
        return this.b;
    }

    public final String a() {
        return this.c;
    }
}
