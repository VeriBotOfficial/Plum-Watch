package com.huawei.hms.scankit.p;

import java.util.Arrays;

/* compiled from: BitArray.java */
/* renamed from: com.huawei.hms.scankit.p.x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3070x implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private int[] f10699a;
    private int[] b;
    private int c;

    public C3070x() {
        this.c = 0;
        this.f10699a = new int[1];
    }

    private void f(int i) {
        if (i > this.f10699a.length * 32) {
            int[] h = h(i);
            int[] iArr = this.f10699a;
            System.arraycopy(iArr, 0, h, 0, iArr.length);
            this.f10699a = h;
        }
    }

    private int g(int i) {
        int i2 = 0;
        while (i > 0) {
            i &= i - 1;
            i2++;
        }
        return i2;
    }

    public boolean a(int i) {
        return ((1 << (i & 31)) & this.f10699a[i / 32]) != 0;
    }

    public void b() {
        this.b = this.f10699a;
    }

    public int c(int i) {
        int i2 = this.c;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        if (!com.huawei.hms.scankit.util.b.a(this.f10699a, i3)) {
            return -1;
        }
        int i4 = (-(1 << (i & 31))) & (~this.f10699a[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f10699a;
            if (i3 == iArr.length) {
                return this.c;
            }
            if (com.huawei.hms.scankit.util.b.a(iArr, i3)) {
                i4 = ~this.f10699a[i3];
            }
        }
        int numberOfTrailingZeros = (i3 * 32) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.c;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return (this.c + 7) / 8;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3070x)) {
            return false;
        }
        C3070x c3070x = (C3070x) obj;
        return this.c == c3070x.c && Arrays.equals(this.f10699a, c3070x.f10699a);
    }

    public void g() {
        int[] iArr = new int[this.f10699a.length];
        int i = (this.c - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = this.f10699a[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.c;
        int i5 = i2 * 32;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i] = i7;
        }
        this.f10699a = iArr;
    }

    public void h() {
        for (int i = 0; i < this.c - 1; i++) {
            if (!a(i) && a(i + 1)) {
                d(i);
            }
        }
    }

    public int hashCode() {
        return (this.c * 31) + Arrays.hashCode(this.f10699a);
    }

    public void i() {
        for (int i = 0; i < this.c - 1; i++) {
            if (a(i) && !a(i + 1)) {
                e(i);
            }
        }
    }

    public String toString() {
        int i = this.c;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.c; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(a(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    public void a() {
        int length = this.f10699a.length;
        for (int i = 0; i < length; i++) {
            this.f10699a[i] = 0;
        }
    }

    public int b(int i) {
        int i2 = this.c;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        if (!com.huawei.hms.scankit.util.b.a(this.f10699a, i3)) {
            return -1;
        }
        int i4 = (-(1 << (i & 31))) & this.f10699a[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f10699a;
            if (i3 == iArr.length) {
                return this.c;
            }
            if (com.huawei.hms.scankit.util.b.a(iArr, i3)) {
                i4 = this.f10699a[i3];
            }
        }
        int numberOfTrailingZeros = (i3 * 32) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.c;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C3070x m8171clone() {
        return new C3070x((int[]) this.f10699a.clone(), this.c);
    }

    public void d(int i) {
        int[] iArr = this.f10699a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public void e(int i) {
        int[] iArr = this.f10699a;
        int i2 = i / 32;
        iArr[i2] = iArr[i2] - (1 << (i & 31));
    }

    public C3070x(int i) {
        this.c = i;
        this.f10699a = h(i);
    }

    private static int[] h(int i) {
        return new int[(i + 31) / 32];
    }

    public boolean a(int i, int i2, boolean z, boolean z2) {
        if (i2 < i || i < 0 || i2 > this.c) {
            throw new IllegalArgumentException();
        }
        if (i2 == i) {
            return true;
        }
        int i3 = i2 - 1;
        int i4 = i / 32;
        int i5 = i3 / 32;
        int i6 = i4;
        int i7 = 0;
        while (i6 <= i5) {
            int i8 = (2 << (i6 < i5 ? 31 : i3 & 31)) - (1 << (i6 > i4 ? 0 : i & 31));
            if (!z2 && (i7 = i7 + g(this.f10699a[i6] & i8)) > (i3 - i) / 10) {
                return false;
            }
            if (z2) {
                int i9 = this.f10699a[i6] & i8;
                if (!z) {
                    i8 = 0;
                }
                if (i9 != i8) {
                    return false;
                }
            }
            i6++;
        }
        return true;
    }

    public void f() {
        this.f10699a = this.b;
    }

    C3070x(int[] iArr, int i) {
        this.f10699a = iArr;
        this.c = i;
    }

    public void c(int i, int i2) {
        if (i2 < i || i < 0 || i2 > this.c) {
            throw new IllegalArgumentException();
        }
        if (i2 == i) {
            return;
        }
        int i3 = i2 - 1;
        int i4 = i / 32;
        int i5 = i3 / 32;
        int i6 = i4;
        while (i6 <= i5) {
            int i7 = 31;
            int i8 = i6 > i4 ? 0 : i & 31;
            if (i6 >= i5) {
                i7 = 31 & i3;
            }
            int i9 = (2 << i7) - (1 << i8);
            int[] iArr = this.f10699a;
            iArr[i6] = i9 | iArr[i6];
            i6++;
        }
    }

    public void a(boolean z) {
        f(this.c + 1);
        if (z) {
            int[] iArr = this.f10699a;
            int i = this.c;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.c++;
    }

    public void b(int i, int i2) {
        this.f10699a[i / 32] = i2;
    }

    public void b(C3070x c3070x) {
        if (this.c != c3070x.c) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f10699a;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ c3070x.f10699a[i];
            i++;
        }
    }

    public void a(int i, int i2) {
        if (i2 >= 0 && i2 <= 32) {
            f(this.c + i2);
            while (i2 > 0) {
                boolean z = true;
                if (((i >> (i2 - 1)) & 1) != 1) {
                    z = false;
                }
                a(z);
                i2--;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public int[] c() {
        return this.f10699a;
    }

    public void a(C3070x c3070x) {
        int i = c3070x.c;
        f(this.c + i);
        for (int i2 = 0; i2 < i; i2++) {
            a(c3070x.a(i2));
        }
    }

    public void a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (a(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }
}
