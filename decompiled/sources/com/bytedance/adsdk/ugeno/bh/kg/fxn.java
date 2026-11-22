package com.bytedance.adsdk.ugeno.bh.kg;

import android.view.View;
import com.bytedance.adsdk.ugeno.tw.gff;

/* loaded from: classes13.dex */
public class fxn implements gff.rb {
    @Override // com.bytedance.adsdk.ugeno.tw.gff.rb
    public void fxn(View view, float f) {
        view.setPivotX(f < 0.0f ? view.getWidth() : 0.0f);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationY(f * 90.0f);
    }
}
