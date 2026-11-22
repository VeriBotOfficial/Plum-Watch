package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Xb implements Ub, ToggleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18134a = new ArrayList();
    public final IHandlerExecutor b = C3593ua.j().w().c();
    public C3283hn c;
    public boolean d;

    public final void a(Toggle toggle) {
        C3283hn c3283hn = new C3283hn(toggle);
        this.c = c3283hn;
        c3283hn.c.registerObserver(this, true);
    }

    public final void b(Object obj) {
        C3283hn c3283hn = this.c;
        if (c3283hn == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            c3283hn = null;
        }
        c3283hn.b.b(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(final boolean z) {
        this.b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.Xb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Xb.a(Xb.this, z);
            }
        });
    }

    public final void a(final LocationControllerObserver locationControllerObserver, final boolean z) {
        this.b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.Xb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Xb.a(Xb.this, locationControllerObserver, z);
            }
        });
    }

    public static final void a(Xb xb, LocationControllerObserver locationControllerObserver, boolean z) {
        xb.f18134a.add(locationControllerObserver);
        if (z) {
            if (xb.d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(Xb xb, boolean z) {
        if (xb.d != z) {
            xb.d = z;
            Function1 function1 = z ? Vb.f18109a : Wb.f18122a;
            Iterator it = xb.f18134a.iterator();
            while (it.hasNext()) {
                function1.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void a(Object obj) {
        C3283hn c3283hn = this.c;
        if (c3283hn == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            c3283hn = null;
        }
        c3283hn.b.a(obj);
    }

    public final void a(boolean z) {
        C3283hn c3283hn = this.c;
        if (c3283hn == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            c3283hn = null;
        }
        c3283hn.f18314a.a(z);
    }
}
