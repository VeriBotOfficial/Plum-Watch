package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yx1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17468a;
    private final Long b;
    private final boolean c;
    private final boolean d;
    private final fz1 e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx1)) {
            return false;
        }
        yx1 yx1Var = (yx1) obj;
        return Intrinsics.areEqual(this.f17468a, yx1Var.f17468a) && Intrinsics.areEqual(this.b, yx1Var.b) && this.c == yx1Var.c && this.d == yx1Var.d && Intrinsics.areEqual(this.e, yx1Var.e);
    }

    public final int hashCode() {
        String str = this.f17468a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int a2 = a7.a(this.d, a7.a(this.c, (hashCode + (l == null ? 0 : l.hashCode())) * 31, 31), 31);
        fz1 fz1Var = this.e;
        return a2 + (fz1Var != null ? fz1Var.hashCode() : 0);
    }

    public final String toString() {
        return "Settings(templateType=" + this.f17468a + ", multiBannerAutoScrollInterval=" + this.b + ", isHighlightingEnabled=" + this.c + ", isLoopingVideo=" + this.d + ", mediaAssetImageFallbackSize=" + this.e + Separators.RPAREN;
    }

    public yx1(String str, Long l, boolean z, boolean z2, fz1 fz1Var) {
        this.f17468a = str;
        this.b = l;
        this.c = z;
        this.d = z2;
        this.e = fz1Var;
    }

    public final Long b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    public final fz1 a() {
        return this.e;
    }
}
