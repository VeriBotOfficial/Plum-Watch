package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Cq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1425Cq extends AbstractRunnableC1915Vt {
    public final /* synthetic */ C1424Cp A00;

    public C1425Cq(C1424Cp c1424Cp) {
        this.A00 = c1424Cp;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1915Vt
    public final void A07() {
        View view;
        Drawable drawable;
        this.A00.A02 = EnumC2269e1.A04;
        view = this.A00.A07;
        drawable = this.A00.A05;
        XP.A0Q(view, drawable);
    }
}
