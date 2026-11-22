package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.uh;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
final class h72 extends ik {
    private int i;
    private int j;
    private boolean k;
    private int l;
    private byte[] m = f92.f;
    private int n;
    private long o;

    public final void j() {
        this.o = 0L;
    }

    public final long i() {
        return this.o;
    }

    @Override // com.yandex.mobile.ads.impl.ik
    public final uh.a b(uh.a aVar) throws uh.b {
        if (aVar.c == 2) {
            this.k = true;
            return (this.i == 0 && this.j == 0) ? uh.a.e : aVar;
        }
        throw new uh.b(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.ik, com.yandex.mobile.ads.impl.uh
    public final ByteBuffer c() {
        int i;
        if (super.a() && (i = this.n) > 0) {
            a(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.c();
    }

    @Override // com.yandex.mobile.ads.impl.ik, com.yandex.mobile.ads.impl.uh
    public final boolean a() {
        return super.a() && this.n == 0;
    }

    @Override // com.yandex.mobile.ads.impl.ik
    protected final void g() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ik
    protected final void f() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // com.yandex.mobile.ads.impl.ik
    protected final void h() {
        this.m = f92.f;
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer a2 = a(length);
        int i3 = this.n;
        int i4 = f92.f15466a;
        int max = Math.max(0, Math.min(length, i3));
        a2.put(this.m, 0, max);
        int max2 = Math.max(0, Math.min(length - max, i2));
        byteBuffer.limit(byteBuffer.position() + max2);
        a2.put(byteBuffer);
        byteBuffer.limit(limit);
        int i5 = i2 - max2;
        int i6 = this.n - max;
        this.n = i6;
        byte[] bArr = this.m;
        System.arraycopy(bArr, max, bArr, 0, i6);
        byteBuffer.get(this.m, this.n, i5);
        this.n += i5;
        a2.flip();
    }

    public final void a(int i, int i2) {
        this.i = i;
        this.j = i2;
    }
}
