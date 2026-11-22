package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YZ implements View.OnClickListener {
    public final /* synthetic */ C1974Yc A00;

    public YZ(C1974Yc c1974Yc) {
        this.A00 = c1974Yc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        InterfaceC1977Yf interfaceC1977Yf;
        InterfaceC1977Yf interfaceC1977Yf2;
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            z = this.A00.A05;
            if (z) {
                interfaceC1977Yf2 = this.A00.A04;
                interfaceC1977Yf2.A4v();
            } else {
                interfaceC1977Yf = this.A00.A04;
                interfaceC1977Yf.A4w();
            }
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }
}
