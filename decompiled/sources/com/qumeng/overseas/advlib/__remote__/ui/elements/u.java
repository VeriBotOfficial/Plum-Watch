package com.qumeng.overseas.advlib.__remote__.ui.elements;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes17.dex */
public class u extends View {
    private static final String C = "RectangleWithArcView";
    public static int D = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(25.0f);
    private static final int E = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(15.0f);
    float[] A;
    private ValueAnimator B;
    private Paint t;
    private Path u;
    private Paint v;
    private int w;
    private int x;
    private int y;
    int[] z;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            u.this.w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            u.this.postInvalidate();
        }
    }

    public u(Context context) {
        super(context);
        this.z = new int[]{Color.parseColor("#82000000"), Color.parseColor("#12000000")};
        this.A = new float[]{0.0f, 1.0f};
        a();
    }

    public void b() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, E);
        this.B = ofInt;
        ofInt.addUpdateListener(new a());
        this.B.setRepeatCount(-1);
        this.B.setRepeatMode(2);
        this.B.setDuration(800L).start();
    }

    public void c() {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B.removeAllUpdateListeners();
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        com.qumeng.overseas.advlib.__remote__.utils.n.c(C, "开启划一划动画", new Object[0]);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
        com.qumeng.overseas.advlib.__remote__.utils.n.c(C, "移除划一划动画", new Object[0]);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = D + this.w;
        int i2 = E;
        canvas.drawRect(0.0f, i + i2, this.x, this.y, this.t);
        this.u.reset();
        this.u.moveTo(0.0f, D + this.w + i2);
        Path path = this.u;
        int i3 = this.x;
        int i4 = D;
        path.quadTo(i3 / 2, -i4, i3, i4 + this.w + i2);
        canvas.drawPath(this.u, this.t);
        canvas.drawPath(this.u, this.v);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.x = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.y = size;
        setMeasuredDimension(this.x, size);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.t.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.y, this.z, this.A, Shader.TileMode.CLAMP));
    }

    private void a() {
        Paint paint = new Paint();
        this.t = paint;
        paint.setAntiAlias(true);
        this.t.setStyle(Paint.Style.FILL);
        this.u = new Path();
        Paint paint2 = new Paint();
        this.v = paint2;
        paint2.setStrokeWidth(com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(1.0f));
        this.v.setAntiAlias(true);
        this.v.setStyle(Paint.Style.STROKE);
        this.v.setColor(-1);
    }

    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z = new int[]{Color.parseColor("#82000000"), Color.parseColor("#12000000")};
        this.A = new float[]{0.0f, 1.0f};
        a();
    }

    public u(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.z = new int[]{Color.parseColor("#82000000"), Color.parseColor("#12000000")};
        this.A = new float[]{0.0f, 1.0f};
        a();
    }
}
