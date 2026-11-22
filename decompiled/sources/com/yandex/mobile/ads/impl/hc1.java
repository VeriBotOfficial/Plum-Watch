package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hc1 implements yc0, jc1 {

    /* renamed from: a, reason: collision with root package name */
    private final ic1 f15677a;
    private k3 b;

    public hc1(ic1 nativeWebViewController, k3 adCompleteListener) {
        Intrinsics.checkNotNullParameter(nativeWebViewController, "nativeWebViewController");
        Intrinsics.checkNotNullParameter(adCompleteListener, "adCompleteListener");
        this.f15677a = nativeWebViewController;
        this.b = adCompleteListener;
    }

    @Override // com.yandex.mobile.ads.impl.jc1
    public final void a(boolean z) {
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.jc1
    public final void a() {
        k3 k3Var = this.b;
        if (k3Var != null) {
            k3Var.b();
        }
        this.f15677a.b(this);
        this.b = null;
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void invalidate() {
        this.f15677a.b(this);
        this.b = null;
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void start() {
        this.f15677a.a(this);
    }
}
