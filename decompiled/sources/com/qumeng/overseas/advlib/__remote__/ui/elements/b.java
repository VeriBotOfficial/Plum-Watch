package com.qumeng.overseas.advlib.__remote__.ui.elements;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes17.dex */
public class b extends View {
    public b(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(getContext(), 2.0f));
        paint.setColor(Color.parseColor("#666666"));
        int i = height / 2;
        canvas.translate(paddingLeft, getPaddingTop() + i);
        float f = width;
        canvas.drawLine(0.0f, 0.0f, f, ((-height) / 2) + r9, paint);
        canvas.drawLine(0.0f, 0.0f, f, i - r9, paint);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(getContext(), 10.0f) + getPaddingLeft() + getPaddingRight(), com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(getContext(), 16.0f) + getPaddingTop() + getPaddingBottom());
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
