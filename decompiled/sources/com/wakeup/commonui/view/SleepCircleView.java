package com.wakeup.commonui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.UIHelper;

/* loaded from: classes2.dex */
public class SleepCircleView extends View {
    private float deepSleepAngle;
    private float shallowSleepAngle;
    private float soberSleepAngle;
    private int viewHeight;
    private int viewWidth;

    public SleepCircleView(Context context) {
        super(context);
    }

    public SleepCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SleepCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (size == 0 || size2 == 0) {
            return;
        }
        this.viewHeight = size;
        this.viewWidth = size2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawRingView(canvas);
    }

    public void setSleepPercentageData(int i, int i2, int i3) {
        this.deepSleepAngle = (float) (i * 0.01d * 360.0d);
        this.shallowSleepAngle = (float) (i2 * 0.01d * 360.0d);
        this.soberSleepAngle = (float) (i3 * 0.01d * 360.0d);
        invalidate();
    }

    private void drawRingView(Canvas canvas) {
        int dp2px = UIHelper.dp2px(12.0f);
        Paint paint = new Paint();
        float f = dp2px;
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(R.color.bg));
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(f);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(getResources().getColor(R.color.color_sleep_deep));
        Paint paint3 = new Paint();
        paint3.setStrokeWidth(f);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setAntiAlias(true);
        paint3.setColor(getResources().getColor(R.color.color_sleep_shallow));
        Paint paint4 = new Paint();
        paint4.setStrokeWidth(f);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setAntiAlias(true);
        paint4.setColor(getResources().getColor(R.color.color_sleep_wake));
        float f2 = dp2px / 2;
        RectF rectF = new RectF(f2, f2, this.viewWidth - r1, this.viewHeight - r1);
        canvas.drawArc(rectF, 0.0f, 360.0f, false, paint);
        canvas.drawArc(rectF, 0.0f, this.deepSleepAngle, false, paint2);
        canvas.drawArc(rectF, this.deepSleepAngle, this.shallowSleepAngle, false, paint3);
        canvas.drawArc(rectF, this.deepSleepAngle + this.shallowSleepAngle, this.soberSleepAngle, false, paint4);
    }
}
