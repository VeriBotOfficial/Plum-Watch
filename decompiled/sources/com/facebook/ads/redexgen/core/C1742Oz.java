package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Oz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1742Oz extends AbstractRunnableC1915Vt {
    public final /* synthetic */ C1925Wd A00;

    public C1742Oz(C1925Wd c1925Wd) {
        this.A00 = c1925Wd;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1915Vt
    public final void A07() {
        Handler handler;
        long j;
        if (!this.A00.A05()) {
            return;
        }
        this.A00.A02();
        handler = this.A00.A05;
        j = this.A00.A02;
        handler.postDelayed(this, j);
    }
}
