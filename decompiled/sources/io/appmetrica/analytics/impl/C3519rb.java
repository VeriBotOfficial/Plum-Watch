package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.rb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3519rb implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Sc f18479a;

    public C3519rb() {
        this(new Sc(new C3457on()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(C3432nn c3432nn) {
        return MessageNano.toByteArray((MessageNano) this.f18479a.f18065a.fromModel(c3432nn));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C3519rb(Sc sc) {
        this.f18479a = sc;
    }

    public final C3432nn a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
