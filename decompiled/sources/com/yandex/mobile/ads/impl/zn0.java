package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zn0 implements so0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f17545a;
    private sl0 b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(zn0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        sl0 sl0Var = this$0.b;
        if (sl0Var != null) {
            sl0Var.onInstreamAdPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(zn0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        sl0 sl0Var = this$0.b;
        if (sl0Var != null) {
            sl0Var.onInstreamAdCompleted();
        }
    }

    public /* synthetic */ zn0() {
        this(new Handler(Looper.getMainLooper()));
    }

    public zn0(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f17545a = handler;
    }

    @Override // com.yandex.mobile.ads.impl.so0
    public final void onInstreamAdPrepared() {
        this.f17545a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.zn0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                zn0.a(zn0.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.so0
    public final void b() {
        final String str = "Video player returned error";
        Intrinsics.checkNotNullParameter("Video player returned error", "reason");
        this.f17545a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.zn0$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                zn0.a(zn0.this, str);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.so0
    public final void a() {
        this.f17545a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.zn0$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                zn0.b(zn0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(zn0 this$0, String reason) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reason, "$reason");
        sl0 sl0Var = this$0.b;
        if (sl0Var != null) {
            sl0Var.onError(reason);
        }
    }

    public final void a(fm2 fm2Var) {
        this.b = fm2Var;
    }
}
