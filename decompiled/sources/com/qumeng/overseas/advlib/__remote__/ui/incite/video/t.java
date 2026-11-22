package com.qumeng.overseas.advlib.__remote__.ui.incite.video;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.OvershootInterpolator;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.overrideview.FlashImageView;

/* loaded from: classes17.dex */
public class t extends Animation {
    private static boolean d = false;

    /* renamed from: a, reason: collision with root package name */
    private int f13214a;
    private int b;
    private Camera c = new Camera();

    class a implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InciteVideoDesConfig f13215a;
        final /* synthetic */ ImageView b;

        a(InciteVideoDesConfig inciteVideoDesConfig, ImageView imageView) {
            this.f13215a = inciteVideoDesConfig;
            this.b = imageView;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (this.f13215a != null) {
                com.qumeng.overseas.advlib.__remote__.framework.imageloader.l.c().url(this.f13215a.getCountdown_icon_gray_url()).isReport(false).into(this.b);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f13216a;
        final /* synthetic */ t b;

        b(ImageView imageView, t tVar) {
            this.f13216a = imageView;
            this.b = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13216a.startAnimation(this.b);
        }
    }

    class c implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InciteVideoDesConfig f13217a;
        final /* synthetic */ ImageView b;

        c(InciteVideoDesConfig inciteVideoDesConfig, ImageView imageView) {
            this.f13217a = inciteVideoDesConfig;
            this.b = imageView;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            ViewParent parent = this.b.getParent();
            if (parent instanceof FlashImageView) {
                ((FlashImageView) parent).startAnimation();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (this.f13217a != null) {
                com.qumeng.overseas.advlib.__remote__.framework.imageloader.l.c().url(this.f13217a.getCountdown_icon_light_url()).isReport(false).into(this.b);
            }
        }
    }

    private t() {
        setRepeatCount(0);
        setDuration(1000L);
        setFillAfter(true);
        setStartOffset(10L);
    }

    public static void a(ImageView imageView, InciteVideoDesConfig inciteVideoDesConfig) {
        if (inciteVideoDesConfig == null || !d) {
            return;
        }
        d = false;
        com.qumeng.overseas.advlib.__remote__.framework.imageloader.l.c().url(inciteVideoDesConfig.getCountdown_icon_gray_url()).isReport(false).into(imageView);
        t tVar = new t();
        tVar.setAnimationListener(new c(inciteVideoDesConfig, imageView));
        imageView.startAnimation(tVar);
    }

    public static void b(ImageView imageView, InciteVideoDesConfig inciteVideoDesConfig) {
        if (inciteVideoDesConfig == null || d) {
            return;
        }
        d = true;
        com.qumeng.overseas.advlib.__remote__.framework.imageloader.l.c().url(inciteVideoDesConfig.getCountdown_icon_light_url()).isReport(false).into(imageView);
        t tVar = new t();
        tVar.setAnimationListener(new a(inciteVideoDesConfig, imageView));
        imageView.postDelayed(new b(imageView, tVar), 500L);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f, Transformation transformation) {
        Matrix matrix = transformation.getMatrix();
        this.c.save();
        this.c.setLocation(0.0f, 0.0f, 180.0f);
        this.c.rotateY(f * 180.0f);
        this.c.getMatrix(matrix);
        matrix.preTranslate(-this.f13214a, -this.b);
        matrix.postTranslate(this.f13214a, this.b);
        this.c.restore();
    }

    @Override // android.view.animation.Animation
    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        int i5 = i / 2;
        this.f13214a = i5;
        this.b = i5;
        setInterpolator(new OvershootInterpolator());
    }
}
