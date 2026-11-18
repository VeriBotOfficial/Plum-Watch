package com.baidu.mapauto.auth.util;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;

/* JADX INFO: loaded from: classes15.dex */
public class HexUtil {
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] DIGITS_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String byte2hex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, true);
    }

    public static char[] encodeHex(byte[] bArr, boolean z) {
        return encodeHex(bArr, z ? DIGITS_LOWER : DIGITS_UPPER);
    }

    public static char[] encodeHex(byte[] bArr, char[] cArr) {
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

    public static String encodeHexStr(byte[] bArr, char[] cArr) {
        return bArr == null ? "" : new String(encodeHex(bArr, cArr));
    }

    public static byte[] hex2byte(String str) {
        if (str == null || str.length() < 2) {
            return new byte[0];
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int r0 = 0; r0 < length; r0++) {
            int r3 = r0 * 2;
            bArr[r0] = (byte) (Integer.parseInt(str.substring(r3, r3 + 2), 16) & 255);
        }
        return bArr;
    }
}
