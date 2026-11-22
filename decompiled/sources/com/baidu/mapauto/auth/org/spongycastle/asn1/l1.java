package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes13.dex */
public final class l1 extends s {
    public int b;

    public l1() {
        this.b = -1;
    }

    public l1(e eVar) {
        super(eVar);
        this.b = -1;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) throws IOException {
        p b = pVar.b();
        if (this.b < 0) {
            Enumeration elements = this.f8290a.elements();
            int i = 0;
            while (elements.hasMoreElements()) {
                i += ((d) elements.nextElement()).c().h().e();
            }
            this.b = i;
        }
        int i2 = this.b;
        pVar.a(48);
        pVar.b(i2);
        Enumeration elements2 = this.f8290a.elements();
        while (elements2.hasMoreElements()) {
            b.a((d) elements2.nextElement());
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() throws IOException {
        if (this.b < 0) {
            Enumeration elements = this.f8290a.elements();
            int i = 0;
            while (elements.hasMoreElements()) {
                i += ((d) elements.nextElement()).c().h().e();
            }
            this.b = i;
        }
        int i2 = this.b;
        return u1.a(i2) + 1 + i2;
    }
}
