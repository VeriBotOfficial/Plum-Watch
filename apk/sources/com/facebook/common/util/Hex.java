package com.facebook.common.util;

import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes11.dex */
public class Hex {
    private static final byte[] DIGITS;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] FIRST_CHAR = new char[256];
    private static final char[] SECOND_CHAR = new char[256];

    static {
        for (int r2 = 0; r2 < 256; r2++) {
            char[] cArr = FIRST_CHAR;
            char[] cArr2 = HEX_DIGITS;
            cArr[r2] = cArr2[(r2 >> 4) & 15];
            SECOND_CHAR[r2] = cArr2[r2 & 15];
        }
        DIGITS = new byte[103];
        for (int r0 = 0; r0 <= 70; r0++) {
            DIGITS[r0] = -1;
        }
        for (byte b = 0; b < 10; b = (byte) (b + 1)) {
            DIGITS[b + BuiltinOptions.SliceOptions] = b;
        }
        for (byte b2 = 0; b2 < 6; b2 = (byte) (b2 + 1)) {
            byte[] bArr = DIGITS;
            byte b3 = (byte) (b2 + 10);
            bArr[b2 + BuiltinOptions.FloorDivOptions] = b3;
            bArr[b2 + BuiltinOptions.ScatterNdOptions] = b3;
        }
    }

    public static String byte2Hex(int r2) {
        if (r2 > 255 || r2 < 0) {
            throw new IllegalArgumentException("The int converting to hex should be in range 0~255");
        }
        return String.valueOf(FIRST_CHAR[r2]) + String.valueOf(SECOND_CHAR[r2]);
    }

    public static String encodeHex(byte[] bArr, boolean z) {
        int r4;
        char[] cArr = new char[bArr.length * 2];
        int r3 = 0;
        for (int r2 = 0; r2 < bArr.length && ((r4 = bArr[r2] & 255) != 0 || !z); r2++) {
            int r5 = r3 + 1;
            cArr[r3] = FIRST_CHAR[r4];
            r3 += 2;
            cArr[r5] = SECOND_CHAR[r4];
        }
        return new String(cArr, 0, r3);
    }

    public static byte[] decodeHex(String str) {
        byte[] bArr;
        byte b;
        byte b2;
        int length = str.length();
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("Odd number of characters.");
        }
        byte[] bArr2 = new byte[length >> 1];
        int r2 = 0;
        int r3 = 0;
        while (r2 < length) {
            int r4 = r2 + 1;
            char cCharAt = str.charAt(r2);
            if (cCharAt <= 'f' && (b = (bArr = DIGITS)[cCharAt]) != -1) {
                r2 += 2;
                char cCharAt2 = str.charAt(r4);
                if (cCharAt2 <= 'f' && (b2 = bArr[cCharAt2]) != -1) {
                    bArr2[r3] = (byte) (b2 | (b << 4));
                    r3++;
                }
            }
            throw new IllegalArgumentException("Invalid hexadecimal digit: " + str);
        }
        return bArr2;
    }

    public static byte[] hexStringToByteArray(String str) {
        return decodeHex(str.replaceAll(" ", ""));
    }
}
