package com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* loaded from: classes17.dex */
public class e extends FrameLayout {
    private boolean t;

    public e(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = this.t;
        return z ? z : super.onInterceptTouchEvent(motionEvent);
    }

    public void setIsOverrideClick(boolean z) {
        this.t = z;
        setEnabled(!z);
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
