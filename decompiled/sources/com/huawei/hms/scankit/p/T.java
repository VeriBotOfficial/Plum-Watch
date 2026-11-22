package com.huawei.hms.scankit.p;

import com.autonavi.aps.amapapi.config.Const;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C2967a;

/* compiled from: EAN13Reader.java */
/* loaded from: classes14.dex */
public final class T extends AbstractC2992da {
    public static final int[] h = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    private String j = "";
    private final int[] i = new int[4];

    @Override // com.huawei.hms.scankit.p.AbstractC2992da
    boolean a(int i, int i2, C3070x c3070x) {
        return c3070x.a(i2, (i2 - i) + i2, false, false);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC2992da
    protected int a(C3070x c3070x, int[] iArr, StringBuilder sb) throws C2967a {
        int[] iArr2 = this.i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d = c3070x.d();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < d; i3++) {
            int a2 = AbstractC2992da.a(c3070x, iArr2, i, AbstractC2992da.e);
            sb.append((char) ((a2 % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (a2 >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        a(sb, i2);
        this.j = sb.substring(0, 1);
        int i5 = AbstractC2992da.a(c3070x, i, true, AbstractC2992da.b)[1];
        for (int i6 = 0; i6 < 6 && i5 < d; i6++) {
            sb.append((char) (AbstractC2992da.a(c3070x, iArr2, i5, AbstractC2992da.d) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        if (a(sb)) {
            return i5;
        }
        throw C2967a.a();
    }

    @Override // com.huawei.hms.scankit.p.AbstractC2992da
    BarcodeFormat a() {
        return BarcodeFormat.EAN_13;
    }

    private static void a(StringBuilder sb, int i) throws C2967a {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == h[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw C2967a.a();
    }

    private static boolean a(StringBuilder sb) {
        int charAt = sb.charAt(sb.length() - 1) - '0';
        int i = 0;
        for (int i2 = 0; i2 < sb.length() - 1; i2++) {
            i += i2 % 2 == 0 ? sb.charAt(i2) - '0' : (sb.charAt(i2) - '0') * 3;
        }
        return (i + charAt) % 10 == 0;
    }

    @Override // com.huawei.hms.scankit.p.AbstractC2992da
    boolean a(int[] iArr, int[] iArr2) throws C2967a {
        int i = iArr2[1] - iArr2[0];
        int i2 = iArr[1];
        int i3 = iArr[0];
        int round = (int) Math.round((r1 - i3) / ((i + (i2 - i3)) / 6.0d));
        return this.j.equals("0") ? ((double) Math.abs(round + (-95))) <= 18.05d || ((double) Math.abs(round + Const.I_DEF_CGI_SIG)) <= 21.47d : ((double) Math.abs(round + (-95))) <= 18.05d;
    }
}
