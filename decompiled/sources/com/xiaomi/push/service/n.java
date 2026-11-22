package com.xiaomi.push.service;

import android.os.SystemClock;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes4.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static long f14790a;
    private static long b;
    private static long c;

    /* renamed from: a, reason: collision with other field name */
    private final a f1072a;

    /* renamed from: a, reason: collision with other field name */
    private final c f1073a;

    public static abstract class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        protected int f14792a;

        public b(int i) {
            this.f14792a = i;
        }
    }

    static {
        long elapsedRealtime = SystemClock.elapsedRealtime() > 0 ? SystemClock.elapsedRealtime() : 0L;
        f14790a = elapsedRealtime;
        b = elapsedRealtime;
    }

    static synchronized long a() {
        long j;
        synchronized (n.class) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = b;
            if (elapsedRealtime > j2) {
                f14790a += elapsedRealtime - j2;
            }
            b = elapsedRealtime;
            j = f14790a;
        }
        return j;
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        int f14795a;

        /* renamed from: a, reason: collision with other field name */
        long f1078a;

        /* renamed from: a, reason: collision with other field name */
        b f1079a;

        /* renamed from: a, reason: collision with other field name */
        final Object f1080a = new Object();

        /* renamed from: a, reason: collision with other field name */
        boolean f1081a;
        private long b;

        d() {
        }

        void a(long j) {
            synchronized (this.f1080a) {
                this.b = j;
            }
        }

        public boolean a() {
            boolean z;
            synchronized (this.f1080a) {
                z = !this.f1081a && this.f1078a > 0;
                this.f1081a = true;
            }
            return z;
        }
    }

    private static final class c extends Thread {

        /* renamed from: b, reason: collision with other field name */
        private boolean f1076b;
        private boolean c;

        /* renamed from: a, reason: collision with root package name */
        private volatile long f14793a = 0;

        /* renamed from: a, reason: collision with other field name */
        private volatile boolean f1075a = false;
        private long b = 50;

        /* renamed from: a, reason: collision with other field name */
        private a f1074a = new a();

        private static final class a {

            /* renamed from: a, reason: collision with root package name */
            private int f14794a;

            /* renamed from: a, reason: collision with other field name */
            private d[] f1077a;
            private int b;
            private int c;

            private a() {
                this.f14794a = 256;
                this.f1077a = new d[256];
                this.b = 0;
                this.c = 0;
            }

            public d a() {
                return this.f1077a[0];
            }

            /* renamed from: a, reason: collision with other method in class */
            public boolean m12472a() {
                return this.b == 0;
            }

            /* renamed from: a, reason: collision with other method in class */
            public void m12471a(d dVar) {
                d[] dVarArr = this.f1077a;
                int length = dVarArr.length;
                int i = this.b;
                if (length == i) {
                    d[] dVarArr2 = new d[i * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, i);
                    this.f1077a = dVarArr2;
                }
                d[] dVarArr3 = this.f1077a;
                int i2 = this.b;
                this.b = i2 + 1;
                dVarArr3[i2] = dVar;
                c();
            }

            /* renamed from: a, reason: collision with other method in class */
            public boolean m12473a(int i) {
                for (int i2 = 0; i2 < this.b; i2++) {
                    if (this.f1077a[i2].f14795a == i) {
                        return true;
                    }
                }
                return false;
            }

            public void a(int i) {
                for (int i2 = 0; i2 < this.b; i2++) {
                    if (this.f1077a[i2].f14795a == i) {
                        this.f1077a[i2].a();
                    }
                }
                b();
            }

            public void a(int i, b bVar) {
                for (int i2 = 0; i2 < this.b; i2++) {
                    if (this.f1077a[i2].f1079a == bVar) {
                        this.f1077a[i2].a();
                    }
                }
                b();
            }

            public void b(int i) {
                int i2;
                if (i < 0 || i >= (i2 = this.b)) {
                    return;
                }
                d[] dVarArr = this.f1077a;
                int i3 = i2 - 1;
                this.b = i3;
                dVarArr[i] = dVarArr[i3];
                dVarArr[i3] = null;
                c(i);
            }

            private void c() {
                int i = this.b;
                int i2 = i - 1;
                for (int i3 = (i - 2) / 2; this.f1077a[i2].f1078a < this.f1077a[i3].f1078a; i3 = (i3 - 1) / 2) {
                    d[] dVarArr = this.f1077a;
                    d dVar = dVarArr[i2];
                    dVarArr[i2] = dVarArr[i3];
                    dVarArr[i3] = dVar;
                    i2 = i3;
                }
            }

            private void c(int i) {
                int i2 = (i * 2) + 1;
                while (true) {
                    int i3 = this.b;
                    if (i2 >= i3 || i3 <= 0) {
                        return;
                    }
                    int i4 = i2 + 1;
                    if (i4 < i3 && this.f1077a[i4].f1078a < this.f1077a[i2].f1078a) {
                        i2 = i4;
                    }
                    if (this.f1077a[i].f1078a < this.f1077a[i2].f1078a) {
                        return;
                    }
                    d[] dVarArr = this.f1077a;
                    d dVar = dVarArr[i];
                    dVarArr[i] = dVarArr[i2];
                    dVarArr[i2] = dVar;
                    int i5 = i2;
                    i2 = (i2 * 2) + 1;
                    i = i5;
                }
            }

            /* renamed from: a, reason: collision with other method in class */
            public void m12470a() {
                this.f1077a = new d[this.f14794a];
                this.b = 0;
            }

            public void b() {
                int i = 0;
                while (i < this.b) {
                    if (this.f1077a[i].f1081a) {
                        this.c++;
                        b(i);
                        i--;
                    }
                    i++;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int a(d dVar) {
                int i = 0;
                while (true) {
                    d[] dVarArr = this.f1077a;
                    if (i >= dVarArr.length) {
                        return -1;
                    }
                    if (dVarArr[i] == dVar) {
                        return i;
                    }
                    i++;
                }
            }
        }

        c(String str, boolean z) {
            setName(str);
            setDaemon(z);
            start();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
        
            r10.f14793a = android.os.SystemClock.uptimeMillis();
            r10.f1075a = true;
            r2.f1079a.run();
            r10.f1075a = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
        
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
        
            r10.f1076b = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:
        
            throw r1;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 181
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.n.c.run():void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(d dVar) {
            this.f1074a.m12471a(dVar);
            notify();
        }

        public synchronized void a() {
            this.f1076b = true;
            this.f1074a.m12470a();
            notify();
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m12469a() {
            return this.f1075a && SystemClock.uptimeMillis() - this.f14793a > 600000;
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c f14791a;

        a(c cVar) {
            this.f14791a = cVar;
        }

        protected void finalize() {
            try {
                synchronized (this.f14791a) {
                    this.f14791a.c = true;
                    this.f14791a.notify();
                }
            } finally {
                super.finalize();
            }
        }
    }

    private static synchronized long b() {
        long j;
        synchronized (n.class) {
            j = c;
            c = 1 + j;
        }
        return j;
    }

    public n(String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        c cVar = new c(str, z);
        this.f1073a = cVar;
        this.f1072a = new a(cVar);
    }

    public n(String str) {
        this(str, false);
    }

    public n(boolean z) {
        this("Timer-" + b(), z);
    }

    public n() {
        this(false);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12464a() {
        com.xiaomi.channel.commonutils.logger.b.m11781a("quit. finalizer:" + this.f1072a);
        this.f1073a.a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12466a(int i) {
        boolean m12473a;
        synchronized (this.f1073a) {
            m12473a = this.f1073a.f1074a.m12473a(i);
        }
        return m12473a;
    }

    public void a(int i) {
        synchronized (this.f1073a) {
            this.f1073a.f1074a.a(i);
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m12467b() {
        synchronized (this.f1073a) {
            this.f1073a.f1074a.m12470a();
        }
    }

    public void a(int i, b bVar) {
        synchronized (this.f1073a) {
            this.f1073a.f1074a.a(i, bVar);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12465a() {
        return this.f1073a.m12469a();
    }

    public void a(b bVar) {
        if (com.xiaomi.channel.commonutils.logger.b.a() < 1 && Thread.currentThread() != this.f1073a) {
            com.xiaomi.channel.commonutils.logger.b.d("run job outside job job thread");
            throw new RejectedExecutionException("Run job outside job thread");
        }
        bVar.run();
    }

    public void a(b bVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("delay < 0: " + j);
        }
        b(bVar, j);
    }

    private void b(b bVar, long j) {
        synchronized (this.f1073a) {
            if (this.f1073a.f1076b) {
                throw new IllegalStateException("Timer was canceled");
            }
            long a2 = j + a();
            if (a2 < 0) {
                throw new IllegalArgumentException("Illegal delay to start the TimerTask: " + a2);
            }
            d dVar = new d();
            dVar.f14795a = bVar.f14792a;
            dVar.f1079a = bVar;
            dVar.f1078a = a2;
            this.f1073a.a(dVar);
        }
    }
}
