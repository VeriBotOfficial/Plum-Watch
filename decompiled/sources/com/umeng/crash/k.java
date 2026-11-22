package com.umeng.crash;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.phancy.mini.utils.MiniStorage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: UCrash */
/* loaded from: classes2.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f14003a = "\n--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n".getBytes();

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(String str) {
        long j;
        long j2;
        BufferedReader bufferedReader;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            long length = file.length();
            long j3 = 0;
            FileOutputStream fileOutputStream = null;
            if (length > 4194304) {
                File file2 = new File(file.getParent(), MiniStorage.PREFIX_TMP + file.getName());
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2, false));
                    try {
                        bufferedReader = new BufferedReader(new FileReader(file));
                        while (true) {
                            try {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                j3 += readLine.length() + 1;
                                if (j3 >= 4194304) {
                                    break;
                                }
                                bufferedWriter.write(readLine);
                                bufferedWriter.write(10);
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream = bufferedWriter;
                                a((Closeable) fileOutputStream);
                                a(bufferedReader);
                                throw th;
                            }
                        }
                        bufferedWriter.flush();
                        a(bufferedWriter);
                        a(bufferedReader);
                        j2 = file2.length();
                        j = length - j2;
                        file.delete();
                        file2.renameTo(file);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                }
            } else {
                j = 0;
                j2 = length;
            }
            String format = String.format(Locale.US, "Full: %d bytes, write: %d bytes, limit: %d bytes, reject: %d bytes.\nlog end: %s", Long.valueOf(length), Long.valueOf(j2), 4194304L, Long.valueOf(j), new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())));
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(f14003a);
                    a(fileOutputStream2, format);
                    a((Closeable) fileOutputStream2);
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = fileOutputStream2;
                    a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            UCrash.a().a("UCrash.Tombstone", "writeEnd failed", th6);
        }
    }

    public static File[] a() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add("_jni.log.gz");
        arrayList.add("_anr.log");
        arrayList.add("_anr.log.gz");
        arrayList.add("_java.log.gz");
        return a(arrayList);
    }

    public static File[] b() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("_exception.log.gz");
        return a(arrayList);
    }

    public static void c() {
        File[] listFiles;
        String str = c.a().c;
        if (str == null || (listFiles = new File(str).listFiles()) == null) {
            return;
        }
        for (File file : listFiles) {
            if (file.lastModified() < System.currentTimeMillis() - TimeUnit.DAYS.toMillis(7L)) {
                file.delete();
                UCrash.a().b("UCrash.Tombstone", "delete old file over one week:" + file.getName());
            }
        }
    }

    private static File[] a(final List<String> list) {
        String str = c.a().c;
        if (str == null) {
            return new File[0];
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return new File[0];
        }
        File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.umeng.crash.k.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                if (!str2.startsWith(c.a().b)) {
                    return false;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (str2.endsWith((String) it.next())) {
                        return true;
                    }
                }
                return false;
            }
        });
        if (listFiles == null) {
            return new File[0];
        }
        Arrays.sort(listFiles, new Comparator<File>() { // from class: com.umeng.crash.k.2
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(File file2, File file3) {
                return Long.signum(file2.lastModified() - file3.lastModified());
            }
        });
        return listFiles;
    }

    static void a(OutputStream outputStream) throws IOException {
        outputStream.write(f14003a);
    }

    static void a(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes("UTF-8"));
    }

    static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    static File a(Context context) {
        File file = new File(context.getFilesDir().getParent(), "crashsdk/ucrash");
        if (file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean b(String str) {
        return str != null && str.endsWith("_java.log.gz");
    }

    public static boolean c(String str) {
        return str != null && str.endsWith("_jni.log.gz");
    }

    public static boolean d(String str) {
        return str != null && str.endsWith("_anr.log.gz");
    }

    public static boolean e(String str) {
        return str != null && str.endsWith("_exception.log.gz");
    }

    public static String a(long j, String str) {
        c a2 = c.a();
        return String.format(Locale.US, "%s_%s_%s_%s_%d_%d_%d%s", a2.b, a2.f.replace(":", "_"), a2.g, Build.MODEL.replaceAll(" ", ""), Integer.valueOf(Build.VERSION.SDK_INT), Long.valueOf(a2.k), Long.valueOf(j), str);
    }
}
