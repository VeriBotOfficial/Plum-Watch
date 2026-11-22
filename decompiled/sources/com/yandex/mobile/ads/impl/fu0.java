package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.wx1;
import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: classes5.dex */
class fu0<K, V> extends wx1.c<K> {
    final Map<K, V> b;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }

    fu0(Map<K, V> map) {
        this.b = (Map) vj1.a(map);
    }
}
