package com.bytedance.sdk.component.adexpress.bh;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes13.dex */
public class kg extends FrameLayout {
    private View bh;
    private AnimatorSet fxn;
    private boolean gff;
    private Context hie;
    private View hm;
    private int jq;
    private ObjectAnimator kg;
    private View rb;

    /* renamed from: sg, reason: collision with root package name */
    private ImageView f9315sg;
    private int tw;

    public kg(Context context, int i, int i2) {
        super(context);
        this.gff = false;
        this.fxn = new AnimatorSet();
        this.tw = i;
        this.jq = i2;
        this.hie = context;
        gff();
        hm();
    }

    private void gff() {
        View view = new View(this.hie);
        this.hm = view;
        view.setBackground(fxn("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (this.tw * 0.45d), (int) (this.jq * 0.45d));
        layoutParams.gravity = 17;
        this.hm.setLayoutParams(layoutParams);
        addView(this.hm);
        View view2 = new View(this.hie);
        this.rb = view2;
        view2.setBackground(fxn("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (this.tw * 0.25d), (int) (this.jq * 0.25d));
        layoutParams2.gravity = 17;
        this.rb.setLayoutParams(layoutParams2);
        addView(this.rb);
        View view3 = new View(this.hie);
        this.bh = view3;
        view3.setBackground(fxn("#807BBEFF", "#FF7BBEFF"));
        int i = this.tw;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (i * 0.25d), (int) (i * 0.25d));
        layoutParams3.gravity = 17;
        this.bh.setLayoutParams(layoutParams3);
        addView(this.bh);
        ImageView imageView = new ImageView(this.hie);
        this.f9315sg = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.jz.hm(getContext(), "tt_blue_hand"));
        this.f9315sg.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (this.tw * 0.62d), (int) (this.jq * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.f9315sg.setLayoutParams(layoutParams4);
        addView(this.f9315sg);
    }

    private void hm() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.hm, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.hm, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.rb, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.rb, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.bh, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.bh, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f9315sg, "rotation", 0.0f, -20.0f, 0.0f);
        this.kg = ofFloat7;
        ofFloat7.setDuration(1000L);
        this.fxn.setDuration(1500L);
        this.fxn.setInterpolator(new AccelerateDecelerateInterpolator());
        this.fxn.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5).with(ofFloat6);
        this.fxn.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.bh.kg.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (kg.this.gff) {
                    return;
                }
                kg.this.kg.start();
                kg.this.fxn.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                kg.this.gff = true;
            }
        });
    }

    private GradientDrawable fxn(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void fxn() {
        this.gff = false;
        ObjectAnimator objectAnimator = this.kg;
        if (objectAnimator == null || this.fxn == null) {
            return;
        }
        objectAnimator.start();
        this.fxn.start();
    }

    public void kg() {
        this.gff = true;
        ObjectAnimator objectAnimator = this.kg;
        if (objectAnimator == null || this.fxn == null) {
            return;
        }
        objectAnimator.cancel();
        this.fxn.cancel();
    }
}
