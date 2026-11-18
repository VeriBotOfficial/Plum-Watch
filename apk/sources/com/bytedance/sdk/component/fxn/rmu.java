package com.bytedance.sdk.component.fxn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes15.dex */
public class rmu<K, V> {
    private final Map<K, V> fxn = new HashMap();
    private final Map<V, Set<K>> kg = new HashMap();

    public void fxn(Set<K> set, V v) {
        for (K k : set) {
            if (this.fxn.containsKey(k)) {
                kg(k);
            }
        }
        Set<K> hashSet = this.kg.get(v);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.kg.put(v, hashSet);
        }
        hashSet.addAll(set);
        Iterator<K> it = set.iterator();
        while (it.hasNext()) {
            this.fxn.put(it.next(), v);
        }
    }

    public V fxn(K k) {
        return this.fxn.get(k);
    }

    public void kg(K k) {
        Set<K> set;
        V vRemove = this.fxn.remove(k);
        if (vRemove == null || (set = this.kg.get(vRemove)) == null) {
            return;
        }
        set.remove(k);
        if (set.isEmpty()) {
            this.kg.remove(vRemove);
        }
    }

    public void fxn() {
        this.fxn.clear();
        this.kg.clear();
    }
}
