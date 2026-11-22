package com.bytedance.adsdk.kg;

import java.util.Arrays;

/* loaded from: classes13.dex */
public final class mvp<V> {
    private final V fxn;
    private final Throwable kg;

    public mvp(V v) {
        this.fxn = v;
        this.kg = null;
    }

    public mvp(Throwable th) {
        this.kg = th;
        this.fxn = null;
    }

    public V fxn() {
        return this.fxn;
    }

    public Throwable kg() {
        return this.kg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvp)) {
            return false;
        }
        mvp mvpVar = (mvp) obj;
        if (fxn() != null && fxn().equals(mvpVar.fxn())) {
            return true;
        }
        if (kg() == null || mvpVar.kg() == null) {
            return false;
        }
        return kg().toString().equals(kg().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{fxn(), kg()});
    }
}
