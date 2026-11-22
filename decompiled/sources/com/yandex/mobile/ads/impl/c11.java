package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c11 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f15151a;
    private final Executor b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        new Handler(Looper.getMainLooper()).post(r);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ c11() {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.c11$$ExternalSyntheticLambda0 r0 = new com.yandex.mobile.ads.impl.c11$$ExternalSyntheticLambda0
            r0.<init>()
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            int r1 = r1.availableProcessors()
            int r1 = r1 + (-1)
            r2 = 2
            r3 = 4
            int r1 = kotlin.ranges.RangesKt.coerceIn(r1, r2, r3)
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newFixedThreadPool(r1)
            java.lang.String r2 = "newFixedThreadPool(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r4.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.c11.<init>():void");
    }

    public c11(Executor mainThreadExecutor, Executor backgroundExecutor) {
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        this.f15151a = mainThreadExecutor;
        this.b = backgroundExecutor;
    }

    public final Executor b() {
        return this.f15151a;
    }

    public final Executor a() {
        return this.b;
    }
}
