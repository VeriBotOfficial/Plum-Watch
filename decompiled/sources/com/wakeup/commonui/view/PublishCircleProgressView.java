package com.wakeup.commonui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.applovin.sdk.AppLovinMediationProvider;
import com.wakeup.commonui.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PublishCircleProgressView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0007J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/wakeup/commonui/view/PublishCircleProgressView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paint", "Landroid/graphics/Paint;", "rectF", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/Rect;", "current", AppLovinMediationProvider.MAX, "arcWidth", "", "width", "canvas", "Landroid/graphics/Canvas;", "SetCurrent", "", "SetMax", "onDraw", "Companion", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PublishCircleProgressView extends View {
    private static final String TAG = "PublishCircleProgressView";
    private final float arcWidth;
    private Canvas canvas;
    private int current;
    private int max;
    private final Paint paint;
    private final Rect rect;
    private final RectF rectF;
    private final float width;

    public PublishCircleProgressView(Context context) {
        this(context, null, 0, 6, null);
    }

    public PublishCircleProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PublishCircleProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PublishCircleProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.paint = paint;
        this.current = 1;
        this.max = 100;
        this.arcWidth = UIHelper.dp2px(2.0f);
        this.width = UIHelper.dp2px(18.0f);
        paint.setAntiAlias(true);
        this.rectF = new RectF();
        this.rect = new Rect();
    }

    public final void SetCurrent(int current) {
        this.current = current;
        invalidate();
    }

    public final void SetMax(int max) {
        this.max = max;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.canvas = canvas;
        super.onDraw(canvas);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.arcWidth);
        this.paint.setColor(-7829368);
        float f = this.width / 2;
        canvas.drawCircle(f, f, f - this.arcWidth, this.paint);
        this.paint.setColor(-1);
        RectF rectF = this.rectF;
        float f2 = this.arcWidth;
        float f3 = this.width;
        rectF.set(f2, f2, f3 - f2, f3 - f2);
        canvas.drawArc(this.rectF, -90.0f, (this.current * 360) / this.max, false, this.paint);
    }
}
