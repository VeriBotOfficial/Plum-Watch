package com.huawei.hms.scankit.p;

import android.gov.nist.core.Separators;
import kotlin.text.Typography;

/* compiled from: SimpleToken.java */
/* loaded from: classes14.dex */
final class Vb extends Xb {
    private final short c;
    private final short d;

    Vb(Xb xb, int i, int i2) {
        super(xb);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // com.huawei.hms.scankit.p.Xb
    void a(C3070x c3070x, byte[] bArr) {
        c3070x.a(this.c, this.d);
    }

    public String toString() {
        short s = this.c;
        int i = 1 << this.d;
        return Separators.LESS_THAN + Integer.toBinaryString((s & (i - 1)) | i | (1 << this.d)).substring(1) + Typography.greater;
    }
}
