package com.anythink.core.common.s.b;

import java.util.Map;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final c f4330a;
    private final f b;
    private boolean c;

    public a(c cVar, f fVar) {
        this.f4330a = cVar;
        this.b = fVar;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        c cVar = this.f4330a;
        if (cVar == null || !cVar.c()) {
            this.c = true;
            f fVar = this.b;
            if (fVar == null || this.f4330a == null) {
                return;
            }
            Map<String, Object> a2 = fVar.a();
            if (a2 == null || a2.isEmpty()) {
                this.f4330a.d();
                return;
            }
            getClass().getSimpleName();
            new Object[]{this.b.c()};
            for (String str : a2.keySet()) {
                com.anythink.core.common.s.b.a();
                if (!com.anythink.core.common.s.b.a(str) && !this.f4330a.a(str)) {
                    this.f4330a.a(str, a2.get(str));
                }
            }
            this.f4330a.d();
            this.b.b();
        }
    }
}
