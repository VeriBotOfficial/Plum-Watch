package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cm0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15204a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm0)) {
            return false;
        }
        cm0 cm0Var = (cm0) obj;
        return Intrinsics.areEqual(this.f15204a, cm0Var.f15204a) && Intrinsics.areEqual(this.b, cm0Var.b) && Intrinsics.areEqual(this.c, cm0Var.c) && Intrinsics.areEqual(this.d, cm0Var.d) && Intrinsics.areEqual(this.e, cm0Var.e) && Intrinsics.areEqual(this.f, cm0Var.f);
    }

    public final int hashCode() {
        String str = this.f15204a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "InstreamAdInfo(adId=" + this.f15204a + ", creativeId=" + this.b + ", bannerId=" + this.c + ", data=" + this.d + ", advertiserInfo=" + this.e + ", adParameters=" + this.f + Separators.RPAREN;
    }

    public cm0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f15204a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final String a() {
        return this.f15204a;
    }

    public final String e() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String f() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final String b() {
        return this.f;
    }
}
