package com.baidu.mshield.b.f;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

/* compiled from: MD5Util.java */
/* loaded from: classes13.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f8421a = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public static String a(byte b) {
        int i = b;
        if (b < 0) {
            i = b + 256;
        }
        int i2 = i / 16;
        StringBuilder sb = new StringBuilder();
        String[] strArr = f8421a;
        return sb.append(strArr[i2]).append(strArr[i % 16]).toString();
    }

    public static String b(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            cArr2[i2] = cArr[(b >>> 4) & 15];
            cArr2[i2 + 1] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    public static String c(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            try {
                return a(MessageDigest.getInstance("MD5").digest(bArr));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            try {
                stringBuffer.append(a(b));
            } catch (Throwable th) {
                com.baidu.mshield.b.c.a.a(th);
            }
        }
        return stringBuffer.toString();
    }

    public static String a(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String str3 = new String(str);
            try {
                return a(MessageDigest.getInstance("MD5").digest(str3.getBytes()));
            } catch (Throwable th) {
                th = th;
                str2 = str3;
                th.printStackTrace();
                return str2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(File file) {
        FileInputStream fileInputStream;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        messageDigest.update(bArr, 0, read);
                    } else {
                        String b = b(messageDigest.digest());
                        try {
                            fileInputStream.close();
                            return b;
                        } catch (IOException e) {
                            e.printStackTrace();
                            return b;
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                    return null;
                } finally {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }
}
