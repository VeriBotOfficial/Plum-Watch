package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DayViewDecorator implements Parcelable {
    public ColorStateList getBackgroundColor(Context context, int r2, int r3, int r4, boolean z, boolean z2) {
        return null;
    }

    public Drawable getCompoundDrawableBottom(Context context, int r2, int r3, int r4, boolean z, boolean z2) {
        return null;
    }

    public Drawable getCompoundDrawableLeft(Context context, int r2, int r3, int r4, boolean z, boolean z2) {
        return null;
    }

    public Drawable getCompoundDrawableRight(Context context, int r2, int r3, int r4, boolean z, boolean z2) {
        return null;
    }

    public Drawable getCompoundDrawableTop(Context context, int r2, int r3, int r4, boolean z, boolean z2) {
        return null;
    }

    public CharSequence getContentDescription(Context context, int r2, int r3, int r4, boolean z, boolean z2, CharSequence charSequence) {
        return charSequence;
    }

    public ColorStateList getTextColor(Context context, int r2, int r3, int r4, boolean z, boolean z2) {
        return null;
    }

    public void initialize(Context context) {
    }
}
