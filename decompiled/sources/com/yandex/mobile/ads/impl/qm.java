package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
final class qm {

    /* renamed from: a, reason: collision with root package name */
    private long f16683a;
    private long b;
    private boolean c;

    qm() {
    }

    public final long a(jc0 jc0Var) {
        return Math.max(0L, ((this.b - 529) * 1000000) / jc0Var.A) + this.f16683a;
    }

    public final void a() {
        this.f16683a = 0L;
        this.b = 0L;
        this.c = false;
    }

    public final long a(jc0 jc0Var, ry ryVar) {
        if (this.b == 0) {
            this.f16683a = ryVar.f;
        }
        if (this.c) {
            return ryVar.f;
        }
        ByteBuffer byteBuffer = ryVar.d;
        byteBuffer.getClass();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int b = f21.b(i);
        if (b == -1) {
            this.c = true;
            this.b = 0L;
            this.f16683a = ryVar.f;
            et0.d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return ryVar.f;
        }
        long max = Math.max(0L, ((this.b - 529) * 1000000) / jc0Var.A) + this.f16683a;
        this.b += b;
        return max;
    }
}
