package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.g11;
import com.yandex.mobile.ads.impl.n11;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.v11;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q11 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f16621a = 0;

    static {
        new q11();
    }

    @JvmStatic
    public static final void b(boolean z) {
        int i = pw1.l;
        pw1.a.a().c(z);
    }

    private q11() {
    }

    @JvmStatic
    public static final void a(boolean z) {
        sp0.a(z);
        hp0.a(z);
        if (z) {
            return;
        }
        int i = v11.d;
        v11.a.a().c();
        int i2 = n11.d;
        n11.a.a().c();
    }

    @JvmStatic
    public static final void a(Context context, bv1 sdkEnvironmentModule, dt initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        if (new ki().a()) {
            return;
        }
        int i = g82.c;
        g82.a(context, sdkEnvironmentModule.c());
        de.a(context, sdkEnvironmentModule.c());
        new uj2(new ll1()).a();
        new lt0(context).a();
        int i2 = g11.h;
        g11.a.a(sdkEnvironmentModule).a(context, initializationListener);
    }
}
