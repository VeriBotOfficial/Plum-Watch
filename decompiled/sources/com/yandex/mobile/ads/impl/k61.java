package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k61 implements j61 {

    /* renamed from: a, reason: collision with root package name */
    private final l61 f15988a;
    private final g61 b;

    public /* synthetic */ k61(Context context, bv1 bv1Var, u61 u61Var, l61 l61Var) {
        this(context, bv1Var, u61Var, l61Var, new g5(), new o3(ts.g, bv1Var), new f61(), new h61());
    }

    public k61(Context context, bv1 sdkEnvironmentModule, u61 requestData, l61 nativeAdLoadingItemFinishedListener, g5 adLoadingPhasesManager, o3 adConfiguration, f61 nativeAdLoadListenerFactory, h61 nativeAdLoadManagerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(nativeAdLoadingItemFinishedListener, "nativeAdLoadingItemFinishedListener");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(nativeAdLoadListenerFactory, "nativeAdLoadListenerFactory");
        Intrinsics.checkNotNullParameter(nativeAdLoadManagerFactory, "nativeAdLoadManagerFactory");
        this.f15988a = nativeAdLoadingItemFinishedListener;
        nativeAdLoadListenerFactory.getClass();
        p61 a2 = f61.a(context, adConfiguration, adLoadingPhasesManager, this);
        nativeAdLoadManagerFactory.getClass();
        g61 a3 = h61.a(context, sdkEnvironmentModule, requestData, adConfiguration, a2, adLoadingPhasesManager);
        this.b = a3;
        a2.a(a3.f());
    }

    @Override // com.yandex.mobile.ads.impl.j61
    public final void a() {
        this.f15988a.a(this);
    }

    public final void c() {
        this.b.z();
    }

    public final void b() {
        this.b.y();
    }

    public final void a(vt vtVar) {
        this.b.a(vtVar);
    }

    public final void a(bu buVar) {
        this.b.a(buVar);
    }

    public final void a(ku kuVar) {
        this.b.a(kuVar);
    }
}
