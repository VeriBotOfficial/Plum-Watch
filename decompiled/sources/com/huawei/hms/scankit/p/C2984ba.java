package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C2967a;

/* compiled from: UPCEANExtension5Support.java */
/* renamed from: com.huawei.hms.scankit.p.ba, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C2984ba {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f10627a = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    private final int[] b = new int[4];
    private final StringBuilder c = new StringBuilder();

    C2984ba() {
    }

    com.huawei.hms.scankit.aiscan.common.x a(int i, C3070x c3070x, int[] iArr) throws C2967a {
        StringBuilder sb = this.c;
        sb.setLength(0);
        float f = i;
        return new com.huawei.hms.scankit.aiscan.common.x(sb.toString(), null, new com.huawei.hms.scankit.aiscan.common.z[]{new com.huawei.hms.scankit.aiscan.common.z((iArr[0] + iArr[1]) / 2.0f, f), new com.huawei.hms.scankit.aiscan.common.z(a(c3070x, iArr, sb), f)}, BarcodeFormat.UPC_EAN_EXTENSION);
    }

    private int a(C3070x c3070x, int[] iArr, StringBuilder sb) throws C2967a {
        int[] iArr2 = this.b;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d = c3070x.d();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < d; i3++) {
            int a2 = AbstractC2992da.a(c3070x, iArr2, i, AbstractC2992da.e);
            sb.append((char) ((a2 % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (a2 >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = c3070x.c(c3070x.b(i));
            }
        }
        if (sb.length() == 5) {
            if (a(sb.toString()) == a(i2)) {
                return i;
            }
            throw C2967a.a();
        }
        throw C2967a.a();
    }

    private static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    private static int a(int i) throws C2967a {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f10627a[i2]) {
                return i2;
            }
        }
        throw C2967a.a();
    }
}
