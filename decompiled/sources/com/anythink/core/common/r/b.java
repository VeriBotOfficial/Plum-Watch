package com.anythink.core.common.r;

import com.anythink.core.api.ATAdRequest;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    h f4267a;
    int b;
    boolean c;
    long d;
    d e;
    ATAdRequest f;

    public b(h hVar, int i, ATAdRequest aTAdRequest) {
        this.f4267a = hVar;
        this.b = i;
        this.f = aTAdRequest;
    }

    public final ATAdRequest a() {
        return this.f;
    }

    private boolean c() {
        return this.c;
    }

    public final void b() {
        this.c = true;
    }

    private long d() {
        return this.d;
    }

    public final void a(long j) {
        this.d = j;
    }

    public final void a(d dVar) {
        this.e = dVar;
    }
}
