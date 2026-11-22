package com.alipay.sdk.m.i;

import android.util.Base64;
import java.security.SecureRandom;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile SecureRandom f1392a;
    public static final char[] b = "0123456789ABCDEF".toCharArray();

    public static byte[] a(long j) {
        return new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)};
    }

    public static byte[] b() {
        byte[] bArr = new byte[2];
        a().nextBytes(bArr);
        return bArr;
    }

    public static byte[] c() {
        byte[] bArr = new byte[4];
        a().nextBytes(bArr);
        return bArr;
    }

    public static byte[] a(int i) {
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }

    public static byte[] a(short s) {
        return new byte[]{(byte) s, (byte) (s >> 8)};
    }

    public static String b(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = b;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static byte[] a(char c, char c2) {
        return new byte[]{(byte) (c & 255), (byte) (c2 & 255)};
    }

    public static byte[] a(char c) {
        return new byte[]{(byte) (c & 255)};
    }

    public static byte[] a(byte b2) {
        return new byte[]{b2};
    }

    public static SecureRandom a() {
        if (f1392a != null) {
            return f1392a;
        }
        synchronized (c.class) {
            if (f1392a == null) {
                f1392a = new SecureRandom();
            }
        }
        return f1392a;
    }

    public static byte[] a(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        byte[] bArr3 = null;
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            if (bArr3 == null) {
                bArr3 = Arrays.copyOf(bArr4, i);
                i2 = bArr4.length;
            } else {
                System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
                i2 += bArr4.length;
            }
        }
        return bArr3;
    }

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 3);
    }
}
