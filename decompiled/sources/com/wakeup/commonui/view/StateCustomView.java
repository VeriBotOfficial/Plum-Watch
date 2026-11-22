package com.wakeup.commonui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.wakeup.common.network.entity.device.dial.DialPromoBanner;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public class StateCustomView extends View {
    private String state;
    private int viewHeight;
    private int viewWidth;

    public StateCustomView(Context context) {
        super(context);
        this.state = "";
    }

    public StateCustomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.state = "";
    }

    public StateCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.state = "";
    }

    public String getState() {
        return this.state;
    }

    public void setState(String str) {
        this.state = str;
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size != 0 && size2 != 0) {
            this.viewWidth = size;
            this.viewHeight = size2;
        }
        Log.e("777", "TAG = onMeasure");
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setRingColor(canvas);
    }

    public void setRingColor(Canvas canvas) {
        Paint paint = new Paint();
        float f = 25;
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(6.0f);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        paint3.setStrokeWidth(5.0f);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setAntiAlias(true);
        Paint paint4 = new Paint();
        paint4.setStrokeWidth(4.0f);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setAntiAlias(true);
        float f2 = 77;
        RectF rectF = new RectF(f2, f2, this.viewWidth - 77, this.viewHeight - 77);
        float f3 = 47;
        RectF rectF2 = new RectF(f3, f3, this.viewWidth - 47, this.viewHeight - 47);
        float f4 = 27;
        RectF rectF3 = new RectF(f4, f4, this.viewWidth - 27, this.viewHeight - 27);
        float f5 = 7;
        RectF rectF4 = new RectF(f5, f5, this.viewWidth - 7, this.viewHeight - 7);
        if (this.state.equals("NORMAL")) {
            paint.setColor(getResources().getColor(R.color.color_fcb364));
            Paint paint5 = new Paint();
            paint5.setStrokeWidth(f);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
            paint5.setAntiAlias(true);
            paint5.setColor(getResources().getColor(R.color.color_fde2c3));
            paint2.setColor(getResources().getColor(R.color.color_fcc281));
            paint3.setColor(getResources().getColor(R.color.color_fbae59));
            paint4.setColor(getResources().getColor(R.color.color_faa241));
            canvas.drawArc(rectF, 180.0f, 360.0f, false, paint);
            canvas.drawArc(rectF2, 180.0f, 360.0f, false, paint2);
            canvas.drawArc(rectF3, 180.0f, 360.0f, false, paint3);
            canvas.drawArc(rectF4, 180.0f, 360.0f, false, paint4);
            canvas.drawArc(rectF, 180.0f, 200.0f, false, paint5);
            return;
        }
        if (this.state.equals("ABNORMAL")) {
            paint.setColor(getResources().getColor(R.color.color_fed3b3));
            paint2.setColor(getResources().getColor(R.color.color_fcc281));
            paint3.setColor(getResources().getColor(R.color.color_fbae59));
            paint4.setColor(getResources().getColor(R.color.color_faa241));
            Paint paint6 = new Paint();
            paint6.setStrokeWidth(f);
            paint6.setStyle(Paint.Style.STROKE);
            paint6.setStrokeCap(Paint.Cap.ROUND);
            paint6.setAntiAlias(true);
            paint6.setColor(getResources().getColor(R.color.color_fde2c3));
            canvas.drawArc(rectF, 180.0f, 360.0f, false, paint);
            canvas.drawArc(rectF2, 180.0f, 360.0f, false, paint2);
            canvas.drawArc(rectF3, 180.0f, 360.0f, false, paint3);
            canvas.drawArc(rectF4, 180.0f, 360.0f, false, paint4);
            canvas.drawArc(rectF, 180.0f, 315.0f, false, paint6);
            return;
        }
        if (this.state.equals(DialPromoBanner.NONE)) {
            paint.setColor(getResources().getColor(R.color.color_fde2c3));
            paint2.setColor(getResources().getColor(R.color.color_fcc281));
            paint3.setColor(getResources().getColor(R.color.color_fbae59));
            paint4.setColor(getResources().getColor(R.color.color_faa241));
            canvas.drawArc(rectF, 180.0f, 360.0f, false, paint);
            canvas.drawArc(rectF, 180.0f, 360.0f, false, paint);
            canvas.drawArc(rectF2, 180.0f, 360.0f, false, paint2);
            canvas.drawArc(rectF3, 180.0f, 360.0f, false, paint3);
            canvas.drawArc(rectF4, 180.0f, 360.0f, false, paint4);
        }
    }
}
