package com.huawei.hms.scankit.p;

import android.gov.nist.core.Separators;
import kotlin.text.Typography;

/* compiled from: BinaryShiftToken.java */
/* loaded from: classes14.dex */
final class Sb extends Xb {
    private final short c;
    private final short d;

    Sb(Xb xb, int i, int i2) {
        super(xb);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // com.huawei.hms.scankit.p.Xb
    public void a(C3070x c3070x, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.d;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                c3070x.a(31, 5);
                short s2 = this.d;
                if (s2 > 62) {
                    c3070x.a(s2 - 31, 16);
                } else if (i == 0) {
                    c3070x.a(Math.min((int) s2, 31), 5);
                } else {
                    c3070x.a(s2 - 31, 5);
                }
            }
            c3070x.a(bArr[this.c + i], 8);
            i++;
        }
    }

    public String toString() {
        return Separators.LESS_THAN + ((int) this.c) + "::" + ((this.c + this.d) - 1) + Typography.greater;
    }
}
