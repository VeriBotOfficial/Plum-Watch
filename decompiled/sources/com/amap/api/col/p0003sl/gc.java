package com.amap.api.col.p0003sl;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* compiled from: UpdateDataStrategy.java */
/* loaded from: classes11.dex */
public abstract class gc {

    /* renamed from: a, reason: collision with root package name */
    gc f1671a;
    byte[] b = null;

    gc() {
    }

    public void a(byte[] bArr) {
    }

    public byte[] a() throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        byte[] b = b(this.b);
        gc gcVar = this.f1671a;
        if (gcVar == null) {
            return b;
        }
        gcVar.b = b;
        return gcVar.a();
    }

    protected abstract byte[] b(byte[] bArr) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException;

    gc(gc gcVar) {
        this.f1671a = gcVar;
    }
}
