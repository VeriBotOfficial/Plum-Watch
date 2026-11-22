package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nr0 {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f16375a;
    private final Integer b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr0)) {
            return false;
        }
        nr0 nr0Var = (nr0) obj;
        return Intrinsics.areEqual(this.f16375a, nr0Var.f16375a) && Intrinsics.areEqual(this.b, nr0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f16375a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "LayoutParamsSize(width=" + this.f16375a + ", height=" + this.b + Separators.RPAREN;
    }

    public nr0(Integer num, Integer num2) {
        this.f16375a = num;
        this.b = num2;
    }

    public final Integer b() {
        return this.f16375a;
    }

    public final Integer a() {
        return this.b;
    }
}
