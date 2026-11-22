package sg.bigo.ads.core.d.c;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.n.c;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static Handler f19992a;
    private static ExecutorService b = Executors.newFixedThreadPool(1, new c("Stat-Worker"));

    /* renamed from: sg.bigo.ads.core.d.c.a$a, reason: collision with other inner class name */
    static class C1103a extends b {
        private Future c;

        C1103a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.core.d.c.a.b
        protected final void a() {
            if (this.f19994a != null) {
                this.c = a.a(this.f19994a);
            }
        }
    }

    public static abstract class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f19994a;
        final AtomicBoolean b = new AtomicBoolean(false);

        b(Runnable runnable) {
            this.f19994a = runnable;
        }

        protected abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b.get()) {
                return;
            }
            a();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BGAd-Stat-Handler");
        handlerThread.start();
        f19992a = new Handler(handlerThread.getLooper());
    }

    public static Future a(final Runnable runnable) {
        return b.submit(new Runnable() { // from class: sg.bigo.ads.core.d.c.a.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb;
                String localizedMessage;
                try {
                    runnable.run();
                } catch (Exception e) {
                    sb = new StringBuilder("stat thread get exception:");
                    localizedMessage = e.getLocalizedMessage();
                    sg.bigo.ads.common.t.a.a(0, "Stats", sb.append(localizedMessage).toString());
                } catch (Throwable th) {
                    sb = new StringBuilder("stat thread get throwable:");
                    localizedMessage = th.getLocalizedMessage();
                    sg.bigo.ads.common.t.a.a(0, "Stats", sb.append(localizedMessage).toString());
                }
            }
        });
    }

    public static b a(Runnable runnable, long j) {
        C1103a c1103a = new C1103a(runnable);
        f19992a.postDelayed(c1103a, j);
        return c1103a;
    }

    public static void a(b bVar) {
        Future future;
        if (bVar != null) {
            bVar.b.set(true);
            if (bVar instanceof C1103a) {
                C1103a c1103a = (C1103a) bVar;
                if (c1103a.c != null && (future = c1103a.c) != null && !future.isCancelled() && !future.isDone()) {
                    future.cancel(true);
                }
            }
            f19992a.removeCallbacks(bVar);
        }
    }
}
