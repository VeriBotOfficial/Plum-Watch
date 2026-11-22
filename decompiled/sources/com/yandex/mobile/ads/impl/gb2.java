package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;

/* loaded from: classes5.dex */
public final class gb2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f15573a;
    private final int b;
    private final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb2)) {
            return false;
        }
        gb2 gb2Var = (gb2) obj;
        return this.f15573a == gb2Var.f15573a && this.b == gb2Var.b && this.c == gb2Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + dy1.a(this.b, Integer.hashCode(this.f15573a) * 31, 31);
    }

    public final String toString() {
        return "VersionInfo(majorVersion=" + this.f15573a + ", minorVersion=" + this.b + ", patchVersion=" + this.c + Separators.RPAREN;
    }

    public gb2(int i, int i2, int i3) {
        this.f15573a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        return this.f15573a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }
}
