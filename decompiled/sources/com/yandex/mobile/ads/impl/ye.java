package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ms0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ye {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f17416a;
    private final ue b;

    public final void a(final xe listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17416a.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.ye$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ye.a(ye.this, listener);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye() {
        this(ms0.a.a().c(), ve.a());
        int i = ms0.f;
    }

    public ye(Executor executor, ue appMetricaAdapter) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(appMetricaAdapter, "appMetricaAdapter");
        this.f17416a = executor;
        this.b = appMetricaAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ye this$0, xe listener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        try {
            this$0.b.a(listener);
        } catch (Throwable th) {
            listener.a(th.getMessage());
        }
    }
}
