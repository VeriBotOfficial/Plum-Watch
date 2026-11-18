package com.amap.api.col.p0003sl;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: compiled from: EncryptProcessor.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ab f1526a;

    ab() {
    }

    protected abstract byte[] a(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException;

    public byte[] b(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException {
        ab abVar = this.f1526a;
        if (abVar != null) {
            bArr = abVar.b(bArr);
        }
        return a(bArr);
    }

    ab(ab abVar) {
        this.f1526a = abVar;
    }
}
