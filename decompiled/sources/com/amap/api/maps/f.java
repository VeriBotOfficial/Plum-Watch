package com.amap.api.maps;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: SwipeDismissTouchListener.java */
/* loaded from: classes11.dex */
class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewGroup.LayoutParams f2039a;
    final /* synthetic */ SwipeDismissTouchListener b;

    f(SwipeDismissTouchListener swipeDismissTouchListener, ViewGroup.LayoutParams layoutParams) {
        this.b = swipeDismissTouchListener;
        this.f2039a = layoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        this.f2039a.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view = this.b.mView;
        view.setLayoutParams(this.f2039a);
    }
}
