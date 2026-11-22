package com.wakeup.commonui.chart;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import com.wakeup.commonui.utils.UIHelper;

/* loaded from: classes2.dex */
public class IndicatorDrawHelp {
    private final float mIndicatorHeight = UIHelper.dp2px(28.0f);
    private final float mIndicatorRadius = UIHelper.dp2px(10.0f);
    private final Paint mPaintBigRound;
    private final Paint mPaintIndicator;
    private final Paint mPaintIndicatorBg;

    public IndicatorDrawHelp() {
        Paint paint = new Paint(1);
        this.mPaintIndicator = paint;
        paint.setColor(Color.parseColor("#1E000000"));
        paint.setStrokeWidth(1.0f);
        Paint paint2 = new Paint(1);
        this.mPaintBigRound = paint2;
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.mPaintIndicatorBg = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setStrokeWidth(UIHelper.dp2px(1.0f));
        paint3.setColor(Color.parseColor("#f6f6f6"));
    }

    public void drawIndicatorLine(Canvas canvas, float f, float f2, float f3) {
        canvas.drawLine(f3, f, f3, f2, this.mPaintIndicator);
    }

    public void drawIndicatorCircle(Canvas canvas, float f, float f2, float f3) {
        float dp2px = (f - this.mIndicatorHeight) + UIHelper.dp2px(4.0f);
        Path path = new Path();
        path.moveTo(0.0f, dp2px);
        path.lineTo(f3 - UIHelper.dp2px(12.0f), dp2px);
        path.quadTo(f3, dp2px - UIHelper.dp2px(16.0f), UIHelper.dp2px(12.0f) + f3, dp2px);
        path.lineTo(f2, dp2px);
        path.lineTo(f2, f);
        path.lineTo(0.0f, f);
        canvas.drawPath(path, this.mPaintIndicatorBg);
        float f4 = f - this.mIndicatorHeight;
        float f5 = this.mIndicatorRadius;
        canvas.drawCircle(f3, f4 + f5, f5, this.mPaintBigRound);
    }

    public void setIndicatorColor(int i) {
        this.mPaintIndicator.setColor(i);
    }
}
