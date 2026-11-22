package sg.bigo.ads.common.f;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.common.f.a;
import sg.bigo.ads.common.n.d;

/* loaded from: classes9.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f19574a = false;
    private static int b = -1;
    private static int c = -1;
    private static Application d;
    private WeakReference<Activity> e;
    private final Map<a, Object> f;

    public interface a {
        void a(Activity activity);
    }

    /* renamed from: sg.bigo.ads.common.f.b$b, reason: collision with other inner class name */
    static class C1073b {

        /* renamed from: a, reason: collision with root package name */
        private static final b f19585a = new b(0);
    }

    private b() {
        this.f = new WeakHashMap();
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public static Application a() {
        return d;
    }

    public static synchronized void a(Application application) {
        synchronized (b.class) {
            if (f19574a) {
                return;
            }
            f19574a = true;
            b = 0;
            c = 0;
            d = application;
            application.registerActivityLifecycleCallbacks(C1073b.f19585a);
        }
    }

    public static void a(final a aVar) {
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.1
            @Override // java.lang.Runnable
            public final void run() {
                C1073b.f19585a.f.put(a.this, C1073b.f19585a);
            }
        });
    }

    public static Activity b() {
        WeakReference<Activity> weakReference = C1073b.f19585a.e;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static void b(final a aVar) {
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.2
            @Override // java.lang.Runnable
            public final void run() {
                C1073b.f19585a.f.remove(a.this);
            }
        });
    }

    public static int c() {
        int i;
        if (!f19574a || (i = c) < 0) {
            return 0;
        }
        return i > 0 ? 1 : 2;
    }

    public static boolean d() {
        return c > 0;
    }

    public static boolean e() {
        return b > 0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, Bundle bundle) {
        b++;
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.3
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(final Activity activity) {
        b--;
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.6
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.6.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                aVar.a(activity);
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(final Activity activity) {
        this.e = null;
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.5
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.5.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        this.e = new WeakReference<>(activity);
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.4
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (c == 0) {
            sg.bigo.ads.common.f.a a2 = sg.bigo.ads.common.f.a.a();
            a2.b();
            if (a2.d != null && a2.c()) {
                a2.d.a(a2.b, a2.c);
            }
            sg.bigo.ads.common.t.a.a(0, 3, "LAM", "On enter foreground.");
        }
        c++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = c - 1;
        c = i;
        if (i == 0) {
            sg.bigo.ads.common.f.a a2 = sg.bigo.ads.common.f.a.a();
            if (a2.d != null && a2.c()) {
                a.InterfaceC1072a interfaceC1072a = a2.d;
                boolean z = a2.f19573a;
                long j = a2.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = a2.c;
                System.currentTimeMillis();
                interfaceC1072a.a(z, j, elapsedRealtime, j2);
            }
            a2.f19573a = false;
            sg.bigo.ads.common.t.a.a(0, 3, "LAM", "On enter background.");
        }
    }
}
