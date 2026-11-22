package com.bytedance.sdk.component.adexpress.bh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes13.dex */
public class ums extends FrameLayout {
    private AnimatorSet bh;
    private Context fxn;
    private ImageView gff;
    private ImageView hm;
    private AnimatorSet jq;
    private ImageView kg;
    private TextView rb;

    /* renamed from: sg, reason: collision with root package name */
    private AnimatorSet f9320sg;
    private AnimatorSet tw;

    public ums(Context context) {
        super(context);
        this.bh = new AnimatorSet();
        this.f9320sg = new AnimatorSet();
        this.tw = new AnimatorSet();
        this.jq = new AnimatorSet();
        this.fxn = context;
        gff();
    }

    private void gff() {
        ImageView imageView = new ImageView(this.fxn);
        this.hm = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.jz.hm(this.fxn, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 30.0f);
        addView(this.hm, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.fxn);
        this.gff = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.jz.hm(this.fxn, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 50.0f), (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 30.0f);
        addView(this.gff, layoutParams2);
        ImageView imageView3 = new ImageView(this.fxn);
        this.kg = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.jz.hm(this.fxn, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 80.0f), (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 30.0f);
        addView(this.kg, layoutParams3);
        TextView textView = new TextView(this.fxn);
        this.rb = textView;
        textView.setTextColor(-1);
        this.rb.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.rb, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.bh.ums.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ums.this.kg.getLayoutParams();
                layoutParams5.topMargin = (int) ((ums.this.gff.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.hm.sg.fxn(ums.this.getContext(), 7.0f));
                layoutParams5.leftMargin = (-ums.this.gff.getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(ums.this.fxn, 30.0f));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                ums.this.kg.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) ums.this.hm.getLayoutParams();
                layoutParams6.topMargin = (int) ((ums.this.gff.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.hm.sg.fxn(ums.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((ums.this.gff.getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(ums.this.fxn, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                ums.this.hm.setLayoutParams(layoutParams6);
            }
        });
    }

    private void hm() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.kg, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.gff, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.gff, "scaleY", 0.0f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.hm, "alpha", 0.0f, 1.0f);
        this.tw.setDuration(300L);
        this.tw.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.kg, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.hm.sg.fxn(getContext(), 90.0f));
        ofFloat5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(getContext(), 90.0f));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.bh.ums.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ums.this.hm.getLayoutParams();
                layoutParams.width = num.intValue();
                ums.this.hm.setLayoutParams(layoutParams);
            }
        });
        ofInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.gff, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.hm.sg.fxn(getContext(), 90.0f));
        ofFloat6.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.jq.setDuration(1500L);
        this.jq.playTogether(ofFloat5, ofInt, ofFloat6);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.kg, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.hm, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.gff, "alpha", 1.0f, 0.0f);
        this.f9320sg.setDuration(50L);
        this.f9320sg.playTogether(ofFloat7, ofFloat8, ofFloat9);
        this.bh.playSequentially(this.tw, this.jq, this.f9320sg);
    }

    public void fxn() {
        hm();
        this.bh.start();
        this.bh.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.bh.ums.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                ums.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.bh.ums.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ums.this.bh.start();
                    }
                }, 200L);
            }
        });
    }

    public void kg() {
        try {
            AnimatorSet animatorSet = this.bh;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.tw;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.jq;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.f9320sg;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    public void setGuideText(String str) {
        this.rb.setText(str);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
