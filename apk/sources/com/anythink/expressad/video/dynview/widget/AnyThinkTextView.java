package com.anythink.expressad.video.dynview.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes16.dex */
public class AnyThinkTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ObjectAnimator f5289a;

    public AnyThinkTextView(Context context) {
        super(context);
    }

    public AnyThinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnyThinkTextView(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f5289a = objectAnimator;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f5289a;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f5289a;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
