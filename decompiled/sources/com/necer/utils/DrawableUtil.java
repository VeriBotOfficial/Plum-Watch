package com.necer.utils;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes17.dex */
public class DrawableUtil {
    public static Rect getDrawableBounds(int i, int i2, Drawable drawable) {
        return new Rect(i - (drawable.getIntrinsicWidth() / 2), i2 - (drawable.getIntrinsicHeight() / 2), i + (drawable.getIntrinsicWidth() / 2), i2 + (drawable.getIntrinsicHeight() / 2));
    }
}
