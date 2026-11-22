package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.text.TextUtils;
import android.util.Base64;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12849a = "PWD_TYPE";
    public static final String b = "PWD_TYPE_N0_PADDING";
    public static final String c = "PWD_KEY";
    public static final String d = "PWD_KEY_WITHDRAW";
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    private static final Map<String, String> j;

    static {
        String d2 = z.d("UVVWVEwwTkNReTlRUzBOVE5WQmhaR1JwYm1jPQ==");
        e = d2;
        String d3 = z.d("UVVWVEwwTkNReTlPYjFCaFpHUnBibWM9");
        f = d3;
        String d4 = z.d("UTFCRElVQWpKQ1ZSTlRJNUlTQXhLZz09");
        g = d4;
        h = z.d("UVVWVA==");
        String d5 = z.d("UTFCRElVQWpKQ1ZST1RFMUlTQXhLZz09");
        i = d5;
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put(f12849a, d2);
        hashMap.put(b, d3);
        hashMap.put(c, d4);
        hashMap.put(d, d5);
    }

    public static String a(String str, String str2) {
        byte[] bArr;
        try {
            Key a2 = a(str);
            Cipher cipher = Cipher.getInstance(b(f12849a));
            cipher.init(2, a2, new IvParameterSpec(str.getBytes()));
            bArr = cipher.doFinal(Base64.decode(str2, 0));
        } catch (Exception e2) {
            e2.printStackTrace();
            bArr = null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        return new String(bArr).trim();
    }

    public static String b(String str, String str2) {
        byte[] bArr;
        try {
            Key a2 = a(str);
            Cipher cipher = Cipher.getInstance(b(f12849a));
            cipher.init(1, a2, new IvParameterSpec(str.getBytes()));
            bArr = cipher.doFinal(str2.getBytes());
        } catch (Exception e2) {
            e2.printStackTrace();
            bArr = null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        return new String(Base64.encode(bArr, 0)).trim();
    }

    public static String a(String str, String str2, String str3) {
        return a(str, str2, str3, 3);
    }

    public static String b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return j.get(str);
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(String str, String str2, String str3, int i2) {
        byte[] bArr;
        byte[] bArr2 = null;
        try {
            Cipher cipher = Cipher.getInstance(str2);
            String b2 = b(f12849a);
            String b3 = b(b);
            if (str2.equals(b2)) {
                bArr = str.getBytes();
            } else if (str2.equals(b3)) {
                int blockSize = cipher.getBlockSize();
                byte[] bytes = str.getBytes();
                int length = bytes.length;
                if (length % blockSize != 0) {
                    length += blockSize - (length % blockSize);
                }
                byte[] bArr3 = new byte[length];
                System.arraycopy(bytes, 0, bArr3, 0, bytes.length);
                bArr = bArr3;
            } else {
                bArr = null;
            }
            cipher.init(1, a(str3), new IvParameterSpec(str3.getBytes()));
            bArr2 = cipher.doFinal(bArr);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return new String(Base64.encode(bArr2, i2)).trim();
    }

    private static Key a(String str) throws Exception {
        try {
            return new SecretKeySpec(str.getBytes(), h);
        } catch (Exception e2) {
            e2.printStackTrace();
            throw e2;
        }
    }
}
