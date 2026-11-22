package com.amap.api.col.p0003sl;

/* compiled from: AESMD5Util.java */
/* loaded from: classes11.dex */
public class x8 {
    public static byte[] a(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3 = null;
        try {
            try {
                bArr2 = a("16,99,86,77,511,98,86,97,511,99,86,77,511,18,48,97,511,99,86,77,511,58,601,77,511,58,48,77,511,58,86,87,511,18,48,97,511,58,86,87,511,18,48,97,511,98,48,87,511,98,48,97,511,99,86,77,511,58,221,77,511,98,601,87");
            } catch (Throwable th) {
                ja.a(th, "AMU", "grk");
                bArr2 = null;
            }
            try {
                bArr3 = a("16,18,86,97,511,18,48,97,511,18,86,97,511,58,86,77,511,18,86,97,511,58,48,77,511,18,86,97,511,58,601,77,511,18,86,97,511,58,221,77,511,18,86,97,511,58,86,87,511,18,86,97,511,58,48,87,511,18,86,97,511,58,601,87");
            } catch (Throwable th2) {
                ja.a(th2, "AMU", "giv");
            }
            return f9.b(bArr2, bArr, bArr3);
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3 = null;
        try {
            try {
                bArr2 = a("16,99,86,77,511,98,86,97,511,99,86,77,511,18,48,97,511,99,86,77,511,58,601,77,511,58,48,77,511,58,86,87,511,18,48,97,511,58,86,87,511,18,48,97,511,98,48,87,511,98,48,97,511,99,86,77,511,58,221,77,511,98,601,87");
            } catch (Throwable th) {
                ja.a(th, "AMU", "grk");
                bArr2 = null;
            }
            try {
                bArr3 = a("16,18,86,97,511,18,48,97,511,18,86,97,511,58,86,77,511,18,86,97,511,58,48,77,511,18,86,97,511,58,601,77,511,18,86,97,511,58,221,77,511,18,86,97,511,58,86,87,511,18,86,97,511,58,48,87,511,18,86,97,511,58,601,87");
            } catch (Throwable th2) {
                ja.a(th2, "AMU", "giv");
            }
            return f9.c(bArr2, bArr, bArr3);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    private static byte[] a(String str) {
        try {
            String[] split = new StringBuffer(str).reverse().toString().split(",");
            int length = split.length;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr[i] = Byte.parseByte(split[i]);
            }
            String[] split2 = new StringBuffer(new String(w9.a(new String(bArr)), "UTF-8")).reverse().toString().split(",");
            byte[] bArr2 = new byte[split2.length];
            for (int i2 = 0; i2 < split2.length; i2++) {
                bArr2[i2] = Byte.parseByte(split2[i2]);
            }
            return bArr2;
        } catch (Throwable th) {
            ja.a(th, "AMU", "rcs");
            return null;
        }
    }
}
