package com.qumeng.overseas.advlib.__remote__.ui.elements;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes17.dex */
public class e extends View {
    public static final int A = 2;
    public static final int B = 3;
    public static final int C = 4;
    public static final int D = 5;
    public static final int E = 0;
    public static final int y = 0;
    public static final int z = 1;
    public int t;
    public int u;
    private Paint v;
    private float w;
    private int x;

    public e(Context context) {
        super(context);
        this.t = Color.parseColor("#5b6d8c");
        this.u = 0;
        this.x = 0;
        a();
    }

    private void b(Canvas canvas) {
        this.v.setStyle(Paint.Style.STROKE);
        int width = getWidth();
        int height = getHeight();
        int i = height / 6;
        canvas.save();
        float f = width / 2;
        float f2 = height / 2;
        canvas.translate(f, f2);
        Path path = new Path();
        float f3 = (-height) / 2;
        path.moveTo(0.0f, f3);
        float f4 = i;
        path.lineTo(0.0f, (f2 - this.w) - f4);
        float f5 = (-width) / 2;
        path.rMoveTo(f5, f4);
        path.rLineTo(width, 0.0f);
        path.rMoveTo(f5, -i);
        float f6 = this.w;
        path.rLineTo(f - f6, f6 + f3);
        path.moveTo(0.0f, (f2 - this.w) - f4);
        float f7 = this.w;
        path.rLineTo(f5 + f7, f3 + f7);
        canvas.drawPath(path, this.v);
        canvas.restore();
    }

    private void c(Canvas canvas) {
        this.v.setStyle(Paint.Style.STROKE);
        int width = getWidth();
        int height = getHeight();
        canvas.save();
        float f = width / 2;
        float f2 = height / 2;
        canvas.translate(f, f2);
        Path path = new Path();
        int i = -height;
        path.moveTo(width / 4, i / 4);
        path.lineTo((-width) / 4, height / 4);
        path.rMoveTo(0.0f, i / 2);
        path.rLineTo(f, f2);
        canvas.drawPath(path, this.v);
        canvas.restore();
        this.v.setColor(this.t);
    }

    private void d(Canvas canvas) {
        this.v.setStyle(Paint.Style.STROKE);
        int width = getWidth();
        int height = getHeight();
        canvas.save();
        float f = width / 2;
        float f2 = height / 2;
        canvas.translate(f, f2);
        Path path = new Path();
        if (this.u == 0) {
            path.moveTo((-width) / 2, 0.0f);
            path.lineTo(0.0f, f2);
            path.lineTo(f, (-height) / 2);
        }
        canvas.drawPath(path, this.v);
        canvas.restore();
    }

    private void e(Canvas canvas) {
        this.v.setStyle(Paint.Style.STROKE);
        int width = getWidth();
        int height = getHeight();
        canvas.save();
        float f = width / 2;
        float f2 = height / 2;
        canvas.translate(f, f2);
        Path path = new Path();
        path.rMoveTo((-width) / 4, height / 4);
        path.rLineTo(0.0f, (-height) / 2);
        path.rMoveTo(f, 0.0f);
        path.rLineTo(0.0f, f2);
        canvas.drawPath(path, this.v);
        canvas.restore();
    }

    private void f(Canvas canvas) {
        this.v.setStyle(Paint.Style.FILL);
        int width = getWidth();
        int height = getHeight();
        canvas.save();
        canvas.translate(width / 2, height / 2);
        Path path = new Path();
        path.moveTo(width / 4, 0.0f);
        float f = (-width) / 4;
        path.lineTo(f, (-height) / 4);
        path.lineTo(f, height / 4);
        path.close();
        canvas.drawPath(path, this.v);
        canvas.restore();
    }

    public void a(int i) {
        this.x = i;
        postInvalidate();
    }

    public int getColor() {
        return this.t;
    }

    public int getState() {
        return this.x;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i = this.x;
        if (i == 0) {
            b(canvas);
            return;
        }
        if (i == 1) {
            e(canvas);
            return;
        }
        if (i == 2) {
            f(canvas);
            return;
        }
        if (i == 3) {
            d(canvas);
        } else if (i == 4) {
            c(canvas);
        } else {
            if (i != 5) {
                return;
            }
            a(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int a2 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(getContext(), 12.0f);
        setMeasuredDimension(a2, a2);
    }

    public void setColor(int i) {
        Paint paint = this.v;
        if (paint != null) {
            paint.setColor(i);
            invalidate();
        }
    }

    private void a() {
        Paint paint = new Paint();
        this.v = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.v.setAntiAlias(true);
        float f = getResources().getDisplayMetrics().density * 1.0f;
        this.w = f;
        this.v.setStrokeWidth(f);
        this.v.setColor(this.t);
    }

    private void a(Canvas canvas) {
        this.v.setStyle(Paint.Style.STROKE);
        int width = getWidth();
        int height = getHeight();
        int i = height / 6;
        canvas.save();
        float f = width / 2;
        float f2 = height / 2;
        canvas.translate(f, f2);
        Path path = new Path();
        float f3 = (-height) / 2;
        path.moveTo(0.0f, f3);
        float f4 = i;
        path.lineTo(0.0f, (f2 - this.w) - f4);
        float f5 = (-width) / 2;
        path.rMoveTo(f5, f4);
        path.rLineTo(width, 0.0f);
        path.rMoveTo(f5, -i);
        float f6 = this.w;
        path.rLineTo(f - f6, f6 + f3);
        path.moveTo(0.0f, (f2 - this.w) - f4);
        float f7 = this.w;
        path.rLineTo(f5 + f7, f3 + f7);
        canvas.drawPath(path, this.v);
        canvas.restore();
    }

    public e(Context context, int i) {
        super(context);
        Color.parseColor("#5b6d8c");
        this.u = 0;
        this.x = 0;
        this.t = i;
        a();
    }

    public e(Context context, int i, int i2) {
        super(context);
        Color.parseColor("#5b6d8c");
        this.x = 0;
        this.t = i;
        this.u = i2;
        a();
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = Color.parseColor("#5b6d8c");
        this.u = 0;
        this.x = 0;
        a();
    }

    public e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = Color.parseColor("#5b6d8c");
        this.u = 0;
        this.x = 0;
        a();
    }
}
