package com.anythink.expressad.splash.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;

/* loaded from: classes12.dex */
public class MBSplashClickView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5158a = "MBSplashClickView";
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;
    private String b;
    private String c;
    private String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private String j;
    private int k;
    private ImageView l;
    private ImageView m;
    private final RectF n;
    private final Paint o;
    private final Paint p;

    public MBSplashClickView(Context context) {
        super(context);
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "anythink_splash_btn_arrow_right";
        this.f = "anythink_splash_btn_circle";
        this.g = "anythink_splash_btn_finger";
        this.h = "anythink_splash_btn_go";
        this.i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.n = new RectF();
        this.o = new Paint();
        this.p = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "anythink_splash_btn_arrow_right";
        this.f = "anythink_splash_btn_circle";
        this.g = "anythink_splash_btn_finger";
        this.h = "anythink_splash_btn_go";
        this.i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.n = new RectF();
        this.o = new Paint();
        this.p = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "anythink_splash_btn_arrow_right";
        this.f = "anythink_splash_btn_circle";
        this.g = "anythink_splash_btn_finger";
        this.h = "anythink_splash_btn_go";
        this.i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.n = new RectF();
        this.o = new Paint();
        this.p = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "anythink_splash_btn_arrow_right";
        this.f = "anythink_splash_btn_circle";
        this.g = "anythink_splash_btn_finger";
        this.h = "anythink_splash_btn_go";
        this.i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.n = new RectF();
        this.o = new Paint();
        this.p = new Paint();
    }

    private void a() {
        this.o.setAntiAlias(true);
        this.o.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.p.setAntiAlias(true);
        this.p.setColor(-1);
        this.b = getContext().getString(k.a(getContext(), "anythink_cm_shake_view_click_default_view", "string"));
        this.c = getContext().getString(k.a(getContext(), "anythink_cm_shake_view_click_default_open", "string"));
        this.d = getContext().getString(k.a(getContext(), "anythink_cm_shake_view_click_default_inst", "string"));
    }

    public void initView(String str) {
        RelativeLayout.LayoutParams layoutParams;
        int i;
        this.j = str;
        if (TextUtils.equals(str, this.b)) {
            this.k = 2;
        } else if (TextUtils.equals(str, this.d)) {
            this.k = 3;
        } else if (!TextUtils.equals(str, this.c)) {
            if (TextUtils.isEmpty(this.j)) {
                this.j = this.b;
            }
            this.k = 2;
        } else {
            this.k = 1;
        }
        int i2 = this.k;
        int parseColor = Color.parseColor("#666666");
        int parseColor2 = Color.parseColor("#8FC31F");
        int parseColor3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i2 == 2) {
            gradientDrawable.setColor(parseColor2);
        } else {
            gradientDrawable.setColor(parseColor3);
            gradientDrawable.setStroke(2, parseColor);
        }
        gradientDrawable.setCornerRadius(200.0f);
        setBackgroundDrawable(gradientDrawable);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.j);
        this.l = new ImageView(getContext());
        int i3 = this.k;
        if (i3 == 2) {
            i = k.a(getContext(), "anythink_splash_btn_go", k.c);
            layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 35.0f), v.b(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = v.b(getContext(), 10.0f);
        } else if (i3 == 1) {
            i = k.a(getContext(), "anythink_splash_btn_light", k.c);
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = v.b(getContext(), 50.0f);
            imageView.setImageResource(k.a(getContext(), "anythink_splash_btn_arrow_right", k.c));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i3 == 3) {
            i = k.a(getContext(), "anythink_splash_btn_finger", k.c);
            layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 25.0f), v.b(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = v.b(getContext(), 50.0f);
            layoutParams.topMargin = v.b(getContext(), 18.0f);
            this.m = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v.b(getContext(), 30.0f), v.b(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v.b(getContext(), 50.0f);
            layoutParams4.topMargin = v.b(getContext(), 5.0f);
            this.m.setLayoutParams(layoutParams4);
            this.m.setImageResource(k.a(getContext(), "anythink_splash_btn_circle", k.c));
            addView(this.m);
        } else {
            layoutParams = null;
            i = 0;
        }
        this.l.setLayoutParams(layoutParams);
        this.l.setImageResource(i);
        addView(textView);
        addView(this.l);
        invalidate();
    }

    private void b() {
        RelativeLayout.LayoutParams layoutParams;
        int i;
        String str = this.j;
        if (TextUtils.equals(str, this.b)) {
            this.k = 2;
        } else if (TextUtils.equals(str, this.d)) {
            this.k = 3;
        } else if (!TextUtils.equals(str, this.c)) {
            if (TextUtils.isEmpty(this.j)) {
                this.j = this.b;
            }
            this.k = 2;
        } else {
            this.k = 1;
        }
        int i2 = this.k;
        int parseColor = Color.parseColor("#666666");
        int parseColor2 = Color.parseColor("#8FC31F");
        int parseColor3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i2 == 2) {
            gradientDrawable.setColor(parseColor2);
        } else {
            gradientDrawable.setColor(parseColor3);
            gradientDrawable.setStroke(2, parseColor);
        }
        gradientDrawable.setCornerRadius(200.0f);
        setBackgroundDrawable(gradientDrawable);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.j);
        this.l = new ImageView(getContext());
        int i3 = this.k;
        if (i3 == 2) {
            i = k.a(getContext(), "anythink_splash_btn_go", k.c);
            layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 35.0f), v.b(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = v.b(getContext(), 10.0f);
        } else if (i3 == 1) {
            i = k.a(getContext(), "anythink_splash_btn_light", k.c);
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = v.b(getContext(), 50.0f);
            imageView.setImageResource(k.a(getContext(), "anythink_splash_btn_arrow_right", k.c));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i3 == 3) {
            i = k.a(getContext(), "anythink_splash_btn_finger", k.c);
            layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 25.0f), v.b(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = v.b(getContext(), 50.0f);
            layoutParams.topMargin = v.b(getContext(), 18.0f);
            this.m = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v.b(getContext(), 30.0f), v.b(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v.b(getContext(), 50.0f);
            layoutParams4.topMargin = v.b(getContext(), 5.0f);
            this.m.setLayoutParams(layoutParams4);
            this.m.setImageResource(k.a(getContext(), "anythink_splash_btn_circle", k.c));
            addView(this.m);
        } else {
            layoutParams = null;
            i = 0;
        }
        this.l.setLayoutParams(layoutParams);
        this.l.setImageResource(i);
        addView(textView);
        addView(this.l);
        invalidate();
    }

    private void a(int i) {
        int parseColor = Color.parseColor("#666666");
        int parseColor2 = Color.parseColor("#8FC31F");
        int parseColor3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i == 2) {
            gradientDrawable.setColor(parseColor2);
        } else {
            gradientDrawable.setColor(parseColor3);
            gradientDrawable.setStroke(2, parseColor);
        }
        gradientDrawable.setCornerRadius(200.0f);
        setBackgroundDrawable(gradientDrawable);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.n.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.n, this.p, 31);
        canvas.drawRoundRect(this.n, 200.0f, 200.0f, this.p);
        canvas.saveLayer(this.n, this.o, 31);
        super.draw(canvas);
        canvas.restore();
    }

    private boolean a(String str) {
        if (TextUtils.equals(str, this.b)) {
            this.k = 2;
            return true;
        }
        if (TextUtils.equals(str, this.d)) {
            this.k = 3;
            return true;
        }
        if (!TextUtils.equals(str, this.c)) {
            return false;
        }
        this.k = 1;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.k;
        if (i == 2) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setRepeatCount(-1);
            scaleAnimation.setRepeatMode(2);
            this.l.startAnimation(scaleAnimation);
            return;
        }
        if (i == 1) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
            translateAnimation.setDuration(1000L);
            translateAnimation.setAnimationListener(new AnonymousClass3());
            this.l.startAnimation(translateAnimation);
            return;
        }
        if (i == 3) {
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            scaleAnimation2.setDuration(400L);
            scaleAnimation2.setRepeatCount(-1);
            scaleAnimation2.setRepeatMode(2);
            ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
            scaleAnimation3.setDuration(200L);
            scaleAnimation3.setAnimationListener(new AnonymousClass1(scaleAnimation3));
            this.m.setVisibility(4);
            this.l.startAnimation(scaleAnimation2);
            this.m.postDelayed(new AnonymousClass2(scaleAnimation3), 500L);
        }
    }

    private void c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200L);
        scaleAnimation2.setAnimationListener(new AnonymousClass1(scaleAnimation2));
        this.m.setVisibility(4);
        this.l.startAnimation(scaleAnimation);
        this.m.postDelayed(new AnonymousClass2(scaleAnimation2), 500L);
    }

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$1, reason: invalid class name */
    final class AnonymousClass1 implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f5159a;

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        AnonymousClass1(ScaleAnimation scaleAnimation) {
            this.f5159a = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            MBSplashClickView.this.m.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.m.setVisibility(4);
            MBSplashClickView.this.m.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.view.MBSplashClickView.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBSplashClickView.this.m.startAnimation(AnonymousClass1.this.f5159a);
                }
            }, 700L);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$2, reason: invalid class name */
    final class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f5161a;

        AnonymousClass2(ScaleAnimation scaleAnimation) {
            this.f5161a = scaleAnimation;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBSplashClickView.this.m.startAnimation(this.f5161a);
        }
    }

    private void d() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new AnonymousClass3());
        this.l.startAnimation(translateAnimation);
    }

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$3, reason: invalid class name */
    final class AnonymousClass3 implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        AnonymousClass3() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            MBSplashClickView.this.l.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(final Animation animation) {
            MBSplashClickView.this.l.setVisibility(4);
            MBSplashClickView.this.l.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.view.MBSplashClickView.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBSplashClickView.this.l.startAnimation(animation);
                }
            }, 2000L);
        }
    }

    private void e() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.l.startAnimation(scaleAnimation);
    }
}
