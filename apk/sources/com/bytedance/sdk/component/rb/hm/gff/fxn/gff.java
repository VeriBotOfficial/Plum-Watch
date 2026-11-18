package com.bytedance.sdk.component.rb.hm.gff.fxn;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class gff<K, V> {
    private final LinkedHashMap<K, SoftReference<V>> fxn = new LinkedHashMap<>(0, 0.75f, true);
    private int kg;

    public gff(int r4) {
        this.kg = r4;
    }

    public synchronized V fxn(K k) {
        V v = null;
        if (k == null) {
            return null;
        }
        if (this.kg <= 0) {
            return null;
        }
        SoftReference<V> softReference = this.fxn.get(k);
        if (softReference != null) {
            v = softReference.get();
            if (v != null) {
                return v;
            }
            this.fxn.remove(k);
        }
        return v;
    }

    public synchronized void fxn(K k, V v) {
        if (this.kg <= 0) {
            return;
        }
        if (k == null || v == null) {
            return;
        }
        this.fxn.put(k, new SoftReference<>(v));
        int size = this.fxn.size();
        int r4 = this.kg;
        if (size > r4) {
            fxn((int) (((double) r4) * 0.7d));
        }
    }

    public synchronized void fxn(int r4) {
        int size = this.fxn.size() - r4;
        if (size > 0) {
            Iterator<Map.Entry<K, SoftReference<V>>> it = this.fxn.entrySet().iterator();
            for (int r2 = 0; r2 < size; r2++) {
                it.next();
                it.remove();
            }
        }
        if (r4 == 0) {
            return;
        }
        Iterator<Map.Entry<K, SoftReference<V>>> it2 = this.fxn.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxCount=%d,size=%d]", Integer.valueOf(this.kg), Integer.valueOf(this.fxn.size()));
    }
}
