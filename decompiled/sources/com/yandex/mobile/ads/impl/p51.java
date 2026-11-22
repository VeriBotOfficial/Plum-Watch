package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.qk0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p51 implements x50, qk0.a {

    /* renamed from: a, reason: collision with root package name */
    private final r51 f16523a;
    private final m0 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ p51(android.content.Context r7, com.yandex.mobile.ads.impl.o3 r8, com.yandex.mobile.ads.impl.o8 r9) {
        /*
            r6 = this;
            com.yandex.mobile.ads.impl.r51 r4 = new com.yandex.mobile.ads.impl.r51
            r4.<init>()
            com.yandex.mobile.ads.impl.m0 r5 = new com.yandex.mobile.ads.impl.m0
            r5.<init>(r7, r8, r9, r4)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.p51.<init>(android.content.Context, com.yandex.mobile.ads.impl.o3, com.yandex.mobile.ads.impl.o8):void");
    }

    public p51(Context context, o3 adConfiguration, o8<?> adResponse, r51 nativeAdEventListenerController, m0 activityInteractionControllerWrapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdEventListenerController, "nativeAdEventListenerController");
        Intrinsics.checkNotNullParameter(activityInteractionControllerWrapper, "activityInteractionControllerWrapper");
        this.f16523a = nativeAdEventListenerController;
        this.b = activityInteractionControllerWrapper;
    }

    public final void b() {
        sp0.a(new Object[0]);
        this.b.a();
    }

    public final void c() {
        this.b.e();
    }

    public final void d() {
        this.f16523a.onLeftApplication();
        this.b.d();
    }

    public final void e() {
        this.f16523a.onLeftApplication();
        this.b.f();
    }

    @Override // com.yandex.mobile.ads.impl.x50
    public final void a() {
        this.f16523a.a();
    }

    public final void g() {
        this.f16523a.onLeftApplication();
        this.b.c();
    }

    public final void f() {
        this.b.b();
    }

    @Override // com.yandex.mobile.ads.impl.qk0.a
    public final void a(t4 t4Var) {
        this.f16523a.a(t4Var);
    }

    public final void a(st stVar) {
        this.f16523a.a(stVar);
    }

    public final void a(x71 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.b.a(reportParameterManager);
    }

    public final void a(vr0 link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.b.a(link.c());
    }
}
