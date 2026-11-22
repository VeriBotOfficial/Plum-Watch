package com.wakeup.commonui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.wakeup.common.utils.BitmapUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: RainbowRingView.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010/\u001a\u0002002\u0006\u0010#\u001a\u00020\u0007H\u0002J(\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007H\u0014J\u0010\u00106\u001a\u0002002\u0006\u00107\u001a\u000208H\u0014J.\u00109\u001a\u0002002\b\b\u0002\u0010:\u001a\u00020\u00072\b\b\u0002\u0010;\u001a\u00020\u00072\b\b\u0002\u0010<\u001a\u00020\u00072\b\b\u0002\u0010=\u001a\u00020%J\u000e\u0010>\u001a\u0002002\u0006\u0010$\u001a\u00020%R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u0018\u0010\u001e\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u0018\u0010\u001f\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010 \u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010&\u001a\n \u001c*\u0004\u0018\u00010'0'¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006?"}, d2 = {"Lcom/wakeup/commonui/view/RainbowRingView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewWidth", "", "viewHeight", "paint", "Landroid/graphics/Paint;", "paintBg", "paintWidth", "paintWidthHalf", "ringSpace", "colorBlue", "colorBlueBg", "colorOrange", "colorOrangeBg", "colorRed", "colorRedBg", "colorActive", "stepBitmap", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "Landroid/graphics/Bitmap;", "timeBitmap", "activeBitmap", "stepProgress", "timeProgress", "activeProgress", "sizeType", "isActive", "", "animator", "Landroid/animation/ValueAnimator;", "getAnimator", "()Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "refreshSizeType", "", "onSizeChanged", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setProgress", "step", "time", "active", "isAnim", "setActive", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RainbowRingView extends View {
    private Bitmap activeBitmap;
    private int activeProgress;
    private final ValueAnimator animator;
    private final int colorActive;
    private final int colorBlue;
    private final int colorBlueBg;
    private final int colorOrange;
    private final int colorOrangeBg;
    private final int colorRed;
    private final int colorRedBg;
    private boolean isActive;
    private final Handler mHandler;
    private final Paint paint;
    private final Paint paintBg;
    private float paintWidth;
    private float paintWidthHalf;
    private float ringSpace;
    private int sizeType;
    private Bitmap stepBitmap;
    private int stepProgress;
    private Bitmap timeBitmap;
    private int timeProgress;
    private float viewHeight;
    private float viewWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RainbowRingView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RainbowRingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RainbowRingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RainbowRingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
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
        int parseColor2 = Color.parseColor("#DBEDFF");
        this.colorBlueBg = parseColor2;
        this.colorOrange = Color.parseColor("#ff7300");
        this.colorOrangeBg = Color.parseColor("#FFE4D1");
        this.colorRed = Color.parseColor("#FC3159");
        this.colorRedBg = Color.parseColor("#FED4DD");
        this.colorActive = Color.parseColor("#DDDDDD");
        this.stepBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_rainbow_active);
        this.timeBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_rainbow_time);
        this.activeBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_rainbow_step);
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RainbowRingView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int i2 = obtainStyledAttributes.getInt(R.styleable.RainbowRingView_viewSize, 0);
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
            float dp2px = UIHelper.dp2px(16.0f);
            this.paintWidth = dp2px;
            this.paintWidthHalf = dp2px / 2;
            this.ringSpace = UIHelper.dp2px(4.0f);
        } else if (sizeType == 1) {
            float dp2px2 = UIHelper.dp2px(8.0f);
            this.paintWidth = dp2px2;
            this.paintWidthHalf = dp2px2 / 2;
            this.ringSpace = UIHelper.dp2px(2.0f);
            Bitmap bitmap = this.stepBitmap;
            this.stepBitmap = BitmapUtils.scale(bitmap, bitmap.getWidth() / 2, this.stepBitmap.getHeight() / 2);
            Bitmap bitmap2 = this.timeBitmap;
            this.timeBitmap = BitmapUtils.scale(bitmap2, bitmap2.getWidth() / 2, this.timeBitmap.getHeight() / 2);
            Bitmap bitmap3 = this.activeBitmap;
            this.activeBitmap = BitmapUtils.scale(bitmap3, bitmap3.getWidth() / 2, this.activeBitmap.getHeight() / 2);
        } else if (sizeType == 3) {
            float dp2px3 = UIHelper.dp2px(22.0f);
            this.paintWidth = dp2px3;
            this.paintWidthHalf = dp2px3 / 2;
            this.ringSpace = UIHelper.dp2px(5.0f);
            Bitmap bitmap4 = this.stepBitmap;
            this.stepBitmap = BitmapUtils.scale(bitmap4, bitmap4.getWidth() + (((int) this.ringSpace) / 2), this.stepBitmap.getHeight() + (((int) this.ringSpace) / 2));
            Bitmap bitmap5 = this.timeBitmap;
            this.timeBitmap = BitmapUtils.scale(bitmap5, bitmap5.getWidth() + (((int) this.ringSpace) / 2), this.timeBitmap.getHeight() + (((int) this.ringSpace) / 2));
            Bitmap bitmap6 = this.activeBitmap;
            this.activeBitmap = BitmapUtils.scale(bitmap6, bitmap6.getWidth() + (((int) this.ringSpace) / 2), this.activeBitmap.getHeight() + (((int) this.ringSpace) / 2));
        } else {
            float dp2px4 = UIHelper.dp2px(3.0f);
            this.paintWidth = dp2px4;
            this.paintWidthHalf = dp2px4 / 2;
            this.ringSpace = UIHelper.dp2px(1.0f);
        }
        this.paint.setStrokeWidth(this.paintWidth);
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
        Canvas canvas2;
        Canvas canvas3;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.paint.setColor(this.colorBlue);
        this.paintBg.setColor(this.colorBlueBg);
        float f = this.paintWidthHalf;
        if (this.sizeType == 2 && !this.isActive) {
            this.paintBg.setColor(this.colorActive);
            canvas.drawArc(f, f, this.viewWidth - f, this.viewHeight - f, -180.0f, 180.0f, false, this.paintBg);
            canvas2 = canvas;
        } else {
            canvas.drawArc(f, f, this.viewWidth - f, this.viewHeight - f, -180.0f, 180.0f, false, this.paintBg);
            canvas2 = canvas;
            canvas2.drawArc(f, f, this.viewWidth - f, this.viewHeight - f, -180.0f, (this.stepProgress * 180.0f) / 100.0f, false, this.paint);
        }
        if (this.sizeType != 2) {
            canvas.drawBitmap(this.stepBitmap, 0.0f, (this.viewHeight / 2) - f, this.paint);
        }
        this.paint.setColor(this.colorOrange);
        this.paintBg.setColor(this.colorOrangeBg);
        float f2 = 2;
        float f3 = (this.paintWidthHalf * f2) + (this.ringSpace * 3);
        if (this.sizeType == 2 && !this.isActive) {
            this.paintBg.setColor(this.colorActive);
            canvas2.drawArc(f3, f3, this.viewWidth - f3, this.viewHeight - f3, -180.0f, 180.0f, false, this.paintBg);
            canvas3 = canvas;
        } else {
            canvas.drawArc(f3, f3, this.viewWidth - f3, this.viewHeight - f3, -180.0f, 180.0f, false, this.paintBg);
            canvas3 = canvas;
            canvas3.drawArc(f3, f3, this.viewWidth - f3, this.viewHeight - f3, -180.0f, (this.timeProgress * 180.0f) / 100.0f, false, this.paint);
        }
        if (this.sizeType != 2) {
            Bitmap bitmap = this.timeBitmap;
            float f4 = this.paintWidthHalf;
            canvas.drawBitmap(bitmap, (f4 * f2) + this.ringSpace, (this.viewHeight / f2) - f4, this.paint);
        }
        this.paint.setColor(this.colorRed);
        this.paintBg.setColor(this.colorRedBg);
        float f5 = 4;
        float f6 = (this.paintWidthHalf * f5) + (this.ringSpace * f5);
        if (this.sizeType == 2 && !this.isActive) {
            this.paintBg.setColor(this.colorActive);
            canvas3.drawArc(f6, f6, this.viewWidth - f6, this.viewHeight - f6, -180.0f, 180.0f, false, this.paintBg);
        } else {
            canvas.drawArc(f6, f6, this.viewWidth - f6, this.viewHeight - f6, -180.0f, 180.0f, false, this.paintBg);
            canvas.drawArc(f6, f6, this.viewWidth - f6, this.viewHeight - f6, -180.0f, (this.activeProgress * 180.0f) / 100.0f, false, this.paint);
        }
        if (this.sizeType != 2) {
            Bitmap bitmap2 = this.activeBitmap;
            float f7 = this.paintWidthHalf;
            canvas.drawBitmap(bitmap2, (f5 * f7) + (this.ringSpace * f2), (this.viewHeight / f2) - f7, this.paint);
        }
    }

    public static /* synthetic */ void setProgress$default(RainbowRingView rainbowRingView, int i, int i2, int i3, boolean z, int i4, Object obj) {
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
        rainbowRingView.setProgress(i, i2, i3, z);
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
            this.mHandler.postDelayed(new Runnable() { // from class: com.wakeup.commonui.view.RainbowRingView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RainbowRingView.setProgress$default(RainbowRingView.this, active, time, step, false, 8, null);
                }
            }, 500 - this.animator.getCurrentPlayTime());
        } else {
            this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wakeup.commonui.view.RainbowRingView$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RainbowRingView.setProgress$lambda$2(RainbowRingView.this, intRef, intRef2, intRef3, valueAnimator);
                }
            });
            this.animator.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setProgress$lambda$2(RainbowRingView rainbowRingView, Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNull(it.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        float intValue = ((Integer) r5).intValue() * 0.01f;
        rainbowRingView.stepProgress = (int) (intRef.element * intValue);
        rainbowRingView.timeProgress = (int) (intRef2.element * intValue);
        rainbowRingView.activeProgress = (int) (intValue * intRef3.element);
        rainbowRingView.invalidate();
    }

    public final void setActive(boolean isActive) {
        this.isActive = isActive;
        invalidate();
    }
}
