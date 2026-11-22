package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Xx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1969Xx implements View.OnClickListener {
    public final /* synthetic */ C1710Nr A00;

    public ViewOnClickListenerC1969Xx(C1710Nr c1710Nr) {
        this.A00 = c1710Nr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1957Xl interfaceC1957Xl;
        YQ yq;
        InterfaceC1957Xl interfaceC1957Xl2;
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            interfaceC1957Xl = this.A00.A01;
            if (interfaceC1957Xl != null) {
                yq = this.A00.A02;
                if (yq.A02()) {
                    interfaceC1957Xl2 = this.A00.A01;
                    interfaceC1957Xl2.ACC(this.A00);
                }
            }
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }
}
