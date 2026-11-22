package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.o;
import com.yandex.mobile.ads.impl.wx1;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
abstract class eu0<K, V> extends wx1.c<Map.Entry<K, V>> {
    @Override // com.yandex.mobile.ads.impl.wx1.c, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator<?> it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= ((o.a.C0980a) this).remove(it.next());
            }
            return z;
        }
    }

    @Override // com.yandex.mobile.ads.impl.wx1.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        int i;
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                pq.a(size, "expectedSize");
                i = size + 1;
            } else {
                i = size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object obj : collection) {
                Set<Map.Entry<K, Collection<V>>> entrySet = o.a.this.d.entrySet();
                entrySet.getClass();
                try {
                    if (entrySet.contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return o.a.this.keySet().retainAll(hashSet);
        }
    }

    eu0() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return o.a.this.d.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        o.a.this.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return o.a.this.isEmpty();
    }
}
