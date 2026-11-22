package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes5.dex */
public final class wn2 {
    private static wn2 c = new wn2();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<vn2> f17270a = new ArrayList<>();
    private final ArrayList<vn2> b = new ArrayList<>();

    private wn2() {
    }

    public static wn2 a() {
        return c;
    }

    public final Collection<vn2> b() {
        return Collections.unmodifiableCollection(this.f17270a);
    }

    public final Collection<vn2> c() {
        return Collections.unmodifiableCollection(this.b);
    }

    public final void a(vn2 vn2Var) {
        this.f17270a.add(vn2Var);
    }

    public final void b(vn2 vn2Var) {
        boolean z = this.b.size() > 0;
        this.b.add(vn2Var);
        if (z) {
            return;
        }
        cp2.a().b();
    }

    public final void c(vn2 vn2Var) {
        boolean z = this.b.size() > 0;
        this.f17270a.remove(vn2Var);
        this.b.remove(vn2Var);
        if (!z || this.b.size() > 0) {
            return;
        }
        cp2.a().c();
    }
}
