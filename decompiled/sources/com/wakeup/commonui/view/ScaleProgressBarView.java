package com.wakeup.commonui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public class ScaleProgressBarView extends View {
    private int colorHide;
    private int colorShow;
    private int lineHeight;
    private float progress;
    private Paint progressPaint;
    private int viewHeight;
    private int viewWidth;

    public ScaleProgressBarView(Context context) {
        super(context);
    }

    public ScaleProgressBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScaleProgressBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public float getProgress() {
        return this.progress;
    }

    public void setProgress(float f) {
        this.progress = f;
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size == 0 || size2 == 0) {
            return;
        }
        this.viewWidth = size;
        this.viewHeight = size2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.lineHeight = 35;
        Paint paint = new Paint();
        boolean z = true;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStrokeWidth(5.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.colorShow = getResources().getColor(R.color.white);
        this.colorHide = getResources().getColor(R.color.color_f6b25f);
        char c = 0;
        int i = 70;
        float f = 360.0f;
        float f2 = 360.0f / 70;
        float f3 = new float[]{this.viewWidth / 2.0f, this.viewHeight / 2.0f}[0] - 5.0f;
        int i2 = 0;
        while (i2 < i) {
            float f4 = i2 * f2;
            float f5 = (this.progress * f) / 100.0f;
            boolean z2 = z;
            char c2 = c;
            double d = f4 - 90.0f;
            int cos = (int) (r8[c] + ((f3 - this.lineHeight) * Math.cos(Math.toRadians(d) - 90.0d)));
            float f6 = f2;
            int sin = (int) (r8[z2 ? 1 : 0] + ((f3 - this.lineHeight) * Math.sin(Math.toRadians(d) - 90.0d)));
            double d2 = f3;
            int cos2 = (int) (r8[c2] + (Math.cos(Math.toRadians(d) - 90.0d) * d2));
            int sin2 = (int) (r8[z2 ? 1 : 0] + (d2 * Math.sin(Math.toRadians(d) - 90.0d)));
            drawRingView(canvas);
            paint.setColor(f5 > f4 ? this.colorShow : this.colorHide);
            canvas.drawLine(cos, sin, cos2, sin2, paint);
            i2++;
            z = z2 ? 1 : 0;
            c = c2;
            f2 = f6;
            i = 70;
            f = 360.0f;
        }
    }

    private void drawRingView(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStrokeWidth(3);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(R.color.color_fdca95));
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(getResources().getColor(R.color.color_fa9632));
        int i = this.viewWidth;
        int i2 = this.viewHeight;
        float f = (i - ((i / 2.0f) / 2.0f)) + 35.0f;
        RectF rectF = new RectF(((i - (i / 2.0f)) - ((i / 2.0f) / 2.0f)) - 35.0f, ((i2 - (i2 / 2.0f)) - ((i / 2.0f) / 2.0f)) - 35.0f, f, (i2 - ((i2 / 2.0f) / 2.0f)) + 35.0f);
        canvas.drawCircle(this.viewWidth / 2.0f, this.viewHeight / 2.0f, (f / 2.0f) - 15.0f, paint2);
        canvas.drawArc(rectF, 0.0f, 360.0f, false, paint);
    }
}
