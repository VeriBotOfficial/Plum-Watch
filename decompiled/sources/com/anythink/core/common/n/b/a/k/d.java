package com.anythink.core.common.n.b.a.k;

import com.anythink.core.common.n.c.c;
import com.anythink.core.common.n.c.f;
import com.anythink.core.common.n.c.v;
import com.anythink.core.common.n.c.x;
import java.io.IOException;
import java.util.Random;

/* loaded from: classes12.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    final boolean f4153a;
    final Random b;
    final com.anythink.core.common.n.c.d c;
    final com.anythink.core.common.n.c.c d;
    boolean e;
    final com.anythink.core.common.n.c.c f = new com.anythink.core.common.n.c.c();
    final a g = new a();
    boolean h;
    private final byte[] i;
    private final c.a j;

    d(boolean z, com.anythink.core.common.n.c.d dVar, Random random) {
        if (dVar == null) {
            throw new NullPointerException("sink == null");
        }
        if (random == null) {
            throw new NullPointerException("random == null");
        }
        this.f4153a = z;
        this.c = dVar;
        this.d = dVar.c();
        this.b = random;
        this.i = z ? new byte[4] : null;
        this.j = z ? new c.a() : null;
    }

    final void a(f fVar) {
        b(9, fVar);
    }

    final void b(f fVar) {
        b(10, fVar);
    }

    final void a(int i, f fVar) {
        f fVar2 = f.b;
        if (i != 0 || fVar != null) {
            if (i != 0) {
                b.b(i);
            }
            com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
            cVar.k(i);
            if (fVar != null) {
                cVar.d(fVar);
            }
            fVar2 = cVar.t();
        }
        try {
            b(8, fVar2);
        } finally {
            this.e = true;
        }
    }

    private void b(int i, f fVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        int j = fVar.j();
        if (j > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.d.l(i | 128);
        if (this.f4153a) {
            this.d.l(j | 128);
            this.b.nextBytes(this.i);
            this.d.d(this.i);
            if (j > 0) {
                long b = this.d.b();
                this.d.d(fVar);
                this.d.a(this.j);
                this.j.a(b);
                b.a(this.j, this.i);
                this.j.close();
            }
        } else {
            this.d.l(j);
            this.d.d(fVar);
        }
        this.c.flush();
    }

    private v a(int i, long j) {
        if (this.h) {
            throw new IllegalStateException("Another message writer is active. Did you call close()?");
        }
        this.h = true;
        this.g.f4154a = i;
        this.g.b = j;
        this.g.c = true;
        this.g.d = false;
        return this.g;
    }

    final void a(int i, long j, boolean z, boolean z2) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.d.l(i);
        int i2 = this.f4153a ? 128 : 0;
        if (j <= 125) {
            this.d.l(((int) j) | i2);
        } else if (j <= 65535) {
            this.d.l(i2 | 126);
            this.d.k((int) j);
        } else {
            this.d.l(i2 | 127);
            this.d.q(j);
        }
        if (this.f4153a) {
            this.b.nextBytes(this.i);
            this.d.d(this.i);
            if (j > 0) {
                long b = this.d.b();
                this.d.a(this.f, j);
                this.d.a(this.j);
                this.j.a(b);
                b.a(this.j, this.i);
                this.j.close();
            }
        } else {
            this.d.a(this.f, j);
        }
        this.c.f();
    }

    final class a implements v {

        /* renamed from: a, reason: collision with root package name */
        int f4154a;
        long b;
        boolean c;
        boolean d;

        a() {
        }

        @Override // com.anythink.core.common.n.c.v
        public final void a(com.anythink.core.common.n.c.c cVar, long j) {
            if (this.d) {
                throw new IOException("closed");
            }
            d.this.f.a(cVar, j);
            boolean z = this.c && this.b != -1 && d.this.f.b() > this.b - 8192;
            long j2 = d.this.f.j();
            if (j2 <= 0 || z) {
                return;
            }
            d.this.a(this.f4154a, j2, this.c, false);
            this.c = false;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Flushable
        public final void flush() {
            if (this.d) {
                throw new IOException("closed");
            }
            d dVar = d.this;
            dVar.a(this.f4154a, dVar.f.b(), this.c, false);
            this.c = false;
        }

        @Override // com.anythink.core.common.n.c.v
        public final x a() {
            return d.this.c.a();
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.d) {
                throw new IOException("closed");
            }
            d dVar = d.this;
            dVar.a(this.f4154a, dVar.f.b(), this.c, true);
            this.d = true;
            d.this.h = false;
        }
    }
}
