package com.bytedance.sdk.component.adexpress.bh;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes15.dex */
public class jz extends View {
    private static int gff = 50;
    private Paint fxn;
    private ObjectAnimator hm;
    private int kg;

    public jz(Context context) {
        this(context, null);
    }

    public jz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public jz(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.kg = 10;
        gff();
    }

    private void gff() {
        Paint paint = new Paint();
        this.fxn = paint;
        paint.setAntiAlias(true);
        this.fxn.setColor(Color.parseColor("#FFFFFFFF"));
        this.fxn.setStyle(Paint.Style.STROKE);
        this.fxn.setStrokeWidth(18.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.hm = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.fxn.setShader(new LinearGradient(getMeasuredWidth() / 2, 0.0f, getMeasuredWidth() / 2, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.kg, this.fxn);
    }

    public void fxn() {
        int r0 = ((int) Math.min(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f)) - 18;
        gff = r0;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(10, r0);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.0f, 0.2f, 0.3f, 1.0f));
        valueAnimatorOfInt.setDuration(800L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.bh.jz.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                jz.this.kg = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                jz.this.invalidate();
            }
        });
        valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.bh.jz.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                jz.this.setVisibility(0);
                jz.this.setAlpha(1.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                jz.this.hm.start();
            }
        });
        valueAnimatorOfInt.start();
    }

    public void kg() {
        clearAnimation();
    }
}
