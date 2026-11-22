package com.wakeup.commonui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.wakeup.commonui.utils.DrawTextUtils;
import com.wakeup.commonui.utils.UIHelper;

/* loaded from: classes2.dex */
public class ScaleView extends ViewGroup {
    public static final int SCALE_DECIMAL = 1;
    public static final int SCALE_INTEGER = 0;
    private final float baseLineHeight;
    private final float baseLineWidth;
    private final Paint mBasePaint;
    private final Paint mBgPaint;
    private float mRadius;
    private float mScaleBottom;
    private int mScaleType;
    private final Paint mSelectPaint;
    private int mSelectValue;
    private OnSelectedListener mSelectedListener;
    private float mSpace;
    private float mViewHeight;
    private float mViewWidth;
    private int max;
    private int min;
    private float offsetX;
    private float preX;
    private int scaleTableGNum;
    private final float selectLineHeight;
    private final float selectLineWidth;
    private final float selectLineWidth2;

    public interface OnSelectedListener {
        void onSelect(int i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public ScaleView(Context context) {
        this(context, null);
    }

    public ScaleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ScaleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.min = 0;
        this.max = 100;
        this.baseLineWidth = UIHelper.dp2px(1.0f);
        this.baseLineHeight = UIHelper.dp2px(10.0f);
        float dp2px = UIHelper.dp2px(4.0f);
        this.selectLineWidth = dp2px;
        this.selectLineWidth2 = UIHelper.dp2px(3.0f);
        this.selectLineHeight = UIHelper.dp2px(18.0f);
        this.scaleTableGNum = 10;
        this.mSpace = UIHelper.dp2px(6.0f);
        this.mScaleType = 0;
        setBackgroundColor(0);
        Paint paint = new Paint(1);
        this.mBgPaint = paint;
        paint.setColor(Color.parseColor("#E6E6E6"));
        paint.setStrokeWidth(UIHelper.dp2px(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint(1);
        this.mBasePaint = paint2;
        paint2.setColor(Color.parseColor("#E6E6E6"));
        paint2.setStrokeWidth(UIHelper.dp2px(1.0f));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setTextSize(UIHelper.dp2px(12.0f));
        Paint paint3 = new Paint(1);
        this.mSelectPaint = paint3;
        paint3.setColor(Color.parseColor("#FF7300"));
        paint3.setStrokeWidth(dp2px);
        paint3.setTextSize(UIHelper.dp2px(12.0f));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mViewWidth = i;
        float f = i2;
        this.mViewHeight = f;
        this.mScaleBottom = f - UIHelper.dp2px(8.0f);
        this.mRadius = this.mViewHeight / 2.0f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.preX = motionEvent.getX();
        } else if (action == 2) {
            float x = this.preX - motionEvent.getX();
            if (Math.abs(x) > this.mSpace) {
                this.offsetX += x;
                if (x > 0.0f) {
                    int i = this.mSelectValue;
                    if (i < this.max) {
                        this.mSelectValue = i + 1;
                    }
                } else {
                    int i2 = this.mSelectValue;
                    if (i2 > this.min) {
                        this.mSelectValue = i2 - 1;
                    }
                }
                checkAttach();
                this.preX = motionEvent.getX();
            }
        }
        invalidate();
        return true;
    }

    private void checkAttach() {
        int i = this.mSelectValue;
        this.offsetX = (i * this.mSpace) - (this.mViewWidth / 2.0f);
        OnSelectedListener onSelectedListener = this.mSelectedListener;
        if (onSelectedListener != null) {
            onSelectedListener.onSelect(i);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.baseLineWidth;
        float f2 = this.mViewWidth - f;
        float f3 = this.mViewHeight - f;
        float f4 = this.mRadius;
        canvas.drawRoundRect(f, f, f2, f3, f4, f4, this.mBgPaint);
        drawBaseLine(canvas);
        float f5 = this.mViewWidth / 2.0f;
        float f6 = this.selectLineWidth;
        float f7 = this.mScaleBottom;
        canvas.drawRoundRect(f5 - (f6 / 2.0f), f7, f5 + (f6 / 2.0f), f7 - this.selectLineHeight, f6 / 2.0f, f6 / 2.0f, this.mSelectPaint);
        int i = 1;
        int i2 = this.mSelectValue - 1;
        int i3 = 1;
        while (i2 >= this.min && i3 <= 3) {
            float f8 = f5 - (i3 * this.mSpace);
            float f9 = this.selectLineWidth2;
            float f10 = f8 - (f9 / 2.0f);
            float f11 = this.mScaleBottom;
            float f12 = f8 + (f9 / 2.0f);
            float selectLineHeight = f11 - getSelectLineHeight(i3);
            float f13 = this.selectLineWidth;
            canvas.drawRoundRect(f10, f11, f12, selectLineHeight, f13 / 2.0f, f13 / 2.0f, this.mSelectPaint);
            i3++;
            i2 = this.mSelectValue - i3;
        }
        int i4 = this.mSelectValue;
        while (i4 + i <= this.max && i <= 3) {
            float f14 = (i * this.mSpace) + f5;
            float f15 = this.selectLineWidth2;
            float f16 = f14 - (f15 / 2.0f);
            float f17 = this.mScaleBottom;
            float f18 = f14 + (f15 / 2.0f);
            float selectLineHeight2 = f17 - getSelectLineHeight(i);
            float f19 = this.selectLineWidth;
            canvas.drawRoundRect(f16, f17, f18, selectLineHeight2, f19 / 2.0f, f19 / 2.0f, this.mSelectPaint);
            i++;
            i4 = this.mSelectValue;
        }
    }

    private void drawBaseLine(Canvas canvas) {
        int dp2px;
        canvas.save();
        float f = this.baseLineWidth;
        float f2 = this.mRadius;
        canvas.clipRect(f + f2, f * 2.0f, (this.mViewWidth - f) - f2, this.mViewHeight - (f * 2.0f));
        canvas.translate(-this.offsetX, 0.0f);
        for (int i = this.min; i <= this.max; i++) {
            float f3 = i;
            float f4 = f3 * this.mSpace;
            if (i % this.scaleTableGNum == 0) {
                String str = i + "";
                if (this.mScaleType == 1) {
                    str = (f3 / 10.0f) + "";
                }
                float textWidth = f4 - (DrawTextUtils.getTextWidth(str, this.mBasePaint) / 2.0f);
                float dp2px2 = (this.mScaleBottom - this.baseLineHeight) - UIHelper.dp2px(8.0f);
                Paint paint = Math.abs(this.mSelectValue - i) <= 3 ? this.mSelectPaint : this.mBasePaint;
                int i2 = this.mSelectValue;
                if (i == i2) {
                    dp2px = UIHelper.dp2px(4.0f);
                } else if (Math.abs(i2 - i) == 1) {
                    dp2px = UIHelper.dp2px(3.0f);
                } else {
                    if (Math.abs(this.mSelectValue - i) == 2) {
                        dp2px = UIHelper.dp2px(2.0f);
                    }
                    canvas.drawText(str, textWidth, dp2px2, paint);
                }
                dp2px2 -= dp2px;
                canvas.drawText(str, textWidth, dp2px2, paint);
            }
            float f5 = this.mScaleBottom;
            canvas.drawLine(f4, f5 - this.baseLineHeight, f4, f5, this.mBasePaint);
        }
        canvas.restore();
    }

    public void setColor(int i) {
        this.mSelectPaint.setColor(i);
    }

    private float getSelectLineHeight(int i) {
        return this.selectLineHeight - UIHelper.dp2px(i * 2);
    }

    public void setRang(int i, int i2) {
        this.min = i;
        this.max = i2;
        this.mSelectValue = (i2 + i) / 2;
        invalidate();
    }

    public void setValue(final int i) {
        post(new Runnable() { // from class: com.wakeup.commonui.view.ScaleView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ScaleView.this.lambda$setValue$0(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setValue$0(int i) {
        this.mSelectValue = i;
        checkAttach();
        invalidate();
    }

    public void setSelectedListener(OnSelectedListener onSelectedListener) {
        this.mSelectedListener = onSelectedListener;
    }

    public void setScaleType(int i) {
        this.mScaleType = i;
    }
}
