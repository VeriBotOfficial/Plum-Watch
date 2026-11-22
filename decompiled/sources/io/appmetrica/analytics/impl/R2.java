package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public final class R2 implements Pn {
    @Override // io.appmetrica.analytics.impl.Pn
    public final Nn a(Object obj) {
        Cn[] cnArr = ((Fn) obj).f17858a;
        return (cnArr == null || cnArr.length == 0) ? new Nn(this, false, "attributes list is empty") : new Nn(this, true, "");
    }
}
