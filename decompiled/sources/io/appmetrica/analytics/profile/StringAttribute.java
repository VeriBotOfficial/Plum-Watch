package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.Bk;
import io.appmetrica.analytics.impl.Bn;
import io.appmetrica.analytics.impl.C3526ri;
import io.appmetrica.analytics.impl.C3705ym;
import io.appmetrica.analytics.impl.C3730zm;
import io.appmetrica.analytics.impl.InterfaceC3307in;
import io.appmetrica.analytics.impl.InterfaceC3411n2;
import io.appmetrica.analytics.impl.J4;
import io.appmetrica.analytics.impl.Pn;

/* loaded from: classes6.dex */
public class StringAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3307in f18703a;
    private final A6 b;

    StringAttribute(String str, C3705ym c3705ym, Pn pn, InterfaceC3411n2 interfaceC3411n2) {
        this.b = new A6(str, pn, interfaceC3411n2);
        this.f18703a = c3705ym;
    }

    public UserProfileUpdate<? extends Bn> withValue(String str) {
        A6 a6 = this.b;
        return new UserProfileUpdate<>(new C3730zm(a6.c, str, this.f18703a, a6.f17762a, new J4(a6.b)));
    }

    public UserProfileUpdate<? extends Bn> withValueIfUndefined(String str) {
        A6 a6 = this.b;
        return new UserProfileUpdate<>(new C3730zm(a6.c, str, this.f18703a, a6.f17762a, new Bk(a6.b)));
    }

    public UserProfileUpdate<? extends Bn> withValueReset() {
        A6 a6 = this.b;
        return new UserProfileUpdate<>(new C3526ri(0, a6.c, a6.f17762a, a6.b));
    }
}
