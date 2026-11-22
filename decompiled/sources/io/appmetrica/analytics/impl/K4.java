package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes6.dex */
public abstract class K4 extends AbstractC3721zd {
    public final Object f;

    public K4(int i, String str, Object obj, Pn pn, U2 u2) {
        super(i, str, pn, u2);
        this.f = obj;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3721zd, io.appmetrica.analytics.impl.Bn
    public final void a(An an) {
        if (f()) {
            U2 u2 = this.d;
            int i = this.b;
            Cn a2 = u2.a(an, (Cn) ((HashMap) an.f17772a.get(i)).get(this.f18610a), this);
            if (a2 != null) {
                a(a2);
            }
        }
    }

    public abstract void a(Cn cn);

    public final Object g() {
        return this.f;
    }
}
