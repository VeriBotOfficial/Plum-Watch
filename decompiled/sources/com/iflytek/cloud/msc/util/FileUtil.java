package com.iflytek.cloud.msc.util;

import android.content.Context;
import android.os.Environment;
import android.os.MemoryFile;
import android.text.TextUtils;
import com.iflytek.cloud.msc.util.log.DebugLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes17.dex */
public class FileUtil {

    /* renamed from: a, reason: collision with root package name */
    private static String f11182a = "";

    public static boolean checkFileMD5(String str, String str2) {
        if (str.equals(e.a(new File(str2)))) {
            return true;
        }
        deleteFile(str2);
        return false;
    }

    public static void copyAssetsFile(Context context, String str, String str2) throws IOException {
        Throwable th;
        InputStream inputStream;
        FileOutputStream fileOutputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            try {
                makeDir(str2);
                FileOutputStream fileOutputStream2 = new FileOutputStream(str2, false);
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read <= 0) {
                            inputStream.close();
                            fileOutputStream2.close();
                            return;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (fileOutputStream == null) {
                        throw th;
                    }
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }

    public static void deleteFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    public static boolean formatPcm(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || "pcm".equals(str)) {
            return true;
        }
        if ("wav".equals(str)) {
            return pcm2Wav(str2, i);
        }
        DebugLog.LogE("format not supported");
        return false;
    }

