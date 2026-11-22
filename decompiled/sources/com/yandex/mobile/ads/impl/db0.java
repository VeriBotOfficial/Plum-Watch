package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.GravityCompat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class db0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15265a;

    public db0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15265a = context;
    }

    public final ImageView a(int i, int i2) {
        ImageView imageView = new ImageView(this.f15265a);
        int a2 = wh2.a(this.f15265a, 28.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.gravity = GravityCompat.END;
        layoutParams.rightMargin = i;
        layoutParams.topMargin = i2;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }
}
