package com.anythink.core.common.n.c;

import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class j extends x {

    /* renamed from: a, reason: collision with root package name */
    private x f4226a;

    public j(x xVar) {
        if (xVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f4226a = xVar;
    }

    public final x a() {
        return this.f4226a;
    }

    public final j a(x xVar) {
        if (xVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f4226a = xVar;
        return this;
    }

    @Override // com.anythink.core.common.n.c.x
    public final x a(long j, TimeUnit timeUnit) {
        return this.f4226a.a(j, timeUnit);
    }

    @Override // com.anythink.core.common.n.c.x
    public final long i_() {
        return this.f4226a.i_();
    }

    @Override // com.anythink.core.common.n.c.x
    public final boolean f_() {
        return this.f4226a.f_();
    }

    @Override // com.anythink.core.common.n.c.x
    public final long g_() {
        return this.f4226a.g_();
    }

    @Override // com.anythink.core.common.n.c.x
    public final x a(long j) {
        return this.f4226a.a(j);
    }

    @Override // com.anythink.core.common.n.c.x
    public final x h_() {
        return this.f4226a.h_();
    }

    @Override // com.anythink.core.common.n.c.x
    public final x f() {
        return this.f4226a.f();
    }

    @Override // com.anythink.core.common.n.c.x
    public final void g() {
        this.f4226a.g();
    }
}
