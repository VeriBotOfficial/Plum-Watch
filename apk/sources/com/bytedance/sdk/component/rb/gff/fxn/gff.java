package com.bytedance.sdk.component.rb.gff.fxn;

import android.util.Log;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class gff<K, V> {
    private int bh;
    private final LinkedHashMap<K, SoftReference<V>> fxn;
    private int gff;
    private int hm;
    private int kg;
    private int rb;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private int f9381sg;
    private int tw;

    protected int kg(K k, V v) {
        return 1;
    }

    protected V kg(K k) {
        return null;
    }

    public gff(int r4) {
        if (r4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.gff = r4;
        this.fxn = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V fxn(K k) {
        V v;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            SoftReference<V> softReference = this.fxn.get(k);
            if (softReference != null) {
                v = softReference.get();
                if (v != null) {
                    this.f9381sg++;
                    return v;
                }
                this.fxn.remove(k);
            } else {
                v = null;
            }
            this.tw++;
            V vKg = kg(k);
            if (vKg == null) {
                return null;
            }
            synchronized (this) {
                this.rb++;
                SoftReference<V> softReferencePut = this.fxn.put(k, new SoftReference<>(vKg));
                if (softReferencePut != null) {
                    v = softReferencePut.get();
                }
                if (v != null) {
                    this.fxn.put(k, softReferencePut);
                } else {
                    this.kg += gff(k, vKg);
                }
            }
            if (v != null) {
                return v;
            }
            fxn(this.gff);
            return vKg;
        }
    }

    public final V fxn(K k, V v) {
        V v2;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.hm++;
            this.kg += gff(k, v);
            SoftReference<V> softReferencePut = this.fxn.put(k, new SoftReference<>(v));
            if (softReferencePut != null) {
                v2 = softReferencePut.get();
                if (v2 != null) {
                    this.kg -= gff(k, v2);
                }
            } else {
                v2 = null;
            }
        }
        fxn(this.gff);
        return v2;
    }

    public void fxn(int r4) {
        while (true) {
            synchronized (this) {
                if (this.kg < 0 || (this.fxn.isEmpty() && this.kg != 0)) {
                    break;
                    break;
                }
                if (this.kg <= r4) {
                    return;
                }
                Map.Entry<K, SoftReference<V>> next = this.fxn.entrySet().iterator().next();
                if (next == null) {
                    return;
                }
                K key = next.getKey();
                SoftReference<V> value = next.getValue();
                this.fxn.remove(key);
                if (value != null) {
                    this.kg -= gff(key, value.get());
                }
                this.bh++;
            }
        }
        Log.e("LruCache", "oom maybe occured, clear cache. size= " + this.kg + ", maxSize: " + r4);
        this.kg = 0;
        this.fxn.clear();
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
        r0 = this.f9381sg;
        r1 = this.tw + r0;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.gff), Integer.valueOf(this.f9381sg), Integer.valueOf(this.tw), Integer.valueOf(r1 != 0 ? (r0 * 100) / r1 : 0));
    }
}
