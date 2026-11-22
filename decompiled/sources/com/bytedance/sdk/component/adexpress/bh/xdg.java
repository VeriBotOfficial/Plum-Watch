package com.bytedance.sdk.component.adexpress.bh;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes13.dex */
public class xdg extends FrameLayout {
    private TextView bh;
    private Context fxn;
    private jz gff;
    private AnimatorSet hm;
    private ImageView kg;
    private boolean rb;

    public xdg(Context context) {
        super(context);
        this.rb = true;
        this.fxn = context;
        this.hm = new AnimatorSet();
        gff();
        hm();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.bh.xdg.1
            @Override // java.lang.Runnable
            public void run() {
                int fxn = (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(xdg.this.fxn, 50.0f);
                int fxn2 = (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(xdg.this.fxn, 50.0f);
                if (xdg.this.gff.getMeasuredHeight() > 0) {
                    fxn = xdg.this.gff.getMeasuredHeight();
                }
                if (xdg.this.gff.getMeasuredWidth() > 0) {
                    fxn2 = xdg.this.gff.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xdg.this.kg.getLayoutParams();
                layoutParams.topMargin = ((int) ((fxn / 2.0f) - com.bytedance.sdk.component.adexpress.hm.sg.fxn(xdg.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(xdg.this.fxn, 40.0f));
                layoutParams.leftMargin = ((int) ((fxn2 / 2.0f) - com.bytedance.sdk.component.adexpress.hm.sg.fxn(xdg.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(xdg.this.fxn, 20.0f));
                layoutParams.bottomMargin = (int) (((-fxn) / 2.0f) + com.bytedance.sdk.component.adexpress.hm.sg.fxn(xdg.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-fxn2) / 2.0f) + com.bytedance.sdk.component.adexpress.hm.sg.fxn(xdg.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                xdg.this.kg.setLayoutParams(layoutParams);
            }
        });
    }

    private void gff() {
        this.gff = new jz(this.fxn);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 50.0f), (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 50.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 40.0f);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 20.0f);
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.gff, layoutParams);
        this.kg = new ImageView(this.fxn);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 78.0f), (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 78.0f));
        this.kg.setImageResource(com.bytedance.sdk.component.utils.jz.hm(this.fxn, "tt_splash_hand"));
        addView(this.kg, layoutParams2);
        TextView textView = new TextView(this.fxn);
        this.bh = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 10.0f);
        addView(this.bh, layoutParams3);
        this.bh.setVisibility(8);
    }

    private void hm() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.kg, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        ofFloat.setDuration(600L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.bh.xdg.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(xdg.this.kg, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.start();
                xdg.this.kg.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (xdg.this.rb) {
                    xdg.this.gff.fxn();
                }
                xdg.this.rb = !r2.rb;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.kg, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        ofFloat2.setDuration(600L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.hm.playTogether(ofFloat, ofFloat2);
    }

    public void setGuideText(String str) {
        this.bh.setVisibility(0);
        this.bh.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.bh.setTextColor(i);
    }

    public void fxn() {
        this.hm.start();
    }

    public void kg() {
        AnimatorSet animatorSet = this.hm;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        jz jzVar = this.gff;
        if (jzVar != null) {
            jzVar.kg();
        }
        ImageView imageView = this.kg;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }
}
