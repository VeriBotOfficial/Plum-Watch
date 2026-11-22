package com.anythink.basead.mixad.shake;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes11.dex */
public class MixNativeAdNetworkShakeView extends FrameLayout implements com.anythink.core.common.l.a {
    public MixNativeAdNetworkShakeView(Context context) {
        super(context);
    }

    public MixNativeAdNetworkShakeView(Context context, View view, int i, int i2) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.gravity = 17;
        addView(view, layoutParams);
    }
}
