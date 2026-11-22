package com.wakeup.common.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class CryptTools {
    public static final String HMAC_SHA1 = "HmacSHA1";
    public static final String HMAC_SHA256 = "HmacSHA256";
    private static final char[] md5String = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String hmacEncrypt(String encryptType, String plainText, String encryptKey) throws SignatureException {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(encryptKey.getBytes(StandardCharsets.UTF_8), encryptType);
            Mac mac = Mac.getInstance(encryptType);
            mac.init(secretKeySpec);
            return Base64.getEncoder().encodeToString(mac.doFinal(plainText.getBytes(StandardCharsets.UTF_8)));
        } catch (InvalidKeyException e) {
            throw new SignatureException("InvalidKeyException:" + e.getMessage());
        } catch (NoSuchAlgorithmException e2) {
            throw new SignatureException("NoSuchAlgorithmException:" + e2.getMessage());
        }
    }

    public static String md5Encrypt(String pstr) throws SignatureException {
        try {
            byte[] bytes = pstr.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            char[] cArr = new char[digest.length * 2];
            int i = 0;
            for (byte b : digest) {
                int i2 = i + 1;
                char[] cArr2 = md5String;
                cArr[i] = cArr2[(b >>> 4) & 15];
                i += 2;
                cArr[i2] = cArr2[b & 15];
            }
            return new String(cArr);
        } catch (NoSuchAlgorithmException e) {
            throw new SignatureException("NoSuchAlgorithmException:" + e.getMessage());
        }
    }

    public static String base64Encode(String plainText) {
        return Base64.getEncoder().encodeToString(plainText.getBytes(StandardCharsets.UTF_8));
    }

    public static String parseMapToPathParam(Map<String, Object> param) {
        StringBuilder sb = new StringBuilder();
        try {
            boolean z = true;
            for (Map.Entry<String, Object> entry : param.entrySet()) {
                if (z) {
                    z = false;
                } else {
                    sb.append("&");
                }
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException unused) {
        }
        return sb.toString();
    }
}
