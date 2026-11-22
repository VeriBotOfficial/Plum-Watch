package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.jl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3330jl {

    /* renamed from: a, reason: collision with root package name */
    public final C3643wa f18347a = new C3643wa();
    public final HashMap b = new HashMap();
    public Hl c = null;
    public final C3281hl d = new C3281hl(this);

    public static final C3330jl a() {
        return AbstractC3305il.f18332a;
    }

    public final C3182dm a(Context context, C3215f5 c3215f5, Bl bl) {
        C3182dm c3182dm = (C3182dm) this.b.get(c3215f5.f18266a);
        boolean z = true;
        if (c3182dm == null) {
            synchronized (this.b) {
                c3182dm = (C3182dm) this.b.get(c3215f5.f18266a);
                if (c3182dm == null) {
                    c3182dm = new C3182dm(new C3207em(context, c3215f5.f18266a, bl, this.d));
                    c3182dm.f();
                    this.b.put(c3215f5.f18266a, c3182dm);
                    z = false;
                }
            }
        }
        if (z) {
            c3182dm.a(bl);
        }
        return c3182dm;
    }

    public final void a(C3215f5 c3215f5, InterfaceC3554sl interfaceC3554sl) {
        synchronized (this.b) {
            this.f18347a.a(c3215f5.f18266a, interfaceC3554sl);
            Hl hl = this.c;
            if (hl != null) {
                interfaceC3554sl.a(hl);
            }
        }
    }
}
