package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.fZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2364fZ implements RQ {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ RS A01;
    public final /* synthetic */ C1771Qc A02;

    public C2364fZ(RS rs, ImageView imageView, C1771Qc c1771Qc) {
        this.A01 = rs;
        this.A00 = imageView;
        this.A02 = c1771Qc;
    }

    @Override // com.facebook.ads.redexgen.core.RQ
    public final void ADU(Drawable drawable) {
        C1771Qc.A0f(drawable, this.A00);
        this.A02.A1K(drawable);
    }
}
