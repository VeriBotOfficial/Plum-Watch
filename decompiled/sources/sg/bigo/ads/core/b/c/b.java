package sg.bigo.ads.core.b.c;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.n.c;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static Handler f19965a;
    private static final ExecutorService b = Executors.newFixedThreadPool(1, new c("Callback-Worker"));

    static class a extends AbstractRunnableC1100b {
        private Future c;

        a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.core.b.c.b.AbstractRunnableC1100b
        protected final void a() {
            if (this.f19967a != null) {
                this.c = b.a(this.f19967a);
            }
        }
    }

    /* renamed from: sg.bigo.ads.core.b.c.b$b, reason: collision with other inner class name */
    public static abstract class AbstractRunnableC1100b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f19967a;
        final AtomicBoolean b = new AtomicBoolean(false);

        AbstractRunnableC1100b(Runnable runnable) {
            this.f19967a = runnable;
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
        HandlerThread handlerThread = new HandlerThread("BGAd-Callback-Handler");
        handlerThread.start();
        f19965a = new Handler(handlerThread.getLooper());
    }

    public static Future<?> a(final Runnable runnable) {
        return b.submit(new Runnable() { // from class: sg.bigo.ads.core.b.c.b.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb;
                String localizedMessage;
                try {
                    runnable.run();
                } catch (Exception e) {
                    sb = new StringBuilder("callback thread get exception:");
                    localizedMessage = e.getLocalizedMessage();
                    sg.bigo.ads.core.b.c.a.a(sb.append(localizedMessage).toString());
                } catch (Throwable th) {
                    sb = new StringBuilder("callback thread get throwable:");
                    localizedMessage = th.getLocalizedMessage();
                    sg.bigo.ads.core.b.c.a.a(sb.append(localizedMessage).toString());
                }
            }
        });
    }

    public static AbstractRunnableC1100b a(Runnable runnable, long j) {
        a aVar = new a(runnable);
        f19965a.postDelayed(aVar, j);
        return aVar;
    }

    public static void a(AbstractRunnableC1100b abstractRunnableC1100b) {
        Future future;
        if (abstractRunnableC1100b != null) {
            abstractRunnableC1100b.b.set(true);
            if (abstractRunnableC1100b instanceof a) {
                a aVar = (a) abstractRunnableC1100b;
                if (aVar.c != null && (future = aVar.c) != null && !future.isCancelled() && !future.isDone()) {
                    future.cancel(true);
                }
            }
            f19965a.removeCallbacks(abstractRunnableC1100b);
        }
    }
}
