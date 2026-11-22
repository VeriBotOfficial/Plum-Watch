package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pl0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16579a;
    private final int b;
    private final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl0)) {
            return false;
        }
        pl0 pl0Var = (pl0) obj;
        return Intrinsics.areEqual(this.f16579a, pl0Var.f16579a) && this.b == pl0Var.b && this.c == pl0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + dy1.a(this.b, this.f16579a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "InstalledPackage(name=" + this.f16579a + ", minVersion=" + this.b + ", maxVersion=" + this.c + Separators.RPAREN;
    }

    public pl0(int i, int i2, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f16579a = name;
        this.b = i;
        this.c = i2;
    }
}
