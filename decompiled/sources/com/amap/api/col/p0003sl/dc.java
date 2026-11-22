package com.amap.api.col.p0003sl;

/* compiled from: LogJsonDataStrategy.java */
/* loaded from: classes11.dex */
public class dc extends gc {
    private StringBuilder c;
    private boolean d;

    public dc(gc gcVar) {
        super(gcVar);
        this.c = new StringBuilder();
        this.d = true;
    }

    @Override // com.amap.api.col.p0003sl.gc
    public void a(byte[] bArr) {
        String c = m9.c(bArr);
        if (this.d) {
            this.d = false;
        } else {
            this.c.append(",");
        }
        this.c.append("{\"log\":\"").append(c).append("\"}");
    }

    @Override // com.amap.api.col.p0003sl.gc
    protected byte[] b(byte[] bArr) {
        byte[] e = m9.e(this.c.toString());
        this.b = e;
        this.d = true;
        StringBuilder sb = this.c;
        sb.delete(0, sb.length());
        return e;
    }
}
