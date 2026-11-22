package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.el, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3206el implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3340k6 fromModel(C3231fl c3231fl) {
        C3340k6 c3340k6 = new C3340k6();
        c3340k6.f18356a = (String) WrapUtils.getOrDefault(c3231fl.f18278a, c3340k6.f18356a);
        c3340k6.b = (String) WrapUtils.getOrDefault(c3231fl.b, c3340k6.b);
        c3340k6.c = ((Integer) WrapUtils.getOrDefault(c3231fl.c, Integer.valueOf(c3340k6.c))).intValue();
        c3340k6.f = ((Integer) WrapUtils.getOrDefault(c3231fl.d, Integer.valueOf(c3340k6.f))).intValue();
        c3340k6.d = (String) WrapUtils.getOrDefault(c3231fl.e, c3340k6.d);
        c3340k6.e = ((Boolean) WrapUtils.getOrDefault(c3231fl.f, Boolean.valueOf(c3340k6.e))).booleanValue();
        return c3340k6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final C3231fl a(C3340k6 c3340k6) {
        throw new UnsupportedOperationException();
    }
}
