package com.wakeup.commonui.utils;

import android.graphics.Paint;

/* loaded from: classes2.dex */
public class DrawTextUtils {
    private DrawTextUtils() {
    }

    public static float getTextWidth(String str, Paint paint) {
        return paint.measureText(str);
    }

    public static float getTextHeight(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public static float getTextCenterHeight(Paint paint) {
        paint.getFontMetrics();
        return Math.abs(paint.ascent() + paint.descent()) / 2.0f;
    }
}
