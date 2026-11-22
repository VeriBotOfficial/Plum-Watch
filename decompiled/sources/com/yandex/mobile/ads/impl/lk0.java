package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@DoNotMock("Use ImmutableMap.of or another implementation")
/* loaded from: classes5.dex */
public abstract class lk0<K, V> implements Map<K, V>, Serializable {

    @CheckForNull
    @LazyInit
    private transient mk0<Map.Entry<K, V>> b;

    @CheckForNull
    @LazyInit
    private transient mk0<K> c;

    @CheckForNull
    @LazyInit
    private transient ik0<V> d;

    public static <K, V> lk0<K, V> g() {
        return (lk0<K, V>) mo1.h;
    }

    abstract mk0<Map.Entry<K, V>> b();

    abstract mk0<K> c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    abstract ik0<V> d();

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    Object writeReplace() {
        return new b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static lk0 a(HashMap hashMap) {
        if ((hashMap instanceof lk0) && !(hashMap instanceof SortedMap)) {
            lk0 lk0Var = (lk0) hashMap;
            lk0Var.getClass();
            return lk0Var;
        }
        Set<Map.Entry> entrySet = hashMap.entrySet();
        boolean z = entrySet instanceof Collection;
        a aVar = new a(z ? entrySet.size() : 4);
        if (z) {
            aVar.a(entrySet.size());
        }
        for (Map.Entry entry : entrySet) {
            aVar.a(entry.getKey(), entry.getValue());
        }
        return mo1.a(aVar.b, aVar.f16134a);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((mk0) entrySet()).equals(((Map) obj).entrySet());
    }

    public final String toString() {
        int size = size();
        pq.a(size, "size");
        StringBuilder append = new StringBuilder((int) Math.min(size * 8, 1073741824L)).append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                append.append(", ");
            }
            append.append(entry.getKey()).append(com.alipay.sdk.m.p.a.h).append(entry.getValue());
            z = false;
        }
        return append.append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static <K, V> a<K, V> a() {
        return new a<>(4);
    }

    @DoNotMock
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        Object[] f16134a;
        int b;

        public a() {
            this(4);
        }

        public final lk0<K, V> a() {
            return mo1.a(this.b, this.f16134a);
        }

        a(int i) {
            this.f16134a = new Object[i * 2];
            this.b = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f16134a;
            if (i2 > objArr.length) {
                int length = objArr.length;
                if (i2 >= 0) {
                    int i3 = length + (length >> 1) + 1;
                    if (i3 < i2) {
                        i3 = Integer.highestOneBit(i2 - 1) << 1;
                    }
                    if (i3 < 0) {
                        i3 = Integer.MAX_VALUE;
                    }
                    this.f16134a = Arrays.copyOf(objArr, i3);
                    return;
                }
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }

        public final a<K, V> a(K k, V v) {
            a(this.b + 1);
            if (k == null) {
                throw new NullPointerException("null key in entry: null=" + v);
            }
            if (v != null) {
                Object[] objArr = this.f16134a;
                int i = this.b;
                int i2 = i * 2;
                objArr[i2] = k;
                objArr[i2 + 1] = v;
                this.b = i + 1;
                return this;
            }
            throw new NullPointerException("null value in entry: " + k + "=null");
        }
    }

    lk0() {
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final mk0<Map.Entry<K, V>> entrySet() {
        mk0<Map.Entry<K, V>> mk0Var = this.b;
        if (mk0Var != null) {
            return mk0Var;
        }
        mk0<Map.Entry<K, V>> b2 = b();
        this.b = b2;
        return b2;
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final mk0<K> keySet() {
        mk0<K> mk0Var = this.c;
        if (mk0Var != null) {
            return mk0Var;
        }
        mk0<K> c = c();
        this.c = c;
        return c;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final ik0<V> values() {
        ik0<V> ik0Var = this.d;
        if (ik0Var != null) {
            return ik0Var;
        }
        ik0<V> d = d();
        this.d = d;
        return d;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return wx1.a(entrySet());
    }

    static class b<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object[] b;
        private final Object[] c;

        b(lk0<K, V> lk0Var) {
            Object[] objArr = new Object[lk0Var.size()];
            Object[] objArr2 = new Object[lk0Var.size()];
            i82<Map.Entry<K, V>> it = lk0Var.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.b = objArr;
            this.c = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final Object readResolve() {
            Object[] objArr = this.b;
            if (!(objArr instanceof mk0)) {
                Object[] objArr2 = this.c;
                a aVar = new a(objArr.length);
                for (int i = 0; i < objArr.length; i++) {
                    aVar.a(objArr[i], objArr2[i]);
                }
                return mo1.a(aVar.b, aVar.f16134a);
            }
            mk0 mk0Var = (mk0) objArr;
            ik0 ik0Var = (ik0) this.c;
            a aVar2 = new a(mk0Var.size());
            Iterator it = mk0Var.iterator();
            i82 it2 = ik0Var.iterator();
            while (it.hasNext()) {
                aVar2.a(it.next(), it2.next());
            }
            return mo1.a(aVar2.b, aVar2.f16134a);
        }
    }
}
