package com.anythink.core.common.n.c;

import android.gov.nist.core.Separators;

/* loaded from: classes12.dex */
public abstract class h implements v {

    /* renamed from: a, reason: collision with root package name */
    private final v f4224a;

    public h(v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f4224a = vVar;
    }

    private v b() {
        return this.f4224a;
    }

    @Override // com.anythink.core.common.n.c.v
    public void a(c cVar, long j) {
        this.f4224a.a(cVar, j);
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Flushable
    public void flush() {
        this.f4224a.flush();
    }

    @Override // com.anythink.core.common.n.c.v
    public final x a() {
        return this.f4224a.a();
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4224a.close();
    }

    public String toString() {
        return getClass().getSimpleName() + Separators.LPAREN + this.f4224a.toString() + Separators.RPAREN;
    }
}
