package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
final class b62 {

    /* renamed from: a, reason: collision with root package name */
    public final v52 f15076a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public b62(v52 v52Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        hg.a(iArr.length == jArr2.length);
        hg.a(jArr.length == jArr2.length);
        hg.a(iArr2.length == jArr2.length);
        this.f15076a = v52Var;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        for (int a2 = f92.a(this.f, j, true); a2 < this.f.length; a2++) {
            if ((this.g[a2] & 1) != 0) {
                return a2;
            }
        }
        return -1;
    }
}
