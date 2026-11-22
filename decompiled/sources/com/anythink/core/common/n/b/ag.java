package com.anythink.core.common.n.b;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes12.dex */
public abstract class ag implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private Reader f4166a;

    public abstract x a();

    public abstract long b();

    public abstract com.anythink.core.common.n.c.e c();

    private InputStream e() {
        return c().i();
    }

    private byte[] f() {
        long b = b();
        if (b > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: ".concat(String.valueOf(b)));
        }
        com.anythink.core.common.n.c.e c = c();
        try {
            byte[] y = c.y();
            if (c != null) {
                c.close();
            }
            if (b == -1 || b == y.length) {
                return y;
            }
            throw new IOException("Content-Length (" + b + ") and stream length (" + y.length + ") disagree");
        } catch (Throwable th) {
            if (c != null) {
                try {
                    c.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private Reader g() {
        Reader reader = this.f4166a;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(c(), h());
        this.f4166a = aVar;
        return aVar;
    }

    public final String d() {
        com.anythink.core.common.n.c.e c = c();
        try {
            String a2 = c.a(com.anythink.core.common.n.b.a.c.a(c, h()));
            if (c != null) {
                c.close();
            }
            return a2;
        } catch (Throwable th) {
            if (c != null) {
                try {
                    c.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private Charset h() {
        x a2 = a();
        return a2 != null ? a2.a(StandardCharsets.UTF_8) : StandardCharsets.UTF_8;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.anythink.core.common.n.b.a.c.a(c());
    }

    private static ag a(x xVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (xVar != null && (charset = xVar.a((Charset) null)) == null) {
            charset = StandardCharsets.UTF_8;
            xVar = x.b(xVar + "; charset=utf-8");
        }
        com.anythink.core.common.n.c.c b = new com.anythink.core.common.n.c.c().b(str, charset);
        return a(xVar, b.b(), b);
    }

    public static ag a(x xVar, byte[] bArr) {
        return a(xVar, bArr.length, new com.anythink.core.common.n.c.c().d(bArr));
    }

    private static ag a(x xVar, com.anythink.core.common.n.c.f fVar) {
        return a(xVar, fVar.j(), new com.anythink.core.common.n.c.c().d(fVar));
    }

    public static ag a(final x xVar, final long j, final com.anythink.core.common.n.c.e eVar) {
        if (eVar == null) {
            throw new NullPointerException("source == null");
        }
        return new ag() { // from class: com.anythink.core.common.n.b.ag.1
            @Override // com.anythink.core.common.n.b.ag
            public final x a() {
                return x.this;
            }

            @Override // com.anythink.core.common.n.b.ag
            public final long b() {
                return j;
            }

            @Override // com.anythink.core.common.n.b.ag
            public final com.anythink.core.common.n.c.e c() {
                return eVar;
            }
        };
    }

    static final class a extends Reader {

        /* renamed from: a, reason: collision with root package name */
        private final com.anythink.core.common.n.c.e f4168a;
        private final Charset b;
        private boolean c;
        private Reader d;

        a(com.anythink.core.common.n.c.e eVar, Charset charset) {
            this.f4168a = eVar;
            this.b = charset;
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) {
            if (this.c) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.d;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.f4168a.i(), com.anythink.core.common.n.b.a.c.a(this.f4168a, this.b));
                this.d = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.c = true;
            Reader reader = this.d;
            if (reader != null) {
                reader.close();
            } else {
                this.f4168a.close();
            }
        }
    }
}
