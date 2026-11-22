package com.facebook.ads.redexgen.core;

import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2311eh {
    public C2315el A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C2311eh A00(C2315el c2315el) {
        this.A00 = c2315el;
        return this;
    }

    public final C2311eh A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C2311eh A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C2311eh A03(boolean z) {
        this.A04 = z;
        return this;
    }

    public final C2311eh A04(boolean z) {
        this.A03 = z;
        return this;
    }

    public final C2312ei A05() {
        return new C2312ei(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
