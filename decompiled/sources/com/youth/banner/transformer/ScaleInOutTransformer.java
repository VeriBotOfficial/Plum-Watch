package com.youth.banner.transformer;

import android.view.View;

/* loaded from: classes5.dex */
public class ScaleInOutTransformer extends ABaseTransformer {
    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void onTransform(View view, float f) {
        view.setPivotX(f >= 0.0f ? view.getWidth() : 0.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        float f2 = f < 0.0f ? f + 1.0f : 1.0f - f;
        view.setScaleX(f2);
        view.setScaleY(f2);
    }
}
