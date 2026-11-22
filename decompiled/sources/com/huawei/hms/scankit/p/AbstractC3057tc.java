package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* compiled from: OneDimensionalCodeWriter.java */
/* renamed from: com.huawei.hms.scankit.p.tc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC3057tc implements Pb {
    public int a() {
        return 10;
    }

    @Override // com.huawei.hms.scankit.p.Pb
    public C3074y a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<Jc, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        }
        int a2 = a();
        if (map != null && map.containsKey(Jc.MARGIN)) {
            try {
                a2 = Integer.parseInt(map.get(Jc.MARGIN).toString());
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException("EncodeHintType MARGIN can not format integer");
            }
        }
        return a(a(str), i, i2, a2);
    }

    public abstract boolean[] a(String str);

    private static C3074y a(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        C3074y c3074y = new C3074y(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                c3074y.a(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return c3074y;
    }

    protected static int a(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }
}
