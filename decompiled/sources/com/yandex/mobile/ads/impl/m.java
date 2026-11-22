package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: classes5.dex */
abstract class m<K, V> extends o<K, V> implements zr0<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    protected m(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.yandex.mobile.ads.impl.o, com.yandex.mobile.ads.impl.t31
    public final boolean put(K k, V v) {
        return super.put(k, v);
    }

    @Override // com.yandex.mobile.ads.impl.q, com.yandex.mobile.ads.impl.t31
    public final Map<K, Collection<V>> a() {
        return super.a();
    }

    @Override // com.yandex.mobile.ads.impl.q
    public final boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }
}
