package com.anythink.core.common.n.b.a.b;

import com.anythink.core.common.n.b.ah;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes12.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Set<ah> f4077a = new LinkedHashSet();

    g() {
    }

    public final synchronized void a(ah ahVar) {
        this.f4077a.add(ahVar);
    }

    public final synchronized void b(ah ahVar) {
        this.f4077a.remove(ahVar);
    }

    public final synchronized boolean c(ah ahVar) {
        return this.f4077a.contains(ahVar);
    }
}
