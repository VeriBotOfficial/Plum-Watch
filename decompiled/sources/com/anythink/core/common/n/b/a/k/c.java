package com.anythink.core.common.n.b.a.k;

import com.anythink.core.common.n.c.c;
import com.anythink.core.common.n.c.e;
import com.anythink.core.common.n.c.f;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    final boolean f4152a;
    final e b;
    final a c;
    boolean d;
    int e;
    long f;
    boolean g;
    boolean h;
    private final com.anythink.core.common.n.c.c i = new com.anythink.core.common.n.c.c();
    private final com.anythink.core.common.n.c.c j = new com.anythink.core.common.n.c.c();
    private final byte[] k;
    private final c.a l;

    public interface a {
        void a(int i, String str);

        void b(f fVar);

        void e();

        void f();

        void g();
    }

    c(boolean z, e eVar, a aVar) {
        if (eVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f4152a = z;
        this.b = eVar;
        this.c = aVar;
        this.k = z ? null : new byte[4];
        this.l = z ? null : new c.a();
    }

    final void a() {
        b();
        if (this.h) {
            c();
            return;
        }
        int i = this.e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        f();
        if (i == 1) {
            this.j.u();
        } else {
            this.j.t();
        }
    }

    private void b() {
        String str;
        if (this.d) {
            throw new IOException("closed");
        }
        long i_ = this.b.a().i_();
        this.b.a().h_();
        try {
            byte k = this.b.k();
            this.b.a().a(i_, TimeUnit.NANOSECONDS);
            this.e = k & 15;
            boolean z = (k & 128) != 0;
            this.g = z;
            boolean z2 = (k & 8) != 0;
            this.h = z2;
            if (z2 && !z) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z3 = (k & 64) != 0;
            boolean z4 = (k & 32) != 0;
            boolean z5 = (k & 16) != 0;
            if (z3 || z4 || z5) {
                throw new ProtocolException("Reserved flags are unsupported.");
            }
            byte k2 = this.b.k();
            boolean z6 = (k2 & 128) != 0;
            if (z6 == this.f4152a) {
                if (this.f4152a) {
                    str = "Server-sent frames must not be masked.";
                } else {
                    str = "Client-sent frames must be masked.";
                }
                throw new ProtocolException(str);
            }
            long j = k2 & Byte.MAX_VALUE;
            this.f = j;
            if (j == 126) {
                this.f = this.b.l() & 65535;
            } else if (j == 127) {
                long n = this.b.n();
                this.f = n;
                if (n < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.h && this.f > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z6) {
                this.b.b(this.k);
            }
        } catch (Throwable th) {
            this.b.a().a(i_, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private void c() {
        short s;
        String str;
        long j = this.f;
        if (j > 0) {
            this.b.b(this.i, j);
            if (!this.f4152a) {
                this.i.a(this.l);
                this.l.a(0L);
                b.a(this.l, this.k);
                this.l.close();
            }
        }
        switch (this.e) {
            case 8:
                long b = this.i.b();
                if (b == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (b == 0) {
                    s = 1005;
                    str = "";
                } else {
                    s = this.i.l();
                    str = this.i.u();
                    String a2 = b.a(s);
                    if (a2 != null) {
                        throw new ProtocolException(a2);
                    }
                }
                this.c.a(s, str);
                this.d = true;
                return;
            case 9:
                this.c.b(this.i.t());
                return;
            case 10:
                a aVar = this.c;
                this.i.t();
                aVar.g();
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.e));
        }
    }

    private void d() {
        int i = this.e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        f();
        if (i == 1) {
            this.j.u();
        } else {
            this.j.t();
        }
    }

    private void e() {
        while (!this.d) {
            b();
            if (!this.h) {
                return;
            } else {
                c();
            }
        }
    }

    private void f() {
        while (!this.d) {
            long j = this.f;
            if (j > 0) {
                this.b.b(this.j, j);
                if (!this.f4152a) {
                    this.j.a(this.l);
                    this.l.a(this.j.b() - this.f);
                    b.a(this.l, this.k);
                    this.l.close();
                }
            }
            if (this.g) {
                return;
            }
            e();
            if (this.e != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.e));
            }
        }
        throw new IOException("closed");
    }
}
