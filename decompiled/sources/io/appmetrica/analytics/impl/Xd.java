package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public final class Xd extends K4 {
    public Xd(String str, double d, Pn pn, U2 u2) {
        super(1, str, Double.valueOf(d), pn, u2);
    }

    @Override // io.appmetrica.analytics.impl.K4
    public final void a(Cn cn) {
        cn.d.b = ((Double) this.f).doubleValue();
    }
}
