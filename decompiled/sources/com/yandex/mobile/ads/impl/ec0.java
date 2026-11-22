package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ec0 {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f15372a;
    private final Typeface b;
    private final Typeface c;
    private final Typeface d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec0)) {
            return false;
        }
        ec0 ec0Var = (ec0) obj;
        return Intrinsics.areEqual(this.f15372a, ec0Var.f15372a) && Intrinsics.areEqual(this.b, ec0Var.b) && Intrinsics.areEqual(this.c, ec0Var.c) && Intrinsics.areEqual(this.d, ec0Var.d);
    }

    public final int hashCode() {
        Typeface typeface = this.f15372a;
        int hashCode = (typeface == null ? 0 : typeface.hashCode()) * 31;
        Typeface typeface2 = this.b;
        int hashCode2 = (hashCode + (typeface2 == null ? 0 : typeface2.hashCode())) * 31;
        Typeface typeface3 = this.c;
        int hashCode3 = (hashCode2 + (typeface3 == null ? 0 : typeface3.hashCode())) * 31;
        Typeface typeface4 = this.d;
        return hashCode3 + (typeface4 != null ? typeface4.hashCode() : 0);
    }

    public final String toString() {
        return "FontTypefaceData(light=" + this.f15372a + ", regular=" + this.b + ", medium=" + this.c + ", bold=" + this.d + Separators.RPAREN;
    }

    public ec0(Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4) {
        this.f15372a = typeface;
        this.b = typeface2;
        this.c = typeface3;
        this.d = typeface4;
    }

    public final Typeface b() {
        return this.f15372a;
    }

    public final Typeface d() {
        return this.b;
    }

    public final Typeface c() {
        return this.c;
    }

    public final Typeface a() {
        return this.d;
    }
}
