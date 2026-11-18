package com.baidu.mshield.b.f;

import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: compiled from: RC4Util.java */
/* JADX INFO: loaded from: classes15.dex */
public class f {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        return c(bArr, bArr2);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        return c(bArr, bArr2);
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        byte[] bArrA = a(bArr2);
        byte[] bArr3 = new byte[bArr.length];
        int r2 = 0;
        int r3 = 0;
        for (int r1 = 0; r1 < bArr.length; r1++) {
            r2 = (r2 + 1) & 255;
            byte b = bArrA[r2];
            r3 = ((b & 255) + r3) & 255;
            bArrA[r2] = bArrA[r3];
            bArrA[r3] = b;
            byte b2 = (byte) (bArrA[((bArrA[r2] & 255) + (b & 255)) & 255] ^ bArr[r1]);
            bArr3[r1] = b2;
            bArr3[r1] = (byte) (b2 ^ BuiltinOptions.NegOptions);
        }
        return bArr3;
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[256];
        for (int r3 = 0; r3 < 256; r3++) {
            bArr2[r3] = (byte) r3;
        }
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        int length = 0;
        int r4 = 0;
        for (int r2 = 0; r2 < 256; r2++) {
            int r5 = bArr[length] & 255;
            byte b = bArr2[r2];
            r4 = (r5 + (b & 255) + r4) & 255;
            bArr2[r2] = bArr2[r4];
            bArr2[r4] = b;
            length = (length + 1) % bArr.length;
        }
        return bArr2;
    }
}
