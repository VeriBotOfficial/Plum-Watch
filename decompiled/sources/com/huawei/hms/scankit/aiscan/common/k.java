package com.huawei.hms.scankit.aiscan.common;

import com.huawei.hms.scankit.p.C3066w;
import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;

/* compiled from: ImageResize.java */
/* loaded from: classes14.dex */
public class k {
    public static int a(int i, int i2, int i3) {
        return i >= i2 ? i2 : i <= i3 ? i3 : i;
    }

    public static C3066w a(C3066w c3066w) {
        int e = c3066w.e();
        int c = c3066w.c();
        byte[] d = c3066w.d();
        byte[] bArr = new byte[e * c];
        for (int i = 0; i < c; i++) {
            for (int i2 = 0; i2 < e; i2++) {
                bArr[(((i2 * c) + c) - i) - 1] = d[(i * e) + i2];
            }
        }
        return new C3066w(new com.huawei.hms.scankit.p.B(new r(bArr, c, e, 0, 0, c, e, false)));
    }

    public static C3066w a(C3066w c3066w, float f) {
        if (f == 1.0f) {
            return c3066w;
        }
        int c = c3066w.c();
        int e = c3066w.e();
        int i = (int) (e / f);
        int i2 = (int) (c / f);
        byte[] d = c3066w.d();
        int i3 = i * i2;
        byte[] bArr = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        while (i5 < i3) {
            double a2 = a(i5 % i, i - 1, i4) * f;
            double a3 = a(i5 / i, i2 - 1, i4) * f;
            double floor = Math.floor(a2);
            int i6 = i5;
            double floor2 = Math.floor(a3);
            double d2 = a2 - floor;
            double d3 = a3 - floor2;
            int i7 = c;
            int a4 = a((int) floor, e - 1, 0);
            int a5 = a((int) floor2, i7 - 1, 0);
            int i8 = a5 * e;
            double d4 = 1.0d - d2;
            double d5 = 1.0d - d3;
            double d6 = (d[i8 + a4] & 255) * d4 * d5;
            int i9 = a4 + 1;
            int i10 = a5 + 1;
            bArr[i6] = (byte) (((int) (d6 + ((d[i8 + a(i9, r14, 0)] & 255) * d2 * d5) + ((r18[(a(i10, r8, 0) * r17) + a4] & 255) * d4 * d3) + ((r18[(a(i10, r8, 0) * r17) + a(i9, r14, 0)] & 255) * d2 * d3))) & 255);
            i5 = i6 + 1;
            i4 = 0;
            c = i7;
            e = e;
            d = d;
        }
        return new C3066w(new com.huawei.hms.scankit.p.B(new r(bArr, i, i2, 0, 0, i, i2, false)));
    }

    public static C3066w a(boolean z, C3066w c3066w, float f) {
        if (f == 1.0f) {
            return c3066w;
        }
        int c = c3066w.c();
        int e = c3066w.e();
        int i = (int) (e / f);
        int i2 = (int) (c / f);
        return new C3066w(new com.huawei.hms.scankit.p.B(new r(LoadOpencvJNIUtil.imageResize(c3066w.d(), c, e, i2, i), i, i2, 0, 0, i, i2, false)));
    }
}
