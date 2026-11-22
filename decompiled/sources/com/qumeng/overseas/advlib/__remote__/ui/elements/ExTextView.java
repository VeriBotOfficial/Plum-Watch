package com.qumeng.overseas.advlib.__remote__.ui.elements;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes17.dex */
public class ExTextView extends AppCompatTextView {
    public ExTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        setTextSize(1, f);
    }

    public ExTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
