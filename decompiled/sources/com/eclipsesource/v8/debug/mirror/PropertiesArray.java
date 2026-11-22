package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;

/* loaded from: classes14.dex */
public class PropertiesArray implements Releasable {
    private V8Array v8Array;

    PropertiesArray(V8Array v8Array) {
        this.v8Array = v8Array.twin();
    }

    public PropertyMirror getProperty(int i) {
        V8Object object = this.v8Array.getObject(i);
        try {
            return new PropertyMirror(object);
        } finally {
            object.close();
        }
    }

    @Override // com.eclipsesource.v8.Releasable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.v8Array.isReleased()) {
            return;
        }
        this.v8Array.close();
    }

    @Override // com.eclipsesource.v8.Releasable
    @Deprecated
    public void release() {
        close();
    }

    public int length() {
        return this.v8Array.length();
    }
}
