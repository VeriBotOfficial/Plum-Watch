package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r51 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f16730a;
    private st b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(r51 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        st stVar = this$0.b;
        if (stVar != null) {
            stVar.onAdClicked();
        }
        st stVar2 = this$0.b;
        if (stVar2 != null) {
            stVar2.onLeftApplication();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(r51 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        st stVar = this$0.b;
        if (stVar != null) {
            stVar.onReturnedToApplication();
        }
    }

    public /* synthetic */ r51() {
        this(new Handler(Looper.getMainLooper()));
    }

    public r51(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f16730a = handler;
    }

    public final void a() {
        this.f16730a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.r51$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                r51.a(r51.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(r51 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        st stVar = this$0.b;
        if (stVar != null) {
            stVar.closeNativeAd();
        }
    }

    @Override // com.yandex.mobile.ads.impl.n0
    public final void onLeftApplication() {
        this.f16730a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.r51$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                r51.b(r51.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.n0
    public final void onReturnedToApplication() {
        this.f16730a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.r51$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                r51.c(r51.this);
            }
        });
    }

    public final void a(final t4 t4Var) {
        this.f16730a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.r51$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                r51.a(r51.this, t4Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(r51 this$0, t4 t4Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        st stVar = this$0.b;
        if (stVar != null) {
            stVar.a(t4Var);
        }
    }

    public final void a(st stVar) {
        this.b = stVar;
    }
}
