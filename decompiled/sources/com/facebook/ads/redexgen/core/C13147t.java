package com.facebook.ads.redexgen.core;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;

/* renamed from: com.facebook.ads.redexgen.X.7t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C13147t implements InterfaceC2667kk {
    public long A00;
    public final long A01;
    public final AnonymousClass45 A03 = new AnonymousClass45();
    public final AnonymousClass45 A02 = new AnonymousClass45();

    public C13147t(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j3;
        this.A03.A04(0L);
        this.A02.A04(j2);
    }

    public final void A00(long j) {
        this.A00 = j;
    }

    public final void A01(long j, long j2) {
        if (A02(j)) {
            return;
        }
        this.A03.A04(j);
        this.A02.A04(j2);
    }

    public final boolean A02(long j) {
        long lastIndexedTimeUs = this.A03.A03(this.A03.A02() - 1);
        return j - lastIndexedTimeUs < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667kk
    public final long A7b() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1535Gw
    public final long A7l() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1535Gw
    public final C1534Gv A8t(long j) {
        int A0C = AbstractC12174a.A0C(this.A03, j, true, true);
        C1536Gx c1536Gx = new C1536Gx(this.A03.A03(A0C), this.A02.A03(A0C));
        if (c1536Gx.A01 != j) {
            int targetIndex = this.A03.A02();
            if (A0C != targetIndex - 1) {
                int targetIndex2 = A0C + 1;
                long A03 = this.A03.A03(targetIndex2);
                int targetIndex3 = A0C + 1;
                C1536Gx nextSeekPoint = new C1536Gx(A03, this.A02.A03(targetIndex3));
                return new C1534Gv(c1536Gx, nextSeekPoint);
            }
        }
        return new C1534Gv(c1536Gx);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667kk
    public final long A99(long j) {
        return this.A03.A03(AbstractC12174a.A0C(this.A02, j, true, true));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1535Gw
    public final boolean AAa() {
        return true;
    }
}
