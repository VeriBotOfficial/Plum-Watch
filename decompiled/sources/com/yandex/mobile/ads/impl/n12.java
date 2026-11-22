package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.uh;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes5.dex */
public final class n12 implements uh {
    private int b;
    private float c = 1.0f;
    private float d = 1.0f;
    private uh.a e;
    private uh.a f;
    private uh.a g;
    private uh.a h;
    private boolean i;
    private m12 j;
    private ByteBuffer k;
    private ShortBuffer l;
    private ByteBuffer m;
    private long n;
    private long o;
    private boolean p;

    public n12() {
        uh.a aVar = uh.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = uh.f17051a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public final uh.a a(uh.a aVar) throws uh.b {
        if (aVar.c == 2) {
            int i = this.b;
            if (i == -1) {
                i = aVar.f17052a;
            }
            this.e = aVar;
            uh.a aVar2 = new uh.a(i, aVar.b, 2);
            this.f = aVar2;
            this.i = true;
            return aVar2;
        }
        throw new uh.b(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public final boolean isActive() {
        if (this.f.f17052a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.f17052a != this.e.f17052a;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public final void d() {
        m12 m12Var = this.j;
        if (m12Var != null) {
            m12Var.e();
        }
        this.p = true;
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public final ByteBuffer c() {
        int b;
        m12 m12Var = this.j;
        if (m12Var != null && (b = m12Var.b()) > 0) {
            if (this.k.capacity() < b) {
                ByteBuffer order = ByteBuffer.allocateDirect(b).order(ByteOrder.nativeOrder());
                this.k = order;
                this.l = order.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            m12Var.a(this.l);
            this.o += b;
            this.k.limit(b);
            this.m = this.k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = uh.f17051a;
        return byteBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public final void flush() {
        if (isActive()) {
            uh.a aVar = this.e;
            this.g = aVar;
            uh.a aVar2 = this.f;
            this.h = aVar2;
            if (this.i) {
                this.j = new m12(aVar.f17052a, aVar.b, this.c, this.d, aVar2.f17052a);
            } else {
                m12 m12Var = this.j;
                if (m12Var != null) {
                    m12Var.a();
                }
            }
        }
        this.m = uh.f17051a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public final void b() {
        this.c = 1.0f;
        this.d = 1.0f;
        uh.a aVar = uh.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = uh.f17051a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    public final long a(long j) {
        if (this.o >= 1024) {
            long j2 = this.n;
            this.j.getClass();
            long c = j2 - r2.c();
            int i = this.h.f17052a;
            int i2 = this.g.f17052a;
            if (i == i2) {
                return f92.a(j, c, this.o);
            }
            return f92.a(j, c * i, this.o * i2);
        }
        return (long) (this.c * j);
    }

    public final void b(float f) {
        if (this.c != f) {
            this.c = f;
            this.i = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public final boolean a() {
        if (!this.p) {
            return false;
        }
        m12 m12Var = this.j;
        return m12Var == null || m12Var.b() == 0;
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            m12 m12Var = this.j;
            m12Var.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            m12Var.b(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final void a(float f) {
        if (this.d != f) {
            this.d = f;
            this.i = true;
        }
    }
}
