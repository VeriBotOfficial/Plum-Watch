package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class gx1 {
    public static final gx1 c = new gx1(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f15636a;
    public final long b;

    public final String toString() {
        return "[timeUs=" + this.f15636a + ", position=" + this.b + "]";
    }

    public gx1(long j, long j2) {
        this.f15636a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gx1.class == obj.getClass()) {
            gx1 gx1Var = (gx1) obj;
            if (this.f15636a == gx1Var.f15636a && this.b == gx1Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f15636a) * 31) + ((int) this.b);
    }
}
