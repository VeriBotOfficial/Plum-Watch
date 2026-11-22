package com.wakeup.commonui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.wakeup.common.network.entity.health.RainbowList;
import com.wakeup.commonui.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: MotionWeekChartView.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0014J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,H\u0014J0\u0010-\u001a\u00020%2\u0006\u0010+\u001a\u00020,2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u0007H\u0002J0\u00102\u001a\u00020%2\u0006\u0010+\u001a\u00020,2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u0007H\u0002J0\u00103\u001a\u00020%2\u0006\u0010+\u001a\u00020,2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082D¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/wakeup/commonui/view/MotionWeekChartView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewWidth", "", "viewHeight", "paint", "Landroid/graphics/Paint;", "paintBg", "wordPaint", "paintWidth", "paintWidthHalf", "ringSpace", "colorBlue", "colorBlueBg", "colorOrange", "colorOrangeBg", "colorRed", "colorRedBg", "colorWhite", "colorBlack", "listData", "", "Lcom/wakeup/common/network/entity/health/RainbowList;", "[Lcom/wakeup/common/network/entity/health/RainbowList;", "isActive", "", "TAG", "", "onSizeChanged", "", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawMotion", "cx", "cy", "radios", "value", "drawActive", "drawHour", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MotionWeekChartView extends View {
    private final String TAG;
    private final int colorBlack;
    private final int colorBlue;
    private final int colorBlueBg;
    private final int colorOrange;
    private final int colorOrangeBg;
    private final int colorRed;
    private final int colorRedBg;
    private final int colorWhite;
    private boolean isActive;
    private RainbowList[] listData;
    private final Paint paint;
    private final Paint paintBg;
    private float paintWidth;
    private float paintWidthHalf;
    private float ringSpace;
    private float viewHeight;
    private float viewWidth;
    private final Paint wordPaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MotionWeekChartView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MotionWeekChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MotionWeekChartView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionWeekChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        this.paintBg = paint2;
        Paint paint3 = new Paint(1);
        this.wordPaint = paint3;
        float dp2px = UIHelper.dp2px(16.0f);
        this.paintWidth = dp2px;
        float f = 2;
        this.paintWidthHalf = dp2px / f;
        this.ringSpace = UIHelper.dp2px(4.0f);
        int parseColor = Color.parseColor("#1883F3");
        this.colorBlue = parseColor;
        int parseColor2 = Color.parseColor("#E4F4FF");
        this.colorBlueBg = parseColor2;
        this.colorOrange = Color.parseColor("#FF7300");
        this.colorOrangeBg = Color.parseColor("#FFE4D1");
        this.colorRed = Color.parseColor("#FF006A");
        this.colorRedBg = Color.parseColor("#FED4DD");
        this.colorWhite = Color.parseColor("#FFFFFF");
        int parseColor3 = Color.parseColor("#000000");
        this.colorBlack = parseColor3;
        this.listData = new RainbowList[0];
        this.isActive = true;
        this.TAG = "MotionWeekChartView";
        paint2.setStrokeWidth(this.paintWidth);
        paint2.setColor(parseColor2);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.paintWidth);
        paint.setColor(parseColor);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        float dp2px2 = UIHelper.dp2px(3.0f);
        this.paintWidth = dp2px2;
        this.paintWidthHalf = dp2px2 / f;
        this.ringSpace = UIHelper.dp2px(1.0f);
        paint3.setStrokeWidth(1.5f);
        paint3.setColor(parseColor3);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setTextSize(20.0f);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.viewWidth = getWidth();
        this.viewHeight = getHeight();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.viewWidth;
        float f2 = f / 7;
        float f3 = f2 / 3;
        float coerceAtMost = RangesKt.coerceAtMost(f, this.viewHeight) / 2.4f;
        int i = 0;
        while (i < 7) {
            RainbowList[] rainbowListArr = this.listData;
            if (!(rainbowListArr.length == 0)) {
                rainbowListArr[i].getStepGoalPercent();
                this.listData[i].getActiveGoalPercent();
                this.listData[i].getActiveKcalPercent();
            }
            float f4 = (f2 / 2) + (i * f2);
            int i2 = i + 1;
            int i3 = i2 * 13;
            drawMotion(canvas, f4, coerceAtMost, f3, i3);
            float f5 = f3;
            drawActive(canvas, f4, coerceAtMost, f5 * 0.7f, i3);
            drawHour(canvas, f4, coerceAtMost, f5 * 0.4f, i3);
            canvas.drawText(String.valueOf(i), f4 - this.paintWidthHalf, this.viewHeight, this.wordPaint);
            i = i2;
            f3 = f5;
        }
    }

    private final void drawMotion(Canvas canvas, float cx, float cy, float radios, int value) {
        this.paintBg.setStrokeWidth(this.paintWidth);
        this.paintBg.setColor(this.colorBlueBg);
        this.paint.setStrokeWidth(this.paintWidth);
        this.paint.setColor(this.colorBlue);
        canvas.drawCircle(cx, cy, radios, this.paintBg);
        float f = this.paintWidthHalf;
        float f2 = (cy / 2.0f) - f;
        float f3 = 2;
        float f4 = radios * f3;
        float f5 = 4;
        float f6 = (cx - radios) - (f / f5);
        canvas.drawArc(f6, f2, f4 + f6 + (f / f3), f2 + f4 + (f / f3), -270.0f, (value * 360.0f) / 100.0f, false, this.paint);
        this.paintBg.setStrokeWidth(this.paintWidthHalf);
        this.paintBg.setColor(this.colorWhite);
        canvas.drawCircle(cx, (cy + radios) - (this.paintWidthHalf / f5), 1.0f, this.paintBg);
    }

    private final void drawActive(Canvas canvas, float cx, float cy, float radios, int value) {
        this.paintBg.setStrokeWidth(this.paintWidth);
        this.paintBg.setColor(this.colorOrangeBg);
        this.paint.setStrokeWidth(this.paintWidth);
        this.paint.setColor(this.colorOrange);
        canvas.drawCircle(cx, cy, radios, this.paintBg);
        float f = cy / 1.7f;
        float f2 = 2;
        float f3 = radios * f2;
        float f4 = this.paintWidthHalf;
        float f5 = (cx - radios) - (f4 / 4);
        canvas.drawArc(f5, f, (f4 / f2) + f3 + f5, (f4 / f2) + f + f3, -270.0f, (value * 360.0f) / 100.0f, false, this.paint);
        this.paintBg.setStrokeWidth(this.paintWidthHalf);
        this.paintBg.setColor(this.colorWhite);
        canvas.drawCircle(cx, cy + radios, 1.0f, this.paintBg);
    }

    private final void drawHour(Canvas canvas, float cx, float cy, float radios, int value) {
        this.paintBg.setStrokeWidth(this.paintWidth);
        this.paintBg.setColor(this.colorRedBg);
        this.paint.setStrokeWidth(this.paintWidth);
        this.paint.setColor(this.colorRed);
        canvas.drawCircle(cx, cy, radios, this.paintBg);
        float f = cy / 1.3f;
        float f2 = 2;
        float f3 = radios * f2;
        float f4 = this.paintWidthHalf;
        float f5 = 4;
        float f6 = (cx - radios) - (f4 / f5);
        canvas.drawArc(f6, f, (f4 / f2) + f3 + f6, f + f3, -270.0f, (value * 360.0f) / 100.0f, false, this.paint);
        this.paintBg.setStrokeWidth(this.paintWidthHalf);
        this.paintBg.setColor(this.colorWhite);
        canvas.drawCircle(cx, (cy + radios) - (this.paintWidthHalf / f5), 1.0f, this.paintBg);
    }
}
