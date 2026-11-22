package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class st0 {

    /* renamed from: a, reason: collision with root package name */
    private final jm0 f16893a;
    private final xt0 b;
    private final yt0 c;
    private final cn0 d;
    private final u2 e;

    public st0(Context context, bv1 sdkEnvironmentModule, gt instreamAdBreak, jm0 instreamAdPlayerController, z2 adBreakStatusController, xt0 manualPlaybackEventListener, am0 instreamAdCustomUiElementsHolder, yt0 manualPlaybackManager, cn0 instreamAdViewsHolderManager, u2 adBreakPlaybackController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamAdBreak, "instreamAdBreak");
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        Intrinsics.checkNotNullParameter(adBreakStatusController, "adBreakStatusController");
        Intrinsics.checkNotNullParameter(manualPlaybackEventListener, "manualPlaybackEventListener");
        Intrinsics.checkNotNullParameter(instreamAdCustomUiElementsHolder, "instreamAdCustomUiElementsHolder");
        Intrinsics.checkNotNullParameter(manualPlaybackManager, "manualPlaybackManager");
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        Intrinsics.checkNotNullParameter(adBreakPlaybackController, "adBreakPlaybackController");
        this.f16893a = instreamAdPlayerController;
        this.b = manualPlaybackEventListener;
        this.c = manualPlaybackManager;
        this.d = instreamAdViewsHolderManager;
        this.e = adBreakPlaybackController;
    }

    public final void b() {
        bn0 a2 = this.d.a();
        if (a2 == null || a2.b() == null) {
            return;
        }
        this.e.a();
    }

    public final void d() {
        bn0 a2 = this.d.a();
        if (a2 == null || a2.b() == null) {
            return;
        }
        this.e.f();
    }

    public final void c() {
        this.f16893a.a();
        this.e.a(new a());
        this.e.d();
    }

    public final void a() {
        this.e.b();
        this.f16893a.b();
        this.d.b();
    }

    public final void a(t70 instreamAdView) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        st0 a2 = this.c.a(instreamAdView);
        if (!Intrinsics.areEqual(this, a2)) {
            if (a2 != null) {
                a2.e.c();
                a2.d.b();
            }
            if (this.c.a(this)) {
                this.e.c();
                this.d.b();
            }
            this.c.a(instreamAdView, this);
        }
        this.d.a(instreamAdView, CollectionsKt.emptyList());
        this.f16893a.a();
        this.e.g();
    }

    private final class a implements v2 {
        @Override // com.yandex.mobile.ads.impl.v2
        public final void d() {
        }

        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.v2
        public final void a() {
            st0.this.b.onInstreamAdBreakPrepared();
        }

        @Override // com.yandex.mobile.ads.impl.v2
        public final void b() {
            st0.this.b.onInstreamAdBreakStarted();
        }

        @Override // com.yandex.mobile.ads.impl.v2
        public final void e() {
            st0.this.b.onInstreamAdBreakCompleted();
        }

        @Override // com.yandex.mobile.ads.impl.v2
        public final void g() {
            st0.this.b.onInstreamAdBreakError("Ad player returned error");
        }
    }

    public final void a(nb2 nb2Var) {
        this.e.a(nb2Var);
    }
}
