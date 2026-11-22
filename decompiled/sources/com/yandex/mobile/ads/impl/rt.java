package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rt {

    /* renamed from: a, reason: collision with root package name */
    private final xt f16796a;
    private final tt b;
    private final tt c;
    private final tt d;
    private final cu e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final Float k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final boolean p;

    public rt() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt)) {
            return false;
        }
        rt rtVar = (rt) obj;
        return Intrinsics.areEqual(this.f16796a, rtVar.f16796a) && Intrinsics.areEqual(this.b, rtVar.b) && Intrinsics.areEqual(this.c, rtVar.c) && Intrinsics.areEqual(this.d, rtVar.d) && Intrinsics.areEqual(this.e, rtVar.e) && Intrinsics.areEqual(this.f, rtVar.f) && Intrinsics.areEqual(this.g, rtVar.g) && Intrinsics.areEqual(this.h, rtVar.h) && Intrinsics.areEqual(this.i, rtVar.i) && Intrinsics.areEqual(this.j, rtVar.j) && Intrinsics.areEqual((Object) this.k, (Object) rtVar.k) && Intrinsics.areEqual(this.l, rtVar.l) && Intrinsics.areEqual(this.m, rtVar.m) && Intrinsics.areEqual(this.n, rtVar.n) && Intrinsics.areEqual(this.o, rtVar.o) && this.p == rtVar.p;
    }

    public final int hashCode() {
        xt xtVar = this.f16796a;
        int hashCode = (xtVar == null ? 0 : xtVar.hashCode()) * 31;
        tt ttVar = this.b;
        int hashCode2 = (hashCode + (ttVar == null ? 0 : ttVar.hashCode())) * 31;
        tt ttVar2 = this.c;
        int hashCode3 = (hashCode2 + (ttVar2 == null ? 0 : ttVar2.hashCode())) * 31;
        tt ttVar3 = this.d;
        int hashCode4 = (hashCode3 + (ttVar3 == null ? 0 : ttVar3.hashCode())) * 31;
        cu cuVar = this.e;
        int hashCode5 = (hashCode4 + (cuVar == null ? 0 : cuVar.hashCode())) * 31;
        String str = this.f;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f = this.k;
        int hashCode11 = (hashCode10 + (f == null ? 0 : f.hashCode())) * 31;
        String str6 = this.l;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.m;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.n;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.o;
        return Boolean.hashCode(this.p) + ((hashCode14 + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CoreNativeAdAssets(media=" + this.f16796a + ", favicon=" + this.b + ", icon=" + this.c + ", image=" + this.d + ", closeButton=" + this.e + ", age=" + this.f + ", body=" + this.g + ", callToAction=" + this.h + ", domain=" + this.i + ", price=" + this.j + ", rating=" + this.k + ", reviewCount=" + this.l + ", sponsored=" + this.m + ", title=" + this.n + ", warning=" + this.o + ", feedbackAvailable=" + this.p + Separators.RPAREN;
    }

    public /* synthetic */ rt(int i) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false);
    }

    public final xt i() {
        return this.f16796a;
    }

    public final tt e() {
        return this.b;
    }

    public rt(xt xtVar, tt ttVar, tt ttVar2, tt ttVar3, cu cuVar, String str, String str2, String str3, String str4, String str5, Float f, String str6, String str7, String str8, String str9, boolean z) {
        this.f16796a = xtVar;
        this.b = ttVar;
        this.c = ttVar2;
        this.d = ttVar3;
        this.e = cuVar;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = f;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        this.o = str9;
        this.p = z;
    }

    public final tt g() {
        return this.c;
    }

    public final tt h() {
        return this.d;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.h;
    }

    public final String d() {
        return this.i;
    }

    public final String j() {
        return this.j;
    }

    public final Float k() {
        return this.k;
    }

    public final String l() {
        return this.l;
    }

    public final String m() {
        return this.m;
    }

    public final String n() {
        return this.n;
    }

    public final String o() {
        return this.o;
    }

    public final boolean f() {
        return this.p;
    }
}
