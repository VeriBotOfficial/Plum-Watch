package com.anythink.core.common.s.a;

import com.facebook.cache.disk.DefaultDiskStorage;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    static final int f4325a = 32;
    private static final int b = 16384;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final SecureRandom f4326a = new SecureRandom();
        static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        private a() {
        }
    }

    l() {
    }

    static String a() {
        byte[] bArr = new byte[16];
        a.f4326a.nextBytes(bArr);
        char[] cArr = new char[32];
        for (int i = 0; i < 16; i++) {
            byte b2 = bArr[i];
            int i2 = i << 1;
            cArr[i2] = a.b[(b2 >> 4) & 15];
            cArr[i2 + 1] = a.b[b2 & 15];
        }
        return new String(cArr);
    }

    static int b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), new Object[0])).intValue();
        } catch (Throwable unused) {
            return 16384;
        }
    }

    static boolean a(File file) {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    static byte[] b(File file) {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) != 0) {
            throw new IllegalArgumentException("file too large, path:" + file.getPath());
        }
        int i = (int) length;
        byte[] bArr = new byte[i];
        a(file, bArr, i);
        return bArr;
    }

    static void a(File file, byte[] bArr, int i) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i2 = 0;
        while (i2 < i) {
            try {
                int read = randomAccessFile.read(bArr, i2, i - i2);
                if (read < 0) {
                    break;
                } else {
                    i2 += read;
                }
            } finally {
                a(randomAccessFile);
            }
        }
    }

    static boolean a(File file, byte[] bArr, AtomicBoolean atomicBoolean) {
        int length;
        File file2;
        File file3 = null;
        try {
            try {
                length = bArr.length;
                file2 = new File(file.getParent(), file.getName() + DefaultDiskStorage.FileType.TEMP);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!a(file2)) {
                a(new Exception("create file failed"));
                if (atomicBoolean != null && atomicBoolean.get()) {
                    c(file2);
                    c(file);
                }
                return false;
            }
            if (atomicBoolean != null && atomicBoolean.get()) {
                if (atomicBoolean != null && atomicBoolean.get()) {
                    c(file2);
                    c(file);
                }
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            try {
                randomAccessFile.setLength(length);
                randomAccessFile.write(bArr, 0, length);
                if (atomicBoolean != null && atomicBoolean.get()) {
                    randomAccessFile.close();
                    if (atomicBoolean != null && atomicBoolean.get()) {
                        c(file2);
                        c(file);
                    }
                    return false;
                }
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                boolean a2 = a(file2, file);
                if (atomicBoolean != null && atomicBoolean.get()) {
                    c(file2);
                    c(file);
                }
                return a2;
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e2) {
            e = e2;
            file3 = file2;
            a(new Exception("save bytes failed", e));
            if (atomicBoolean != null && atomicBoolean.get()) {
                c(file3);
                c(file);
            }
            return false;
        } catch (Throwable th4) {
            th = th4;
            file3 = file2;
            if (atomicBoolean != null && atomicBoolean.get()) {
                c(file3);
                c(file);
            }
            throw th;
        }
    }

    static boolean a(File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        return (!file2.exists() || file2.delete()) && file.renameTo(file2);
    }

    static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    static void c(File file) {
        try {
            if (file.exists()) {
                d(file);
            }
        } catch (Throwable unused) {
        }
    }

    private static void d(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                d(file2);
            }
        }
        file.delete();
    }

    static void a(File file, String str) {
        File[] listFiles;
        if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                File file3 = new File(str, file2.getName());
                if (file2.exists() && !file3.exists() && !file2.renameTo(file3)) {
                    a(file3, b(file2), (AtomicBoolean) null);
                    c(file2);
                }
            } catch (Exception e) {
                a(e);
            }
        }
    }

    private static void b(File file, File file2) {
        if (!file.exists() || file2.exists() || file.renameTo(file2)) {
            return;
        }
        a(file2, b(file), (AtomicBoolean) null);
        c(file);
    }

    private static int a(int[] iArr, int i) {
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3];
            if (i4 < i) {
                i2 = i3 + 1;
            } else {
                if (i4 <= i) {
                    return i3;
                }
                length = i3 - 1;
            }
        }
        return length;
    }

    private static void a(Exception exc) {
        com.anythink.core.common.s.a.a.c cVar = h.f4318a;
        if (cVar != null) {
            cVar.b("FastKV", exc);
        }
    }
}
