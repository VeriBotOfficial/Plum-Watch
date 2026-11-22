package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes6.dex */
class LMOtsPrivateKey {
    private final byte[] I;
    private final byte[] masterSecret;
    private final LMOtsParameters parameter;

    /* renamed from: q, reason: collision with root package name */
    private final int f18831q;

    public LMOtsPrivateKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i, byte[] bArr2) {
        this.parameter = lMOtsParameters;
        this.I = bArr;
        this.f18831q = i;
        this.masterSecret = bArr2;
    }

    SeedDerive getDerivationFunction() {
        SeedDerive seedDerive = new SeedDerive(this.I, this.masterSecret, DigestUtil.getDigest(this.parameter.getDigestOID()));
        seedDerive.setQ(this.f18831q);
        return seedDerive;
    }

    public byte[] getI() {
        return this.I;
    }

    public byte[] getMasterSecret() {
        return this.masterSecret;
    }

    public LMOtsParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.f18831q;
    }
}
