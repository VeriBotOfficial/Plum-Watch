package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C2967a;

/* compiled from: BitMatrixParser.java */
/* loaded from: classes14.dex */
final class C {

    /* renamed from: a, reason: collision with root package name */
    private final C3074y f10553a;
    private final C3074y b;
    private final K c;

    C(C3074y c3074y) throws C2967a {
        int b = c3074y.b();
        if (b < 8 || b > 144 || (b & 1) != 0) {
            throw C2967a.a();
        }
        this.c = b(c3074y);
        C3074y a2 = a(c3074y);
        this.f10553a = a2;
        this.b = new C3074y(a2.d(), a2.b());
    }

    private static K b(C3074y c3074y) throws C2967a {
        return K.a(c3074y.b(), c3074y.d());
    }

    private int c(int i, int i2) {
        int i3 = i - 1;
        int i4 = (a(i3, 0, i, i2) ? 1 : 0) << 1;
        int i5 = i2 - 1;
        if (a(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (a(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (a(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (a(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (a(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (a(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return a(1, i5, i, i2) ? i13 | 1 : i13;
    }

    private int d(int i, int i2) {
        int i3 = (a(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (a(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (a(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (a(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (a(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (a(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (a(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return a(3, i7, i, i2) ? i10 | 1 : i10;
    }

    K a() {
        return this.c;
    }

    private int[] a(int i, int i2, int i3, int i4, byte[] bArr, int i5) {
        while (true) {
            if (i < i2 && i3 >= 0 && !this.b.b(i3, i)) {
                bArr[i5] = (byte) b(i, i3, i2, i4);
                i5++;
            }
            int i6 = i - 2;
            int i7 = i3 + 2;
            if (i6 < 0 || i7 >= i4) {
                break;
            }
            i = i6;
            i3 = i7;
        }
        int i8 = i - 1;
        int i9 = i3 + 5;
        while (true) {
            if (i8 >= 0 && i9 < i4 && !this.b.b(i9, i8)) {
                bArr[i5] = (byte) b(i8, i9, i2, i4);
                i5++;
            }
            int i10 = i8 + 2;
            int i11 = i9 - 2;
            if (i10 >= i2 || i11 < 0) {
                break;
            }
            i8 = i10;
            i9 = i11;
        }
        return new int[]{i8 + 5, i9 - 1, i5};
    }

    byte[] b() throws C2967a {
        byte[] bArr = new byte[this.c.f()];
        int b = this.f10553a.b();
        int d = this.f10553a.d();
        int i = 4;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            if (i == b && i2 == 0 && !z) {
                bArr[i3] = (byte) a(b, d);
                i -= 2;
                i2 += 2;
                i3++;
                z = true;
            } else {
                int i4 = b - 2;
                if (i != i4 || i2 != 0 || (d & 3) == 0 || z2) {
                    if (i == b + 4 && i2 == 2 && (d & 7) == 0 && !z3) {
                        bArr[i3] = (byte) c(b, d);
                        i -= 2;
                        i2 += 2;
                        i3++;
                        z3 = true;
                    } else if (i == i4 && i2 == 0 && (d & 7) == 4 && !z4) {
                        bArr[i3] = (byte) d(b, d);
                        i -= 2;
                        i2 += 2;
                        i3++;
                        z4 = true;
                    } else {
                        int[] a2 = a(i, b, i2, d, bArr, i3);
                        int i5 = a2[0];
                        int i6 = a2[1];
                        i3 = a2[2];
                        i = i5;
                        i2 = i6;
                    }
                    if (i < b && i2 >= d) {
                        break;
                    }
                } else {
                    bArr[i3] = (byte) b(b, d);
                    i -= 2;
                    i2 += 2;
                    i3++;
                    z2 = true;
                }
            }
            if (i < b) {
            }
        }
        if (i3 == this.c.f()) {
            return bArr;
        }
        throw C2967a.a();
    }

    private boolean a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.b.c(i2, i);
        return this.f10553a.b(i2, i);
    }

    private int a(int i, int i2) {
        int i3 = i - 1;
        int i4 = (a(i3, 0, i, i2) ? 1 : 0) << 1;
        if (a(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (a(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (a(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (a(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (a(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (a(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return a(3, i8, i, i2) ? i11 | 1 : i11;
    }

    private C3074y a(C3074y c3074y) {
        int e = this.c.e();
        int d = this.c.d();
        if (c3074y.b() == e) {
            int b = this.c.b();
            int a2 = this.c.a();
            int i = e / b;
            int i2 = d / a2;
            C3074y c3074y2 = new C3074y(i2 * a2, i * b);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * b;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * a2;
                    for (int i7 = 0; i7 < b; i7++) {
                        int i8 = ((b + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < a2; i10++) {
                            if (c3074y.b(((a2 + 2) * i5) + 1 + i10, i8)) {
                                c3074y2.c(i6 + i10, i9);
                            }
                        }
                    }
                }
            }
            return c3074y2;
        }
        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
    }

    private int b(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (a(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (a(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (a(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (a(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (a(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (a(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (a(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return a(i, i2, i3, i4) ? i15 | 1 : i15;
    }

    private int b(int i, int i2) {
        int i3 = (a(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (a(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (a(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (a(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (a(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (a(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (a(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return a(1, i9, i, i2) ? i10 | 1 : i10;
    }
}
