package com.baidu.platform.comapi.walknavi.segmentbrowse.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes15.dex */
public class TestLinearLayout extends LinearLayout {
    public TestLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        for (int r1 = 0; r1 < getChildCount(); r1++) {
            getChildAt(r1).dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public TestLinearLayout(Context context) {
        super(context);
    }
}
