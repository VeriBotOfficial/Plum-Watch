package com.huawei.hms.scankit.p;

import java.util.Locale;

/* compiled from: Encoder.java */
/* loaded from: classes14.dex */
public final class Tb {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f10602a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int a(int i, boolean z) {
        return ((z ? 88 : 112) + (i * 16)) * i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rb a(byte[] bArr, int i, int i2) {
        C3070x c3070x;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        C3070x a2 = new Ub(bArr).a();
        int d = ((a2.d() * i) / 100) + 11;
        int d2 = a2.d() + d;
        int i8 = 4;
        int i9 = 1;
        if (i2 == 0) {
            C3070x c3070x2 = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 <= 32) {
                boolean z2 = i10 <= 3 ? i9 : 0;
                int i12 = z2 != 0 ? i10 + 1 : i10;
                int a3 = a(i12, z2);
                if (d2 <= a3) {
                    if (c3070x2 == null || i11 != f10602a[i12]) {
                        int i13 = f10602a[i12];
                        i11 = i13;
                        c3070x2 = a(a2, i13);
                    }
                    int i14 = a3 - (a3 % i11);
                    if ((z2 == 0 || c3070x2.d() <= i11 * 64) && c3070x2.d() + d <= i14) {
                        c3070x = c3070x2;
                        i3 = i11;
                        z = z2;
                        i4 = i12;
                        i5 = a3;
                    }
                }
                i10++;
                i9 = i9;
                i8 = 4;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        z = i2 < 0;
        i4 = Math.abs(i2);
        if (i4 > (z ? 4 : 32)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Illegal value %s for layers", Integer.valueOf(i2)));
        }
        i5 = a(i4, z);
        i3 = f10602a[i4];
        int i15 = i5 - (i5 % i3);
        c3070x = a(a2, i3);
        if (c3070x.d() + d > i15) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z && c3070x.d() > i3 * 64) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        C3070x b = b(c3070x, i5, i3);
        int d3 = c3070x != null ? c3070x.d() / i3 : 0;
        C3070x a4 = a(z, i4, d3);
        int i16 = (z ? 11 : 14) + (i4 * 4);
        int[] iArr = new int[i16];
        int i17 = 2;
        if (z) {
            for (int i18 = 0; i18 < i16; i18++) {
                iArr[i18] = i18;
            }
            i6 = i16;
        } else {
            int i19 = i16 / 2;
            i6 = i16 + 1 + (((i19 - 1) / 15) * 2);
            int i20 = i6 / 2;
            for (int i21 = 0; i21 < i19; i21++) {
                iArr[(i19 - i21) - 1] = (i20 - r15) - 1;
                iArr[i19 + i21] = (i21 / 15) + i21 + i20 + i9;
            }
        }
        C3074y c3074y = new C3074y(i6);
        int i22 = 0;
        int i23 = 0;
        while (i22 < i4) {
            int i24 = ((i4 - i22) * i8) + (z ? 9 : 12);
            for (int i25 = 0; i25 < i24; i25++) {
                int i26 = i25 * 2;
                int i27 = 0;
                while (i27 < i17) {
                    int i28 = i9;
                    if (b.a(i23 + i26 + i27)) {
                        int i29 = i22 * 2;
                        i7 = i17;
                        c3074y.c(iArr[i29 + i27], iArr[i29 + i25]);
                    } else {
                        i7 = i17;
                    }
                    if (b.a((i24 * 2) + i23 + i26 + i27)) {
                        int i30 = i22 * 2;
                        c3074y.c(iArr[i30 + i25], iArr[((i16 - 1) - i30) - i27]);
                    }
                    if (b.a((i24 * 4) + i23 + i26 + i27)) {
                        int i31 = (i16 - 1) - (i22 * 2);
                        c3074y.c(iArr[i31 - i27], iArr[i31 - i25]);
                    }
                    if (b.a((i24 * 6) + i23 + i26 + i27)) {
                        int i32 = i22 * 2;
                        c3074y.c(iArr[((i16 - 1) - i32) - i25], iArr[i32 + i27]);
                    }
                    i27++;
                    i17 = i7;
                    i9 = i28;
                }
            }
            i23 += i24 * 8;
            i22++;
            i8 = 4;
        }
        a(c3074y, z, i6, a4);
        if (z) {
            a(c3074y, i6 / 2, 5);
        } else {
            int i33 = i6 / 2;
            a(c3074y, i33, 7);
            int i34 = 0;
            int i35 = 0;
            while (i34 < (i16 / 2) - 1) {
                for (int i36 = i33 & 1; i36 < i6; i36 += 2) {
                    int i37 = i33 - i35;
                    c3074y.c(i37, i36);
                    int i38 = i33 + i35;
                    c3074y.c(i38, i36);
                    c3074y.c(i36, i37);
                    c3074y.c(i36, i38);
                }
                i34 += 15;
                i35 += 16;
            }
        }
        Rb rb = new Rb();
        rb.a(z);
        rb.c(i6);
        rb.b(i4);
        rb.a(d3);
        rb.a(c3074y);
        return rb;
    }

