package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* compiled from: Code39Writer.java */
/* renamed from: com.huawei.hms.scankit.p.oc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3038oc extends AbstractC3057tc {
    @Override // com.huawei.hms.scankit.p.AbstractC3057tc, com.huawei.hms.scankit.p.Pb
    public C3074y a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<Jc, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC3057tc
    public boolean[] a(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            int i = length + 25;
            for (int i2 = 0; i2 < length; i2++) {
                int indexOf = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i2));
                if (indexOf >= 0) {
                    a(Q.f10592a[indexOf], iArr);
                    for (int i3 = 0; i3 < 9; i3++) {
                        i += iArr[i3];
                    }
                } else {
                    throw new IllegalArgumentException("Bad contents: error contents");
                }
            }
            boolean[] zArr = new boolean[i];
            a(148, iArr);
            int a2 = AbstractC3057tc.a(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int a3 = a2 + AbstractC3057tc.a(zArr, a2, iArr2, false);
            for (int i4 = 0; i4 < length; i4++) {
                a(Q.f10592a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i4))], iArr);
                int a4 = a3 + AbstractC3057tc.a(zArr, a3, iArr, true);
                a3 = a4 + AbstractC3057tc.a(zArr, a4, iArr2, false);
            }
            a(148, iArr);
            AbstractC3057tc.a(zArr, a3, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
    }

    private static void a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }
}
