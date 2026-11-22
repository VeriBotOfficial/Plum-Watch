package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: classes14.dex */
public class zu extends com.bytedance.sdk.openadsdk.core.bh.hm {
    private Paint fxn;
    private RectF kg;

    public zu(Context context) {
        super(context);
        fxn();
    }

    private void fxn() {
        Paint paint = new Paint();
        this.fxn = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.fxn.setColor(Color.parseColor("#99333333"));
        this.fxn.setAntiAlias(true);
        this.fxn.setStrokeWidth(0.0f);
        this.kg = new RectF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bh.hm, android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.kg.right == getMeasuredWidth() && this.kg.bottom == getMeasuredHeight()) {
            return;
        }
        this.kg.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.kg;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, this.kg.bottom / 2.0f, this.fxn);
        super.onDraw(canvas);
    }
}
