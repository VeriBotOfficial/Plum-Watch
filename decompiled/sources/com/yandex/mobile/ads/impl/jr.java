package com.yandex.mobile.ads.impl;

import com.phancy.mini.core.app.meta.MiniAppJson;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jr {

    /* renamed from: a, reason: collision with root package name */
    private final of1 f15939a;

    public final pp1 a(o3 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        pp1 pp1Var = new pp1(new LinkedHashMap(), 2);
        of1 of1Var = this.f15939a;
        int o = adConfiguration.o();
        of1Var.getClass();
        pp1Var.b(o != 1 ? o != 2 ? "undefined" : MiniAppJson.LANDSCAPE : MiniAppJson.PORTRAIT, "orientation");
        return pp1Var;
    }

    public /* synthetic */ jr() {
        this(new of1());
    }

    public jr(of1 orientationNameProvider) {
        Intrinsics.checkNotNullParameter(orientationNameProvider, "orientationNameProvider");
        this.f15939a = orientationNameProvider;
    }
}
