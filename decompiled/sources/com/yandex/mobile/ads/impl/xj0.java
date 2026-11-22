package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xj0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f17340a;
    private final int b;
    private final String c;
    private final String d;
    private final r02 e;
    private final boolean f;
    private final String g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj0)) {
            return false;
        }
        xj0 xj0Var = (xj0) obj;
        return this.f17340a == xj0Var.f17340a && this.b == xj0Var.b && Intrinsics.areEqual(this.c, xj0Var.c) && Intrinsics.areEqual(this.d, xj0Var.d) && Intrinsics.areEqual(this.e, xj0Var.e) && this.f == xj0Var.f && Intrinsics.areEqual(this.g, xj0Var.g);
    }

    public final int hashCode() {
        int a2 = v3.a(this.c, dy1.a(this.b, Integer.hashCode(this.f17340a) * 31, 31), 31);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        r02 r02Var = this.e;
        int a3 = a7.a(this.f, (hashCode + (r02Var == null ? 0 : r02Var.hashCode())) * 31, 31);
        String str2 = this.g;
        return a3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ImageValue(width=" + this.f17340a + ", height=" + this.b + ", url=" + this.c + ", sizeType=" + this.d + ", smartCenterSettings=" + this.e + ", preload=" + this.f + ", preview=" + this.g + Separators.RPAREN;
    }

    public /* synthetic */ xj0(int i, int i2, String str, String str2, int i3) {
        this(i, i2, str, (i3 & 8) != 0 ? null : str2, null, true, null);
    }

    public xj0(int i, int i2, String url, String str, r02 r02Var, boolean z, String str2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f17340a = i;
        this.b = i2;
        this.c = url;
        this.d = str;
        this.e = r02Var;
        this.f = z;
        this.g = str2;
    }

    public final int g() {
        return this.f17340a;
    }

    public final int a() {
        return this.b;
    }

    public final String f() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final r02 e() {
        return this.e;
    }

    public final boolean b() {
        return this.f;
    }

    public final String c() {
        return this.g;
    }
}
