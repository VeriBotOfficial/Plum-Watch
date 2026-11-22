package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C2967a;
import com.huawei.hms.scankit.aiscan.common.EnumC2970d;
import java.util.Arrays;
import java.util.Map;

/* compiled from: ITFReader.java */
/* loaded from: classes14.dex */
public final class V extends Y {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f10607a = {6, 8, 10, 12, 14};
    private static final int[] b = {1, 1, 1, 1};
    private static final int[][] c = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};
    public static final int[][] d = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    private int e = -1;
    private int f = -1;

    private int[] b(C3070x c3070x) throws C2967a {
        int c2 = c(c3070x);
        while (true) {
            int[] c3 = c(c3070x, c2, b);
            int i = c3[1];
            int i2 = c3[0];
            this.e = (i - i2) / 4;
            if (a(c3070x, i2)) {
                return c3;
            }
            c2 = c3[2];
        }
    }

    private static int c(C3070x c3070x) throws C2967a {
        int d2 = c3070x.d();
        int b2 = c3070x.b(0);
        if (b2 != d2) {
            return b2;
        }
        throw C2967a.a();
    }

    @Override // com.huawei.hms.scankit.p.Y
    public com.huawei.hms.scankit.aiscan.common.x a(int i, C3070x c3070x, Map<EnumC2970d, ?> map) throws C2967a, C2967a {
        boolean z;
        int[] b2 = b(c3070x);
        int[] a2 = a(c3070x);
        StringBuilder sb = new StringBuilder(20);
        a(c3070x, b2[1], a2[0], sb);
        String sb2 = sb.toString();
        int[] iArr = f10607a;
        int length = sb2.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length2) {
                z = false;
                break;
            }
            int i4 = iArr[i2];
            if (length == i4) {
                z = true;
                break;
            }
            if (i4 > i3) {
                i3 = i4;
            }
            i2++;
        }
        if (!z && length > i3) {
            z = true;
        }
        if (!z) {
            throw C2967a.a();
        }
        float f = i;
        return new com.huawei.hms.scankit.aiscan.common.x(sb2, null, new com.huawei.hms.scankit.aiscan.common.z[]{new com.huawei.hms.scankit.aiscan.common.z(b2[0], f), new com.huawei.hms.scankit.aiscan.common.z(a2[1], f)}, BarcodeFormat.ITF);
    }

    private int[] c(C3070x c3070x, int i, int[] iArr) throws C2967a {
        int i2;
        int i3;
        int i4;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int d2 = c3070x.d();
        int i5 = 0;
        int i6 = i;
        int i7 = i6;
        boolean z = false;
        int i8 = 0;
        while (i6 < d2) {
            if (c3070x.a(i6) == z) {
                if (i8 == length - 1) {
                    int[] iArr3 = (int[]) iArr2.clone();
                    Arrays.sort(iArr3);
                    int i9 = iArr3[i5];
                    double d3 = (iArr3[1] + i9) * 0.5d;
                    i4 = 1;
                    int i10 = iArr3[2];
                    int i11 = iArr3[3];
                    int i12 = i5;
                    int i13 = i6;
                    if (((i10 + i11) * 0.5d) / d3 < 4.0d && (i11 * 1.0d) / i9 <= 3.0d) {
                        int[] iArr4 = new int[10];
                        Y.a(c3070x, i13, iArr4);
                        this.f = -1;
                        for (int i14 = i12; i14 < 10; i14++) {
                            int i15 = iArr4[i14];
                            if (i15 > this.f) {
                                this.f = i15;
                            }
                        }
                        return new int[]{i7, i13, iArr2[i12] + i7 + iArr2[1]};
                    }
                    i3 = i13;
                    i7 += iArr2[i12] + iArr2[1];
                    int i16 = i8 - 1;
                    i2 = i12;
                    System.arraycopy(iArr2, 2, iArr2, i2, i16);
                    iArr2[i16] = i2;
                    iArr2[i8] = i2;
                    i8--;
                } else {
                    i2 = i5;
                    i3 = i6;
                    i4 = 1;
                    i8++;
                }
                iArr2[i8] = i4;
                z = !z;
            } else if (i8 >= 0 && i8 < length) {
                iArr2[i8] = iArr2[i8] + 1;
                i2 = i5;
                i3 = i6;
            } else {
                throw C2967a.a();
            }
            i6 = i3 + 1;
            i5 = i2;
        }
        throw C2967a.a();
    }

    private int[] b(C3070x c3070x, int i, int[] iArr) throws C2967a {
        int i2;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int d2 = c3070x.d();
        int i3 = i;
        int i4 = i3;
        boolean z = false;
        int i5 = 0;
        while (i3 < d2) {
            if (c3070x.a(i3) == z) {
                if (i5 != length - 1) {
                    i2 = 1;
                    i5++;
                } else if (Math.min(iArr2[0], iArr2[1]) != 0 && Math.max(iArr2[0], iArr2[1]) != 0) {
                    float max = Math.max(iArr2[0], iArr2[1]) / Math.min(iArr2[0], iArr2[1]);
                    int i6 = iArr2[0];
                    int i7 = iArr2[1];
                    float f = (iArr2[2] * 2.0f) / (i6 + i7);
                    i2 = 1;
                    if (max <= 3.0f && f > 1.5d && f < 4.0f) {
                        return new int[]{i4, i3, i6 + i4 + i7};
                    }
                    i4 += i6 + i7;
                    int i8 = i5 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i5] = 0;
                    i5--;
                } else {
                    throw C2967a.a();
                }
                iArr2[i5] = i2;
                z = !z;
            } else if (i5 >= 0 && i5 < length) {
                iArr2[i5] = iArr2[i5] + 1;
            } else {
                throw C2967a.a();
            }
            i3++;
        }
        throw C2967a.a();
    }

    private static void a(C3070x c3070x, int i, int i2, StringBuilder sb) throws C2967a {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            Y.a(c3070x, i, iArr);
            int i3 = -1;
            int i4 = 10000;
            for (int i5 = 0; i5 < 10; i5++) {
                int i6 = iArr[i5];
                if (i3 <= i6) {
                    i3 = i6;
                }
                if (i4 >= i6) {
                    i4 = i6;
                }
            }
            if (i3 / i4 <= 8) {
                for (int i7 = 0; i7 < 5; i7++) {
                    int i8 = i7 * 2;
                    iArr2[i7] = iArr[i8];
                    iArr3[i7] = iArr[i8 + 1];
                }
                sb.append((char) (b(iArr2) + 48));
                sb.append((char) (b(iArr3) + 48));
                for (int i9 = 0; i9 < 10; i9++) {
                    i += iArr[i9];
                }
            } else {
                throw C2967a.a();
            }
        }
        if (i != i2) {
            throw C2967a.a();
        }
    }

    private static int b(int[] iArr) throws C2967a {
        int length = d.length;
        float f = 0.3f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float a2 = Y.a(iArr, d[i2], 0.75f);
            if (a2 < f) {
                i = i2;
                f = a2;
            } else if (Math.abs(a2 - f) < 1.0E-7d) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw C2967a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.huawei.hms.scankit.p.C3070x r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.e
            int r0 = r0 * 10
            int r1 = r5.f
            double r1 = (double) r1
            r3 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r1 = r1 * r3
            int r1 = (int) r1
            if (r0 >= r1) goto Le
            r0 = r1
        Le:
            r1 = 1
            int r7 = r7 - r1
        L10:
            if (r0 <= 0) goto L20
            if (r7 < 0) goto L20
            boolean r2 = r6.a(r7)
            if (r2 == 0) goto L1b
            goto L20
        L1b:
            int r0 = r0 + (-1)
            int r7 = r7 + (-1)
            goto L10
        L20:
            if (r0 == 0) goto L24
            r6 = 0
            return r6
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.V.a(com.huawei.hms.scankit.p.x, int):boolean");
    }

    private int[] a(C3070x c3070x) throws C2967a {
        try {
            c3070x.g();
            int c2 = c(c3070x);
            while (true) {
                int[] b2 = b(c3070x, c2, c[0]);
                if (a(c3070x, b2[0])) {
                    int i = b2[0];
                    b2[0] = c3070x.d() - b2[1];
                    b2[1] = c3070x.d() - i;
                    return b2;
                }
                c2 = b2[2];
            }
        } finally {
            c3070x.g();
        }
    }
}
