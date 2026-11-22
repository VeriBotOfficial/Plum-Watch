package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ZJ implements View.OnClickListener {
    public final /* synthetic */ ZO A00;

    public ZJ(ZO zo) {
        this.A00 = zo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2228dL c2228dL;
        ZN zn;
        ZN zn2;
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            c2228dL = this.A00.A0A;
            c2228dL.A0F().A9o();
            zn = this.A00.A05;
            if (zn == null) {
                return;
            }
            zn2 = this.A00.A05;
            zn2.ACl();
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }
}
