package com.amap.api.maps;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: SwipeDismissTouchListener.java */
/* loaded from: classes11.dex */
class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewGroup.LayoutParams f2038a;
    final /* synthetic */ int b;
    final /* synthetic */ SwipeDismissTouchListener c;

    e(SwipeDismissTouchListener swipeDismissTouchListener, ViewGroup.LayoutParams layoutParams, int i) {
        this.c = swipeDismissTouchListener;
        this.f2038a = layoutParams;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        View view;
        View view2;
        View view3;
        view = this.c.mView;
        view.setAlpha(0.0f);
        view2 = this.c.mView;
        view2.setTranslationX(0.0f);
        this.f2038a.height = this.b;
        view3 = this.c.mView;
        view3.setLayoutParams(this.f2038a);
    }
}
