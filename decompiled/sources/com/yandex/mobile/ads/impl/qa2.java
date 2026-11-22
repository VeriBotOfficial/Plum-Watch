package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qa2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb2 f16648a;

    public qa2(Context context, db2 verificationResourcesLoaderProvider, bb2 bb2Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(verificationResourcesLoaderProvider, "verificationResourcesLoaderProvider");
        this.f16648a = bb2Var;
    }

    public final void a(List<mb2> videoAds, cb2 listener) {
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f16648a != null && (!(videoAds instanceof Collection) || !videoAds.isEmpty())) {
            Iterator<T> it = videoAds.iterator();
            while (it.hasNext()) {
                if (!((mb2) it.next()).d().isEmpty()) {
                    this.f16648a.a(listener);
                    return;
                }
            }
        }
        listener.a();
    }
}
