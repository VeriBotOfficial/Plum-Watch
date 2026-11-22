package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3458p extends H7 {

    /* renamed from: a, reason: collision with root package name */
    public Application f18439a;
    public volatile EnumC3433o b = EnumC3433o.d;
    public final C3643wa c = new C3643wa(true);

    public final synchronized void a(Context context) {
        if (this.f18439a == null) {
            try {
                this.f18439a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        b();
    }

    public final synchronized void b() {
        EnumC3433o enumC3433o = this.b;
        EnumC3433o enumC3433o2 = EnumC3433o.b;
        if (enumC3433o != enumC3433o2 && !this.c.f18565a.isEmpty()) {
            if (this.f18439a == null) {
                this.b = EnumC3433o.c;
            } else {
                this.b = enumC3433o2;
                this.f18439a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    public final synchronized void c() {
        if (this.b == EnumC3433o.b && this.c.f18565a.isEmpty()) {
            this.b = EnumC3433o.d;
            Application application = this.f18439a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, EnumC3383m.CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(activity, EnumC3383m.DESTROYED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity, EnumC3383m.PAUSED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity, EnumC3383m.RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity, EnumC3383m.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(activity, EnumC3383m.STOPPED);
    }

    public final synchronized void a(Application application) {
        if (this.f18439a == null) {
            this.f18439a = application;
        }
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0004, code lost:
    
        if (r8.length == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(io.appmetrica.analytics.impl.InterfaceC3408n r7, io.appmetrica.analytics.impl.EnumC3383m... r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r8 == 0) goto L6
            int r0 = r8.length     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto La
        L6:
            io.appmetrica.analytics.impl.m[] r8 = io.appmetrica.analytics.impl.EnumC3383m.values()     // Catch: java.lang.Throwable -> L3e
        La:
            int r0 = r8.length     // Catch: java.lang.Throwable -> L3e
            r1 = 0
        Lc:
            if (r1 >= r0) goto L39
            r2 = r8[r1]     // Catch: java.lang.Throwable -> L3e
            io.appmetrica.analytics.impl.wa r3 = r6.c     // Catch: java.lang.Throwable -> L3e
            java.util.HashMap r4 = r3.f18565a     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L3e
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L36
            boolean r5 = r4.remove(r7)     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L36
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L31
            boolean r5 = r3.b     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L31
            java.util.HashMap r3 = r3.f18565a     // Catch: java.lang.Throwable -> L3e
            r3.remove(r2)     // Catch: java.lang.Throwable -> L3e
        L31:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3e
        L36:
            int r1 = r1 + 1
            goto Lc
        L39:
            r6.c()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r6)
            return
        L3e:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3e
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C3458p.b(io.appmetrica.analytics.impl.n, io.appmetrica.analytics.impl.m[]):void");
    }

    public final EnumC3433o a() {
        return this.b;
    }

    public final void a(Activity activity, EnumC3383m enumC3383m) {
        Collection collection;
        synchronized (this) {
            collection = (Collection) this.c.f18565a.get(enumC3383m);
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((InterfaceC3408n) it.next()).a(activity, enumC3383m);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0004, code lost:
    
        if (r6.length == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(io.appmetrica.analytics.impl.InterfaceC3408n r5, io.appmetrica.analytics.impl.EnumC3383m... r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r6 == 0) goto L6
            int r0 = r6.length     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto La
        L6:
            io.appmetrica.analytics.impl.m[] r6 = io.appmetrica.analytics.impl.EnumC3383m.values()     // Catch: java.lang.Throwable -> L1d
        La:
            int r0 = r6.length     // Catch: java.lang.Throwable -> L1d
            r1 = 0
        Lc:
            if (r1 >= r0) goto L18
            r2 = r6[r1]     // Catch: java.lang.Throwable -> L1d
            io.appmetrica.analytics.impl.wa r3 = r4.c     // Catch: java.lang.Throwable -> L1d
            r3.a(r2, r5)     // Catch: java.lang.Throwable -> L1d
            int r1 = r1 + 1
            goto Lc
        L18:
            r4.b()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)
            return
        L1d:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C3458p.a(io.appmetrica.analytics.impl.n, io.appmetrica.analytics.impl.m[]):void");
    }
}
