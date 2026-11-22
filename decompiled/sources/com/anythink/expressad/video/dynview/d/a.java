package com.anythink.expressad.video.dynview.d;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class a<K, V> extends HashMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private ReferenceQueue<V> f5235a = new ReferenceQueue<>();
    private HashMap<K, a<K, V>.C0251a<K, V>> b = new HashMap<>();

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        a();
        a<K, V>.C0251a<K, V> c0251a = this.b.get(obj);
        if (c0251a == null) {
            return null;
        }
        return c0251a.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        a();
        a<K, V>.C0251a<K, V> put = this.b.put(k, new C0251a<>(k, v, this.f5235a));
        if (put == null) {
            return null;
        }
        return put.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        a();
        return this.b.containsKey(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        a();
        a<K, V>.C0251a<K, V> remove = this.b.remove(obj);
        if (remove == null) {
            return null;
        }
        return remove.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        a();
        return this.b.size();
    }

    private void a() {
        while (true) {
            C0251a c0251a = (C0251a) this.f5235a.poll();
            if (c0251a == null) {
                return;
            } else {
                this.b.remove(c0251a.f5236a);
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.d.a$a, reason: collision with other inner class name */
    private class C0251a<K, V> extends SoftReference<V> {

        /* renamed from: a, reason: collision with root package name */
        K f5236a;

        public C0251a(K k, V v, ReferenceQueue referenceQueue) {
            super(v, referenceQueue);
            this.f5236a = k;
        }
    }
}
