package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes5.dex */
public final class u40 extends uy1 {
    private final v40 m;

    public u40(List<byte[]> list) {
        ag1 ag1Var = new ag1(list.get(0));
        this.m = new v40(ag1Var.z(), ag1Var.z());
    }

    @Override // com.yandex.mobile.ads.impl.uy1
    protected final n32 a(byte[] bArr, int i, boolean z) {
        if (z) {
            this.m.d();
        }
        return new w40(this.m.a(i, bArr));
    }
}
