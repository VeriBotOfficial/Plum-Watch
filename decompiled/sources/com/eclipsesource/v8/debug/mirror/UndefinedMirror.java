package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;

/* loaded from: classes14.dex */
public class UndefinedMirror extends ValueMirror {
    @Override // com.eclipsesource.v8.debug.mirror.Mirror
    public boolean isUndefined() {
        return true;
    }

    UndefinedMirror(V8Object v8Object) {
        super(v8Object);
    }

    @Override // com.eclipsesource.v8.debug.mirror.Mirror
    public String toString() {
        return "undefined";
    }
}
