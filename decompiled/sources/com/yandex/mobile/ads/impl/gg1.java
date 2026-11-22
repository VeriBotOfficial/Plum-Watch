package com.yandex.mobile.ads.impl;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gg1 {

    /* renamed from: a, reason: collision with root package name */
    private final eh0 f15588a;
    private final Handler b;
    private final dz1 c;
    private final r7 d;
    private boolean e;

    public gg1(eh0 htmlWebViewRenderer, Handler handler, dz1 singleTimeRunner, r7 adRenderWaitBreaker) {
        Intrinsics.checkNotNullParameter(htmlWebViewRenderer, "htmlWebViewRenderer");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(singleTimeRunner, "singleTimeRunner");
        Intrinsics.checkNotNullParameter(adRenderWaitBreaker, "adRenderWaitBreaker");
        this.f15588a = htmlWebViewRenderer;
        this.b = handler;
        this.c = singleTimeRunner;
        this.d = adRenderWaitBreaker;
    }

    public final void b() {
        if (this.e) {
            return;
        }
        this.c.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.gg1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                gg1.a(gg1.this);
            }
        });
    }

    public final void a() {
        this.b.removeCallbacksAndMessages(null);
        this.d.a(null);
    }

    public final void a(int i, String str) {
        this.e = true;
        this.b.removeCallbacks(this.d);
        this.b.post(new wj2(i, str, this.f15588a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gg1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        sp0.d(new Object[0]);
        this$0.b.postDelayed(this$0.d, 10000L);
    }

    public final void a(dh0 dh0Var) {
        this.d.a(dh0Var);
    }
}
