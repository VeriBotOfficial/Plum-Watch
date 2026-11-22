package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y61 {

    /* renamed from: a, reason: collision with root package name */
    private final List<g41> f17397a;
    private final List<ig<?>> b;
    private final List<String> c;
    private final t4 d;
    private final Map<String, Object> e;
    private final List<b30> f;
    private final List<ey1> g;
    private final String h;
    private final yx1 i;
    private final g6 j;

    /* JADX WARN: Multi-variable type inference failed */
    public y61(List<g41> nativeAds, List<? extends ig<?>> assets, List<String> renderTrackingUrls, t4 t4Var, Map<String, ? extends Object> properties, List<b30> divKitDesigns, List<ey1> showNotices, String str, yx1 yx1Var, g6 g6Var) {
        Intrinsics.checkNotNullParameter(nativeAds, "nativeAds");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(renderTrackingUrls, "renderTrackingUrls");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(divKitDesigns, "divKitDesigns");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        this.f17397a = nativeAds;
        this.b = assets;
        this.c = renderTrackingUrls;
        this.d = t4Var;
        this.e = properties;
        this.f = divKitDesigns;
        this.g = showNotices;
        this.h = str;
        this.i = yx1Var;
        this.j = g6Var;
    }

    public static y61 a(y61 y61Var, List nativeAds) {
        List<ig<?>> assets = y61Var.b;
        List<String> renderTrackingUrls = y61Var.c;
        t4 t4Var = y61Var.d;
        Map<String, Object> properties = y61Var.e;
        List<b30> divKitDesigns = y61Var.f;
        List<ey1> showNotices = y61Var.g;
        String str = y61Var.h;
        yx1 yx1Var = y61Var.i;
        g6 g6Var = y61Var.j;
        y61Var.getClass();
        Intrinsics.checkNotNullParameter(nativeAds, "nativeAds");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(renderTrackingUrls, "renderTrackingUrls");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(divKitDesigns, "divKitDesigns");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        return new y61(nativeAds, assets, renderTrackingUrls, t4Var, properties, divKitDesigns, showNotices, str, yx1Var, g6Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y61)) {
            return false;
        }
        y61 y61Var = (y61) obj;
        return Intrinsics.areEqual(this.f17397a, y61Var.f17397a) && Intrinsics.areEqual(this.b, y61Var.b) && Intrinsics.areEqual(this.c, y61Var.c) && Intrinsics.areEqual(this.d, y61Var.d) && Intrinsics.areEqual(this.e, y61Var.e) && Intrinsics.areEqual(this.f, y61Var.f) && Intrinsics.areEqual(this.g, y61Var.g) && Intrinsics.areEqual(this.h, y61Var.h) && Intrinsics.areEqual(this.i, y61Var.i) && Intrinsics.areEqual(this.j, y61Var.j);
    }

    public final int hashCode() {
        int a2 = aa.a(this.c, aa.a(this.b, this.f17397a.hashCode() * 31, 31), 31);
        t4 t4Var = this.d;
        int a3 = aa.a(this.g, aa.a(this.f, (this.e.hashCode() + ((a2 + (t4Var == null ? 0 : t4Var.hashCode())) * 31)) * 31, 31), 31);
        String str = this.h;
        int hashCode = (a3 + (str == null ? 0 : str.hashCode())) * 31;
        yx1 yx1Var = this.i;
        int hashCode2 = (hashCode + (yx1Var == null ? 0 : yx1Var.hashCode())) * 31;
        g6 g6Var = this.j;
        return hashCode2 + (g6Var != null ? g6Var.hashCode() : 0);
    }

    public final String toString() {
        return "NativeAdResponse(nativeAds=" + this.f17397a + ", assets=" + this.b + ", renderTrackingUrls=" + this.c + ", impressionData=" + this.d + ", properties=" + this.e + ", divKitDesigns=" + this.f + ", showNotices=" + this.g + ", version=" + this.h + ", settings=" + this.i + ", adPod=" + this.j + Separators.RPAREN;
    }

    public final List<g41> e() {
        return this.f17397a;
    }

    public final List<ig<?>> b() {
        return this.b;
    }

    public final List<String> g() {
        return this.c;
    }

    public final t4 d() {
        return this.d;
    }

    public final Map<String, Object> f() {
        return this.e;
    }

    public final List<b30> c() {
        return this.f;
    }

    public final List<ey1> i() {
        return this.g;
    }

    public final yx1 h() {
        return this.i;
    }

    public final g6 a() {
        return this.j;
    }
}
