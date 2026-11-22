package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes5.dex */
public final class aj0 implements bj0 {
    private static final Object h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final ue f15012a;
    private final hf b;
    private final ff c;
    private final Context d;
    private df e;
    private final cj0 f;
    private final String g;

    public aj0(Context context, ue appMetricaAdapter, hf appMetricaIdentifiersValidator, ff appMetricaIdentifiersLoader, nu0 mauidManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appMetricaAdapter, "appMetricaAdapter");
        Intrinsics.checkNotNullParameter(appMetricaIdentifiersValidator, "appMetricaIdentifiersValidator");
        Intrinsics.checkNotNullParameter(appMetricaIdentifiersLoader, "appMetricaIdentifiersLoader");
        Intrinsics.checkNotNullParameter(mauidManager, "mauidManager");
        this.f15012a = appMetricaAdapter;
        this.b = appMetricaIdentifiersValidator;
        this.c = appMetricaIdentifiersLoader;
        this.f = cj0.b;
        this.g = mauidManager.a();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.d = applicationContext;
    }

    @Override // com.yandex.mobile.ads.impl.bj0
    public final cj0 c() {
        return this.f;
    }

    @Override // com.yandex.mobile.ads.impl.bj0
    public final String a() {
        return this.g;
    }

    public final void a(df appMetricaIdentifiers) {
        Intrinsics.checkNotNullParameter(appMetricaIdentifiers, "appMetricaIdentifiers");
        synchronized (h) {
            this.b.getClass();
            if (hf.a(appMetricaIdentifiers)) {
                this.e = appMetricaIdentifiers;
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.yandex.mobile.ads.impl.df] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // com.yandex.mobile.ads.impl.bj0
    public final df b() {
        ?? r2;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (h) {
            df dfVar = this.e;
            r2 = dfVar;
            if (dfVar == null) {
                df dfVar2 = new df(null, this.f15012a.b(this.d), this.f15012a.a(this.d));
                this.c.a(this.d, this);
                r2 = dfVar2;
            }
            objectRef.element = r2;
            Unit unit = Unit.INSTANCE;
        }
        return r2;
    }
}
