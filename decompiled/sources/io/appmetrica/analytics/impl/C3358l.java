package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3358l implements InterfaceC3408n {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f18366a = new HashSet();

    public C3358l(C3458p c3458p) {
        c3458p.a(this, new EnumC3383m[0]);
    }

    public final synchronized void a(InterfaceC3333k interfaceC3333k) {
        this.f18366a.add(interfaceC3333k);
    }

    public final void a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f18366a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Ri) ((InterfaceC3333k) it.next())).a(activity);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3408n
    public final void a(Activity activity, EnumC3383m enumC3383m) {
        C3562t4.i().c.a().execute(new RunnableC3308j(this, activity));
    }
}
