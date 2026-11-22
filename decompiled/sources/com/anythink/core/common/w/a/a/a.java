package com.anythink.core.common.w.a.a;

import com.anythink.core.common.h.ai;
import com.anythink.core.common.h.aj;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.w.a.a;
import java.util.List;

/* loaded from: classes12.dex */
public class a implements com.anythink.core.common.w.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4460a = "a";
    private ai b;

    @Override // com.anythink.core.common.w.a.b.c
    public final void a(ai aiVar) {
        this.b = aiVar;
    }

    @Override // com.anythink.core.common.w.a.b.c
    public final ai a() {
        return this.b;
    }

    @Override // com.anythink.core.common.w.a.b.c
    public final aj a(bv bvVar) {
        ai aiVar = this.b;
        if (aiVar == null || bvVar == null) {
            return null;
        }
        List<aj> d = aiVar.d();
        List<aj> f = this.b.f();
        aj a2 = a(bvVar.z(), d);
        if (a2 == null && this.b.b()) {
            a2 = a(bvVar.z(), f);
        }
        new Object[]{a2};
        return a2;
    }

    @Override // com.anythink.core.common.w.a.b.b
    public final void b() {
        this.b = null;
    }

    private static aj a(String str, List<aj> list) {
        if (list != null && !list.isEmpty()) {
            for (aj ajVar : list) {
                if (str.equals(ajVar.c())) {
                    if (ajVar.d() != a.C0219a.b || System.currentTimeMillis() <= ajVar.a()) {
                        return ajVar;
                    }
                    return null;
                }
            }
        }
        return null;
    }
}
