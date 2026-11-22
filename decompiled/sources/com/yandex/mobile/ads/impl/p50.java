package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p50 {
    private static p50 c;
    private static final Object d = new Object();
    public static final /* synthetic */ int e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final o50 f16522a;
    private bj0 b;

    public static final class a {
        @JvmStatic
        public static p50 a(Context context) {
            p50 p50Var;
            Intrinsics.checkNotNullParameter(context, "context");
            p50 p50Var2 = p50.c;
            if (p50Var2 != null) {
                return p50Var2;
            }
            synchronized (p50.d) {
                p50Var = p50.c;
                if (p50Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    p50Var = new p50(applicationContext, new o50(), gf.a(applicationContext));
                    p50.c = p50Var;
                }
            }
            return p50Var;
        }
    }

    public p50(Context appContext, o50 environmentConfiguration, bj0 appMetricaProvider) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(environmentConfiguration, "environmentConfiguration");
        Intrinsics.checkNotNullParameter(appMetricaProvider, "appMetricaProvider");
        this.f16522a = environmentConfiguration;
        CollectionsKt.emptyList();
        MapsKt.emptyMap();
        this.b = appMetricaProvider;
    }

    public final o50 c() {
        return this.f16522a;
    }

    public final bj0 d() {
        return this.b;
    }
}
