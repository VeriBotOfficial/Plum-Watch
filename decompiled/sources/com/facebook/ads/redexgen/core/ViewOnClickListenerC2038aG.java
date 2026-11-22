package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.aG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2038aG implements View.OnClickListener {
    public final /* synthetic */ C2040aI A00;

    public ViewOnClickListenerC2038aG(C2040aI c2040aI) {
        this.A00 = c2040aI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A05();
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }
}
