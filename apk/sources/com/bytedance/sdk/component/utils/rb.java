package com.bytedance.sdk.component.utils;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes15.dex */
public class rb {
    private static final char[] fxn = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String fxn(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        return fxn(bArr, 0, bArr.length);
    }

    public static String fxn(byte[] bArr, int r10, int r11) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        if (r10 < 0 || r10 + r11 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int r0 = r11 * 2;
        char[] cArr = new char[r0];
        int r4 = 0;
        for (int r3 = 0; r3 < r11; r3++) {
            byte b = bArr[r3 + r10];
            int r7 = r4 + 1;
            char[] cArr2 = fxn;
            cArr[r4] = cArr2[(b & 255) >> 4];
            r4 += 2;
            cArr[r7] = cArr2[b & 15];
        }
        return new String(cArr, 0, r0);
    }

    public static String fxn(File file) {
        FileInputStream fileInputStream;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            if (messageDigest == null) {
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int r5 = fileInputStream.read(bArr, 0, 8192);
                    if (r5 <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, r5);
                }
                String strFxn = fxn(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return strFxn;
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            fileInputStream = null;
        }
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (Exception unused4) {
            }
        }
        return null;
    }

    public static String fxn(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes("UTF-8"));
                    return fxn(messageDigest.digest());
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
