package com.bytedance.adsdk.kg;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class zu<K, V> {
    private int bh;
    private final LinkedHashMap<K, V> fxn;
    private int gff;
    private int hm;
    private int kg;
    private int rb;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private int f9270sg;
    private int tw;

    protected int kg(K k, V v) {
        return 1;
    }

    protected V kg(K k) {
        return null;
    }

    public zu(int r4) {
        if (r4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.gff = r4;
        this.fxn = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V fxn(K k) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.fxn.get(k);
            if (v != null) {
                this.f9270sg++;
                return v;
            }
            this.tw++;
            V vKg = kg(k);
            if (vKg == null) {
                return null;
            }
            synchronized (this) {
                this.rb++;
                vPut = this.fxn.put(k, vKg);
                if (vPut != null) {
                    this.fxn.put(k, vPut);
                } else {
                    this.kg += gff(k, vKg);
                }
            }
            if (vPut != null) {
                return vPut;
            }
            fxn(this.gff);
            return vKg;
        }
    }

    public final V fxn(K k, V v) {
        V vPut;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.hm++;
            this.kg += gff(k, v);
            vPut = this.fxn.put(k, v);
            if (vPut != null) {
                this.kg -= gff(k, vPut);
            }
        }
        fxn(this.gff);
        return vPut;
    }

    public void fxn(int r4) {
        while (true) {
            synchronized (this) {
                if (this.kg < 0 || (this.fxn.isEmpty() && this.kg != 0)) {
                    break;
                }
                if (this.kg > r4 && !this.fxn.isEmpty()) {
                    Map.Entry<K, V> next = this.fxn.entrySet().iterator().next();
                    K key = next.getKey();
                    V value = next.getValue();
                    this.fxn.remove(key);
                    this.kg -= gff(key, value);
                    this.bh++;
                }
                return;
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    private int gff(K k, V v) {
        int r0 = kg(k, v);
        if (r0 >= 0) {
            return r0;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public final synchronized String toString() {
        int r0;
        int r1;
        r0 = this.f9270sg;
        r1 = this.tw + r0;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.gff), Integer.valueOf(this.f9270sg), Integer.valueOf(this.tw), Integer.valueOf(r1 != 0 ? (r0 * 100) / r1 : 0));
    }
}
