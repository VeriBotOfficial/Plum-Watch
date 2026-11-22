package com.yandex.mobile.ads.impl;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rf2 {

    /* renamed from: a, reason: collision with root package name */
    private final gf2 f16762a;
    private final Handler b;
    private zl1 c;
    private boolean d;

    public rf2(gf2 videoPlayerController, Handler handler) {
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f16762a = videoPlayerController;
        this.b = handler;
    }

    public final void a(zl1 zl1Var) {
        this.c = zl1Var;
    }

    private final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long c = rf2.this.f16762a.c();
            zl1 zl1Var = rf2.this.c;
            if (zl1Var != null) {
                zl1Var.a(c);
            }
            if (rf2.this.d) {
                rf2.this.b.postDelayed(this, 200L);
            }
        }
    }

    public final void b() {
        if (this.d) {
            this.b.removeCallbacksAndMessages(null);
            this.d = false;
        }
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.b.post(new a());
    }
}
