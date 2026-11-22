package com.yandex.mobile.ads.impl;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k30 {

    /* renamed from: a, reason: collision with root package name */
    private final u82 f15978a;

    public k30(lh1 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f15978a = tracker;
    }

    public final void a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("trackingUrl");
        if (queryParameter == null || queryParameter.length() <= 0) {
            return;
        }
        this.f15978a.a(queryParameter);
    }
}
