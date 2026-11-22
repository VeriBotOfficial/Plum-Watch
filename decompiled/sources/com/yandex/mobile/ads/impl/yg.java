package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yg implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final ff1 f17420a;
    private final String b;
    private final String c;
    private final mg2 d;

    public yg(ff1 adClickHandler, String url, String assetName, mg2 videoTracker) {
        Intrinsics.checkNotNullParameter(adClickHandler, "adClickHandler");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        this.f17420a = adClickHandler;
        this.b = url;
        this.c = assetName;
        this.d = videoTracker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.d.a(this.c);
        this.f17420a.a(this.b);
    }
}
