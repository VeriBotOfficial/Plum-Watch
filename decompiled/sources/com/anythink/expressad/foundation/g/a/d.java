package com.anythink.expressad.foundation.g.a;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class d implements e<String, JSONObject> {
    private int c;
    private final int b = 1000;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, JSONObject> f4832a = new LinkedHashMap<>(0, 0.75f, true);

    private static int c() {
        return 1;
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final /* synthetic */ void a(String str) {
        String str2 = str;
        if (str2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            if (this.f4832a.remove(str2) != null) {
                this.c--;
            }
        }
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final JSONObject b(String str) {
        JSONObject jSONObject;
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            jSONObject = this.f4832a.get(str);
        }
        return jSONObject;
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final boolean a(String str, JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.c++;
            if (this.f4832a.put(str, jSONObject) != null) {
                this.c--;
            }
        }
        a(this.b);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.c     // Catch: java.lang.Throwable -> L6b
            if (r0 < 0) goto L4a
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f4832a     // Catch: java.lang.Throwable -> L6b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L11
            int r0 = r2.c     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L4a
        L11:
            int r0 = r2.c     // Catch: java.lang.Throwable -> L6b
            if (r0 <= r3) goto L48
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f4832a     // Catch: java.lang.Throwable -> L6b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L1e
            goto L48
        L1e:
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f4832a     // Catch: java.lang.Throwable -> L6b
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L6b
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L32
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
            goto L49
        L32:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L6b
            r0.getValue()     // Catch: java.lang.Throwable -> L6b
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f4832a     // Catch: java.lang.Throwable -> L46
            r0.remove(r1)     // Catch: java.lang.Throwable -> L46
            int r0 = r2.c     // Catch: java.lang.Throwable -> L46
            int r0 = r0 + (-1)
            r2.c = r0     // Catch: java.lang.Throwable -> L46
        L46:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
            goto L0
        L48:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
        L49:
            return
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r0.<init>()     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L6b
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6b
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            throw r3     // Catch: java.lang.Throwable -> L6b
        L6b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.g.a.d.a(int):void");
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    private void b2(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            if (this.f4832a.remove(str) != null) {
                this.c--;
            }
        }
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f4832a.keySet());
        }
        return hashSet;
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final void b() {
        a(-1);
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.b));
    }
}
