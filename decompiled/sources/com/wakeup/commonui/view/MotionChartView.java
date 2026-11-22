package com.wakeup.commonui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.blankj.utilcode.util.LogUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* compiled from: MotionChartView.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010)\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J(\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007H\u0014J\u0010\u00100\u001a\u00020*2\u0006\u00101\u001a\u000202H\u0014J.\u00103\u001a\u00020*2\b\b\u0002\u00104\u001a\u00020\u00072\b\b\u0002\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u000208R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\n !*\u0004\u0018\u00010 0 ¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00069"}, d2 = {"Lcom/wakeup/commonui/view/MotionChartView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "viewWidth", "", "viewHeight", "paint", "Landroid/graphics/Paint;", "paintBg", "paintWidth", "paintWidthHalf", "ringSpace", "colorBlue", "colorBlueBg", "colorOrange", "colorOrangeBg", "colorRed", "colorRedBg", "sizeType", "stepProgress", "timeProgress", "activeProgress", "animator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "getAnimator", "()Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "refreshSizeType", "", "onSizeChanged", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setProgress", "step", "time", "active", "isAnim", "", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MotionChartView extends View {
    private final String TAG;
    private int activeProgress;
    private final ValueAnimator animator;
    private final int colorBlue;
    private final int colorBlueBg;
    private final int colorOrange;
    private final int colorOrangeBg;
    private final int colorRed;
    private final int colorRedBg;
    private final Handler mHandler;
    private final Paint paint;
    private final Paint paintBg;
    private float paintWidth;
    private float paintWidthHalf;
    private float ringSpace;
    private int sizeType;
    private int stepProgress;
    private int timeProgress;
    private float viewHeight;
    private float viewWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MotionChartView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MotionChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MotionChartView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.TAG = "MotionChartView";
        Paint paint = new Paint(1);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        this.paintBg = paint2;
        float dp2px = UIHelper.dp2px(16.0f);
        this.paintWidth = dp2px;
        this.paintWidthHalf = dp2px / 2;
        this.ringSpace = UIHelper.dp2px(4.0f);
        int parseColor = Color.parseColor("#1883F3");
        this.colorBlue = parseColor;
        int parseColor2 = Color.parseColor("#E4F4FF");
        this.colorBlueBg = parseColor2;
        this.colorOrange = Color.parseColor("#FF7300");
        this.colorOrangeBg = Color.parseColor("#FFE4D1");
        this.colorRed = Color.parseColor("#FF006A");
        this.colorRedBg = Color.parseColor("#FED4DD");
        ValueAnimator ofInt = ValueAnimator.ofInt(100);
        ofInt.setDuration(500L);
        this.animator = ofInt;
        this.mHandler = new Handler(Looper.getMainLooper());
        paint2.setStrokeWidth(this.paintWidth);
        paint2.setColor(parseColor2);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.paintWidth);
        paint.setColor(parseColor);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MotionChartView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int i2 = obtainStyledAttributes.getInt(R.styleable.MotionChartView_viewMSize, 0);
        this.sizeType = i2;
        refreshSizeType(i2);
    }

    public final ValueAnimator getAnimator() {
        return this.animator;
    }

    public final Handler getMHandler() {
        return this.mHandler;
    }

    private final void refreshSizeType(int sizeType) {
        if (sizeType == 0) {
            this.paintWidth = UIHelper.dp2px(12.0f);
            this.ringSpace = UIHelper.dp2px(3.2f);
        } else if (sizeType == 1) {
            this.paintWidth = UIHelper.dp2px(8.0f);
            this.ringSpace = UIHelper.dp2px(2.0f);
        } else if (sizeType == 2) {
            this.paintWidth = UIHelper.dp2px(3.0f);
            this.ringSpace = UIHelper.dp2px(0.7f);
        } else if (sizeType == 3) {
            this.paintWidth = UIHelper.dp2px(20.0f);
            this.ringSpace = UIHelper.dp2px(5.6f);
        } else if (sizeType == 4) {
            this.paintWidth = UIHelper.dp2px(5.0f);
            this.ringSpace = UIHelper.dp2px(1.4f);
        } else {
            this.paintWidth = UIHelper.dp2px(3.0f);
            this.ringSpace = UIHelper.dp2px(1.0f);
        }
        float f = this.paintWidth;
        this.paintWidthHalf = f / 2;
        this.paint.setStrokeWidth(f);
        this.paintBg.setStrokeWidth(this.paintWidth);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.viewWidth = getWidth();
        this.viewHeight = getHeight();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        LogUtils.i(this.TAG, "viewWidth " + this.viewWidth + ", viewHeight " + this.viewHeight);
        float f = this.viewWidth;
        float f2 = 2;
        float f3 = f / f2;
        float coerceAtMost = RangesKt.coerceAtMost(f, this.viewHeight) / 2.4f;
        float f4 = this.paintWidthHalf / 0.6f;
        this.paintBg.setStrokeWidth(this.paintWidth);
        this.paint.setColor(this.colorBlue);
        this.paintBg.setColor(this.colorBlueBg);
        canvas.drawCircle(f3, f3, coerceAtMost, this.paintBg);
        canvas.drawArc(f4, f4, this.viewWidth - f4, this.viewHeight - f4, -270.0f, (this.stepProgress * 360.0f) / 100.0f, false, this.paint);
        this.paintBg.setColor(Color.parseColor("#FFFFFF"));
        Paint paint = this.paintBg;
        paint.setStrokeWidth(paint.getStrokeWidth() / f2);
        canvas.drawCircle(f3, f3 + coerceAtMost, 1.0f, this.paintBg);
        this.paintBg.setStrokeWidth(this.paintWidth);
        this.paint.setColor(this.colorOrange);
        this.paintBg.setColor(this.colorOrangeBg);
        float f5 = coerceAtMost - (this.ringSpace * 4.5f);
        float f6 = this.paintWidthHalf * 4.0f;
        canvas.drawCircle(f3, f3, f5, this.paintBg);
        canvas.drawArc(f6, f6, this.viewWidth - f6, this.viewHeight - f6, -270.0f, (this.timeProgress * 360.0f) / 100.0f, false, this.paint);
        this.paintBg.setColor(Color.parseColor("#FFFFFF"));
        Paint paint2 = this.paintBg;
        paint2.setStrokeWidth(paint2.getStrokeWidth() / f2);
        canvas.drawCircle(f3, f3 + f5, 1.0f, this.paintBg);
        this.paintBg.setStrokeWidth(this.paintWidth);
        this.paint.setColor(this.colorRed);
        this.paintBg.setColor(this.colorRedBg);
        float f7 = f5 - (this.ringSpace * 4.2f);
        float f8 = this.paintWidthHalf * 6.35f;
        canvas.drawCircle(f3, f3, f7, this.paintBg);
        canvas.drawArc(f8, f8, this.viewWidth - f8, this.viewHeight - f8, -270.0f, (this.activeProgress * 360.0f) / 100.0f, false, this.paint);
        this.paintBg.setColor(Color.parseColor("#FFFFFF"));
        Paint paint3 = this.paintBg;
        paint3.setStrokeWidth(paint3.getStrokeWidth() / f2);
        canvas.drawCircle(f3, f7 + f3, 1.0f, this.paintBg);
    }

    public static /* synthetic */ void setProgress$default(MotionChartView motionChartView, int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        if ((i4 & 8) != 0) {
            z = false;
        }
        motionChartView.setProgress(i, i2, i3, z);
    }

    public final void setProgress(final int step, final int time, final int active, boolean isAnim) {
        this.mHandler.removeCallbacksAndMessages(null);
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = step;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = time;
        final Ref.IntRef intRef3 = new Ref.IntRef();
        intRef3.element = active;
        if (intRef.element < 0) {
            intRef.element = 0;
        }
        if (intRef.element > 100) {
            intRef.element = 100;
        }
        if (intRef2.element < 0) {
            intRef2.element = 0;
        }
        if (intRef2.element > 100) {
            intRef2.element = 100;
        }
        if (intRef3.element < 0) {
            intRef3.element = 0;
        }
        if (intRef3.element > 100) {
            intRef3.element = 100;
        }
        this.stepProgress = intRef.element;
        this.timeProgress = intRef2.element;
        this.activeProgress = intRef3.element;
        if (!isAnim) {
            invalidate();
        } else if (this.animator.isRunning()) {
            this.mHandler.postDelayed(new Runnable() { // from class: com.wakeup.commonui.view.MotionChartView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MotionChartView.setProgress$default(MotionChartView.this, active, time, step, false, 8, null);
                }
            }, 500 - this.animator.getCurrentPlayTime());
        } else {
            this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wakeup.commonui.view.MotionChartView$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MotionChartView.setProgress$lambda$2(MotionChartView.this, intRef, intRef2, intRef3, valueAnimator);
                }
            });
            this.animator.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setProgress$lambda$2(MotionChartView motionChartView, Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNull(it.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        float intValue = ((Integer) r5).intValue() * 0.01f;
        motionChartView.stepProgress = (int) (intRef.element * intValue);
        motionChartView.timeProgress = (int) (intRef2.element * intValue);
        motionChartView.activeProgress = (int) (intValue * intRef3.element);
        motionChartView.invalidate();
    }
}
