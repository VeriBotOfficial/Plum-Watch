package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes13.dex */
public final class f0 extends u {
    public f0() {
    }

    public f0(e eVar) {
        super(eVar);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) throws IOException {
        pVar.a(49);
        pVar.a(128);
        Enumeration elements = this.f8294a.elements();
        while (elements.hasMoreElements()) {
            pVar.a((d) elements.nextElement());
        }
        pVar.a(0);
        pVar.a(0);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() throws IOException {
        Enumeration elements = this.f8294a.elements();
        int i = 0;
        while (elements.hasMoreElements()) {
            i += ((d) elements.nextElement()).c().e();
        }
        return i + 4;
    }
}
