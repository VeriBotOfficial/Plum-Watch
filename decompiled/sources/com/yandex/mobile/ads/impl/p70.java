package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p70 {

    /* renamed from: a, reason: collision with root package name */
    private final int f16528a;
    private final RectF b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p70)) {
            return false;
        }
        p70 p70Var = (p70) obj;
        return this.f16528a == p70Var.f16528a && Intrinsics.areEqual(this.b, p70Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f16528a) * 31;
        RectF rectF = this.b;
        return hashCode + (rectF == null ? 0 : rectF.hashCode());
    }

    public final String toString() {
        return "Exposure(exposedPercentage=" + this.f16528a + ", visibleRectangle=" + this.b + Separators.RPAREN;
    }

    public p70(int i, RectF rectF) {
        this.f16528a = i;
        this.b = rectF;
    }

    public final int a() {
        return this.f16528a;
    }

    public final RectF b() {
        return this.b;
    }
}
