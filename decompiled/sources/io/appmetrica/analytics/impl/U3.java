package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public final class U3 extends W7 {
    @Override // io.appmetrica.analytics.impl.W7
    public final boolean a(L3 l3, L3 l32) {
        if (In.a(l32.f17950a)) {
            return true;
        }
        if (In.a(l3.f17950a)) {
            return false;
        }
        X7 x7 = l3.b;
        if (x7 == X7.c) {
            if (((Number) this.f18121a.a(x7)).intValue() >= ((Number) this.f18121a.a(l32.b)).intValue()) {
                return true;
            }
        } else if (((Number) this.f18121a.a(x7)).intValue() > ((Number) this.f18121a.a(l32.b)).intValue()) {
            return true;
        }
        return false;
    }
}
