package com.alipay.sdk.m.p;

import android.text.TextUtils;
import java.security.SecureRandom;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes7.dex */
public class c {
    public static byte[] a(Cipher cipher, String str) {
        SecureRandom secureRandom = new SecureRandom();
        int blockSize = cipher.getBlockSize();
        if (TextUtils.isEmpty(str)) {
            str = String.valueOf(secureRandom.nextDouble());
        }
        int r1 = blockSize * 2;
        byte[] bArr = new byte[r1];
        byte[] bArr2 = new byte[blockSize];
        secureRandom.nextBytes(bArr2);
        for (int r0 = 1; r0 < r1; r0++) {
            byte bCodePointAt = (byte) (str.codePointAt(r0 % str.length()) & 127);
            bArr[r0] = bCodePointAt;
            if (r0 >= blockSize) {
                bArr[r0] = (byte) (bArr[0] & bCodePointAt);
            }
        }
        System.arraycopy(bArr, blockSize, bArr2, 0, blockSize);
        return bArr2;
    }
}
