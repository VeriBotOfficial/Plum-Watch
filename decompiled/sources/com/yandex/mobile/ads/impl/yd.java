package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yd {
    public static void a(ProgressBar progressBar, long j, long j2) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        progressBar.clearAnimation();
        if (j > 0) {
            progressBar.setMax((int) j);
            ml1 ml1Var = new ml1(progressBar, progressBar.getProgress(), (int) j2);
            ml1Var.setDuration(200L);
            progressBar.startAnimation(ml1Var);
        }
    }
}
