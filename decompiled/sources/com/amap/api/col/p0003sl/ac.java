package com.amap.api.col.p0003sl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: ByteJoinDataStrategy.java */
/* loaded from: classes11.dex */
public class ac extends gc {
    ByteArrayOutputStream c;

    public ac(gc gcVar) {
        super(gcVar);
        this.c = new ByteArrayOutputStream();
    }

    @Override // com.amap.api.col.p0003sl.gc
    public void a(byte[] bArr) {
        try {
            this.c.write(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.col.p0003sl.gc
    protected byte[] b(byte[] bArr) {
        byte[] byteArray = this.c.toByteArray();
        try {
            this.c.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.c = new ByteArrayOutputStream();
        return byteArray;
    }
}
