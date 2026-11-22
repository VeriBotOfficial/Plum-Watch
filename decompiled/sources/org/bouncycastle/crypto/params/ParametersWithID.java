package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes8.dex */
public class ParametersWithID implements CipherParameters {

    /* renamed from: id, reason: collision with root package name */
    private byte[] f18798id;
    private CipherParameters parameters;

    public ParametersWithID(CipherParameters cipherParameters, byte[] bArr) {
        this.parameters = cipherParameters;
        this.f18798id = bArr;
    }

    public byte[] getID() {
        return this.f18798id;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }
}
