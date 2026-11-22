package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C2967a;

/* compiled from: UPCEReader.java */
/* renamed from: com.huawei.hms.scankit.p.ea, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C2996ea extends AbstractC2992da {
    private static final int[] h = {1, 1, 1, 1, 1, 1};
    public static final int[][] i = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    private final int[] j = new int[4];

    private int b(C3070x c3070x, int[] iArr, int i2, int[][] iArr2) throws C2967a {
        Y.a(c3070x, i2, iArr);
        int length = iArr2.length;
        float f = 0.45f;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            float a2 = Y.a(iArr, iArr2[i4], 0.7f);
            if (a2 < f) {
                i3 = i4;
                f = a2;
            }
        }
        if (i3 >= 0) {
            return i3;
        }
        throw C2967a.a();
    }

    @Override // com.huawei.hms.scankit.p.AbstractC2992da
    public boolean a(int i2, int i3, C3070x c3070x) {
        return c3070x.a(i3, (i3 - i2) + i3, false, true);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC2992da
    protected int a(C3070x c3070x, int[] iArr, StringBuilder sb) throws C2967a {
        int i2;
        char c;
        int[] iArr2 = this.j;
        int i3 = 0;
        iArr2[0] = 0;
        int i4 = 1;
        iArr2[1] = 0;
        char c2 = 2;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d = c3070x.d();
        int i5 = iArr[1];
        float f = 10000.0f;
        int i6 = 0;
        int i7 = 0;
        float f2 = 0.0f;
        while (i6 < 6 && i5 < d) {
            int b = b(c3070x, iArr2, i5, AbstractC2992da.e);
            int i8 = i3;
            sb.append((char) ((b % 10) + 48));
            float f3 = 0.0f;
            int i9 = i8;
            while (true) {
                i2 = i4;
                c = c2;
                if (i9 >= AbstractC2992da.e[b].length) {
                    break;
                }
                f3 += r4[i9];
                i9++;
                c2 = c;
                i4 = i2;
            }
            float f4 = (((iArr2[i8] + iArr2[i2]) + iArr2[c]) + iArr2[3]) / f3;
            if (f4 > f2) {
                f2 = f4;
            }
            if (f4 < f) {
                f = f4;
            }
            int length = iArr2.length;
            for (int i10 = i8; i10 < length; i10++) {
                i5 += iArr2[i10];
            }
            if (b >= 10) {
                i7 |= i2 << (5 - i6);
            }
            i6++;
            i3 = i8;
            c2 = c;
            i4 = i2;
        }
        if (f2 / f > 2.89d) {
            throw C2967a.a();
        }
        a(sb, i7);
        return i5;
    }

    public static String b(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    @Override // com.huawei.hms.scankit.p.AbstractC2992da
    protected int[] a(C3070x c3070x, int i2) throws C2967a {
        return AbstractC2992da.a(c3070x, i2, true, h);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC2992da
    protected boolean a(String str) throws C2967a {
        return super.a(b(str));
    }

    private static void a(StringBuilder sb, int i2) throws C2967a {
        for (int i3 = 0; i3 <= 1; i3++) {
            for (int i4 = 0; i4 < 10; i4++) {
                if (i2 == i[i3][i4]) {
                    sb.insert(0, (char) (i3 + 48));
                    sb.append((char) (i4 + 48));
                    return;
                }
            }
        }
        throw C2967a.a();
    }

    @Override // com.huawei.hms.scankit.p.AbstractC2992da
    BarcodeFormat a() {
        return BarcodeFormat.UPC_E;
    }

    @Override // com.huawei.hms.scankit.p.AbstractC2992da
    boolean a(int[] iArr, int[] iArr2) throws C2967a {
        int i2 = iArr[1];
        int i3 = iArr[0];
        double d = (i2 - i3) / 3.0d;
        int i4 = iArr2[1];
        int i5 = iArr2[0];
        return ((double) Math.abs(((int) Math.round(((double) (i4 - i3)) / (((double) ((i4 - i5) + (i2 - i3))) / 9.0d))) + (-51))) <= 10.200000000000001d && Math.abs(1.0d - (d / (((double) (i4 - i5)) / 6.0d))) < 0.2d;
    }
}
