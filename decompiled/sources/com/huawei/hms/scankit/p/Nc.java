package com.huawei.hms.scankit.p;

import com.alibaba.fastjson.asm.Opcodes;
import com.huawei.hms.hmsscankit.WriterException;

/* compiled from: MatrixUtil.java */
/* loaded from: classes14.dex */
final class Nc {

    /* renamed from: a, reason: collision with root package name */
    private static final int[][] f10584a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, Opcodes.IF_ACMPNE}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static void a(Ic ic) {
        ic.a((byte) -1);
    }

    static void b(Ya ya, Ic ic) throws WriterException {
        if (ya.e() < 7) {
            return;
        }
        C3070x c3070x = new C3070x();
        a(ya, c3070x);
        int i = 17;
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                boolean a2 = c3070x.a(i);
                i--;
                ic.a(i2, (ic.b() - 11) + i3, a2);
                ic.a((ic.b() - 11) + i3, i2, a2);
            }
        }
    }

    private static boolean b(int i) {
        return i == -1;
    }

    private static void c(int i, int i2, Ic ic) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f10584a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                ic.a(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static void d(Ic ic) {
        int i = 8;
        while (i < ic.c() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (b(ic.a(i, 6))) {
                ic.a(i, 6, i3);
            }
            if (b(ic.a(6, i))) {
                ic.a(6, i, i3);
            }
            i = i2;
        }
    }

    static void a(C3070x c3070x, Pa pa, Ya ya, int i, Ic ic) throws WriterException {
        a(ic);
        a(ya, ic);
        a(pa, i, ic);
        b(ya, ic);
        a(c3070x, i, ic);
    }

    private static void c(Ic ic) throws WriterException {
        int length = f10584a[0].length;
        c(0, 0, ic);
        c(ic.c() - length, 0, ic);
        c(0, ic.c() - length, ic);
        a(0, 7, ic);
        a(ic.c() - 8, 7, ic);
        a(0, ic.c() - 8, ic);
        d(7, 0, ic);
        d(ic.b() - 8, 0, ic);
        d(7, ic.b() - 7, ic);
    }

    static void a(Ya ya, Ic ic) throws WriterException {
        c(ic);
        b(ic);
        c(ya, ic);
        d(ic);
    }

    private static void b(Ic ic) throws WriterException {
        if (ic.a(8, ic.b() - 8) != 0) {
            ic.a(8, ic.b() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    private static void d(int i, int i2, Ic ic) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (b(ic.a(i, i4))) {
                ic.a(i, i4, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    private static void b(int i, int i2, Ic ic) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                ic.a(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    static void a(Pa pa, int i, Ic ic) throws WriterException {
        C3070x c3070x = new C3070x();
        a(pa, i, c3070x);
        for (int i2 = 0; i2 < c3070x.d(); i2++) {
            boolean a2 = c3070x.a((c3070x.d() - 1) - i2);
            int[] iArr = d[i2];
            ic.a(iArr[0], iArr[1], a2);
            if (i2 < 8) {
                ic.a((ic.c() - i2) - 1, 8, a2);
            } else {
                ic.a(8, (ic.b() - 7) + (i2 - 8), a2);
            }
        }
    }

    private static void c(Ya ya, Ic ic) {
        if (ya.e() < 2) {
            return;
        }
        int e = ya.e() - 1;
        int[][] iArr = c;
        if (e < iArr.length) {
            int[] iArr2 = iArr[e];
            for (int i : iArr2) {
                if (i >= 0) {
                    for (int i2 : iArr2) {
                        if (i2 >= 0 && b(ic.a(i2, i))) {
                            b(i2 - 2, i - 2, ic);
                        }
                    }
                }
            }
        }
    }

    static void a(C3070x c3070x, int i, Ic ic) throws WriterException {
        boolean z;
        int c2 = ic.c() - 1;
        int b2 = ic.b() - 1;
        int i2 = 0;
        int i3 = -1;
        while (c2 > 0) {
            if (c2 == 6) {
                c2--;
            }
            while (b2 >= 0 && b2 < ic.b()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = c2 - i4;
                    if (b(ic.a(i5, b2))) {
                        if (i2 < c3070x.d()) {
                            z = c3070x.a(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && Mc.a(i, i5, b2)) {
                            z = !z;
                        }
                        ic.a(i5, b2, z);
                    }
                }
                b2 += i3;
            }
            i3 = -i3;
            b2 += i3;
            c2 -= 2;
        }
        if (i2 != c3070x.d()) {
            throw new WriterException("Not all bits consumed: " + i2 + '/' + c3070x.d());
        }
    }

    static int a(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    static int a(int i, int i2) {
        if (i2 != 0) {
            int a2 = a(i2);
            int i3 = i << (a2 - 1);
            while (a(i3) >= a2) {
                i3 ^= i2 << (a(i3) - a2);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    static void a(Pa pa, int i, C3070x c3070x) throws WriterException {
        if (Oc.a(i)) {
            int a2 = (pa.a() << 3) | i;
            c3070x.a(a2, 5);
            c3070x.a(a(a2, 1335), 10);
            C3070x c3070x2 = new C3070x();
            c3070x2.a(21522, 15);
            c3070x.b(c3070x2);
            if (c3070x.d() != 15) {
                throw new WriterException("should not happen but we got: " + c3070x.d());
            }
            return;
        }
        throw new WriterException("Invalid mask pattern");
    }

    static void a(Ya ya, C3070x c3070x) throws WriterException {
        c3070x.a(ya.e(), 6);
        c3070x.a(a(ya.e(), 7973), 12);
        if (c3070x.d() != 18) {
            throw new WriterException("should not happen but we got: " + c3070x.d());
        }
    }

    private static void a(int i, int i2, Ic ic) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (b(ic.a(i4, i2))) {
                ic.a(i4, i2, 0);
            } else {
                throw new WriterException();
            }
        }
    }
}
