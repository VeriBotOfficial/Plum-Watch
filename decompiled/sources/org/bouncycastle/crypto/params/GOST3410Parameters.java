package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes8.dex */
public class GOST3410Parameters implements CipherParameters {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f18796a;
    private BigInteger p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f18797q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.p = bigInteger;
        this.f18797q = bigInteger2;
        this.f18796a = bigInteger3;
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f18796a = bigInteger3;
        this.p = bigInteger;
        this.f18797q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.p) && gOST3410Parameters.getQ().equals(this.f18797q) && gOST3410Parameters.getA().equals(this.f18796a);
    }

    public BigInteger getA() {
        return this.f18796a;
    }

    public BigInteger getP() {
        return this.p;
    }

    public BigInteger getQ() {
        return this.f18797q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.p.hashCode() ^ this.f18797q.hashCode()) ^ this.f18796a.hashCode();
    }
}
