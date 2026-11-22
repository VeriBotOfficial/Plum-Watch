package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xy0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17378a;
    private final rx0<?, ?> b;
    private final Map<String, Object> c;

    public xy0(Context context, rx0 mediatedAdController, LinkedHashMap mediatedReportData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediatedAdController, "mediatedAdController");
        Intrinsics.checkNotNullParameter(mediatedReportData, "mediatedReportData");
        this.f17378a = context;
        this.b = mediatedAdController;
        this.c = mediatedReportData;
    }

    public final void a() {
        this.b.e(this.f17378a, this.c);
    }
}
