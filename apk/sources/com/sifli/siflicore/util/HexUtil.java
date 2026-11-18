package com.sifli.siflicore.util;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;

/* JADX INFO: loaded from: classes11.dex */
public class HexUtil {
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] DIGITS_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, true);
    }

    public static char[] encodeHex(byte[] bArr, boolean z) {
        return encodeHex(bArr, z ? DIGITS_LOWER : DIGITS_UPPER);
    }

    protected static char[] encodeHex(byte[] bArr, char[] cArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr2 = new char[bArr.length << 1];
        int r3 = 0;
        for (byte b : bArr) {
            int r4 = r3 + 1;
            cArr2[r3] = cArr[(b & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4];
            r3 += 2;
            cArr2[r4] = cArr[b & 15];
        }
        return cArr2;
    }

    public static String encodeHexStr(byte[] bArr) {
        return encodeHexStr(bArr, true);
    }

    public static String encodeHexStr(byte[] bArr, boolean z) {
        return encodeHexStr(bArr, z ? DIGITS_LOWER : DIGITS_UPPER);
    }

    protected static String encodeHexStr(byte[] bArr, char[] cArr) {
        return new String(encodeHex(bArr, cArr));
    }

    public static String formatHexString(byte[] bArr) {
        return formatHexString(bArr, false);
    }

    public static String formatHexString(byte[] bArr, boolean z) {
        if (bArr == null || bArr.length < 1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
            if (z) {
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static byte[] decodeHex(char[] cArr) {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new RuntimeException("Odd number of characters.");
        }
        byte[] bArr = new byte[length >> 1];
        int r2 = 0;
        int r3 = 0;
        while (r2 < length) {
            int r5 = r2 + 1;
            int digit = (toDigit(cArr[r2], r2) << 4) | toDigit(cArr[r5], r5);
            r2 += 2;
            bArr[r3] = (byte) (digit & 255);
            r3++;
        }
        return bArr;
    }

    protected static int toDigit(char c, int r4) {
        int r0 = Character.digit(c, 16);
        if (r0 != -1) {
            return r0;
        }
        throw new RuntimeException("Illegal hexadecimal character " + c + " at index " + r4);
    }

    public static byte[] hexStringToBytes(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String upperCase = str.trim().toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int r2 = 0; r2 < length; r2++) {
            int r3 = r2 * 2;
            bArr[r2] = (byte) (charToByte(charArray[r3 + 1]) | (charToByte(charArray[r3]) << 4));
        }
        return bArr;
    }

    public static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    public static String extractData(byte[] bArr, int r2) {
        return formatHexString(new byte[]{bArr[r2]});
    }
}
