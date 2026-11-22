package com.facebook.ads.redexgen.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Fr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1504Fr extends AbstractRunnableC1915Vt {
    public final /* synthetic */ InterfaceC2178cW A00;
    public final /* synthetic */ C2179cX A01;

    public C1504Fr(C2179cX c2179cX, InterfaceC2178cW interfaceC2178cW) {
        this.A01 = c2179cX;
        this.A00 = interfaceC2178cW;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1915Vt
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C1505Fs(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
