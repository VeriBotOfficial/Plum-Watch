package com.wakeup.feature.course.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.wakeup.commonui.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class SegmentProgressBar extends AppCompatSeekBar {
    private List<Integer> durationList;
    private int height;
    private Paint mBackgroundPaint;
    private Paint mRoundPaint;
    private int maxValue;
    private int roundRadius;
    private int width;

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public SegmentProgressBar(Context context) {
        super(context);
        this.durationList = new ArrayList();
        init();
    }

    public SegmentProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.durationList = new ArrayList();
        init();
    }

    public SegmentProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.durationList = new ArrayList();
        init();
    }

    private void init() {
        Paint paint = new Paint();
        this.mBackgroundPaint = paint;
        paint.setAntiAlias(true);
        this.mBackgroundPaint.setDither(true);
        this.mBackgroundPaint.setStrokeWidth(UIHelper.dp2px(1.0f));
        this.mBackgroundPaint.setColor(Color.parseColor("#33000000"));
        Paint paint2 = new Paint();
        this.mRoundPaint = paint2;
        paint2.setAntiAlias(true);
        this.mRoundPaint.setDither(true);
        this.mRoundPaint.setStyle(Paint.Style.FILL);
        this.mRoundPaint.setColor(-1);
        this.roundRadius = UIHelper.dp2px(2.0f);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.width = getWidth();
        this.height = getHeight();
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.durationList.size() <= 0 || this.maxValue <= 0) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.durationList.size() - 1; i2++) {
            i += (int) (((this.durationList.get(i2).intValue() * 1.0f) / this.maxValue) * this.width);
            canvas.drawCircle(i + r2, this.height / 2.0f, this.roundRadius, this.mRoundPaint);
        }
    }

    public void setValue(List<Integer> list, int i) {
        this.durationList.clear();
        this.durationList.addAll(list);
        this.maxValue = i;
        invalidate();
    }

    public int getMaxValue() {
        return this.maxValue;
    }
}
