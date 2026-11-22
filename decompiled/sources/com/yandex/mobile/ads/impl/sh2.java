package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sh2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16861a;
    private final int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh2)) {
            return false;
        }
        sh2 sh2Var = (sh2) obj;
        return Intrinsics.areEqual(this.f16861a, sh2Var.f16861a) && this.b == sh2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f16861a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewSizeKey(adUnitId=" + this.f16861a + ", screenOrientation=" + this.b + Separators.RPAREN;
    }

    public sh2(int i, String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f16861a = adUnitId;
        this.b = i;
    }

    public final String a() {
        return this.f16861a;
    }

    public final int b() {
        return this.b;
    }
}
