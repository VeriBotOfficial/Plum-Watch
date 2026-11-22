package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ug2 implements td2 {

    /* renamed from: a, reason: collision with root package name */
    private final sg2 f17050a;

    public ug2(sg2 videoViewProvider) {
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        this.f17050a = videoViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.td2
    public final boolean a() {
        View view = this.f17050a.getView();
        return (view == null || wh2.d(view) || !wh2.a(view, 50)) ? false : true;
    }
}
