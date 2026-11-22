package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lf {

    /* renamed from: a, reason: collision with root package name */
    private final String f16109a;
    private final String b;
    private final String c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf)) {
            return false;
        }
        lf lfVar = (lf) obj;
        return Intrinsics.areEqual(this.f16109a, lfVar.f16109a) && Intrinsics.areEqual(this.b, lfVar.b) && Intrinsics.areEqual(this.c, lfVar.c);
    }

    public final int hashCode() {
        String str = this.f16109a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AppMetricaStartupParams(uuid=" + this.f16109a + ", deviceId=" + this.b + ", getAdUrl=" + this.c + Separators.RPAREN;
    }

    public lf(String str, String str2, String str3) {
        this.f16109a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String c() {
        return this.f16109a;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }
}
