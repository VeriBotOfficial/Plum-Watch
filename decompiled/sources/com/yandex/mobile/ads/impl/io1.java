package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class io1 {

    /* renamed from: a, reason: collision with root package name */
    private final l10 f15838a;
    private final Context b;

    public /* synthetic */ io1(Context context) {
        this(context, new l10());
    }

    public io1(Context context, l10 deviceTypeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceTypeProvider, "deviceTypeProvider");
        this.f15838a = deviceTypeProvider;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.b = applicationContext;
    }

    public final fw0 a() {
        if (k10.d == this.f15838a.a(this.b)) {
            return new fw0(1920, 1080, 6800);
        }
        return new fw0(854, 480, 1000);
    }
}
