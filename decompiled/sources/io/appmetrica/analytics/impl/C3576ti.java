package io.appmetrica.analytics.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.ti, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3576ti implements InterfaceC3611v3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18516a;
    public final InterfaceC3611v3 b;

    public C3576ti(Object obj, InterfaceC3611v3 interfaceC3611v3) {
        this.f18516a = obj;
        this.b = interfaceC3611v3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3611v3
    public final int getBytesTruncated() {
        return this.b.getBytesTruncated();
    }

    public final String toString() {
        return "Result{result=" + this.f18516a + ", metaInfo=" + this.b + AbstractJsonLexerKt.END_OBJ;
    }
}
