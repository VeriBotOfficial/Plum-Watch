package com.huawei.hms.scankit.p;

import java.lang.reflect.Array;

/* compiled from: PDF417CodewordDecoder.java */
/* renamed from: com.huawei.hms.scankit.p.sa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C3051sa {

    /* renamed from: a, reason: collision with root package name */
    private static final float[][] f10686a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, C3055ta.b.length, 8);

    static {
        int i;
        int i2 = 0;
        while (true) {
            int[] iArr = C3055ta.b;
            if (i2 >= iArr.length) {
                return;
            }
            int i3 = iArr[i2];
            int i4 = i3 & 1;
            int i5 = 0;
            while (i5 < 8) {
                float f = 0.0f;
                while (true) {
                    i = i3 & 1;
                    if (i == i4) {
                        f += 1.0f;
                        i3 >>= 1;
                    }
                }
                f10686a[i2][7 - i5] = f / 17.0f;
                i5++;
                i4 = i;
            }
            i2++;
        }
    }

    static int a(int[] iArr) {
        int d = d(e(iArr));
        return d != -1 ? d : c(iArr);
    }

    private static int b(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | i3;
            }
        }
        return (int) j;
    }

    private static int c(int[] iArr) {
        int a2 = com.huawei.hms.scankit.aiscan.common.n.a(iArr);
        float[] fArr = new float[8];
        if (a2 > 1) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = iArr[i] / a2;
            }
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f10686a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float[] fArr3 = fArr2[i3];
            float f2 = 0.0f;
            for (int i4 = 0; i4 < 8; i4++) {
                float f3 = fArr3[i4] - fArr[i4];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                i2 = C3055ta.b[i3];
                f = f2;
            }
            i3++;
        }
    }

    private static int d(int[] iArr) {
        int b = b(iArr);
        if (C3055ta.a(b) == -1) {
            return -1;
        }
        return b;
    }

    private static int[] e(int[] iArr) {
        float a2 = com.huawei.hms.scankit.aiscan.common.n.a(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            float f = (a2 / 34.0f) + ((i3 * a2) / 17.0f);
            int i4 = iArr[i2];
            if (i + i4 <= f) {
                i += i4;
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
