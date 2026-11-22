package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ct, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1428Ct extends AbstractRunnableC1915Vt {
    public final /* synthetic */ C1424Cp A00;

    public C1428Ct(C1424Cp c1424Cp) {
        this.A00 = c1424Cp;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1915Vt
    public final void A07() {
        View view;
        Drawable drawable;
        this.A00.A02 = EnumC2269e1.A02;
        view = this.A00.A07;
        drawable = this.A00.A04;
        XP.A0Q(view, drawable);
    }
}
