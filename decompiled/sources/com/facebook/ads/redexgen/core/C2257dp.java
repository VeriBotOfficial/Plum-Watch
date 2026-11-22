package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.dp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2257dp extends AnimatorListenerAdapter {
    public final /* synthetic */ C11892y A00;

    public C2257dp(C11892y c11892y) {
        this.A00 = c11892y;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new D5(this), 2000L);
    }
}
