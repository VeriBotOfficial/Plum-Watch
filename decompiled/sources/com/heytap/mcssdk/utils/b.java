package com.heytap.mcssdk.utils;

import android.text.TextUtils;
import com.heytap.msp.push.encrypt.AESEncrypt;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static String f10107a = null;
    public static final String b = "Y29tLm5lYXJtZS5tY3M=";
    public static String c = "";

    private static String a() {
        if (TextUtils.isEmpty(c)) {
            c = new String(com.heytap.mcssdk.a.a.b(b));
        }
        byte[] a2 = a(a(c));
        return a2 != null ? new String(a2, Charset.forName("UTF-8")) : "";
    }

    public static byte[] a(String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new byte[0];
        }
    }

    public static byte[] a(byte[] bArr) {
        int length = bArr.length % 2 == 0 ? bArr.length : bArr.length - 1;
        for (int i = 0; i < length; i += 2) {
            byte b2 = bArr[i];
            int i2 = i + 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
        return bArr;
    }

    public static String b(String str) {
        boolean z;
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            str2 = c.a(str, a());
            d.b("sdkDecrypt desDecrypt des data " + str2);
            z = true;
        } catch (Exception e) {
            d.b("sdkDecrypt DES excepiton " + e.toString());
            z = false;
        }
        if (TextUtils.isEmpty(str2) ? false : z) {
            return str2;
        }
        try {
            str2 = AESEncrypt.decrypt(AESEncrypt.SDK_APP_SECRET, str);
            f10107a = "AES";
            e.c().a(f10107a);
            d.b("sdkDecrypt desDecrypt aes data " + str2);
            return str2;
        } catch (Exception e2) {
            d.b("sdkDecrypt AES excepiton " + e2.toString());
            return str2;
        }
    }

    public static String c(String str) {
        boolean z;
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            str2 = AESEncrypt.decrypt(AESEncrypt.SDK_APP_SECRET, str);
            d.b("sdkDecrypt aesDecrypt aes data " + str2);
            z = true;
        } catch (Exception e) {
            d.b("sdkDecrypt AES excepiton " + e.toString());
            z = false;
        }
        if (TextUtils.isEmpty(str2) ? false : z) {
            return str2;
        }
        try {
            str2 = c.a(str, a());
            f10107a = "DES";
            e.c().a(f10107a);
            d.b("sdkDecrypt aesDecrypt des data " + str2);
            return str2;
        } catch (Exception e2) {
            d.b("sdkDecrypt DES excepiton " + e2.toString());
            return str2;
        }
    }

    public static String d(String str) {
        d.b("sdkDecrypt start data " + str);
        if (TextUtils.isEmpty(f10107a)) {
            f10107a = e.c().b();
        }
        if ("DES".equals(f10107a)) {
            d.b("sdkDecrypt start DES");
            return b(str);
        }
        d.b("sdkDecrypt start AES");
        return c(str);
    }
}
