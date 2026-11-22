package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* compiled from: QRCodeWriter.java */
/* loaded from: classes14.dex */
public final class Gc implements Pb {
    @Override // com.huawei.hms.scankit.p.Pb
    public C3074y a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<Jc, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + barcodeFormat);
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        Pa pa = Pa.L;
        Boolean bool = false;
        if (map != null) {
            if (map.containsKey(Jc.ERROR_CORRECTION)) {
                pa = Pa.valueOf(map.get(Jc.ERROR_CORRECTION).toString());
            }
            r1 = map.containsKey(Jc.MARGIN) ? Integer.parseInt(map.get(Jc.MARGIN).toString()) : 4;
            if (map.containsKey(Jc.LOGO)) {
                bool = (Boolean) map.get(Jc.LOGO);
            }
        }
        return a(Lc.a(str, pa, map), i, i2, r1, bool.booleanValue());
    }

    private static C3074y a(Oc oc, int i, int i2, int i3, boolean z) {
        int max;
        int max2;
        int min;
        Ic a2 = oc.a();
        if (a2 != null) {
            int c = a2.c();
            int b = a2.b();
            if (z) {
                max = Math.max(i, c);
                max2 = Math.max(i2, b);
                int i4 = i3 * 2;
                min = Math.min((max - i4) / c, (max2 - i4) / b);
            } else {
                int i5 = i3 * 2;
                int i6 = c + i5;
                int i7 = i5 + b;
                max = Math.max(i, i6);
                max2 = Math.max(i2, i7);
                min = Math.min(max / i6, max2 / i7);
            }
            int i8 = (max - (c * min)) / 2;
            int i9 = (max2 - (b * min)) / 2;
            C3074y c3074y = new C3074y(max, max2);
            int i10 = 0;
            while (i10 < b) {
                int i11 = 0;
                int i12 = i8;
                while (i11 < c) {
                    if (a2.a(i11, i10) == 1) {
                        c3074y.a(i12, i9, min, min);
                    }
                    i11++;
                    i12 += min;
                }
                i10++;
                i9 += min;
            }
            return c3074y;
        }
        throw new IllegalStateException();
    }
}
