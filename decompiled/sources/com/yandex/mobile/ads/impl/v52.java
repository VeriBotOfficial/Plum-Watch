package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class v52 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17126a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final jc0 f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    private final w52[] k;

    public v52(int i, int i2, long j, long j2, long j3, jc0 jc0Var, int i3, w52[] w52VarArr, int i4, long[] jArr, long[] jArr2) {
        this.f17126a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = jc0Var;
        this.g = i3;
        this.k = w52VarArr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public final w52 a(int i) {
        w52[] w52VarArr = this.k;
        if (w52VarArr == null) {
            return null;
        }
        return w52VarArr[i];
    }
}
