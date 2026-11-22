package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ya, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1972Ya implements View.OnClickListener {
    public final /* synthetic */ C1974Yc A00;

    public ViewOnClickListenerC1972Ya(C1974Yc c1974Yc) {
        this.A00 = c1974Yc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1977Yf interfaceC1977Yf;
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            interfaceC1977Yf = this.A00.A04;
            interfaceC1977Yf.AAg();
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }
}
