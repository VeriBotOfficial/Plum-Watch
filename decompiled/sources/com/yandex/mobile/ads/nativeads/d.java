package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.eu;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements CustomClickHandlerEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final eu f17592a;

    public d(eu coreListener) {
        Intrinsics.checkNotNullParameter(coreListener, "coreListener");
        this.f17592a = coreListener;
    }

    @Override // com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
    public final void onLeftApplication() {
        this.f17592a.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
    public final void onReturnedToApplication() {
        this.f17592a.onReturnedToApplication();
    }
}
