package com.baidu.mapsdkplatform.comapi;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.facebook.soloader.MinElf;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes13.dex */
public class NativeLoader {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8323a = "NativeLoader";
    private static Context b;
    private static NativeLoader e;
    private static final Set<String> c = new HashSet();
    private static final Set<String> d = new HashSet();
    private static c f = c.ARMEABI;
    private static boolean g = false;
    private static String h = null;

    class a implements FilenameFilter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8324a;

        a(String str) {
            this.f8324a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return (str == null || !str.contains("libBaiduMapSDK_") || str.contains(this.f8324a)) ? false : true;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8325a;

        static {
            int[] iArr = new int[c.values().length];
            f8325a = iArr;
            try {
                iArr[c.ARM64.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8325a[c.ARMV7.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8325a[c.ARMEABI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8325a[c.X86_64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8325a[c.X86.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private enum c {
        ARMEABI("armeabi"),
        ARMV7(MinElf.ISA.ARM),
        ARM64(MinElf.ISA.AARCH64),
        X86(MinElf.ISA.X86),
        X86_64(MinElf.ISA.X86_64);

        private String g;

        c(String str) {
            this.g = str;
        }

        public String a() {
            return this.g;
        }
    }

    private NativeLoader() {
    }

    static void a(boolean z, String str) {
        g = z;
        h = str;
    }

    private boolean b(String str) {
        try {
            Set<String> set = c;
            synchronized (set) {
                if (set.contains(str)) {
                    return true;
                }
                System.loadLibrary(str);
                synchronized (set) {
                    set.add(str);
                }
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return a(str);
        }
    }

    private boolean c(String str, String str2) {
        c cVar = c.ARMEABI;
        if (a(str2, cVar)) {
            return g(str2, str);
        }
        Log.e(f8323a, "found lib " + cVar.a() + "/" + str + ".so error");
        return false;
    }

    private boolean d(String str, String str2) {
        return !a(str2, c.ARMV7) ? c(str, str2) : g(str2, str);
    }

    private boolean e(String str, String str2) {
        return !a(str2, c.X86_64) ? f(str, str2) : g(str2, str);
    }

    private boolean f(String str, String str2) {
        return !a(str2, c.X86) ? d(str, str2) : g(str2, str);
    }

    private boolean g(String str, String str2) {
        try {
            com.baidu.mapsdkplatform.comapi.util.c.a(new File(b(), str).getAbsolutePath());
            Set<String> set = c;
            synchronized (set) {
                set.add(str2);
            }
            a(str, str2);
            return true;
        } catch (Throwable th) {
            Set<String> set2 = d;
            synchronized (set2) {
                set2.add(str2);
                a(th);
                return false;
            }
        }
    }

    public static synchronized NativeLoader getInstance() {
        NativeLoader nativeLoader;
        synchronized (NativeLoader.class) {
            if (e == null) {
                e = new NativeLoader();
                f = c();
            }
            nativeLoader = e;
        }
        return nativeLoader;
    }

    public static void setContext(Context context) {
        b = context;
    }

    public synchronized boolean loadLibrary(String str) {
        if (!g) {
            return b(str);
        }
        String str2 = h;
        if (str2 == null || str2.isEmpty()) {
            Log.e(f8323a, "Given custom so file path is null, please check!");
            return false;
        }
        return a(str);
    }

    private boolean a(String str) {
        boolean b2;
        String mapLibraryName = System.mapLibraryName(str);
        Set<String> set = c;
        synchronized (set) {
            if (set.contains(str)) {
                return true;
            }
            int i = b.f8325a[f.ordinal()];
            if (i == 1) {
                b2 = b(str, mapLibraryName);
            } else if (i == 2) {
                b2 = d(str, mapLibraryName);
            } else if (i == 3) {
                b2 = c(str, mapLibraryName);
            } else if (i != 4) {
                b2 = i != 5 ? false : f(str, mapLibraryName);
            } else {
                b2 = e(str, mapLibraryName);
            }
            synchronized (set) {
                set.add(str);
            }
            return b2;
        }
    }

    private static boolean d() {
        return Process.is64Bit();
    }

    private static c c() {
        String str = Build.SUPPORTED_ABIS[0];
        if (str == null) {
            return c.ARMEABI;
        }
        if (str.contains("arm") && str.contains("v7")) {
            f = c.ARMV7;
        }
        if (str.contains("arm") && str.contains("64") && d()) {
            f = c.ARM64;
        }
        if (str.contains(MinElf.ISA.X86)) {
            if (str.contains("64")) {
                f = c.X86_64;
            } else {
                f = c.X86;
            }
        }
        return f;
    }

    private boolean b(String str, String str2) {
        if (!a(str2, c.ARM64)) {
            return d(str, str2);
        }
        return g(str2, str);
    }

    private String b() {
        if (b == null) {
            return "";
        }
        File file = new File(b.getFilesDir(), "libs" + File.separator + f.a());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private boolean a(String str, c cVar) {
        String str2;
        ZipFile zipFile;
        File file = new File(b(), str);
        if (file.exists() && file.length() > 0) {
            return true;
        }
        String str3 = a(cVar) + str;
        if (!g) {
            str2 = a();
        } else {
            str2 = h;
        }
        if (str2 == null || str2.isEmpty()) {
            return false;
        }
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(str2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            ZipEntry entry = zipFile.getEntry(str3);
            if (entry == null) {
                try {
                    zipFile.close();
                    return false;
                } catch (IOException e3) {
                    Log.e(f8323a, "Release file failed", e3);
                    return false;
                }
            }
            a(zipFile.getInputStream(entry), new FileOutputStream(new File(b(), str)));
            try {
                zipFile.close();
                return true;
            } catch (IOException e4) {
                Log.e(f8323a, "Release file failed", e4);
                return true;
            }
        } catch (Exception e5) {
            e = e5;
            zipFile2 = zipFile;
            Log.e(f8323a, "Copy library file error", e);
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e6) {
                    Log.e(f8323a, "Release file failed", e6);
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e7) {
                    Log.e(f8323a, "Release file failed", e7);
                }
            }
            throw th;
        }
    }

    private void a(String str, String str2) {
        if (str == null || str.isEmpty() || !str.contains("libBaiduMapSDK_")) {
            return;
        }
        try {
            String[] split = str.split("_v");
            if (split.length <= 1) {
                return;
            }
            File[] listFiles = new File(b()).listFiles(new a(split[1]));
            if (listFiles == null || listFiles.length == 0) {
                return;
            }
            for (File file : listFiles) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    private String a() {
        return b == null ? "" : b.getPackageCodePath();
    }

    private void a(Throwable th) {
        Log.e(f8323a, "loadException", th);
        Iterator<String> it = d.iterator();
        while (it.hasNext()) {
            Log.e(f8323a, it.next() + " Failed to load.");
        }
    }

    private void a(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        }
        fileOutputStream.flush();
        try {
            inputStream.close();
        } catch (IOException e2) {
            Log.e(f8323a, "Close InputStream error", e2);
        }
        try {
            fileOutputStream.close();
        } catch (IOException e3) {
            Log.e(f8323a, "Close OutputStream error", e3);
        }
    }

    private String a(c cVar) {
        StringBuilder sb = new StringBuilder("lib/");
        sb.append(cVar.a()).append("/");
        return sb.toString();
    }
}
