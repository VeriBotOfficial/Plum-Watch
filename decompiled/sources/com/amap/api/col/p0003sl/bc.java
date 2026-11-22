package com.amap.api.col.p0003sl;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* compiled from: EncryptRsaDataStrategy.java */
/* loaded from: classes11.dex */
public class bc extends gc {
    private ab c;

    public bc(gc gcVar) {
        super(gcVar);
        this.c = new cb();
    }

    @Override // com.amap.api.col.p0003sl.gc
    protected byte[] b(byte[] bArr) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        return this.c.b(bArr);
    }
}
