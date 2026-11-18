package com.anythink.expressad.foundation.h;

import android.text.TextUtils;
import com.baidu.platform.comapi.bmsdk.BmLocated;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes16.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static char[] f4931a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    protected static MessageDigest b = null;
    private static String c = "SameFileMD5";

    static {
        b = null;
        try {
            b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.err.println(o.class.getName() + "Init fail,MessageDigest not support MD5Util.");
            e.printStackTrace();
        }
    }

    private static String a(String str) {
        return b(new File(str));
    }

    private static String b(File file) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                b.update(fileInputStream2.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length()));
                String strA = a(b.digest());
                fileInputStream2.close();
                return strA;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                    return "";
                }
                return "";
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return a(new File(str));
    }

    public static String a(File file) {
        if (!file.exists()) {
            return "";
        }
        RandomAccessFile randomAccessFile = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                byte[] bArr = new byte[BmLocated.ALIGN_RIGHT_BOTTOM];
                while (true) {
                    int r0 = randomAccessFile2.read(bArr);
                    if (r0 == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, r0);
                }
                String strA = a(messageDigest.digest());
                try {
                    randomAccessFile2.close();
                } catch (IOException e) {
                    e.getMessage();
                }
                return strA;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                try {
                    th.getMessage();
                    return "";
                } finally {
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e2) {
                            e2.getMessage();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    private static String a(byte[] bArr, int r4) {
        StringBuffer stringBuffer = new StringBuffer(r4 * 2);
        for (int r1 = 0; r1 < r4; r1++) {
            a(bArr[r1], stringBuffer);
        }
        return stringBuffer.toString();
    }

    private static void a(byte b2, StringBuffer stringBuffer) {
        char[] cArr = f4931a;
        char c2 = cArr[(b2 & TransmissionUnpacked.HD_VAL_MAGIC_HB) >> 4];
        char c3 = cArr[b2 & 15];
        stringBuffer.append(c2);
        stringBuffer.append(c3);
    }
}
