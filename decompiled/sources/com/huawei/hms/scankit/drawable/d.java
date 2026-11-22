package com.huawei.hms.scankit.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.huawei.hms.scankit.p.Yc;

/* compiled from: ScanDrawable.java */
/* loaded from: classes14.dex */
class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ScanDrawable f10537a;

    d(ScanDrawable scanDrawable) {
        this.f10537a = scanDrawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        ValueAnimator valueAnimator;
        boolean z;
        boolean z2;
        super.onAnimationRepeat(animator);
        valueAnimator = this.f10537a.f;
        float abs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue() - 0.5f);
        ScanDrawable scanDrawable = this.f10537a;
        z = scanDrawable.x;
        scanDrawable.x = !z;
        z2 = this.f10537a.x;
        if (z2) {
            if (abs > 0.35f) {
                this.f10537a.r = 0.0f;
            } else {
                this.f10537a.r = Yc.a(0.5f);
            }
        }
    }
}
