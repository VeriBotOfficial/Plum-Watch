package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C2967a;

/* compiled from: UPCEANExtension2Support.java */
/* renamed from: com.huawei.hms.scankit.p.aa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C2980aa {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f10623a = new int[4];
    private final StringBuilder b = new StringBuilder();

    C2980aa() {
    }

    com.huawei.hms.scankit.aiscan.common.x a(int i, C3070x c3070x, int[] iArr) throws C2967a {
        StringBuilder sb = this.b;
        sb.setLength(0);
        float f = i;
        return new com.huawei.hms.scankit.aiscan.common.x(sb.toString(), null, new com.huawei.hms.scankit.aiscan.common.z[]{new com.huawei.hms.scankit.aiscan.common.z((iArr[0] + iArr[1]) / 2.0f, f), new com.huawei.hms.scankit.aiscan.common.z(a(c3070x, iArr, sb), f)}, BarcodeFormat.UPC_EAN_EXTENSION);
    }

    private int a(C3070x c3070x, int[] iArr, StringBuilder sb) throws C2967a {
        int[] iArr2 = this.f10623a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d = c3070x.d();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < d; i3++) {
            int a2 = AbstractC2992da.a(c3070x, iArr2, i, AbstractC2992da.e);
            sb.append((char) ((a2 % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (a2 >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = c3070x.c(c3070x.b(i));
            }
        }
        if (sb.length() == 2) {
            try {
                if (Integer.parseInt(sb.toString()) % 4 == i2) {
                    return i;
                }
                throw C2967a.a();
            } catch (NumberFormatException unused) {
                throw C2967a.a();
            }
        }
        throw C2967a.a();
    }
}
