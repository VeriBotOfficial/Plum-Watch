package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* compiled from: AztecWriter.java */
/* loaded from: classes14.dex */
public final class Qb implements Pb {
    @Override // com.huawei.hms.scankit.p.Pb
    public C3074y a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<Jc, ?> map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int i3 = 4;
        if (map != null) {
            if (map.containsKey(Jc.CHARACTER_SET)) {
                charset = Charset.forName(map.get(Jc.CHARACTER_SET).toString());
            }
            r2 = map.containsKey(Jc.ERROR_CORRECTION) ? Integer.parseInt(map.get(Jc.ERROR_CORRECTION).toString()) : 33;
            r3 = map.containsKey(Jc.AZTEC_LAYERS) ? Integer.parseInt(map.get(Jc.AZTEC_LAYERS).toString()) : 0;
            if (map.containsKey(Jc.MARGIN)) {
                i3 = Integer.parseInt(map.get(Jc.MARGIN).toString());
            }
        }
        return a(str, barcodeFormat, i, i2, charset, r2, r3, i3);
    }

    private static C3074y a(String str, BarcodeFormat barcodeFormat, int i, int i2, Charset charset, int i3, int i4, int i5) {
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return a(Tb.a(str.getBytes(charset), i3, i4), i, i2, i5);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got " + barcodeFormat);
    }

    private static C3074y a(Rb rb, int i, int i2, int i3) {
        C3074y a2 = rb.a();
        if (a2 != null) {
            int d = a2.d();
            int b = a2.b();
            int i4 = i3 * 2;
            int i5 = d + i4;
            int i6 = i4 + b;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (d * min)) / 2;
            int i8 = (max2 - (b * min)) / 2;
            C3074y c3074y = new C3074y(max, max2);
            int i9 = 0;
            while (i9 < b) {
                int i10 = 0;
                int i11 = i7;
                while (i10 < d) {
                    if (a2.b(i10, i9)) {
                        c3074y.a(i11, i8, min, min);
                    }
                    i10++;
                    i11 += min;
                }
                i9++;
                i8 += min;
            }
            return c3074y;
        }
        throw new IllegalStateException();
    }
}
