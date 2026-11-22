package com.amap.location.collection.utils;

import com.amap.location.support.security.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes11.dex */
public class AESUtil {
    private static final String ALGORITHM = "AES";
    private static final int KEY_LENGTEH = 16;
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";

    public static byte[] createKey(String str) throws Exception {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append(str);
        while (sb.length() < 16) {
            sb.append("0");
        }
        if (sb.length() > 16) {
            sb.setLength(16);
        }
        return getMD5(sb.toString());
    }

    public static byte[] encrypt(String str, byte[] bArr) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(createKey(str), ALGORITHM);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(getIV());
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr);
    }

    private static byte[] getIV() {
        String[] split = new StringBuffer("16,16,18,77,15,911,121,77,121,911,38,77,911,99,86,67,611,96,48,77,84,911,38,67,021,301,86,67,611,98,48,77,511,77,48,97,511,58,48,97,511,84,501,87,511,96,48,77,221,911,38,77,121,37,86,67,25,301,86,67,021,96,86,67,021,701,86,67,35,56,86,67,611,37,221,87").reverse().toString().split(",");
        byte[] bArr = new byte[split.length];
        for (int i = 0; i < split.length; i++) {
            bArr[i] = Byte.parseByte(split[i]);
        }
        String[] split2 = new StringBuffer(new String(Base64.decode(bArr, 2))).reverse().toString().split(",");
        byte[] bArr2 = new byte[split2.length];
        for (int i2 = 0; i2 < split2.length; i2++) {
            bArr2[i2] = Byte.parseByte(split2[i2]);
        }
        return bArr2;
    }

    private static byte[] getMD5(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        messageDigest.update(str.getBytes());
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (int i : digest) {
            if (i < 0) {
                i += 256;
            }
            if (i < 16) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(i));
        }
        if (sb.length() > 16) {
            sb.setLength(16);
        }
        return sb.toString().getBytes();
    }
}
