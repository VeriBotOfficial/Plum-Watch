package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ss {

    /* renamed from: a, reason: collision with root package name */
    private final String f16890a;
    private final h9 b;
    private final String c;

    public ss(String adUnitId, h9 h9Var, String str) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f16890a = adUnitId;
        this.b = h9Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss)) {
            return false;
        }
        ss ssVar = (ss) obj;
        return Intrinsics.areEqual(this.f16890a, ssVar.f16890a) && Intrinsics.areEqual(this.b, ssVar.b) && Intrinsics.areEqual(this.c, ssVar.c);
    }

    public final int hashCode() {
        int hashCode = this.f16890a.hashCode() * 31;
        h9 h9Var = this.b;
        int hashCode2 = (hashCode + (h9Var == null ? 0 : h9Var.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CoreAdInfo(adUnitId=" + this.f16890a + ", adSize=" + this.b + ", data=" + this.c + Separators.RPAREN;
    }

    public final String b() {
        return this.f16890a;
    }

    public final h9 a() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }
}
