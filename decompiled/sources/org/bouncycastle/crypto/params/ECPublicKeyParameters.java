package org.bouncycastle.crypto.params;

import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes8.dex */
public class ECPublicKeyParameters extends ECKeyParameters {

    /* renamed from: q, reason: collision with root package name */
    private final ECPoint f18795q;

    public ECPublicKeyParameters(ECPoint eCPoint, ECDomainParameters eCDomainParameters) {
        super(false, eCDomainParameters);
        this.f18795q = eCDomainParameters.validatePublicPoint(eCPoint);
    }

    public ECPoint getQ() {
        return this.f18795q;
    }
}
