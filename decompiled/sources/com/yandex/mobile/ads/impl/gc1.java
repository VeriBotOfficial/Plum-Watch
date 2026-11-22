package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gc1 implements yc0, jc1 {

    /* renamed from: a, reason: collision with root package name */
    private final ic1 f15575a;
    private final zp b;

    public gc1(ic1 nativeWebViewController, zp closeShowListener) {
        Intrinsics.checkNotNullParameter(nativeWebViewController, "nativeWebViewController");
        Intrinsics.checkNotNullParameter(closeShowListener, "closeShowListener");
        this.f15575a = nativeWebViewController;
        this.b = closeShowListener;
    }

    @Override // com.yandex.mobile.ads.impl.jc1
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void invalidate() {
        this.f15575a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.jc1
    public final void a(boolean z) {
        if (z) {
            return;
        }
        this.b.a();
        this.f15575a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void start() {
        this.f15575a.a(this);
    }
}
