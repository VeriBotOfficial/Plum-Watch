package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class on0 implements ff1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16470a;
    private final vn0 b;
    private final y82 c;

    public on0(Context context, vn0 instreamInteractionTracker, y82 urlViewerLauncher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(instreamInteractionTracker, "instreamInteractionTracker");
        Intrinsics.checkNotNullParameter(urlViewerLauncher, "urlViewerLauncher");
        this.f16470a = context;
        this.b = instreamInteractionTracker;
        this.c = urlViewerLauncher;
    }

    @Override // com.yandex.mobile.ads.impl.ff1
    public final void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.c.a(this.f16470a, url)) {
            this.b.a();
        }
    }
}
