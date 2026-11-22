package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.Bk;
import io.appmetrica.analytics.impl.Bn;
import io.appmetrica.analytics.impl.C3511r3;
import io.appmetrica.analytics.impl.C3526ri;
import io.appmetrica.analytics.impl.InterfaceC3411n2;
import io.appmetrica.analytics.impl.J4;
import io.appmetrica.analytics.impl.Pn;

/* loaded from: classes6.dex */
public class BooleanAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f18698a;

    BooleanAttribute(String str, Pn pn, InterfaceC3411n2 interfaceC3411n2) {
        this.f18698a = new A6(str, pn, interfaceC3411n2);
    }

    public UserProfileUpdate<? extends Bn> withValue(boolean z) {
        A6 a6 = this.f18698a;
        return new UserProfileUpdate<>(new C3511r3(a6.c, z, a6.f17762a, new J4(a6.b)));
    }

    public UserProfileUpdate<? extends Bn> withValueIfUndefined(boolean z) {
        A6 a6 = this.f18698a;
        return new UserProfileUpdate<>(new C3511r3(a6.c, z, a6.f17762a, new Bk(a6.b)));
    }

    public UserProfileUpdate<? extends Bn> withValueReset() {
        A6 a6 = this.f18698a;
        return new UserProfileUpdate<>(new C3526ri(3, a6.c, a6.f17762a, a6.b));
    }
}
