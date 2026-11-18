package com.bluetrum.fota.utils;

/* JADX INFO: loaded from: classes15.dex */
public final class HexUtils {
    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    public static String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 3];
        for (int r1 = 0; r1 < bArr.length; r1++) {
            byte b = bArr[r1];
            int r4 = r1 * 3;
            char[] cArr2 = HEX_ARRAY;
            cArr[r4] = cArr2[(b & 255) >>> 4];
            cArr[r4 + 1] = cArr2[b & 15];
            cArr[r4 + 2] = ' ';
        }
        return new String(cArr);
    }
}
