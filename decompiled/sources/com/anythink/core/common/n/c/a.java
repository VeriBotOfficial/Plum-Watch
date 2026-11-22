package com.anythink.core.common.n.c;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public class a extends x {

    /* renamed from: a, reason: collision with root package name */
    private static final int f4214a = 65536;
    static a b;
    private static final long d;
    private static final long e;
    private boolean f;
    private a g;
    private long h;

    protected void a() {
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        d = millis;
        e = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void c() {
        if (this.f) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long i_ = i_();
        boolean f_ = f_();
        if (i_ != 0 || f_) {
            this.f = true;
            a(this, i_, f_);
        }
    }

    private static synchronized void a(a aVar, long j, boolean z) {
        a aVar2;
        synchronized (a.class) {
            if (b == null) {
                b = new a();
                new C0206a().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                aVar.h = Math.min(j, aVar.g_() - nanoTime) + nanoTime;
            } else if (j != 0) {
                aVar.h = j + nanoTime;
            } else if (z) {
                aVar.h = aVar.g_();
            } else {
                throw new AssertionError();
            }
            long j2 = aVar.h - nanoTime;
            a aVar3 = b;
            while (true) {
                aVar2 = aVar3.g;
                if (aVar2 == null || j2 < aVar2.h - nanoTime) {
                    break;
                } else {
                    aVar3 = aVar2;
                }
            }
            aVar.g = aVar2;
            aVar3.g = aVar;
            if (aVar3 == b) {
                a.class.notify();
            }
        }
    }

    public final boolean d() {
        if (!this.f) {
            return false;
        }
        this.f = false;
        return a(this);
    }

    private static synchronized boolean a(a aVar) {
        synchronized (a.class) {
            a aVar2 = b;
            while (aVar2 != null) {
                a aVar3 = aVar2.g;
                if (aVar3 == aVar) {
                    aVar2.g = aVar.g;
                    aVar.g = null;
                    return false;
                }
                aVar2 = aVar3;
            }
            return true;
        }
    }

    private long b(long j) {
        return this.h - j;
    }

    /* renamed from: com.anythink.core.common.n.c.a$1, reason: invalid class name */
    final class AnonymousClass1 implements v {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f4215a;

        AnonymousClass1(v vVar) {
            this.f4215a = vVar;
        }

        @Override // com.anythink.core.common.n.c.v
        public final void a(c cVar, long j) {
            y.a(cVar.c, 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                s sVar = cVar.b;
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += sVar.e - sVar.d;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    sVar = sVar.h;
                }
                a.this.c();
                try {
                    try {
                        this.f4215a.a(cVar, j2);
                        j -= j2;
                        a.this.a(true);
                    } catch (IOException e) {
                        throw a.this.b(e);
                    }
                } catch (Throwable th) {
                    a.this.a(false);
                    throw th;
                }
            }
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Flushable
        public final void flush() {
            a.this.c();
            try {
                try {
                    this.f4215a.flush();
                    a.this.a(true);
                } catch (IOException e) {
                    throw a.this.b(e);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            a.this.c();
            try {
                try {
                    this.f4215a.close();
                    a.this.a(true);
                } catch (IOException e) {
                    throw a.this.b(e);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // com.anythink.core.common.n.c.v
        public final x a() {
            return a.this;
        }

        public final String toString() {
            return "AsyncTimeout.sink(" + this.f4215a + Separators.RPAREN;
        }
    }

    private v a(v vVar) {
        return new AnonymousClass1(vVar);
    }

    /* renamed from: com.anythink.core.common.n.c.a$2, reason: invalid class name */
    final class AnonymousClass2 implements w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f4216a;

        AnonymousClass2(w wVar) {
            this.f4216a = wVar;
        }

        @Override // com.anythink.core.common.n.c.w
        public final long a_(c cVar, long j) {
            a.this.c();
            try {
                try {
                    long a_ = this.f4216a.a_(cVar, j);
                    a.this.a(true);
                    return a_;
                } catch (IOException e) {
                    throw a.this.b(e);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            a.this.c();
            try {
                try {
                    this.f4216a.close();
                    a.this.a(true);
                } catch (IOException e) {
                    throw a.this.b(e);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // com.anythink.core.common.n.c.w
        public final x a() {
            return a.this;
        }

        public final String toString() {
            return "AsyncTimeout.source(" + this.f4216a + Separators.RPAREN;
        }
    }

    private w a(w wVar) {
        return new AnonymousClass2(wVar);
    }

    final void a(boolean z) {
        if (d() && z) {
            throw a((IOException) null);
        }
    }

    final IOException b(IOException iOException) {
        return !d() ? iOException : a(iOException);
    }

    protected IOException a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: com.anythink.core.common.n.c.a$a, reason: collision with other inner class name */
    private static final class C0206a extends Thread {
        C0206a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0015, code lost:
        
            r1.a();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<com.anythink.core.common.n.c.a> r0 = com.anythink.core.common.n.c.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                com.anythink.core.common.n.c.a r1 = com.anythink.core.common.n.c.a.e()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                com.anythink.core.common.n.c.a r2 = com.anythink.core.common.n.c.a.b     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                com.anythink.core.common.n.c.a.b = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.InterruptedException -> L0
                r1.a()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.InterruptedException -> L0
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.n.c.a.C0206a.run():void");
        }
    }

    static a e() {
        a aVar = b.g;
        if (aVar == null) {
            long nanoTime = System.nanoTime();
            a.class.wait(d);
            if (b.g != null || System.nanoTime() - nanoTime < e) {
                return null;
            }
            return b;
        }
        long nanoTime2 = aVar.h - System.nanoTime();
        if (nanoTime2 > 0) {
            long j = nanoTime2 / 1000000;
            a.class.wait(j, (int) (nanoTime2 - (1000000 * j)));
            return null;
        }
        b.g = aVar.g;
        aVar.g = null;
        return aVar;
    }
}
