package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: PDF417Writer.java */
/* renamed from: com.huawei.hms.scankit.p.xc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3073xc implements Pb {
    @Override // com.huawei.hms.scankit.p.Pb
    public C3074y a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<Jc, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got " + barcodeFormat);
        }
        Cc cc = new Cc();
        if (map != null) {
            if (map.containsKey(Jc.PDF417_COMPACT)) {
                cc.a(Boolean.valueOf(map.get(Jc.PDF417_COMPACT).toString()).booleanValue());
            }
            if (map.containsKey(Jc.PDF417_COMPACTION)) {
                cc.a(Ac.valueOf(map.get(Jc.PDF417_COMPACTION).toString()));
            }
            if (map.containsKey(Jc.PDF417_DIMENSIONS)) {
                Bc bc = (Bc) map.get(Jc.PDF417_DIMENSIONS);
                cc.a(bc.a(), bc.c(), bc.b(), bc.d());
            }
            r9 = map.containsKey(Jc.MARGIN) ? Integer.parseInt(map.get(Jc.MARGIN).toString()) : 30;
            r0 = map.containsKey(Jc.ERROR_CORRECTION) ? Integer.parseInt(map.get(Jc.ERROR_CORRECTION).toString()) : 2;
            if (map.containsKey(Jc.CHARACTER_SET)) {
                cc.a(Charset.forName(map.get(Jc.CHARACTER_SET).toString()));
            }
        }
        return a(cc, str, r0, i, i2, r9);
    }

    private static C3074y a(Cc cc, String str, int i, int i2, int i3, int i4) throws WriterException {
        cc.a(str, i);
        byte[][] a2 = cc.a().a(1, 4);
        int length = i2 / a2[0].length;
        int length2 = i3 / a2.length;
        if (length >= length2) {
            length = length2;
        }
        if (length > 1) {
            return a(cc.a().a(length, length * 4), i4);
        }
        return a(a2, i4);
    }

    private static C3074y a(byte[][] bArr, int i) {
        int i2 = i * 2;
        C3074y c3074y = new C3074y(bArr[0].length + i2, bArr.length + i2);
        c3074y.a();
        int b = (c3074y.b() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    c3074y.c(i4 + i, b);
                }
            }
            i3++;
            b--;
        }
        return c3074y;
    }
}
