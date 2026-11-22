package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tu0 {

    /* renamed from: a, reason: collision with root package name */
    private final uu0 f16996a;
    private final uu0 b;

    public tu0(uu0 width, uu0 height) {
        Intrinsics.checkNotNullParameter(width, "width");
        Intrinsics.checkNotNullParameter(height, "height");
        this.f16996a = width;
        this.b = height;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu0)) {
            return false;
        }
        tu0 tu0Var = (tu0) obj;
        return Intrinsics.areEqual(this.f16996a, tu0Var.f16996a) && Intrinsics.areEqual(this.b, tu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16996a.hashCode() * 31);
    }

    public final String toString() {
        return "MeasuredSize(width=" + this.f16996a + ", height=" + this.b + Separators.RPAREN;
    }

    public final uu0 b() {
        return this.f16996a;
    }

    public final uu0 a() {
        return this.b;
    }
}
