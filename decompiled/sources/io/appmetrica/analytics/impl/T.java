package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class T implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Um f18073a;

    public T(Um um) {
        this.f18073a = um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3141c6 fromModel(S s) {
        C3141c6 c3141c6 = new C3141c6();
        Tm tm = s.f18057a;
        if (tm != null) {
            c3141c6.f18211a = this.f18073a.fromModel(tm);
        }
        c3141c6.b = new C3365l6[s.b.size()];
        Iterator it = s.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c3141c6.b[i] = this.f18073a.fromModel((Tm) it.next());
            i++;
        }
        String str = s.c;
        if (str != null) {
            c3141c6.c = str;
        }
        return c3141c6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final S a(C3141c6 c3141c6) {
        throw new UnsupportedOperationException();
    }
}
