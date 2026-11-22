package com.facebook.ads.redexgen.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.facebook.ads.redexgen.X.dW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2239dW extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C2241dY A01;

    public C2239dW(C2241dY c2241dY, float f) {
        this.A01 = c2241dY;
        this.A00 = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }
}
