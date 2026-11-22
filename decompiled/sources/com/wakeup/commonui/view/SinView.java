package com.wakeup.commonui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SinView.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0014J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0013H\u0002J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/wakeup/commonui/view/SinView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", Const.SP_KEY_CALL_LOC_COUNT, "bgPaint", "Landroid/graphics/Paint;", "progressPaint", "bgPath", "Landroid/graphics/Path;", "progressPath", "pathWith", "", "progress", "space", "drawWidth", "onSizeChanged", "", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "getSinY", "x", "setProgress", "p", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SinView extends View {
    private final int a;
    private final Paint bgPaint;
    private final Path bgPath;
    private final int count;
    private int drawWidth;
    private final float pathWith;
    private int progress;
    private final Paint progressPaint;
    private final Path progressPath;
    private float space;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SinView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SinView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SinView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SinView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = 20;
        this.count = 6;
        Paint paint = new Paint();
        this.bgPaint = paint;
        Paint paint2 = new Paint();
        this.progressPaint = paint2;
        this.bgPath = new Path();
        this.progressPath = new Path();
        this.pathWith = 20.0f;
        this.space = 20.0f / 2;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20.0f);
        paint.setColor(Color.parseColor("#E6E6E6"));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(20.0f);
        paint2.setColor(Color.parseColor("#00BD92"));
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.drawWidth = getWidth() - ((int) (2 * this.space));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int width = (getWidth() * this.progress) / 100;
        this.bgPath.reset();
        this.progressPath.reset();
        this.bgPath.moveTo(this.space, getHeight() / 2);
        this.progressPath.moveTo(this.space, getHeight() / 2);
        int i = this.drawWidth;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                float f = i2;
                this.bgPath.lineTo(this.space + f, getSinY(f));
                if (i2 <= width) {
                    this.progressPath.lineTo(this.space + f, getSinY(f));
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        canvas.drawPath(this.bgPath, this.bgPaint);
        canvas.drawPath(this.progressPath, this.progressPaint);
    }

    private final float getSinY(float x) {
        return (float) ((this.a * Math.sin((x * 6.283185307179586d) / (this.drawWidth / this.count))) + (getHeight() / 2));
    }

    public final void setProgress(int p) {
        this.progress = p;
        if (p < 0) {
            this.progress = 0;
        }
        if (this.progress > 100) {
            this.progress = 100;
        }
    }
}
