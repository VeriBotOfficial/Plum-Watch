package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2016Zs {
    public static void A00(View view, boolean z, View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z) {
                return;
            }
            ViewOnClickListenerC2015Zr viewOnClickListenerC2015Zr = new ViewOnClickListenerC2015Zr(onClickListener);
            view.setOnClickListener(viewOnClickListenerC2015Zr);
            view.setOnTouchListener(new ViewOnTouchListenerC2014Zq(viewOnClickListenerC2015Zr));
        }
    }
}
