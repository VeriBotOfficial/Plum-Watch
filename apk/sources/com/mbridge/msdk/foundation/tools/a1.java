package com.mbridge.msdk.foundation.tools;

import com.facebook.cache.disk.DefaultDiskStorage;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes2.dex */
class a1 {

    /* JADX INFO: compiled from: Util.java */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final char[] f11649a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        static final SecureRandom b = new SecureRandom();
    }

    static int a(int[] r4, int r5) {
        int length = (r4.length >> 1) - 1;
        int r1 = 0;
        while (r1 <= length) {
            int r2 = (r1 + length) >>> 1;
            int r3 = r4[r2 << 1];
            if (r3 < r5) {
                r1 = r2 + 1;
            } else {
                if (r3 <= r5) {
                    return r2;
                }
                length = r2 - 1;
            }
        }
        return length;
    }

    private static void b(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                b(file2);
            }
        }
        file.delete();
    }

    static byte[] c(File file) throws IOException {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) != 0) {
            throw new IllegalArgumentException("file too large, path:" + file.getPath());
        }
        int r0 = (int) length;
        byte[] bArr = new byte[r0];
        a(file, bArr, r0);
        return bArr;
    }

    static boolean d(File file) throws IOException {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        return parentFile != null && (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
    }

    static void a(File file) {
        try {
            if (file.exists()) {
                b(file);
            }
        } catch (Exception unused) {
        }
    }

    static void a(File file, byte[] bArr, int r4) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int r2 = 0;
        while (r2 < r4) {
            try {
                int r1 = randomAccessFile.read(bArr, r2, r4 - r2);
                if (r1 < 0) {
                    break;
                } else {
                    r2 += r1;
                }
            } finally {
                a(randomAccessFile);
            }
        }
    }

    static String b() {
        byte[] bArr = new byte[16];
        a.b.nextBytes(bArr);
        char[] cArr = new char[32];
        for (int r3 = 0; r3 < 16; r3++) {
            byte b = bArr[r3];
            int r5 = r3 << 1;
            char[] cArr2 = a.f11649a;
            cArr[r5] = cArr2[(b >> 4) & 15];
            cArr[r5 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    static int a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), new Object[0])).intValue();
        } catch (Throwable unused) {
            return 4096;
        }
    }

    static boolean a(File file, byte[] bArr) {
        try {
            File file2 = new File(file.getParent(), file.getName() + DefaultDiskStorage.FileType.TEMP);
            if (!d(file2)) {
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            try {
                randomAccessFile.setLength(bArr.length);
                randomAccessFile.write(bArr);
                a(randomAccessFile);
                if (!file.exists() || file.delete()) {
                    return file2.renameTo(file);
                }
            } catch (Throwable th) {
                a(randomAccessFile);
                throw th;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
