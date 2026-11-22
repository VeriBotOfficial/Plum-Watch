package com.wakeup.commonui.progress;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public class CircleScaleProgressBar extends View {
    private int colorHide;
    private int colorShow;
    private int lineHeight;
    private int lineWidth;
    private int mHeight;
    private int mWidth;
    private int progress;
    private Paint progressPaint;

    public CircleScaleProgressBar(Context context) {
        this(context, null);
    }

    public CircleScaleProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleScaleProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lineWidth = 10;
        this.lineHeight = 40;
        Paint paint = new Paint();
        this.progressPaint = paint;
        paint.setAntiAlias(true);
        this.progressPaint.setDither(true);
        this.progressPaint.setStrokeWidth(this.lineWidth);
        this.progressPaint.setStyle(Paint.Style.STROKE);
        this.progressPaint.setStrokeCap(Paint.Cap.ROUND);
        this.colorShow = getResources().getColor(R.color.color_00bbff);
        this.colorHide = getResources().getColor(R.color.color_cccccc);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
        int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), makeMeasureSpec);
        int defaultSize2 = getDefaultSize(getSuggestedMinimumHeight(), makeMeasureSpec);
        if (defaultSize == 0 || defaultSize2 == 0) {
            return;
        }
        this.mWidth = defaultSize;
        this.mHeight = defaultSize2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        char c = 0;
        boolean z = true;
        float[] fArr = {this.mWidth / 2.0f, this.mHeight / 2.0f};
        int i = 60;
        float f = 360.0f;
        float f2 = 360.0f / 60;
        float f3 = fArr[0] - 10.0f;
        int i2 = 0;
        while (i2 < i) {
            float f4 = i2 * f2;
            float f5 = (this.progress * f) / 100.0f;
            boolean z2 = z;
            float[] fArr2 = fArr;
            double d = f4 - 90.0f;
            int cos = (int) (fArr[c] + ((f3 - this.lineHeight) * Math.cos(Math.toRadians(d))));
            int sin = (int) (fArr2[z2 ? 1 : 0] + ((f3 - this.lineHeight) * Math.sin(Math.toRadians(d))));
            double d2 = f3;
            int cos2 = (int) (fArr2[c] + (Math.cos(Math.toRadians(d)) * d2));
            float f6 = f3;
            int sin2 = (int) (fArr2[z2 ? 1 : 0] + (d2 * Math.sin(Math.toRadians(d))));
            this.progressPaint.setColor(f5 > f4 ? this.colorShow : this.colorHide);
            canvas.drawLine(cos, sin, cos2, sin2, this.progressPaint);
            i2++;
            fArr = fArr2;
            z = z2 ? 1 : 0;
            f3 = f6;
            i = 60;
            c = 0;
            f = 360.0f;
        }
    }

    public void setProgress(int i) {
        this.progress = i;
        invalidate();
    }

    public int getProgress() {
        return this.progress;
    }
}
