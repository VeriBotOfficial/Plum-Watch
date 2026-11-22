package com.youth.banner.transformer;

import android.view.View;

/* loaded from: classes5.dex */
public class AccordionTransformer extends ABaseTransformer {
    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void onTransform(View view, float f) {
        view.setPivotX(f >= 0.0f ? view.getWidth() : 0.0f);
        view.setScaleX(f < 0.0f ? f + 1.0f : 1.0f - f);
    }
}
