package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3730zm extends K4 {
    public final InterfaceC3307in g;

    public C3730zm(String str, String str2, InterfaceC3307in interfaceC3307in, Pn pn, U2 u2) {
        super(0, str, str2, pn, u2);
        this.g = interfaceC3307in;
    }

    @Override // io.appmetrica.analytics.impl.K4
    public final void a(Cn cn) {
        String str = (String) this.g.a((String) this.f);
        cn.d.f17838a = str == null ? new byte[0] : str.getBytes();
    }

    public final InterfaceC3307in h() {
        return this.g;
    }
}
