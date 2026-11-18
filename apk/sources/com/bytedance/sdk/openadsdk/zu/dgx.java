package com.bytedance.sdk.openadsdk.zu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public class dgx extends View {
    private final Paint fxn;
    private float gff;
    private float kg;

    public dgx(Context context) {
        super(context);
        setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint = new Paint();
        this.fxn = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public void setProgress(float f) {
        this.gff = getWidth() * f;
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        float f = r2;
        this.kg = (1.0f * f) / 2.0f;
        this.fxn.setStrokeWidth(f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.gff;
        if (f > 0.0f) {
            float f2 = this.kg;
            canvas.drawLine(0.0f, f2, f, f2, this.fxn);
        }
    }
}
