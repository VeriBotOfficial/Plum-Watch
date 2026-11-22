package com.amap.api.col.p0003sl;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* compiled from: RSAAESEncryptProcessor.java */
/* loaded from: classes11.dex */
public final class cb extends ab {
    public cb() {
    }

    @Override // com.amap.api.col.p0003sl.ab
    protected final byte[] a(byte[] bArr) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        return f9.d(bArr);
    }

    public cb(ab abVar) {
        super(abVar);
    }
}
