package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.yandex.div2.PhoneMasks;

/* loaded from: classes14.dex */
public class ckl extends com.bytedance.sdk.openadsdk.core.bh.tw {
    private Paint fxn;
    private int gff;
    private RectF kg;

    public ckl(Context context) {
        this(context, null);
    }

    public ckl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ckl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gff = 0;
        fxn();
    }

    private void fxn() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.fxn = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.fxn.setColor(Color.parseColor("#99333333"));
        this.fxn.setAntiAlias(true);
        this.fxn.setStrokeWidth(0.0f);
        this.kg = new RectF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bh.tw, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            int measureText = (int) getPaint().measureText(PhoneMasks.EXTRA_NUMBERS);
            this.gff = measureText;
            if (measuredWidth < measureText) {
                measuredWidth = measureText;
            }
            int i3 = measuredWidth + ((measuredHeight / 2) * 2);
            setMeasuredDimension(i3, measuredHeight);
            this.kg.set(0.0f, 0.0f, i3, measuredHeight);
            return;
        }
        this.kg.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.kg;
        canvas.drawRoundRect(rectF, rectF.bottom / 2.0f, this.kg.bottom / 2.0f, this.fxn);
        canvas.translate((this.kg.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }
}
