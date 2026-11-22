package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class jf2 implements nu {

    /* renamed from: a, reason: collision with root package name */
    private nu f15908a;

    public final void a(lf2 lf2Var) {
        this.f15908a = lf2Var;
    }

    @Override // com.yandex.mobile.ads.impl.nu
    public final void onVideoPrepared() {
        nu nuVar = this.f15908a;
        if (nuVar != null) {
            nuVar.onVideoPrepared();
        }
    }

    @Override // com.yandex.mobile.ads.impl.nu
    public final void onVideoCompleted() {
        nu nuVar = this.f15908a;
        if (nuVar != null) {
            nuVar.onVideoCompleted();
        }
    }

    @Override // com.yandex.mobile.ads.impl.nu
    public final void onVideoResumed() {
        nu nuVar = this.f15908a;
        if (nuVar != null) {
            nuVar.onVideoResumed();
        }
    }

    @Override // com.yandex.mobile.ads.impl.nu
    public final void onVideoPaused() {
        nu nuVar = this.f15908a;
        if (nuVar != null) {
            nuVar.onVideoPaused();
        }
    }

    @Override // com.yandex.mobile.ads.impl.nu
    public final void onVideoError() {
        nu nuVar = this.f15908a;
        if (nuVar != null) {
            nuVar.onVideoError();
        }
    }
}
