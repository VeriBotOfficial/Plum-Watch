package com.huawei.secure.android.common.util;

import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipInputStream;

/* loaded from: classes17.dex */
public class ZipUtil {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10847a = "ZipUtil";
    private static final int b = 104857600;
    private static final int c = 100;
    private static final int d = 4096;
    private static final String e = "..";
    private static final String[] f = {"..\\", "../", "./", ".\\.\\", "%00", "..%2F", "..%5C", ".%2F"};

    /* JADX WARN: Code restructure failed: missing block: B:103:0x006a, code lost:
    
        android.util.Log.e(com.huawei.secure.android.common.util.ZipUtil.f10847a, "zipPath is a invalid path: " + d(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0085, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f3, code lost:
    
        android.util.Log.e(com.huawei.secure.android.common.util.ZipUtil.f10847a, "unzipFileNew: over than top size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f9, code lost:
    
        r11 = false;
        r21 = r21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b6  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.io.Closeable, java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r21v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<java.io.File> a(java.io.File r16, java.io.File r17, long r18, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.secure.android.common.util.ZipUtil.a(java.io.File, java.io.File, long, boolean, boolean):java.util.List");
    }

    private static boolean b(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!a(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            Log.e(f10847a, "createOrExistsFile IOException ");
            return false;
        }
    }

    private static File c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return b(str);
    }

    private static String d(String str) {
        int lastIndexOf;
        return (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(File.separator)) == -1) ? str : str.substring(lastIndexOf + 1);
    }

    private static void e(File file) {
        if (file == null) {
            return;
        }
        if (file.isFile()) {
            c(file);
            return;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                c(file);
                return;
            }
            for (File file2 : listFiles) {
                e(file2);
            }
            c(file);
        }
    }

    @Deprecated
    public static boolean unZip(String str, String str2, boolean z) throws SecurityCommonException {
        return unZip(str, str2, 104857600L, 100, z);
    }

    public static List<File> unZipNew(String str, String str2, boolean z) throws SecurityCommonException {
        return unZipNew(str, str2, 104857600L, 100, z);
    }

    private static void c(File file) {
        if (file == null || file.delete()) {
            return;
        }
        LogsUtil.e(f10847a, "delete file error");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d5, code lost:
    
        android.util.Log.e(com.huawei.secure.android.common.util.ZipUtil.f10847a, "unzip  over than top size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00db, code lost:
    
        r2 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0071, code lost:
    
        android.util.Log.e(com.huawei.secure.android.common.util.ZipUtil.f10847a, "zipPath is a invalid path: " + d(r13));
        r2 = r3;
        r10 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0166  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean unZip(java.lang.String r17, java.lang.String r18, long r19, int r21, boolean r22) throws com.huawei.secure.android.common.util.SecurityCommonException {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.secure.android.common.util.ZipUtil.unZip(java.lang.String, java.lang.String, long, int, boolean):boolean");
    }

    public static List<File> unZipNew(String str, String str2, long j, int i, boolean z) throws SecurityCommonException {
        if (!a(str, str2, j, i)) {
            return null;
        }
        if (str2.endsWith(File.separator) && str2.length() > File.separator.length()) {
            str2 = str2.substring(0, str2.length() - File.separator.length());
        }
        return a(c(str), c(str2), j, z, false);
    }

    private static void d(File file) {
        if (file == null || file.exists() || file.mkdirs()) {
            return;
        }
        LogsUtil.e(f10847a, "mkdirs error , files exists or IOException.");
    }

    private static File b(String str) {
        a(str);
        return new File(str);
    }

    private static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(f10847a, "isContainInvalidStr: name is null");
            return false;
        }
        if (str.equals(e)) {
            return true;
        }
        for (String str2 : f) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    private static void a(String str) {
        if (TextUtils.isEmpty(str) || !e(str)) {
            return;
        }
        Log.e(f10847a, "IllegalArgumentException--path is not a standard path");
        throw new IllegalArgumentException("path is not a standard path");
    }

    private static boolean a(File file) {
        if (file != null) {
            return file.exists() ? file.isDirectory() : file.mkdirs();
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:27:0x00b1
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private static boolean a(java.lang.String r11, long r12, int r14, boolean r15) {
        /*
            java.lang.String r0 = "not a utf8 zip file, use gbk open zip file : "
            java.lang.String r1 = "close zipFile IOException "
            java.lang.String r2 = "ZipUtil"
            r3 = 0
            r4 = 0
            if (r15 != 0) goto L14
            java.util.zip.ZipFile r15 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            r15.<init>(r11)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
        Lf:
            r3 = r15
            goto L30
        L11:
            r11 = move-exception
            goto Lb5
        L14:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            java.lang.StringBuilder r15 = r15.append(r11)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            com.huawei.secure.android.common.util.LogsUtil.i(r2, r15)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            java.util.zip.ZipFile r15 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            java.lang.String r0 = "GBK"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            r15.<init>(r11, r0)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            goto Lf
        L30:
            java.util.Enumeration r15 = r3.entries()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            r5 = 0
            r0 = r4
        L37:
            boolean r7 = r15.hasMoreElements()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            r8 = 1
            if (r7 == 0) goto L8b
            java.lang.Object r7 = r15.nextElement()     // Catch: java.lang.Throwable -> L11 java.lang.IllegalArgumentException -> L6a java.io.IOException -> L90
            java.util.zip.ZipEntry r7 = (java.util.zip.ZipEntry) r7     // Catch: java.lang.Throwable -> L11 java.lang.IllegalArgumentException -> L6a java.io.IOException -> L90
            long r9 = r7.getSize()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            long r5 = r5 + r9
            int r0 = r0 + r8
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            boolean r8 = e(r8)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            if (r8 != 0) goto L64
            if (r0 >= r14) goto L64
            int r8 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r8 > 0) goto L64
            long r7 = r7.getSize()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            r9 = -1
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L37
        L64:
            java.lang.String r11 = "File name is invalid or too many files or too big"
            com.huawei.secure.android.common.util.LogsUtil.e(r2, r11)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            goto L8c
        L6a:
            r15 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            r0.<init>()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            java.lang.String r5 = "not a utf8 zip file, IllegalArgumentException : "
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            java.lang.String r15 = r15.getMessage()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            java.lang.StringBuilder r15 = r0.append(r15)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            com.huawei.secure.android.common.util.LogsUtil.i(r2, r15)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            boolean r11 = a(r11, r12, r14, r8)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L90
            r4 = r11
            goto L8c
        L8b:
            r4 = r8
        L8c:
            r3.close()     // Catch: java.io.IOException -> Lb1
            goto Lb4
        L90:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r12.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r13 = "not a valid zip file, IOException : "
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch: java.lang.Throwable -> L11
            java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> L11
            java.lang.StringBuilder r11 = r12.append(r11)     // Catch: java.lang.Throwable -> L11
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L11
            com.huawei.secure.android.common.util.LogsUtil.e(r2, r11)     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto Lb4
            r3.close()     // Catch: java.io.IOException -> Lb1
            goto Lb4
        Lb1:
            com.huawei.secure.android.common.util.LogsUtil.e(r2, r1)
        Lb4:
            return r4
        Lb5:
            if (r3 == 0) goto Lbe
            r3.close()     // Catch: java.io.IOException -> Lbb
            goto Lbe
        Lbb:
            com.huawei.secure.android.common.util.LogsUtil.e(r2, r1)
        Lbe:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.secure.android.common.util.ZipUtil.a(java.lang.String, long, int, boolean):boolean");
    }

    private static boolean a(String str, String str2, long j, int i) throws SecurityCommonException {
        if (!TextUtils.isEmpty(str) && !e(str)) {
            if (!TextUtils.isEmpty(str2) && !e(str2)) {
                if (a(str, j, i, false)) {
                    return true;
                }
                LogsUtil.e(f10847a, "zip file contains valid chars or too many files");
                throw new SecurityCommonException("unsecure zipfile!");
            }
            LogsUtil.e(f10847a, "target directory is not valid");
            return false;
        }
        LogsUtil.e(f10847a, "zip file is not valid");
        return false;
    }

    private static boolean a(List<File> list) {
        try {
            Iterator<File> it = list.iterator();
            while (it.hasNext()) {
                e(it.next());
            }
            return true;
        } catch (Exception e2) {
            LogsUtil.e(f10847a, "unzip fail delete file failed" + e2.getMessage());
            return false;
        }
    }

    private static void a(FileInputStream fileInputStream, BufferedOutputStream bufferedOutputStream, ZipInputStream zipInputStream, FileOutputStream fileOutputStream) {
        IOUtil.closeSecure((InputStream) fileInputStream);
        IOUtil.closeSecure((OutputStream) bufferedOutputStream);
        IOUtil.closeSecure((InputStream) zipInputStream);
        IOUtil.closeSecure((OutputStream) fileOutputStream);
    }
}
