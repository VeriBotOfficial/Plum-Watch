package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public class rw0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16804a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public rw0(int i, long j, Object obj) {
        this(obj, -1, -1, j, i);
    }

    protected rw0(rw0 rw0Var) {
        this.f16804a = rw0Var.f16804a;
        this.b = rw0Var.b;
        this.c = rw0Var.c;
        this.d = rw0Var.d;
        this.e = rw0Var.e;
    }

    public final rw0 a(Object obj) {
        return this.f16804a.equals(obj) ? this : new rw0(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw0)) {
            return false;
        }
        rw0 rw0Var = (rw0) obj;
        return this.f16804a.equals(rw0Var.f16804a) && this.b == rw0Var.b && this.c == rw0Var.c && this.d == rw0Var.d && this.e == rw0Var.e;
    }

    public final int hashCode() {
        return ((((((((this.f16804a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public rw0(Object obj) {
        this(obj, -1L);
    }

    public final boolean a() {
        return this.b != -1;
    }

    public rw0(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private rw0(Object obj, int i, int i2, long j, int i3) {
        this.f16804a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public rw0(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }
}
