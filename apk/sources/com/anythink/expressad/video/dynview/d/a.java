package com.anythink.expressad.video.dynview.d;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public final class a<K, V> extends HashMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ReferenceQueue<V> f5235a = new ReferenceQueue<>();
    private HashMap<K, a<K, V>.C0338a<K, V>> b = new HashMap<>();

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        a();
        a<K, V>.C0338a<K, V> c0338a = this.b.get(obj);
        if (c0338a == null) {
            return null;
        }
        return c0338a.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        a();
        a<K, V>.C0338a<K, V> c0338aPut = this.b.put(k, new C0338a<>(k, v, this.f5235a));
        if (c0338aPut == null) {
            return null;
        }
        return c0338aPut.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        a();
        return this.b.containsKey(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        a();
        a<K, V>.C0338a<K, V> c0338aRemove = this.b.remove(obj);
        if (c0338aRemove == null) {
            return null;
        }
        return c0338aRemove.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        a();
        return this.b.size();
    }

    private void a() {
        while (true) {
            C0338a c0338a = (C0338a) this.f5235a.poll();
            if (c0338a == null) {
                return;
            } else {
                this.b.remove(c0338a.f5236a);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.d.a$a, reason: collision with other inner class name */
    private class C0338a<K, V> extends SoftReference<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        K f5236a;

        public C0338a(K k, V v, ReferenceQueue referenceQueue) {
            super(v, referenceQueue);
            this.f5236a = k;
        }
    }
}
