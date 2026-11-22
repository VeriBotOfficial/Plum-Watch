package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2177cV {
    public String A02;
    public String A03;
    public String A04;
    public final C1689Mw A06;
    public final N9 A07;
    public final C2228dL A08;
    public C1691My A01 = C1691My.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public C2177cV(C2228dL c2228dL, C1689Mw c1689Mw, N9 n9) {
        this.A08 = c2228dL;
        this.A06 = c1689Mw;
        this.A07 = n9;
    }

    public final C2177cV A09(int i) {
        this.A00 = i;
        return this;
    }

    public final C2177cV A0A(C1691My c1691My) {
        this.A01 = c1691My;
        return this;
    }

    public final C2177cV A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final C2177cV A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final C2177cV A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final C2177cV A0E(boolean z) {
        this.A05 = z;
        return this;
    }

    public final C2179cX A0F() {
        return new C2179cX(this, null);
    }
}
