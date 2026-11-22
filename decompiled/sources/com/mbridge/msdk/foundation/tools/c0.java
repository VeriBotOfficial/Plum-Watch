package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* compiled from: LimitExecutor.java */
/* loaded from: classes17.dex */
public class c0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private Runnable f11655a;
    private Runnable b;

    /* compiled from: LimitExecutor.java */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f11656a;

        a(Runnable runnable) {
            this.f11656a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f11656a.run();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("LimitExecutor", e.getMessage());
                }
            } finally {
                c0.this.a();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        if (this.f11655a == null) {
            this.f11655a = a(runnable);
            a0.a().execute(this.f11655a);
        } else if (this.b == null) {
            this.b = a(runnable);
        }
    }

    private Runnable a(Runnable runnable) {
        return new a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Runnable runnable = this.b;
        this.f11655a = runnable;
        this.b = null;
        if (runnable != null) {
            a0.a().execute(this.f11655a);
        }
    }
}
