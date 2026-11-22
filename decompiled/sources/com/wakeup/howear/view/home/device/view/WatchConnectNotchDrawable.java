package com.wakeup.howear.view.home.device.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: WatchConnectNotchDrawable.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0014J\u0010\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u0014H\u0016J\u0012\u0010*\u001a\u00020!2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020\u0014H\u0017R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR$\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/wakeup/howear/view/home/device/view/WatchConnectNotchDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "value", "", "cornerRadiusPx", "getCornerRadiusPx", "()F", "setCornerRadiusPx", "(F)V", "notchWidthPx", "getNotchWidthPx", "setNotchWidthPx", "notchHeightPx", "getNotchHeightPx", "setNotchHeightPx", "concaveRadiusPx", "getConcaveRadiusPx", "setConcaveRadiusPx", "", "fillColor", "getFillColor", "()I", "setFillColor", "(I)V", "path", "Landroid/graphics/Path;", "tmp", "Landroid/graphics/RectF;", "fillPaint", "Landroid/graphics/Paint;", "onBoundsChange", "", "bounds", "Landroid/graphics/Rect;", "rebuildPath", "draw", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WatchConnectNotchDrawable extends Drawable {
    private float concaveRadiusPx;
    private float cornerRadiusPx;
    private final Paint fillPaint;
    private float notchHeightPx;
    private float notchWidthPx;
    private int fillColor = -1;
    private final Path path = new Path();
    private final RectF tmp = new RectF();

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        return -3;
    }

    public WatchConnectNotchDrawable() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.fillColor);
        this.fillPaint = paint;
    }

    public final float getCornerRadiusPx() {
        return this.cornerRadiusPx;
    }

    public final void setCornerRadiusPx(float f) {
        this.cornerRadiusPx = f;
        invalidateSelf();
    }

    public final float getNotchWidthPx() {
        return this.notchWidthPx;
    }

    public final void setNotchWidthPx(float f) {
        this.notchWidthPx = f;
        invalidateSelf();
    }

    public final float getNotchHeightPx() {
        return this.notchHeightPx;
    }

    public final void setNotchHeightPx(float f) {
        this.notchHeightPx = f;
        invalidateSelf();
    }

    public final float getConcaveRadiusPx() {
        return this.concaveRadiusPx;
    }

    public final void setConcaveRadiusPx(float f) {
        this.concaveRadiusPx = f;
        invalidateSelf();
    }

    public final int getFillColor() {
        return this.fillColor;
    }

    public final void setFillColor(int i) {
        this.fillColor = i;
        this.fillPaint.setColor(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        rebuildPath(bounds);
    }

    private final void rebuildPath(Rect bounds) {
        float width = bounds.width();
        float height = bounds.height();
        this.path.reset();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float min = Math.min(this.cornerRadiusPx, Math.min(width, height) / 2.0f);
        float f = min * 2.0f;
        float f2 = width - f;
        float coerceAtLeast = RangesKt.coerceAtLeast(Math.min(this.notchWidthPx, f2), 0.0f);
        float f3 = height - f;
        float coerceAtLeast2 = RangesKt.coerceAtLeast(Math.min(this.notchHeightPx, f3), 0.0f);
        float coerceAtLeast3 = RangesKt.coerceAtLeast(Math.min(this.concaveRadiusPx, Math.min(coerceAtLeast, coerceAtLeast2) / 2.0f), 0.0f);
        if (coerceAtLeast <= 1.0f || coerceAtLeast2 <= 1.0f || coerceAtLeast3 <= 0.0f) {
            this.tmp.set(0.0f, 0.0f, width, height);
            this.path.addRoundRect(this.tmp, min, min, Path.Direction.CW);
            return;
        }
        this.path.moveTo(min, 0.0f);
        float f4 = width - coerceAtLeast;
        this.path.lineTo(f4 - coerceAtLeast3, 0.0f);
        float f5 = 2.0f * coerceAtLeast3;
        this.tmp.set(f4 - f5, 0.0f, f4, f5);
        this.path.arcTo(this.tmp, -90.0f, 90.0f, false);
        this.path.lineTo(f4, coerceAtLeast2 - coerceAtLeast3);
        this.tmp.set(f4, coerceAtLeast2 - f5, f5 + f4, coerceAtLeast2);
        this.path.arcTo(this.tmp, 180.0f, -90.0f, false);
        this.path.lineTo(width, coerceAtLeast2);
        this.path.lineTo(width, height - min);
        this.tmp.set(f2, f3, width, height);
        this.path.arcTo(this.tmp, 0.0f, 90.0f, false);
        this.path.lineTo(min, height);
        this.tmp.set(0.0f, f3, f, height);
        this.path.arcTo(this.tmp, 90.0f, 90.0f, false);
        this.path.lineTo(0.0f, min);
        this.tmp.set(0.0f, 0.0f, f, f);
        this.path.arcTo(this.tmp, 180.0f, 90.0f, false);
        this.path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        if (bounds.isEmpty()) {
            return;
        }
        rebuildPath(bounds);
        canvas.drawPath(this.path, this.fillPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.fillPaint.setAlpha(alpha);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.fillPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
