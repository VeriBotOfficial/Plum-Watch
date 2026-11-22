package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public final class bo2 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f15128a = new HashMap<>();
    private final HashMap<View, a> b = new HashMap<>();
    private final HashMap<String, View> c = new HashMap<>();
    private final HashSet<View> d = new HashSet<>();
    private final HashSet<String> e = new HashSet<>();
    private final HashSet<String> f = new HashSet<>();
    private final HashMap<String, String> g = new HashMap<>();
    private final WeakHashMap h = new WeakHashMap();
    private boolean i;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final no2 f15129a;
        private final ArrayList<String> b = new ArrayList<>();

        public a(no2 no2Var, String str) {
            this.f15129a = no2Var;
            a(str);
        }

        public final no2 a() {
            return this.f15129a;
        }

        public final ArrayList<String> b() {
            return this.b;
        }

        public final void a(String str) {
            this.b.add(str);
        }
    }

    public final String a(View view) {
        if (this.f15128a.size() == 0) {
            return null;
        }
        String str = this.f15128a.get(view);
        if (str != null) {
            this.f15128a.remove(view);
        }
        return str;
    }

    public final View b(String str) {
        return this.c.get(str);
    }

    public final void d() {
        this.f15128a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.i = false;
    }

    public final void e() {
        this.i = true;
    }

    public final String a(String str) {
        return this.g.get(str);
    }

    public final a b(View view) {
        a aVar = this.b.get(view);
        if (aVar != null) {
            this.b.remove(view);
        }
        return aVar;
    }

    public final int c(View view) {
        if (this.d.contains(view)) {
            return 1;
        }
        return this.i ? 2 : 3;
    }

    public final boolean d(View view) {
        if (!this.h.containsKey(view)) {
            return true;
        }
        this.h.put(view, Boolean.TRUE);
        return false;
    }

    public final HashSet<String> a() {
        return this.e;
    }

    public final HashSet<String> b() {
        return this.f;
    }

    public final void c() {
        Boolean bool;
        String str;
        wn2 a2 = wn2.a();
        if (a2 != null) {
            for (vn2 vn2Var : a2.c()) {
                View f = vn2Var.f();
                if (vn2Var.g()) {
                    String i = vn2Var.i();
                    if (f != null) {
                        if (f.isAttachedToWindow()) {
                            if (f.hasWindowFocus()) {
                                this.h.remove(f);
                                bool = Boolean.FALSE;
                            } else if (this.h.containsKey(f)) {
                                bool = (Boolean) this.h.get(f);
                            } else {
                                WeakHashMap weakHashMap = this.h;
                                Boolean bool2 = Boolean.FALSE;
                                weakHashMap.put(f, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue()) {
                                HashSet hashSet = new HashSet();
                                View view = f;
                                while (true) {
                                    if (view == null) {
                                        this.d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String c = ap2.c(view);
                                    if (c != null) {
                                        str = c;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.e.add(i);
                            this.f15128a.put(f, i);
                            Iterator it = vn2Var.c().iterator();
                            while (it.hasNext()) {
                                no2 no2Var = (no2) it.next();
                                View view2 = no2Var.a().get();
                                if (view2 != null) {
                                    a aVar = this.b.get(view2);
                                    if (aVar != null) {
                                        aVar.a(vn2Var.i());
                                    } else {
                                        this.b.put(view2, new a(no2Var, vn2Var.i()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f.add(i);
                            this.c.put(i, f);
                            this.g.put(i, str);
                        }
                    } else {
                        this.f.add(i);
                        this.g.put(i, "noAdView");
                    }
                }
            }
        }
    }
}
