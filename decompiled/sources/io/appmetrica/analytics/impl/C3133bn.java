package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ValidationException;

/* renamed from: io.appmetrica.analytics.impl.bn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3133bn implements Pn {

    /* renamed from: a, reason: collision with root package name */
    public final Pn f18204a;

    public C3133bn(Pn pn) {
        this.f18204a = pn;
    }

    @Override // io.appmetrica.analytics.impl.Pn
    public final Nn a(Object obj) {
        Nn a2 = this.f18204a.a(obj);
        if (a2.f17989a) {
            return a2;
        }
        throw new ValidationException(a2.b);
    }

    public final Pn a() {
        return this.f18204a;
    }
}
