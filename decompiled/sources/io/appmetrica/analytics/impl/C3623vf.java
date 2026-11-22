package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.vf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3623vf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C3693ya f18552a;

    public C3623vf() {
        this(new C3693ya(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3576ti fromModel(List<String> list) {
        C3332jn a2 = this.f18552a.a((List<Object>) list);
        List list2 = (List) a2.f18349a;
        C3591u8[] c3591u8Arr = new C3591u8[0];
        if (list2 != null) {
            c3591u8Arr = new C3591u8[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                C3591u8 c3591u8 = new C3591u8();
                c3591u8Arr[i] = c3591u8;
                c3591u8.f18529a = StringUtils.getUTF8Bytes((String) list2.get(i));
            }
        }
        a2.b.getBytesTruncated();
        return new C3576ti(c3591u8Arr, a2.b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C3623vf(C3693ya c3693ya) {
        this.f18552a = c3693ya;
    }

    public final List<String> a(C3576ti c3576ti) {
        throw new UnsupportedOperationException();
    }
}
