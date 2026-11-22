package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kx1 {

    /* renamed from: a, reason: collision with root package name */
    private final tr f16060a;

    public static boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = pw1.l;
        ju1 a2 = pw1.a.a().a(context);
        return a2 != null && a2.f0();
    }

    public final boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = pw1.l;
        ju1 sdkConfiguration = pw1.a.a().a(context);
        if (sdkConfiguration == null || !sdkConfiguration.x0() || a(context)) {
            return true;
        }
        this.f16060a.getClass();
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        return !Intrinsics.areEqual(pw1.a.a().f(), sdkConfiguration.U()) && Intrinsics.areEqual(pw1.a.a().f(), Boolean.TRUE);
    }

    public /* synthetic */ kx1() {
        this(new tr());
    }

    public kx1(tr consentUpdateValidator) {
        Intrinsics.checkNotNullParameter(consentUpdateValidator, "consentUpdateValidator");
        this.f16060a = consentUpdateValidator;
    }
}
