package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class h60 implements fr1 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f15660a;

    final class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f15661a;

        a(Handler handler) {
            this.f15661a = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f15661a.post(runnable);
        }
    }

    public h60(Handler handler) {
        this.f15660a = new a(handler);
    }

    public final void a(up1<?> up1Var, si2 si2Var) {
        up1Var.a("post-error");
        xq1 a2 = xq1.a(si2Var);
        Executor executor = this.f15660a;
        ((a) executor).f15661a.post(new b(up1Var, a2, null));
    }

    private static class b implements Runnable {
        private final up1 b;
        private final xq1 c;
        private final Runnable d;

        public b(up1 up1Var, xq1 xq1Var, Runnable runnable) {
            this.b = up1Var;
            this.c = xq1Var;
            this.d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b.n()) {
                this.b.c("canceled-at-delivery");
                return;
            }
            xq1 xq1Var = this.c;
            si2 si2Var = xq1Var.c;
            if (si2Var == null) {
                this.b.a((up1) xq1Var.f17360a);
            } else {
                this.b.a(si2Var);
            }
            if (this.c.d) {
                this.b.a("intermediate-response");
            } else {
                this.b.c("done");
            }
            Runnable runnable = this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void a(up1<?> up1Var, xq1<?> xq1Var, Runnable runnable) {
        up1Var.o();
        up1Var.a("post-response");
        Executor executor = this.f15660a;
        ((a) executor).f15661a.post(new b(up1Var, xq1Var, runnable));
    }
}
