package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.op1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yy {

    /* renamed from: a, reason: collision with root package name */
    private final tp1 f17469a;
    private final ff1 b;
    private final p51 c;
    private final dk1 d;

    public yy(o3 adConfiguration, o8 adResponse, tp1 reporter, r91 openUrlHandler, p51 nativeAdEventController, dk1 preferredPackagesViewer) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(openUrlHandler, "openUrlHandler");
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        Intrinsics.checkNotNullParameter(preferredPackagesViewer, "preferredPackagesViewer");
        this.f17469a = reporter;
        this.b = openUrlHandler;
        this.c = nativeAdEventController;
        this.d = preferredPackagesViewer;
    }

    public final void a(Context context, uy action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.d.a(context, action.d())) {
            this.f17469a.a(op1.b.F);
            this.c.d();
        } else {
            this.b.a(action.c());
        }
    }
}
