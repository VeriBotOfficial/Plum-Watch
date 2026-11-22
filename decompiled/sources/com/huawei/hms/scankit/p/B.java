package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C2967a;

/* compiled from: HybridBinarizer.java */
/* loaded from: classes14.dex */
public final class B extends A {
    private static int f = 3;
    private static int g = 0;
    private static int h = 0;
    private static int i = 0;
    private static int j = 24;
    private C3074y k;

    static {
        int i2 = 1 << f;
        g = i2;
        h = i2 - 1;
        i = i2 * 5;
    }

    public B(com.huawei.hms.scankit.aiscan.common.m mVar) {
        super(mVar);
        a(_a.i);
    }

    private static int a(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    private void a(boolean z) {
        if (z) {
            f = 2;
            int i2 = 1 << 2;
            g = i2;
            h = i2 - 1;
            i = i2 * 5;
            return;
        }
        f = 3;
        int i3 = 1 << 3;
        g = i3;
        h = i3 - 1;
        i = i3 * 5;
    }

    @Override // com.huawei.hms.scankit.p.A, com.huawei.hms.scankit.p.AbstractC3062v
    public C3074y a() throws C2967a {
        C3074y c3074y = this.k;
        if (c3074y != null) {
            return c3074y;
        }
        com.huawei.hms.scankit.aiscan.common.m c = c();
        int c2 = c.c();
        int a2 = c.a();
        int i2 = i;
        if (c2 >= i2 && a2 >= i2) {
            byte[] b = c.b();
            int i3 = f;
            int i4 = c2 >> i3;
            int i5 = h;
            if ((c2 & i5) != 0) {
                i4++;
            }
            int i6 = a2 >> i3;
            if ((i5 & a2) != 0) {
                i6++;
            }
            int i7 = i6;
            this.k = a(b, i4, i7, c2, a2, a(b, i4, i7, c2, a2));
        } else {
            this.k = super.a();
        }
        return this.k;
    }

    @Override // com.huawei.hms.scankit.p.A, com.huawei.hms.scankit.p.AbstractC3062v
    public AbstractC3062v a(com.huawei.hms.scankit.aiscan.common.m mVar) {
        return new B(mVar);
    }

    private static C3074y a(byte[] bArr, int i2, int i3, int i4, int i5, int[][] iArr) {
        int i6;
        int i7;
        int i8;
        int[] iArr2 = new int[i2 * i3];
        for (int i9 = 0; i9 < i3; i9++) {
            int a2 = a(i9, 2, i3 - 3);
            for (int i10 = 0; i10 < i2; i10++) {
                int a3 = a(i10, 2, i2 - 3);
                int[] iArr3 = iArr[a2 + 2];
                int i11 = a3 + 2;
                int i12 = iArr3[i11];
                if (a2 == 2 && a3 == 2) {
                    i8 = 0;
                    i7 = 0;
                } else {
                    if (a2 == 2) {
                        i6 = 0;
                        i7 = iArr3[a3 - 3];
                        i8 = 0;
                    } else if (a3 == 2) {
                        i8 = iArr[a2 - 3][i11];
                        i7 = 0;
                    } else {
                        int[] iArr4 = iArr[a2 - 3];
                        int i13 = a3 - 3;
                        i6 = iArr4[i13];
                        int i14 = iArr4[i11];
                        i7 = iArr3[i13];
                        i8 = i14;
                    }
                    iArr2[(i9 * i2) + i10] = (((i12 + i6) - i8) - i7) / 25;
                }
                i6 = i7;
                iArr2[(i9 * i2) + i10] = (((i12 + i6) - i8) - i7) / 25;
            }
        }
        return new C3074y(i4, i5, (i4 + 31) / 32, a(bArr, iArr2, i2, i3, i4, i5));
    }

    private static int[] a(byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = (i4 + 31) / 32;
        int i8 = i7 * i5;
        int[] iArr2 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr2[i9] = 0;
        }
        int i10 = g;
        for (int i11 = 0; i11 < i5; i11++) {
            int i12 = i11 / i10;
            for (int i13 = 0; i13 < i4; i13++) {
                if ((bArr[(i11 * i4) + i13] & 255) <= iArr[(i12 * i2) + (i13 / i10)] && (i6 = (i11 * i7) + (i13 / 32)) < i8) {
                    iArr2[i6] = iArr2[i6] | (1 << (i13 & 31));
                }
            }
        }
        return iArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r5 < r14) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int[][] a(byte[] r20, int r21, int r22, int r23, int r24) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            int r3 = com.huawei.hms.scankit.p.B.g
            int r4 = r24 - r3
            int r3 = r2 - r3
            r5 = 2
            int[] r6 = new int[r5]
            r7 = 1
            r6[r7] = r0
            r8 = 0
            r6[r8] = r1
            java.lang.Class r9 = java.lang.Integer.TYPE
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r9, r6)
            int[][] r6 = (int[][]) r6
            int[] r9 = new int[r5]
            r9[r7] = r0
            r9[r8] = r1
            java.lang.Class r10 = java.lang.Integer.TYPE
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r10, r9)
            int[][] r9 = (int[][]) r9
            r10 = r8
        L2c:
            if (r10 >= r1) goto La7
            int r11 = com.huawei.hms.scankit.p.B.f
            int r11 = r10 << r11
            if (r11 <= r4) goto L35
            r11 = r4
        L35:
            r12 = r8
            r13 = r12
        L37:
            if (r12 >= r0) goto L9f
            int r14 = com.huawei.hms.scankit.p.B.f
            int r14 = r12 << r14
            if (r14 <= r3) goto L40
            r14 = r3
        L40:
            r15 = r20
            int[] r14 = a(r14, r11, r2, r15)
            r16 = r14[r8]
            r24 = r5
            r5 = r14[r7]
            r14 = r14[r24]
            int r17 = com.huawei.hms.scankit.p.B.f
            int r17 = r17 * 2
            int r16 = r16 >> r17
            int r14 = r14 - r5
            int r7 = com.huawei.hms.scankit.p.B.j
            if (r14 > r7) goto L77
            int r16 = r5 / 2
            if (r10 <= 0) goto L77
            if (r12 <= 0) goto L77
            int r7 = r10 + (-1)
            r7 = r9[r7]
            r14 = r7[r12]
            r18 = r9[r10]
            int r19 = r12 + (-1)
            r18 = r18[r19]
            int r18 = r18 * 2
            int r14 = r14 + r18
            r7 = r7[r19]
            int r14 = r14 + r7
            int r14 = r14 / 4
            if (r5 >= r14) goto L77
            goto L79
        L77:
            r14 = r16
        L79:
            int r13 = r13 + r14
            r5 = r9[r10]
            r5[r12] = r14
            if (r10 != 0) goto L87
            if (r12 != 0) goto L87
            r5 = r6[r10]
            r5[r12] = r14
            goto L99
        L87:
            if (r10 != 0) goto L8e
            r5 = r6[r10]
            r5[r12] = r13
            goto L99
        L8e:
            r5 = r6[r10]
            int r7 = r10 + (-1)
            r7 = r6[r7]
            r7 = r7[r12]
            int r7 = r7 + r13
            r5[r12] = r7
        L99:
            int r12 = r12 + 1
            r5 = r24
            r7 = 1
            goto L37
        L9f:
            r15 = r20
            r24 = r5
            int r10 = r10 + 1
            r7 = 1
            goto L2c
        La7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.B.a(byte[], int, int, int, int):int[][]");
    }

    private static int[] a(int i2, int i3, int i4, byte[] bArr) {
        int i5 = (i3 * i4) + i2;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 255;
        while (i6 < g) {
            for (int i10 = 0; i10 < g; i10++) {
                int i11 = bArr[i5 + i10] & 255;
                i7 += i11;
                if (i11 < i9) {
                    i9 = i11;
                }
                if (i11 > i8) {
                    i8 = i11;
                }
            }
            if (i8 - i9 > j) {
                while (true) {
                    i6++;
                    i5 += i4;
                    if (i6 < g) {
                        for (int i12 = 0; i12 < g; i12++) {
                            i7 += bArr[i5 + i12] & 255;
                        }
                    }
                }
            }
            i6++;
            i5 += i4;
        }
        return new int[]{i7, i9, i8};
    }
}
