package com.sifli.siflicore.util;

import com.autonavi.aps.amapapi.config.Const;
import com.sifli.siflicore.error.SFException;
import com.sifli.siflicore.log.SFLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes14.dex */
public class FileUtil {
    private static final String TAG = "FileUtil";

    public static boolean unzipFileToDir(String str, String str2) {
        if (unzipFileToDir(str, str2, StandardCharsets.UTF_8)) {
            return true;
        }
        try {
            Charset forName = Charset.forName(Const.STR_APS_ENCODE);
            SFLog.w(TAG, "unzip by utf8 fail,retry it by GBK");
            reCreateDir(str2);
            return unzipFileToDir(str, str2, forName);
        } catch (Exception unused) {
            System.out.println("警告：环境不支持GBK编码，回退失败");
            return false;
        }
    }

    private static boolean unzipFileToDir(String str, String str2, Charset charset) {
        ZipFile zipFile;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(str, charset);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                File file = new File(str2, nextElement.getName());
                if (!file.getCanonicalPath().startsWith(str2)) {
                    throw new SecurityException("zip path have traversal characters path");
                }
                if (nextElement.isDirectory()) {
                    file.mkdirs();
                } else {
                    file.getParentFile().mkdirs();
                    InputStream inputStream = zipFile.getInputStream(nextElement);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    inputStream.close();
                    fileOutputStream.close();
                }
            }
            try {
                zipFile.close();
                return true;
            } catch (IOException e2) {
                e2.printStackTrace();
                return true;
            }
        } catch (Exception e3) {
            e = e3;
            zipFile2 = zipFile;
            e.printStackTrace();
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static ArrayList<String> listFilesInDir(String str) {
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            listFiles(str, arrayList);
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            SFLog.e(TAG, "listFilesInDir error.ex=" + e.toString());
            return null;
        }
    }

    public static void deleteDir(String str) {
        File file = new File(str);
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                deleteDirectory(file);
            }
        }
    }

    public static boolean reCreateDir(String str) {
        SFLog.i(TAG, "reCreateDir =%s", str);
        try {
            File file = new File(str);
            if (file.exists()) {
                deleteDir(str);
            }
            file.mkdir();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            SFLog.e("reCreateDir", "error =" + e.toString());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] getFileData(java.lang.String r5) {
        /*
            java.lang.String r0 = "getFileData ex="
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            boolean r5 = r1.exists()
            r2 = 0
            if (r5 != 0) goto Lf
            return r2
        Lf:
            long r3 = r1.length()
            int r5 = (int) r3
            byte[] r5 = new byte[r5]
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            r3.read(r5)     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L51
            r3.close()     // Catch: java.io.IOException -> L22
            return r5
        L22:
            r0 = move-exception
            r0.printStackTrace()
            return r5
        L27:
            r5 = move-exception
            goto L2d
        L29:
            r5 = move-exception
            goto L53
        L2b:
            r5 = move-exception
            r3 = r2
        L2d:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = "FileUtil"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L51
            java.lang.StringBuilder r5 = r4.append(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L51
            com.sifli.siflicore.log.SFLog.e(r1, r5)     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L50
            r3.close()     // Catch: java.io.IOException -> L4c
            goto L50
        L4c:
            r5 = move-exception
            r5.printStackTrace()
        L50:
            return r2
        L51:
            r5 = move-exception
            r2 = r3
        L53:
            if (r2 == 0) goto L5d
            r2.close()     // Catch: java.io.IOException -> L59
            goto L5d
        L59:
            r0 = move-exception
            r0.printStackTrace()
        L5d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sifli.siflicore.util.FileUtil.getFileData(java.lang.String):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] getFileSliceData(java.lang.String r6, int r7, int r8) throws com.sifli.siflicore.error.SFException {
        /*
            java.lang.String r0 = "getFileSliceData error.ex="
            java.lang.String r1 = "getFileSliceData start"
            java.lang.String r2 = "FileUtil"
            com.sifli.siflicore.log.SFLog.i(r2, r1)
            byte[] r1 = new byte[r8]
            java.io.File r3 = new java.io.File
            r3.<init>(r6)
            r6 = 0
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            java.lang.String r5 = "r"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            long r6 = (long) r7
            r4.seek(r6)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L72
            int r6 = r4.read(r1)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L72
            if (r6 != r8) goto L2b
            r4.close()     // Catch: java.io.IOException -> L26
            return r1
        L26:
            r6 = move-exception
            r6.printStackTrace()
            return r1
        L2b:
            r7 = 0
            byte[] r6 = com.sifli.siflicore.util.ByteUtil.copyFrom(r1, r7, r6)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L72
            r4.close()     // Catch: java.io.IOException -> L34
            return r6
        L34:
            r7 = move-exception
            r7.printStackTrace()
            return r6
        L39:
            r6 = move-exception
            goto L42
        L3b:
            r7 = move-exception
            r4 = r6
            r6 = r7
            goto L73
        L3f:
            r7 = move-exception
            r4 = r6
            r6 = r7
        L42:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L72
            java.lang.String r8 = r6.toString()     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L72
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L72
            com.sifli.siflicore.log.SFLog.e(r2, r7)     // Catch: java.lang.Throwable -> L72
            com.sifli.siflicore.error.SFException r7 = new com.sifli.siflicore.error.SFException     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L72
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r6 = r8.append(r6)     // Catch: java.lang.Throwable -> L72
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L72
            r8 = 17
            r7.<init>(r8, r6)     // Catch: java.lang.Throwable -> L72
            throw r7     // Catch: java.lang.Throwable -> L72
        L72:
            r6 = move-exception
        L73:
            if (r4 == 0) goto L7d
            r4.close()     // Catch: java.io.IOException -> L79
            goto L7d
        L79:
            r7 = move-exception
            r7.printStackTrace()
        L7d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sifli.siflicore.util.FileUtil.getFileSliceData(java.lang.String, int, int):byte[]");
    }

    public static long getFileDataLength(String str) {
        if (isFileExist(str)) {
            return new File(str).length();
        }
        return 0L;
    }

    public static String getFileName(String str) {
        return new File(str).getName();
    }

    public static String getFileNameWithoutExtension(String str) {
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? name : name.substring(0, lastIndexOf);
    }

    public static boolean isFileExist(String str) {
        if (StringUtil.isNullOrEmpty(str)) {
            return false;
        }
        try {
            return new File(str).exists();
        } catch (Exception e) {
            e.printStackTrace();
            SFLog.e(TAG, "isFileExist exception.ex=" + e.toString());
            return false;
        }
    }

    public static boolean isDirectory(String str) {
        if (StringUtil.isNullOrEmpty(str)) {
            return false;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                if (file.isDirectory()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            SFLog.e(TAG, "isFileExist exception.ex=" + e.toString());
            return false;
        }
    }

    public static byte[] appendCRCWithFile(String str, byte b) throws SFException {
        SFLog.i(TAG, "appendCRCWithFile filePath=%s,padding=%x", str, Byte.valueOf(b));
        if (!isFileExist(str)) {
            throw new SFException(15, "appendCRCWithFile file not exist");
        }
        File file = new File(str);
        long length = file.length();
        int i = ((int) (4 - (length % 4))) % 4;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = b;
        }
        byte[] bArr2 = new byte[8192];
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                int i3 = -1;
                long j = 0;
                for (int i4 = 0; i4 < length; i4 += 8192) {
                    try {
                        randomAccessFile2.seek(j);
                        i3 = CRC32MPEG2.CRC32MPEG2GetValue(bArr2, randomAccessFile2.read(bArr2), i3);
                        j += 8192;
                    } catch (Exception e) {
                        e = e;
                        randomAccessFile = randomAccessFile2;
                        e.printStackTrace();
                        SFLog.e(TAG, "getFileSliceData error.ex=" + e.toString());
                        throw new SFException(17, "getFileSliceData error.ex=" + e.getMessage());
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = randomAccessFile2;
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                byte[] intTo4Bytes = ByteUtil.intTo4Bytes(CRC32MPEG2.CRC32MPEG2GetValue(bArr, i, i3));
                SFLog.i(TAG, "appendCRCWithFile done");
                byte[] mergeArrays = ByteUtil.mergeArrays(bArr, intTo4Bytes);
                try {
                    randomAccessFile2.close();
                    return mergeArrays;
                } catch (IOException e3) {
                    e3.printStackTrace();
                    return mergeArrays;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static byte[] getMd5OfFile(String str) {
        SFLog.i(TAG, "getMd5OfFile filePath=" + str);
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read != -1) {
                            messageDigest.update(bArr, 0, read);
                        } else {
                            byte[] digest = messageDigest.digest();
                            fileInputStream.close();
                            return digest;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static void deleteDirectory(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    deleteDirectory(file2);
                } else {
                    file2.delete();
                }
            }
        }
        file.delete();
    }

    private static void listFiles(String str, ArrayList<String> arrayList) {
        for (File file : new File(str).listFiles()) {
            if (file.isFile()) {
                arrayList.add(file.getAbsolutePath());
            } else if (file.isDirectory()) {
                listFiles(file.getAbsolutePath(), arrayList);
            }
        }
    }
}
