package com.bytedance.sdk.component.adexpress.bh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: classes13.dex */
public class iwp extends RelativeLayout {
    private AnimatorSet bh;
    private int dgx;
    private ImageView fxn;
    private ImageView gff;
    private String hie;
    private TextView hm;
    private AnimatorSet jq;
    private ImageView kg;
    private TextView rb;

    /* renamed from: sg, reason: collision with root package name */
    private AnimatorSet f9311sg;
    private AnimatorSet tw;

    public iwp(Context context) {
        super(context);
        this.bh = new AnimatorSet();
        this.f9311sg = new AnimatorSet();
        this.tw = new AnimatorSet();
        this.jq = new AnimatorSet();
        this.dgx = 100;
        fxn(context);
    }

    public iwp(Context context, String str) {
        super(context);
        this.bh = new AnimatorSet();
        this.f9311sg = new AnimatorSet();
        this.tw = new AnimatorSet();
        this.jq = new AnimatorSet();
        this.dgx = 100;
        setClipChildren(false);
        this.hie = str;
        fxn(context);
    }

    protected void fxn(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.hm.fxn();
        }
        if ("5".equals(this.hie)) {
            addView(com.bytedance.sdk.component.adexpress.gff.fxn.bh(context));
            this.dgx = (int) (this.dgx * 1.25d);
        } else {
            addView(com.bytedance.sdk.component.adexpress.gff.fxn.rb(context));
        }
        this.fxn = (ImageView) findViewById(2097610734);
        this.kg = (ImageView) findViewById(2097610735);
        this.hm = (TextView) findViewById(2097610730);
        this.gff = (ImageView) findViewById(2097610733);
        this.rb = (TextView) findViewById(2097610731);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.bh;
    }

    public void fxn() {
        gff();
        this.bh.start();
        this.bh.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.bh.iwp.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                iwp.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.bh.iwp.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        iwp.this.bh.start();
                    }
                }, 200L);
            }
        });
    }

    public void gff() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.fxn, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.fxn, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.fxn, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.hm.sg.fxn(getContext(), -this.dgx));
        ofFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(getContext(), this.dgx));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.bh.iwp.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (iwp.this.gff != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) iwp.this.gff.getLayoutParams();
                    layoutParams.height = num.intValue();
                    iwp.this.gff.setLayoutParams(layoutParams);
                }
            }
        });
        ofInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.gff, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.gff, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.kg, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.kg, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.kg, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.kg, "scaleY", 0.0f, 1.0f);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.kg, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.hm.sg.fxn(getContext(), -this.dgx));
        ofFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.f9311sg.setDuration(50L);
        this.jq.setDuration(1500L);
        this.tw.setDuration(50L);
        this.f9311sg.playTogether(ofFloat2, ofFloat7, ofFloat5);
        this.tw.playTogether(ofFloat, ofFloat6, ofFloat8, ofFloat9, ofFloat4);
        this.jq.playTogether(ofFloat3, ofInt, ofFloat10);
        this.bh.playSequentially(this.tw, this.jq, this.f9311sg);
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
            AnimatorSet animatorSet3 = this.f9311sg;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.jq;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void setGuideText(String str) {
        TextView textView = this.hm;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.rb != null) {
            if (TextUtils.isEmpty(str)) {
                this.rb.setText("");
            } else {
                this.rb.setText(str);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kg();
    }
}
