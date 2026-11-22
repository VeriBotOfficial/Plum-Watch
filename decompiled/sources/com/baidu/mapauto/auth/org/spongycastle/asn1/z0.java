package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes13.dex */
public final class z0 extends s {
    public int b;

    public z0() {
        this.b = -1;
    }

    public z0(e eVar) {
        super(eVar);
        this.b = -1;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) throws IOException {
        x0 a2 = pVar.a();
        int j = j();
        pVar.a(48);
        pVar.b(j);
        Enumeration elements = this.f8290a.elements();
        while (elements.hasMoreElements()) {
            a2.a((d) elements.nextElement());
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() throws IOException {
        int j = j();
        return u1.a(j) + 1 + j;
    }

    public final int j() throws IOException {
        if (this.b < 0) {
            Enumeration elements = this.f8290a.elements();
            int i = 0;
            while (elements.hasMoreElements()) {
                i += ((d) elements.nextElement()).c().g().e();
            }
            this.b = i;
        }
        return this.b;
    }
}
