package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.l0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 implements g0 {
    private static final Object f = new Object();
    private static volatile i0 g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f15760a = new Object();
    private final WeakHashMap b = new WeakHashMap();
    private final WeakHashMap c = new WeakHashMap();
    private final a d = new a();
    private boolean e;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Iterator it = a(i0.this.c).iterator();
            while (it.hasNext()) {
                ((lr1) it.next()).a(activity, bundle);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Iterator it = a(i0.this.b).iterator();
            while (it.hasNext()) {
                ((r0) it.next()).a(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Iterator it = a(i0.this.b).iterator();
            while (it.hasNext()) {
                ((r0) it.next()).b(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
            Iterator it = a(i0.this.c).iterator();
            while (it.hasNext()) {
                ((lr1) it.next()).b(activity, outState);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            i0.this.b(activity);
        }

        private final HashSet a(WeakHashMap weakHashMap) {
            HashSet hashSet;
            synchronized (i0.this.f15760a) {
                Set keySet = weakHashMap.keySet();
                hashSet = new HashSet(keySet.size());
                for (Object obj : keySet) {
                    if (obj != null) {
                        hashSet.add(obj);
                    }
                }
            }
            return hashSet;
        }
    }

    @Override // com.yandex.mobile.ads.impl.g0
    public final void b(Context context, r0 listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f15760a) {
            this.b.put(listener, null);
            if (!c()) {
                a(context);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this.d);
            this.e = true;
        } catch (Throwable unused) {
            Object[] args = new Object[0];
            int i = sp0.b;
            Intrinsics.checkNotNullParameter(args, "args");
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.f15760a) {
            z = this.e;
        }
        return z;
    }

    @Override // com.yandex.mobile.ads.impl.g0
    public final void b(Context context, l0.a listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f15760a) {
            this.c.put(listener, null);
            if (!c()) {
                a(context);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.yandex.mobile.ads.impl.g0
    public final void a(Context context, r0 listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f15760a) {
            this.b.remove(listener);
            b(context);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.yandex.mobile.ads.impl.g0
    public final void a(Context context, l0.a listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f15760a) {
            this.c.remove(listener);
            b(context);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Context context) {
        synchronized (this.f15760a) {
            if (this.b.isEmpty() && this.c.isEmpty()) {
                Intrinsics.checkNotNullParameter(context, "context");
                try {
                    if (c()) {
                        Context applicationContext = context.getApplicationContext();
                        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.d);
                        this.e = false;
                    }
                } catch (Throwable unused) {
                    Object[] args = new Object[0];
                    int i = sp0.b;
                    Intrinsics.checkNotNullParameter(args, "args");
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
