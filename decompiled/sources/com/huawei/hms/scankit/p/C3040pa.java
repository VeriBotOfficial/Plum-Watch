package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C2967a;

/* compiled from: ErrorCorrection.java */
/* renamed from: com.huawei.hms.scankit.p.pa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3040pa {

    /* renamed from: a, reason: collision with root package name */
    private final C3044qa f10677a = C3044qa.f10679a;

    public int a(int[] iArr, int i, int[] iArr2) throws C2967a {
        C3047ra c3047ra = new C3047ra(this.f10677a, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int a2 = c3047ra.a(this.f10677a.a(i2));
            iArr3[i - i2] = a2;
            if (a2 != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C3047ra a3 = this.f10677a.a();
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                int a4 = this.f10677a.a((iArr.length - 1) - i3);
                C3044qa c3044qa = this.f10677a;
                a3 = a3.b(new C3047ra(c3044qa, new int[]{c3044qa.d(0, a4), 1}));
            }
        }
        C3047ra[] a5 = a(this.f10677a.b(i, 1), new C3047ra(this.f10677a, iArr3), i);
        C3047ra c3047ra2 = a5[0];
        C3047ra c3047ra3 = a5[1];
        int[] a6 = a(c3047ra2);
        int[] a7 = a(c3047ra3, c3047ra2, a6);
        for (int i4 = 0; i4 < a6.length; i4++) {
            int length = (iArr.length - 1) - this.f10677a.c(a6[i4]);
            if (length < 0) {
                throw C2967a.a();
            }
            iArr[length] = this.f10677a.d(iArr[length], a7[i4]);
        }
        return a6.length;
    }

    private C3047ra[] a(C3047ra c3047ra, C3047ra c3047ra2, int i) throws C2967a {
        if (c3047ra.a() >= c3047ra2.a()) {
            c3047ra2 = c3047ra;
            c3047ra = c3047ra2;
        }
        C3047ra c = this.f10677a.c();
        C3047ra a2 = this.f10677a.a();
        while (true) {
            C3047ra c3047ra3 = a2;
            C3047ra c3047ra4 = c;
            c = c3047ra3;
            if (c3047ra.a() >= i / 2) {
                if (!c3047ra.b()) {
                    C3047ra c2 = this.f10677a.c();
                    int b = this.f10677a.b(c3047ra.b(c3047ra.a()));
                    while (c3047ra2.a() >= c3047ra.a() && !c3047ra2.b()) {
                        int a3 = c3047ra2.a() - c3047ra.a();
                        int c3 = this.f10677a.c(c3047ra2.b(c3047ra2.a()), b);
                        c2 = c2.a(this.f10677a.b(a3, c3));
                        c3047ra2 = c3047ra2.c(c3047ra.a(a3, c3));
                    }
                    a2 = c2.b(c).c(c3047ra4).c();
                    C3047ra c3047ra5 = c3047ra2;
                    c3047ra2 = c3047ra;
                    c3047ra = c3047ra5;
                } else {
                    throw C2967a.a();
                }
            } else {
                int b2 = c.b(0);
                if (b2 != 0) {
                    int b3 = this.f10677a.b(b2);
                    return new C3047ra[]{c.c(b3), c3047ra.c(b3)};
                }
                throw C2967a.a();
            }
        }
    }

    private int[] a(C3047ra c3047ra) throws C2967a {
        int a2 = c3047ra.a();
        int[] iArr = new int[a2];
        int i = 0;
        for (int i2 = 1; i2 < this.f10677a.b() && i < a2; i2++) {
            if (c3047ra.a(i2) == 0) {
                iArr[i] = this.f10677a.b(i2);
                i++;
            }
        }
        if (i == a2) {
            return iArr;
        }
        throw C2967a.a();
    }

    private int[] a(C3047ra c3047ra, C3047ra c3047ra2, int[] iArr) {
        int a2 = c3047ra2.a();
        int[] iArr2 = new int[a2];
        for (int i = 1; i <= a2; i++) {
            iArr2[a2 - i] = this.f10677a.c(i, c3047ra2.b(i));
        }
        C3047ra c3047ra3 = new C3047ra(this.f10677a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int b = this.f10677a.b(iArr[i2]);
            iArr3[i2] = this.f10677a.c(this.f10677a.d(0, c3047ra.a(b)), this.f10677a.b(c3047ra3.a(b)));
        }
        return iArr3;
    }
}
