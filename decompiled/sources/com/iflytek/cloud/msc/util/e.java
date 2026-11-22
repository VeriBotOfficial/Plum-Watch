package com.iflytek.cloud.msc.util;

import com.iflytek.cloud.msc.util.log.DebugLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes17.dex */
public class e {
    public static byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ 5);
        }
        return bArr;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0051: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:37:0x0051 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] b(byte[] r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r2.write(r5)     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L50
            r2.finish()     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L50
            byte[] r5 = r1.toByteArray()     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L50
            r0 = 0
        L19:
            int r3 = r5.length     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L50
            if (r0 >= r3) goto L26
            r3 = r5[r0]     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L50
            r3 = r3 ^ 5
            byte r3 = (byte) r3     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L50
            r5[r0] = r3     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L50
            int r0 = r0 + 1
            goto L19
        L26:
            r2.close()     // Catch: java.io.IOException -> L2d
            r1.close()     // Catch: java.io.IOException -> L2d
            goto L4f
        L2d:
            r0 = move-exception
            com.iflytek.cloud.msc.util.log.DebugLog.LogE(r0)
            goto L4f
        L32:
            r0 = move-exception
            goto L3f
        L34:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L3f
        L39:
            r5 = move-exception
            goto L52
        L3b:
            r5 = move-exception
            r2 = r0
            r0 = r5
            r5 = r2
        L3f:
            com.iflytek.cloud.msc.util.log.DebugLog.LogE(r0)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L47
            r2.close()     // Catch: java.io.IOException -> L4b
        L47:
            r1.close()     // Catch: java.io.IOException -> L4b
            goto L4f
        L4b:
            r0 = move-exception
            com.iflytek.cloud.msc.util.log.DebugLog.LogE(r0)
        L4f:
            return r5
        L50:
            r5 = move-exception
            r0 = r2
        L52:
            if (r0 == 0) goto L57
            r0.close()     // Catch: java.io.IOException -> L5b
        L57:
            r1.close()     // Catch: java.io.IOException -> L5b
            goto L5f
        L5b:
            r0 = move-exception
            com.iflytek.cloud.msc.util.log.DebugLog.LogE(r0)
        L5f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.msc.util.e.b(byte[]):byte[]");
    }

    public static synchronized String a(String str) {
        String stringBuffer;
        synchronized (e.class) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                char[] charArray = str.toCharArray();
                byte[] bArr = new byte[charArray.length];
                for (int i = 0; i < charArray.length; i++) {
                    bArr[i] = (byte) charArray[i];
                }
                byte[] digest = messageDigest.digest(bArr);
                StringBuffer stringBuffer2 = new StringBuffer();
                for (byte b : digest) {
                    int i2 = b & 255;
                    if (i2 < 16) {
                        stringBuffer2.append("0");
                    }
                    stringBuffer2.append(Integer.toHexString(i2));
                }
                stringBuffer = stringBuffer2.toString();
            } catch (Exception e) {
                DebugLog.LogE(e);
                return "";
            }
        }
        return stringBuffer;
    }

    public static String a(File file) {
        Throwable th;
        Exception exc;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                if (!file.exists()) {
                    return null;
                }
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        MappedByteBuffer map = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.update(map);
                        String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
                        fileInputStream.close();
                        return bigInteger;
                    } catch (Exception e) {
                        exc = e;
                        exc.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return null;
                    }
                } catch (Exception e2) {
                    exc = e2;
                    fileInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                            throw th;
                        } catch (IOException e3) {
                            e3.printStackTrace();
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    public static synchronized String b(String str) {
        synchronized (e.class) {
            DebugLog.LogD("cut16MD5 start:" + str);
            String a2 = a(str);
            DebugLog.LogD("cut16MD5 start:" + a2);
            StringBuffer stringBuffer = new StringBuffer();
            if (a2 != null && a2.length() != 0) {
                DebugLog.LogD("cut16MD5 md5 size is:" + a2.length());
                for (int i = 0; i < a2.length(); i++) {
                    if (i % 2 == 0) {
                        DebugLog.LogD("cut16MD5 result i:" + a2.charAt(i));
                        stringBuffer.append(a2.charAt(i));
                    }
                    DebugLog.LogD("cut16MD5 result i = :" + i);
                }
                DebugLog.LogD("cut16MD5 result:" + ((Object) stringBuffer));
                return stringBuffer.toString();
            }
            return null;
        }
    }
}
