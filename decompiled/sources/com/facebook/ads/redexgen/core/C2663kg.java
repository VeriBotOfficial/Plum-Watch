package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2663kg implements IL {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C4J A04;

    public C2663kg(C2665ki c2665ki) {
        this.A04 = c2665ki.A00;
        this.A04.A0f(12);
        this.A02 = this.A04.A0L() & 255;
        this.A03 = this.A04.A0L();
    }

    @Override // com.facebook.ads.redexgen.core.IL
    public final int A82() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.IL
    public final int A8n() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.IL
    public final int AGi() {
        if (this.A02 == 8) {
            return this.A04.A0I();
        }
        if (this.A02 == 16) {
            return this.A04.A0M();
        }
        int i = this.A01;
        this.A01 = i + 1;
        if (i % 2 == 0) {
            this.A00 = this.A04.A0I();
            return (this.A00 & 240) >> 4;
        }
        return this.A00 & 15;
    }
}