    private static C3070x b(C3070x c3070x, int i, int i2) {
        int d = c3070x.d() / i2;
        com.huawei.hms.scankit.aiscan.common.v vVar = new com.huawei.hms.scankit.aiscan.common.v(a(i2));
        int i3 = i / i2;
        int[] a2 = a(c3070x, i2, i3);
        vVar.a(a2, i3 - d);
        C3070x c3070x2 = new C3070x();
        c3070x2.a(0, i % i2);
        for (int i4 : a2) {
            c3070x2.a(i4, i2);
        }
        return c3070x2;
    }

    private static void a(C3074y c3074y, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    c3074y.c(i5, i4);
                    c3074y.c(i5, i6);
                    c3074y.c(i4, i5);
                    c3074y.c(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        c3074y.c(i7, i7);
        int i8 = i7 + 1;
        c3074y.c(i8, i7);
        c3074y.c(i7, i8);
        int i9 = i + i2;
        c3074y.c(i9, i7);
        c3074y.c(i9, i8);
        c3074y.c(i9, i9 - 1);
    }

    static C3070x a(boolean z, int i, int i2) {
        C3070x c3070x = new C3070x();
        if (z) {
            c3070x.a(i - 1, 2);
            c3070x.a(i2 - 1, 6);
            return b(c3070x, 28, 4);
        }
        c3070x.a(i - 1, 5);
        c3070x.a(i2 - 1, 11);
        return b(c3070x, 40, 4);
    }

    private static void a(C3074y c3074y, boolean z, int i, C3070x c3070x) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (c3070x.a(i3)) {
                    c3074y.c(i4, i2 - 5);
                }
                if (c3070x.a(i3 + 7)) {
                    c3074y.c(i2 + 5, i4);
                }
                if (c3070x.a(20 - i3)) {
                    c3074y.c(i4, i2 + 5);
                }
                if (c3070x.a(27 - i3)) {
                    c3074y.c(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (c3070x.a(i3)) {
                c3074y.c(i5, i2 - 7);
            }
            if (c3070x.a(i3 + 10)) {
                c3074y.c(i2 + 7, i5);
            }
            if (c3070x.a(29 - i3)) {
                c3074y.c(i5, i2 + 7);
            }
            if (c3070x.a(39 - i3)) {
                c3074y.c(i2 - 7, i5);
            }
            i3++;
        }
    }

    private static int[] a(C3070x c3070x, int i, int i2) {
        int[] iArr = new int[i2];
        int d = c3070x.d() / i;
        for (int i3 = 0; i3 < d; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= c3070x.a((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    private static com.huawei.hms.scankit.aiscan.common.h a(int i) {
        if (i == 4) {
            return com.huawei.hms.scankit.aiscan.common.h.d;
        }
        if (i == 6) {
            return com.huawei.hms.scankit.aiscan.common.h.c;
        }
        if (i == 8) {
            return com.huawei.hms.scankit.aiscan.common.h.g;
        }
        if (i == 10) {
            return com.huawei.hms.scankit.aiscan.common.h.b;
        }
        if (i == 12) {
            return com.huawei.hms.scankit.aiscan.common.h.f10517a;
        }
        throw new IllegalArgumentException("Unsupported word size " + i);
    }

    static C3070x a(C3070x c3070x, int i) {
        C3070x c3070x2 = new C3070x();
        int d = c3070x.d();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < d) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= d || c3070x.a(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                c3070x2.a(i7, i);
            } else if (i7 == 0) {
                c3070x2.a(i4 | 1, i);
            } else {
                c3070x2.a(i4, i);
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return c3070x2;
    }
}
