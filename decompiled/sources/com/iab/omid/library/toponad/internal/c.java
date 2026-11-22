package com.iab.omid.library.toponad.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes17.dex */
public class c {
    private static c c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.toponad.adsession.a> f11005a = new ArrayList<>();
    private final ArrayList<com.iab.omid.library.toponad.adsession.a> b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return c;
    }

    public Collection<com.iab.omid.library.toponad.adsession.a> a() {
        return Collections.unmodifiableCollection(this.b);
    }

    public void a(com.iab.omid.library.toponad.adsession.a aVar) {
        this.f11005a.add(aVar);
    }

    public Collection<com.iab.omid.library.toponad.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f11005a);
    }

    public void b(com.iab.omid.library.toponad.adsession.a aVar) {
        boolean d = d();
        this.f11005a.remove(aVar);
        this.b.remove(aVar);
        if (!d || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.toponad.adsession.a aVar) {
        boolean d = d();
        this.b.add(aVar);
        if (d) {
            return;
        }
        i.c().d();
    }

    public boolean d() {
        return this.b.size() > 0;
    }
}
