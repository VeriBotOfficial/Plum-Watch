package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.gi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3253gi {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18294a = new HashMap();
    public final C3484q0 b;

    public C3253gi(C3484q0 c3484q0) {
        this.b = c3484q0;
    }

    public static C3253gi a() {
        return AbstractC3228fi.f18275a;
    }

    public final Yh a(Context context, String str) {
        Yh yh;
        Yh yh2 = (Yh) this.f18294a.get(str);
        if (yh2 != null) {
            return yh2;
        }
        synchronized (this.f18294a) {
            yh = (Yh) this.f18294a.get(str);
            if (yh == null) {
                IHandlerExecutor a2 = C3562t4.i().c.a();
                this.b.getClass();
                if (C3459p0.e == null) {
                    ((G9) a2).b.post(new RunnableC3203ei(this, context));
                }
                yh = new Yh(context.getApplicationContext(), str, new C3484q0());
                this.f18294a.put(str, yh);
                yh.c(str);
            }
        }
        return yh;
    }
}
