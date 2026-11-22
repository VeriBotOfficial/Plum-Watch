package com.baidu.bbalbscesium.k.d;

import java.math.BigInteger;

/* loaded from: classes12.dex */
public class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f7433a;
    private BigInteger b;

    public e(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f7433a = bigInteger;
        this.b = bigInteger2;
    }

    public e(byte[] bArr, byte[] bArr2) {
        this.f7433a = new BigInteger(bArr);
        this.b = new BigInteger(bArr2);
    }

    @Override // com.baidu.bbalbscesium.k.d.d
    public BigInteger a() {
        return this.f7433a;
    }

    @Override // com.baidu.bbalbscesium.k.d.d
    public BigInteger b() {
        return this.b;
    }
}
