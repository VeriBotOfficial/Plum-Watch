package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes6.dex */
public final class D9 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f17811a;
    public final C3220fa b;

    public D9(Context context, String str) {
        this(new ReentrantLock(), new C3220fa(context, str));
    }

    public final void a() {
        this.f17811a.lock();
        this.b.a();
    }

    public final void b() {
        this.b.b();
        this.f17811a.unlock();
    }

    public final void c() {
        C3220fa c3220fa = this.b;
        synchronized (c3220fa) {
            c3220fa.b();
            c3220fa.f18270a.delete();
        }
        this.f17811a.unlock();
    }

    public D9(ReentrantLock reentrantLock, C3220fa c3220fa) {
        this.f17811a = reentrantLock;
        this.b = c3220fa;
    }
}
