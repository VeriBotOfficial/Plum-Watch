package com.wakeup.common.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes2.dex */
public class SHAUtil {
    public static byte[] decryptBASE64(String key) {
        return android.util.Base64.decode(key, 0);
    }

    public static String encryptBASE64(byte[] key) {
        return android.util.Base64.encodeToString(key, 0);
    }

    public static String encryptBASE644648(byte[] key) {
        return android.util.Base64.encodeToString(key, 0);
    }

    public static String encodeSha1ToBase64(String inStr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            byte[] bArr = new byte[0];
            try {
                bArr = inStr.getBytes("UTF-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
            byte[] digest = messageDigest.digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                int i = b & 255;
                if (i < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i));
            }
            return encryptBASE64(stringBuffer.toString().getBytes());
        } catch (Exception e2) {
            System.out.println(e2.toString());
            e2.printStackTrace();
            return "";
        }
    }

    public static String getValueEncoded(String value) {
        if (value == null) {
            return AbstractJsonLexerKt.NULL;
        }
        String replace = value.replace("\n", "");
        int length = replace.length();
        for (int i = 0; i < length; i++) {
            char charAt = replace.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                try {
                    return URLEncoder.encode(replace, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        return replace;
    }
}
