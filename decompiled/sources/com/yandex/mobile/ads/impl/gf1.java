package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gf1 {

    /* renamed from: a, reason: collision with root package name */
    private final ps0 f15584a;

    public /* synthetic */ gf1(Context context) {
        this(context, rs0.a(context));
    }

    public final void b() {
        this.f15584a.b("OPT_OUT_ENABLED", true);
    }

    public gf1(Context context, ps0 localStorage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f15584a = localStorage;
    }

    public final boolean a() {
        return this.f15584a.a("OPT_OUT_ENABLED", false);
    }
}
