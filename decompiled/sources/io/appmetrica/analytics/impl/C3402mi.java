package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.mi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3402mi extends Jm {
    public final RunnableC3377li d;
    public final ICommonExecutor e;

    public C3402mi(C3389m5 c3389m5, InterfaceC3405ml interfaceC3405ml, ICommonExecutor iCommonExecutor) {
        super(c3389m5, interfaceC3405ml);
        this.d = new RunnableC3377li(this);
        this.e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.Jm
    public final void a() {
        this.e.remove(this.d);
    }

    @Override // io.appmetrica.analytics.impl.Jm
    public final void e() {
        this.b.a();
        C3152ch c3152ch = (C3152ch) ((C3389m5) this.f17926a).k.a();
        if (c3152ch.k.a(c3152ch.j)) {
            String str = c3152ch.m;
            if (TextUtils.isEmpty(str) || "-1".equals(str)) {
                return;
            }
            try {
                a(Nd.a((C3389m5) this.f17926a));
            } catch (Throwable unused) {
            }
        }
    }

    public final void f() {
        if (this.c.get()) {
            return;
        }
        this.e.remove(this.d);
        if (((C3152ch) ((C3389m5) this.f17926a).k.a()).g > 0) {
            this.e.executeDelayed(this.d, TimeUnit.SECONDS.toMillis(((C3152ch) ((C3389m5) this.f17926a).k.a()).g));
        }
    }
}
