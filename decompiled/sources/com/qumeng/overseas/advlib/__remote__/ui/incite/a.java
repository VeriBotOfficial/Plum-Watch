package com.qumeng.overseas.advlib.__remote__.ui.incite;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.autonavi.aps.amapapi.config.Const;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import com.qumeng.overseas.advlib.__remote__.utils.q;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes17.dex */
public class a {
    private static volatile a i;
    private List<WeakReference<c>> c;
    private long f;

    /* renamed from: a, reason: collision with root package name */
    private final Stack<Activity> f13149a = new Stack<>();
    private final List<String> b = new ArrayList();
    private final Object d = new Object();
    private com.qumeng.overseas.advlib.__remote__.business.utils.a g = new com.qumeng.overseas.advlib.__remote__.business.utils.a();
    private volatile AtomicInteger h = new AtomicInteger();
    private final long e = System.currentTimeMillis();

    /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.incite.a$a, reason: collision with other inner class name */
    class C0840a implements Application.ActivityLifecycleCallbacks {
        C0840a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            try {
                if (a.this.f13149a.isEmpty()) {
                    return;
                }
                a.this.f13149a.remove(activity);
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (a.this.h.get() == 0 && q.a(a.this.b)) {
                a.this.h.addAndGet(1);
            }
            try {
                a.this.f13149a.remove(activity);
                a.this.f13149a.add(activity);
            } catch (Throwable unused) {
            }
            com.qumeng.overseas.advlib.__remote__.ui.incite.c.a().a(new d(115));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            n.b("onActivityStarted " + a.this.h.get());
            if (a.this.h.get() == 0) {
                n.b("应用回到前台");
                a.this.g.a(activity);
                if (a.this.c != null) {
                    synchronized (a.this.d) {
                        for (WeakReference weakReference : a.this.c) {
                            if (weakReference.get() != null) {
                                ((c) weakReference.get()).enterForeground(activity);
                            }
                        }
                    }
                }
            }
            if (a.this.b.remove(activity.getLocalClassName())) {
                return;
            }
            a.this.h.addAndGet(1);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            a.this.h.decrementAndGet();
            if (com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.d() && a.this.h.get() == 0) {
                a.this.g.b(activity);
                a.this.b.clear();
                n.b("应用退到后台 -->> " + a.this.h.get());
                if (a.this.c != null) {
                    synchronized (a.this.d) {
                        for (WeakReference weakReference : a.this.c) {
                            if (weakReference.get() != null) {
                                ((c) weakReference.get()).exitForeground(activity);
                            }
                        }
                    }
                }
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<Activity> b = a.b();
                for (Activity activity : b) {
                    if (!a.this.b.contains(activity.getLocalClassName())) {
                        a.this.b.add(activity.getLocalClassName());
                    }
                }
                a.this.h.set(b.size());
                if (!b.isEmpty()) {
                    a.this.f13149a.removeAll(b);
                    a.this.f13149a.addAll(b);
                    a.this.g.d(b.get(0));
                }
                n.b("supplyActivities " + a.this.h.get());
            } catch (Throwable unused) {
            }
        }
    }

    public interface c {
        void enterForeground(Activity activity);

        void exitForeground(Activity activity);
    }

    private a() {
    }

    private void h() {
        com.qumeng.overseas.advlib.__remote__.utils.j.b(new b());
    }

    public boolean g() {
        return a() == 0;
    }

    public static Activity a(Context context) {
        Window window;
        try {
            if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null) {
                Context context2 = window.getContext();
                if (context2 instanceof Activity) {
                    return (Activity) context2;
                }
            }
        } catch (Throwable unused) {
        }
        return e().c();
    }

    public static List<Activity> b() {
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Iterator it = ((Map) declaredField.get(invoke)).entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                Field declaredField2 = value.getClass().getDeclaredField(Const.STR_PROCESS_TAG);
                declaredField2.setAccessible(true);
                arrayList.add((Activity) declaredField2.get(value));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    public static a e() {
        if (i == null) {
            synchronized (a.class) {
                if (i == null) {
                    i = new a();
                }
            }
        }
        return i;
    }

    public Activity c() {
        try {
            if (!this.f13149a.isEmpty()) {
                return this.f13149a.peek();
            }
        } catch (Throwable unused) {
        }
        List<Activity> b2 = b();
        if (b2.size() > 0) {
            return b2.get(b2.size() - 1);
        }
        return null;
    }

    public long d() {
        return (System.currentTimeMillis() - this.e) + this.f;
    }

    public Activity f() {
        if (this.f13149a.size() <= 1) {
            return null;
        }
        return this.f13149a.elementAt(r0.size() - 2);
    }

    public int a() {
        return this.h.get();
    }

    public void a(WeakReference<c> weakReference) {
        synchronized (this.d) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(weakReference);
        }
    }

    public void b(Context context) {
        if (context instanceof Application) {
            com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.b(context);
            h();
            ((Application) context).registerActivityLifecycleCallbacks(new C0840a());
        }
    }

    public boolean a(Activity activity) {
        return this.f13149a.contains(activity);
    }

    public void b(WeakReference<c> weakReference) {
        if (this.c != null) {
            synchronized (this.d) {
                Iterator<WeakReference<c>> it = this.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (weakReference == it.next()) {
                        it.remove();
                        break;
                    }
                }
            }
        }
    }
}
