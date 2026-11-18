package com.bytedance.sdk.component.hm;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes15.dex */
public class fxn {
    private static String fxn;

    public static String fxn(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            if (TextUtils.isEmpty(fxn)) {
                fxn = fxn(AESEncrypter.DEFAULT_ALGORITHM);
            }
            Cipher cipher = Cipher.getInstance(fxn);
            cipher.init(1, secretKeySpec);
            return Base64.encodeToString(cipher.doFinal(str.getBytes("utf-8")), 0);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static String fxn(String str, String str2, String str3) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(), "AES");
        try {
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            cipher.init(1, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes("utf-8")), 0);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static String kg(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            cipher.init(2, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return new String(cipher.doFinal(bArrDecode));
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static String kg(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            if (TextUtils.isEmpty(fxn)) {
                fxn = fxn(AESEncrypter.DEFAULT_ALGORITHM);
            }
            Cipher cipher = Cipher.getInstance(fxn);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(bArrDecode));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String fxn(String str) {
        int[] r0 = new int[str.length()];
        r0[4] = 6;
        r0[5] = 1;
        r0[6] = 1;
        return new String(fxn(str.getBytes(), r0));
    }

    public static byte[] fxn(byte[] bArr, int[] r5) {
        if (bArr == null || bArr.length == 0 || r5 == null || r5.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int r1 = 0; r1 < bArr.length; r1++) {
            bArr2[r1] = (byte) (bArr[r1] ^ r5[r1 % r5.length]);
        }
        return bArr2;
    }
}
