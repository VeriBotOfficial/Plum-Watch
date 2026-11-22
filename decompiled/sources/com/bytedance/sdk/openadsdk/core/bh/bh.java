package com.bytedance.sdk.openadsdk.core.bh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* loaded from: classes14.dex */
public class bh extends FrameLayout {
    private boolean bh;
    private int fxn;
    private Drawable gff;
    private Drawable hm;
    private int kg;
    private Drawable rb;

    /* renamed from: sg, reason: collision with root package name */
    private ValueAnimator f9464sg;
    private boolean tw;

    public void setProgress(int i) {
        this.kg = i;
        Drawable drawable = this.gff;
        if (drawable != null) {
            drawable.setLevel((int) ((i * 10000.0f) / this.fxn));
        }
    }

    public void setMax(int i) {
        this.fxn = i;
    }

    public void setProgressDrawable(Drawable drawable) {
        this.hm = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.hm;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Drawable drawable3 = ((LayerDrawable) this.hm).getDrawable(i);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.gff = drawable3;
                }
            }
        }
        Drawable drawable4 = this.hm;
        if (drawable4 instanceof RotateDrawable) {
            this.gff = drawable4;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.rb = drawable;
        setProgressDrawable(drawable);
        if (this.bh && this.f9464sg == null) {
            fxn();
        }
    }

    public bh(Context context) {
        super(context);
        this.fxn = 100;
    }

    public bh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fxn = 100;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(jq.fxn(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.bh = true;
        if (this.rb != null) {
            fxn();
        }
    }

    private void fxn() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 10000);
        this.f9464sg = ofInt;
        ofInt.setDuration(2000L);
        this.f9464sg.setRepeatCount(-1);
        this.f9464sg.setInterpolator(new LinearInterpolator());
        this.f9464sg.setRepeatMode(1);
        this.f9464sg.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.bh.bh.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                bh.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.f9464sg.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.bh = false;
        ValueAnimator valueAnimator = this.f9464sg;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9464sg.removeAllUpdateListeners();
            this.f9464sg = null;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            if (this.tw) {
                this.tw = false;
                ValueAnimator valueAnimator = this.f9464sg;
                if (valueAnimator != null) {
                    valueAnimator.resume();
                    return;
                } else {
                    fxn();
                    return;
                }
            }
            return;
        }
        if (this.f9464sg == null || this.tw) {
            return;
        }
        this.tw = true;
        this.f9464sg.pause();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
