package com.yandex.mobile.ads.impl;

import java.io.Serializable;

/* loaded from: classes5.dex */
final class jk0<K, V> extends p<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final K b;
    final V c;

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    jk0(K k, V v) {
        this.b = k;
        this.c = v;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.c;
    }
}
