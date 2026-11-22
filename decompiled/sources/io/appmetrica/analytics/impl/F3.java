package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* loaded from: classes6.dex */
public final class F3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C3693ya f17842a;

    public F3() {
        this(new C3693ya(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3576ti fromModel(List<String> list) {
        C3332jn a2 = this.f17842a.a((List<Object>) list);
        C3367l8 c3367l8 = new C3367l8();
        c3367l8.f18374a = StringUtils.getUTF8Bytes((List<String>) a2.f18349a);
        InterfaceC3611v3 interfaceC3611v3 = a2.b;
        int i = ((E4) interfaceC3611v3).f18523a;
        return new C3576ti(c3367l8, interfaceC3611v3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public F3(C3693ya c3693ya) {
        this.f17842a = c3693ya;
    }

    public final List<String> a(C3576ti c3576ti) {
        throw new UnsupportedOperationException();
    }
}
