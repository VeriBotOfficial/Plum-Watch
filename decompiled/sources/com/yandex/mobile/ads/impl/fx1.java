package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class fx1 {
    public static final fx1 c;

    /* renamed from: a, reason: collision with root package name */
    public final long f15535a;
    public final long b;

    static {
        fx1 fx1Var = new fx1(0L, 0L);
        new fx1(Long.MAX_VALUE, Long.MAX_VALUE);
        new fx1(Long.MAX_VALUE, 0L);
        new fx1(0L, Long.MAX_VALUE);
        c = fx1Var;
    }

    public fx1(long j, long j2) {
        hg.a(j >= 0);
        hg.a(j2 >= 0);
        this.f15535a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fx1.class == obj.getClass()) {
            fx1 fx1Var = (fx1) obj;
            if (this.f15535a == fx1Var.f15535a && this.b == fx1Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f15535a) * 31) + ((int) this.b);
    }
}
