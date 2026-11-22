package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1630Ko extends AbstractRunnableC1915Vt {
    public final WeakReference<C2301eX> A00;

    public C1630Ko(C2301eX c2301eX) {
        this.A00 = new WeakReference<>(c2301eX);
    }

    public C1630Ko(WeakReference<C2301eX> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1915Vt
    public final void A07() {
        C2301eX viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
