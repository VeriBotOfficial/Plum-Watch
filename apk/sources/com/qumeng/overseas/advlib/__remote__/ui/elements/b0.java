package com.qumeng.overseas.advlib.__remote__.ui.elements;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class b0 extends View {
    private float t;
    private Paint u;

    public b0(Context context) {
        super(context);
        a();
    }

    private void a() {
        setBackgroundColor(-1);
        float f = getResources().getDisplayMetrics().density;
        this.t = f;
        int r0 = (int) (f * 15.0f);
        setPadding(r0, r0, r0, 0);
        Paint paint = new Paint();
        this.u = paint;
        paint.setStyle(Paint.Style.FILL);
        this.u.setColor(Color.parseColor("#f3f3f3"));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float f = paddingLeft;
        float f2 = this.t;
        float f3 = 20.0f * f2;
        float f4 = f2 * 33.0f;
        int width = getWidth() - (paddingLeft * 2);
        float f5 = this.t * 25.0f;
        float f6 = f5 / 2.0f;
        float f7 = width + f;
        float f8 = f5 + paddingTop;
        canvas.drawRoundRect(new RectF(f, paddingTop, f7, f8), f6, f6, this.u);
        float f9 = f8 + f3;
        float f10 = f5 + f9;
        canvas.drawRoundRect(new RectF(f, f9, (this.t * 150.0f) + f, f10), f6, f6, this.u);
        float f11 = f10 + f4;
        float f12 = (this.t * 160.0f) + f11;
        RectF rectF = new RectF(f, f11, f7, f12);
        float f13 = this.t * 6.0f;
        canvas.drawRoundRect(rectF, f13, f13, this.u);
        float f14 = f12 + f4;
        for (int r0 = 0; r0 < 5; r0++) {
            float f15 = this.t * 15.0f;
            float f16 = f15 / 2.0f;
            if (r0 != 4) {
                canvas.drawRoundRect(new RectF(f, f14, f7, f15 + f14), f16, f16, this.u);
                f14 += f15 * 2.0f;
            } else {
                float f17 = f15 + f14;
                canvas.drawRoundRect(new RectF(f, f14, (this.t * 160.0f) + f, f17), f16, f16, this.u);
                f14 = f17;
            }
        }
        float f18 = f14 + f4;
        RectF rectF2 = new RectF(f, f18, f7, (this.t * 86.0f) + f18);
        float f19 = this.t * 6.0f;
        canvas.drawRoundRect(rectF2, f19, f19, this.u);
    }

    public b0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public b0(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        a();
    }
}
