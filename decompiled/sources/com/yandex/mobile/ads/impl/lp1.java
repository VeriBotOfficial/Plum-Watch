package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lp1 {

    /* renamed from: a, reason: collision with root package name */
    private final o10 f16156a;

    public final Button a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Button button = new Button(context);
        button.setBackground(ContextCompat.getDrawable(context, R.drawable.monetization_ads_video_ic_replay));
        this.f16156a.getClass();
        int a2 = o10.a(context, 90.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.gravity = 17;
        button.setLayoutParams(layoutParams);
        return button;
    }

    public /* synthetic */ lp1() {
        this(new o10());
    }

    public lp1(o10 dimensionConverter) {
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        this.f16156a = dimensionConverter;
    }
}
