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
public class zu extends FrameLayout {
    private TextView bh;
    private Context fxn;
    private hm gff;
    private AnimatorSet hm;
    private ImageView kg;
    private boolean rb;

    public zu(Context context) {
        super(context);
        this.rb = true;
        this.fxn = context;
        this.hm = new AnimatorSet();
        gff();
        hm();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.bh.zu.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zu.this.kg.getLayoutParams();
                layoutParams.topMargin = ((int) ((zu.this.gff.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.hm.sg.fxn(zu.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(zu.this.fxn, 20.0f));
                layoutParams.leftMargin = ((int) ((zu.this.gff.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.hm.sg.fxn(zu.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(zu.this.fxn, 20.0f));
                layoutParams.bottomMargin = (int) (((-zu.this.gff.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.hm.sg.fxn(zu.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-zu.this.gff.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.hm.sg.fxn(zu.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                zu.this.kg.setLayoutParams(layoutParams);
            }
        });
    }

    private void gff() {
        this.gff = new hm(this.fxn);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 80.0f), (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 20.0f);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 20.0f);
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.gff, layoutParams);
        this.gff.fxn();
        this.kg = new ImageView(this.fxn);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 80.0f), (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 80.0f));
        this.kg.setImageResource(com.bytedance.sdk.component.utils.jz.hm(this.fxn, "tt_splash_hand"));
        addView(this.kg, layoutParams2);
        TextView textView = new TextView(this.fxn);
        this.bh = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 10.0f);
        addView(this.bh, layoutParams3);
    }

    private void hm() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.kg, "scaleX", 1.0f, 0.8f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.bh.zu.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zu.this.kg, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.start();
                zu.this.kg.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (zu.this.rb) {
                    zu.this.gff.fxn();
                    zu.this.gff.setAlpha(1.0f);
                } else {
                    zu.this.gff.kg();
                    zu.this.gff.setAlpha(0.0f);
                }
                zu.this.rb = !r2.rb;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.kg, "scaleY", 1.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.hm.playTogether(ofFloat, ofFloat2);
    }

    public void setGuideText(String str) {
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
        hm hmVar = this.gff;
        if (hmVar != null) {
            hmVar.kg();
        }
    }
}
