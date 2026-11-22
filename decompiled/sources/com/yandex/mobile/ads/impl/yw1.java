package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yw1 {

    /* renamed from: a, reason: collision with root package name */
    private final i92 f17465a;
    private final k92 b;

    public /* synthetic */ yw1(Context context) {
        this(context, new i92(context), new k92(context));
    }

    public yw1(Context context, i92 indicatorController, k92 logController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(indicatorController, "indicatorController");
        Intrinsics.checkNotNullParameter(logController, "logController");
        this.f17465a = indicatorController;
        this.b = logController;
    }

    public final void a() {
        this.b.a();
        this.f17465a.a();
    }
}
