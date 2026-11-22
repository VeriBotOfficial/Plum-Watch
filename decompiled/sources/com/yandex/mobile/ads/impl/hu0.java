package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.o;
import com.yandex.mobile.ads.impl.o.a.C0980a;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes5.dex */
abstract class hu0<K, V> extends AbstractMap<K, V> {

    @CheckForNull
    private transient Set<Map.Entry<K, V>> b;

    @CheckForNull
    private transient Collection<V> c;

    hu0() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.b;
        if (set != null) {
            return set;
        }
        o.a.C0980a c0980a = ((o.a) this).new C0980a();
        this.b = c0980a;
        return c0980a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.c;
        if (collection != null) {
            return collection;
        }
        gu0 gu0Var = new gu0(this);
        this.c = gu0Var;
        return gu0Var;
    }
}
