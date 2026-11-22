package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class vn2 extends b9 {
    private static final Pattern k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final d9 f17180a;
    private final c9 b;
    private zn2 d;
    private g9 e;
    private boolean i;
    private boolean j;
    private final ArrayList c = new ArrayList();
    private boolean f = false;
    private boolean g = false;
    private final String h = UUID.randomUUID().toString();

    vn2(c9 c9Var, d9 d9Var) {
        g9 ao2Var;
        this.b = c9Var;
        this.f17180a = d9Var;
        d();
        if (d9Var.a() == e9.c || d9Var.a() == e9.e) {
            ao2Var = new ao2(d9Var.h());
        } else {
            ao2Var = new eo2(d9Var.e(), d9Var.d());
        }
        this.e = ao2Var;
        this.e.a();
        wn2.a().a(this);
        this.e.a(c9Var);
    }

    @Override // com.yandex.mobile.ads.impl.b9
    public final void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        wn2.a().b(this);
        this.e.a(cp2.a().d());
        this.e.a(this, this.f17180a);
    }

    public final View f() {
        return this.d.get();
    }

    public final boolean g() {
        return this.f && !this.g;
    }

    public final boolean h() {
        return this.f;
    }

    public final String i() {
        return this.h;
    }

    public final g9 j() {
        return this.e;
    }

    public final boolean k() {
        return this.g;
    }

    public final boolean l() {
        return this.b.b();
    }

    public final boolean m() {
        return this.b.c();
    }

    private void d() {
        this.d = new zn2(null);
    }

    final void a(JSONObject jSONObject) {
        if (this.j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        this.e.a(jSONObject);
        this.j = true;
    }

    public final ArrayList c() {
        return this.c;
    }

    final void e() {
        if (this.i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
        this.e.f();
        this.i = true;
    }

    @Override // com.yandex.mobile.ads.impl.b9
    public final void a(View view, uc0 uc0Var, String str) {
        no2 no2Var;
        if (this.g) {
            return;
        }
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!k.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                no2Var = null;
                break;
            } else {
                no2Var = (no2) it.next();
                if (no2Var.a().get() == view) {
                    break;
                }
            }
        }
        if (no2Var == null) {
            this.c.add(new no2(view, uc0Var, str));
        }
    }

    @Override // com.yandex.mobile.ads.impl.b9
    public final void a() {
        if (this.g) {
            return;
        }
        this.d.clear();
        if (!this.g) {
            this.c.clear();
        }
        this.g = true;
        this.e.e();
        wn2.a().c(this);
        this.e.b();
        this.e = null;
    }

    @Override // com.yandex.mobile.ads.impl.b9
    public final void a(View view) {
        if (this.g || this.d.get() == view) {
            return;
        }
        this.d = new zn2(view);
        this.e.g();
        Collection<vn2> b = wn2.a().b();
        if (b == null || b.isEmpty()) {
            return;
        }
        for (vn2 vn2Var : b) {
            if (vn2Var != this && vn2Var.d.get() == view) {
                vn2Var.d.clear();
            }
        }
    }
}