    public static String getResFilePath(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = System.currentTimeMillis() + "";
        }
        String absolutePath = "mounted".equals(Environment.getExternalStorageState()) ? Environment.getExternalStorageDirectory().getAbsolutePath() : context.getFilesDir().getAbsolutePath();
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        String str2 = (absolutePath + "msc/") + "res/";
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        String str3 = str2 + str;
        return !str3.endsWith(".jet") ? str3 + ".jet" : str3;
    }

    public static String getUserPath(Context context) {
        if (!TextUtils.isEmpty(f11182a)) {
            return f11182a;
        }
        String absolutePath = context.getFilesDir().getAbsolutePath();
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        String str = absolutePath + "msclib/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        f11182a = str;
        return str;
    }

    public static void makeDir(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (!str.endsWith("/")) {
            file = file.getParentFile();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static boolean pcm2Wav(String str, int i) {
        try {
            com.iflytek.cloud.record.d dVar = new com.iflytek.cloud.record.d(new File(str), i);
            dVar.c();
            dVar.a();
            return true;
        } catch (IOException e) {
            DebugLog.LogE(e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] readFile(java.lang.String r3) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            if (r3 != 0) goto Ld
            return r0
        Ld:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            int r1 = r3.available()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            byte[] r0 = new byte[r1]     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            r3.read(r0)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            r3.close()     // Catch: java.io.IOException -> L1f
            return r0
        L1f:
            r3 = move-exception
            goto L3a
        L21:
            r0 = move-exception
            goto L43
        L23:
            r1 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
            goto L2d
        L28:
            r3 = move-exception
            goto L46
        L2a:
            r3 = move-exception
            r1 = r3
            r3 = r0
        L2d:
            com.iflytek.cloud.msc.util.log.DebugLog.LogE(r1)     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3e
            r0.close()     // Catch: java.io.IOException -> L36
            goto L3e
        L36:
            r0 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
        L3a:
            com.iflytek.cloud.msc.util.log.DebugLog.LogE(r3)
            r3 = r0
        L3e:
            return r3
        L3f:
            r3 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
        L43:
            r2 = r0
            r0 = r3
            r3 = r2
        L46:
            if (r0 == 0) goto L50
            r0.close()     // Catch: java.io.IOException -> L4c
            goto L50
        L4c:
            r0 = move-exception
            com.iflytek.cloud.msc.util.log.DebugLog.LogE(r0)
        L50:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.msc.util.FileUtil.readFile(java.lang.String):byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.InputStream] */
    public static byte[] readFileFromAssets(Context context, String str) {
        byte[] bArr;
        IOException e;
        ?? open;
        byte[] bArr2 = 0;
        bArr2 = 0;
        InputStream inputStream = null;
        try {
            try {
                open = context.getAssets().open(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
            bArr = null;
        }
        try {
            bArr2 = new byte[open.available()];
            open.read(bArr2);
            try {
                open.close();
                return bArr2;
            } catch (IOException e3) {
                e = e3;
                DebugLog.LogE(e);
                return bArr2;
            }
        } catch (Exception e4) {
            e = e4;
            byte[] bArr3 = bArr2;
            inputStream = open;
            bArr = bArr3;
            DebugLog.LogE(e);
            if (inputStream == null) {
                return bArr;
            }
            try {
                inputStream.close();
                return bArr;
            } catch (IOException e5) {
                bArr2 = bArr;
                e = e5;
                DebugLog.LogE(e);
                return bArr2;
            }
        } catch (Throwable th2) {
            th = th2;
            bArr2 = open;
            if (bArr2 != 0) {
                try {
                    bArr2.close();
                } catch (IOException e6) {
                    DebugLog.LogE(e6);
                }
            }
            throw th;
        }
    }

    public static boolean saveFile(MemoryFile memoryFile, long j, String str) {
        FileOutputStream fileOutputStream;
        if (memoryFile == null || TextUtils.isEmpty(str)) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    deleteFile(str);
                    makeDir(str);
                    fileOutputStream = new FileOutputStream(str);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception unused) {
        }
        try {
            byte[] bArr = new byte[65536];
            int i = 0;
            while (true) {
                long j2 = i;
                if (j2 >= j) {
                    fileOutputStream.close();
                    return true;
                }
                long j3 = j - j2;
                if (j3 > 65536) {
                    j3 = 65536;
                }
                int i2 = (int) j3;
                memoryFile.readBytes(bArr, i, 0, i2);
                fileOutputStream.write(bArr, 0, i2);
                i += i2;
            }
        } catch (Exception e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            DebugLog.LogE(e);
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003e A[Catch: Exception -> 0x0041, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0041, blocks: (B:19:0x002f, B:10:0x003e), top: B:2:0x0001 }] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean saveFile(byte[] r3, java.lang.String r4, boolean r5, int r6) {
        /*
            r0 = 0
            if (r5 != 0) goto L6
            deleteFile(r4)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
        L6:
            makeDir(r4)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            java.lang.String r2 = "rw"
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            if (r5 != 0) goto L1d
            r4 = 0
            r1.setLength(r4)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            goto L2b
        L18:
            r3 = move-exception
            r0 = r1
            goto L42
        L1b:
            r3 = move-exception
            goto L33
        L1d:
            if (r6 >= 0) goto L27
            long r4 = r1.length()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            r1.seek(r4)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            goto L2b
        L27:
            long r4 = (long) r6     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            r1.seek(r4)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
        L2b:
            r1.write(r3)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            r3 = 1
            r1.close()     // Catch: java.lang.Exception -> L41
            return r3
        L33:
            r0 = r1
            goto L38
        L35:
            r3 = move-exception
            goto L42
        L37:
            r3 = move-exception
        L38:
            com.iflytek.cloud.msc.util.log.DebugLog.LogE(r3)     // Catch: java.lang.Throwable -> L35
            r3 = 0
            if (r0 == 0) goto L41
            r0.close()     // Catch: java.lang.Exception -> L41
        L41:
            return r3
        L42:
            if (r0 == 0) goto L47
            r0.close()     // Catch: java.lang.Exception -> L47
        L47:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.msc.util.FileUtil.saveFile(byte[], java.lang.String, boolean, int):boolean");
    }

    public static boolean saveFile(ConcurrentLinkedQueue<byte[]> concurrentLinkedQueue, String str) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                makeDir(str);
                fileOutputStream = new FileOutputStream(str);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            Iterator<byte[]> it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                fileOutputStream.write(it.next());
            }
            fileOutputStream.close();
            return true;
        } catch (Exception e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            DebugLog.LogE(e);
            if (fileOutputStream2 == null) {
                return false;
            }
            try {
                fileOutputStream2.close();
                return false;
            } catch (Exception e3) {
                DebugLog.LogE(e3);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (Exception e4) {
                    DebugLog.LogE(e4);
                }
            }
            throw th;
        }
    }
}
