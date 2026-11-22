package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes13.dex */
public final class d0 extends s {
    public d0() {
    }

    public d0(e eVar) {
        super(eVar);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) throws IOException {
        pVar.a(48);
        pVar.a(128);
        Enumeration elements = this.f8290a.elements();
        while (elements.hasMoreElements()) {
            pVar.a((d) elements.nextElement());
        }
        pVar.a(0);
        pVar.a(0);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() throws IOException {
        Enumeration elements = this.f8290a.elements();
        int i = 0;
        while (elements.hasMoreElements()) {
            i += ((d) elements.nextElement()).c().e();
        }
        return i + 4;
    }
}
