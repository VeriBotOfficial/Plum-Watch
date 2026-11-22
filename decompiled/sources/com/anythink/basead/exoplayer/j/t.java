package com.anythink.basead.exoplayer.j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.anythink.basead.exoplayer.k.ad;
import com.anythink.basead.exoplayer.k.af;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* loaded from: classes11.dex */
public final class t implements u {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2653a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    private final ExecutorService e;
    private b<? extends c> f;
    private IOException g;

    public interface a<T extends c> {
        int a(T t, long j, long j2, IOException iOException);

        void a(T t, long j, long j2);

        void a(T t, long j, long j2, boolean z);
    }

    public interface c {
        void a();

        void b();
    }

    public interface d {
        void g();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    public static final class g extends IOException {
        public g(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public t(String str) {
        this.e = af.a(str);
    }

    public final <T extends c> long a(T t, a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        com.anythink.basead.exoplayer.k.a.b(myLooper != null);
        this.g = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new b(myLooper, t, aVar, i, elapsedRealtime).a(0L);
        return elapsedRealtime;
    }

    public final boolean a() {
        return this.f != null;
    }

    public final void b() {
        this.f.a(false);
    }

    private void d() {
        a((d) null);
    }

    public final void a(d dVar) {
        b<? extends c> bVar = this.f;
        if (bVar != null) {
            bVar.a(true);
        }
        if (dVar != null) {
            this.e.execute(new e(dVar));
        }
        this.e.shutdown();
    }

    @Override // com.anythink.basead.exoplayer.j.u
    public final void c() {
        a(Integer.MIN_VALUE);
    }

    @Override // com.anythink.basead.exoplayer.j.u
    public final void a(int i) {
        IOException iOException = this.g;
        if (iOException != null) {
            throw iOException;
        }
        b<? extends c> bVar = this.f;
        if (bVar != null) {
            if (i == Integer.MIN_VALUE) {
                i = bVar.f2654a;
            }
            bVar.a(i);
        }
    }

    private final class b<T extends c> extends Handler implements Runnable {
        private static final String c = "LoadTask";
        private static final int d = 0;
        private static final int e = 1;
        private static final int f = 2;
        private static final int g = 3;
        private static final int h = 4;

        /* renamed from: a, reason: collision with root package name */
        public final int f2654a;
        private final T i;
        private final long j;
        private a<T> k;
        private IOException l;
        private int m;
        private volatile Thread n;
        private volatile boolean o;
        private volatile boolean p;

        public b(Looper looper, T t, a<T> aVar, int i, long j) {
            super(looper);
            this.i = t;
            this.k = aVar;
            this.f2654a = i;
            this.j = j;
        }

        public final void a(int i) {
            IOException iOException = this.l;
            if (iOException != null && this.m > i) {
                throw iOException;
            }
        }

        public final void a(long j) {
            com.anythink.basead.exoplayer.k.a.b(t.this.f == null);
            t.this.f = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                a();
            }
        }

        public final void a(boolean z) {
            this.p = z;
            this.l = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.o = true;
                this.i.a();
                if (this.n != null) {
                    this.n.interrupt();
                }
            }
            if (z) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.k.a((a<T>) this.i, elapsedRealtime, elapsedRealtime - this.j, true);
                this.k = null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.n = Thread.currentThread();
                if (!this.o) {
                    ad.a("load:" + this.i.getClass().getSimpleName());
                    try {
                        this.i.b();
                        ad.a();
                    } catch (Throwable th) {
                        ad.a();
                        throw th;
                    }
                }
                if (this.p) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e2) {
                if (this.p) {
                    return;
                }
                obtainMessage(3, e2).sendToTarget();
            } catch (Error e3) {
                Log.e(c, "Unexpected error loading stream", e3);
                if (!this.p) {
                    obtainMessage(4, e3).sendToTarget();
                }
                throw e3;
            } catch (InterruptedException unused) {
                com.anythink.basead.exoplayer.k.a.b(this.o);
                if (this.p) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (Exception e4) {
                Log.e(c, "Unexpected exception loading stream", e4);
                if (this.p) {
                    return;
                }
                obtainMessage(3, new g(e4)).sendToTarget();
            } catch (OutOfMemoryError e5) {
                Log.e(c, "OutOfMemory error loading stream", e5);
                if (this.p) {
                    return;
                }
                obtainMessage(3, new g(e5)).sendToTarget();
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.p) {
                return;
            }
            if (message.what == 0) {
                a();
                return;
            }
            if (message.what == 4) {
                throw ((Error) message.obj);
            }
            b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.j;
            if (this.o) {
                this.k.a((a<T>) this.i, elapsedRealtime, j, false);
                return;
            }
            int i = message.what;
            if (i == 1) {
                this.k.a((a<T>) this.i, elapsedRealtime, j, false);
                return;
            }
            if (i == 2) {
                try {
                    this.k.a(this.i, elapsedRealtime, j);
                    return;
                } catch (RuntimeException e2) {
                    Log.e(c, "Unexpected exception handling load completed", e2);
                    t.this.g = new g(e2);
                    return;
                }
            }
            if (i != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.l = iOException;
            int a2 = this.k.a((a<T>) this.i, elapsedRealtime, j, iOException);
            if (a2 == 3) {
                t.this.g = this.l;
            } else if (a2 != 2) {
                this.m = a2 == 1 ? 1 : this.m + 1;
                a(Math.min((r12 - 1) * 1000, 5000));
            }
        }

        private void a() {
            this.l = null;
            t.this.e.execute(t.this.f);
        }

        private void b() {
            t.this.f = null;
        }

        private long c() {
            return Math.min((this.m - 1) * 1000, 5000);
        }
    }

    private static final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final d f2655a;

        public e(d dVar) {
            this.f2655a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f2655a.g();
        }
    }
}
