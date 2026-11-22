package sg.bigo.ads.common.n;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import sg.bigo.ads.common.utils.t;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static List<sg.bigo.ads.common.n.a> f19652a;
    private static HandlerThread b;
    private static b c;
    private static HandlerThread d;
    private static b e;
    private static HandlerThread f;
    private static b g;
    private static b h;
    private static b i;
    private static final WeakHashMap<Object, a> j = new WeakHashMap<>();
    private static boolean k = false;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f19659a;
        final Integer b;

        public a(Runnable runnable, Integer num) {
            this.f19659a = runnable;
            this.b = num;
        }
    }

    static {
        t.a();
    }

    public static void a(int i2, Runnable runnable) {
        b(i2, runnable, 0L);
    }

    public static void a(int i2, Runnable runnable, long j2) {
        b(i2, runnable, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0033, code lost:
    
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void a(java.lang.Runnable r5) {
        /*
            java.lang.Class<sg.bigo.ads.common.n.d> r0 = sg.bigo.ads.common.n.d.class
            monitor-enter(r0)
            if (r5 != 0) goto L7
            monitor-exit(r0)
            return
        L7:
            java.util.WeakHashMap<java.lang.Object, sg.bigo.ads.common.n.d$a> r1 = sg.bigo.ads.common.n.d.j     // Catch: java.lang.Throwable -> L54
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L54
            sg.bigo.ads.common.n.d$a r2 = (sg.bigo.ads.common.n.d.a) r2     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L13
            monitor-exit(r0)
            return
        L13:
            java.lang.Runnable r3 = r2.f19659a     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L52
            java.lang.Integer r2 = r2.b     // Catch: java.lang.Throwable -> L54
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L43
            r4 = 1
            if (r2 == r4) goto L3e
            r4 = 2
            if (r2 == r4) goto L39
            r4 = 3
            if (r2 == r4) goto L31
            r4 = 1024(0x400, float:1.435E-42)
            if (r2 == r4) goto L2d
            goto L48
        L2d:
            r3.run()     // Catch: java.lang.Throwable -> L54
            goto L48
        L31:
            sg.bigo.ads.common.n.b r2 = sg.bigo.ads.common.n.d.g     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L48
        L35:
            r2.removeCallbacks(r3)     // Catch: java.lang.Throwable -> L54
            goto L48
        L39:
            sg.bigo.ads.common.n.b r2 = sg.bigo.ads.common.n.d.h     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L48
            goto L35
        L3e:
            sg.bigo.ads.common.n.b r2 = sg.bigo.ads.common.n.d.e     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L48
            goto L35
        L43:
            sg.bigo.ads.common.n.b r2 = sg.bigo.ads.common.n.d.c     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L48
            goto L35
        L48:
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L54
            r1.remove(r5)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)
            return
        L4f:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            throw r5     // Catch: java.lang.Throwable -> L54
        L52:
            monitor-exit(r0)
            return
        L54:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.n.d.a(java.lang.Runnable):void");
    }

    public static synchronized void a(sg.bigo.ads.common.n.a aVar) {
        synchronized (d.class) {
            if (f19652a == null) {
                f19652a = new ArrayList();
            }
            f19652a.add(aVar);
        }
    }

    public static boolean a() {
        return d == Thread.currentThread();
    }

    private static synchronized void b(int i2, final Runnable runnable, long j2) {
        final b bVar;
        synchronized (d.class) {
            if (runnable == null) {
                return;
            }
            if (h == null) {
                j();
            }
            if (i2 == 0) {
                if (b == null) {
                    g();
                }
                bVar = c;
            } else if (i2 == 1) {
                if (d == null) {
                    h();
                }
                bVar = e;
            } else if (i2 != 3) {
                bVar = h;
            } else {
                if (f == null) {
                    i();
                }
                bVar = g;
            }
            if (bVar == null) {
                return;
            }
            final Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                myLooper = h.getLooper();
            }
            final Runnable runnable2 = new Runnable() { // from class: sg.bigo.ads.common.n.d.1
                final /* synthetic */ Runnable b = null;
                final /* synthetic */ boolean c = false;

                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable3 = d.i != null ? new Runnable() { // from class: sg.bigo.ads.common.n.d.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.h.post(new Runnable() { // from class: sg.bigo.ads.common.n.d.1.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    sg.bigo.ads.common.t.a.a(0, "ThreadManager", "这里使用了ThreadManager.post函数运行了一个超过30s的任务");
                                }
                            });
                        }
                    } : null;
                    if (d.i != null) {
                        d.i.postDelayed(runnable3, 30000L);
                    }
                    synchronized (d.j) {
                        d.j.remove(runnable);
                    }
                    if (d.k) {
                        runnable.run();
                    } else {
                        try {
                            runnable.run();
                        } catch (Throwable th) {
                            sg.bigo.ads.common.t.a.a(2, "ThreadManager", "An error occurred while running a task: \n" + Log.getStackTraceString(th));
                            if (d.f19652a != null) {
                                Iterator<sg.bigo.ads.common.n.a> it = d.f19652a.iterator();
                                while (it.hasNext()) {
                                    it.next().a(th);
                                }
                            }
                        }
                    }
                    if (d.i != null) {
                        d.i.removeCallbacks(runnable3);
                    }
                    if (this.b != null) {
                        if (this.c || myLooper == d.h.getLooper()) {
                            d.h.post(this.b);
                        } else {
                            new Handler(myLooper).post(this.b);
                        }
                    }
                }
            };
            Runnable runnable3 = new Runnable() { // from class: sg.bigo.ads.common.n.d.2

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Runnable f19656a = null;
                final /* synthetic */ boolean b = false;

                @Override // java.lang.Runnable
                public final void run() {
                    if (this.f19656a == null) {
                        runnable2.run();
                    } else if (this.b || myLooper == d.h.getLooper()) {
                        d.h.post(new Runnable() { // from class: sg.bigo.ads.common.n.d.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass2.this.f19656a.run();
                                bVar.post(runnable2);
                            }
                        });
                    } else {
                        new Handler(myLooper).post(new Runnable() { // from class: sg.bigo.ads.common.n.d.2.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass2.this.f19656a.run();
                                bVar.post(runnable2);
                            }
                        });
                    }
                }
            };
            WeakHashMap<Object, a> weakHashMap = j;
            synchronized (weakHashMap) {
                weakHashMap.put(runnable, new a(runnable3, Integer.valueOf(i2)));
            }
            bVar.postDelayed(runnable3, j2);
        }
    }

    public static void b(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            b(2, runnable, 0L);
        }
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static synchronized void g() {
        synchronized (d.class) {
            if (b == null) {
                HandlerThread handlerThread = new HandlerThread("BGAd-Background", 10);
                b = handlerThread;
                handlerThread.start();
                c = new b("BGAd-Background", b.getLooper());
            }
        }
    }

    private static synchronized void h() {
        synchronized (d.class) {
            if (d == null) {
                HandlerThread handlerThread = new HandlerThread("BGAd-Work", 5);
                d = handlerThread;
                handlerThread.start();
                e = new b("BGAd-Work", d.getLooper());
            }
        }
    }

    private static synchronized void i() {
        synchronized (d.class) {
            if (f == null) {
                HandlerThread handlerThread = new HandlerThread("BGAd-Normal", 0);
                f = handlerThread;
                handlerThread.start();
                g = new b("BGAd-Normal", f.getLooper());
            }
        }
    }

    private static synchronized void j() {
        synchronized (d.class) {
            if (h == null) {
                h = new b("BGAd-Background.Main + 38", Looper.getMainLooper());
            }
        }
    }
}
