package com.bytedance.sdk.component.adexpress.bh;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* loaded from: classes13.dex */
public class je extends View {
    private long bh;
    private float fxn;
    private ValueAnimator gff;
    private int hie;
    private ValueAnimator hm;
    private Animator.AnimatorListener jq;
    private float kg;
    private Paint rb;

    /* renamed from: sg, reason: collision with root package name */
    private float f9312sg;
    private float tw;

    public je(Context context, int i) {
        super(context);
        this.bh = 300L;
        this.f9312sg = 0.0f;
        this.hie = i;
        fxn();
    }

    public void fxn() {
        Paint paint = new Paint(1);
        this.rb = paint;
        paint.setStyle(Paint.Style.FILL);
        this.rb.setColor(this.hie);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.fxn = i / 2.0f;
        this.kg = i2 / 2.0f;
        this.tw = (float) (Math.hypot(i, i2) / 2.0d);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.fxn, this.kg, this.f9312sg, this.rb);
    }

    public void kg() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.tw);
        this.gff = ofFloat;
        ofFloat.setDuration(this.bh);
        this.gff.setInterpolator(new LinearInterpolator());
        this.gff.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.bh.je.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                je.this.f9312sg = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                je.this.invalidate();
            }
        });
        this.gff.start();
    }

    public void gff() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.tw, 0.0f);
        this.hm = ofFloat;
        ofFloat.setDuration(this.bh);
        this.hm.setInterpolator(new LinearInterpolator());
        this.hm.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.bh.je.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                je.this.f9312sg = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                je.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.jq;
        if (animatorListener != null) {
            this.hm.addListener(animatorListener);
        }
        this.hm.start();
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.jq = animatorListener;
    }
}
