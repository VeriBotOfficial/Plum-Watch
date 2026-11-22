package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ex1;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes5.dex */
final class no {

    /* renamed from: a, reason: collision with root package name */
    protected final a62 f16361a;
    private final int b;
    private final int c;
    private final long d;
    private final int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long[] k;
    private int[] l;

    public final ex1.a b(long j) {
        long j2 = 1;
        int i = (int) (j / ((this.d * j2) / this.e));
        int a2 = f92.a(this.l, i, true, true);
        int i2 = this.l[a2];
        if (i2 == i) {
            gx1 gx1Var = new gx1(((this.d * j2) / this.e) * i2, this.k[a2]);
            return new ex1.a(gx1Var, gx1Var);
        }
        long j3 = i2;
        long j4 = (this.d * j2) / this.e;
        long[] jArr = this.k;
        gx1 gx1Var2 = new gx1(j3 * j4, jArr[a2]);
        int i3 = a2 + 1;
        return i3 < jArr.length ? new ex1.a(gx1Var2, new gx1(j4 * r0[i3], jArr[i3])) : new ex1.a(gx1Var2, gx1Var2);
    }

    public no(int i, int i2, long j, int i3, a62 a62Var) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        hg.a(z);
        this.d = j;
        this.e = i3;
        this.f16361a = a62Var;
        this.b = a(i, i2 == 2 ? 1667497984 : 1651965952);
        this.c = i2 == 2 ? a(i, 1650720768) : -1;
        this.k = new long[512];
        this.l = new int[512];
    }

    public final void a(long j) {
        if (this.j == this.l.length) {
            long[] jArr = this.k;
            this.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.l;
            this.l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.k;
        int i = this.j;
        jArr2[i] = j;
        this.l[i] = this.i;
        this.j = i + 1;
    }

    public final void b() {
        this.i++;
    }

    public final void c(long j) {
        if (this.j == 0) {
            this.h = 0;
        } else {
            this.h = this.l[f92.b(this.k, j, true)];
        }
    }

    public final void a() {
        this.k = Arrays.copyOf(this.k, this.j);
        this.l = Arrays.copyOf(this.l, this.j);
    }

    public final void b(int i) {
        this.f = i;
        this.g = i;
    }

    private static int a(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    public final boolean a(int i) {
        return this.b == i || this.c == i;
    }

    public final boolean a(wz wzVar) throws IOException {
        int i = this.g;
        int b = i - this.f16361a.b(wzVar, i, false);
        this.g = b;
        boolean z = b == 0;
        if (z) {
            if (this.f > 0) {
                a62 a62Var = this.f16361a;
                int i2 = this.h;
                a62Var.a((this.d * i2) / this.e, Arrays.binarySearch(this.l, i2) >= 0 ? 1 : 0, this.f, 0, null);
            }
            this.h++;
        }
        return z;
    }
}
