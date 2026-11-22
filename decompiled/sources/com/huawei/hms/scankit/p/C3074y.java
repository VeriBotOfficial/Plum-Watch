package com.huawei.hms.scankit.p;

import java.util.Arrays;

/* compiled from: BitMatrix.java */
/* renamed from: com.huawei.hms.scankit.p.y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3074y implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private final int f10701a;
    private final int b;
    private final int c;
    private final int[] d;

    public C3074y(int i) {
        this(i, i);
    }

    public void a(int i, int i2) {
        int i3 = (i2 * this.c) + (i / 32);
        if (com.huawei.hms.scankit.util.b.a(this.d, i3)) {
            int[] iArr = this.d;
            iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
        }
    }

    public boolean b(int i, int i2) {
        int i3 = (i2 * this.c) + (i / 32);
        return com.huawei.hms.scankit.util.b.a(this.d, i3) && ((this.d[i3] >>> (i & 31)) & 1) != 0;
    }

    public void c(int i, int i2) {
        int i3 = (i2 * this.c) + (i / 32);
        if (com.huawei.hms.scankit.util.b.a(this.d, i3)) {
            int[] iArr = this.d;
            iArr[i3] = (1 << (i & 31)) | iArr[i3];
        }
    }

    public int d() {
        return this.f10701a;
    }

    public void e() {
        int d = d();
        int b = b();
        C3070x c3070x = new C3070x(d);
        C3070x c3070x2 = new C3070x(d);
        for (int i = 0; i < (b + 1) / 2; i++) {
            c3070x = a(i, c3070x);
            int i2 = (b - 1) - i;
            c3070x2 = a(i2, c3070x2);
            c3070x.g();
            c3070x2.g();
            b(i, c3070x2);
            b(i2, c3070x);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3074y)) {
            return false;
        }
        C3074y c3074y = (C3074y) obj;
        return this.f10701a == c3074y.f10701a && this.b == c3074y.b && this.c == c3074y.c && Arrays.equals(this.d, c3074y.d);
    }

    public int hashCode() {
        int i = this.f10701a;
        return (((((((i * 31) + i) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
    }

    public String toString() {
        return a("X ", "  ");
    }

    public C3074y(int i, int i2) {
        if (i < 1 || i2 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f10701a = i;
        this.b = i2;
        int i3 = (i + 31) / 32;
        this.c = i3;
        this.d = new int[i3 * i2];
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C3074y m8172clone() {
        return new C3074y(this.f10701a, this.b, this.c, (int[]) this.d.clone());
    }

    public void a() {
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            this.d[i] = 0;
        }
    }

    public void b(int i, C3070x c3070x) {
        int[] c = c3070x.c();
        int[] iArr = this.d;
        int i2 = this.c;
        System.arraycopy(c, 0, iArr, i * i2, i2);
    }

    public C3074y c() {
        int[] iArr = new int[this.d.length];
        int i = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i < iArr2.length) {
                iArr[i] = ~iArr2[i];
                i++;
            } else {
                return new C3074y(this.f10701a, this.b, this.c, iArr);
            }
        }
    }

    public int b() {
        return this.b;
    }

    public void a(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 >= 1 && i3 >= 1) {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.b || i5 > this.f10701a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.c * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.d;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
            return;
        }
        throw new IllegalArgumentException("Height and width must be at least 1");
    }

    public C3074y(int i, int i2, int i3, int[] iArr) {
        this.f10701a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
    }

    public C3070x a(int i, C3070x c3070x) {
        if (c3070x != null && c3070x.d() >= this.f10701a) {
            c3070x.a();
        } else {
            c3070x = new C3070x(this.f10701a);
        }
        int i2 = i * this.c;
        for (int i3 = 0; i3 < this.c; i3++) {
            c3070x.b(i3 * 32, this.d[i2 + i3]);
        }
        return c3070x;
    }

    public String a(String str, String str2) {
        return a(str, str2, "\n");
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.b * (this.f10701a + 1));
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.f10701a; i2++) {
                sb.append(b(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }
}
