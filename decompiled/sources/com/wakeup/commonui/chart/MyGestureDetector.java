package com.wakeup.commonui.chart;

import android.view.MotionEvent;

/* loaded from: classes2.dex */
public class MyGestureDetector {
    private float preX;
    private float preY;

    public boolean onTouch(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            this.preX = x;
            this.preY = y;
        }
        if (motionEvent.getAction() != 2) {
            return true;
        }
        float f = x - this.preX;
        float f2 = y - this.preY;
        if (f2 > 10.0f && f2 > f) {
            this.preX = x;
            this.preY = y;
            return false;
        }
        this.preX = x;
        this.preY = y;
        return true;
    }
}
