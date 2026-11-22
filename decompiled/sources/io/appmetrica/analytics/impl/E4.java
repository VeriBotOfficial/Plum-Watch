package io.appmetrica.analytics.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public final class E4 extends C3586u3 {
    public final int b;

    public E4(int i, int i2) {
        super(i2);
        this.b = i;
    }

    @Override // io.appmetrica.analytics.impl.C3586u3
    public final String toString() {
        return "CollectionTrimInfo{itemsDropped=" + this.b + ", bytesTruncated=" + this.f18523a + AbstractJsonLexerKt.END_OBJ;
    }
}
