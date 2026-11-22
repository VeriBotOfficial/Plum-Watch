package com.huawei.hms.scankit.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ScanDrawable.java */
/* loaded from: classes14.dex */
class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ScanDrawable f10536a;

    c(ScanDrawable scanDrawable) {
        this.f10536a = scanDrawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        boolean z;
        super.onAnimationRepeat(animator);
        ScanDrawable scanDrawable = this.f10536a;
        z = scanDrawable.s;
        scanDrawable.s = !z;
    }
}
