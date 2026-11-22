package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.vw0;

/* loaded from: classes5.dex */
final class sw0 {

    /* renamed from: a, reason: collision with root package name */
    public final vw0.b f16901a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    sw0(vw0.b bVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        hg.a(!z4 || z2);
        hg.a(!z3 || z2);
        if (!z || (!z2 && !z3 && !z4)) {
            z5 = true;
        }
        hg.a(z5);
        this.f16901a = bVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sw0.class == obj.getClass()) {
            sw0 sw0Var = (sw0) obj;
            if (this.b == sw0Var.b && this.c == sw0Var.c && this.d == sw0Var.d && this.e == sw0Var.e && this.f == sw0Var.f && this.g == sw0Var.g && this.h == sw0Var.h && this.i == sw0Var.i && f92.a(this.f16901a, sw0Var.f16901a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f16901a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
