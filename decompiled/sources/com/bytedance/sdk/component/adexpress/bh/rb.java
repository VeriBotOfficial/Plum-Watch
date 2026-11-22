package com.bytedance.sdk.component.adexpress.bh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes13.dex */
public class rb extends FrameLayout {
    private ImageView fxn;
    private AnimatorSet kg;

    public rb(Context context) {
        super(context);
        gff();
        hm();
    }

    private void gff() {
        ImageView imageView = new ImageView(getContext());
        this.fxn = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.jz.hm(getContext(), "tt_white_hand"));
        int fxn = (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(fxn, fxn);
        layoutParams.gravity = 17;
        addView(this.fxn, layoutParams);
    }

    private void hm() {
        this.kg = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.fxn, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        ofFloat.setDuration(2000L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.fxn, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        ofFloat2.setDuration(2000L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.kg.playTogether(ofFloat, ofFloat2);
    }

    public void fxn() {
        AnimatorSet animatorSet = this.kg;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public void kg() {
        AnimatorSet animatorSet = this.kg;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
