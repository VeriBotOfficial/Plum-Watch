package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.2y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C11892y extends DG {
    public final /* synthetic */ D4 A00;

    public C11892y(D4 d4) {
        this.A00 = d4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1851Tf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(DH dh) {
        E1 e1;
        Handler handler;
        e1 = this.A00.A01;
        if (e1 == null || dh.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new C2257dp(this));
    }
}
