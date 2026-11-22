package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public abstract class uy1 extends py1<r32, s32, p32> implements o32 {
    protected abstract n32 a(byte[] bArr, int i, boolean z) throws p32;

    @Override // com.yandex.mobile.ads.impl.o32
    public final void a(long j) {
    }

    @Override // com.yandex.mobile.ads.impl.py1
    protected final r32 c() {
        return new r32();
    }

    @Override // com.yandex.mobile.ads.impl.py1
    protected final s32 d() {
        return new ty1(this);
    }

    protected uy1() {
        super(new r32[2], new s32[2]);
        f();
    }

    @Override // com.yandex.mobile.ads.impl.py1
    protected final p32 a(ry ryVar, sy syVar, boolean z) {
        r32 r32Var = (r32) ryVar;
        s32 s32Var = (s32) syVar;
        try {
            ByteBuffer byteBuffer = r32Var.d;
            byteBuffer.getClass();
            s32Var.a(r32Var.f, a(byteBuffer.array(), byteBuffer.limit(), z), r32Var.j);
            s32Var.c();
            return null;
        } catch (p32 e) {
            return e;
        }
    }
}
