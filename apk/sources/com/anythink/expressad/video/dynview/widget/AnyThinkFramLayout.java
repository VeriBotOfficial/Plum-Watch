package com.anythink.expressad.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes16.dex */
public class AnyThinkFramLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AnimatorSet f5277a;

    public AnyThinkFramLayout(Context context) {
        super(context);
    }

    public AnyThinkFramLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnyThinkFramLayout(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f5277a = animatorSet;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f5277a;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f5277a;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
