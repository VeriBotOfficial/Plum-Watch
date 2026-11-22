package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f18810a;
    private BigInteger p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f18811q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.p = bigInteger;
        this.f18811q = bigInteger2;
        this.f18810a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
            if (this.f18810a.equals(gOST3410PublicKeyParameterSetSpec.f18810a) && this.p.equals(gOST3410PublicKeyParameterSetSpec.p) && this.f18811q.equals(gOST3410PublicKeyParameterSetSpec.f18811q)) {
                return true;
            }
        }
        return false;
    }

    public BigInteger getA() {
        return this.f18810a;
    }

    public BigInteger getP() {
        return this.p;
    }

    public BigInteger getQ() {
        return this.f18811q;
    }

    public int hashCode() {
        return (this.f18810a.hashCode() ^ this.p.hashCode()) ^ this.f18811q.hashCode();
    }
}
