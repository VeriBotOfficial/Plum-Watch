package com.baidu.ar;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes12.dex */
public class k8 {

    /* renamed from: a, reason: collision with root package name */
    public static char[] f7050a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static MessageDigest b;

    static {
        try {
            b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.err.println(k8.class.getName() + "初始化失败，MessageDigest不支持MD5Util。");
            e.printStackTrace();
        }
    }

    public static String a(File file) {
        try {
            return a(new FileInputStream(file));
        } catch (IOException unused) {
            return null;
        }
    }

    public static String a(InputStream inputStream) {
        try {
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        return a(b.digest());
                    }
                    b.update(bArr, 0, read);
                }
            } catch (IOException e) {
                e.printStackTrace();
                x7.a((Closeable) inputStream);
                return null;
            }
        } finally {
            x7.a((Closeable) inputStream);
        }
    }

    public static synchronized String a(String str) {
        String b2;
        synchronized (k8.class) {
            b2 = b(str.getBytes(Charset.forName("utf-8")));
        }
        return b2;
    }

    public static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static String a(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i2 + i;
        while (i < i3) {
            a(bArr[i], stringBuffer);
            i++;
        }
        return stringBuffer.toString();
    }

    public static void a(byte b2, StringBuffer stringBuffer) {
        char[] cArr = f7050a;
        char c = cArr[(b2 & TransmissionUnpacked.HD_VAL_MAGIC_HB) >> 4];
        char c2 = cArr[b2 & 15];
        stringBuffer.append(c);
        stringBuffer.append(c2);
    }

    public static String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                bArr[i] = (byte) charArray[i];
            }
            byte[] digest = messageDigest.digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                int i2 = b2 & 255;
                if (i2 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i2));
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String b(byte[] bArr) {
        b.update(bArr);
        return a(b.digest());
    }
}
