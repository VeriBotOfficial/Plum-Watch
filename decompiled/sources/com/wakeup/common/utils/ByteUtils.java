package com.wakeup.common.utils;

import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.exifinterface.media.ExifInterface;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ByteUtils {
    private static final String[] hexArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public static byte[] hexStringToBytes(String hexString) {
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        String upperCase = hexString.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (charToByte(charArray[i2 + 1]) | (charToByte(charArray[i2]) << 4));
        }
        return bArr;
    }

    public static String bytesToHexStr(byte[] src) {
        StringBuilder sb = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (byte b : src) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String stringToHexString(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            str = str + Integer.toHexString(s.charAt(i));
        }
        return str;
    }

    public static String hexStringToString(String s) {
        if (s == null || s.equals("")) {
            return null;
        }
        String replace = s.replace(" ", "");
        int length = replace.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            try {
                bArr[i] = (byte) (Integer.parseInt(replace.substring(i2, i2 + 2), 16) & 255);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            return new String(bArr, "gbk");
        } catch (Exception e2) {
            e2.printStackTrace();
            return replace;
        }
    }

    public static String str2Hex(String str) throws UnsupportedEncodingException {
        char[] charArray = String.format("%x", new BigInteger(1, str.getBytes(StandardCharsets.UTF_8))).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length; i += 2) {
            sb.append("\\x").append(charArray[i]).append(charArray[i + 1]);
        }
        return sb.toString();
    }

    public static String hex2Str(String str) throws UnsupportedEncodingException {
        String[] split = str.split("\\\\");
        byte[] bArr = new byte[split.length - 1];
        for (int i = 1; i < split.length; i++) {
            bArr[i - 1] = Integer.decode("0" + split[i]).byteValue();
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    private static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    public static int convertNum(String str) {
        int i = 0;
        int i2 = 2;
        String[] strArr = {ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", TokenNames.C, "D", "E", TokenNames.F};
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 <= 9; i3++) {
            hashMap.put(i3 + "", Integer.valueOf(i3));
        }
        for (int i4 = 10; i4 <= 15; i4++) {
            hashMap.put(strArr[i4 - 10], Integer.valueOf(i4));
        }
        int length = str.length();
        String[] strArr2 = new String[length];
        int i5 = 0;
        while (i5 <= str.length() - 1) {
            int i6 = i5 + 1;
            strArr2[i5] = str.substring(i5, i6);
            i5 = i6;
        }
        while (true) {
            if (i2 > length - 1) {
                return i;
            }
            i = (int) (i + (((Integer) hashMap.get(strArr2[i2])).intValue() * Math.pow(16.0d, r14 - i2)));
            i2++;
        }
    }

    public static final String byteToHex(int n) {
        if (n < 0) {
            n += 256;
        }
        int i = n / 16;
        StringBuilder sb = new StringBuilder();
        String[] strArr = hexArray;
        return sb.append(strArr[i]).append(strArr[n % 16]).toString();
    }

    public static short byte2Short(byte[] buf) {
        if (buf == null) {
            throw new IllegalArgumentException("byte array is null!");
        }
        if (buf.length > 2) {
            throw new IllegalArgumentException("byte array size > 2 !");
        }
        short s = 0;
        for (byte b : buf) {
            s = (short) (((short) (s << 8)) | (b & 255));
        }
        return s;
    }

    public static byte[] subBytes(byte[] bytes, int begin, int length) {
        byte[] bArr = new byte[length];
        System.arraycopy(bytes, begin, bArr, 0, length);
        return bArr;
    }
}
