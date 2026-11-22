package com.huawei.hms.scankit.p;

/* compiled from: MaskUtil.java */
/* loaded from: classes14.dex */
final class Mc {
    static int a(Ic ic) {
        return a(ic, true) + a(ic, false);
    }

    static int b(Ic ic) {
        byte[][] a2 = ic.a();
        int c = ic.c();
        int b = ic.b();
        int i = 0;
        for (int i2 = 0; i2 < b - 1; i2++) {
            byte[] bArr = a2[i2];
            int i3 = 0;
            while (i3 < c - 1) {
                byte b2 = bArr[i3];
                int i4 = i3 + 1;
                if (b2 == bArr[i4]) {
                    byte[] bArr2 = a2[i2 + 1];
                    if (b2 == bArr2[i3] && b2 == bArr2[i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    static int c(Ic ic) {
        byte[][] a2 = ic.a();
        int c = ic.c();
        int b = ic.b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            for (int i3 = 0; i3 < c; i3++) {
                byte[] bArr = a2[i2];
                int i4 = i3 + 6;
                if (i4 < c && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (a(bArr, i3 - 4, i3) || a(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < b && a2[i2][i3] == 1 && a2[i2 + 1][i3] == 0 && a2[i2 + 2][i3] == 1 && a2[i2 + 3][i3] == 1 && a2[i2 + 4][i3] == 1 && a2[i2 + 5][i3] == 0 && a2[i5][i3] == 1 && (a(a2, i3, i2 - 4, i2) || a(a2, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    static int d(Ic ic) {
        byte[][] a2 = ic.a();
        int c = ic.c();
        int b = ic.b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            byte[] bArr = a2[i2];
            for (int i3 = 0; i3 < c; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int b2 = ic.b() * ic.c();
        return ((Math.abs((i * 2) - b2) * 10) / b2) * 10;
    }

    private static boolean a(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (max < bArr.length && i < bArr[0].length && bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean a(int r2, int r3, int r4) {
        /*
            java.lang.String r0 = "Invalid mask pattern: "
            r1 = 1
            switch(r2) {
                case 0: goto L2d;
                case 1: goto L2e;
                case 2: goto L2a;
                case 3: goto L26;
                case 4: goto L21;
                case 5: goto L1a;
                case 6: goto L12;
                case 7: goto L9;
                default: goto L6;
            }
        L6:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            goto L35
        L9:
            int r2 = r4 * r3
            int r2 = r2 % 3
            int r4 = r4 + r3
            r3 = r4 & 1
            int r2 = r2 + r3
            goto L18
        L12:
            int r4 = r4 * r3
            r2 = r4 & 1
            int r4 = r4 % 3
            int r2 = r2 + r4
        L18:
            r2 = r2 & r1
            goto L30
        L1a:
            int r4 = r4 * r3
            r2 = r4 & 1
            int r4 = r4 % 3
            int r2 = r2 + r4
            goto L30
        L21:
            int r4 = r4 / 2
            int r3 = r3 / 3
            goto L2d
        L26:
            int r4 = r4 + r3
            int r2 = r4 % 3
            goto L30
        L2a:
            int r2 = r3 % 3
            goto L30
        L2d:
            int r4 = r4 + r3
        L2e:
            r2 = r4 & 1
        L30:
            if (r2 != 0) goto L33
            return r1
        L33:
            r2 = 0
            return r2
        L35:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Mc.a(int, int, int):boolean");
    }

    private static int a(Ic ic, boolean z) {
        int b = z ? ic.b() : ic.c();
        int c = z ? ic.c() : ic.b();
        byte[][] a2 = ic.a();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            byte b2 = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < c; i4++) {
                byte b3 = z ? a2[i2][i4] : a2[i4][i2];
                if (b3 == b2) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += i3 - 2;
                    }
                    i3 = 1;
                    b2 = b3;
                }
            }
            if (i3 >= 5) {
                i += i3 - 2;
            }
        }
        return i;
    }
}
