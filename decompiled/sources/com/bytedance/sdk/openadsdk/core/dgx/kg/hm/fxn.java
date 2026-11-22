package com.bytedance.sdk.openadsdk.core.dgx.kg.hm;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes14.dex */
public class fxn extends com.bytedance.adsdk.ugeno.jq.kg.fxn {
    private final com.bytedance.adsdk.ugeno.jq.kg.fxn fxn;
    private final com.bytedance.adsdk.ugeno.jq.kg.fxn kg;

    public fxn(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.jq.kg.fxn fxnVar = new com.bytedance.adsdk.ugeno.jq.kg.fxn(context);
        this.fxn = fxnVar;
        addView(fxnVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.jq.kg.fxn fxnVar2 = new com.bytedance.adsdk.ugeno.jq.kg.fxn(context);
        this.kg = fxnVar2;
        fxnVar2.setBackgroundColor(0);
        addView(fxnVar2, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.kg.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.kg.setOnTouchListener(onTouchListener);
    }

    public com.bytedance.adsdk.ugeno.jq.kg.fxn getVideoView() {
        return this.fxn;
    }
}
