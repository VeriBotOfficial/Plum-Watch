package com.anythink.core.common.res;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class c<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f4299a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    private static V b() {
        return null;
    }

    protected int a(K k, V v) {
        return 1;
    }

    protected void a(boolean z, K k, V v, V v2) {
    }

    public c(int r4) {
        if (r4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.c = r4;
        this.f4299a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private void a(int r2) {
        if (r2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.c = r2;
        }
        b(r2);
    }

    public final V a(K k) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.f4299a.get(k);
            if (v != null) {
                this.g++;
                return v;
            }
            this.h++;
            return null;
        }
    }

    public final V b(K k, V v) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.d++;
            this.b += c(k, v);
            vPut = this.f4299a.put(k, v);
            if (vPut != null) {
                this.b -= c(k, vPut);
            }
        }
        if (vPut != null) {
            a(false, k, vPut, v);
        }
        b(this.c);
        return vPut;
    }

    private void b(int r6) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                try {
                    if (this.b < 0 || (this.f4299a.isEmpty() && this.b != 0)) {
                        break;
                    }
                    if (this.b <= r6) {
                        return;
                    }
                    Map.Entry<K, V> next = this.f4299a.entrySet().size() > 0 ? this.f4299a.entrySet().iterator().next() : null;
                    if (next == null) {
                        return;
                    }
                    key = next.getKey();
                    value = next.getValue();
                    this.f4299a.remove(key);
                    this.b -= c(key, value);
                    this.f++;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            a(true, key, value, null);
        }
        this.b = 0;
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results! --> size: " + this.b + ", map.isEmpty(): " + this.f4299a.isEmpty());
    }

    private V b(K k) {
        V vRemove;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            vRemove = this.f4299a.remove(k);
            if (vRemove != null) {
                this.b -= c(k, vRemove);
            }
        }
        if (vRemove != null) {
            a(false, k, vRemove, null);
        }
        return vRemove;
    }

    private int c(K k, V v) {
        int r0 = a(k, v);
        if (r0 >= 0) {
            return r0;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public final void a() {
        b(-1);
    }

    private synchronized int c() {
        return this.b;
    }

    private synchronized int d() {
        return this.c;
    }

    private synchronized int e() {
        return this.g;
    }

    private synchronized int f() {
        return this.h;
    }

    private synchronized int g() {
        return this.e;
    }

    private synchronized int h() {
        return this.d;
    }

    private synchronized int i() {
        return this.f;
    }

    private synchronized Map<K, V> j() {
        return new LinkedHashMap(this.f4299a);
    }

    public final synchronized String toString() {
        int r0;
        int r1;
        r0 = this.g;
        r1 = this.h + r0;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(r1 != 0 ? (r0 * 100) / r1 : 0));
    }

    private void k() {
        K key;
        V value;
        synchronized (this.f4299a) {
            while (true) {
                synchronized (this) {
                    if (this.b < 0 || (this.f4299a.isEmpty() && this.b != 0)) {
                        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
                    }
                    if (this.b != 0) {
                        Map.Entry<K, V> next = this.f4299a.entrySet().size() > 0 ? this.f4299a.entrySet().iterator().next() : null;
                        if (next != null) {
                            key = next.getKey();
                            value = next.getValue();
                            this.f4299a.remove(key);
                            this.b -= c(key, value);
                            this.f++;
                        }
                    }
                }
                a(true, key, value, null);
            }
            this.f4299a.clear();
        }
    }
}
