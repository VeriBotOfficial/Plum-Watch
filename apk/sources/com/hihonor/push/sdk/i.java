package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class i {
    public static byte[] a(byte[] bArr, int r4) {
        if (bArr == null) {
            return bArr;
        }
        for (int r0 = 0; r0 < bArr.length; r0++) {
            if (r4 < 0) {
                bArr[r0] = (byte) (bArr[r0] << (-r4));
            } else {
                bArr[r0] = (byte) (bArr[r0] >> r4);
            }
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = null;
        if (bArr != null) {
            int length = bArr.length;
            if (bArr2.length != length) {
                return null;
            }
            bArr3 = new byte[length];
            for (int r2 = 0; r2 < length; r2++) {
                bArr3[r2] = (byte) (bArr[r2] ^ bArr2[r2]);
            }
        }
        return bArr3;
    }
}
