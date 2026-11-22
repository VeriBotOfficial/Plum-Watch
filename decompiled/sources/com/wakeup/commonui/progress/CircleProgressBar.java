package com.wakeup.commonui.progress;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public class CircleProgressBar extends View {
    public ValueAnimator animatorA;
    public ValueAnimator animatorB;
    private int bgColor;
    private int centerX;
    private final Paint circlePaint;
    private int circleWidth;
    private final Paint mPointPaint;
    public int mProgressA;
    public int mProgressB;
    private final int maxValue;
    private int openAngle;
    private int progressAColor;
    private int progressBColor;
    private boolean showSmallPoint;

    public CircleProgressBar(Context context) {
        this(context, null);
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.maxValue = 100;
        this.mProgressA = 0;
        this.mProgressB = 0;
        this.openAngle = 120;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.CircleProgressBar, i, 0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == R.styleable.CircleProgressBar_circleBgColor) {
                this.bgColor = obtainStyledAttributes.getColor(index, -3355444);
            } else if (index == R.styleable.CircleProgressBar_circleProgressAColor) {
                this.progressAColor = obtainStyledAttributes.getColor(index, -16776961);
            } else if (index == R.styleable.CircleProgressBar_circleProgressBColor) {
                this.progressBColor = obtainStyledAttributes.getColor(index, -16776961);
            } else if (index == R.styleable.CircleProgressBar_circleWidth) {
                this.circleWidth = obtainStyledAttributes.getDimensionPixelSize(index, (int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics()));
            } else if (index == R.styleable.CircleProgressBar_openAngle) {
                this.openAngle = obtainStyledAttributes.getInteger(index, 120);
            } else if (index == R.styleable.CircleProgressBar_showSmallPoint) {
                this.showSmallPoint = obtainStyledAttributes.getBoolean(index, false);
            }
        }
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.circlePaint = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStrokeWidth(this.circleWidth);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.mPointPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setStrokeWidth(this.circleWidth / 2.0f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-1);
        initAnimator();
    }

    public void initAnimator() {
        ValueAnimator ofInt = ValueAnimator.ofInt(100);
        this.animatorA = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wakeup.commonui.progress.CircleProgressBar.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (CircleProgressBar.this.mProgressA == ((Integer) valueAnimator.getAnimatedValue()).intValue()) {
                    return;
                }
                CircleProgressBar.this.mProgressA = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                CircleProgressBar.this.invalidate();
            }
        });
        this.animatorA.setInterpolator(new LinearInterpolator());
        this.animatorA.setDuration(500L);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(100);
        this.animatorB = ofInt2;
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wakeup.commonui.progress.CircleProgressBar.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (CircleProgressBar.this.mProgressB == ((Integer) valueAnimator.getAnimatedValue()).intValue()) {
                    return;
                }
                CircleProgressBar.this.mProgressB = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                CircleProgressBar.this.invalidate();
            }
        });
        this.animatorB.setInterpolator(new LinearInterpolator());
        this.animatorB.setDuration(500L);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
        this.centerX = Math.min(size, size2) / 2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int i = width - (this.circleWidth / 2);
        drawCircle(canvas, width, i);
        drawPoint(canvas, i);
    }

    private void drawCircle(Canvas canvas, int i, int i2) {
        float f = i - i2;
        float f2 = i + i2;
        RectF rectF = new RectF(f, f, f2, f2);
        int i3 = (this.openAngle / 2) + 90;
        this.circlePaint.setColor(this.bgColor);
        float f3 = i3;
        canvas.drawArc(rectF, f3, 360 - this.openAngle, false, this.circlePaint);
        this.circlePaint.setColor(this.progressBColor);
        canvas.drawArc(rectF, f3, (this.mProgressB * (360 - this.openAngle)) / 100, false, this.circlePaint);
        this.circlePaint.setColor(this.progressAColor);
        canvas.drawArc(rectF, 270.0f, (this.mProgressA * (360 - this.openAngle)) / 100, false, this.circlePaint);
    }

    private void drawPoint(Canvas canvas, int i) {
        int i2;
        int i3;
        double d;
        int i4;
        double sin;
        double d2;
        int i5;
        double cos;
        if (this.showSmallPoint) {
            int i6 = this.mProgressA;
            int i7 = i6 == 0 ? 3 : (i6 * 360) / 100;
            if (i7 > 0 && i7 <= 90) {
                double d3 = (270 - i7) * 0.017453292519943295d;
                d = i;
                i2 = this.centerX - ((int) (Math.cos(d3) * d));
                i4 = this.centerX;
                sin = Math.sin(d3);
            } else {
                if (i7 > 90 && i7 <= 180) {
                    double d4 = (i7 + 90) * 0.017453292519943295d;
                    d2 = i;
                    i2 = this.centerX + ((int) (Math.cos(d4) * d2));
                    i5 = this.centerX;
                    cos = Math.sin(d4);
                } else if (i7 > 180 && i7 <= 270) {
                    double d5 = i7 * 0.017453292519943295d;
                    d2 = i;
                    i2 = this.centerX + ((int) (Math.sin(d5) * d2));
                    i5 = this.centerX;
                    cos = Math.cos(d5);
                } else if (i7 > 270 && i7 <= 360) {
                    double d6 = (i7 - 90) * 0.017453292519943295d;
                    d = i;
                    i2 = this.centerX + ((int) (Math.cos(d6) * d));
                    i4 = this.centerX;
                    sin = Math.sin(d6);
                } else {
                    i2 = 0;
                    i3 = 0;
                    canvas.drawCircle(i2, i3, 16.0f, this.mPointPaint);
                }
                i3 = i5 - ((int) (d2 * cos));
                canvas.drawCircle(i2, i3, 16.0f, this.mPointPaint);
            }
            i3 = i4 + ((int) (d * sin));
            canvas.drawCircle(i2, i3, 16.0f, this.mPointPaint);
        }
    }

    public void setCircleWidth(int i) {
        int applyDimension = (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
        this.circleWidth = applyDimension;
        this.circlePaint.setStrokeWidth(applyDimension);
        invalidate();
    }

    public void setBgColor(int i) {
        this.bgColor = i;
        invalidate();
    }

    public void setProgressAColor(int i) {
        this.progressAColor = i;
        invalidate();
    }

    public void setProgressBColor(int i) {
        this.progressAColor = i;
        invalidate();
    }

    public void setProgressColor(int i, int i2) {
        this.progressAColor = i2;
        invalidate();
    }

    public void setProgress(int i, int i2) {
        setProgressA(i);
        setProgressB(i2);
    }

    public void setProgressA(int i) {
        setProgressA(i, true);
    }

    public void setProgressA(int i, boolean z) {
        int i2 = 100;
        int i3 = (i * 100) / 100;
        if (i3 < 0) {
            i2 = 0;
        } else if (i3 <= 100) {
            i2 = i3;
        }
        if (!z) {
            this.mProgressA = i2;
            invalidate();
        } else {
            this.animatorA.setIntValues(this.mProgressA, i2);
            this.animatorA.start();
        }
    }

    public void setProgressANoAnima(int i) {
        this.mProgressA = (i * 100) / 100;
        invalidate();
    }

    public void setProgressB(int i) {
        setProgressB(i, true);
    }

    public void setProgressB(int i, boolean z) {
        int i2 = 100;
        int i3 = (i * 100) / 100;
        if (i3 < 0) {
            i2 = 0;
        } else if (i3 <= 100) {
            i2 = i3;
        }
        if (!z) {
            this.mProgressB = i2;
            invalidate();
        } else {
            this.animatorB.setIntValues(this.mProgressB, i2);
            this.animatorB.start();
        }
    }

    public void setShowSmallPoint(boolean z) {
        this.showSmallPoint = z;
        invalidate();
    }
}
