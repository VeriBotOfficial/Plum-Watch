package com.bytedance.adsdk.kg;

import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes13.dex */
public class zu<K, V> {
    private int bh;
    private final LinkedHashMap<K, V> fxn;
    private int gff;
    private int hm;
    private int kg;
    private int rb;

    /* renamed from: sg, reason: collision with root package name */
    private int f9270sg;
    private int tw;

    protected int kg(K k, V v) {
        return 1;
    }

    protected V kg(K k) {
        return null;
    }

    public zu(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.gff = i;
        this.fxn = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V fxn(K k) {
        V put;
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
            V kg = kg(k);
            if (kg == null) {
                return null;
            }
            synchronized (this) {
                this.rb++;
                put = this.fxn.put(k, kg);
                if (put != null) {
                    this.fxn.put(k, put);
                } else {
                    this.kg += gff(k, kg);
                }
            }
            if (put != null) {
                return put;
            }
            fxn(this.gff);
            return kg;
        }
    }

    public final V fxn(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.hm++;
            this.kg += gff(k, v);
            put = this.fxn.put(k, v);
            if (put != null) {
                this.kg -= gff(k, put);
            }
        }
        fxn(this.gff);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006e, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
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
            int r0 = r3.kg     // Catch: java.lang.Throwable -> L6f
            if (r0 < 0) goto L4e
            java.util.LinkedHashMap<K, V> r0 = r3.fxn     // Catch: java.lang.Throwable -> L6f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L11
            int r0 = r3.kg     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L4e
        L11:
            int r0 = r3.kg     // Catch: java.lang.Throwable -> L6f
            if (r0 <= r4) goto L4c
            java.util.LinkedHashMap<K, V> r0 = r3.fxn     // Catch: java.lang.Throwable -> L6f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L1e
            goto L4c
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r3.fxn     // Catch: java.lang.Throwable -> L6f
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L6f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L6f
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L6f
            java.util.LinkedHashMap<K, V> r2 = r3.fxn     // Catch: java.lang.Throwable -> L6f
            r2.remove(r1)     // Catch: java.lang.Throwable -> L6f
            int r2 = r3.kg     // Catch: java.lang.Throwable -> L6f
            int r0 = r3.gff(r1, r0)     // Catch: java.lang.Throwable -> L6f
            int r2 = r2 - r0
            r3.kg = r2     // Catch: java.lang.Throwable -> L6f
            int r0 = r3.bh     // Catch: java.lang.Throwable -> L6f
            int r0 = r0 + 1
            r3.bh = r0     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6f
            goto L0
        L4c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6f
            return
        L4e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r0.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L6f
            throw r4     // Catch: java.lang.Throwable -> L6f
        L6f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.kg.zu.fxn(int):void");
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
        i = this.f9270sg;
        i2 = this.tw + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.gff), Integer.valueOf(this.f9270sg), Integer.valueOf(this.tw), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
