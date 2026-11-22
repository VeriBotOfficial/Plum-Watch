package com.wakeup.commonui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public class ProportionView extends View {
    private float maxHeight;
    private int x;
    private int y;

    public ProportionView(Context context) {
        this(context, null);
    }

    public ProportionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProportionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ProportionView);
        this.x = obtainStyledAttributes.getInt(R.styleable.ProportionView_x, 1);
        this.y = obtainStyledAttributes.getInt(R.styleable.ProportionView_y, 1);
        this.maxHeight = obtainStyledAttributes.getDimension(R.styleable.ProportionView_maxHeight, -1.0f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
        int i3 = (this.y * defaultSize) / this.x;
        float f = this.maxHeight;
        if (f != -1.0f && i3 > f) {
            i3 = (int) f;
        }
        setMeasuredDimension(defaultSize, i3);
    }
}
