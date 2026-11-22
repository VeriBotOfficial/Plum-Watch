package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C2967a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AlignmentPatternFinder.java */
/* renamed from: com.huawei.hms.scankit.p.za, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C3079za {

    /* renamed from: a, reason: collision with root package name */
    private final C3074y f10704a;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final float g;
    private final com.huawei.hms.scankit.aiscan.common.A i;
    private final List<C3075ya> b = new ArrayList(5);
    private final int[] h = new int[3];

    C3079za(C3074y c3074y, int i, int i2, int i3, int i4, float f, com.huawei.hms.scankit.aiscan.common.A a2) {
        this.f10704a = c3074y;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = f;
        this.i = a2;
    }

    C3075ya a() throws C2967a {
        C3075ya a2;
        int i = this.c;
        int i2 = this.f;
        int i3 = this.e + i;
        int i4 = this.d + (i2 / 2);
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            int[] iArr = {0, 0, 0};
            int i7 = i;
            while (i7 < i3 && !this.f10704a.b(i7, i6)) {
                i7++;
            }
            C3075ya a3 = a(i6, i7, i3, iArr);
            if (a3 != null) {
                return a3;
            }
            if (a(iArr) && (a2 = a(iArr, i6, i3)) != null) {
                return a2;
            }
        }
        if (this.b.isEmpty()) {
            throw C2967a.a();
        }
        return this.b.get(0);
    }

    private C3075ya a(int i, int i2, int i3, int[] iArr) {
        C3075ya a2;
        int i4 = 0;
        while (i2 < i3) {
            if (!this.f10704a.b(i2, i)) {
                if (i4 == 1) {
                    i4++;
                }
                iArr[i4] = iArr[i4] + 1;
            } else if (i4 == 1) {
                iArr[1] = iArr[1] + 1;
            } else if (i4 == 2) {
                if (a(iArr) && (a2 = a(iArr, i, i2)) != null) {
                    return a2;
                }
                iArr[0] = iArr[2];
                iArr[1] = 1;
                iArr[2] = 0;
                i4 = 1;
            } else {
                i4++;
                iArr[i4] = iArr[i4] + 1;
            }
            i2++;
        }
        return null;
    }

    private static float a(int[] iArr, int i) {
        return (i - iArr[2]) - (iArr[1] / 2.0f);
    }

    private boolean a(int[] iArr) {
        float f = this.g;
        float f2 = (3.0f * f) / 4.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    private float a(int i, int i2, int i3, int i4) {
        int i5;
        C3074y c3074y = this.f10704a;
        int b = c3074y.b();
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i6 = i;
        while (i6 >= 0 && c3074y.b(i2, i6)) {
            int i7 = iArr[1];
            if (i7 > i3) {
                break;
            }
            iArr[1] = i7 + 1;
            i6--;
        }
        if (i6 >= 0 && iArr[1] <= i3) {
            while (i6 >= 0 && !c3074y.b(i2, i6)) {
                int i8 = iArr[0];
                if (i8 > i3) {
                    break;
                }
                iArr[0] = i8 + 1;
                i6--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i9 = i + 1;
            while (i9 < b && c3074y.b(i2, i9)) {
                int i10 = iArr[1];
                if (i10 > i3) {
                    break;
                }
                iArr[1] = i10 + 1;
                i9++;
            }
            if (i9 != b && iArr[1] <= i3) {
                while (i9 < b && !c3074y.b(i2, i9)) {
                    int i11 = iArr[2];
                    if (i11 > i3) {
                        break;
                    }
                    iArr[2] = i11 + 1;
                    i9++;
                }
                int i12 = iArr[2];
                if (i12 <= i3 && (i5 = iArr[0] + iArr[1] + i12) < i4 * 3 && i5 * 3 > i4 && a(iArr)) {
                    return a(iArr, i9);
                }
            }
        }
        return Float.NaN;
    }

    private C3075ya a(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float a2 = a(iArr, i2);
        float a3 = a(i, (int) a2, iArr[1] * 3, i3);
        if (Float.isNaN(a3)) {
            return null;
        }
        float f = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (C3075ya c3075ya : this.b) {
            if (c3075ya.a(f, a3, a2)) {
                return c3075ya.b(a3, a2, f);
            }
        }
        C3075ya c3075ya2 = new C3075ya(a2, a3, f);
        this.b.add(c3075ya2);
        com.huawei.hms.scankit.aiscan.common.A a4 = this.i;
        if (a4 == null) {
            return null;
        }
        a4.a(c3075ya2);
        return null;
    }
}
