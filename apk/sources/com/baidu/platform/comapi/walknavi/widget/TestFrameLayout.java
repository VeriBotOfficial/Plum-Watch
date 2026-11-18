package com.baidu.platform.comapi.walknavi.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes15.dex */
public class TestFrameLayout extends FrameLayout {
    public TestFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        for (int r0 = 0; r0 < getChildCount(); r0++) {
            getChildAt(r0).dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public TestFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
