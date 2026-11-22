package com.wakeup.feature.aimusic.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SoftEdgeImageView.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0014R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/wakeup/feature/aimusic/ui/widget/SoftEdgeImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "softEdgeEnabled", "getSoftEdgeEnabled", "()Z", "setSoftEdgeEnabled", "(Z)V", "topFraction", "", "bottomFraction", "maskPaint", "Landroid/graphics/Paint;", "setSoftEdgeFractions", "", "top", "bottom", "onDraw", "canvas", "Landroid/graphics/Canvas;", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SoftEdgeImageView extends AppCompatImageView {
    private float bottomFraction;
    private final Paint maskPaint;
    private boolean softEdgeEnabled;
    private float topFraction;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SoftEdgeImageView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SoftEdgeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SoftEdgeImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoftEdgeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.topFraction = 0.42f;
        this.bottomFraction = 0.42f;
        this.maskPaint = new Paint(1);
    }

    public final boolean getSoftEdgeEnabled() {
        return this.softEdgeEnabled;
    }

    public final void setSoftEdgeEnabled(boolean z) {
        if (this.softEdgeEnabled == z) {
            return;
        }
        this.softEdgeEnabled = z;
        invalidate();
    }

    public final void setSoftEdgeFractions(float top2, float bottom) {
        this.topFraction = RangesKt.coerceIn(top2, 0.05f, 0.48f);
        this.bottomFraction = RangesKt.coerceIn(bottom, 0.05f, 0.48f);
        if (this.softEdgeEnabled) {
            invalidate();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!this.softEdgeEnabled || getWidth() <= 0 || getHeight() <= 0 || getDrawable() == null) {
            super.onDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        float f = this.topFraction;
        float f2 = this.bottomFraction;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, width, height, null);
        super.onDraw(canvas);
        this.maskPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.maskPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{0, Color.argb(40, 255, 255, 255), Color.argb(112, 255, 255, 255), Color.argb(200, 255, 255, 255), -1, -1, Color.argb(200, 255, 255, 255), Color.argb(112, 255, 255, 255), Color.argb(40, 255, 255, 255), 0}, new float[]{0.0f, f * 0.22f, f * 0.48f, f * 0.78f, f, 1.0f - f2, 1.0f - (0.78f * f2), 1.0f - (0.48f * f2), 1.0f - (f2 * 0.22f), 1.0f}, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, width, height, this.maskPaint);
        this.maskPaint.setXfermode(null);
        this.maskPaint.setShader(null);
        canvas.restoreToCount(saveLayer);
    }
}
