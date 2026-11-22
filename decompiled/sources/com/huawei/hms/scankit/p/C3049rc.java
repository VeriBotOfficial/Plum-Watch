package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C2967a;
import java.util.Map;

/* compiled from: EAN8Writer.java */
/* renamed from: com.huawei.hms.scankit.p.rc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3049rc extends AbstractC3065vc {
    @Override // com.huawei.hms.scankit.p.AbstractC3057tc, com.huawei.hms.scankit.p.Pb
    public C3074y a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<Jc, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC3057tc
    public boolean[] a(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + AbstractC2992da.b(str);
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
        boolean[] zArr = new boolean[67];
        int a2 = AbstractC3057tc.a(zArr, 0, AbstractC2992da.f10631a, true);
        for (int i = 0; i <= 3; i++) {
            a2 += AbstractC3057tc.a(zArr, a2, AbstractC2992da.d[Character.digit(str.charAt(i), 10)], false);
        }
        int a3 = a2 + AbstractC3057tc.a(zArr, a2, AbstractC2992da.b, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            a3 += AbstractC3057tc.a(zArr, a3, AbstractC2992da.d[Character.digit(str.charAt(i2), 10)], true);
        }
        AbstractC3057tc.a(zArr, a3, AbstractC2992da.f10631a, true);
        return zArr;
    }
}
