package com.mbridge.msdk.thrid.okio;

import android.gov.nist.core.Separators;
import java.io.IOException;

/* compiled from: ForwardingSource.java */
/* loaded from: classes17.dex */
public abstract class h implements s {

    /* renamed from: a, reason: collision with root package name */
    private final s f12252a;

    public h(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f12252a = sVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f12252a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12252a.close();
    }

    public final s d() {
        return this.f12252a;
    }

    public String toString() {
        return getClass().getSimpleName() + Separators.LPAREN + this.f12252a.toString() + Separators.RPAREN;
    }
}
