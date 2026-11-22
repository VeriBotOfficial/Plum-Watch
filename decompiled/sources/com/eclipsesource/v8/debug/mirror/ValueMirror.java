package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;

/* loaded from: classes14.dex */
public class ValueMirror extends Mirror {
    private static final String VALUE = "value";

    @Override // com.eclipsesource.v8.debug.mirror.Mirror
    public boolean isValue() {
        return true;
    }

    ValueMirror(V8Object v8Object) {
        super(v8Object);
    }

    public Object getValue() {
        return this.v8Object.executeFunction("value", null);
    }
}
