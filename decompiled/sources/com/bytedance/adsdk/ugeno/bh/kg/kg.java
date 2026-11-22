package com.bytedance.adsdk.ugeno.bh.kg;

import android.view.View;
import com.bytedance.adsdk.ugeno.tw.gff;

/* loaded from: classes13.dex */
public class kg implements gff.rb {
    @Override // com.bytedance.adsdk.ugeno.tw.gff.rb
    public void fxn(View view, float f) {
        int width = view.getWidth();
        if (f >= -1.0f && f <= 1.0f) {
            if (f < 0.0f) {
                view.setTranslationX((-width) * f);
            } else {
                view.setTranslationX(width);
                view.setTranslationX((-width) * f);
            }
            view.setAlpha(Math.max(0.0f, 1.0f - Math.abs(f)));
            return;
        }
        view.setAlpha(0.0f);
    }
}
