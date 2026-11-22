package com.yandex.mobile.ads.impl;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ml1 extends Animation {

    /* renamed from: a, reason: collision with root package name */
    private final int f16257a;
    private final int b;
    private final WeakReference<ProgressBar> c;

    public ml1(ProgressBar progressBar, int i, int i2) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        this.f16257a = i;
        this.b = i2;
        this.c = new WeakReference<>(progressBar);
        setInterpolator(new LinearInterpolator());
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        ProgressBar progressBar = this.c.get();
        if (progressBar != null) {
            super.applyTransformation(f, transformation);
            progressBar.setProgress(Math.round(((this.b - r5) * f) + this.f16257a));
        }
    }
}
