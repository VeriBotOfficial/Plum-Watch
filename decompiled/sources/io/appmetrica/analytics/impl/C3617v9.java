package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.v9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3617v9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3567t9 fromModel(C3592u9 c3592u9) {
        C3567t9 c3567t9 = new C3567t9();
        String str = c3592u9.f18530a;
        if (str != null) {
            c3567t9.f18511a = str.getBytes();
        }
        return c3567t9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3592u9 toModel(C3567t9 c3567t9) {
        return new C3592u9(new String(c3567t9.f18511a));
    }
}
