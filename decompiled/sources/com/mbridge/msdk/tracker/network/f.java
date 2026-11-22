package com.mbridge.msdk.tracker.network;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: ExecutorDelivery.java */
/* loaded from: classes17.dex */
public class f implements w {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f12289a;

    /* compiled from: ExecutorDelivery.java */
    class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f12290a;

        a(Handler handler) {
            this.f12290a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f12290a.post(runnable);
        }
    }

    /* compiled from: ExecutorDelivery.java */
    private static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final t f12291a;
        private final v b;
        private final Runnable c;

        public b(t tVar, v vVar, Runnable runnable) {
            this.f12291a = tVar;
            this.b = vVar;
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12291a.v()) {
                this.f12291a.c("canceled-at-delivery");
                return;
            }
            if (this.b.a()) {
                this.f12291a.a((t) this.b.f12314a);
            } else {
                this.f12291a.b(this.b.c);
            }
            if (this.b.d) {
                this.f12291a.a("intermediate-response");
            } else {
                this.f12291a.c("done");
            }
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public f(Handler handler) {
        this.f12289a = new a(handler);
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, v<?> vVar) {
        a(tVar, vVar, null);
    }

    public void a(t<?> tVar, v<?> vVar, Runnable runnable) {
        tVar.w();
        tVar.a("post-response");
        this.f12289a.execute(new b(tVar, vVar, runnable));
    }

    public f(Executor executor) {
        this.f12289a = executor;
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, b0 b0Var) {
        tVar.a("post-error");
        this.f12289a.execute(new b(tVar, v.a(b0Var), null));
    }
}
