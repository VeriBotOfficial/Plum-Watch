package com.luck.picture.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes2.dex */
public class SquareRelativeLayout extends RelativeLayout {
    public SquareRelativeLayout(Context context) {
        super(context);
    }

    public SquareRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareRelativeLayout(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
    }

    public SquareRelativeLayout(Context context, AttributeSet attributeSet, int r3, int r4) {
        super(context, attributeSet, r3, r4);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r1);
    }
}
