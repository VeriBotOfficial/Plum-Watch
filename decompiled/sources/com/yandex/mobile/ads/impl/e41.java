package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class e41 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f15342a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object c = new Object();
    private static int[] d = new int[10];

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f15343a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int[] e;
        public final int f;
        public final float g;

        public a(int i, boolean z, int i2, int i3, int[] iArr, int i4, int i5, int i6, float f) {
            this.f15343a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = iArr;
            this.f = i4;
            this.g = f;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f15345a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final float g;
        public final boolean h;
        public final boolean i;
        public final int j;
        public final int k;
        public final int l;
        public final boolean m;

        public c(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f15345a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = f;
            this.h = z;
            this.i = z2;
            this.j = i7;
            this.k = i8;
            this.l = i9;
            this.m = z3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.yandex.mobile.ads.impl.e41.c b(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.e41.b(byte[], int, int):com.yandex.mobile.ads.impl.e41$c");
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f15344a;
        public final boolean b;

        public b(int i, int i2, boolean z) {
            this.f15344a = i2;
            this.b = z;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalStateException();
        }
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static a a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 2;
        bg1 bg1Var = new bg1(bArr, i + 2, i2);
        int i7 = 4;
        bg1Var.d(4);
        int b2 = bg1Var.b(3);
        bg1Var.f();
        int b3 = bg1Var.b(2);
        boolean c2 = bg1Var.c();
        int b4 = bg1Var.b(5);
        int i8 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (bg1Var.c()) {
                i8 |= 1 << i9;
            }
        }
        int i10 = 6;
        int[] iArr = new int[6];
        for (int i11 = 0; i11 < 6; i11++) {
            iArr[i11] = bg1Var.b(8);
        }
        int i12 = i8;
        int b5 = bg1Var.b(8);
        int i13 = 0;
        for (int i14 = 0; i14 < b2; i14++) {
            if (bg1Var.c()) {
                i13 += 89;
            }
            if (bg1Var.c()) {
                i13 += 8;
            }
        }
        bg1Var.d(i13);
        if (b2 > 0) {
            bg1Var.d((8 - b2) * 2);
        }
        bg1Var.e();
        int e = bg1Var.e();
        if (e == 3) {
            bg1Var.f();
        }
        int e2 = bg1Var.e();
        int e3 = bg1Var.e();
        if (bg1Var.c()) {
            int e4 = bg1Var.e();
            int e5 = bg1Var.e();
            int e6 = bg1Var.e();
            int e7 = bg1Var.e();
            e2 -= (e4 + e5) * ((e == 1 || e == 2) ? 2 : 1);
            e3 -= (e6 + e7) * (e == 1 ? 2 : 1);
        }
        bg1Var.e();
        bg1Var.e();
        int e8 = bg1Var.e();
        for (int i15 = bg1Var.c() ? 0 : b2; i15 <= b2; i15++) {
            bg1Var.e();
            bg1Var.e();
            bg1Var.e();
        }
        bg1Var.e();
        bg1Var.e();
        bg1Var.e();
        bg1Var.e();
        bg1Var.e();
        bg1Var.e();
        if (bg1Var.c() && bg1Var.c()) {
            int i16 = 0;
            while (i16 < i7) {
                int i17 = 0;
                while (i17 < i10) {
                    if (!bg1Var.c()) {
                        bg1Var.e();
                    } else {
                        int min = Math.min(64, 1 << ((i16 << 1) + 4));
                        if (i16 > 1) {
                            bg1Var.d();
                        }
                        for (int i18 = 0; i18 < min; i18++) {
                            bg1Var.d();
                        }
                    }
                    i17 += i16 == 3 ? 3 : 1;
                    i10 = 6;
                }
                i16++;
                i7 = 4;
                i10 = 6;
            }
        }
        bg1Var.d(2);
        if (bg1Var.c()) {
            bg1Var.d(8);
            bg1Var.e();
            bg1Var.e();
            bg1Var.f();
        }
        int e9 = bg1Var.e();
        int[] iArr2 = new int[0];
        int[] iArr3 = new int[0];
        int i19 = -1;
        int i20 = 0;
        int i21 = -1;
        while (i20 < e9) {
            if (i20 != 0 && bg1Var.c()) {
                i3 = i6;
                int i22 = i19 + i21;
                int e10 = (1 - ((bg1Var.c() ? 1 : 0) * 2)) * (bg1Var.e() + 1);
                i4 = e9;
                int i23 = i22 + 1;
                int[] iArr4 = iArr2;
                boolean[] zArr = new boolean[i23];
                for (int i24 = 0; i24 <= i22; i24++) {
                    if (!bg1Var.c()) {
                        zArr[i24] = bg1Var.c();
                    } else {
                        zArr[i24] = true;
                    }
                }
                int[] iArr5 = new int[i23];
                int[] iArr6 = new int[i23];
                int i25 = 0;
                for (int i26 = i21 - 1; i26 >= 0; i26--) {
                    int i27 = iArr3[i26] + e10;
                    if (i27 < 0 && zArr[i19 + i26]) {
                        iArr5[i25] = i27;
                        i25++;
                    }
                }
                if (e10 < 0 && zArr[i22]) {
                    iArr5[i25] = e10;
                    i25++;
                }
                int i28 = i25;
                i5 = e8;
                for (int i29 = 0; i29 < i19; i29++) {
                    int i30 = iArr4[i29] + e10;
                    if (i30 < 0 && zArr[i29]) {
                        iArr5[i28] = i30;
                        i28++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr5, i28);
                int i31 = 0;
                for (int i32 = i19 - 1; i32 >= 0; i32--) {
                    int i33 = iArr4[i32] + e10;
                    if (i33 > 0 && zArr[i32]) {
                        iArr6[i31] = i33;
                        i31++;
                    }
                }
                if (e10 > 0 && zArr[i22]) {
                    iArr6[i31] = e10;
                    i31++;
                }
                int i34 = i28;
                int i35 = i31;
                for (int i36 = 0; i36 < i21; i36++) {
                    int i37 = iArr3[i36] + e10;
                    if (i37 > 0 && zArr[i19 + i36]) {
                        iArr6[i35] = i37;
                        i35++;
                    }
                }
                iArr3 = Arrays.copyOf(iArr6, i35);
                i21 = i35;
                i19 = i34;
            } else {
                i3 = i6;
                i4 = e9;
                i5 = e8;
                int e11 = bg1Var.e();
                int e12 = bg1Var.e();
                int[] iArr7 = new int[e11];
                for (int i38 = 0; i38 < e11; i38++) {
                    iArr7[i38] = bg1Var.e() + 1;
                    bg1Var.f();
                }
                int[] iArr8 = new int[e12];
                for (int i39 = 0; i39 < e12; i39++) {
                    iArr8[i39] = bg1Var.e() + 1;
                    bg1Var.f();
                }
                i19 = e11;
                iArr3 = iArr8;
                iArr2 = iArr7;
                i21 = e12;
            }
            i20++;
            i6 = i3;
            e9 = i4;
            e8 = i5;
        }
        int i40 = i6;
        int i41 = e8;
        if (bg1Var.c()) {
            for (int i42 = 0; i42 < bg1Var.e(); i42++) {
                bg1Var.d(i41 + 5);
            }
        }
        bg1Var.d(i40);
        float f = 1.0f;
        if (bg1Var.c()) {
            if (bg1Var.c()) {
                int b6 = bg1Var.b(8);
                if (b6 == 255) {
                    int b7 = bg1Var.b(16);
                    int b8 = bg1Var.b(16);
                    if (b7 != 0 && b8 != 0) {
                        f = b7 / b8;
                    }
                } else {
                    float[] fArr = b;
                    if (b6 < 17) {
                        f = fArr[b6];
                    } else {
                        xr0.a("Unexpected aspect_ratio_idc value: ", b6, "NalUnitUtil");
                    }
                }
            }
            if (bg1Var.c()) {
                bg1Var.f();
            }
            if (bg1Var.c()) {
                bg1Var.d(4);
                if (bg1Var.c()) {
                    bg1Var.d(24);
                }
            }
            if (bg1Var.c()) {
                bg1Var.e();
                bg1Var.e();
            }
            bg1Var.f();
            if (bg1Var.c()) {
                e3 *= 2;
            }
        }
        return new a(b3, c2, b4, i12, iArr, b5, e2, e3, f);
    }

    public static int a(int i, byte[] bArr) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    if (iArr.length <= i4) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
