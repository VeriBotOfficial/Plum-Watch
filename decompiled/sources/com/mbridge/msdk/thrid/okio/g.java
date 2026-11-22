package com.mbridge.msdk.thrid.okio;

import android.gov.nist.core.Separators;
import java.io.IOException;

/* compiled from: ForwardingSink.java */
/* loaded from: classes17.dex */
public abstract class g implements r {

    /* renamed from: a, reason: collision with root package name */
    private final r f12251a;

    public g(r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f12251a = rVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j) throws IOException {
        this.f12251a.a(cVar, j);
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.f12251a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12251a.close();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        this.f12251a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + Separators.LPAREN + this.f12251a.toString() + Separators.RPAREN;
    }
}
