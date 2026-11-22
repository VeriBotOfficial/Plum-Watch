package com.amap.api.col.p0003sl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/* compiled from: StatisticsPubDataStrategy.java */
/* loaded from: classes11.dex */
public class fc extends gc {
    public fc(gc gcVar) {
        super(gcVar);
    }

    @Override // com.amap.api.col.p0003sl.gc
    protected byte[] b(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date()));
        stringBuffer.append(" ");
        stringBuffer.append(UUID.randomUUID().toString());
        stringBuffer.append(" ");
        if (stringBuffer.length() != 53) {
            return new byte[0];
        }
        byte[] e = m9.e(stringBuffer.toString());
        byte[] bArr2 = new byte[e.length + bArr.length];
        System.arraycopy(e, 0, bArr2, 0, e.length);
        System.arraycopy(bArr, 0, bArr2, e.length, bArr.length);
        return bArr2;
    }
}
