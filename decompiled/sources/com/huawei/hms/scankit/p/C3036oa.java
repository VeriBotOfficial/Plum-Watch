package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C2967a;
import com.huawei.hms.scankit.aiscan.common.EnumC2970d;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Detector.java */
/* renamed from: com.huawei.hms.scankit.p.oa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3036oa {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f10674a = {0, 4, 1, 5};
    private static final int[] b = {6, 2, 7, 3};
    private static final int[] c = {8, 1, 1, 1, 1, 1, 1, 3};
    private static final int[] d = {7, 1, 1, 3, 1, 1, 1, 2, 1};
    private static boolean e = false;

    public static C3059ua a(C3066w c3066w, Map<EnumC2970d, ?> map, boolean z) throws C2967a {
        C3074y b2 = c3066w.b();
        a(false);
        List<com.huawei.hms.scankit.aiscan.common.z[]> a2 = a(z, b2);
        if (a2.isEmpty()) {
            b2 = b2.m8172clone();
            b2.e();
            a2 = a(z, b2);
            a(true);
        }
        return new C3059ua(b2, a2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r4 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r3.hasNext() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r4 = (com.huawei.hms.scankit.aiscan.common.z[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r7 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r2 = (int) java.lang.Math.max(r2, r7.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r4 = r4[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r2 = java.lang.Math.max(r2, (int) r4.c());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<com.huawei.hms.scankit.aiscan.common.z[]> a(boolean r8, com.huawei.hms.scankit.p.C3074y r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
            r3 = r2
        L8:
            r4 = r3
        L9:
            int r5 = r9.b()
            if (r2 >= r5) goto L79
            com.huawei.hms.scankit.aiscan.common.z[] r3 = a(r9, r2, r3)
            r5 = r3[r1]
            r6 = 1
            if (r5 != 0) goto L50
            r5 = 3
            r7 = r3[r5]
            if (r7 != 0) goto L50
            if (r4 != 0) goto L20
            goto L79
        L20:
            java.util.Iterator r3 = r0.iterator()
        L24:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r3.next()
            com.huawei.hms.scankit.aiscan.common.z[] r4 = (com.huawei.hms.scankit.aiscan.common.z[]) r4
            r7 = r4[r6]
            if (r7 == 0) goto L3e
            float r2 = (float) r2
            float r7 = r7.c()
            float r2 = java.lang.Math.max(r2, r7)
            int r2 = (int) r2
        L3e:
            r4 = r4[r5]
            if (r4 == 0) goto L24
            float r4 = r4.c()
            int r4 = (int) r4
            int r2 = java.lang.Math.max(r2, r4)
            goto L24
        L4c:
            int r2 = r2 + 5
            r3 = r1
            goto L8
        L50:
            r0.add(r3)
            if (r8 != 0) goto L56
            goto L79
        L56:
            r2 = 2
            r4 = r3[r2]
            if (r4 == 0) goto L67
            float r4 = r4.b()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.c()
            goto L75
        L67:
            r2 = 4
            r4 = r3[r2]
            float r4 = r4.b()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.c()
        L75:
            int r2 = (int) r2
            r3 = r4
            r4 = r6
            goto L9
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.C3036oa.a(boolean, com.huawei.hms.scankit.p.y):java.util.List");
    }

    private static com.huawei.hms.scankit.aiscan.common.z[] a(C3074y c3074y, int i, int i2) {
        int b2 = c3074y.b();
        int d2 = c3074y.d();
        com.huawei.hms.scankit.aiscan.common.z[] zVarArr = new com.huawei.hms.scankit.aiscan.common.z[8];
        int i3 = i;
        int i4 = i2;
        a(zVarArr, a(c3074y, b2, d2, i3, i4, c), f10674a);
        com.huawei.hms.scankit.aiscan.common.z zVar = zVarArr[4];
        if (zVar != null) {
            int b3 = (int) zVar.b();
            i3 = (int) zVarArr[4].c();
            i4 = b3;
        }
        a(zVarArr, a(c3074y, b2, d2, i3, i4, d), b);
        return zVarArr;
    }

    private static void a(com.huawei.hms.scankit.aiscan.common.z[] zVarArr, com.huawei.hms.scankit.aiscan.common.z[] zVarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            zVarArr[iArr[i]] = zVarArr2[i];
        }
    }

    private static com.huawei.hms.scankit.aiscan.common.z[] a(C3074y c3074y, int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        boolean z;
        int[] iArr2;
        com.huawei.hms.scankit.aiscan.common.z[] zVarArr = new com.huawei.hms.scankit.aiscan.common.z[4];
        int[] iArr3 = iArr;
        int[] iArr4 = new int[iArr3.length];
        int i6 = i3;
        while (true) {
            if (i6 >= i) {
                i5 = i6;
                z = false;
                break;
            }
            int[] a2 = a(c3074y, i4, i6, i2, false, iArr3, iArr4);
            if (a2 != null) {
                do {
                    i5 = i6;
                    iArr2 = a2;
                    if (i5 <= 0) {
                        break;
                    }
                    i6 = i5 - 1;
                    a2 = a(c3074y, i4, i6, i2, false, iArr, iArr4);
                } while (a2 != null);
                float f = i5;
                zVarArr[0] = new com.huawei.hms.scankit.aiscan.common.z(iArr2[0], f);
                zVarArr[1] = new com.huawei.hms.scankit.aiscan.common.z(iArr2[1], f);
                z = true;
            } else {
                i6 += 5;
                iArr3 = iArr;
            }
        }
        int i7 = i5 + 1;
        if (z) {
            int[] iArr5 = {(int) zVarArr[0].b(), (int) zVarArr[1].b()};
            int i8 = i7;
            int i9 = 0;
            while (i8 < i) {
                int[] a3 = a(c3074y, iArr5[0], i8, i2, false, iArr, iArr4);
                if (a3 != null && Math.abs(iArr5[0] - a3[0]) < 5 && Math.abs(iArr5[1] - a3[1]) < 5) {
                    iArr5 = a3;
                    i9 = 0;
                } else {
                    if (i9 > 25) {
                        break;
                    }
                    i9++;
                }
                i8++;
            }
            i7 = i8 - (i9 + 1);
            float f2 = i7;
            zVarArr[2] = new com.huawei.hms.scankit.aiscan.common.z(iArr5[0], f2);
            zVarArr[3] = new com.huawei.hms.scankit.aiscan.common.z(iArr5[1], f2);
        }
        if (i7 - i5 < 10) {
            Arrays.fill(zVarArr, (Object) null);
        }
        return zVarArr;
    }

    private static int[] a(C3074y c3074y, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (c3074y.b(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (c3074y.b(i, i2) != z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else {
                    if (a(iArr2, iArr, 0.8f) < 0.42f) {
                        return new int[]{i7, i};
                    }
                    i7 += iArr2[0] + iArr2[1];
                    int i8 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i6] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || a(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    private static float a(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f6 = iArr2[i4] * f3;
            float f7 = iArr[i4];
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    public static void a(boolean z) {
        e = z;
    }

    public static boolean a() {
        return e;
    }
}
