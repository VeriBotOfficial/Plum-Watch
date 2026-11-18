package com.huawei.agconnect.config.impl;

/* JADX INFO: loaded from: classes16.dex */
public class Hex {
    private static final char[] HEX_CODE = "0123456789ABCDEF".toCharArray();

    private static byte[] decodeHex(char[] cArr) {
        if ((cArr.length & 1) != 0) {
            throw new IllegalArgumentException("Odd number of characters.");
        }
        byte[] bArr = new byte[cArr.length >> 1];
        int r1 = 0;
        int r2 = 0;
        while (r1 < cArr.length) {
            int r3 = Character.digit(cArr[r1], 16);
            if (r3 == -1) {
                throw new IllegalArgumentException("Illegal hexadecimal character at index " + r1);
            }
            int r7 = r1 + 1;
            int r4 = Character.digit(cArr[r7], 16);
            if (r4 == -1) {
                throw new IllegalArgumentException("Illegal hexadecimal character at index " + r7);
            }
            r1 += 2;
            bArr[r2] = (byte) (((r3 << 4) | r4) & 255);
            r2++;
        }
        return bArr;
    }

    public static byte[] decodeHexString(String str) {
        return decodeHex(str.toCharArray());
    }

    public static String encodeHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = HEX_CODE;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
