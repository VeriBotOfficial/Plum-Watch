package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mb0 {

    /* renamed from: a, reason: collision with root package name */
    private final gz1 f16224a;
    private final j1 b;
    private final Context c;

    public mb0(Context context, gz1 sizeInfo, j1 adActivityListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sizeInfo, "sizeInfo");
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        this.f16224a = sizeInfo;
        this.b = adActivityListener;
        this.c = context.getApplicationContext();
    }

    public final void a() {
        int i = this.c.getResources().getConfiguration().orientation;
        Context context = this.c;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        gz1 gz1Var = this.f16224a;
        boolean b = qa.b(context, gz1Var);
        boolean a2 = qa.a(context, gz1Var);
        int i2 = b == a2 ? -1 : (!a2 ? 1 == i : 1 != i) ? 6 : 7;
        if (-1 != i2) {
            this.b.a(i2);
        }
    }
}
