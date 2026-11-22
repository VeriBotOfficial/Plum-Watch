package com.anythink.basead.ui.a.a;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* loaded from: classes11.dex */
public final class f extends a {
    public f(View view) {
        super(view);
    }

    @Override // com.anythink.basead.ui.a.a.a
    protected final ValueAnimator e() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f3156a, "rotation", 0.0f, 4.0f, 0.0f, -4.0f, 0.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }
}
