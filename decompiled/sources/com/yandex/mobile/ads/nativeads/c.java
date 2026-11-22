package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.du;
import com.yandex.mobile.ads.impl.eu;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements du {

    /* renamed from: a, reason: collision with root package name */
    private final CustomClickHandler f17591a;

    public c(CustomClickHandler customClickHandler) {
        Intrinsics.checkNotNullParameter(customClickHandler, "customClickHandler");
        this.f17591a = customClickHandler;
    }

    @Override // com.yandex.mobile.ads.impl.du
    public final void a(String url, eu listener) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17591a.handleCustomClick(url, new d(listener));
    }
}
