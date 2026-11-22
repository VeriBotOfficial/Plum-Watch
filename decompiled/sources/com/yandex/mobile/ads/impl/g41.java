package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g41 {

    /* renamed from: a, reason: collision with root package name */
    private final gr1 f15552a;
    private List<? extends ig<?>> b;
    private final String c;
    private final String d;
    private final vr0 e;
    private final t4 f;
    private final ib0 g;
    private final ib0 h;
    private final List<String> i;
    private final List<ey1> j;

    public g41(gr1 responseNativeType, List<? extends ig<?>> assets, String str, String str2, vr0 vr0Var, t4 t4Var, ib0 ib0Var, ib0 ib0Var2, List<String> renderTrackingUrls, List<ey1> showNotices) {
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(renderTrackingUrls, "renderTrackingUrls");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        this.f15552a = responseNativeType;
        this.b = assets;
        this.c = str;
        this.d = str2;
        this.e = vr0Var;
        this.f = t4Var;
        this.g = ib0Var;
        this.h = ib0Var2;
        this.i = renderTrackingUrls;
        this.j = showNotices;
    }

    public static g41 a(g41 g41Var, List assets) {
        gr1 responseNativeType = g41Var.f15552a;
        String str = g41Var.c;
        String str2 = g41Var.d;
        vr0 vr0Var = g41Var.e;
        t4 t4Var = g41Var.f;
        ib0 ib0Var = g41Var.g;
        ib0 ib0Var2 = g41Var.h;
        List<String> renderTrackingUrls = g41Var.i;
        List<ey1> showNotices = g41Var.j;
        g41Var.getClass();
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(renderTrackingUrls, "renderTrackingUrls");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        return new g41(responseNativeType, assets, str, str2, vr0Var, t4Var, ib0Var, ib0Var2, renderTrackingUrls, showNotices);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g41)) {
            return false;
        }
        g41 g41Var = (g41) obj;
        return this.f15552a == g41Var.f15552a && Intrinsics.areEqual(this.b, g41Var.b) && Intrinsics.areEqual(this.c, g41Var.c) && Intrinsics.areEqual(this.d, g41Var.d) && Intrinsics.areEqual(this.e, g41Var.e) && Intrinsics.areEqual(this.f, g41Var.f) && Intrinsics.areEqual(this.g, g41Var.g) && Intrinsics.areEqual(this.h, g41Var.h) && Intrinsics.areEqual(this.i, g41Var.i) && Intrinsics.areEqual(this.j, g41Var.j);
    }

    public final int hashCode() {
        int a2 = aa.a(this.b, this.f15552a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        vr0 vr0Var = this.e;
        int hashCode3 = (hashCode2 + (vr0Var == null ? 0 : vr0Var.hashCode())) * 31;
        t4 t4Var = this.f;
        int hashCode4 = (hashCode3 + (t4Var == null ? 0 : t4Var.hashCode())) * 31;
        ib0 ib0Var = this.g;
        int hashCode5 = (hashCode4 + (ib0Var == null ? 0 : ib0Var.hashCode())) * 31;
        ib0 ib0Var2 = this.h;
        return this.j.hashCode() + aa.a(this.i, (hashCode5 + (ib0Var2 != null ? ib0Var2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "Native(responseNativeType=" + this.f15552a + ", assets=" + this.b + ", adId=" + this.c + ", info=" + this.d + ", link=" + this.e + ", impressionData=" + this.f + ", hideConditions=" + this.g + ", showConditions=" + this.h + ", renderTrackingUrls=" + this.i + ", showNotices=" + this.j + Separators.RPAREN;
    }

    public final gr1 g() {
        return this.f15552a;
    }

    public final List<ig<?>> b() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    public final String a() {
        return this.c;
    }

    public final vr0 e() {
        return this.e;
    }

    public final void a(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.b = arrayList;
    }

    public final t4 c() {
        return this.f;
    }

    public final List<String> f() {
        return this.i;
    }

    public final List<ey1> h() {
        return this.j;
    }
}
