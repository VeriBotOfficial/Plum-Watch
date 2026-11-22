package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class va0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17145a;

    public va0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17145a = context;
    }

    public final FrameLayout a() {
        FrameLayout frameLayout = new FrameLayout(this.f17145a);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return frameLayout;
    }
}
