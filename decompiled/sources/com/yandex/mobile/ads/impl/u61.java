package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u61 {

    /* renamed from: a, reason: collision with root package name */
    private final v7 f17022a;
    private final ca1 b;
    private final fa1 c;
    private final hq1<y61> d;
    private final int e;

    public u61(v7 adRequestData, ca1 nativeResponseType, fa1 sourceType, hq1<y61> requestPolicy, int i) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(nativeResponseType, "nativeResponseType");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        this.f17022a = adRequestData;
        this.b = nativeResponseType;
        this.c = sourceType;
        this.d = requestPolicy;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u61)) {
            return false;
        }
        u61 u61Var = (u61) obj;
        return Intrinsics.areEqual(this.f17022a, u61Var.f17022a) && this.b == u61Var.b && this.c == u61Var.c && Intrinsics.areEqual(this.d, u61Var.d) && this.e == u61Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f17022a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdRequestData(adRequestData=" + this.f17022a + ", nativeResponseType=" + this.b + ", sourceType=" + this.c + ", requestPolicy=" + this.d + ", adsCount=" + this.e + Separators.RPAREN;
    }

    public final v7 a() {
        return this.f17022a;
    }

    public final ca1 c() {
        return this.b;
    }

    public final fa1 e() {
        return this.c;
    }

    public final hq1<y61> d() {
        return this.d;
    }

    public final int b() {
        return this.e;
    }
}
