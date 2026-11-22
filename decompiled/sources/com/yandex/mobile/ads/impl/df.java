package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class df {

    /* renamed from: a, reason: collision with root package name */
    private final String f15275a;
    private final String b;
    private final String c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df)) {
            return false;
        }
        df dfVar = (df) obj;
        return Intrinsics.areEqual(this.f15275a, dfVar.f15275a) && Intrinsics.areEqual(this.b, dfVar.b) && Intrinsics.areEqual(this.c, dfVar.c);
    }

    public final int hashCode() {
        String str = this.f15275a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AppMetricaIdentifiers(adGetUrl=" + this.f15275a + ", deviceId=" + this.b + ", uuid=" + this.c + Separators.RPAREN;
    }

    public df(String str, String str2, String str3) {
        this.f15275a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.f15275a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }
}
