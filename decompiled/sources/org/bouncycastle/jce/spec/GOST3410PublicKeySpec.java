package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes4.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f18812a;
    private BigInteger p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f18813q;
    private BigInteger y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.y = bigInteger;
        this.p = bigInteger2;
        this.f18813q = bigInteger3;
        this.f18812a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f18812a;
    }

    public BigInteger getP() {
        return this.p;
    }

    public BigInteger getQ() {
        return this.f18813q;
    }

    public BigInteger getY() {
        return this.y;
    }
}
