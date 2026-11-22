package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes6.dex */
public final class F1 implements InterfaceC3584u1 {

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f17841a;
    public final InterfaceC3584u1 b;
    public boolean c;

    public F1(InterfaceC3584u1 interfaceC3584u1) {
        this(C3593ua.j().w().b(), interfaceC3584u1);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3584u1
    public final void a(Intent intent, int i) {
        this.f17841a.execute(new C3659x1(this, intent, i));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3584u1
    public final void b(Intent intent) {
        this.f17841a.execute(new B1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3584u1
    public final void c(Intent intent) {
        this.f17841a.execute(new A1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3584u1
    public final void onConfigurationChanged(Configuration configuration) {
        this.f17841a.execute(new C3609v1(this, configuration));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3584u1
    public final synchronized void onCreate() {
        this.c = true;
        this.f17841a.execute(new C3634w1(this));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3584u1
    public final void onDestroy() {
        this.f17841a.removeAll();
        synchronized (this) {
            this.c = false;
        }
        this.b.onDestroy();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3584u1
    public final void pauseUserSession(Bundle bundle) {
        this.f17841a.execute(new E1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3584u1
    public final void reportData(int i, Bundle bundle) {
        this.f17841a.execute(new C1(this, i, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3584u1
    public final void resumeUserSession(Bundle bundle) {
        this.f17841a.execute(new D1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3584u1
    public final void a(Intent intent, int i, int i2) {
        this.f17841a.execute(new C3684y1(this, intent, i, i2));
    }

    public F1(IHandlerExecutor iHandlerExecutor, InterfaceC3584u1 interfaceC3584u1) {
        this.c = false;
        this.f17841a = iHandlerExecutor;
        this.b = interfaceC3584u1;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3584u1
    public final void a(Intent intent) {
        this.f17841a.execute(new C3709z1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3584u1
    public final void a(InterfaceC3559t1 interfaceC3559t1) {
        this.b.a(interfaceC3559t1);
    }
}
