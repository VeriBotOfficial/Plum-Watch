package com.baidu.bdhttpdns;

import android.util.LruCache;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f7455a;
    private final LruCache<String, a> b = new LruCache<>(((int) Runtime.getRuntime().maxMemory()) / 16);
    private boolean c;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private ArrayList<String> f7456a;
        private ArrayList<String> b;
        private long c;
        private long d;

        a() {
        }

        public void a(long j) {
            this.c = j;
        }

        public void a(ArrayList<String> arrayList) {
            this.f7456a = arrayList;
        }

        public boolean a() {
            return e() + this.c < System.currentTimeMillis() / 1000;
        }

        public ArrayList<String> b() {
            return this.f7456a;
        }

        public void b(long j) {
            this.d = j;
        }

        public void b(ArrayList<String> arrayList) {
            this.b = arrayList;
        }

        public ArrayList<String> c() {
            return this.b;
        }

        public long d() {
            return this.c;
        }

        public long e() {
            return this.d;
        }
    }

    h(String str, boolean z) {
        this.c = false;
        this.f7455a = str;
        this.c = z;
    }

    a a(String str) {
        a aVar = this.b.get(str);
        if (aVar == null || !aVar.a() || !this.c) {
            return aVar;
        }
        this.b.remove(str);
        l.a("Remove expired entry from %s cache while reading, host(%s)", this.f7455a, str);
        return null;
    }

    void a() {
        this.b.evictAll();
        l.a("Clear %s cache", this.f7455a);
    }

    void a(String str, a aVar) {
        ArrayList<String> b = aVar.b();
        ArrayList<String> c = aVar.c();
        if ((b == null || b.isEmpty()) && (c == null || c.isEmpty())) {
            return;
        }
        this.b.put(str, aVar);
        l.a("Set entry to %s cache, host(%s), ipv4List(%s), ipv6List(%s), ttl(%d)", this.f7455a, str, b != null ? b.toString() : null, c != null ? c.toString() : null, Long.valueOf(aVar.d()));
    }

    void a(boolean z) {
        this.c = z;
    }

    ArrayList<String> b() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it = this.b.snapshot().keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    void b(String str) {
        a a2 = a(str);
        if (a2 == null || !a2.a()) {
            return;
        }
        this.b.remove(str);
        l.a("Remove expired entry from %s cache, host(%s)", this.f7455a, str);
    }
}
