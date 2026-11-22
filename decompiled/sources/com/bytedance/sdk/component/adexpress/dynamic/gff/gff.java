package com.bytedance.sdk.component.adexpress.dynamic.gff;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes13.dex */
public class gff implements sg {
    com.bytedance.sdk.component.adexpress.bh.rb fxn;

    public gff(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rb rbVar, com.bytedance.sdk.component.adexpress.dynamic.hm.sg sgVar) {
        this.fxn = new com.bytedance.sdk.component.adexpress.bh.rb(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rbVar.getDynamicHeight(), rbVar.getDynamicHeight());
        layoutParams.gravity = 17;
        this.fxn.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gff.sg
    public void fxn() {
        this.fxn.fxn();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gff.sg
    public void kg() {
        this.fxn.kg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gff.sg
    /* renamed from: hm, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.bh.rb gff() {
        return this.fxn;
    }
}
