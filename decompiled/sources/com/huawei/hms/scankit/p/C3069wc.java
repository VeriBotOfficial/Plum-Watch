package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C2967a;
import java.util.Map;

/* compiled from: UPCEWriter.java */
/* renamed from: com.huawei.hms.scankit.p.wc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3069wc extends AbstractC3065vc {
    @Override // com.huawei.hms.scankit.p.AbstractC3057tc, com.huawei.hms.scankit.p.Pb
    public C3074y a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<Jc, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_E) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC3057tc
    public boolean[] a(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + AbstractC2992da.b(C2996ea.b(str));
            } catch (C2967a e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!AbstractC2992da.a((CharSequence) str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (C2967a unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 8 digits long, but got " + length);
        }
        int digit = Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i = C2996ea.i[digit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int a2 = AbstractC3057tc.a(zArr, 0, AbstractC2992da.f10631a, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit2 = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit2 += 10;
            }
            a2 += AbstractC3057tc.a(zArr, a2, AbstractC2992da.e[digit2], false);
        }
        AbstractC3057tc.a(zArr, a2, AbstractC2992da.c, false);
        return zArr;
    }
}
