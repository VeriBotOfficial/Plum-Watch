package com.bytedance.sdk.component.adexpress.bh;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class ud extends LinearLayout {
    private TextView bh;
    private int dgx;
    private TextView fxn;
    private ImageView gff;
    private int hie;
    private com.bytedance.sdk.component.utils.bx hm;
    private int jq;
    private TextView kg;
    private JSONObject mvp;
    private TextView rb;

    /* renamed from: sg, reason: collision with root package name */
    private fxn f9319sg;
    private LinearLayout tw;

    public interface fxn {
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public ud(Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        this.jq = i;
        this.hie = i2;
        this.dgx = i3;
        this.mvp = jSONObject;
        fxn(context, view);
    }

    protected void fxn(Context context, View view) {
        addView(view);
        this.tw = (LinearLayout) findViewById(2097610727);
        this.gff = (ImageView) findViewById(2097610725);
        this.fxn = (TextView) findViewById(2097610724);
        this.kg = (TextView) findViewById(2097610726);
        this.rb = (TextView) findViewById(2097610723);
        this.bh = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.tw.setBackground(gradientDrawable);
    }

    public void setShakeText(String str) {
        if (TextUtils.isEmpty(str)) {
            this.rb.setVisibility(8);
            this.bh.setVisibility(8);
        } else {
            this.rb.setText(str);
        }
    }

    public LinearLayout getShakeLayout() {
        return this.tw;
    }

    public void setOnShakeViewListener(fxn fxnVar) {
        this.f9319sg = fxnVar;
    }

    public void fxn() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.bh.ud$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ud.this.gff != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new kg(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.bh.ud.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        ud.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.bh.ud.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ud.this.gff.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }
                });
                ud.this.gff.startAnimation(rotateAnimation);
            }
        }
    }

    private static class kg implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return f <= 0.25f ? (f * (-2.0f)) + 0.5f : f <= 0.5f ? (f * 4.0f) - 1.0f : f <= 0.75f ? (f * (-4.0f)) + 3.0f : (f * 2.0f) - 1.5f;
        }

        private kg() {
        }

        /* synthetic */ kg(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.hm == null) {
                this.hm = new com.bytedance.sdk.component.utils.bx(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.bh.ud.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
