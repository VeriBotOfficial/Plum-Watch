package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class Um implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C3181dl f18101a;

    public Um() {
        this(new C3181dl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3365l6 fromModel(Tm tm) {
        C3365l6 c3365l6 = new C3365l6();
        Integer num = tm.e;
        c3365l6.e = num == null ? -1 : num.intValue();
        c3365l6.d = tm.d;
        c3365l6.b = tm.b;
        c3365l6.f18371a = tm.f18087a;
        c3365l6.c = tm.c;
        C3181dl c3181dl = this.f18101a;
        List list = tm.f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3231fl((StackTraceElement) it.next()));
        }
        c3365l6.f = c3181dl.fromModel(arrayList);
        return c3365l6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Um(C3181dl c3181dl) {
        this.f18101a = c3181dl;
    }

    public final Tm a(C3365l6 c3365l6) {
        throw new UnsupportedOperationException();
    }
}
