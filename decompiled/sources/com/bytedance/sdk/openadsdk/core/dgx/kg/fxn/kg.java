package com.bytedance.sdk.openadsdk.core.dgx.kg.fxn;

import android.content.Context;
import com.bytedance.adsdk.kg.bh;
import com.bytedance.adsdk.ugeno.hm;

/* loaded from: classes14.dex */
public class kg extends bh {
    private hm fxn;

    public kg(Context context) {
        super(context);
    }

    public void fxn(hm hmVar) {
        this.fxn = hmVar;
    }

    @Override // com.bytedance.adsdk.kg.bh, android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        hm hmVar = this.fxn;
        if (hmVar != null) {
            hmVar.sg();
        }
    }

    @Override // com.bytedance.adsdk.kg.bh, android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hm hmVar = this.fxn;
        if (hmVar != null) {
            hmVar.tw();
        }
    }
}
