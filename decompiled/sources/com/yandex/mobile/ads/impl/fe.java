package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fe implements ee {

    /* renamed from: a, reason: collision with root package name */
    private final pw1 f15481a;
    private final mu1 b;
    private final k2 c;
    private final Context d;

    public fe(Context context, pw1 sdkSettings, mu1 sdkConfigurationExpiredDateValidator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        Intrinsics.checkNotNullParameter(sdkConfigurationExpiredDateValidator, "sdkConfigurationExpiredDateValidator");
        this.f15481a = sdkSettings;
        this.b = sdkConfigurationExpiredDateValidator;
        this.c = new k2(context);
        this.d = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.ee
    public final boolean a() {
        if (this.c.a().d()) {
            pw1 pw1Var = this.f15481a;
            Context context = this.d;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            ju1 a2 = pw1Var.a(context);
            if (a2 != null) {
                boolean z = a2.d() != null;
                boolean a3 = this.b.a(a2);
                if ((!a2.V() || a3) && !z) {
                }
            }
            return true;
        }
        return false;
    }
}
