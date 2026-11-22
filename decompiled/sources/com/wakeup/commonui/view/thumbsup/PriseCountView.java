package com.wakeup.commonui.view.thumbsup;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* loaded from: classes2.dex */
public class PriseCountView extends View {
    private boolean isPriseOn;
    private int mCount;
    private long mDuration;
    private float mFraction;
    private int mOldCount;
    private Paint mPaint;
    private String[] mTextCount;
    private final int mTextOffColor;
    private final int mTextOnColor;
    private int mTransparentTextOffColor;
    private int mTransparentTextOnColor;
    private int offYBaseline;
    private float offsetYProgress;
    private final float textSize;

    public PriseCountView(Context context, int i, int i2, int i3, float f) {
        super(context);
        this.mFraction = 1.0f;
        this.mCount = i;
        this.mTextOnColor = i2;
        this.mTextOffColor = i3;
        this.textSize = f;
        init();
    }

    private void init() {
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setColor(this.mTextOffColor);
        this.mPaint.setTextSize(this.textSize);
        String[] strArr = new String[3];
        this.mTextCount = strArr;
        strArr[0] = String.valueOf(this.mCount);
        this.mTransparentTextOnColor = Color.argb(0, Color.red(this.mTextOnColor), Color.green(this.mTextOnColor), Color.blue(this.mTextOnColor));
        this.mTransparentTextOffColor = Color.argb(0, Color.red(this.mTextOffColor), Color.green(this.mTextOffColor), Color.blue(this.mTextOffColor));
        this.mDuration = ThumbsUpCountView.ANIM_DURATION;
    }

    public void setDuration(long j) {
        this.mDuration = j;
    }

    public void setCount(int i, boolean z) {
        this.mOldCount = this.mCount;
        this.mCount = i;
        this.isPriseOn = z;
        if (analysisCount()) {
            startAnim();
        } else {
            requestLayout();
        }
    }

    private void startAnim() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0, this.offYBaseline);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wakeup.commonui.view.thumbsup.PriseCountView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PriseCountView.this.mFraction = valueAnimator.getAnimatedFraction();
                PriseCountView.this.offsetYProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PriseCountView.this.postInvalidate();
            }
        });
        ofFloat.setDuration(this.mDuration);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.start();
    }

    private boolean analysisCount() {
        int i = this.mCount;
        int i2 = this.mOldCount;
        if (i == i2) {
            return false;
        }
        if (Math.abs(i - i2) != 1) {
            this.mTextCount[0] = String.valueOf(this.mCount);
            String[] strArr = this.mTextCount;
            strArr[1] = "";
            strArr[2] = "";
            return false;
        }
        int i3 = this.mCount;
        this.offYBaseline = i3 > this.mOldCount ? 1 : -1;
        String valueOf = String.valueOf(i3);
        String valueOf2 = String.valueOf(this.mOldCount);
        if (valueOf.length() != valueOf2.length()) {
            String[] strArr2 = this.mTextCount;
            strArr2[0] = "";
            strArr2[1] = valueOf2;
            strArr2[2] = valueOf;
            requestLayout();
            return true;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= valueOf.toCharArray().length) {
                break;
            }
            if (valueOf.toCharArray()[i4] != valueOf2.toCharArray()[i4]) {
                this.mTextCount[0] = i4 != 0 ? valueOf.substring(0, i4) : "";
                this.mTextCount[1] = valueOf2.substring(i4);
                this.mTextCount[2] = valueOf.substring(i4);
            } else {
                i4++;
            }
        }
        return true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        String valueOf = String.valueOf(this.mCount);
        this.mPaint.measureText(valueOf);
        setMeasuredDimension((int) (getPaddingLeft() + getPaddingRight() + this.mPaint.measureText(valueOf)), (int) (getPaddingTop() + getPaddingBottom() + (this.mPaint.getTextSize() * 3.0f)));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint.FontMetrics fontMetrics = this.mPaint.getFontMetrics();
        float measuredHeight = ((getMeasuredHeight() / 2) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f);
        Paint paint = this.mPaint;
        float f = this.mFraction;
        boolean z = this.isPriseOn;
        paint.setColor(getCurrentColor(f, z ? this.mTextOffColor : this.mTextOnColor, z ? this.mTextOnColor : this.mTextOffColor));
        float f2 = 0.0f;
        if (!TextUtils.isEmpty(this.mTextCount[0])) {
            canvas.drawText(this.mTextCount[0], getPaddingLeft(), this.mTextCount[0].length(), 0.0f, measuredHeight, this.mPaint);
            f2 = this.mPaint.measureText(this.mTextCount[0]);
        }
        float f3 = f2;
        float textSize = this.mPaint.getTextSize() * this.offsetYProgress;
        this.mPaint.setColor(getCurrentColor(this.mFraction, this.isPriseOn ? this.mTextOffColor : this.mTextOnColor, this.mTransparentTextOffColor));
        if (!TextUtils.isEmpty(this.mTextCount[1])) {
            canvas.drawText(this.mTextCount[1], getPaddingLeft(), this.mTextCount[1].length(), f3, measuredHeight - textSize, this.mPaint);
        }
        Paint paint2 = this.mPaint;
        float f4 = this.mFraction;
        boolean z2 = this.isPriseOn;
        paint2.setColor(getCurrentColor(f4, z2 ? this.mTransparentTextOffColor : this.mTransparentTextOnColor, z2 ? this.mTextOnColor : this.mTextOffColor));
        if (TextUtils.isEmpty(this.mTextCount[2])) {
            return;
        }
        canvas.drawText(this.mTextCount[2], getPaddingLeft(), this.mTextCount[2].length(), f3, (measuredHeight + (this.mPaint.getTextSize() * this.offYBaseline)) - textSize, this.mPaint);
    }

    private int getCurrentColor(float f, int i, int i2) {
        int red = Color.red(i);
        int blue = Color.blue(i);
        int green = Color.green(i);
        int alpha = Color.alpha(i);
        int red2 = Color.red(i2);
        int blue2 = Color.blue(i2);
        return Color.argb((int) (alpha + (f * (Color.alpha(i2) - alpha))), (int) (red + ((red2 - red) * f)), (int) (green + ((Color.green(i2) - green) * f)), (int) (blue + ((blue2 - blue) * f)));
    }
}
