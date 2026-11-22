package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    private final o2 f15873a;

    public final boolean a(i2 adBlockerState) {
        Intrinsics.checkNotNullParameter(adBlockerState, "adBlockerState");
        return adBlockerState.b() + this.f15873a.a() < System.currentTimeMillis();
    }

    public /* synthetic */ j2(Context context) {
        this(context, new o2(context));
    }

    public j2(Context context, o2 adBlockerStatusValidityDurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adBlockerStatusValidityDurationProvider, "adBlockerStatusValidityDurationProvider");
        this.f15873a = adBlockerStatusValidityDurationProvider;
    }
}
