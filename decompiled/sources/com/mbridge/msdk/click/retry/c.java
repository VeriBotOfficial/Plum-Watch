package com.mbridge.msdk.click.retry;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* compiled from: WaitRetryLruMemoryCache.java */
/* loaded from: classes17.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, b> f11343a;
    private final int b;
    private int c;

    public c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.b = i;
        this.f11343a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int b(String str, b bVar) {
        return 1;
    }

    public final b a(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            b bVar = this.f11343a.get(str);
            if (bVar != null) {
                return bVar;
            }
            return null;
        }
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            b remove = this.f11343a.remove(str);
            if (remove != null) {
                this.c -= b(str, remove);
            }
        }
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.b));
    }

    public final boolean a(String str, b bVar) {
        if (str != null && bVar != null) {
            synchronized (this) {
                this.c += b(str, bVar);
                b put = this.f11343a.put(str, bVar);
                if (put != null) {
                    this.c -= b(str, put);
                }
            }
            a(this.b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.c     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L50
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.retry.b> r0 = r3.f11343a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r3.c     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L50
        L11:
            int r0 = r3.c     // Catch: java.lang.Throwable -> L71
            if (r0 <= r4) goto L4e
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.retry.b> r0 = r3.f11343a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L4e
        L1e:
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.retry.b> r0 = r3.f11343a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L32
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            goto L4f
        L32:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            com.mbridge.msdk.click.retry.b r0 = (com.mbridge.msdk.click.retry.b) r0     // Catch: java.lang.Throwable -> L71
            int r0 = r3.b(r1, r0)     // Catch: java.lang.Throwable -> L4c
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.retry.b> r2 = r3.f11343a     // Catch: java.lang.Throwable -> L4c
            r2.remove(r1)     // Catch: java.lang.Throwable -> L4c
            int r1 = r3.c     // Catch: java.lang.Throwable -> L4c
            int r1 = r1 - r0
            r3.c = r1     // Catch: java.lang.Throwable -> L4c
        L4c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            goto L0
        L4e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
        L4f:
            return
        L50:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r4     // Catch: java.lang.Throwable -> L71
        L71:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.retry.c.a(int):void");
    }

    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f11343a.keySet());
        }
        return hashSet;
    }
}
