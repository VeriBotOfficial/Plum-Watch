package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.yandex.mobile.ads.impl.o;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes5.dex */
abstract class q<K, V> implements t31<K, V> {

    @CheckForNull
    @LazyInit
    private transient Set<K> b;

    @CheckForNull
    @LazyInit
    private transient Collection<V> c;

    @CheckForNull
    @LazyInit
    private transient Map<K, Collection<V>> d;

    class a extends AbstractCollection<V> {
        final /* synthetic */ q b;

        a(o oVar) {
            this.b = oVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            o oVar = (o) this.b;
            oVar.getClass();
            return new n(oVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ((o) this.b).g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            Iterator<V> it = ((hu0) this.b.a()).values().iterator();
            while (it.hasNext()) {
                if (((Collection) it.next()).contains(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            ((o) this.b).d();
        }
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t31)) {
            return false;
        }
        return ((o.a) ((m) this).a()).equals(((t31) obj).a());
    }

    q() {
    }

    public final Set<K> b() {
        Set<K> set = this.b;
        if (set != null) {
            return set;
        }
        Set<K> f = ((x31) this).f();
        this.b = f;
        return f;
    }

    @Override // com.yandex.mobile.ads.impl.t31
    public Collection<V> values() {
        Collection<V> collection = this.c;
        if (collection != null) {
            return collection;
        }
        a aVar = new a((o) this);
        this.c = aVar;
        return aVar;
    }

    @Override // com.yandex.mobile.ads.impl.t31
    public Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> e = ((x31) this).e();
        this.d = e;
        return e;
    }

    public final int hashCode() {
        return ((o.a) a()).d.hashCode();
    }

    public final String toString() {
        return ((o.a) a()).d.toString();
    }
}
