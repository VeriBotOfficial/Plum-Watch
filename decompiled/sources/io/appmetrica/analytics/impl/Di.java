package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class Di implements Pn {

    /* renamed from: a, reason: collision with root package name */
    public final On f17817a = new On();

    @Override // io.appmetrica.analytics.impl.Pn
    public final Nn a(Revenue revenue) {
        On on = this.f17817a;
        Nn[] nnArr = new Nn[1];
        Ff ff = new Ff();
        Integer num = revenue.quantity;
        nnArr[0] = (num == null || num.intValue() > 0) ? new Nn(ff, true, "") : new Nn(ff, false, "Invalid quantity value " + num);
        List<Nn> asList = Arrays.asList(nnArr);
        on.getClass();
        return on.a(asList);
    }
}
