package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public abstract class sy1 implements l01 {
    protected abstract k01 a(n01 n01Var, ByteBuffer byteBuffer);

    @Override // com.yandex.mobile.ads.impl.l01
    public final k01 a(n01 n01Var) {
        ByteBuffer byteBuffer = n01Var.d;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            if (n01Var.e()) {
                return null;
            }
            return a(n01Var, byteBuffer);
        }
        throw new IllegalArgumentException();
    }
}
