package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.dl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3181dl implements ListConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C3206el f18241a = new C3206el();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3340k6[] fromModel(List<C3231fl> list) {
        C3340k6[] c3340k6Arr = new C3340k6[list.size()];
        Iterator<C3231fl> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            c3340k6Arr[i] = this.f18241a.fromModel(it.next());
            i++;
        }
        return c3340k6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final List<C3231fl> a(C3340k6[] c3340k6Arr) {
        throw new UnsupportedOperationException();
    }
}
