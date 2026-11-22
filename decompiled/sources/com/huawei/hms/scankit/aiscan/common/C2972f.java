package com.huawei.hms.scankit.aiscan.common;

import com.huawei.hms.scankit.p.C3074y;
import com.huawei.hms.scankit.p._a;

/* compiled from: DefaultGridSampler.java */
/* renamed from: com.huawei.hms.scankit.aiscan.common.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C2972f extends j {
    @Override // com.huawei.hms.scankit.aiscan.common.j
    public C3074y a(C3074y c3074y, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws C2967a {
        return a(c3074y, i, i2, q.a(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16), false);
    }

    public C3074y b(C3074y c3074y, int i, int i2, q qVar) throws C2967a {
        if (i <= 0 || i2 <= 0) {
            throw C2967a.a();
        }
        C3074y c3074y2 = new C3074y(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = i4 + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = (i5 / 2) + 0.5f;
                fArr[i5 + 1] = f;
            }
            if (_a.k && _a.h) {
                qVar.b(fArr);
            } else {
                qVar.a(fArr);
            }
            int d = c3074y.d();
            int b = c3074y.b();
            for (int i6 = 0; i6 < i3; i6 += 2) {
                try {
                    int i7 = (int) fArr[i6];
                    int i8 = (int) fArr[i6 + 1];
                    if (i7 >= -1 && i7 <= d && i8 >= -1 && i8 <= b) {
                        if (c3074y.b(i7, i8)) {
                            c3074y2.c(i6 / 2, i4);
                        }
                    }
                    c3074y2.c(i6 / 2, i4);
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw C2967a.a();
                }
            }
        }
        return c3074y2;
    }

    @Override // com.huawei.hms.scankit.aiscan.common.j
    public C3074y a(C3074y c3074y, int i, int i2, q qVar, boolean z) throws C2967a {
        if ((_a.i && z) || ((!_a.i && !z) || _a.p)) {
            return b(c3074y, i, i2, qVar);
        }
        return a(c3074y, i, i2, qVar);
    }

    public C3074y a(C3074y c3074y, int i, int i2, q qVar) throws C2967a {
        if (i > 0 && i2 > 0) {
            C3074y c3074y2 = new C3074y(i, i2);
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                int i5 = i3;
                while (i5 < i) {
                    float f = i5;
                    float f2 = (f - 0.2f) + 0.5f;
                    float f3 = i4;
                    float f4 = f3 + 0.5f;
                    float f5 = f + 0.2f + 0.5f;
                    float f6 = f + 0.5f;
                    float[] fArr = new float[10];
                    fArr[i3] = f2;
                    fArr[1] = f4;
                    fArr[2] = f5;
                    fArr[3] = f4;
                    fArr[4] = f6;
                    fArr[5] = (f3 - 0.2f) + 0.5f;
                    fArr[6] = f6;
                    fArr[7] = f3 + 0.2f + 0.5f;
                    fArr[8] = f6;
                    fArr[9] = f4;
                    if (_a.k && _a.h) {
                        qVar.b(fArr);
                    } else {
                        qVar.a(fArr);
                    }
                    int d = c3074y.d();
                    int b = c3074y.b();
                    int i6 = i3;
                    int i7 = i6;
                    while (i6 < 5) {
                        int i8 = i6 * 2;
                        try {
                            int i9 = (int) fArr[i8];
                            int i10 = (int) fArr[i8 + 1];
                            if (i9 >= -1 && i9 <= d && i10 >= -1 && i10 <= b) {
                                if (c3074y.b(i9, i10)) {
                                    i7++;
                                }
                                i6++;
                            }
                            i6++;
                        } catch (ArrayIndexOutOfBoundsException unused) {
                            throw C2967a.a();
                        }
                    }
                    if (i7 >= 3) {
                        c3074y2.c(i5, i4);
                    }
                    i5++;
                    i3 = 0;
                }
                i4++;
                i3 = 0;
            }
            return c3074y2;
        }
        throw C2967a.a();
    }
}
