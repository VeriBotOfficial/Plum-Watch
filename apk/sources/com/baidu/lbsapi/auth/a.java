package com.baidu.lbsapi.auth;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes15.dex */
public final class a {
    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        if (bArr == null || bArr.length <= 0 || bArr2 == null || bArr2.length <= 0 || bArr3 == null || bArr3.length <= 0) {
            return null;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArr));
        return cipher.doFinal(bArr3);
    }
}
