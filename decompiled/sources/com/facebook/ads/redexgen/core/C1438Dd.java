package com.facebook.ads.redexgen.core;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Dd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1438Dd extends AbstractC1717Nz {
    public final /* synthetic */ C1437Dc A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1438Dd(C1437Dc c1437Dc, double d, double d2, double d3, boolean z) {
        super(d, d2, d3, z);
        this.A00 = c1437Dc;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1717Nz
    public final void A00(boolean z, boolean z2, O1 o1) {
        C2228dL c2228dL;
        String str;
        Map A0J;
        boolean z3;
        c2228dL = this.A00.A0D;
        if (U7.A0z(c2228dL)) {
            z3 = this.A00.A0A;
            if (z3) {
                return;
            }
        }
        if (z2) {
            this.A00.A0A = true;
            C1437Dc c1437Dc = this.A00;
            str = this.A00.A0J;
            A0J = this.A00.A0J(EnumC2235dS.A0B);
            c1437Dc.A0R(str, A0J);
        }
    }
}
