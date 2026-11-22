package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dl {

    /* renamed from: a, reason: collision with root package name */
    private final ts f15288a;
    private final gz1 b;
    private final Map<String, String> c;

    public dl(ts tsVar, gz1 gz1Var, Map<String, String> parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f15288a = tsVar;
        this.b = gz1Var;
        this.c = parameters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl)) {
            return false;
        }
        dl dlVar = (dl) obj;
        return this.f15288a == dlVar.f15288a && Intrinsics.areEqual(this.b, dlVar.b) && Intrinsics.areEqual(this.c, dlVar.c);
    }

    public final int hashCode() {
        ts tsVar = this.f15288a;
        int hashCode = (tsVar == null ? 0 : tsVar.hashCode()) * 31;
        gz1 gz1Var = this.b;
        return this.c.hashCode() + ((hashCode + (gz1Var != null ? gz1Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BidderTokenRequestData(adType=" + this.f15288a + ", sizeInfo=" + this.b + ", parameters=" + this.c + Separators.RPAREN;
    }

    public final ts a() {
        return this.f15288a;
    }

    public final gz1 c() {
        return this.b;
    }

    public final Map<String, String> b() {
        return this.c;
    }
}
