package com.anythink.expressad.foundation.g.g.a;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class e implements Serializable, Cloneable {
    private boolean A;
    private com.anythink.expressad.foundation.d.d B;
    private List<com.anythink.expressad.foundation.d.d> C;

    /* renamed from: a, reason: collision with root package name */
    private boolean f4904a;
    private Map<String, Map<String, String>> b;
    private Map<String, Map<String, String>> c;
    private Map<String, Long> d;
    private com.anythink.expressad.foundation.e.c e;
    private String f;
    private List<com.anythink.expressad.foundation.d.d> g;
    private long h;
    private String i;
    private int j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;

    /* renamed from: q, reason: collision with root package name */
    private String f4905q;
    private String r;
    private String s;
    private String t;
    private String u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    private static void u() {
    }

    public e() {
        this.f4904a = false;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = "";
        this.v = -1;
        this.x = false;
        this.z = false;
    }

    private e(boolean z) {
        this.f4904a = false;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = "";
        this.v = -1;
        this.x = false;
        this.z = false;
        this.f4904a = z;
    }

    private boolean c() {
        return this.f4904a;
    }

    private boolean d() {
        return this.x;
    }

    private void a(boolean z) {
        this.x = z;
    }

    public final void a() {
        this.v = 2;
    }

    private int e() {
        return this.v;
    }

    private void a(String str) {
        this.u = str;
    }

    private String f() {
        return this.u;
    }

    private String g() {
        return this.t;
    }

    private void b(String str) {
        this.t = str;
    }

    private List<com.anythink.expressad.foundation.d.d> h() {
        return this.g;
    }

    private void a(List<com.anythink.expressad.foundation.d.d> list) {
        this.g = list;
    }

    private String i() {
        return this.f;
    }

    private void c(String str) {
        this.f = str;
    }

    private com.anythink.expressad.foundation.d.d j() {
        return this.B;
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        this.B = dVar;
    }

    private List<com.anythink.expressad.foundation.d.d> k() {
        return this.C;
    }

    private void b(List<com.anythink.expressad.foundation.d.d> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.C = list;
    }

    private long l() {
        return this.h;
    }

    private void a(long j) {
        this.h = j;
    }

    private String m() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.i)) {
            return this.i;
        }
        try {
            if (TextUtils.isEmpty(this.i)) {
                String str = this.f + this.u;
                Map<String, Map<String, String>> map2 = this.b;
                if (map2 != null && map2.containsKey(str) && (map = this.b.get(str)) != null && map.containsKey("unit_id")) {
                    this.i = map.get("unit_id");
                }
            }
        } catch (Exception e) {
            if (com.anythink.expressad.a.f4564a) {
                e.printStackTrace();
            }
        }
        return this.i;
    }

    private void d(String str) {
        this.i = str;
    }

    private int n() {
        return this.j;
    }

    public final void b() {
        this.j = 297;
    }

    private String o() {
        return this.k;
    }

    private void e(String str) {
        this.k = str;
    }

    private String p() {
        return this.l;
    }

    private void f(String str) {
        this.l = str;
    }

    private String q() {
        return this.n;
    }

    private void g(String str) {
        this.n = str;
    }

    private String r() {
        return this.f4905q;
    }

    private void h(String str) {
        this.f4905q = str;
    }

    private int s() {
        return this.w;
    }

    public final void a(int i) {
        this.w = i;
    }

    private String t() {
        return this.r;
    }

    private void i(String str) {
        this.r = str;
    }

    private Map<String, String> j(String str) {
        com.anythink.expressad.foundation.e.c cVar;
        com.anythink.expressad.foundation.e.c cVar2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        f fVar = new f();
        try {
            this.u = str;
            fVar.a("ts", Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(m())) {
                fVar.a("unit_id", m());
            }
            int i = this.j;
            if (i != 0) {
                fVar.a(b.e, Integer.valueOf(i));
            }
            if (!TextUtils.isEmpty(this.r)) {
                fVar.a("hb", this.r);
            }
            if (!TextUtils.isEmpty(this.k)) {
                fVar.a(b.f4899q, this.k);
            }
            if (!TextUtils.isEmpty(str)) {
                fVar.a("key", str);
            }
            if (Arrays.asList(d.l).contains(str)) {
                fVar.a(b.aR, this.x ? "1" : "2");
            }
            if (c.D.contains(str) && (cVar2 = this.e) != null) {
                fVar.a("type", Integer.valueOf(cVar2.d()));
                fVar.a("reason", cVar2.a());
                if (!TextUtils.isEmpty(cVar2.f())) {
                    fVar.a(b.am, cVar2.f());
                    fVar.a(b.al, Integer.valueOf(cVar2.e()));
                }
            }
            if (c.E.contains(str) && (cVar = this.e) != null && !TextUtils.isEmpty(cVar.f())) {
                fVar.a("type", Integer.valueOf(cVar.e()));
                fVar.a("reason", cVar.f());
            }
        } catch (Exception e) {
            if (com.anythink.expressad.a.f4564a) {
                e.printStackTrace();
            }
        }
        return fVar.a();
    }

    public final void a(String str, f fVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f + str;
            Map<String, Map<String, String>> map2 = this.b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.b.get(str2)) != null) {
                    map.putAll(fVar.a());
                } else {
                    this.b.put(str2, fVar.a());
                }
            }
        } catch (Exception e) {
            if (com.anythink.expressad.a.f4564a) {
                e.printStackTrace();
            }
        }
    }

    private void a(String str, f fVar, int i) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || fVar == null) {
            return;
        }
        try {
            String str2 = this.f + "_" + i + "_" + str;
            Map<String, Map<String, String>> map2 = this.c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.c.get(str2)) != null) {
                    map.putAll(fVar.a());
                } else {
                    this.c.put(str2, fVar.a());
                }
            }
        } catch (Exception e) {
            if (com.anythink.expressad.a.f4564a) {
                e.printStackTrace();
            }
        }
    }

    private void k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f + str;
            Map<String, Map<String, String>> map = this.b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.b.remove(str2);
        } catch (Exception e) {
            if (com.anythink.expressad.a.f4564a) {
                e.printStackTrace();
            }
        }
    }

    private void v() {
        Map<String, Map<String, String>> map = this.b;
        if (map != null) {
            map.clear();
        }
        Map<String, Map<String, String>> map2 = this.c;
        if (map2 != null) {
            map2.clear();
        }
        List<com.anythink.expressad.foundation.d.d> list = this.C;
        if (list != null) {
            list.clear();
        }
        this.f = "";
    }

    private long l(String str) {
        Map<String, Long> map;
        try {
            if (!TextUtils.isEmpty(str) && (map = this.d) != null && map.containsKey(str)) {
                Long l = this.d.get(str);
                return System.currentTimeMillis() - (l != null ? l.longValue() : 0L);
            }
        } catch (Exception e) {
            if (com.anythink.expressad.a.f4564a) {
                e.printStackTrace();
            }
        }
        return 0L;
    }

    private void m(String str) {
        if (this.d == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.d.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    private com.anythink.expressad.foundation.e.c w() {
        return this.e;
    }

    private void a(com.anythink.expressad.foundation.e.c cVar) {
        this.e = cVar;
    }

    private Map<String, Map<String, String>> x() {
        return this.b;
    }

    private Map<String, Map<String, String>> y() {
        return this.c;
    }

    private boolean z() {
        return this.y;
    }

    private void b(boolean z) {
        this.y = z;
    }

    private boolean A() {
        return this.z;
    }

    private void c(boolean z) {
        this.z = z;
    }

    private boolean B() {
        return this.A;
    }

    private void d(boolean z) {
        this.A = z;
    }

    private String C() {
        return this.o;
    }

    private void n(String str) {
        this.o = str;
    }

    public final Object clone() {
        return super.clone();
    }
}
