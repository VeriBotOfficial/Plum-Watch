package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;

/* loaded from: classes14.dex */
public class BooleanMirror extends ValueMirror {
    @Override // com.eclipsesource.v8.debug.mirror.Mirror
    public boolean isBoolean() {
        return true;
    }

    BooleanMirror(V8Object v8Object) {
        super(v8Object);
    }

    @Override // com.eclipsesource.v8.debug.mirror.Mirror
    public String toString() {
        return this.v8Object.executeStringFunction("toText", null);
    }
}
