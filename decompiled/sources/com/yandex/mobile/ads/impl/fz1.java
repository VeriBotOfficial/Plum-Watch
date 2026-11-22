package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fz1 implements Comparable<fz1> {
    private final int b;
    private final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz1)) {
            return false;
        }
        fz1 fz1Var = (fz1) obj;
        return this.b == fz1Var.b && this.c == fz1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "Size(width=" + this.b + ", height=" + this.c + Separators.RPAREN;
    }

    public fz1(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(fz1 fz1Var) {
        fz1 other = fz1Var;
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(this.b * this.c, other.b * other.c);
    }

    public final int b() {
        return this.b;
    }

    public final int a() {
        return this.c;
    }
}
