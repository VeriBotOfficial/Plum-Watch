package com.wakeup.feature.device.white.record.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: TrimWaveView.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001FB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001aJ\u0016\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u00020\u0014J\u000e\u00103\u001a\u00020.2\u0006\u00104\u001a\u00020\"J\u000e\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020\u0014J\b\u00107\u001a\u00020\u0014H\u0002J\b\u00108\u001a\u00020\u0014H\u0002J\b\u00109\u001a\u00020\u0014H\u0002J\u0010\u0010:\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u0014H\u0002J\u0010\u0010<\u001a\u00020\u00142\u0006\u0010=\u001a\u00020\u0014H\u0002J\u0010\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020@H\u0014J\u0018\u0010A\u001a\u00020.2\u0006\u0010?\u001a\u00020@2\u0006\u0010B\u001a\u00020\u0014H\u0002J\u0010\u0010C\u001a\u00020\"2\u0006\u0010D\u001a\u00020EH\u0016R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0014X\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006G"}, d2 = {"Lcom/wakeup/feature/device/white/record/view/TrimWaveView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "orange", "gray", "red", "selectedBarPaint", "Landroid/graphics/Paint;", "unselectedBarPaint", "selectionBgPaint", "handlePaint", "playheadPaint", "barWidth", "", "barGap", "handleWidth", "handleTouchSlop", "edgePadding", "amplitudes", "", "value", "startFraction", "getStartFraction", "()F", "endFraction", "getEndFraction", "overLimit", "", "playFraction", "draggingLeft", "draggingRight", "minGap", "selectionListener", "Lcom/wakeup/feature/device/white/record/view/TrimWaveView$OnSelectionChangeListener;", "getSelectionListener", "()Lcom/wakeup/feature/device/white/record/view/TrimWaveView$OnSelectionChangeListener;", "setSelectionListener", "(Lcom/wakeup/feature/device/white/record/view/TrimWaveView$OnSelectionChangeListener;)V", "setWaveform", "", "data", "setSelection", "start", "end", "setOverLimit", "over", "setPlayFraction", "fraction", "trackLeft", "trackRight", "trackWidth", "fractionToX", "f", "xToFraction", "x", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawHandle", "cx", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "OnSelectionChangeListener", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrimWaveView extends View {
    private float[] amplitudes;
    private final float barGap;
    private final float barWidth;
    private boolean draggingLeft;
    private boolean draggingRight;
    private final float edgePadding;
    private float endFraction;
    private final int gray;
    private final Paint handlePaint;
    private final float handleTouchSlop;
    private final float handleWidth;
    private final float minGap;
    private final int orange;
    private boolean overLimit;
    private float playFraction;
    private final Paint playheadPaint;
    private final int red;
    private final Paint selectedBarPaint;
    private final Paint selectionBgPaint;
    private OnSelectionChangeListener selectionListener;
    private float startFraction;
    private final Paint unselectedBarPaint;

    /* compiled from: TrimWaveView.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/wakeup/feature/device/white/record/view/TrimWaveView$OnSelectionChangeListener;", "", "onChange", "", "startFraction", "", "endFraction", "fromUser", "", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnSelectionChangeListener {
        void onChange(float startFraction, float endFraction, boolean fromUser);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrimWaveView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrimWaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TrimWaveView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrimWaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int color = ContextCompat.getColor(context, R.color.color_ff5b00);
        this.orange = color;
        int color2 = ContextCompat.getColor(context, R.color.color_d9d9d9);
        this.gray = color2;
        this.red = Color.parseColor("#FF3B30");
        Paint paint = new Paint(1);
        paint.setColor(color);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.selectedBarPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(color2);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.unselectedBarPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor((16777215 & color) | 570425344);
        this.selectionBgPaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(color);
        this.handlePaint = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(Color.parseColor("#FFAC68"));
        paint5.setStrokeWidth(UIHelper.dp2px(2.0f));
        this.playheadPaint = paint5;
        this.barWidth = UIHelper.dp2px(2.5f);
        this.barGap = UIHelper.dp2px(2.0f);
        float dp2px = UIHelper.dp2px(10.0f);
        this.handleWidth = dp2px;
        this.handleTouchSlop = UIHelper.dp2px(24.0f);
        this.edgePadding = dp2px;
        this.amplitudes = new float[0];
        this.endFraction = 1.0f;
        this.playFraction = -1.0f;
        this.minGap = 0.02f;
    }

    public final float getStartFraction() {
        return this.startFraction;
    }

    public final float getEndFraction() {
        return this.endFraction;
    }

    public final OnSelectionChangeListener getSelectionListener() {
        return this.selectionListener;
    }

    public final void setSelectionListener(OnSelectionChangeListener onSelectionChangeListener) {
        this.selectionListener = onSelectionChangeListener;
    }

    public final void setWaveform(float[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.amplitudes = data;
        this.startFraction = 0.0f;
        this.endFraction = 1.0f;
        this.playFraction = -1.0f;
        invalidate();
        OnSelectionChangeListener onSelectionChangeListener = this.selectionListener;
        if (onSelectionChangeListener != null) {
            onSelectionChangeListener.onChange(this.startFraction, this.endFraction, false);
        }
    }

    public final void setSelection(float start, float end) {
        float coerceIn = RangesKt.coerceIn(start, 0.0f, 1.0f);
        this.startFraction = coerceIn;
        this.endFraction = RangesKt.coerceIn(end, coerceIn + this.minGap, 1.0f);
        invalidate();
        OnSelectionChangeListener onSelectionChangeListener = this.selectionListener;
        if (onSelectionChangeListener != null) {
            onSelectionChangeListener.onChange(this.startFraction, this.endFraction, false);
        }
    }

    public final void setOverLimit(boolean over) {
        if (this.overLimit == over) {
            return;
        }
        this.overLimit = over;
        invalidate();
    }

    public final void setPlayFraction(float fraction) {
        this.playFraction = fraction;
        invalidate();
    }

    /* renamed from: trackLeft, reason: from getter */
    private final float getEdgePadding() {
        return this.edgePadding;
    }

    private final float trackRight() {
        return getWidth() - this.edgePadding;
    }

    private final float trackWidth() {
        return RangesKt.coerceAtLeast(trackRight() - getEdgePadding(), 1.0f);
    }

    private final float fractionToX(float f) {
        return getEdgePadding() + (f * trackWidth());
    }

    private final float xToFraction(float x) {
        return RangesKt.coerceIn((x - getEdgePadding()) / trackWidth(), 0.0f, 1.0f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        boolean z;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float height2 = (getHeight() / 2.0f) - UIHelper.dp2px(6.0f);
        float edgePadding = getEdgePadding();
        float fractionToX = fractionToX(this.startFraction);
        float fractionToX2 = fractionToX(this.endFraction);
        canvas.drawRect(fractionToX, 0.0f, fractionToX2, getHeight(), this.selectionBgPaint);
        if (!(this.amplitudes.length == 0)) {
            float f2 = this.barWidth + this.barGap;
            int i = 0;
            for (int coerceAtLeast = RangesKt.coerceAtLeast((int) (trackWidth() / f2), 1); i < coerceAtLeast; coerceAtLeast = coerceAtLeast) {
                float f3 = i;
                float f4 = (f3 * f2) + edgePadding + (this.barWidth / 2);
                float coerceIn = RangesKt.coerceIn(this.amplitudes[RangesKt.coerceIn((int) ((f3 / coerceAtLeast) * r5.length), 0, this.amplitudes.length - 1)], 0.04f, 1.0f) * height2;
                if (fractionToX > f4 || f4 > fractionToX2) {
                    f = coerceIn;
                    z = false;
                } else {
                    f = coerceIn;
                    z = true;
                }
                canvas.drawLine(f4, height - f, f4, f + height, z ? this.selectedBarPaint : this.unselectedBarPaint);
                i++;
            }
        }
        float f5 = this.playFraction;
        if (0.0f > f5 || f5 > 1.0f) {
            canvas2 = canvas;
        } else {
            float fractionToX3 = fractionToX(f5);
            canvas2 = canvas;
            canvas2.drawLine(fractionToX3, 0.0f, fractionToX3, getHeight(), this.playheadPaint);
        }
        this.handlePaint.setColor(this.overLimit ? this.red : this.orange);
        drawHandle(canvas2, fractionToX);
        drawHandle(canvas2, fractionToX2);
    }

    private final void drawHandle(Canvas canvas, float cx) {
        float f = this.handleWidth / 2;
        canvas.drawRoundRect(new RectF(cx - f, 0.0f, cx + f, getHeight()), f, f, this.handlePaint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            float r0 = r6.getX()
            int r1 = r6.getAction()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L6b
            if (r1 == r3) goto L59
            r4 = 2
            if (r1 == r4) goto L1a
            r0 = 3
            if (r1 == r0) goto L59
            goto L66
        L1a:
            float r0 = r5.xToFraction(r0)
            boolean r1 = r5.draggingLeft
            if (r1 == 0) goto L3b
            float r6 = r5.endFraction
            float r1 = r5.minGap
            float r6 = r6 - r1
            r1 = 0
            float r6 = kotlin.ranges.RangesKt.coerceIn(r0, r1, r6)
            r5.startFraction = r6
            com.wakeup.feature.device.white.record.view.TrimWaveView$OnSelectionChangeListener r0 = r5.selectionListener
            if (r0 == 0) goto L37
            float r1 = r5.endFraction
            r0.onChange(r6, r1, r3)
        L37:
            r5.invalidate()
            return r3
        L3b:
            boolean r1 = r5.draggingRight
            if (r1 == 0) goto L66
            float r6 = r5.startFraction
            float r1 = r5.minGap
            float r6 = r6 + r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r6 = kotlin.ranges.RangesKt.coerceIn(r0, r6, r1)
            r5.endFraction = r6
            com.wakeup.feature.device.white.record.view.TrimWaveView$OnSelectionChangeListener r0 = r5.selectionListener
            if (r0 == 0) goto L55
            float r1 = r5.startFraction
            r0.onChange(r1, r6, r3)
        L55:
            r5.invalidate()
            return r3
        L59:
            r5.draggingLeft = r2
            r5.draggingRight = r2
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L66
            r0.requestDisallowInterceptTouchEvent(r2)
        L66:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        L6b:
            float r6 = r5.startFraction
            float r6 = r5.fractionToX(r6)
            float r6 = r0 - r6
            float r6 = java.lang.Math.abs(r6)
            float r1 = r5.endFraction
            float r1 = r5.fractionToX(r1)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            float r1 = r5.handleTouchSlop
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 > 0) goto L8f
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 > 0) goto L8f
            r5.draggingLeft = r3
            goto L95
        L8f:
            int r6 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r6 > 0) goto L9f
            r5.draggingRight = r3
        L95:
            android.view.ViewParent r6 = r5.getParent()
            if (r6 == 0) goto L9e
            r6.requestDisallowInterceptTouchEvent(r3)
        L9e:
            return r3
        L9f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.device.white.record.view.TrimWaveView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
