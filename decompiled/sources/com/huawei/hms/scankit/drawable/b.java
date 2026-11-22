package com.huawei.hms.scankit.drawable;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.animation.Interpolator;

/* compiled from: ScanDrawable.java */
/* loaded from: classes14.dex */
class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ScanDrawable f10535a;

    b(ScanDrawable scanDrawable) {
        this.f10535a = scanDrawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2;
        Rect rect;
        Rect rect2;
        Interpolator interpolator;
        Interpolator interpolator2;
        Interpolator interpolator3;
        valueAnimator2 = this.f10535a.f;
        float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
        ScanDrawable scanDrawable = this.f10535a;
        rect = scanDrawable.o;
        int i = rect.top;
        rect2 = this.f10535a.o;
        float height = rect2.height();
        interpolator = ScanDrawable.b;
        scanDrawable.u = i + ((int) (height * interpolator.getInterpolation(floatValue)));
        if (floatValue < 0.389f) {
            ScanDrawable scanDrawable2 = this.f10535a;
            interpolator3 = ScanDrawable.c;
            scanDrawable2.t = interpolator3.getInterpolation(floatValue / 0.389f);
        } else {
            ScanDrawable scanDrawable3 = this.f10535a;
            interpolator2 = ScanDrawable.d;
            scanDrawable3.t = 1.0f - interpolator2.getInterpolation((floatValue - 0.389f) / 0.611f);
        }
        this.f10535a.invalidateSelf();
    }
}
