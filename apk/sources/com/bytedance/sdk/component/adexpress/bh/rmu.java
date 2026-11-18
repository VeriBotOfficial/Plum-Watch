package com.bytedance.sdk.component.adexpress.bh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
public class rmu extends View {
    private int bh;
    private Context fxn;
    private RectF gff;
    private float hm;
    private Paint kg;
    private ValueAnimator rb;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private boolean f9318sg;

    public rmu(Context context) {
        super(context);
        this.bh = 1500;
        this.fxn = context;
        Paint paint = new Paint();
        this.kg = paint;
        paint.setAntiAlias(true);
        this.kg.setStyle(Paint.Style.STROKE);
        this.kg.setStrokeWidth(10.0f);
        this.kg.setColor(Color.parseColor("#80FFFFFF"));
        this.gff = new RectF();
    }

    public void fxn() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.rb = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.bh);
        this.rb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.bh.rmu.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                rmu.this.hm = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rmu.this.requestLayout();
            }
        });
        this.rb.start();
    }

    public void kg() {
        ValueAnimator valueAnimator = this.rb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void gff() {
        this.f9318sg = true;
        invalidate();
    }

    public void setDuration(int r1) {
        this.bh = r1;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9318sg) {
            return;
        }
        canvas.drawArc(this.gff, 270.0f, this.hm, false, this.kg);
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        this.gff.set(5.0f, 5.0f, r1 - 5, r2 - 5);
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        int size = View.MeasureSpec.getSize(r2);
        int size2 = View.MeasureSpec.getSize(r3);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }
}
