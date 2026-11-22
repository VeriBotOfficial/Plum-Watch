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

/* loaded from: classes13.dex */
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

    public jz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
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
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.hm = ofFloat;
        ofFloat.setDuration(200L);
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
        int min = ((int) Math.min(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f)) - 18;
        gff = min;
        ValueAnimator ofInt = ValueAnimator.ofInt(10, min);
        ofInt.setInterpolator(new PathInterpolator(0.0f, 0.2f, 0.3f, 1.0f));
        ofInt.setDuration(800L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.bh.jz.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                jz.this.kg = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                jz.this.invalidate();
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.bh.jz.2
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
        ofInt.start();
    }

    public void kg() {
        clearAnimation();
    }
}
