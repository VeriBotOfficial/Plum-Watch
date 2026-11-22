package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zj1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17530a;
    private final String b;
    private final Map<String, Object> c;
    private final Integer d;
    private final xy e;

    public zj1(String packageName, String url, LinkedHashMap linkedHashMap, Integer num, xy xyVar) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f17530a = packageName;
        this.b = url;
        this.c = linkedHashMap;
        this.d = num;
        this.e = xyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj1)) {
            return false;
        }
        zj1 zj1Var = (zj1) obj;
        return Intrinsics.areEqual(this.f17530a, zj1Var.f17530a) && Intrinsics.areEqual(this.b, zj1Var.b) && Intrinsics.areEqual(this.c, zj1Var.c) && Intrinsics.areEqual(this.d, zj1Var.d) && this.e == zj1Var.e;
    }

    public final int hashCode() {
        int a2 = v3.a(this.b, this.f17530a.hashCode() * 31, 31);
        Map<String, Object> map = this.c;
        int hashCode = (a2 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        xy xyVar = this.e;
        return hashCode2 + (xyVar != null ? xyVar.hashCode() : 0);
    }

    public final String toString() {
        return "PreferredPackage(packageName=" + this.f17530a + ", url=" + this.b + ", extras=" + this.c + ", flags=" + this.d + ", launchMode=" + this.e + Separators.RPAREN;
    }

    public final String d() {
        return this.f17530a;
    }

    public final String e() {
        return this.b;
    }

    public final Map<String, Object> a() {
        return this.c;
    }

    public final Integer b() {
        return this.d;
    }

    public final xy c() {
        return this.e;
    }
}
