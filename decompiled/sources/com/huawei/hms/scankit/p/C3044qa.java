package com.huawei.hms.scankit.p;

import com.google.zxing.pdf417.PDF417Common;

/* compiled from: ModulusGF.java */
/* renamed from: com.huawei.hms.scankit.p.qa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3044qa {

    /* renamed from: a, reason: collision with root package name */
    public static final C3044qa f10679a = new C3044qa(PDF417Common.NUMBER_OF_CODEWORDS, 3);
    private final int[] b;
    private final int[] c;
    private final C3047ra d;
    private final C3047ra e;
    private final int f;

    private C3044qa(int i, int i2) {
        this.f = i;
        this.b = new int[i];
        this.c = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.b[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.c[this.b[i5]] = i5;
        }
        this.d = new C3047ra(this, new int[]{0});
        this.e = new C3047ra(this, new int[]{1});
    }

    C3047ra a() {
        return this.e;
    }

    C3047ra b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.d;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new C3047ra(this, iArr);
    }

    C3047ra c() {
        return this.d;
    }

    int d(int i, int i2) {
        int i3 = this.f;
        return ((i + i3) - i2) % i3;
    }

    int a(int i, int i2) {
        return (i + i2) % this.f;
    }

    int c(int i) {
        if (i != 0) {
            return this.c[i];
        }
        throw new IllegalArgumentException();
    }

    int a(int i) {
        return this.b[i];
    }

    int c(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return 0;
        }
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f - 1)];
    }

    int b(int i) {
        if (i != 0) {
            return this.b[(this.f - this.c[i]) - 1];
        }
        throw new ArithmeticException();
    }

    int b() {
        return this.f;
    }
}
