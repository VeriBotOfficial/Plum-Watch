package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes13.dex */
public final class m1 extends u {
    public int c;

    public m1() {
        this.c = -1;
    }

    public m1(e eVar) {
        super(eVar);
        this.c = -1;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) throws IOException {
        p b = pVar.b();
        if (this.c < 0) {
            Enumeration elements = this.f8294a.elements();
            int i = 0;
            while (elements.hasMoreElements()) {
                i += ((d) elements.nextElement()).c().h().e();
            }
            this.c = i;
        }
        int i2 = this.c;
        pVar.a(49);
        pVar.b(i2);
        Enumeration elements2 = this.f8294a.elements();
        while (elements2.hasMoreElements()) {
            b.a((d) elements2.nextElement());
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() throws IOException {
        if (this.c < 0) {
            Enumeration elements = this.f8294a.elements();
            int i = 0;
            while (elements.hasMoreElements()) {
                i += ((d) elements.nextElement()).c().h().e();
            }
            this.c = i;
        }
        int i2 = this.c;
        return u1.a(i2) + 1 + i2;
    }
}
