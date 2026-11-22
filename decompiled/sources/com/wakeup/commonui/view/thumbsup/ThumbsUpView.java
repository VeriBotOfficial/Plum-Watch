package com.wakeup.commonui.view.thumbsup;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;

/* loaded from: classes2.dex */
public class ThumbsUpView extends View {
    private boolean isThumbsUpOn;
    private Paint mBitmapPaint;
    private int mCircleColor;
    private Paint mCirclePaint;
    private Path mCirclePath;
    private int mDecorationHeight;
    private Rect mDecorationRectDst;
    private Rect mDecorationRectSrc;
    private int mDecorationWidth;
    private long mDuration;
    private float mFraction;
    private int mRadius;
    private boolean mShowCircle;
    private boolean mShowDecoration;
    private int mThumbsHeight;
    private Rect mThumbsRectSrc;
    private Rect mThumbsRectSrcDst;
    private Rect mThumbsRectSrcDstReal;
    private int mThumbsWidth;
    private final Bitmap thumbsUpDecoration;
    private final Bitmap thumbsUpOff;
    private final Bitmap thumbsUpOn;

    public ThumbsUpView(Context context, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        super(context);
        this.isThumbsUpOn = false;
        this.thumbsUpOn = bitmap;
        this.thumbsUpOff = bitmap2;
        this.thumbsUpDecoration = bitmap3;
        init();
    }

    public void setShowCircle(boolean z) {
        this.mShowCircle = z;
    }

    public void setShowDecoration(boolean z) {
        this.mShowDecoration = z;
    }

    public void setCircleColor(int i) {
        this.mCircleColor = i;
        this.mCirclePaint.setColor(i);
    }

    public void setDuration(long j) {
        this.mDuration = j;
    }

    public void initThumbsUpOn(boolean z) {
        this.isThumbsUpOn = z;
        postInvalidate();
    }

    public void setThumbsUpOn(boolean z) {
        this.isThumbsUpOn = z;
        runAnim();
    }

    private void init() {
        this.mThumbsWidth = this.thumbsUpOn.getWidth();
        this.mThumbsHeight = this.thumbsUpOn.getHeight();
        this.mDecorationWidth = this.thumbsUpDecoration.getWidth();
        this.mDecorationHeight = this.thumbsUpDecoration.getHeight();
        this.mCircleColor = Color.parseColor("#22FF0000");
        this.mThumbsRectSrc = new Rect(0, 0, this.mThumbsWidth, this.mThumbsHeight);
        this.mThumbsRectSrcDst = new Rect();
        this.mThumbsRectSrcDstReal = new Rect();
        this.mDecorationRectSrc = new Rect(0, 0, this.mDecorationWidth, this.mDecorationHeight);
        this.mDecorationRectDst = new Rect();
        this.mBitmapPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.mCirclePaint = paint;
        paint.setColor(this.mCircleColor);
        this.mCirclePaint.setStyle(Paint.Style.STROKE);
        this.mCirclePaint.setStrokeWidth(5.0f);
        this.mCirclePath = new Path();
        this.mShowCircle = true;
        this.mShowDecoration = true;
        this.mDuration = ThumbsUpCountView.ANIM_DURATION;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight() + Math.max(this.mThumbsWidth, this.mDecorationWidth);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = this.mThumbsHeight;
        int i4 = this.mDecorationHeight;
        this.mRadius = (i3 + i4) / 2;
        setMeasuredDimension(Math.min(paddingLeft, View.MeasureSpec.getSize(i)), Math.min(paddingBottom + i3 + i4, View.MeasureSpec.getSize(i2)));
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        this.mThumbsRectSrcDst.left = measuredWidth - (this.mThumbsWidth / 2);
        this.mThumbsRectSrcDst.top = measuredHeight - (this.mThumbsHeight / 2);
        this.mThumbsRectSrcDst.right = (this.mThumbsWidth / 2) + measuredWidth;
        this.mThumbsRectSrcDst.bottom = measuredHeight + (this.mThumbsHeight / 2);
        this.mThumbsRectSrcDstReal.left = this.mThumbsRectSrcDst.left;
        this.mThumbsRectSrcDstReal.top = this.mThumbsRectSrcDst.top;
        this.mThumbsRectSrcDstReal.right = this.mThumbsRectSrcDst.right;
        this.mThumbsRectSrcDstReal.bottom = this.mThumbsRectSrcDst.bottom;
        this.mDecorationRectDst.left = measuredWidth - (this.mDecorationWidth / 2);
        this.mDecorationRectDst.top = this.mThumbsRectSrcDst.top - (this.mDecorationHeight / 2);
        this.mDecorationRectDst.right = measuredWidth + (this.mDecorationWidth / 2);
        this.mDecorationRectDst.bottom = this.mThumbsRectSrcDst.top + (this.mDecorationHeight / 2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.isThumbsUpOn) {
            canvas.save();
            if (!this.mCirclePath.isEmpty()) {
                if (this.mShowCircle) {
                    canvas.drawPath(this.mCirclePath, this.mCirclePaint);
                }
                canvas.clipPath(this.mCirclePath);
            }
            canvas.drawBitmap(this.thumbsUpOn, this.mThumbsRectSrc, this.mThumbsRectSrcDstReal, this.mBitmapPaint);
            if (this.mShowDecoration) {
                canvas.drawBitmap(this.thumbsUpDecoration, this.mDecorationRectSrc, this.mDecorationRectDst, this.mBitmapPaint);
            }
            canvas.restore();
            return;
        }
        canvas.drawBitmap(this.thumbsUpOff, this.mThumbsRectSrc, this.mThumbsRectSrcDstReal, this.mBitmapPaint);
    }

    private void runAnim() {
        float[] fArr;
        if (this.isThumbsUpOn) {
            fArr = new float[]{0.8f, 1.2f, 1.0f};
        } else {
            fArr = new float[]{1.0f, 0.8f, 1.0f};
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wakeup.commonui.view.thumbsup.ThumbsUpView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ThumbsUpView.this.mFraction = valueAnimator.getAnimatedFraction();
                ThumbsUpView.this.scaleThumbsRect(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ThumbsUpView.this.postInvalidate();
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.wakeup.commonui.view.thumbsup.ThumbsUpView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                ThumbsUpView.this.mCirclePath.reset();
                ThumbsUpView.this.postInvalidate();
            }
        });
        ofFloat.setDuration(this.mDuration);
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scaleThumbsRect(float f) {
        float width = (this.mThumbsRectSrcDst.width() - (this.mThumbsRectSrcDst.width() * f)) / 2.0f;
        this.mThumbsRectSrcDstReal.left = (int) (this.mThumbsRectSrcDst.left + width);
        float height = (this.mThumbsRectSrcDst.height() - (this.mThumbsRectSrcDst.height() * f)) / 2.0f;
        this.mThumbsRectSrcDstReal.top = (int) (this.mThumbsRectSrcDst.top + height);
        this.mThumbsRectSrcDstReal.right = (int) (this.mThumbsRectSrcDst.right - width);
        this.mThumbsRectSrcDstReal.bottom = (int) (this.mThumbsRectSrcDst.bottom - height);
        float height2 = (this.mDecorationRectDst.height() / 2) * this.mFraction;
        this.mCirclePath.reset();
        this.mCirclePath.addCircle(this.mThumbsRectSrcDst.centerX(), this.mThumbsRectSrcDst.centerY(), (this.mThumbsRectSrcDst.height() / 2) + height2, Path.Direction.CW);
    }
}
