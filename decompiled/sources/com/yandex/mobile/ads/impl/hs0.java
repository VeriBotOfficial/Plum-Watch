package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class hs0 {
    public static final b d;
    public static final b e;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f15721a;
    private c<? extends d> b;
    private IOException c;

    public interface a<T extends d> {
        b a(T t, long j, long j2, IOException iOException, int i);

        void a(T t, long j, long j2);

        void a(T t, long j, long j2, boolean z);
    }

    public interface d {
        void a() throws IOException;

        void b();
    }

    public interface e {
        void b();
    }

    static {
        long j = -9223372036854775807L;
        d = new b(2, j);
        e = new b(3, j);
    }

    public static final class g extends IOException {
        public g(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f15722a;
        private final long b;

        private b(int i, long j) {
            this.f15722a = i;
            this.b = j;
        }

        public final boolean a() {
            int i = this.f15722a;
            return i == 0 || i == 1;
        }
    }

    public hs0(String str) {
        this.f15721a = f92.d("ExoPlayer:Loader:".concat(str));
    }

    public final boolean c() {
        return this.c != null;
    }

    public final void b() {
        this.c = null;
    }

    public final boolean d() {
        return this.b != null;
    }

    public final void a() {
        c<? extends d> cVar = this.b;
        if (cVar != null) {
            cVar.a(false);
            return;
        }
        throw new IllegalStateException();
    }

    private final class c<T extends d> extends Handler implements Runnable {
        public final int b;
        private final T c;
        private final long d;
        private a<T> e;
        private IOException f;
        private int g;
        private Thread h;
        private boolean i;
        private volatile boolean j;

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.i;
                    this.h = Thread.currentThread();
                }
                if (!z) {
                    u52.a("load:".concat(this.c.getClass().getSimpleName()));
                    try {
                        this.c.a();
                        u52.a();
                    } catch (Throwable th) {
                        u52.a();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.h = null;
                    Thread.interrupted();
                }
                if (this.j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e) {
                if (this.j) {
                    return;
                }
                obtainMessage(2, e).sendToTarget();
            } catch (Error e2) {
                if (!this.j) {
                    et0.a("LoadTask", "Unexpected error loading stream", e2);
                    obtainMessage(3, e2).sendToTarget();
                }
                throw e2;
            } catch (Exception e3) {
                if (this.j) {
                    return;
                }
                et0.a("LoadTask", "Unexpected exception loading stream", e3);
                obtainMessage(2, new g(e3)).sendToTarget();
            } catch (OutOfMemoryError e4) {
                if (this.j) {
                    return;
                }
                et0.a("LoadTask", "OutOfMemory error loading stream", e4);
                obtainMessage(2, new g(e4)).sendToTarget();
            }
        }

        public c(Looper looper, T t, a<T> aVar, int i, long j) {
            super(looper);
            this.c = t;
            this.e = aVar;
            this.b = i;
            this.d = j;
        }

        public final void a(boolean z) {
            this.j = z;
            this.f = null;
            if (hasMessages(0)) {
                this.i = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.i = true;
                    this.c.b();
                    Thread thread = this.h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                hs0.this.b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a<T> aVar = this.e;
                aVar.getClass();
                aVar.a(this.c, elapsedRealtime, elapsedRealtime - this.d, true);
                this.e = null;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.j) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                this.f = null;
                hs0 hs0Var = hs0.this;
                ExecutorService executorService = hs0Var.f15721a;
                c cVar = hs0Var.b;
                cVar.getClass();
                executorService.execute(cVar);
                return;
            }
            if (i != 3) {
                hs0.this.b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.d;
                a<T> aVar = this.e;
                aVar.getClass();
                if (this.i) {
                    aVar.a(this.c, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    try {
                        aVar.a(this.c, elapsedRealtime, j);
                        return;
                    } catch (RuntimeException e) {
                        et0.a("LoadTask", "Unexpected exception handling load completed", e);
                        hs0.this.c = new g(e);
                        return;
                    }
                }
                if (i2 != 2) {
                    return;
                }
                IOException iOException = (IOException) message.obj;
                this.f = iOException;
                int i3 = this.g + 1;
                this.g = i3;
                b a2 = aVar.a(this.c, elapsedRealtime, j, iOException, i3);
                int i4 = a2.f15722a;
                if (i4 == 3) {
                    hs0.this.c = this.f;
                    return;
                }
                if (i4 != 2) {
                    if (i4 == 1) {
                        this.g = 1;
                    }
                    long j2 = a2.b;
                    if (j2 == -9223372036854775807L) {
                        j2 = Math.min((this.g - 1) * 1000, 5000);
                    }
                    hs0 hs0Var2 = hs0.this;
                    if (hs0Var2.b == null) {
                        hs0Var2.b = this;
                        if (j2 > 0) {
                            sendEmptyMessageDelayed(0, j2);
                            return;
                        } else {
                            this.f = null;
                            hs0Var2.f15721a.execute(this);
                            return;
                        }
                    }
                    throw new IllegalStateException();
                }
                return;
            }
            throw ((Error) message.obj);
        }
    }

    private static final class f implements Runnable {
        private final e b;

        public f(e eVar) {
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.b();
        }
    }

    public final void a(int i) throws IOException {
        IOException iOException = this.c;
        if (iOException == null) {
            c<? extends d> cVar = this.b;
            if (cVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = cVar.b;
                }
                IOException iOException2 = ((c) cVar).f;
                if (iOException2 != null && ((c) cVar).g > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void a(e eVar) {
        c<? extends d> cVar = this.b;
        if (cVar != null) {
            cVar.a(true);
        }
        if (eVar != null) {
            this.f15721a.execute(new f(eVar));
        }
        this.f15721a.shutdown();
    }

    public static b a(long j, boolean z) {
        return new b(z ? 1 : 0, j);
    }

    public final <T extends d> long a(T t, a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            this.c = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c<? extends d> cVar = new c<>(myLooper, t, aVar, i, elapsedRealtime);
            if (this.b == null) {
                this.b = cVar;
                ((c) cVar).f = null;
                this.f15721a.execute(cVar);
                return elapsedRealtime;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }
}
