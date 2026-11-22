package com.yandex.mobile.ads.impl;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hd implements le {
    private static final Object b = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Executor f15678a;

    public hd(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f15678a = executor;
    }

    @Override // com.yandex.mobile.ads.impl.le
    public final void a(final je report) {
        Intrinsics.checkNotNullParameter(report, "report");
        this.f15678a.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.hd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                hd.a(hd.this, report);
            }
        });
    }

    private static void b(je jeVar) {
        String str = "reportLibraryAdapterEvent(), eventName = " + jeVar.a() + ", reportData = " + jeVar.b();
        sp0.a(new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hd this$0, je report) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(report, "$report");
        this$0.getClass();
        b(report);
        fd.f15477a.getClass();
        fd.a(report);
    }
}
