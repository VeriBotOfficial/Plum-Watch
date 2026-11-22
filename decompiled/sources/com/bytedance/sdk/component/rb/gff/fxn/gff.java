package com.bytedance.sdk.component.rb.gff.fxn;

import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public class gff<K, V> {
    private int bh;
    private final LinkedHashMap<K, SoftReference<V>> fxn;
    private int gff;
    private int hm;
    private int kg;
    private int rb;

    /* renamed from: sg, reason: collision with root package name */
    private int f9381sg;
    private int tw;

    protected int kg(K k, V v) {
        return 1;
    }

    protected V kg(K k) {
        return null;
    }

    public gff(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.gff = i;
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
            V kg = kg(k);
            if (kg == null) {
                return null;
            }
            synchronized (this) {
                this.rb++;
                SoftReference<V> put = this.fxn.put(k, new SoftReference<>(kg));
                if (put != null) {
                    v = put.get();
                }
                if (v != null) {
                    this.fxn.put(k, put);
                } else {
                    this.kg += gff(k, kg);
                }
            }
            if (v != null) {
                return v;
            }
            fxn(this.gff);
            return kg;
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
            SoftReference<V> put = this.fxn.put(k, new SoftReference<>(v));
            if (put != null) {
                v2 = put.get();
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        android.util.Log.e("LruCache", "oom maybe occured, clear cache. size= " + r3.kg + ", maxSize: " + r4);
        r3.kg = 0;
        r3.fxn.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fxn(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.kg     // Catch: java.lang.Throwable -> L7c
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.fxn     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L12
            int r0 = r3.kg     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L12
            goto L52
        L12:
            int r0 = r3.kg     // Catch: java.lang.Throwable -> L7c
            if (r0 > r4) goto L18
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7c
            return
        L18:
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.fxn     // Catch: java.lang.Throwable -> L7c
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L7c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L7c
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L2c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7c
            return
        L2c:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L7c
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch: java.lang.Throwable -> L7c
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r2 = r3.fxn     // Catch: java.lang.Throwable -> L7c
            r2.remove(r1)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L7c
            int r2 = r3.kg     // Catch: java.lang.Throwable -> L7c
            int r0 = r3.gff(r1, r0)     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 - r0
            r3.kg = r2     // Catch: java.lang.Throwable -> L7c
        L4a:
            int r0 = r3.bh     // Catch: java.lang.Throwable -> L7c
            int r0 = r0 + 1
            r3.bh = r0     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7c
            goto L0
        L52:
            java.lang.String r0 = "LruCache"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = "oom maybe occured, clear cache. size= "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7c
            int r2 = r3.kg     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = ", maxSize: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r4 = r1.append(r4)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7c
            android.util.Log.e(r0, r4)     // Catch: java.lang.Throwable -> L7c
            r4 = 0
            r3.kg = r4     // Catch: java.lang.Throwable -> L7c
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r4 = r3.fxn     // Catch: java.lang.Throwable -> L7c
            r4.clear()     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7c
            return
        L7c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.rb.gff.fxn.gff.fxn(int):void");
    }

    private int gff(K k, V v) {
        int kg = kg(k, v);
        if (kg >= 0) {
            return kg;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f9381sg;
        i2 = this.tw + i;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.gff), Integer.valueOf(this.f9381sg), Integer.valueOf(this.tw), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
