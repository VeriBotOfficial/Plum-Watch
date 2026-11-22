package com.wakeup.howear.view.home.device.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: HomeV2DietArcView.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0014J(\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0014J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/wakeup/howear/view/home/device/view/HomeV2DietArcView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "density", "", "strokePx", "bgPaint", "Landroid/graphics/Paint;", "fgPaint", "rect", "Landroid/graphics/RectF;", "value", "progress", "getProgress", "()Ljava/lang/Float;", "setProgress", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeV2DietArcView extends View {
    private final Paint bgPaint;
    private final float density;
    private final Paint fgPaint;
    private Float progress;
    private final RectF rect;
    private final float strokePx;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeV2DietArcView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeV2DietArcView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HomeV2DietArcView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeV2DietArcView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        float f = getResources().getDisplayMetrics().density;
        this.density = f;
        float f2 = f * 5.5f;
        this.strokePx = f2;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f2);
        paint.setColor(Color.parseColor("#F3EBE4"));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.bgPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f2);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.fgPaint = paint2;
        this.rect = new RectF();
        this.progress = Float.valueOf(0.72f);
    }

    public final Float getProgress() {
        return this.progress;
    }

    public final void setProgress(Float f) {
        this.progress = f;
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.resolveSize((int) (72 * this.density), widthMeasureSpec), View.resolveSize((int) (40 * this.density), heightMeasureSpec));
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (w <= 0 || h <= 0) {
            return;
        }
        float f = this.strokePx;
        float f2 = f / 2.0f;
        float f3 = w / 2.0f;
        float coerceAtLeast = RangesKt.coerceAtLeast(Math.min(f3 - f2, h - f), f2);
        float f4 = f2 + coerceAtLeast;
        this.rect.set(f3 - coerceAtLeast, f4 - coerceAtLeast, f3 + coerceAtLeast, f4 + coerceAtLeast);
        this.fgPaint.setShader(new LinearGradient(this.rect.left, this.rect.top, this.rect.right, this.rect.centerY(), new int[]{Color.parseColor("#FF6A12"), Color.parseColor("#FF8A3D"), Color.parseColor("#FFC08A")}, new float[]{0.0f, 0.45f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.rect.isEmpty()) {
            return;
        }
        canvas.drawArc(this.rect, 180.0f, 180.0f, false, this.bgPaint);
        Float f = this.progress;
        if (f == null || f.floatValue() <= 0.0f) {
            return;
        }
        canvas.drawArc(this.rect, 180.0f, RangesKt.coerceIn(f.floatValue(), 0.0f, 1.0f) * 180.0f, false, this.fgPaint);
    }
}
