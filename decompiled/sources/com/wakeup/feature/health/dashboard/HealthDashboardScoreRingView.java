package com.wakeup.feature.health.dashboard;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.wakeup.common.Constants;
import com.wakeup.feature.health.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: HealthDashboardScoreRingView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/wakeup/feature/health/dashboard/HealthDashboardScoreRingView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "density", "", "stroke", "rect", "Landroid/graphics/RectF;", "trackPaint", "Landroid/graphics/Paint;", "ringPaint", "numberPaint", "gradePaint", FirebaseAnalytics.Param.SCORE, Constants.BundleKey.GRADE, "", ParameterNames.RENDER, "", "color", "trackColor", "onDraw", "canvas", "Landroid/graphics/Canvas;", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthDashboardScoreRingView extends View {
    public static final int $stable = 8;
    private final float density;
    private String grade;
    private final Paint gradePaint;
    private final Paint numberPaint;
    private final RectF rect;
    private final Paint ringPaint;
    private int score;
    private final float stroke;
    private final Paint trackPaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HealthDashboardScoreRingView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HealthDashboardScoreRingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HealthDashboardScoreRingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthDashboardScoreRingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        float f = getResources().getDisplayMetrics().density;
        this.density = f;
        float f2 = 12.0f * f;
        this.stroke = f2;
        this.rect = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f2);
        paint.setColor(Color.parseColor("#E8EAF0"));
        this.trackPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f2);
        paint2.setColor(Color.parseColor("#00CEC9"));
        this.ringPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setFakeBoldText(true);
        paint3.setTextSize(42.0f * f);
        paint3.setColor(Color.parseColor("#00CEC9"));
        this.numberPaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setTextAlign(Paint.Align.CENTER);
        paint4.setFakeBoldText(true);
        paint4.setTextSize(f * 14.0f);
        paint4.setColor(Color.parseColor("#00CEC9"));
        this.gradePaint = paint4;
        String string = context.getString(R.string.hd_score_calculating);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.grade = string;
        setLayerType(1, null);
    }

    public final void render(int score, String grade, int color, int trackColor) {
        Intrinsics.checkNotNullParameter(grade, "grade");
        this.score = score;
        this.grade = grade;
        this.ringPaint.setColor(color);
        this.numberPaint.setColor(color);
        this.gradePaint.setColor(color);
        this.trackPaint.setColor(trackColor);
        int argb = Color.argb(51, Color.red(color), Color.green(color), Color.blue(color));
        Paint paint = this.ringPaint;
        float f = this.density;
        paint.setShadowLayer(8.0f * f, 0.0f, f * 2.0f, argb);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f = (this.density * 10.0f) + (this.stroke / 2.0f);
        this.rect.set(f, f, getWidth() - f, getHeight() - f);
        canvas.drawArc(this.rect, -90.0f, 360.0f, false, this.trackPaint);
        if (this.score > 0) {
            canvas.drawArc(this.rect, -90.0f, (RangesKt.coerceAtMost(r0, 100) / 100.0f) * 360.0f, false, this.ringPaint);
        }
        int i = this.score;
        String valueOf = i > 0 ? String.valueOf(i) : "—";
        float height = (getHeight() - ((this.numberPaint.getTextSize() + (this.density * 2.0f)) + this.gradePaint.getTextSize())) / 2.0f;
        canvas.drawText(valueOf, getWidth() / 2.0f, height - this.numberPaint.ascent(), this.numberPaint);
        canvas.drawText(this.grade, getWidth() / 2.0f, ((height + this.numberPaint.getTextSize()) + (this.density * 2.0f)) - this.gradePaint.ascent(), this.gradePaint);
    }
}
