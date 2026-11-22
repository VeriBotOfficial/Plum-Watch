package com.qumeng.overseas.advlib.trdparty.unionset.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes17.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f13451a = new b();
    private static final ExecutorService b = oqm.a.b("QueueSinglePool");

    private static class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        final ArrayDeque<Runnable> f13452a;
        Runnable b;

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f13453a;

            a(Runnable runnable) {
                this.f13453a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Runnable runnable = this.f13453a;
                    if (runnable instanceof c) {
                        long j = ((c) runnable).f13454a;
                        if (j > 0) {
                            try {
                                Thread.sleep(j);
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                    }
                    this.f13453a.run();
                } finally {
                    b.this.a();
                }
            }
        }

        private b() {
            this.f13452a = new ArrayDeque<>();
        }

        protected synchronized void a() {
            Runnable poll = this.f13452a.poll();
            this.b = poll;
            if (poll != null) {
                f.b.execute(this.b);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            this.f13452a.offer(new a(runnable));
            if (this.b == null) {
                a();
            }
        }
    }

    public static abstract class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        long f13454a;

        public c(long j) {
            this.f13454a = j;
        }
    }

    public static void a(Runnable runnable) {
        f13451a.execute(runnable);
    }
}
