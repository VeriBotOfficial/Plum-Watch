package com.bytedance.sdk.openadsdk.core.dgx.kg.kg;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes14.dex */
public class fxn extends com.bytedance.adsdk.ugeno.jq.kg.fxn {
    private final com.bytedance.adsdk.ugeno.jq.kg.fxn fxn;

    public fxn(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.jq.kg.fxn fxnVar = new com.bytedance.adsdk.ugeno.jq.kg.fxn(context);
        this.fxn = fxnVar;
        addView(fxnVar, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.jq.kg.fxn getPlayableView() {
        return this.fxn;
    }
}
