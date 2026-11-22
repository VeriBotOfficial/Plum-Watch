package com.qumeng.overseas.advlib.__remote__.ui.elements.toaster.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;

/* loaded from: classes17.dex */
public class ToastTextView extends AppCompatTextView {
    public ToastTextView(Context context) {
        super(context);
        a();
    }

    private void a() {
        setTextSize(16.0f);
        int a2 = s.a(getContext(), 5.0f);
        int i = a2 * 2;
        setPadding(i, a2, i, a2);
        setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(8.0f);
        gradientDrawable.setColor(Color.argb(187, 0, 0, 0));
        setBackground(gradientDrawable);
        setElevation(5.0f);
    }

    public ToastTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ToastTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
