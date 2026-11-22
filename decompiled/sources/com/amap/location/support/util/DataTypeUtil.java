package com.amap.location.support.util;

import com.amap.location.support.security.Base64;
import java.text.SimpleDateFormat;

/* loaded from: classes11.dex */
public class DataTypeUtil {
    private static String sLastSdfPattern;
    private static SimpleDateFormat sdf;

    public static String base64ToStr(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        try {
            return new String(Base64.decode(str, 0));
        } catch (Exception unused) {
            return null;
        }
    }

    public static double boundaryProtect(double d, double d2, double d3) {
        return d < d2 ? d2 : d > d3 ? d3 : d;
    }

    public static float boundaryProtect(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int boundaryProtect(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static long boundaryProtect(long j, long j2, long j3) {
        return j < j2 ? j2 : j > j3 ? j3 : j;
    }

    public static String bytes2HexString(byte[] bArr, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            if (str != null && str.length() > 0) {
                sb.append(str);
            }
            if (hexString.length() < 2) {
                sb.append("0");
            }
            sb.append(hexString);
            if (str2 != null && str2.length() > 0 && i < bArr.length - 1) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public static int bytes2Int(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = (i2 << 8) | (bArr[i + i3] & 255);
        }
        return i2;
    }

    public static long bytes2Long(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            j = (j << 8) | (bArr[i + i2] & 255);
        }
        return j;
    }

    public static short bytes2Short(byte[] bArr, int i) {
        short s = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            s = (short) (((short) (s << 8)) | (bArr[i + i2] & 255));
        }
        return s;
    }

    public static byte[] digital2bytes(int i, int i2, boolean z) {
        if (i2 < 0 || i2 > 4) {
            throw new IllegalArgumentException("width 应该在 0-4 之间");
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        if (z) {
            while (i3 < i2) {
                bArr[i3] = (byte) ((i >> (((i2 - i3) - 1) * 8)) & 255);
                i3++;
            }
        } else {
            while (i3 < i2) {
                bArr[i3] = (byte) ((i >> (i3 * 8)) & 255);
                i3++;
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0009, code lost:
    
        if (r5.length() == 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.String formatTime(long r3, java.lang.String r5) {
        /*
            java.lang.Class<com.amap.location.support.util.DataTypeUtil> r0 = com.amap.location.support.util.DataTypeUtil.class
            monitor-enter(r0)
            if (r5 == 0) goto Lb
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto Ld
        Lb:
            java.lang.String r5 = "yyyy-MM-dd HH:mm:ss:SSS"
        Ld:
            java.text.SimpleDateFormat r1 = com.amap.location.support.util.DataTypeUtil.sdf     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto L22
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L4c
            java.util.Locale r2 = java.util.Locale.CHINA     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L4c
            r1.<init>(r5, r2)     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L4c
            com.amap.location.support.util.DataTypeUtil.sdf = r1     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L4c
            com.amap.location.support.util.DataTypeUtil.sLastSdfPattern = r5     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L4c
            goto L31
        L1d:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L4c
            goto L31
        L22:
            java.lang.String r1 = com.amap.location.support.util.DataTypeUtil.sLastSdfPattern     // Catch: java.lang.Throwable -> L4c
            boolean r1 = r5.equals(r1)     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto L31
            java.text.SimpleDateFormat r1 = com.amap.location.support.util.DataTypeUtil.sdf     // Catch: java.lang.Throwable -> L4c
            r1.applyPattern(r5)     // Catch: java.lang.Throwable -> L4c
            com.amap.location.support.util.DataTypeUtil.sLastSdfPattern = r5     // Catch: java.lang.Throwable -> L4c
        L31:
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L3b
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4c
        L3b:
            java.text.SimpleDateFormat r5 = com.amap.location.support.util.DataTypeUtil.sdf     // Catch: java.lang.Throwable -> L4c
            if (r5 != 0) goto L42
            java.lang.String r3 = "NULL"
            goto L4a
        L42:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r5.format(r3)     // Catch: java.lang.Throwable -> L4c
        L4a:
            monitor-exit(r0)
            return r3
        L4c:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.location.support.util.DataTypeUtil.formatTime(long, java.lang.String):java.lang.String");
    }

    public static byte[] hexString2bytes(String str, String str2, String str3) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (str2 == null || str2.length() <= 0) {
            i = 2;
            i2 = 0;
        } else {
            i2 = str2.length();
            i = i2 + 2;
        }
        if (str3 == null || str3.length() <= 0) {
            i3 = 0;
        } else {
            i3 = str3.length();
            i += i3;
        }
        if ((str.length() + i3) % i != 0) {
            throw new IllegalArgumentException("str 是不满足在规则的");
        }
        int length = (str.length() + i3) / i;
        byte[] bArr = new byte[length];
        int i5 = i2;
        while (i5 < str.length()) {
            bArr[i4] = (byte) Integer.parseInt(str.substring(i5, i5 + 2), 16);
            i5 += i3 + 2 + i2;
            i4++;
        }
        if (i4 >= length) {
            return bArr;
        }
        throw new IllegalArgumentException("str 是不满足在规则的, 这是不可能的");
    }

    public static byte[] int2Bytes(int i) {
        byte[] bArr = new byte[4];
        int i2 = 0;
        while (i2 < 4) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >> (32 - (i3 * 8))) & 255);
            i2 = i3;
        }
        return bArr;
    }

    public static byte int2OneByte(int i) {
        return (byte) (i & 255);
    }

    public static byte[] long2Bytes(long j) {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) ((j >> (64 - (r3 * 8))) & 255);
        }
        return bArr;
    }

    public static int oneByte2Int(byte b) {
        return b & 255;
    }

    public static byte[] short2Bytes(short s) {
        byte[] bArr = new byte[2];
        int i = 0;
        while (i < 2) {
            int i2 = i + 1;
            bArr[i] = (byte) ((s >> (16 - (i2 * 8))) & 255);
            i = i2;
        }
        return bArr;
    }

    public static String strToBase64(String str) {
        return (str == null || str.length() == 0) ? str : Base64.encodeToString(str.getBytes(), 0);
    }

    public static byte[] digital2bytes(long j, int i, boolean z) {
        if (i >= 0 && i <= 8) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            if (z) {
                while (i2 < i) {
                    bArr[i2] = (byte) ((j >> (((i - i2) - 1) * 8)) & 255);
                    i2++;
                }
            } else {
                while (i2 < i) {
                    bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
                    i2++;
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("width 应该在 0-8 之间");
    }

    public static byte[] digital2bytes(short s, int i, boolean z) {
        if (i >= 0 && i <= 2) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            if (z) {
                while (i2 < i) {
                    bArr[i2] = (byte) ((s >> (((i - i2) - 1) * 8)) & 255);
                    i2++;
                }
            } else {
                while (i2 < i) {
                    bArr[i2] = (byte) ((s >> (i2 * 8)) & 255);
                    i2++;
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("width 应该在 0-2 之间");
    }
}
