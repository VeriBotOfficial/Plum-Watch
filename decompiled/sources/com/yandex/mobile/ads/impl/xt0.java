package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xt0 implements ot0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f17364a;
    private ot0 b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(xt0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ot0 ot0Var = this$0.b;
        if (ot0Var != null) {
            ot0Var.onInstreamAdBreakCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(xt0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ot0 ot0Var = this$0.b;
        if (ot0Var != null) {
            ot0Var.onInstreamAdBreakPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(xt0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ot0 ot0Var = this$0.b;
        if (ot0Var != null) {
            ot0Var.onInstreamAdBreakStarted();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ot0
    public final void onInstreamAdBreakError(final String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f17364a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.xt0$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                xt0.a(xt0.this, reason);
            }
        });
    }

    public /* synthetic */ xt0() {
        this(new Handler(Looper.getMainLooper()));
    }

    public xt0(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f17364a = handler;
    }

    @Override // com.yandex.mobile.ads.impl.ot0
    public final void onInstreamAdBreakPrepared() {
        this.f17364a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.xt0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                xt0.b(xt0.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.ot0
    public final void onInstreamAdBreakStarted() {
        this.f17364a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.xt0$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                xt0.c(xt0.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.ot0
    public final void onInstreamAdBreakCompleted() {
        this.f17364a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.xt0$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                xt0.a(xt0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(xt0 this$0, String reason) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reason, "$reason");
        ot0 ot0Var = this$0.b;
        if (ot0Var != null) {
            ot0Var.onInstreamAdBreakError(reason);
        }
    }

    public final void a(cm2 cm2Var) {
        this.b = cm2Var;
    }
}
