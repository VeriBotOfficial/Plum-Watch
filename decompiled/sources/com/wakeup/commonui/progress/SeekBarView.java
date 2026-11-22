package com.wakeup.commonui.progress;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatSeekBar;

/* loaded from: classes2.dex */
public class SeekBarView extends AppCompatSeekBar {
    private boolean touch;

    public SeekBarView(Context context) {
        super(context);
        this.touch = false;
    }

    public SeekBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SeekBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.touch = false;
    }

    public void setTouch(boolean z) {
        this.touch = z;
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.touch) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
