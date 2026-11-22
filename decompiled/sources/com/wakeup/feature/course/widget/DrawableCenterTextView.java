package com.wakeup.feature.course.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public class DrawableCenterTextView extends AppCompatTextView {
    public DrawableCenterTextView(Context context) {
        super(context);
    }

    public DrawableCenterTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DrawableCenterTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        Drawable[] compoundDrawables = getCompoundDrawables();
        int i8 = 0;
        Drawable drawable = compoundDrawables[0];
        Drawable drawable2 = compoundDrawables[1];
        Drawable drawable3 = compoundDrawables[2];
        Drawable drawable4 = compoundDrawables[3];
        String obj = getText().toString();
        float measureText = getPaint().measureText(obj, 0, obj.length());
        double lineHeight = getLineHeight() * getLineCount();
        if (drawable != null) {
            i5 = drawable.getIntrinsicWidth();
            i6 = getCompoundDrawablePadding();
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (drawable3 != null) {
            i5 += drawable3.getIntrinsicWidth();
            i6 += getCompoundDrawablePadding();
        }
        int width = ((int) (getWidth() - ((measureText + i5) + i6))) / 2;
        if (drawable2 != null) {
            i8 = drawable2.getIntrinsicHeight();
            i7 = getCompoundDrawablePadding();
        } else {
            i7 = 0;
        }
        if (drawable4 != null) {
            i8 += drawable4.getIntrinsicHeight();
            i7 += getCompoundDrawablePadding();
        }
        int height = ((int) (getHeight() - ((float) ((lineHeight + i8) + i7)))) / 2;
        setPadding(width, height, width, height);
    }
}
