package com.bytedance.sdk.component.adexpress.hm;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes13.dex */
public class gff {
    public static Drawable fxn(Context context, com.bytedance.sdk.component.adexpress.dynamic.hm.sg sgVar) {
        if (context == null || sgVar == null) {
            return null;
        }
        return fxn(context, (int) sg.fxn(context, sgVar.rmu()), sgVar.xdg(), sgVar.zn());
    }

    public static Drawable fxn(Context context, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i, i2);
        }
        gradientDrawable.setColor(i3);
        return gradientDrawable;
    }
}
