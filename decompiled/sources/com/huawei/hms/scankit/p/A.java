package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C2967a;

/* compiled from: GlobalHistogramBinarizer.java */
/* loaded from: classes14.dex */
public class A extends AbstractC3062v {
    private static final byte[] b = new byte[0];
    private static int c = -1;
    private byte[] d;
    private final int[] e;

    public A(com.huawei.hms.scankit.aiscan.common.m mVar) {
        super(mVar);
        this.d = b;
        this.e = new int[32];
    }

    @Override // com.huawei.hms.scankit.p.AbstractC3062v
    public C3070x a(int i, C3070x c3070x) throws C2967a {
        com.huawei.hms.scankit.aiscan.common.m c2 = c();
        int c3 = c2.c();
        if (c3070x == null || c3070x.d() < c3) {
            c3070x = new C3070x(c3);
        } else {
            c3070x.a();
        }
        a(c3);
        byte[] a2 = c2.a(i, this.d);
        int[] iArr = this.e;
        for (int i2 = 0; i2 < c3; i2++) {
            int i3 = (a2[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int a3 = a(iArr, false);
        if (c3 < 3) {
            for (int i4 = 0; i4 < c3; i4++) {
                if ((a2[i4] & 255) < a3) {
                    c3070x.d(i4);
                }
            }
        } else {
            int i5 = a2[0] & 255;
            int i6 = a2[1] & 255;
            int i7 = 1;
            while (i7 < c3 - 1) {
                int i8 = i7 + 1;
                int i9 = a2[i8] & 255;
                if ((((i6 * 4) - i5) - i9) / 2 < a3) {
                    c3070x.d(i7);
                }
                i5 = i6;
                i7 = i8;
                i6 = i9;
            }
        }
        return c3070x;
    }

    @Override // com.huawei.hms.scankit.p.AbstractC3062v
    public C3074y a() throws C2967a {
        com.huawei.hms.scankit.aiscan.common.m c2 = c();
        int c3 = c2.c();
        int a2 = c2.a();
        a(c3);
        int[] iArr = this.e;
        for (int i = 1; i < 5; i++) {
            byte[] a3 = c2.a((a2 * i) / 5, this.d);
            int i2 = (c3 * 4) / 5;
            for (int i3 = c3 / 5; i3 < i2; i3++) {
                int i4 = (a3[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int a4 = a(iArr, true);
        byte[] b2 = c2.b();
        int i5 = (c3 + 31) / 32;
        int[] iArr2 = new int[i5 * a2];
        for (int i6 = 0; i6 < a2; i6++) {
            int i7 = i6 * c3;
            for (int i8 = 0; i8 < c3; i8++) {
                if ((b2[i7 + i8] & 255) < a4) {
                    int i9 = (i6 * i5) + (i8 >> 5);
                    iArr2[i9] = iArr2[i9] | (1 << (i8 & 31));
                }
            }
        }
        return new C3074y(c3, a2, i5, iArr2);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC3062v
    public AbstractC3062v a(com.huawei.hms.scankit.aiscan.common.m mVar) {
        return new A(mVar);
    }

    private void a(int i) {
        if (this.d.length < i) {
            this.d = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.e[i2] = 0;
        }
    }

    private static int a(int[] iArr, boolean z) throws C2967a {
        int length = iArr.length;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > i) {
                i3 = i4;
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i3;
            int i10 = iArr[i8] * i9 * i9;
            if (i10 > i7) {
                i6 = i8;
                i7 = i10;
            }
        }
        if (i3 <= i6) {
            int i11 = i3;
            i3 = i6;
            i6 = i11;
        }
        int i12 = i3 - i6;
        if (i12 <= length / 16) {
            throw C2967a.a();
        }
        int i13 = i3 - 1;
        int i14 = -1;
        int i15 = i13;
        while (i13 > i6) {
            int i16 = i13 - i6;
            int i17 = i16 * i16 * (i3 - i13) * (i2 - iArr[i13]);
            if (i17 > i14) {
                i15 = i13;
                i14 = i17;
            }
            i13--;
        }
        if (z) {
            if (i15 < 10 && i14 < 100000 && i12 < 10) {
                z2 = true;
            }
            _a.o = z2;
        }
        return i15 << 3;
    }
}
