package com.wakeup.feature.device.white.record.view;

import android.content.Context;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.iflytek.cloud.SpeechConstant;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.UIHelper;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: RecordWaveView.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0014J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0007J\u0006\u0010\u001a\u001a\u00020\u0013J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/wakeup/feature/device/white/record/view/RecordWaveView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "barPaint", "Landroid/graphics/Paint;", "barWidth", "", "barGap", "amplitudes", "Ljava/util/LinkedList;", "maxBars", "onSizeChanged", "", "w", "h", "oldw", "oldh", "addVolume", SpeechConstant.VOLUME, SDPKeywords.CLEAR, "onDraw", "canvas", "Landroid/graphics/Canvas;", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecordWaveView extends View {
    private final LinkedList<Float> amplitudes;
    private final float barGap;
    private final Paint barPaint;
    private final float barWidth;
    private int maxBars;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecordWaveView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecordWaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RecordWaveView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordWaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(ContextCompat.getColor(context, R.color.color_ff5b00));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.barPaint = paint;
        float dp2px = UIHelper.dp2px(3.0f);
        this.barWidth = dp2px;
        this.barGap = UIHelper.dp2px(2.0f);
        this.amplitudes = new LinkedList<>();
        paint.setStrokeWidth(dp2px);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.maxBars = RangesKt.coerceAtLeast((int) (w / (this.barWidth + this.barGap)), 1);
    }

    public final void addVolume(int volume) {
        this.amplitudes.addLast(Float.valueOf(RangesKt.coerceIn(volume / 30.0f, 0.04f, 1.0f)));
        while (this.amplitudes.size() > this.maxBars) {
            this.amplitudes.removeFirst();
        }
        invalidate();
    }

    public final void clear() {
        this.amplitudes.clear();
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.amplitudes.isEmpty()) {
            return;
        }
        float height = getHeight() / 2.0f;
        float height2 = (getHeight() / 2.0f) - UIHelper.dp2px(2.0f);
        float f = 2;
        float width = getWidth() - (this.barWidth / f);
        Iterator<Float> descendingIterator = this.amplitudes.descendingIterator();
        float f2 = width;
        while (descendingIterator.hasNext() && f2 > 0.0f) {
            float coerceAtLeast = RangesKt.coerceAtLeast(descendingIterator.next().floatValue() * height2, this.barWidth / f);
            Canvas canvas2 = canvas;
            canvas2.drawLine(f2, height - coerceAtLeast, f2, height + coerceAtLeast, this.barPaint);
            f2 -= this.barWidth + this.barGap;
            canvas = canvas2;
        }
    }
}
