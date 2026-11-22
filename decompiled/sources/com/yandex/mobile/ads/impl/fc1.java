package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fc1 {

    /* renamed from: a, reason: collision with root package name */
    private final List<ig<?>> f15475a;
    private final List<ey1> b;
    private final List<String> c;
    private final String d;
    private final t4 e;

    public fc1(List assets, ArrayList showNotices, ArrayList renderTrackingUrls, String str, t4 t4Var) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        Intrinsics.checkNotNullParameter(renderTrackingUrls, "renderTrackingUrls");
        this.f15475a = assets;
        this.b = showNotices;
        this.c = renderTrackingUrls;
        this.d = str;
        this.e = t4Var;
    }

    public final List<ig<?>> b() {
        return this.f15475a;
    }

    public final List<ey1> e() {
        return this.b;
    }

    public final List<String> d() {
        return this.c;
    }

    public final String a() {
        return this.d;
    }

    public final t4 c() {
        return this.e;
    }
}
