package com.bytedance.sdk.component.adexpress.bh;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes13.dex */
public class ckl extends FrameLayout {
    private Context fxn;
    private jz gff;
    private AnimatorSet hm;
    private ImageView kg;
    private boolean rb;

    public ckl(Context context) {
        super(context);
        this.rb = true;
        this.fxn = context;
        this.hm = new AnimatorSet();
        gff();
        hm();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.bh.ckl.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ckl.this.kg.getLayoutParams();
                layoutParams.topMargin = (int) ((ckl.this.gff.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.hm.sg.fxn(ckl.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((ckl.this.gff.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.hm.sg.fxn(ckl.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (((-ckl.this.gff.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.hm.sg.fxn(ckl.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-ckl.this.gff.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.hm.sg.fxn(ckl.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                ckl.this.kg.setLayoutParams(layoutParams);
            }
        });
    }

    private void gff() {
        this.gff = new jz(this.fxn);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 40.0f), (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.gff, layoutParams);
        this.kg = new ImageView(this.fxn);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 62.0f), (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 62.0f));
        layoutParams2.gravity = 16;
        this.kg.setImageResource(com.bytedance.sdk.component.utils.jz.hm(this.fxn, "tt_splash_hand"));
        addView(this.kg, layoutParams2);
    }

    private void hm() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.kg, "scaleX", 1.0f, 0.9f);
        ofFloat.setDuration(800L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.bh.ckl.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ckl.this.kg, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat2.start();
                ckl.this.kg.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (ckl.this.rb) {
                    ckl.this.gff.fxn();
                }
                ckl.this.rb = !r2.rb;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.kg, "scaleY", 1.0f, 0.9f);
        ofFloat2.setDuration(800L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.hm.playTogether(ofFloat, ofFloat2);
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
