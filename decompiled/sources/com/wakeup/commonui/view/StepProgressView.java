package com.wakeup.commonui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public class StepProgressView extends View {
    private final float angleLength;
    private final int animationLength;
    private final float borderWidth;
    private float currentAngleLength;
    private float numberTextSize;
    private final float startAngle;
    private String stepNumber;
    private String totalStepNum;

    public StepProgressView(Context context) {
        super(context);
        this.borderWidth = 38.0f;
        this.startAngle = -90.0f;
        this.angleLength = 360.0f;
        this.animationLength = 3000;
        this.numberTextSize = 0.0f;
        this.stepNumber = "0";
        this.totalStepNum = "0";
        this.currentAngleLength = 0.0f;
    }

    public StepProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.borderWidth = 38.0f;
        this.startAngle = -90.0f;
        this.angleLength = 360.0f;
        this.animationLength = 3000;
        this.numberTextSize = 0.0f;
        this.stepNumber = "0";
        this.totalStepNum = "0";
        this.currentAngleLength = 0.0f;
    }

    public StepProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.borderWidth = 38.0f;
        this.startAngle = -90.0f;
        this.angleLength = 360.0f;
        this.animationLength = 3000;
        this.numberTextSize = 0.0f;
        this.stepNumber = "0";
        this.totalStepNum = "0";
        this.currentAngleLength = 0.0f;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2;
        float f = (2.0f * width) - 38.0f;
        RectF rectF = new RectF(38.0f, 38.0f, f, f);
        drawArcYellow(canvas, rectF);
        drawArcRed(canvas, rectF);
        drawTextNumber(canvas, width);
        drawTextStepString(canvas, width);
        drawTextTopStepString(canvas, width);
    }

    private void drawArcYellow(Canvas canvas, RectF rectF) {
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.color_ffc6a0));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(38.0f);
        canvas.drawArc(rectF, -90.0f, 360.0f, false, paint);
    }

    private void drawArcRed(Canvas canvas, RectF rectF) {
        Paint paint = new Paint();
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(38.0f);
        paint.setColor(getResources().getColor(R.color.white));
        canvas.drawArc(rectF, -90.0f, this.currentAngleLength, false, paint);
    }

    private void drawTextNumber(Canvas canvas, float f) {
        Paint paint = new Paint();
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        paint.setTextSize(this.numberTextSize);
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
        paint.setColor(getResources().getColor(R.color.white));
        Rect rect = new Rect();
        String str = this.stepNumber;
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(this.stepNumber, f, (getHeight() / 2) + (rect.height() / 2), paint);
    }

    private void drawTextStepString(Canvas canvas, float f) {
        Paint paint = new Paint();
        paint.setTextSize(dipToPx(10.0f));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(R.color.color_ffeee6));
        String str = this.totalStepNum;
        paint.getTextBounds(str, 0, str.length(), new Rect());
        canvas.drawText(str, f, (getHeight() / 2) + r2.height() + getFontHeight(this.numberTextSize), paint);
    }

    private void drawTextTopStepString(Canvas canvas, float f) {
        Paint paint = new Paint();
        paint.setTextSize(dipToPx(10.0f));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(R.color.color_ffeee6));
        String string = getResources().getString(R.string.my_step);
        paint.getTextBounds(string, 0, string.length(), new Rect());
        canvas.drawText(string, f, (getHeight() / 2) - getFontHeight(this.numberTextSize), paint);
    }

    public int getFontHeight(float f) {
        Paint paint = new Paint();
        paint.setTextSize(f);
        Rect rect = new Rect();
        String str = this.stepNumber;
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    private int dipToPx(float f) {
        return (int) ((getContext().getResources().getDisplayMetrics().density * f) + ((f >= 0.0f ? 1 : -1) * 0.5f));
    }

    public void setCurrentCount(int i, int i2) {
        this.stepNumber = i2 + "";
        this.totalStepNum = i + "";
        setTextSize(i2);
        float f = i <= 0 ? 0.0f : i2 / i;
        if (f > 1.0f) {
            f = 1.0f;
        }
        setAnimation(0.0f, f * 360.0f, 3000);
    }

    private void setAnimation(float f, float f2, int i) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(i);
        ofFloat.setTarget(Float.valueOf(this.currentAngleLength));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wakeup.commonui.view.StepProgressView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                StepProgressView.this.currentAngleLength = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                StepProgressView.this.invalidate();
            }
        });
        ofFloat.start();
    }

    public void setTextSize(int i) {
        int length = String.valueOf(i).length();
        if (length <= 4) {
            this.numberTextSize = dipToPx(18.0f);
            return;
        }
        if (length <= 6) {
            this.numberTextSize = dipToPx(14.0f);
        } else if (length <= 8) {
            this.numberTextSize = dipToPx(12.0f);
        } else {
            this.numberTextSize = dipToPx(10.0f);
        }
    }
}
