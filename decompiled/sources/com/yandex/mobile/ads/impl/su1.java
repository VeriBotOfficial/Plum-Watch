package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.pw1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class su1 {

    /* renamed from: a, reason: collision with root package name */
    private final mu1 f16896a;
    private final xw1 b;
    private final tr c;

    public final boolean a(ju1 sdkConfiguration) {
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        if (this.f16896a.a(sdkConfiguration)) {
            return true;
        }
        this.b.getClass();
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        if (!Intrinsics.areEqual("7.12.2", sdkConfiguration.J())) {
            return true;
        }
        this.c.getClass();
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        int i = pw1.l;
        if (!Intrinsics.areEqual(pw1.a.a().j(), sdkConfiguration.A0())) {
            return true;
        }
        this.c.getClass();
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        if (pw1.a.a().d() != sdkConfiguration.m0()) {
            return true;
        }
        this.c.getClass();
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        return !Intrinsics.areEqual(pw1.a.a().f(), sdkConfiguration.U());
    }

    public /* synthetic */ su1() {
        this(new mu1(), new xw1());
    }

    public su1(mu1 sdkConfigurationExpiredDateValidator, xw1 sdkVersionUpdateValidator) {
        Intrinsics.checkNotNullParameter(sdkConfigurationExpiredDateValidator, "sdkConfigurationExpiredDateValidator");
        Intrinsics.checkNotNullParameter(sdkVersionUpdateValidator, "sdkVersionUpdateValidator");
        this.f16896a = sdkConfigurationExpiredDateValidator;
        this.b = sdkVersionUpdateValidator;
        this.c = new tr();
    }
}
