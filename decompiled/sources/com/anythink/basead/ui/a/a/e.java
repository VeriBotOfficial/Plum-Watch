package com.anythink.basead.ui.a.a;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes11.dex */
public final class e extends a {
    private float e;

    public e(View view) {
        super(view);
        this.e = 0.95f;
    }

    @Override // com.anythink.basead.ui.a.a.a
    protected final ValueAnimator e() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, this.e);
        ofFloat.setDuration(500L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.a.a.e.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (e.this.f3156a == null || e.this.f3156a.getVisibility() != 0) {
                    return;
                }
                e.this.f3156a.setScaleX(floatValue);
                e.this.f3156a.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }

    public final void g() {
        this.e = 0.85f;
    }
}
