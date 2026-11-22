package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pl1 {

    /* renamed from: a, reason: collision with root package name */
    private final o10 f16580a;

    public final ProgressBar a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminateDrawable(ContextCompat.getDrawable(context, R.drawable.monetization_ads_video_progress_bar_background));
        this.f16580a.getClass();
        int a2 = o10.a(context, 45.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        return progressBar;
    }

    public /* synthetic */ pl1() {
        this(new o10());
    }

    public pl1(o10 dimensionConverter) {
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        this.f16580a = dimensionConverter;
    }
}
