package com.baidu.bbalbscesium.k.a;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/* loaded from: classes12.dex */
public class c {
    public static final SecureRandom b = new SecureRandom();

    /* renamed from: a, reason: collision with root package name */
    private e f7419a;

    public c() {
        this.f7419a = null;
        this.f7419a = new e(new b(), 16);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        c cVar = new c();
        cVar.a(2, bArr, bArr2);
        return cVar.a(bArr3);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        c cVar = new c();
        cVar.a(1, bArr, bArr2);
        return cVar.a(bArr3);
    }

    public void a(int i, byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException, InvalidKeyException {
        this.f7419a.a(i, bArr, bArr2, b);
    }

    public final byte[] a(byte[] bArr) throws IllegalBlockSizeException, BadPaddingException {
        if (bArr != null) {
            return this.f7419a.a(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("Null input buffer");
    }
}
