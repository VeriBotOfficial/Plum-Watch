package com.bytedance.sdk.component.adexpress.hm;

import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes15.dex */
public class tw {
    public static GradientDrawable fxn(int r16, Integer num, int[] r18, int[] r19, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(r16);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        int length = r18 != null ? r18.length : 0;
        if (length == 1) {
            gradientDrawable.setCornerRadius(r18[0]);
        } else if (length == 4) {
            int r4 = r18[0];
            int r9 = r18[1];
            int r11 = r18[2];
            int r0 = r18[3];
            gradientDrawable.setCornerRadii(new float[]{r4, r4, r9, r9, r11, r11, r0, r0});
        }
        if (r19 != null && r19.length == 2) {
            gradientDrawable.setSize(r19[0], r19[1]);
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num2.intValue(), num3.intValue());
        }
        return gradientDrawable;
    }
}
