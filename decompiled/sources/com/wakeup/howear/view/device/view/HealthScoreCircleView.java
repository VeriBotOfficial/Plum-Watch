package com.wakeup.howear.view.device.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthScoreCircleView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/wakeup/howear/view/device/view/HealthScoreCircleView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bgPaint", "Landroid/graphics/Paint;", "fgPaint", "textPaint", "rect", "Landroid/graphics/RectF;", "value", FirebaseAnalytics.Param.SCORE, "getScore", "()I", "setScore", "(I)V", "color", "getColor", "setColor", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HealthScoreCircleView extends View {
    private final Paint bgPaint;
    private int color;
    private final Paint fgPaint;
    private final RectF rect;
    private int score;
    private final Paint textPaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HealthScoreCircleView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HealthScoreCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HealthScoreCircleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthScoreCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getResources().getDisplayMetrics().density * 5.0f);
        paint.setColor(Color.parseColor("#E8EAF0"));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.bgPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(getResources().getDisplayMetrics().density * 5.0f);
        paint2.setColor(Color.parseColor("#00CEC9"));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.fgPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setColor(Color.parseColor("#00CEC9"));
        paint3.setFakeBoldText(true);
        this.textPaint = paint3;
        this.rect = new RectF();
        this.color = Color.parseColor("#00CEC9");
    }

    public final int getScore() {
        return this.score;
    }

    public final void setScore(int i) {
        this.score = i;
        invalidate();
    }

    public final int getColor() {
        return this.color;
    }

    public final void setColor(int i) {
        this.color = i;
        this.fgPaint.setColor(i);
        this.textPaint.setColor(i);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float strokeWidth = this.bgPaint.getStrokeWidth() / 2.0f;
        this.rect.set(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
        canvas.drawArc(this.rect, -90.0f, 360.0f, false, this.bgPaint);
        int i = this.score;
        if (i > 0) {
            canvas.drawArc(this.rect, -90.0f, (i / 100.0f) * 360.0f, false, this.fgPaint);
        }
        this.textPaint.setTextSize(getWidth() * 0.36f);
        int i2 = this.score;
        canvas.drawText(i2 > 0 ? String.valueOf(i2) : "—", getWidth() / 2.0f, (getHeight() / 2.0f) - ((this.textPaint.descent() + this.textPaint.ascent()) / 2.0f), this.textPaint);
    }
}
