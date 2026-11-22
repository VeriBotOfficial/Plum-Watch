package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

/* loaded from: classes8.dex */
public class SM2ParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: id, reason: collision with root package name */
    private byte[] f18805id;

    public SM2ParameterSpec(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("id string cannot be null");
        }
        this.f18805id = Arrays.clone(bArr);
    }

    public byte[] getID() {
        return Arrays.clone(this.f18805id);
    }
}
