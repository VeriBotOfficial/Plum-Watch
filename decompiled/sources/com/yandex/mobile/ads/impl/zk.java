package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
final class zk extends ry {
    private long j;
    private int k;
    private int l;

    public zk() {
        super(2);
        this.l = 32;
    }

    @Override // com.yandex.mobile.ads.impl.ry, com.yandex.mobile.ads.impl.gm
    public final void b() {
        super.b();
        this.k = 0;
    }

    public final void f(int i) {
        if (i > 0) {
            this.l = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final long k() {
        return this.j;
    }

    public final int l() {
        return this.k;
    }

    public final boolean m() {
        return this.k > 0;
    }

    public final boolean a(ry ryVar) {
        ByteBuffer byteBuffer;
        if (!ryVar.i()) {
            if (!ryVar.d()) {
                if (!ryVar.f()) {
                    if (m()) {
                        if (this.k >= this.l || ryVar.e() != e()) {
                            return false;
                        }
                        ByteBuffer byteBuffer2 = ryVar.d;
                        if (byteBuffer2 != null && (byteBuffer = this.d) != null) {
                            if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                                return false;
                            }
                        }
                    }
                    int i = this.k;
                    this.k = i + 1;
                    if (i == 0) {
                        this.f = ryVar.f;
                        if (ryVar.g()) {
                            d(1);
                        }
                    }
                    if (ryVar.e()) {
                        d(Integer.MIN_VALUE);
                    }
                    ByteBuffer byteBuffer3 = ryVar.d;
                    if (byteBuffer3 != null) {
                        e(byteBuffer3.remaining());
                        this.d.put(byteBuffer3);
                    }
                    this.j = ryVar.f;
                    return true;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
