package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2651kU implements InterfaceC1586Iw {
    public long A00 = -1;
    public long A01 = -1;
    public C1519Gg A02;
    public C1520Gh A03;

    public C2651kU(C1520Gh c1520Gh, C1519Gg c1519Gg) {
        this.A03 = c1520Gh;
        this.A02 = c1519Gg;
    }

    public final void A00(long j) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1586Iw
    public final InterfaceC1535Gw A5R() {
        C3M.A08(this.A00 != -1);
        return new C2691lK(this.A03, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1586Iw
    public final long AGd(InterfaceC2694lN interfaceC2694lN) {
        if (this.A01 < 0) {
            return -1L;
        }
        long result = -(this.A01 + 2);
        this.A01 = -1L;
        return result;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1586Iw
    public final void AJR(long j) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[AbstractC12174a.A0L(jArr, j, true, true)];
    }
}
