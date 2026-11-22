package com.wakeup.commonui.expand;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes2.dex */
public class NoScrollViewPager extends ViewPager {
    private boolean isCanScroll;

    public NoScrollViewPager(Context context) {
        super(context);
        this.isCanScroll = false;
    }

    public NoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isCanScroll = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.isCanScroll && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.isCanScroll && super.onTouchEvent(motionEvent);
    }

    public void setCanScroll(boolean z) {
        this.isCanScroll = z;
    }
}
