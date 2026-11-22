package com.anythink.core.common.n.b.a.a;

import com.anythink.core.common.n.c.h;
import com.anythink.core.common.n.c.v;
import java.io.IOException;

/* loaded from: classes12.dex */
class e extends h {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4066a;

    protected void b() {
    }

    e(v vVar) {
        super(vVar);
    }

    @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v
    public final void a(com.anythink.core.common.n.c.c cVar, long j) {
        if (this.f4066a) {
            cVar.i(j);
            return;
        }
        try {
            super.a(cVar, j);
        } catch (IOException unused) {
            this.f4066a = true;
            b();
        }
    }

    @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v, java.io.Flushable
    public void flush() {
        if (this.f4066a) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f4066a = true;
            b();
        }
    }

    @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f4066a) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.f4066a = true;
            b();
        }
    }
}
