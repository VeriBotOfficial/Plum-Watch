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
import com.anythink.expressad.foundation.h.k;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.wakeup.commonui.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArcProcessView.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0014J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,H\u0014J\u000e\u0010-\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006."}, d2 = {"Lcom/wakeup/commonui/view/ArcProcessView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBgPaint", "Landroid/graphics/Paint;", "mProcessPaint", "mViewWidth", "mViewHeight", "lineWidth", "color", "getColor", "()I", "setColor", "(I)V", "maxProcess", "", UMModuleRegister.PROCESS, "drawContent", "Landroid/graphics/RectF;", "getDrawContent", "()Landroid/graphics/RectF;", "setDrawContent", "(Landroid/graphics/RectF;)V", "bgPath", "Landroid/graphics/Path;", k.f, "Landroid/animation/ValueAnimator;", "getAnim", "()Landroid/animation/ValueAnimator;", "onSizeChanged", "", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setProcess", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ArcProcessView extends View {
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
    public ArcProcessView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArcProcessView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ArcProcessView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcProcessView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.mBgPaint = paint;
        Paint paint2 = new Paint();
        this.mProcessPaint = paint2;
        int dp2px = UIHelper.dp2px(10.0f);
        this.lineWidth = dp2px;
        this.color = Color.parseColor("#8793FF");
        this.maxProcess = 100.0f;
        this.drawContent = new RectF();
        this.bgPath = new Path();
        this.anim = new ValueAnimator();
        paint.setColor(Color.parseColor("#D0D5FF"));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(dp2px);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(dp2px);
    }

    public final int getColor() {
        return this.color;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final RectF getDrawContent() {
        return this.drawContent;
    }

    public final void setDrawContent(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<set-?>");
        this.drawContent = rectF;
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
        this.drawContent.set(f, f, w - f, h - f);
        this.bgPath.addArc(this.drawContent, 135.0f, 270.0f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.mProcessPaint.setColor(this.color);
        canvas.drawPath(this.bgPath, this.mBgPaint);
        canvas.drawArc(this.drawContent, 135.0f, (this.process * 270.0f) / this.maxProcess, false, this.mProcessPaint);
    }

    public final void setProcess(float process) {
        this.anim.removeAllUpdateListeners();
        this.anim.setDuration(500L);
        this.anim.setFloatValues(0.0f, process);
        this.anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wakeup.commonui.view.ArcProcessView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ArcProcessView.setProcess$lambda$0(ArcProcessView.this, valueAnimator);
            }
        });
        this.anim.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setProcess$lambda$0(ArcProcessView arcProcessView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        arcProcessView.process = ((Float) animatedValue).floatValue();
        arcProcessView.invalidate();
    }
}
