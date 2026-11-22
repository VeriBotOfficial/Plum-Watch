package com.anythink.core.common.s.b;

import com.anythink.core.common.d.u;
import com.anythink.core.common.s.c;
import java.util.Map;

/* loaded from: classes12.dex */
public class e implements com.anythink.core.common.s.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4333a = "e";
    private c b;
    private f c;
    private a d;
    private final com.anythink.core.common.s.c e;
    private String f;
    private int g;

    public e(com.anythink.core.common.s.c cVar) {
        this.e = cVar;
        this.f = cVar.b();
        this.g = cVar.c();
        this.b = d.a(cVar);
        this.c = d.b(cVar);
        this.d = new a(this.b, this.c);
        new Object[]{this.f, Integer.valueOf(this.g), Integer.valueOf(cVar.d())};
    }

    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v) {
        com.anythink.core.common.s.c cVar = this.e;
        if (cVar != null) {
            a(str, v, cVar.d());
        } else {
            a(str, v, 1);
        }
    }

    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v, int i) {
        c cVar;
        if (c(str)) {
            b(str, v, i);
            return;
        }
        if (this.g == 1 && (cVar = this.b) != null) {
            cVar.a(str, v, i);
        } else {
            f fVar = this.c;
            if (fVar != null) {
                fVar.a(str, v, i);
            }
        }
        new Object[]{this.f, Integer.valueOf(this.g), str, v, Integer.valueOf(i)};
    }

    @Override // com.anythink.core.common.s.a
    public final <V> V b(String str, V v) {
        V v2;
        f fVar;
        if (!c(str)) {
            if (this.g == 0 && (fVar = this.c) != null) {
                v2 = (V) fVar.b(str, v);
            } else {
                c cVar = this.b;
                if (cVar != null) {
                    v2 = (V) cVar.b(str, v);
                    if ((v2 == null || v2 == v) && !this.b.c()) {
                        f fVar2 = this.c;
                        v2 = fVar2 != null ? (V) fVar2.b(str, v) : null;
                        new Object[]{this.f, Integer.valueOf(this.g), str, v2, v};
                    }
                } else {
                    v2 = v;
                }
            }
            new Object[]{this.f, Integer.valueOf(this.g), str, v2, v};
            return v2;
        }
        c d = d();
        return d != null ? (V) d.b(str, v) : v;
    }

    @Override // com.anythink.core.common.s.a
    public final void b(String str) {
        c cVar;
        if (!c(str)) {
            if (this.g == 1 && (cVar = this.b) != null && cVar.c()) {
                this.b.b(str);
            } else {
                f fVar = this.c;
                if (fVar != null) {
                    fVar.b(str);
                }
            }
            new Object[]{this.f, Integer.valueOf(this.g), str};
            return;
        }
        c d = d();
        if (d != null) {
            d.b(str);
        }
    }

    @Override // com.anythink.core.common.s.a
    public final void b() {
        c cVar;
        if (this.g == 1 && (cVar = this.b) != null && cVar.c()) {
            this.b.b();
        } else {
            f fVar = this.c;
            if (fVar != null) {
                fVar.b();
            }
        }
        new Object[]{this.f, Integer.valueOf(this.g)};
    }

    @Override // com.anythink.core.common.s.a
    public final Map<String, Object> a() {
        Map<String, Object> a2;
        c cVar;
        if (this.g == 1 && (cVar = this.b) != null && cVar.c()) {
            a2 = this.b.a();
        } else {
            f fVar = this.c;
            a2 = fVar != null ? fVar.a() : null;
        }
        new Object[]{this.f, Integer.valueOf(this.g), a2};
        return a2;
    }

    @Override // com.anythink.core.common.s.a
    public final boolean a(String str) {
        c cVar;
        boolean z = false;
        if (!c(str)) {
            if (this.g == 1 && (cVar = this.b) != null && cVar.c()) {
                z = this.b.a(str);
            } else {
                f fVar = this.c;
                if (fVar != null) {
                    z = fVar.a(str);
                }
            }
            new Object[]{this.f, Integer.valueOf(this.g), str, Boolean.valueOf(z)};
            return z;
        }
        c d = d();
        return d != null && d.a(str);
    }

    private void a(com.anythink.core.common.s.c cVar) {
        this.f = cVar.b();
        this.g = cVar.c();
        this.b = d.a(cVar);
        this.c = d.b(cVar);
        this.d = new a(this.b, this.c);
    }

    public final void c() {
        a aVar = this.d;
        if (aVar == null || this.g != 1) {
            return;
        }
        aVar.a();
    }

    private boolean c(String str) {
        com.anythink.core.common.s.b.a();
        return com.anythink.core.common.s.b.a(str) && u.b.f3741a.equals(this.f);
    }

    private c a(int i) {
        if (this.e == null) {
            return null;
        }
        return d.a(new c.a().a(this.e.a()).a(u.b.f3742q).a(this.e.c()).b(i).a());
    }

    private c d() {
        com.anythink.core.common.s.c cVar = this.e;
        if (cVar != null) {
            return a(cVar.d());
        }
        return null;
    }

    private <V> void b(String str, V v, int i) {
        c a2 = a(i);
        if (a2 != null) {
            a2.a(str, v);
        }
    }

    private void d(String str) {
        c d = d();
        if (d != null) {
            d.b(str);
        }
    }

    private <V> V c(String str, V v) {
        c d = d();
        return d != null ? (V) d.b(str, v) : v;
    }

    private boolean e(String str) {
        c d = d();
        return d != null && d.a(str);
    }
}
