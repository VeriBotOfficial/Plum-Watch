package com.anythink.core.common.v;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes12.dex */
public final class w {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (d(r6) <= 31457280) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File a(android.content.Context r6) {
        /*
            r0 = 0
            java.io.File r1 = r6.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Le
            java.io.File r1 = b(r1)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Lf
            return r1
        Le:
            r1 = r0
        Lf:
            if (r1 != 0) goto L4e
            boolean r2 = b(r6)
            if (r2 == 0) goto L4e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r2.getPath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r6.getPackageName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            java.io.File r1 = b(r2)
            long r2 = d(r6)
            r4 = 31457280(0x1e00000, double:1.55419614E-316)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L4f
        L4e:
            r0 = r1
        L4f:
            if (r0 != 0) goto L62
            java.io.File r6 = r6.getFilesDir()
            java.io.File r6 = r6.getAbsoluteFile()
            java.lang.String r6 = r6.getAbsolutePath()
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.v.w.a(android.content.Context):java.io.File");
    }

    private static File b(File file) {
        File file2 = new File(file, new StringBuilder().append(UUID.randomUUID()).toString());
        if (file2.exists()) {
            file2.delete();
        }
        if (!file2.mkdirs()) {
            return null;
        }
        file2.delete();
        return file.getAbsoluteFile();
    }

    private static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", context.getPackageName()) == 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean c(Context context) {
        return d(context) > 31457280;
    }

    private static boolean a() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    private static String b(String str) {
        return o.a(str);
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0L;
        }
        try {
            if (file.isDirectory()) {
                return d(file);
            }
            return c(file);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private static long c(File file) {
        long j = 0;
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    if (file.exists()) {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            j = fileInputStream2.available();
                            fileInputStream = fileInputStream2;
                        } catch (Exception e) {
                            e = e;
                            fileInputStream = fileInputStream2;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return j;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } else {
                        file.createNewFile();
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            return j;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static long d(File file) {
        long c;
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    c = d(listFiles[i]);
                } else {
                    c = c(listFiles[i]);
                }
                j += c;
            }
        }
        return j;
    }

    public static boolean a(byte[] bArr, File file) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (file.getParentFile() != null && !file.exists()) {
                    file.getParentFile().mkdirs();
                }
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            try {
                fileOutputStream.close();
                return true;
            } catch (IOException e2) {
                e2.printStackTrace();
                return true;
            }
        } catch (Exception e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 == null) {
                return false;
            }
            try {
                fileOutputStream2.close();
                return false;
            } catch (IOException e4) {
                e4.printStackTrace();
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r1 == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.io.File r4) {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L49
            r4.<init>()     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L49
        L10:
            java.lang.String r2 = r1.readLine()     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L49
            if (r2 == 0) goto L2d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L49
            r3.<init>()     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L49
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L49
            java.lang.String r3 = "\n"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L49
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L49
            r4.append(r2)     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L49
            goto L10
        L2d:
            r1.close()     // Catch: java.io.IOException -> L41
            goto L41
        L31:
            r2 = move-exception
            goto L3b
        L33:
            r2 = move-exception
            r4 = r0
            goto L3b
        L36:
            r4 = move-exception
            goto L4b
        L38:
            r2 = move-exception
            r4 = r0
            r1 = r4
        L3b:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L41
            goto L2d
        L41:
            if (r4 == 0) goto L48
            java.lang.String r4 = r4.toString()
            return r4
        L48:
            return r0
        L49:
            r4 = move-exception
            r0 = r1
        L4b:
            if (r0 == 0) goto L50
            r0.close()     // Catch: java.io.IOException -> L50
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.v.w.a(java.io.File):java.lang.String");
    }

    private static long d(Context context) {
        if ("mounted".equals(Environment.getExternalStorageState()) && b(context)) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getAvailableBlocks() * statFs.getBlockSize();
            } catch (Error unused) {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0L;
    }
}
