package com.wakeup.feature.health.rainbow.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.wakeup.commonui.utils.UIHelper;
import com.wakeup.feature.health.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RainBowProportionView.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J.\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/wakeup/feature/health/rainbow/view/RainBowProportionView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mRunPaint", "Landroid/graphics/Paint;", "mWalkPaint", "mCyclePaint", "mTrainPain", "mOtherPaint", "spaceWidth", "runProgress", "", "walkProgress", "cycleProgress", "trainProgress", "otherProgress", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setProgress", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RainBowProportionView extends View {
    public static final int $stable = 8;
    private float cycleProgress;
    private final Paint mCyclePaint;
    private final Paint mOtherPaint;
    private Paint mRunPaint;
    private final Paint mTrainPain;
    private final Paint mWalkPaint;
    private float otherProgress;
    private float runProgress;
    private int spaceWidth;
    private float trainProgress;
    private float walkProgress;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RainBowProportionView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RainBowProportionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RainBowProportionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RainBowProportionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mRunPaint = new Paint();
        Paint paint = new Paint();
        this.mWalkPaint = paint;
        Paint paint2 = new Paint();
        this.mCyclePaint = paint2;
        Paint paint3 = new Paint();
        this.mTrainPain = paint3;
        Paint paint4 = new Paint();
        this.mOtherPaint = paint4;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.rainBowProportion, i, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.spaceWidth = UIHelper.dp2px(2.0f);
        this.mRunPaint.setColor(obtainStyledAttributes.getColor(R.styleable.rainBowProportion_runColor, ContextCompat.getColor(context, com.wakeup.commonui.R.color.color_FB8C66)));
        paint.setColor(obtainStyledAttributes.getColor(R.styleable.rainBowProportion_walkColor, ContextCompat.getColor(context, com.wakeup.commonui.R.color.color_FA784C)));
        paint2.setColor(obtainStyledAttributes.getColor(R.styleable.rainBowProportion_cycleColor, ContextCompat.getColor(context, com.wakeup.commonui.R.color.color_FA6533)));
        paint3.setColor(obtainStyledAttributes.getColor(R.styleable.rainBowProportion_trainColor, ContextCompat.getColor(context, com.wakeup.commonui.R.color.color_F95219)));
        paint4.setColor(obtainStyledAttributes.getColor(R.styleable.rainBowProportion_otherColor, ContextCompat.getColor(context, com.wakeup.commonui.R.color.color_F93F00)));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f = width;
        float f2 = f * this.runProgress;
        boolean z = f2 > 0.0f;
        float f3 = height;
        canvas.drawRect(0.0f, 0.0f, f2, f3, this.mRunPaint);
        float f4 = f2 + (z ? this.spaceWidth : 0.0f);
        float f5 = this.walkProgress;
        float f6 = (f * f5) + f4;
        boolean z2 = f5 * f > 0.0f;
        canvas.drawRect(f4, 0.0f, f6, f3, this.mWalkPaint);
        float f7 = f6 + (z2 ? this.spaceWidth : 0.0f);
        float f8 = this.cycleProgress;
        float f9 = (f * f8) + f7;
        boolean z3 = f8 * f > 0.0f;
        canvas.drawRect(f7, 0.0f, f9, f3, this.mCyclePaint);
        float f10 = f9 + (z3 ? this.spaceWidth : 0.0f);
        float f11 = this.trainProgress;
        float f12 = (f * f11) + f10;
        boolean z4 = f11 * f > 0.0f;
        canvas.drawRect(f10, 0.0f, f12, f3, this.mTrainPain);
        float f13 = f12 + (z4 ? this.spaceWidth : 0.0f);
        float f14 = (this.otherProgress * f) + f13;
        canvas.drawRect(f13, 0.0f, f14 <= 0.0f ? f : f14, f3, this.mOtherPaint);
    }

    public final void setProgress(float runProgress, float walkProgress, float cycleProgress, float trainProgress, float otherProgress) {
        this.runProgress = runProgress;
        this.walkProgress = walkProgress;
        this.cycleProgress = cycleProgress;
        this.trainProgress = trainProgress;
        this.otherProgress = otherProgress;
        invalidate();
    }
}
