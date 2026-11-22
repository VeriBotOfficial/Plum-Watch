package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import com.anythink.basead.exoplayer.k.af;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes11.dex */
public final class t implements f {
    public static final float b = 8.0f;
    public static final float c = 0.1f;
    public static final float d = 8.0f;
    public static final float e = 0.1f;
    public static final int f = -1;
    private static final float g = 0.01f;
    private static final int h = 1024;
    private int n;
    private s o;
    private ByteBuffer p;

    /* renamed from: q, reason: collision with root package name */
    private ShortBuffer f2403q;
    private ByteBuffer r;
    private long s;
    private long t;
    private boolean u;
    private float k = 1.0f;
    private float l = 1.0f;
    private int i = -1;
    private int j = -1;
    private int m = -1;

    @Override // com.anythink.basead.exoplayer.b.f
    public final int c() {
        return 2;
    }

    public t() {
        ByteBuffer byteBuffer = f2374a;
        this.p = byteBuffer;
        this.f2403q = byteBuffer.asShortBuffer();
        this.r = f2374a;
        this.n = -1;
    }

    public final float a(float f2) {
        float a2 = af.a(f2);
        if (this.k != a2) {
            this.k = a2;
            this.o = null;
        }
        h();
        return a2;
    }

    public final float b(float f2) {
        float a2 = af.a(f2);
        if (this.l != a2) {
            this.l = a2;
            this.o = null;
        }
        h();
        return a2;
    }

    private void a(int i) {
        this.n = i;
    }

    public final long a(long j) {
        long j2 = this.t;
        if (j2 >= 1024) {
            int i = this.m;
            int i2 = this.j;
            if (i == i2) {
                return af.a(j, this.s, j2);
            }
            return af.a(j, this.s * i, j2 * i2);
        }
        return (long) (this.k * j);
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i2, int i3) {
        if (i3 != 2) {
            throw new f.a(i, i2, i3);
        }
        int i4 = this.n;
        if (i4 == -1) {
            i4 = i;
        }
        if (this.j == i && this.i == i2 && this.m == i4) {
            return false;
        }
        this.j = i;
        this.i = i2;
        this.m = i4;
        this.o = null;
        return true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        if (this.j != -1) {
            return Math.abs(this.k - 1.0f) >= 0.01f || Math.abs(this.l - 1.0f) >= 0.01f || this.m != this.j;
        }
        return false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int b() {
        return this.i;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int d() {
        return this.m;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        com.anythink.basead.exoplayer.k.a.b(this.o != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.s += remaining;
            this.o.a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int c2 = this.o.c() * this.i * 2;
        if (c2 > 0) {
            if (this.p.capacity() < c2) {
                ByteBuffer order = ByteBuffer.allocateDirect(c2).order(ByteOrder.nativeOrder());
                this.p = order;
                this.f2403q = order.asShortBuffer();
            } else {
                this.p.clear();
                this.f2403q.clear();
            }
            this.o.b(this.f2403q);
            this.t += c2;
            this.p.limit(c2);
            this.r = this.p;
        }
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        com.anythink.basead.exoplayer.k.a.b(this.o != null);
        this.o.a();
        this.u = true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.r;
        this.r = f2374a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        if (!this.u) {
            return false;
        }
        s sVar = this.o;
        return sVar == null || sVar.c() == 0;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        if (a()) {
            s sVar = this.o;
            if (sVar == null) {
                this.o = new s(this.j, this.i, this.k, this.l, this.m);
            } else {
                sVar.b();
            }
        }
        this.r = f2374a;
        this.s = 0L;
        this.t = 0L;
        this.u = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        this.k = 1.0f;
        this.l = 1.0f;
        this.i = -1;
        this.j = -1;
        this.m = -1;
        ByteBuffer byteBuffer = f2374a;
        this.p = byteBuffer;
        this.f2403q = byteBuffer.asShortBuffer();
        this.r = f2374a;
        this.n = -1;
        this.o = null;
        this.s = 0L;
        this.t = 0L;
        this.u = false;
    }
}
