package com.amap.api.col.p0003sl;

import android.content.Context;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SDKLogHandler.java */
/* loaded from: classes11.dex */
public class ja extends fa implements Thread.UncaughtExceptionHandler {
    private static ExecutorService e;
    private static WeakReference<Context> g;
    public static final /* synthetic */ int i = 0;
    private Context d;
    private static Set<Integer> f = Collections.synchronizedSet(new HashSet());
    private static final ThreadFactory h = new a();

    /* compiled from: SDKLogHandler.java */
    static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f1714a = new AtomicInteger(1);

        /* compiled from: SDKLogHandler.java */
        /* renamed from: com.amap.api.col.3sl.ja$a$a, reason: collision with other inner class name */
        final class C0110a extends Thread {
            C0110a(a aVar, Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                try {
                    super.run();
                } catch (Throwable unused) {
                }
            }
        }

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new C0110a(this, runnable, "pama#" + this.f1714a.getAndIncrement());
        }
    }

    private ja(Context context) {
        this.d = context;
        try {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            this.f1653a = defaultUncaughtExceptionHandler;
            if (defaultUncaughtExceptionHandler == null) {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.b = true;
                return;
            }
            String obj = defaultUncaughtExceptionHandler.toString();
            if (!obj.startsWith("com.amap.apis.utils.core.dynamiccore") && (obj.indexOf("com.amap.api") != -1 || obj.indexOf("com.loc") != -1)) {
                this.b = false;
            } else {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.b = true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:9:0x0012, B:11:0x0016, B:13:0x001e, B:15:0x0022, B:16:0x0025), top: B:8:0x0012, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void c() {
        /*
            java.lang.Class<com.amap.api.col.3sl.ja> r0 = com.amap.api.col.p0003sl.ja.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = com.amap.api.col.p0003sl.ja.e     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto La
            r1.shutdown()     // Catch: java.lang.Throwable -> Le
        La:
            com.amap.api.col.p0003sl.eb.d()     // Catch: java.lang.Throwable -> Le
            goto L12
        Le:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L30
        L12:
            com.amap.api.col.3sl.fa r1 = com.amap.api.col.p0003sl.fa.c     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L25
            java.lang.Thread$UncaughtExceptionHandler r1 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L2a
            com.amap.api.col.3sl.fa r2 = com.amap.api.col.p0003sl.fa.c     // Catch: java.lang.Throwable -> L2a
            if (r1 != r2) goto L25
            java.lang.Thread$UncaughtExceptionHandler r1 = r2.f1653a     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L25
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)     // Catch: java.lang.Throwable -> L2a
        L25:
            r1 = 0
            com.amap.api.col.p0003sl.fa.c = r1     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)
            return
        L2a:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)
            return
        L30:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.ja.c():void");
    }

    public static void d() {
        WeakReference<Context> weakReference = g;
        if (weakReference != null && weakReference.get() != null) {
            ga.a(g.get());
            return;
        }
        fa faVar = fa.c;
        if (faVar != null) {
            ga.a(((ja) faVar).d);
        }
    }

    public void b(Throwable th, String str, String str2) {
        if (th == null) {
            return;
        }
        try {
            ka.a(this.d, th, 1, str, str2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (th == null) {
            return;
        }
        ka.a(this.d, th, 0, (String) null, (String) null);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f1653a;
        if (uncaughtExceptionHandler != null) {
            try {
                Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
            } catch (Throwable unused) {
            }
            this.f1653a.uncaughtException(thread, th);
        }
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            g = new WeakReference<>(context.getApplicationContext());
        } catch (Throwable unused) {
        }
    }

    public static synchronized ja a(Context context, l9 l9Var) throws y8 {
        synchronized (ja.class) {
            if (l9Var != null) {
                if (l9Var.d() != null && !"".equals(l9Var.d())) {
                    try {
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    if (!f.add(Integer.valueOf(l9Var.hashCode()))) {
                        return (ja) fa.c;
                    }
                    fa faVar = fa.c;
                    if (faVar == null) {
                        fa.c = new ja(context);
                    } else {
                        faVar.b = false;
                    }
                    fa faVar2 = fa.c;
                    boolean z = faVar2.b;
                    ja jaVar = (ja) faVar2;
                    jaVar.getClass();
                    try {
                        pc.d().b(new ia(jaVar, l9Var, z));
                    } catch (RejectedExecutionException unused) {
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    return (ja) fa.c;
                }
                throw new y8("sdk name is invalid");
            }
            throw new y8("sdk info is null");
        }
    }

    @Deprecated
    public static synchronized ExecutorService b() {
        ExecutorService executorService;
        synchronized (ja.class) {
            try {
                ExecutorService executorService2 = e;
                if (executorService2 == null || executorService2.isShutdown()) {
                    e = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256), h);
                }
            } catch (Throwable unused) {
            }
            executorService = e;
        }
        return executorService;
    }

    @Override // com.amap.api.col.p0003sl.fa
    protected final void a(Throwable th, int i2, String str, String str2) {
        ka.a(this.d, th, i2, str, str2);
    }

    public static void a(Throwable th, String str, String str2) {
        try {
            fa faVar = fa.c;
            if (faVar != null) {
                faVar.a(th, 1, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(l9 l9Var, String str, String str2, String str3, String str4, String str5) {
        try {
            if (fa.c != null) {
                StringBuilder sb = new StringBuilder("path:");
                sb.append(str).append(",type:").append(str2).append(",gsid:").append(str3).append(",csid:").append(str4).append(",code:").append(str5);
                fa faVar = fa.c;
                ka.a(l9Var, ((ja) faVar).d, "networkError", sb.toString());
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(l9 l9Var, String str, String str2) {
        try {
            fa faVar = fa.c;
            if (faVar != null) {
                ka.a(l9Var, ((ja) faVar).d, str2, str);
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized ja a() {
        ja jaVar;
        synchronized (ja.class) {
            jaVar = (ja) fa.c;
        }
        return jaVar;
    }
}
