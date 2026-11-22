package com.huawei.hms.scankit;

import android.animation.ValueAnimator;

/* compiled from: ViewfinderView.java */
/* loaded from: classes14.dex */
class F implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewfinderView f10499a;

    F(ViewfinderView viewfinderView) {
        this.f10499a = viewfinderView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f10499a.m = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f10499a.invalidate();
    }
}
