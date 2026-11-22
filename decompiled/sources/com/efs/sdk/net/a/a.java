package com.efs.sdk.net.a;

import java.util.HashMap;

/* loaded from: classes14.dex */
public final class a {
    private static a c;

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, c> f9945a;
    private HashMap<String, d> b;

    public static a a() {
        if (c == null) {
            c = new a();
        }
        return c;
    }

    private a() {
        b();
    }

    private void b() {
        if (this.f9945a == null) {
            this.f9945a = new HashMap<>();
        }
        this.f9945a.clear();
    }

    public final c a(String str) {
        if (this.f9945a == null) {
            b();
        }
        c cVar = this.f9945a.get(str);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        cVar2.f9955a = str;
        cVar2.b = System.currentTimeMillis();
        this.f9945a.put(str, cVar2);
        return cVar2;
    }

    public final void b(String str) {
        HashMap<String, c> hashMap = this.f9945a;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return;
        }
        this.f9945a.remove(str);
    }

    public final d c(String str) {
        if (this.b == null) {
            this.b = new HashMap<>();
        }
        if (this.b.containsKey(str)) {
            return this.b.get(str);
        }
        d dVar = new d();
        dVar.A = str;
        dVar.D = System.currentTimeMillis();
        this.b.put(str, dVar);
        return dVar;
    }

    public final void d(String str) {
        HashMap<String, d> hashMap = this.b;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return;
        }
        this.b.remove(str);
    }
}
