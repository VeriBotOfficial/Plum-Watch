package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes13.dex */
public final class n1 extends w {
    public n1(boolean z, int i, d dVar) {
        super(z, i, dVar);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) throws IOException {
        r h = this.c.c().h();
        if (!this.b) {
            pVar.a(h.f() ? 160 : 128, this.f8298a);
            pVar.a(h);
        } else {
            pVar.a(160, this.f8298a);
            pVar.b(h.e());
            pVar.a((d) h);
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() throws IOException {
        int e = this.c.c().h().e();
        if (this.b) {
            return u1.a(e) + u1.b(this.f8298a) + e;
        }
        return u1.b(this.f8298a) + (e - 1);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        if (this.b) {
            return true;
        }
        return this.c.c().h().f();
    }
}
