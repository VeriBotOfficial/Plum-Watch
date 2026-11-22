package com.bytedance.adsdk.ugeno.bh.fxn;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes13.dex */
public class kg extends fxn {
    public kg(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.bh.fxn.fxn
    public Drawable kg(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }
}
