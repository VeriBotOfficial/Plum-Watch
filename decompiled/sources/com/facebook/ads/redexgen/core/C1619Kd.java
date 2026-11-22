package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Kd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1619Kd extends AbstractRunnableC1915Vt {
    public final /* synthetic */ C2010Zm A00;

    public C1619Kd(C2010Zm c2010Zm) {
        this.A00 = c2010Zm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1915Vt
    public final void A07() {
        boolean z;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z = this.A00.A08;
        if (!z) {
            return;
        }
        handler = this.A00.A0D;
        runnable = this.A00.A0F;
        handler.postDelayed(runnable, 250L);
    }
}
