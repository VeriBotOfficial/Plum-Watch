package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u81 implements st {

    /* renamed from: a, reason: collision with root package name */
    private final j1 f17029a;
    private final vd0 b;

    public u81(v1 adActivityListener, vd0 fullscreenAdtuneCloseEnabledProvider) {
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        Intrinsics.checkNotNullParameter(fullscreenAdtuneCloseEnabledProvider, "fullscreenAdtuneCloseEnabledProvider");
        this.f17029a = adActivityListener;
        this.b = fullscreenAdtuneCloseEnabledProvider;
    }

    @Override // com.yandex.mobile.ads.impl.st
    public final void onAdClicked() {
    }

    @Override // com.yandex.mobile.ads.impl.st
    public final void onLeftApplication() {
        this.f17029a.a(17, null);
    }

    @Override // com.yandex.mobile.ads.impl.st
    public final void onReturnedToApplication() {
        this.f17029a.a(18, null);
    }

    @Override // com.yandex.mobile.ads.impl.st
    public final void a(t4 t4Var) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("impression_data_key", t4Var);
        this.f17029a.a(16, bundle);
    }

    @Override // com.yandex.mobile.ads.impl.st
    public final void closeNativeAd() {
        if (this.b.a()) {
            this.f17029a.a();
        }
    }
}
