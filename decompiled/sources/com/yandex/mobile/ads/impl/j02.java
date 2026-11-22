package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;

/* loaded from: classes5.dex */
public final class j02 {

    /* renamed from: a, reason: collision with root package name */
    private final int f15870a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j02)) {
            return false;
        }
        j02 j02Var = (j02) obj;
        return this.f15870a == j02Var.f15870a && this.b == j02Var.b && this.c == j02Var.c && this.d == j02Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + dy1.a(this.c, dy1.a(this.b, Integer.hashCode(this.f15870a) * 31, 31), 31);
    }

    public final String toString() {
        return "SmartCenter(x=" + this.f15870a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + Separators.RPAREN;
    }

    public j02(int i, int i2, int i3, int i4) {
        this.f15870a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i3 * i4;
    }

    public final int d() {
        return this.f15870a;
    }

    public final int e() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final int a() {
        return this.e;
    }
}
