package com.amap.api.col.p0003sl;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: SecurityUtil.java */
/* loaded from: classes11.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private static byte[] f1525a;
    private static String[] b = {"kp6SsA", "cHE4dQ", "JKekrA", "XBxOHQ", "CSnpKw", "VwcThw", "wkp6Sg", "1cHE4Q"};

    public static String a(String str) {
        return i9.c(str);
    }

    public static String b(String str) {
        try {
            return w9.a(a(str.getBytes("UTF-8")));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static byte[] a(byte[] bArr) {
        try {
            if (f1525a == null) {
                f1525a = m9.b("YAAAAAAAAAAAAAAAAAAAAAA").getBytes();
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f1525a);
            int[] iArr = new int[8];
            int i = 0;
            while (true) {
                String[] strArr = b;
                if (i >= strArr.length) {
                    SecretKeySpec secretKeySpec = new SecretKeySpec(a(iArr).getBytes("UTF-8"), m9.b("EQUVT"));
                    Cipher cipher = Cipher.getInstance(m9.b("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
                    cipher.init(1, secretKeySpec, ivParameterSpec);
                    return cipher.doFinal(bArr);
                }
                byte[] a2 = f9.a(strArr[i]);
                iArr[i] = ((a2[0] & 255) << 24) | (a2[3] & 255) | ((a2[2] & 255) << 8) | ((a2[1] & 255) << 16);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String a(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            int i3 = 1;
            for (int i4 = 0; i4 < 15; i4++) {
                i3 = (i3 << 2) | 1;
            }
            int i5 = ((i2 & i3) << 1) | (((i3 << 1) & i2) >>> 1);
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                i6 = (i6 >> 1) | Integer.MIN_VALUE;
            }
            int i8 = (i5 << i) | ((i5 & i6) >>> (32 - i));
            char[] cArr = new char[4];
            for (int i9 = 0; i9 < 4; i9++) {
                char c = (char) ((i8 >>> (i9 * 8)) & 255);
                cArr[3 - i9] = c;
                String str = " ";
                for (int i10 = 0; i10 < 32; i10++) {
                    str = str + (((Integer.MIN_VALUE >>> i10) & c) >>> (31 - i10));
                }
            }
            sb.append(new String(cArr));
        }
        return sb.toString();
    }
}
