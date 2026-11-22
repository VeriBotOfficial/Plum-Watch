package com.mbridge.msdk.foundation.same.buffer;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* compiled from: LruReplaceTempCache.java */
/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, JSONObject> f11561a;
    private final int b;
    private int c;

    public a(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.b = i;
        this.f11561a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int b(String str, JSONObject jSONObject) {
        return 1;
    }

    public final boolean a(String str, JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.c += b(str, jSONObject);
            JSONObject put = this.f11561a.put(str, jSONObject);
            if (put != null) {
                this.c -= b(str, put);
            }
        }
        a(this.b);
        return true;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.b));
    }

    public final JSONObject a(String str) {
        JSONObject jSONObject;
        if (str != null) {
            synchronized (this) {
                jSONObject = this.f11561a.get(str);
            }
            return jSONObject;
        }
        throw new NullPointerException("key == null");
    }

    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f11561a.keySet());
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0073, code lost:
    
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
            int r0 = r3.c     // Catch: java.lang.Throwable -> L74
            if (r0 < 0) goto L53
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r3.f11561a     // Catch: java.lang.Throwable -> L74
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L11
            int r0 = r3.c     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L53
        L11:
            int r0 = r3.c     // Catch: java.lang.Throwable -> L74
            if (r0 <= r4) goto L51
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r3.f11561a     // Catch: java.lang.Throwable -> L74
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L1e
            goto L51
        L1e:
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r3.f11561a     // Catch: java.lang.Throwable -> L74
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L74
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L74
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L74
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L32
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L74
            goto L52
        L32:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L74
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L74
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L74
            int r0 = r3.b(r1, r0)     // Catch: java.lang.Throwable -> L4f
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r2 = r3.f11561a     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r1 = r2.remove(r1)     // Catch: java.lang.Throwable -> L4f
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> L4f
            int r1 = r3.c     // Catch: java.lang.Throwable -> L4f
            int r1 = r1 - r0
            r3.c = r1     // Catch: java.lang.Throwable -> L4f
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L74
            goto L0
        L51:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L74
        L52:
            return
        L53:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r0.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L74
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L74
            throw r4     // Catch: java.lang.Throwable -> L74
        L74:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L74
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.buffer.a.a(int):void");
    }
}
