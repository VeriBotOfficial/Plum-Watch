package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C2967a;
import java.util.Map;

/* compiled from: EAN13Writer.java */
/* renamed from: com.huawei.hms.scankit.p.qc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3046qc extends AbstractC3065vc {
    @Override // com.huawei.hms.scankit.p.AbstractC3057tc, com.huawei.hms.scankit.p.Pb
    public C3074y a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<Jc, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC3057tc
    public boolean[] a(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + AbstractC2992da.b(str);
            } catch (C2967a e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 13) {
            try {
                if (!AbstractC2992da.a((CharSequence) str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (C2967a unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got " + length);
        }
        int i = T.h[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int a2 = AbstractC3057tc.a(zArr, 0, AbstractC2992da.f10631a, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            a2 += AbstractC3057tc.a(zArr, a2, AbstractC2992da.e[digit], false);
        }
        int a3 = a2 + AbstractC3057tc.a(zArr, a2, AbstractC2992da.b, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            a3 += AbstractC3057tc.a(zArr, a3, AbstractC2992da.d[Character.digit(str.charAt(i3), 10)], true);
        }
        AbstractC3057tc.a(zArr, a3, AbstractC2992da.f10631a, true);
        return zArr;
    }
}
