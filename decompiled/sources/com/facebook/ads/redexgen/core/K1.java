package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class K1 extends AbstractRunnableC1915Vt {
    public final /* synthetic */ AbstractC2033aB A00;

    public K1(AbstractC2033aB abstractC2033aB) {
        this.A00 = abstractC2033aB;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1915Vt
    public final void A07() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        AbstractC2033aB abstractC2033aB = this.A00;
        runnable = this.A00.A09;
        i = this.A00.A08;
        abstractC2033aB.postOnAnimationDelayed(runnable, i);
    }
}
