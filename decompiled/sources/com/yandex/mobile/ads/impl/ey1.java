package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ey1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f15437a;
    private final String b;
    private final int c;
    private final fy1 d;

    public ey1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey1)) {
            return false;
        }
        ey1 ey1Var = (ey1) obj;
        return this.f15437a == ey1Var.f15437a && Intrinsics.areEqual(this.b, ey1Var.b) && this.c == ey1Var.c && this.d == ey1Var.d;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f15437a) * 31;
        String str = this.b;
        return this.d.hashCode() + dy1.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ShowNotice(delay=" + this.f15437a + ", url=" + this.b + ", visibilityPercent=" + this.c + ", type=" + this.d + Separators.RPAREN;
    }

    public /* synthetic */ ey1(int i) {
        this(0, 0L, fy1.d, null);
    }

    public final long a() {
        return this.f15437a;
    }

    public ey1(int i, long j, fy1 type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f15437a = j;
        this.b = str;
        this.c = i;
        this.d = type;
    }

    public final String c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final fy1 b() {
        return this.d;
    }
}
