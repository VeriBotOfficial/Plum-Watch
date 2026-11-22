package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hl0 {

    /* renamed from: a, reason: collision with root package name */
    private final b11 f15705a;
    private final dt b;

    public hl0(b11 mobileAdsExecutor, dt initializationListener) {
        Intrinsics.checkNotNullParameter(mobileAdsExecutor, "mobileAdsExecutor");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        this.f15705a = mobileAdsExecutor;
        this.b = initializationListener;
    }

    public final void a() {
        this.f15705a.b(new Runnable() { // from class: com.yandex.mobile.ads.impl.hl0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                hl0.a(hl0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hl0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b.onInitializationCompleted();
    }
}
