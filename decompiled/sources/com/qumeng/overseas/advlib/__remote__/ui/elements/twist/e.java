package com.qumeng.overseas.advlib.__remote__.ui.elements.twist;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;

/* loaded from: classes17.dex */
public class e extends View {
    private Paint t;
    private int u;

    public e(Context context) {
        super(context);
        a();
    }

    private void a() {
        Paint paint = new Paint();
        this.t = paint;
        paint.setStyle(Paint.Style.STROKE);
        int a2 = s.a(getContext(), 4.0f);
        this.u = a2;
        this.t.setStrokeWidth(a2);
        this.t.setStrokeCap(Paint.Cap.ROUND);
        this.t.setColor(-1);
        this.t.setAntiAlias(true);
        this.t.setShadowLayer(2.0f, 0.0f, 0.0f, Color.parseColor("#4D000000"));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        float f = this.u;
        RectF rectF = new RectF(f, f, width - r3, height - r3);
        float a2 = a(7);
        canvas.drawRoundRect(rectF, a2, a2, this.t);
        canvas.drawLine(a(14), a(45), a(22), a(45), this.t);
    }

    private int a(int i) {
        return s.a(getContext(), i);
    }
}
