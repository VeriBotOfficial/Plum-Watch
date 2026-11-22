package com.wakeup.commonui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.anythink.expressad.foundation.h.k;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.wakeup.commonui.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArcHalfProcessView.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0014J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0014J\u0016\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007J\u0006\u0010(\u001a\u00020\u0012J\u000e\u0010)\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lcom/wakeup/commonui/view/ArcHalfProcessView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBgPaint", "Landroid/graphics/Paint;", "mProcessPaint", "mViewWidth", "mViewHeight", "lineWidth", "color", "maxProcess", "", UMModuleRegister.PROCESS, "drawContent", "Landroid/graphics/RectF;", "bgPath", "Landroid/graphics/Path;", k.f, "Landroid/animation/ValueAnimator;", "getAnim", "()Landroid/animation/ValueAnimator;", "onSizeChanged", "", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setColor", "bgColor", "coloring", "getProcess", "setProcess", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ArcHalfProcessView extends View {
    private final ValueAnimator anim;
    private final Path bgPath;
    private int color;
    private RectF drawContent;
    private final int lineWidth;
    private final Paint mBgPaint;
    private final Paint mProcessPaint;
    private int mViewHeight;
    private int mViewWidth;
    private final float maxProcess;
    private float process;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArcHalfProcessView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArcHalfProcessView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ArcHalfProcessView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcHalfProcessView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.mBgPaint = paint;
        Paint paint2 = new Paint();
        this.mProcessPaint = paint2;
        int dp2px = UIHelper.dp2px(18.0f);
        this.lineWidth = dp2px;
        this.color = Color.parseColor("#FF7300");
        this.maxProcess = 100.0f;
        this.drawContent = new RectF();
        this.bgPath = new Path();
        this.anim = new ValueAnimator();
        paint.setColor(Color.parseColor("#F5F5F5"));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(dp2px);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(dp2px);
    }

    public final ValueAnimator getAnim() {
        return this.anim;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.mViewWidth = w;
        this.mViewHeight = h;
        float f = this.lineWidth / 2;
        this.drawContent.set(f, f, w - f, w);
        this.bgPath.addArc(this.drawContent, 180.0f, 180.0f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.mProcessPaint.setColor(this.color);
        canvas.drawPath(this.bgPath, this.mBgPaint);
        canvas.drawArc(this.drawContent, 180.0f, (this.process * 180.0f) / this.maxProcess, false, this.mProcessPaint);
    }

    public final void setColor(int bgColor, int coloring) {
        this.color = ContextCompat.getColor(getContext(), coloring);
        this.mBgPaint.setColor(ContextCompat.getColor(getContext(), bgColor));
    }

    public final float getProcess() {
        return this.process;
    }

    public final void setProcess(float process) {
        this.anim.removeAllUpdateListeners();
        this.anim.setDuration(500L);
        this.anim.setFloatValues(0.0f, process);
        this.anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wakeup.commonui.view.ArcHalfProcessView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ArcHalfProcessView.setProcess$lambda$0(ArcHalfProcessView.this, valueAnimator);
            }
        });
        this.anim.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setProcess$lambda$0(ArcHalfProcessView arcHalfProcessView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        arcHalfProcessView.process = ((Float) animatedValue).floatValue();
        arcHalfProcessView.invalidate();
    }
}
