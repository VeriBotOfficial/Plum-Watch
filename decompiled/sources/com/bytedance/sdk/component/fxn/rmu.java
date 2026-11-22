package com.bytedance.sdk.component.fxn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes13.dex */
public class rmu<K, V> {
    private final Map<K, V> fxn = new HashMap();
    private final Map<V, Set<K>> kg = new HashMap();

    public void fxn(Set<K> set, V v) {
        for (K k : set) {
            if (this.fxn.containsKey(k)) {
                kg(k);
            }
        }
        Set<K> set2 = this.kg.get(v);
        if (set2 == null) {
            set2 = new HashSet<>();
            this.kg.put(v, set2);
        }
        set2.addAll(set);
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
        V remove = this.fxn.remove(k);
        if (remove == null || (set = this.kg.get(remove)) == null) {
            return;
        }
        set.remove(k);
        if (set.isEmpty()) {
            this.kg.remove(remove);
        }
    }

    public void fxn() {
        this.fxn.clear();
        this.kg.clear();
    }
}
