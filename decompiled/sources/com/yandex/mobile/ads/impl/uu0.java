package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class uu0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f17088a;
    private final vu0 b;

    public uu0(int i, vu0 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f17088a = i;
        this.b = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu0)) {
            return false;
        }
        uu0 uu0Var = (uu0) obj;
        return this.f17088a == uu0Var.f17088a && this.b == uu0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f17088a) * 31);
    }

    public final String toString() {
        return "MeasuredSizeSpec(value=" + this.f17088a + ", mode=" + this.b + Separators.RPAREN;
    }

    public final int b() {
        return this.f17088a;
    }

    public final vu0 a() {
        return this.b;
    }
}
