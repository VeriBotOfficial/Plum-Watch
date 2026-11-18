package com.baidu.mapauto.auth.util;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes15.dex */
public class AESGCMPKCS5PaddingUtil {
    private static final Charset CHARSET_UTF8 = StandardCharsets.UTF_8;
    private static final String CIPHER_ALGORITHM = "AES/GCM/NoPadding";
    private static final String DEFAULT_VALUE = "0";
    private static final String KEY_ALGORITHM = "AES";
    public static final int SECRET_KEY_LENGTH = 32;

    public static byte[] base64Decode(String str) {
        return Base64.decode(str, 2);
    }

    public static String base64Encode(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public static String decrypt(String str, String str2) {
        try {
            byte[] bArrBase64Decode = base64Decode(str);
            if (bArrBase64Decode != null && bArrBase64Decode.length >= 12) {
                byte[] bArr = new byte[12];
                int length = bArrBase64Decode.length - 12;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArrBase64Decode, 0, bArr, 0, 12);
                System.arraycopy(bArrBase64Decode, 12, bArr2, 0, length);
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, getSecretKey(str2), new GCMParameterSpec(128, bArr));
                return new String(cipher.doFinal(bArr2), CHARSET_UTF8);
            }
            return "";
        } catch (Exception e) {
            handleException(e);
            return null;
        }
    }

    public static String encrypt(String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            byte[] bArr = new byte[12];
            new SecureRandom().nextBytes(bArr);
            cipher.init(1, getSecretKey(str2), new GCMParameterSpec(128, bArr));
            byte[] bArrDoFinal = cipher.doFinal(str.getBytes(CHARSET_UTF8));
            byte[] bArr2 = new byte[bArrDoFinal.length + 12];
            System.arraycopy(bArr, 0, bArr2, 0, 12);
            System.arraycopy(bArrDoFinal, 0, bArr2, 12, bArrDoFinal.length);
            return base64Encode(bArr2);
        } catch (Exception e) {
            handleException(e);
            return null;
        }
    }

    public static SecretKeySpec getSecretKey(String str) {
        return new SecretKeySpec(toMakeKey(str, 32, "0").getBytes(CHARSET_UTF8), KEY_ALGORITHM);
    }

    private static void handleException(Exception exc) {
        exc.printStackTrace();
    }

    private static String toMakeKey(String str, int r5, String str2) {
        int length = str.length();
        if (length < r5) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            for (int r4 = 0; r4 < r5 - length; r4++) {
                sb.append(str2);
            }
            str = sb.toString();
        }
        return str.substring(0, 32);
    }
}
