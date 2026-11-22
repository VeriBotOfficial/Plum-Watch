package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class K9 extends AbstractRunnableC1915Vt {
    public final /* synthetic */ AbstractC2033aB A00;

    public K9(AbstractC2033aB abstractC2033aB) {
        this.A00 = abstractC2033aB;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1915Vt
    public final void A07() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            AbstractC2033aB abstractC2033aB = this.A00;
            i = this.A00.A08;
            abstractC2033aB.postDelayed(this, i);
        } else {
            this.A00.setPressed(true);
            AbstractC2033aB abstractC2033aB2 = this.A00;
            runnable = this.A00.A0A;
            abstractC2033aB2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
