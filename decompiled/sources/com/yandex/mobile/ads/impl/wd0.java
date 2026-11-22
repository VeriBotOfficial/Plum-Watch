package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wd0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17239a;
    private final String b;
    private final String c;
    private final String d;
    private final List<String> e;
    private final Map<String, String> f;
    private final nq1 g;

    public wd0(String adUnitId, String str, String str2, String str3, List<String> list, Map<String, String> map, nq1 nq1Var) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f17239a = adUnitId;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = map;
        this.g = nq1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd0)) {
            return false;
        }
        wd0 wd0Var = (wd0) obj;
        return Intrinsics.areEqual(this.f17239a, wd0Var.f17239a) && Intrinsics.areEqual(this.b, wd0Var.b) && Intrinsics.areEqual(this.c, wd0Var.c) && Intrinsics.areEqual(this.d, wd0Var.d) && Intrinsics.areEqual(this.e, wd0Var.e) && Intrinsics.areEqual(this.f, wd0Var.f) && this.g == wd0Var.g;
    }

    public final int hashCode() {
        int hashCode = this.f17239a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.f;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        nq1 nq1Var = this.g;
        return hashCode6 + (nq1Var != null ? nq1Var.hashCode() : 0);
    }

    public final String toString() {
        return "FullscreenCacheParams(adUnitId=" + this.f17239a + ", age=" + this.b + ", gender=" + this.c + ", contextQuery=" + this.d + ", contextTags=" + this.e + ", parameters=" + this.f + ", preferredTheme=" + this.g + Separators.RPAREN;
    }
}
