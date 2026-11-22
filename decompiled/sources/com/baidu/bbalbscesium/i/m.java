package com.baidu.bbalbscesium.i;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes12.dex */
final class m extends k {
    public static final int h = 0;

    public m(int i, int i2) {
        this.f7393a = BodyPartID.bodyIdMax;
        this.b = 4;
        this.c = 32;
        this.d = i;
        this.e = i2;
    }

    @Override // com.baidu.bbalbscesium.i.k
    public b a(byte[] bArr, int i, int i2) {
        n nVar = new n();
        nVar.a(bArr, i, i2);
        return b.a(new long[]{nVar.a()});
    }
}
