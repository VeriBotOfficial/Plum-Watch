package com.anythink.core.common.n.c;

import android.gov.nist.core.Separators;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes12.dex */
final class q implements d {

    /* renamed from: a, reason: collision with root package name */
    public final c f4236a = new c();
    public final v b;
    boolean c;

    q(v vVar) {
        if (vVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.b = vVar;
    }

    @Override // com.anythink.core.common.n.c.d, com.anythink.core.common.n.c.e
    public final c c() {
        return this.f4236a;
    }

    @Override // com.anythink.core.common.n.c.v
    public final void a(c cVar, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.a(cVar, j);
        A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d d(f fVar) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.d(fVar);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d b(String str) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.b(str);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d b(String str, int i, int i2) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.b(str, i, i2);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d m(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.m(i);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d b(String str, Charset charset) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.b(str, charset);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d b(String str, int i, int i2, Charset charset) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.b(str, i, i2, charset);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d d(byte[] bArr) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.d(bArr);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d c(byte[] bArr, int i, int i2) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.c(bArr, i, i2);
        return A();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f4236a.write(byteBuffer);
        A();
        return write;
    }

    @Override // com.anythink.core.common.n.c.d
    public final long a(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long a_ = wVar.a_(this.f4236a, 8192L);
            if (a_ == -1) {
                return j;
            }
            j += a_;
            A();
        }
    }

    @Override // com.anythink.core.common.n.c.d
    public final d a(w wVar, long j) {
        while (j > 0) {
            long a_ = wVar.a_(this.f4236a, j);
            if (a_ == -1) {
                throw new EOFException();
            }
            j -= a_;
            A();
        }
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    public final d l(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.l(i);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d k(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.k(i);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d j(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.j(i);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d i(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.i(i);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d h(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.h(i);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d q(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.q(j);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d p(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.p(j);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d o(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.o(j);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d n(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f4236a.n(j);
        return A();
    }

    @Override // com.anythink.core.common.n.c.d
    public final d A() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long j = this.f4236a.j();
        if (j > 0) {
            this.b.a(this.f4236a, j);
        }
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    public final d f() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long j = this.f4236a.c;
        if (j > 0) {
            this.b.a(this.f4236a, j);
        }
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    public final OutputStream e() {
        return new OutputStream() { // from class: com.anythink.core.common.n.c.q.1
            @Override // java.io.OutputStream
            public final void write(int i) {
                if (q.this.c) {
                    throw new IOException("closed");
                }
                q.this.f4236a.l((int) ((byte) i));
                q.this.A();
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                if (q.this.c) {
                    throw new IOException("closed");
                }
                q.this.f4236a.c(bArr, i, i2);
                q.this.A();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
                if (q.this.c) {
                    return;
                }
                q.this.flush();
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                q.this.close();
            }

            public final String toString() {
                return q.this + ".outputStream()";
            }
        };
    }

    @Override // com.anythink.core.common.n.c.d, com.anythink.core.common.n.c.v, java.io.Flushable
    public final void flush() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.f4236a.c > 0) {
            v vVar = this.b;
            c cVar = this.f4236a;
            vVar.a(cVar, cVar.c);
        }
        this.b.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        try {
            if (this.f4236a.c > 0) {
                v vVar = this.b;
                c cVar = this.f4236a;
                vVar.a(cVar, cVar.c);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.b.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.c = true;
        if (th != null) {
            y.a(th);
        }
    }

    @Override // com.anythink.core.common.n.c.v
    public final x a() {
        return this.b.a();
    }

    public final String toString() {
        return "buffer(" + this.b + Separators.RPAREN;
    }
}
