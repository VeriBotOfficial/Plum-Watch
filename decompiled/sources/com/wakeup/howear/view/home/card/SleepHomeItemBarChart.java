package com.wakeup.howear.view.home.card;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.wakeup.commonui.utils.UIHelper;
import com.wakeup.commponent.module.data.HealthData;
import java.util.List;

/* loaded from: classes4.dex */
public class SleepHomeItemBarChart extends View {
    private ValueAnimator animator;
    private int animatorProgress;
    private final int dp3;
    private final int lineHeight;
    private List<HealthData> mList;
    private Paint mPaintDeep;
    private Paint mPaintDeepLine;
    private Paint mPaintShallow;
    private Paint mPaintShallowLine;
    private Paint mPaintSober;
    private Paint mPaintSoberLine;
    private final int padding;

    public SleepHomeItemBarChart(Context context) {
        super(context);
        this.padding = 10;
        this.lineHeight = UIHelper.dp2px(4.0f);
        this.dp3 = UIHelper.dp2px(3.0f);
        this.animatorProgress = 0;
        initData();
    }

    public SleepHomeItemBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.padding = 10;
        this.lineHeight = UIHelper.dp2px(4.0f);
        this.dp3 = UIHelper.dp2px(3.0f);
        this.animatorProgress = 0;
        initData();
    }

    public void setList(List<HealthData> list) {
        this.mList = list;
        setAnimator();
    }

    private void initData() {
        if (this.mPaintDeepLine == null) {
            Paint paint = new Paint();
            this.mPaintDeepLine = paint;
            paint.setStyle(Paint.Style.FILL);
            this.mPaintDeepLine.setColor(Color.parseColor("#7D7AFE"));
            this.mPaintDeepLine.setStrokeWidth(2.0f);
        }
        if (this.mPaintDeep == null) {
            Paint paint2 = new Paint();
            this.mPaintDeep = paint2;
            paint2.setStyle(Paint.Style.FILL);
            this.mPaintDeep.setStrokeWidth(2.0f);
        }
        if (this.mPaintShallowLine == null) {
            Paint paint3 = new Paint();
            this.mPaintShallowLine = paint3;
            paint3.setStyle(Paint.Style.FILL);
            this.mPaintShallowLine.setColor(Color.parseColor("#77E1EB"));
            this.mPaintShallowLine.setStrokeWidth(2.0f);
        }
        if (this.mPaintShallow == null) {
            Paint paint4 = new Paint();
            this.mPaintShallow = paint4;
            paint4.setStyle(Paint.Style.FILL);
            this.mPaintShallow.setStrokeWidth(2.0f);
        }
        if (this.mPaintSoberLine == null) {
            Paint paint5 = new Paint();
            this.mPaintSoberLine = paint5;
            paint5.setStyle(Paint.Style.FILL);
            this.mPaintSoberLine.setColor(Color.parseColor("#FFABAB"));
            this.mPaintSoberLine.setStrokeWidth(2.0f);
        }
        if (this.mPaintSober == null) {
            Paint paint6 = new Paint();
            this.mPaintSober = paint6;
            paint6.setStyle(Paint.Style.FILL);
            this.mPaintSober.setStrokeWidth(2.0f);
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(100);
        this.animator = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wakeup.howear.view.home.card.SleepHomeItemBarChart.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (SleepHomeItemBarChart.this.animatorProgress == ((Integer) valueAnimator.getAnimatedValue()).intValue()) {
                    return;
                }
                SleepHomeItemBarChart.this.animatorProgress = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SleepHomeItemBarChart.this.invalidate();
            }
        });
        this.animator.setInterpolator(new LinearInterpolator());
        this.animator.setDuration(500L);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), UIHelper.dp2px(50.0f));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        List<HealthData> list = this.mList;
        if (list != null) {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
            for (HealthData healthData : list) {
                float value = healthData.getValue(HealthData.VALUE_SLEEP_DURATION);
                f += value;
                int value2 = healthData.getValue(HealthData.VALUE_SLEEP_TYPE);
                if (value2 == 1) {
                    f3 += value;
                } else if (value2 == 2) {
                    f2 += value;
                }
            }
        } else {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        }
        float f4 = (f2 == 0.0f || f == 0.0f) ? 0.0f : (width - 20) * (f2 / f);
        float f5 = (f3 == 0.0f || f == 0.0f) ? 0.0f : (width - 20) * (f3 / f);
        float f6 = width;
        float f7 = ((f6 - f4) - f5) - 20.0f;
        int i = height / 4;
        float f8 = i - this.lineHeight;
        float f9 = i;
        canvas.drawRect(new RectF(0.0f, f8, f4, f9), this.mPaintDeepLine);
        float f10 = f4 / 2.0f;
        float f11 = height;
        this.mPaintDeep.setShader(new LinearGradient(f10, 0.0f, f10, f11, Color.parseColor("#4C7D7AFE"), Color.parseColor("#4CFFFFFF"), Shader.TileMode.CLAMP));
        canvas.drawRect(new RectF(0.0f, f9, f4, f11), this.mPaintDeep);
        float f12 = f4 + 10.0f;
        float f13 = f12 + f5;
        canvas.drawRect(new RectF(f12, f8, f13, f9), this.mPaintShallowLine);
        float f14 = f12 + (f5 / 2.0f);
        this.mPaintShallow.setShader(new LinearGradient(f14, 0.0f, f14, f11, Color.parseColor("#4C77E1EB"), Color.parseColor("#4CFFFFFF"), Shader.TileMode.CLAMP));
        canvas.drawRect(new RectF(f12, f9, f13, f11), this.mPaintShallow);
        float f15 = f13 + 10.0f;
        canvas.drawRect(new RectF(f15, f8, f6, f9), this.mPaintSoberLine);
        float f16 = f15 + (f7 / 2.0f);
        this.mPaintSober.setShader(new LinearGradient(f16, 0.0f, f16, f11, Color.parseColor("#4CFFABAB"), Color.parseColor("#4CFFFFFF"), Shader.TileMode.CLAMP));
        canvas.drawRect(new RectF(f15, f9, f6, f11), this.mPaintSober);
    }

    public void setAnimator() {
        this.animatorProgress = 0;
        this.animator.setIntValues(0, 100);
        this.animator.start();
    }
}
