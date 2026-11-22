package com.wakeup.common.utils;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.wakeup.common.log.LogUtils;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public class HexUtils {
    private static final String TAG = "HexUtils";
    private static final String hexStrings = "0123456789ABCDEFGHIJKLMNOPRSTUVWXYZabcdefghijklmnoprstuvwxyz";

    public static String toHexString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(Integer.toHexString(s.charAt(i)));
        }
        return sb.toString();
    }

    public static String toStringHex(String s) {
        int length = s.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            try {
                bArr[i] = (byte) (Integer.parseInt(s.substring(i2, i2 + 2), 16) & 255);
            } catch (Exception e) {
                LogUtils.e(TAG, e.getMessage());
            }
        }
        try {
            return new String(bArr, StandardCharsets.UTF_8);
        } catch (Exception e2) {
            LogUtils.e(TAG, e2.getMessage());
            return null;
        }
    }

    public static String encode(String str) {
        byte[] bytes = str.getBytes();
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            sb.append(hexStrings.charAt((b & TransmissionUnpacked.HD_VAL_MAGIC_HB) >> 4));
            sb.append(hexStrings.charAt(b & 15));
        }
        return sb.toString();
    }

    public static String decode(String bytes) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bytes.length() / 2);
        for (int i = 0; i < bytes.length(); i += 2) {
            byteArrayOutputStream.write((hexStrings.indexOf(bytes.charAt(i)) << 4) | hexStrings.indexOf(bytes.charAt(i + 1)));
        }
        return byteArrayOutputStream.toString();
    }

    public static String ToHexString(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (byte b : str.getBytes("gbk")) {
                sb.append(Integer.toHexString(b & 255));
            }
        } catch (UnsupportedEncodingException e) {
            LogUtils.e(TAG, e.getMessage());
        }
        return sb.toString();
    }

    public static byte[] toByteArray(String hexStr) {
        String lowerCase = hexStr.toLowerCase();
        int length = lowerCase.length() / 2;
        byte[] bArr = new byte[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) ((((byte) (Character.digit(lowerCase.charAt(i), 16) & 255)) << 4) | ((byte) (Character.digit(lowerCase.charAt(i + 1), 16) & 255)));
            i += 2;
        }
        return bArr;
    }

    public static String toHexString(byte[] byteArray) {
        if (byteArray == null || byteArray.length <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(byteArray.length);
        for (byte b : byteArray) {
            stringBuffer.append(String.format("%02X", Byte.valueOf(b)));
        }
        return stringBuffer.toString();
    }

    public static String ByteArray2String(byte[] bytes) {
        return decode(toHexString(bytes));
    }

    public static String intToHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuffer stringBuffer = new StringBuffer();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (num != 0) {
            stringBuffer = stringBuffer.append(cArr[num % 16]);
            num /= 16;
        }
        return stringBuffer.reverse().toString();
    }

    public static String intToHex2(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuffer stringBuffer = new StringBuffer();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (num != 0) {
            stringBuffer = stringBuffer.append(cArr[num % 16]);
            num /= 16;
        }
        return stringBuffer.reverse().toString();
    }

    public static String getLicense(int... n) {
        StringBuilder sb = new StringBuilder();
        for (int i : n) {
            sb.append(decode(intToHex(i)));
        }
        return sb.toString();
    }

    public static String hex2Str(String hex, int hexCode) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < hex.length() - 1) {
            int i2 = i + 2;
            sb.append((char) Integer.parseInt(hex.substring(i, i2), hexCode));
            i = i2;
        }
        return sb.toString();
    }

    public static String str2Hex(String str, int hexCode) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(Integer.toString(str.charAt(i), hexCode));
        }
        return sb.toString();
    }

    public static String byteToBit(byte b) {
        return "" + ((int) ((byte) ((b >> 7) & 1))) + ((int) ((byte) ((b >> 6) & 1))) + ((int) ((byte) ((b >> 5) & 1))) + ((int) ((byte) ((b >> 4) & 1))) + ((int) ((byte) ((b >> 3) & 1))) + ((int) ((byte) ((b >> 2) & 1))) + ((int) ((byte) ((b >> 1) & 1))) + ((int) ((byte) (b & 1)));
    }
}
