package com.baidu.mapauto.auth.util;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes13.dex */
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
            byte[] base64Decode = base64Decode(str);
            if (base64Decode != null && base64Decode.length >= 12) {
                byte[] bArr = new byte[12];
                int length = base64Decode.length - 12;
                byte[] bArr2 = new byte[length];
                System.arraycopy(base64Decode, 0, bArr, 0, 12);
                System.arraycopy(base64Decode, 12, bArr2, 0, length);
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
            byte[] doFinal = cipher.doFinal(str.getBytes(CHARSET_UTF8));
            byte[] bArr2 = new byte[doFinal.length + 12];
            System.arraycopy(bArr, 0, bArr2, 0, 12);
            System.arraycopy(doFinal, 0, bArr2, 12, doFinal.length);
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

    private static String toMakeKey(String str, int i, String str2) {
        int length = str.length();
        if (length < i) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            for (int i2 = 0; i2 < i - length; i2++) {
                sb.append(str2);
            }
            str = sb.toString();
        }
        return str.substring(0, 32);
    }
}
