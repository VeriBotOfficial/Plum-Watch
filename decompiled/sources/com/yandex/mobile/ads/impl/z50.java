package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class z50 extends sy1 {
    @Override // com.yandex.mobile.ads.impl.sy1
    protected final k01 a(n01 n01Var, ByteBuffer byteBuffer) {
        ag1 ag1Var = new ag1(byteBuffer.limit(), byteBuffer.array());
        String q2 = ag1Var.q();
        q2.getClass();
        String q3 = ag1Var.q();
        q3.getClass();
        return new k01(new y50(q2, q3, ag1Var.p(), ag1Var.p(), Arrays.copyOfRange(ag1Var.c(), ag1Var.d(), ag1Var.e())));
    }
}
