package com.wakeup.commonui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public class RulerView extends View {
    private boolean mAlphaEnable;
    private int mHeight;
    private int mLastX;
    private int mLineColor;
    private float mLineMaxHeight;
    private float mLineMidHeight;
    private float mLineMinHeight;
    private Paint mLinePaint;
    private float mLineSpaceWidth;
    private float mLineWidth;
    private OnValueChangeListener mListener;
    private int mMaxOffset;
    private float mMaxValue;
    private float mMinValue;
    private int mMinVelocity;
    private int mMove;
    private float mOffset;
    private float mPerValue;
    private Scroller mScroller;
    private float mSelectorValue;
    private int mTextColor;
    private float mTextHeight;
    private float mTextMarginTop;
    private Paint mTextPaint;
    private float mTextSize;
    private int mTotalLine;
    private VelocityTracker mVelocityTracker;
    private int mWidth;

    public interface OnValueChangeListener {
        void onValueChange(float f);
    }

    public static int myfloat(float f) {
        return (int) ((f * 1.0f) + 0.5f);
    }

    public RulerView(Context context) {
        this(context, null);
    }

    public RulerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RulerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSelectorValue = 50.0f;
        this.mMaxValue = 200.0f;
        this.mMinValue = 100.0f;
        this.mPerValue = 1.0f;
        this.mLineSpaceWidth = 5.0f;
        this.mLineWidth = 4.0f;
        this.mLineMaxHeight = 420.0f;
        this.mLineMidHeight = 30.0f;
        this.mLineMinHeight = 17.0f;
        this.mTextMarginTop = 10.0f;
        this.mTextSize = 30.0f;
        this.mAlphaEnable = false;
        this.mLineColor = -7829368;
        this.mTextColor = -16777216;
        init(context, attributeSet);
    }

    protected void init(Context context, AttributeSet attributeSet) {
        Log.d("zkk---", "init");
        this.mScroller = new Scroller(context);
        this.mLineSpaceWidth = myfloat(25.0f);
        this.mLineWidth = myfloat(2.0f);
        this.mLineMaxHeight = myfloat(100.0f);
        this.mLineMidHeight = myfloat(60.0f);
        this.mLineMinHeight = myfloat(40.0f);
        this.mTextHeight = myfloat(40.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RulerView);
        this.mAlphaEnable = obtainStyledAttributes.getBoolean(R.styleable.RulerView_alphaEnable, this.mAlphaEnable);
        this.mLineSpaceWidth = obtainStyledAttributes.getDimension(R.styleable.RulerView_lineSpaceWidth, this.mLineSpaceWidth);
        this.mLineWidth = obtainStyledAttributes.getDimension(R.styleable.RulerView_lineWidth, this.mLineWidth);
        this.mLineMaxHeight = obtainStyledAttributes.getDimension(R.styleable.RulerView_lineMaxHeight, this.mLineMaxHeight);
        this.mLineMidHeight = obtainStyledAttributes.getDimension(R.styleable.RulerView_lineMidHeight, this.mLineMidHeight);
        this.mLineMinHeight = obtainStyledAttributes.getDimension(R.styleable.RulerView_lineMinHeight, this.mLineMinHeight);
        this.mLineColor = obtainStyledAttributes.getColor(R.styleable.RulerView_lineColor, this.mLineColor);
        this.mTextSize = obtainStyledAttributes.getDimension(R.styleable.RulerView_textSize, this.mTextSize);
        this.mTextColor = obtainStyledAttributes.getColor(R.styleable.RulerView_textColor, this.mTextColor);
        this.mTextMarginTop = obtainStyledAttributes.getDimension(R.styleable.RulerView_textMarginTop, this.mTextMarginTop);
        this.mSelectorValue = obtainStyledAttributes.getFloat(R.styleable.RulerView_selectorValue, 0.0f);
        this.mMinValue = obtainStyledAttributes.getFloat(R.styleable.RulerView_minValue, 0.0f);
        this.mMaxValue = obtainStyledAttributes.getFloat(R.styleable.RulerView_maxValue, 100.0f);
        this.mPerValue = obtainStyledAttributes.getFloat(R.styleable.RulerView_perValue, 0.1f);
        this.mMinVelocity = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        Paint paint = new Paint(1);
        this.mTextPaint = paint;
        paint.setTextSize(this.mTextSize);
        this.mTextPaint.setColor(this.mTextColor);
        this.mTextHeight = getFontHeight(this.mTextPaint);
        Paint paint2 = new Paint(1);
        this.mLinePaint = paint2;
        paint2.setStrokeWidth(this.mLineWidth);
        this.mLinePaint.setColor(this.mLineColor);
    }

    private float getFontHeight(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public void setValue(float f, float f2, float f3, float f4) {
        this.mSelectorValue = f;
        this.mMaxValue = f3;
        this.mMinValue = f2;
        float f5 = (int) (f4 * 10.0f);
        this.mPerValue = f5;
        this.mTotalLine = ((int) (((f3 * 10.0f) - (f2 * 10.0f)) / f5)) + 1;
        float f6 = this.mLineSpaceWidth;
        this.mMaxOffset = (int) ((-r5) * f6);
        this.mOffset = ((f2 - f) / f5) * f6 * 10.0f;
        Log.d("zkk===", "mOffset--           " + this.mOffset + "         =====mMaxOffset    " + this.mMaxOffset + "  mTotalLine  " + this.mTotalLine);
        invalidate();
        setVisibility(0);
    }

    public void setOnValueChangeListener(OnValueChangeListener onValueChangeListener) {
        this.mListener = onValueChangeListener;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.mWidth = i;
        this.mHeight = i2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        super.onDraw(canvas);
        int i = this.mWidth / 2;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.mTotalLine) {
            float f2 = i;
            float f3 = i2;
            float f4 = this.mOffset + f2 + (this.mLineSpaceWidth * f3);
            if (f4 < 0.0f || f4 > this.mWidth) {
                canvas2 = canvas;
            } else {
                int i4 = i2 % 10;
                if (i4 == 0) {
                    f = this.mLineMaxHeight;
                } else if (i2 % 5 == 0) {
                    f = this.mLineMidHeight;
                } else {
                    f = this.mLineMinHeight;
                }
                float f5 = f;
                if (this.mAlphaEnable) {
                    float abs = 1.0f - (Math.abs(f4 - f2) / f2);
                    i3 = (int) (255.0f * abs * abs);
                    this.mLinePaint.setAlpha(i3);
                }
                canvas2 = canvas;
                canvas2.drawLine(f4, 0.0f, f4, f5, this.mLinePaint);
                if (i4 == 0) {
                    String valueOf = String.valueOf((int) (this.mMinValue + ((f3 * this.mPerValue) / 10.0f)));
                    if (this.mAlphaEnable) {
                        this.mTextPaint.setAlpha(i3);
                    }
                    canvas2.drawText(valueOf, f4 - (this.mTextPaint.measureText(valueOf) / 2.0f), f5 + this.mTextMarginTop + this.mTextHeight, this.mTextPaint);
                }
            }
            i2++;
            canvas = canvas2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r0 != 3) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "zkk---"
            java.lang.String r1 = "onTouchEvent-"
            android.util.Log.d(r0, r1)
            int r0 = r5.getAction()
            float r1 = r5.getX()
            int r1 = (int) r1
            android.view.VelocityTracker r2 = r4.mVelocityTracker
            if (r2 != 0) goto L1c
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r4.mVelocityTracker = r2
        L1c:
            android.view.VelocityTracker r2 = r4.mVelocityTracker
            r2.addMovement(r5)
            r5 = 0
            r2 = 1
            if (r0 == 0) goto L3e
            if (r0 == r2) goto L37
            r3 = 2
            if (r0 == r3) goto L2e
            r3 = 3
            if (r0 == r3) goto L37
            goto L47
        L2e:
            int r5 = r4.mLastX
            int r5 = r5 - r1
            r4.mMove = r5
            r4.changeMoveAndValue()
            goto L47
        L37:
            r4.countMoveEnd()
            r4.countVelocityTracker()
            return r5
        L3e:
            android.widget.Scroller r0 = r4.mScroller
            r0.forceFinished(r2)
            r4.mLastX = r1
            r4.mMove = r5
        L47:
            r4.mLastX = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.commonui.view.RulerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void countVelocityTracker() {
        Log.d("zkk---", "countVelocityTracker-");
        this.mVelocityTracker.computeCurrentVelocity(1000);
        float xVelocity = this.mVelocityTracker.getXVelocity();
        if (Math.abs(xVelocity) > this.mMinVelocity) {
            this.mScroller.fling(0, 0, (int) xVelocity, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
        }
    }

    private void countMoveEnd() {
        float f = this.mOffset - this.mMove;
        this.mOffset = f;
        int i = this.mMaxOffset;
        if (f <= i) {
            this.mOffset = i;
        } else if (f >= 0.0f) {
            this.mOffset = 0.0f;
        }
        this.mLastX = 0;
        this.mMove = 0;
        float f2 = this.mMinValue;
        float round = Math.round((Math.abs(this.mOffset) * 1.0f) / this.mLineSpaceWidth);
        float f3 = this.mPerValue;
        float f4 = f2 + ((round * f3) / 10.0f);
        this.mSelectorValue = f4;
        this.mOffset = (((this.mMinValue - f4) * 10.0f) / f3) * this.mLineSpaceWidth;
        notifyValueChange();
        postInvalidate();
    }

    private void changeMoveAndValue() {
        float f = this.mOffset - this.mMove;
        this.mOffset = f;
        int i = this.mMaxOffset;
        if (f <= i) {
            this.mOffset = i;
            this.mMove = 0;
            this.mScroller.forceFinished(true);
        } else if (f >= 0.0f) {
            this.mOffset = 0.0f;
            this.mMove = 0;
            this.mScroller.forceFinished(true);
        }
        this.mSelectorValue = this.mMinValue + ((Math.round((Math.abs(this.mOffset) * 1.0f) / this.mLineSpaceWidth) * this.mPerValue) / 10.0f);
        notifyValueChange();
        postInvalidate();
    }

    private void notifyValueChange() {
        OnValueChangeListener onValueChangeListener = this.mListener;
        if (onValueChangeListener != null) {
            onValueChangeListener.onValueChange(this.mSelectorValue);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        Log.d("zkk---", "computeScroll-");
        super.computeScroll();
        if (this.mScroller.computeScrollOffset()) {
            if (this.mScroller.getCurrX() == this.mScroller.getFinalX()) {
                countMoveEnd();
                return;
            }
            int currX = this.mScroller.getCurrX();
            this.mMove = this.mLastX - currX;
            changeMoveAndValue();
            this.mLastX = currX;
        }
    }
}
