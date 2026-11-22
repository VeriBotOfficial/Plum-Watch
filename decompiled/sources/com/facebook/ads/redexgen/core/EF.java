package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class EF extends AbstractRunnableC1915Vt {
    public final /* synthetic */ E1 A00;

    public EF(E1 e1) {
        this.A00 = e1;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1915Vt
    public final void A07() {
        boolean z;
        C1850Te c1850Te;
        Handler handler;
        int i;
        z = this.A00.A04;
        if (!z) {
            c1850Te = this.A00.A0C;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c1850Te.A02(new DY(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.3Q
            });
            handler = this.A00.A08;
            i = this.A00.A01;
            handler.postDelayed(this, i);
        }
    }
}
