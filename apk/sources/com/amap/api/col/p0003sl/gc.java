package com.amap.api.col.p0003sl;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: compiled from: UpdateDataStrategy.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    gc f1671a;
    byte[] b = null;

    gc() {
    }

    public void a(byte[] bArr) {
    }

    public byte[] a() throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException {
        byte[] bArrB = b(this.b);
        gc gcVar = this.f1671a;
        if (gcVar == null) {
            return bArrB;
        }
        gcVar.b = bArrB;
        return gcVar.a();
    }

    protected abstract byte[] b(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException;

    gc(gc gcVar) {
        this.f1671a = gcVar;
    }
}
