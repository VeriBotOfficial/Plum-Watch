package com.anythink.expressad.foundation.h;

import android.text.TextUtils;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class p extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4932a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final String e = "/download/.at";
    public static final String f = "/atdownload";
    public static final String g = "template_config.json";
    private static final String h = "SameFileTool";

    private static double b(String str, int i) {
        long j;
        File file = new File(str);
        try {
            if (file.isDirectory()) {
                j = d(file);
            } else {
                j = c(file);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            j = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (i == 1) {
            return Double.valueOf(decimalFormat.format(j)).doubleValue();
        }
        if (i == 2) {
            return Double.valueOf(decimalFormat.format(j / 1024.0d)).doubleValue();
        }
        if (i == 3) {
            return Double.valueOf(decimalFormat.format(j / 1048576.0d)).doubleValue();
        }
        if (i != 4) {
            return 0.0d;
        }
        return Double.valueOf(decimalFormat.format(j / 1.073741824E9d)).doubleValue();
    }

    private static String e(String str) {
        long j;
        File file = new File(str);
        try {
            if (file.isDirectory()) {
                j = d(file);
            } else {
                j = c(file);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            j = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j == 0) {
            return "0B";
        }
        if (j < 1024) {
            return decimalFormat.format(j) + "B";
        }
        if (j < 1048576) {
            return decimalFormat.format(j / 1024.0d) + "KB";
        }
        if (j < 1073741824) {
            return decimalFormat.format(j / 1048576.0d) + "AT";
        }
        return decimalFormat.format(j / 1.073741824E9d) + "GB";
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
                        } catch (Exception e2) {
                            e = e2;
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
                                } catch (Exception e3) {
                                    e3.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } else {
                        file.createNewFile();
                    }
                } catch (Exception e4) {
                    e = e4;
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return j;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static long d(File file) {
        long c2;
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    c2 = d(listFiles[i]);
                } else {
                    c2 = c(listFiles[i]);
                }
                j += c2;
            }
        }
        return j;
    }

    private static String b(long j) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j == 0) {
            return "0B";
        }
        if (j < 1024) {
            return decimalFormat.format(j) + "B";
        }
        if (j < 1048576) {
            return decimalFormat.format(j / 1024.0d) + "KB";
        }
        if (j < 1073741824) {
            return decimalFormat.format(j / 1048576.0d) + "AT";
        }
        return decimalFormat.format(j / 1.073741824E9d) + "GB";
    }

    private static double a(long j, int i) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (i == 1) {
            return Double.valueOf(decimalFormat.format(j)).doubleValue();
        }
        if (i == 2) {
            return Double.valueOf(decimalFormat.format(j / 1024.0d)).doubleValue();
        }
        if (i == 3) {
            return Double.valueOf(decimalFormat.format(j / 1048576.0d)).doubleValue();
        }
        if (i != 4) {
            return 0.0d;
        }
        return Double.valueOf(decimalFormat.format(j / 1.073741824E9d)).doubleValue();
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
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.h.p.a(java.io.File):java.lang.String");
    }

    public static boolean a(String str) {
        if (com.anythink.expressad.foundation.g.d.e.a(str)) {
            return false;
        }
        File file = new File(str);
        return file.length() > 0 && file.isFile();
    }

    public static File[] b(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.listFiles();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a() {
        new Thread(new Runnable() { // from class: com.anythink.expressad.foundation.h.p.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (com.anythink.expressad.foundation.b.a.c().e() != null) {
                        String b2 = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_VC);
                        try {
                            File file = new File(b2);
                            if (file.exists() && file.isDirectory()) {
                                for (File file2 : p.b(b2)) {
                                    if (file2.exists() && file2.isFile()) {
                                        file2.delete();
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                } catch (Exception e3) {
                    if (com.anythink.expressad.a.f4564a) {
                        e3.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public static void c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - 1440000;
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                long currentTimeMillis2 = System.currentTimeMillis();
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.lastModified() + currentTimeMillis < currentTimeMillis2) {
                            b(file2);
                            try {
                                File file3 = new File(str + ".zip");
                                if (file3.exists() && file3.isFile()) {
                                    b(file3);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    public static void b() {
        com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.expressad.foundation.h.p.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.anythink.expressad.f.b.a();
                    com.anythink.expressad.foundation.b.a.c().f();
                    com.anythink.expressad.f.a b2 = com.anythink.expressad.f.b.b();
                    if (b2 == null) {
                        com.anythink.expressad.f.b.a();
                        b2 = com.anythink.expressad.f.b.c();
                    }
                    p.a(com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_RES_MANAGER_DIR), b2.b());
                    p.a(System.currentTimeMillis() - (b2.n() * 1000));
                } catch (Exception e2) {
                    if (com.anythink.expressad.a.f4564a) {
                        e2.printStackTrace();
                    }
                }
            }
        });
    }

    public static String b(File file) {
        try {
            if (file.isFile()) {
                file.delete();
                return "";
            }
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        b(file2);
                    }
                    file.delete();
                    return "";
                }
                file.delete();
            }
            return "";
        } catch (Exception e2) {
            return e2.getMessage();
        }
    }

    private static void c(String str, int i) {
        try {
            if (d(new File(str)) > i * 1048576) {
                f(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (Throwable unused) {
        }
    }

    private static ArrayList<File> e(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file2 : file.listFiles(new FileFilter() { // from class: com.anythink.expressad.foundation.h.p.3
            @Override // java.io.FileFilter
            public final boolean accept(File file3) {
                return !file3.isHidden() || file3.isDirectory();
            }
        })) {
            if (!file2.isDirectory()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(e(file2));
            }
        }
        return arrayList;
    }

    private static void f(String str) {
        try {
            ArrayList<File> e2 = e(new File(str));
            Collections.sort(e2, new Comparator<File>() { // from class: com.anythink.expressad.foundation.h.p.4
                @Override // java.util.Comparator
                public final boolean equals(Object obj) {
                    return true;
                }

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file, File file2) {
                    long lastModified = file.lastModified() - file2.lastModified();
                    if (lastModified > 0) {
                        return 1;
                    }
                    return lastModified == 0 ? 0 : -1;
                }

                private static int a(File file, File file2) {
                    long lastModified = file.lastModified() - file2.lastModified();
                    if (lastModified > 0) {
                        return 1;
                    }
                    return lastModified == 0 ? 0 : -1;
                }
            });
            int size = (e2.size() - 1) / 2;
            for (int i = 0; i < size; i++) {
                File file = e2.get(i);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void a(long j) {
        try {
            Iterator<File> it = e(new File(com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_RES_MANAGER_DIR))).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (next.lastModified() < j && next.exists() && next.isFile()) {
                    next.delete();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static void g(String str) {
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                for (File file2 : b(str)) {
                    if (file2.exists() && file2.isFile()) {
                        file2.delete();
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static boolean a(String str, String str2, String str3) {
        try {
            if (t.b()) {
                String str4 = str + File.separator + str3;
                File file = new File(str4);
                if (file.exists() && file.isFile() && t.a(file.length())) {
                    File file2 = new File(str2);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    int b2 = b(str4, str2 + File.separator + str3);
                    if (file.exists() && b2 == 0) {
                        file.delete();
                        return true;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return false;
    }

    private static int b(String str, String str2) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            if (!t.f4936a) {
                return -1;
            }
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                fileOutputStream = new FileOutputStream(str2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    File file = new File(str2);
                    if (file.exists()) {
                        if (file.isFile()) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                            return 0;
                        }
                    }
                    try {
                        fileInputStream2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    return -1;
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    if (fileOutputStream == null) {
                        throw th;
                    }
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (IOException e9) {
                        e9.printStackTrace();
                        throw th;
                    }
                }
            } catch (Exception unused2) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Exception unused3) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
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
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            try {
                fileOutputStream.close();
                return true;
            } catch (IOException e3) {
                e3.printStackTrace();
                return true;
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 == null) {
                return false;
            }
            try {
                fileOutputStream2.close();
                return false;
            } catch (IOException e5) {
                e5.printStackTrace();
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    private static boolean c(String str, String str2) {
        File[] listFiles;
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str) && str2 != null && !TextUtils.isEmpty(str2)) {
                    File file = new File(str);
                    if (file.isDirectory() && file.listFiles() != null && file.listFiles().length > 0 && (listFiles = file.listFiles()) != null) {
                        for (File file2 : listFiles) {
                            if (file2.isFile()) {
                                if (str2.equals(file2.getName())) {
                                    return true;
                                }
                            } else {
                                c(file2.getAbsolutePath(), str2);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return s.a(z.b(str.trim()));
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00ed, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00f1, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00f2, code lost:
    
        r9.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00eb, code lost:
    
        if (r9 == null) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.h.p.a(java.lang.String, java.lang.String):java.lang.String");
    }

    private static boolean d(String str, int i) {
        try {
            Class.forName("android.os.FileUtils").getMethod("setPermissions", String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, str, Integer.valueOf(i), -1, -1);
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f4933a = 448;
        public static final int b = 256;
        public static final int c = 128;
        public static final int d = 64;
        public static final int e = 56;
        public static final int f = 32;
        public static final int g = 16;
        public static final int h = 8;
        public static final int i = 7;
        public static final int j = 4;
        public static final int k = 2;
        public static final int l = 1;

        a() {
        }
    }

    static /* synthetic */ void a(String str, int i) {
        try {
            if (d(new File(str)) > i * 1048576) {
                f(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (Throwable unused) {
        }
    }
}
