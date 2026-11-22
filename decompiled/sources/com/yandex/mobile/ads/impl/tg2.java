package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tg2 {

    /* renamed from: a, reason: collision with root package name */
    private final sg2 f16967a;

    public tg2(sg2 videoViewProvider) {
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        this.f16967a = videoViewProvider;
    }

    public final boolean a() {
        View view = this.f16967a.getView();
        return (view == null || wh2.d(view) || wh2.b(view) < 1) ? false : true;
    }
}
