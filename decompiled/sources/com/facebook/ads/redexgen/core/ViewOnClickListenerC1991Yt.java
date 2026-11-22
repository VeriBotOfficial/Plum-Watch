package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1991Yt implements View.OnClickListener {
    public final /* synthetic */ C1993Yv A00;

    public ViewOnClickListenerC1991Yt(C1993Yv c1993Yv) {
        this.A00 = c1993Yv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1977Yf interfaceC1977Yf;
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            interfaceC1977Yf = this.A00.A02;
            interfaceC1977Yf.A9U();
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }
}
