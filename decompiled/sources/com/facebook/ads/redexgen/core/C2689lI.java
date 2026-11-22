package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2689lI implements InterfaceC1535Gw {
    public final long A00;
    public final C1534Gv A01;

    public C2689lI(long j) {
        this(j, 0L);
    }

    public C2689lI(long j, long j2) {
        this.A00 = j;
        this.A01 = new C1534Gv(j2 == 0 ? C1536Gx.A04 : new C1536Gx(0L, j2));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1535Gw
    public final long A7l() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1535Gw
    public final C1534Gv A8t(long j) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1535Gw
    public final boolean AAa() {
        return false;
    }
}
