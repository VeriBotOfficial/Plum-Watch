package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lf1 {

    /* renamed from: a, reason: collision with root package name */
    private final o8<?> f16111a;
    private final j1 b;
    private final Context c;

    public lf1(Context context, o8 adResponse, v1 adActivityListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        this.f16111a = adResponse;
        this.b = adActivityListener;
        this.c = context.getApplicationContext();
    }

    public final void a() {
        if (this.f16111a.S()) {
            return;
        }
        gz1 M = this.f16111a.M();
        Context context = this.c;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        new mb0(context, M, this.b).a();
    }
}
