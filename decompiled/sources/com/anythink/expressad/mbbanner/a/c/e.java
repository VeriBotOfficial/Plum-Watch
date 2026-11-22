package com.anythink.expressad.mbbanner.a.c;

import java.util.List;
import java.util.Random;

/* loaded from: classes12.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4973a = "e";
    private c b;
    private com.anythink.expressad.f.c c;
    private boolean d = false;

    public e(c cVar, com.anythink.expressad.f.c cVar2) {
        this.c = cVar2;
        this.b = cVar;
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(List<com.anythink.expressad.foundation.d.d> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    com.anythink.expressad.f.c cVar = this.c;
                    boolean z = false;
                    if (!list.get(0).B() && cVar != null && cVar.a() != 1.0d) {
                        if (new Random().nextDouble() > cVar.a()) {
                            z = true;
                        }
                    }
                    this.d = z;
                }
            } catch (Exception unused) {
            }
        }
        c cVar2 = this.b;
        if (cVar2 != null) {
            cVar2.a(list);
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(String str) {
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        c cVar = this.b;
        if (cVar == null || this.d) {
            return;
        }
        cVar.a(dVar);
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a() {
        c cVar = this.b;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void b() {
        c cVar = this.b;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void c() {
        c cVar = this.b;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(com.anythink.expressad.foundation.d.d dVar, boolean z) {
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(dVar, this.d);
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void d() {
        c cVar = this.b;
        if (cVar != null) {
            cVar.d();
        }
    }

    private static boolean a(com.anythink.expressad.f.c cVar, boolean z) {
        if (z || cVar == null || cVar.a() == 1.0d) {
            return false;
        }
        return new Random().nextDouble() > cVar.a();
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(boolean z) {
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(z);
        }
    }
}
