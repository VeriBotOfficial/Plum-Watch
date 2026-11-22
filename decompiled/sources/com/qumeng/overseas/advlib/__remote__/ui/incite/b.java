package com.qumeng.overseas.advlib.__remote__.ui.incite;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;

/* loaded from: classes17.dex */
public class b extends View {
    private int t;

    public b(Context context) {
        super(context);
        this.t = s.a(getContext(), 36.0f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width = getWidth();
        int a2 = s.a(getContext(), 1.0f);
        int i = width / 5;
        float f = width / 2;
        canvas.translate(f, f);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(a2);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        canvas.drawCircle(0.0f, 0.0f, r0 - (a2 * 2), paint);
        float f2 = i;
        canvas.drawLine(0.0f, 0.0f, f2, f2, paint);
        float f3 = -i;
        canvas.drawLine(0.0f, 0.0f, f2, f3, paint);
        canvas.drawLine(0.0f, 0.0f, f3, f3, paint);
        canvas.drawLine(0.0f, 0.0f, f3, f2, paint);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.t;
        setMeasuredDimension(i3, i3);
    }

    public void setSize(int i) {
        this.t = s.a(getContext(), i);
        postInvalidate();
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = s.a(getContext(), 36.0f);
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = s.a(getContext(), 36.0f);
    }
}
