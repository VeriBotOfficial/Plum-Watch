package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pv {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16600a;

    public pv(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f16600a = applicationContext;
    }

    public final boolean a() {
        return (this.f16600a.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
