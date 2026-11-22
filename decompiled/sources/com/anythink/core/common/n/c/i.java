package com.anythink.core.common.n.c;

import android.gov.nist.core.Separators;

/* loaded from: classes12.dex */
public abstract class i implements w {

    /* renamed from: a, reason: collision with root package name */
    private final w f4225a;

    public i(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f4225a = wVar;
    }

    public final w b() {
        return this.f4225a;
    }

    @Override // com.anythink.core.common.n.c.w
    public long a_(c cVar, long j) {
        return this.f4225a.a_(cVar, j);
    }

    @Override // com.anythink.core.common.n.c.w
    public final x a() {
        return this.f4225a.a();
    }

    @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4225a.close();
    }

    public String toString() {
        return getClass().getSimpleName() + Separators.LPAREN + this.f4225a.toString() + Separators.RPAREN;
    }
}
