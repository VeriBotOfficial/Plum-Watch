package com.umeng.commonsdk.statistics.idtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: AbstractIdTracker.java */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f13950a = 10;
    private final int b = 100;
    private final String c;
    private List<com.umeng.commonsdk.statistics.proto.a> d;
    private com.umeng.commonsdk.statistics.proto.b e;

    public abstract String f();

    public a(String str) {
        this.c = str;
    }

    public boolean a() {
        return g();
    }

    public String b() {
        return this.c;
    }

    public boolean c() {
        com.umeng.commonsdk.statistics.proto.b bVar = this.e;
        return bVar == null || bVar.h() <= 100;
    }

    private boolean g() {
        com.umeng.commonsdk.statistics.proto.b bVar = this.e;
        String b = bVar == null ? null : bVar.b();
        int h = bVar == null ? 0 : bVar.h();
        String a2 = a(f());
        if (a2 == null || a2.equals(b)) {
            return false;
        }
        if (bVar == null) {
            bVar = new com.umeng.commonsdk.statistics.proto.b();
        }
        bVar.a(a2);
        bVar.a(System.currentTimeMillis());
        bVar.a(h + 1);
        com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
        aVar.a(this.c);
        aVar.c(a2);
        aVar.b(b);
        aVar.a(bVar.e());
        if (this.d == null) {
            this.d = new ArrayList(2);
        }
        this.d.add(aVar);
        if (this.d.size() > 10) {
            this.d.remove(0);
        }
        this.e = bVar;
        return true;
    }

    public com.umeng.commonsdk.statistics.proto.b d() {
        return this.e;
    }

    public void a(com.umeng.commonsdk.statistics.proto.b bVar) {
        this.e = bVar;
    }

    public List<com.umeng.commonsdk.statistics.proto.a> e() {
        return this.d;
    }

    public void a(List<com.umeng.commonsdk.statistics.proto.a> list) {
        this.d = list;
    }

    public String a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0 || "0".equals(trim) || "unknown".equals(trim.toLowerCase(Locale.US))) {
            return null;
        }
        return trim;
    }

    public void a(com.umeng.commonsdk.statistics.proto.c cVar) {
        this.e = cVar.c().get(this.c);
        List<com.umeng.commonsdk.statistics.proto.a> h = cVar.h();
        if (h == null || h.size() <= 0) {
            return;
        }
        if (this.d == null) {
            this.d = new ArrayList();
        }
        for (com.umeng.commonsdk.statistics.proto.a aVar : h) {
            if (this.c.equals(aVar.f13969a)) {
                this.d.add(aVar);
            }
        }
    }
}
