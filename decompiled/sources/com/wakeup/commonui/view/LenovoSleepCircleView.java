package com.wakeup.commonui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.wakeup.common.log.LogUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.UIHelper;

/* loaded from: classes2.dex */
public class LenovoSleepCircleView extends View {
    private float deepSleepAngle;
    private float remSleepAngle;
    private float shallowSleepAngle;
    private float soberSleepAngle;
    private int viewHeight;
    private int viewWidth;

    public LenovoSleepCircleView(Context context) {
        super(context);
    }

    public LenovoSleepCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LenovoSleepCircleView(Context context, AttributeSet attributeSet, int i) {
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

    public void setSleepPercentageData(int i, int i2, int i3, int i4) {
        LogUtils.i("SleepNormal", "deepSleepPercent:" + i);
        LogUtils.i("SleepNormal", "shallowSleepPercent:" + i2);
        LogUtils.i("SleepNormal", "wakeSleepPercent:" + i3);
        LogUtils.i("SleepNormal", "remPercent:" + i4);
        this.deepSleepAngle = (float) (i * 0.01d * 360.0d);
        this.shallowSleepAngle = (float) (i2 * 0.01d * 360.0d);
        this.soberSleepAngle = (float) (i3 * 0.01d * 360.0d);
        this.remSleepAngle = (float) (i4 * 0.01d * 360.0d);
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
        Paint paint5 = new Paint();
        paint5.setStrokeWidth(f);
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setAntiAlias(true);
        paint5.setColor(getResources().getColor(R.color.color_sleep_rem));
        float f2 = dp2px / 2;
        RectF rectF = new RectF(f2, f2, this.viewWidth - r1, this.viewHeight - r1);
        float f3 = this.deepSleepAngle;
        if (f3 <= 0.0f && this.shallowSleepAngle <= 0.0f && this.remSleepAngle <= 0.0f) {
            canvas.drawArc(rectF, 0.0f, 360.0f, false, paint);
            return;
        }
        canvas.drawArc(rectF, 0.0f, f3, false, paint2);
        canvas.drawArc(rectF, this.deepSleepAngle, this.shallowSleepAngle, false, paint3);
        canvas.drawArc(rectF, this.deepSleepAngle + this.shallowSleepAngle, this.soberSleepAngle, false, paint4);
        canvas.drawArc(rectF, this.deepSleepAngle + this.shallowSleepAngle + this.soberSleepAngle, this.remSleepAngle, false, paint5);
    }
}
