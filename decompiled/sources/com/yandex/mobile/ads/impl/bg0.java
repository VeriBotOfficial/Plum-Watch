package com.yandex.mobile.ads.impl;

import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bg0 {

    /* renamed from: a, reason: collision with root package name */
    private final dg0 f15106a;
    private final ag0 b;
    private final Executor c;

    public final void a(final cg0 listener, final ct hostAccessChecker) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(hostAccessChecker, "hostAccessChecker");
        this.c.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.bg0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                bg0.a(bg0.this, hostAccessChecker, listener);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ bg0() {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.dg0 r0 = new com.yandex.mobile.ads.impl.dg0
            r0.<init>()
            com.yandex.mobile.ads.impl.ag0 r1 = new com.yandex.mobile.ads.impl.ag0
            r1.<init>()
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()
            java.lang.String r3 = "newSingleThreadExecutor(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r4.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.bg0.<init>():void");
    }

    public bg0(dg0 hostAccessCheckRequester, ag0 hostAccessAdBlockerDetectionValidator, Executor singleThreadExecutor) {
        Intrinsics.checkNotNullParameter(hostAccessCheckRequester, "hostAccessCheckRequester");
        Intrinsics.checkNotNullParameter(hostAccessAdBlockerDetectionValidator, "hostAccessAdBlockerDetectionValidator");
        Intrinsics.checkNotNullParameter(singleThreadExecutor, "singleThreadExecutor");
        this.f15106a = hostAccessCheckRequester;
        this.b = hostAccessAdBlockerDetectionValidator;
        this.c = singleThreadExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bg0 this$0, ct hostAccessChecker, cg0 listener) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(hostAccessChecker, "$hostAccessChecker");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        try {
            bool = this$0.a(hostAccessChecker);
        } catch (Throwable unused) {
            sp0.c(new Object[0]);
            bool = null;
        }
        listener.a(bool);
    }

    private final Boolean a(ct hostAccessChecker) {
        this.f15106a.getClass();
        Intrinsics.checkNotNullParameter("yandex.ru", "host");
        Intrinsics.checkNotNullParameter(hostAccessChecker, "hostAccessChecker");
        FutureTask futureTask = new FutureTask(new fg0("yandex.ru", hostAccessChecker, new hg0(hostAccessChecker)));
        new Thread(futureTask).start();
        this.f15106a.getClass();
        Intrinsics.checkNotNullParameter("mobile.yandexadexchange.net", "host");
        Intrinsics.checkNotNullParameter(hostAccessChecker, "hostAccessChecker");
        FutureTask futureTask2 = new FutureTask(new fg0("mobile.yandexadexchange.net", hostAccessChecker, new hg0(hostAccessChecker)));
        new Thread(futureTask2).start();
        boolean a2 = ((eg0) futureTask.get()).a();
        boolean a3 = ((eg0) futureTask2.get()).a();
        this.b.getClass();
        if (!a3 && a2) {
            return Boolean.TRUE;
        }
        if (a3 || a2) {
            return Boolean.FALSE;
        }
        return null;
    }
}
