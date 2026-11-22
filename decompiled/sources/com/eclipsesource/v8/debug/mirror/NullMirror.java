package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes14.dex */
public class NullMirror extends ValueMirror {
    @Override // com.eclipsesource.v8.debug.mirror.Mirror
    public boolean isNull() {
        return true;
    }

    NullMirror(V8Object v8Object) {
        super(v8Object);
    }

    @Override // com.eclipsesource.v8.debug.mirror.Mirror
    public String toString() {
        return AbstractJsonLexerKt.NULL;
    }
}
