package com.necer.utils;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public class DrawableUtil {
    public static Rect getDrawableBounds(int r4, int r5, Drawable drawable) {
        return new Rect(r4 - (drawable.getIntrinsicWidth() / 2), r5 - (drawable.getIntrinsicHeight() / 2), r4 + (drawable.getIntrinsicWidth() / 2), r5 + (drawable.getIntrinsicHeight() / 2));
    }
}
