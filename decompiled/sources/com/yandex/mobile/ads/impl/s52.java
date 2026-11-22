package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s52 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16832a;
    private final hu1 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s52)) {
            return false;
        }
        s52 s52Var = (s52) obj;
        return Intrinsics.areEqual(this.f16832a, s52Var.f16832a) && this.b == s52Var.b;
    }

    public final int hashCode() {
        String str = this.f16832a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        hu1 hu1Var = this.b;
        return hashCode + (hu1Var != null ? hu1Var.hashCode() : 0);
    }

    public final String toString() {
        return "TokenResult(bidderToken=" + this.f16832a + ", stubReason=" + this.b + Separators.RPAREN;
    }

    public s52(String str, hu1 hu1Var) {
        this.f16832a = str;
        this.b = hu1Var;
    }

    public final String a() {
        return this.f16832a;
    }

    public final hu1 b() {
        return this.b;
    }
}
