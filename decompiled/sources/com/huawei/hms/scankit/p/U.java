package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C2967a;

/* compiled from: EAN8Reader.java */
/* loaded from: classes14.dex */
public final class U extends AbstractC2992da {
    private final int[] h = new int[4];

    private int b(C3070x c3070x, int[] iArr, int i, int[][] iArr2) throws C2967a {
        Y.a(c3070x, i, iArr);
        int length = iArr2.length;
        float f = 0.43f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float a2 = Y.a(iArr, iArr2[i3], 0.7f);
            if (a2 < f) {
                i2 = i3;
                f = a2;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw C2967a.a();
    }

    @Override // com.huawei.hms.scankit.p.AbstractC2992da
    public boolean a(int i, int i2, C3070x c3070x) {
        return c3070x.a(i2, ((int) ((i2 - i) * 1.5d)) + i2, false, true);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC2992da
    protected int a(C3070x c3070x, int[] iArr, StringBuilder sb) throws C2967a {
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d = c3070x.d();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < d; i2++) {
            sb.append((char) (b(c3070x, iArr2, i, AbstractC2992da.d) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = AbstractC2992da.a(c3070x, i, true, AbstractC2992da.b)[1];
        for (int i5 = 0; i5 < 4 && i4 < d; i5++) {
            sb.append((char) (b(c3070x, iArr2, i4, AbstractC2992da.d) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    @Override // com.huawei.hms.scankit.p.AbstractC2992da
    BarcodeFormat a() {
        return BarcodeFormat.EAN_8;
    }

    @Override // com.huawei.hms.scankit.p.AbstractC2992da
    boolean a(int[] iArr, int[] iArr2) throws C2967a {
        int i = iArr[1];
        int i2 = iArr[0];
        double d = (i - i2) / 3.0d;
        int i3 = iArr2[1];
        int i4 = iArr2[0];
        return ((double) Math.abs(((int) Math.round(((double) (i3 - i2)) / (((double) ((i3 - i4) + (i - i2))) / 6.0d))) + (-67))) <= 6.7d && Math.abs(1.0d - (d / (((double) (i3 - i4)) / 3.0d))) < 0.2d;
    }
}
