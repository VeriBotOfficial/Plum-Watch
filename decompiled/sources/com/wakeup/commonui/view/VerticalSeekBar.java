package com.wakeup.commonui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.wakeup.common.utils.BitmapUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerticalSeekBar.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00014B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007H\u0014J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*H\u0014J\u0010\u0010+\u001a\u00020%2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010,\u001a\u00020%2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u000e\u00101\u001a\u00020%2\u0006\u0010\"\u001a\u00020#J\u000e\u00102\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020\u0007J\u0006\u00103\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/wakeup/commonui/view/VerticalSeekBar;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "maxValue", "minValue", "thumbColor", "x", "", "y", "progress", "sLeft", "sTop", "sRight", "sBottom", "sWidth", "sHeight", "paintPb", "Landroid/graphics/Paint;", "paintSelPb", "rectNorBg", "Landroid/graphics/RectF;", "rectSelBg", "thumbPaint", "thumbBitmap", "Landroid/graphics/Bitmap;", "thumbSize", "histogramWidth", "onStateChangeListener", "Lcom/wakeup/commonui/view/VerticalSeekBar$OnStateChangeListener;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawBackground", "drawCircle", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "setOnChangeListener", "setProgress", "getProgress", "OnStateChangeListener", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VerticalSeekBar extends View {
    private int histogramWidth;
    private int maxValue;
    private int minValue;
    private OnStateChangeListener onStateChangeListener;
    private final Paint paintPb;
    private final Paint paintSelPb;
    private int progress;
    private final RectF rectNorBg;
    private final RectF rectSelBg;
    private float sBottom;
    private float sHeight;
    private float sLeft;
    private float sRight;
    private float sTop;
    private float sWidth;
    private Bitmap thumbBitmap;
    private int thumbColor;
    private final Paint thumbPaint;
    private int thumbSize;
    private float x;
    private float y;

    /* compiled from: VerticalSeekBar.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/wakeup/commonui/view/VerticalSeekBar$OnStateChangeListener;", "", "onTrackingTouch", "", "view", "Landroid/view/View;", "progress", "", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnStateChangeListener {
        void onTrackingTouch(View view, int progress);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalSeekBar(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ VerticalSeekBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.maxValue = 100;
        this.thumbColor = -1;
        this.y = 50.0f;
        Paint paint = new Paint();
        this.paintPb = paint;
        Paint paint2 = new Paint();
        this.paintSelPb = paint2;
        this.rectNorBg = new RectF();
        this.rectSelBg = new RectF();
        Paint paint3 = new Paint();
        this.thumbPaint = paint3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.VerticalSeekBar);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.maxValue = obtainStyledAttributes.getInt(R.styleable.VerticalSeekBar_bar_maxValue, 100);
        this.minValue = obtainStyledAttributes.getInt(R.styleable.VerticalSeekBar_bar_minValue, 0);
        int color = obtainStyledAttributes.getColor(R.styleable.VerticalSeekBar_bar_progressColor, ContextCompat.getColor(context, R.color.color_ff7300));
        obtainStyledAttributes.recycle();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(ContextCompat.getColor(context, R.color.color_EFEFEF));
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(color);
        this.thumbSize = UIHelper.dp2px(24.0f);
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(this.thumbColor);
        paint3.setShadowLayer(12.0f, 1.0f, 1.0f, ContextCompat.getColor(context, R.color.color_3000000));
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_vertical_seekbar_thumb);
        int i2 = this.thumbSize;
        this.thumbBitmap = BitmapUtils.scale(decodeResource, i2, i2);
        this.histogramWidth = UIHelper.dp2px(11.0f);
    }

    @Override // android.view.View
    protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        int measuredHeight = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        int i = this.histogramWidth;
        float f = (measuredWidth - (i * 1.0f)) / 2.0f;
        this.sLeft = f;
        float f2 = ((measuredWidth - (i * 1.0f)) / 2.0f) + i;
        this.sRight = f2;
        int i2 = this.thumbSize;
        float f3 = (i2 / 2.0f) + 12.0f;
        this.sTop = f3;
        float f4 = (measuredHeight - (i2 / 2.0f)) - 12.0f;
        this.sBottom = f4;
        this.sWidth = f2 - f;
        float f5 = f4 - f3;
        this.sHeight = f5;
        this.x = measuredWidth / 2;
        this.y = f5 - (((this.progress * 1.0f) / this.maxValue) * f5);
        this.rectNorBg.set(f, f3, f2, f4);
        this.rectSelBg.set(this.sLeft, this.y, this.sRight, this.sBottom);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        drawBackground(canvas);
        drawCircle(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r0 > (r1 - (r2 / 2.0f))) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void drawBackground(android.graphics.Canvas r7) {
        /*
            r6 = this;
            float r0 = r6.y
            float r1 = r6.sTop
            int r2 = r6.thumbSize
            float r3 = (float) r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r3 = r1 - r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L15
        L10:
            float r0 = (float) r2
            float r0 = r0 / r4
            float r0 = r1 - r0
            goto L20
        L15:
            float r1 = r6.sBottom
            float r3 = (float) r2
            float r3 = r3 / r4
            float r3 = r1 - r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L20
            goto L10
        L20:
            android.graphics.RectF r1 = r6.rectNorBg
            float r2 = r6.sWidth
            r3 = 2
            float r3 = (float) r3
            float r4 = r2 / r3
            float r2 = r2 / r3
            android.graphics.Paint r5 = r6.paintPb
            r7.drawRoundRect(r1, r4, r2, r5)
            android.graphics.RectF r1 = r6.rectSelBg
            float r2 = r6.sLeft
            float r4 = r6.sRight
            float r5 = r6.sBottom
            r1.set(r2, r0, r4, r5)
            android.graphics.RectF r0 = r6.rectSelBg
            float r1 = r6.sWidth
            float r2 = r1 / r3
            float r1 = r1 / r3
            android.graphics.Paint r3 = r6.paintSelPb
            r7.drawRoundRect(r0, r2, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.commonui.view.VerticalSeekBar.drawBackground(android.graphics.Canvas):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r0 > (r1 - (r2 / 2.0f))) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void drawCircle(android.graphics.Canvas r8) {
        /*
            r7 = this;
            float r0 = r7.y
            float r1 = r7.sTop
            int r2 = r7.thumbSize
            float r3 = (float) r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r3 = r1 - r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L15
        L10:
            float r0 = (float) r2
            float r0 = r0 / r4
            float r0 = r1 - r0
            goto L20
        L15:
            float r1 = r7.sBottom
            float r3 = (float) r2
            float r3 = r3 / r4
            float r3 = r1 - r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L20
            goto L10
        L20:
            float r1 = r7.sLeft
            int r3 = r7.histogramWidth
            float r3 = (float) r3
            float r3 = r3 / r4
            float r1 = r1 + r3
            float r3 = (float) r2
            float r3 = r3 / r4
            float r1 = r1 - r3
            android.graphics.Bitmap r3 = r7.thumbBitmap
            if (r3 == 0) goto L40
            float r5 = (float) r2
            float r5 = r5 / r4
            float r5 = r5 + r1
            float r6 = (float) r2
            float r6 = r6 / r4
            float r6 = r6 + r0
            float r2 = (float) r2
            float r2 = r2 / r4
            android.graphics.Paint r4 = r7.thumbPaint
            r8.drawCircle(r5, r6, r2, r4)
            android.graphics.Paint r2 = r7.thumbPaint
            r8.drawBitmap(r3, r1, r0, r2)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.commonui.view.VerticalSeekBar.drawCircle(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        float y = event.getY();
        this.y = y;
        float f = this.sHeight;
        float f2 = (f - y) / f;
        int i = this.maxValue;
        int i2 = (int) (f2 * i);
        this.progress = i2;
        int i3 = this.minValue;
        if (i2 < i3) {
            this.progress = i3;
        } else if (i2 > i) {
            this.progress = i;
        }
        int action = event.getAction();
        if (action == 1) {
            OnStateChangeListener onStateChangeListener = this.onStateChangeListener;
            if (onStateChangeListener != null && onStateChangeListener != null) {
                onStateChangeListener.onTrackingTouch(this, this.progress);
            }
        } else if (action == 2) {
            setProgress(this.progress);
            invalidate();
        }
        return true;
    }

    public final void setOnChangeListener(OnStateChangeListener onStateChangeListener) {
        Intrinsics.checkNotNullParameter(onStateChangeListener, "onStateChangeListener");
        this.onStateChangeListener = onStateChangeListener;
    }

    public final void setProgress(int progress) {
        this.progress = progress;
        invalidate();
    }

    public final int getProgress() {
        return this.progress;
    }
}
